/*
 * Copyright (C) 2014 The Android Open Source Project
 * Copyright (c) 1995, 2010, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package java.lang;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.security.AccessController;
import static java.security.AccessController.doPrivileged;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;

/**
 * java.lang.Process subclass in the UNIX environment.
 *
 * @author Mario Wolczko and Ross Knippel.
 * @author Konstantin Kladko (ported to Linux)
 * @author Martin Buchholz
 */
final class UNIXProcess extends Process {
    private final int pid;
    private int exitcode;
    private boolean hasExited;

    private /* final */ OutputStream stdin;
    private /* final */ InputStream  stdout;
    private /* final */ InputStream  stderr;

    /* this is for the reaping thread */
    private native int waitForProcessExit(int pid);

    /**
     * Create a process using fork(2) and exec(2).
     *
     * @param fds an array of three file descriptors.
     *        Indexes 0, 1, and 2 correspond to standard input,
     *        standard output and standard error, respectively.  On
     *        input, a value of -1 means to create a pipe to connect
     *        child and parent processes.  On output, a value which
     *        is not -1 is the parent pipe fd corresponding to the
     *        pipe which has been created.  An element of this array
     *        is -1 on input if and only if it is <em>not</em> -1 on
     *        output.
     * @return the pid of the subprocess
     */
    private native int forkAndExec(byte[] prog,
                                   byte[] argBlock, int argc,
                                   byte[] envBlock, int envc,
                                   byte[] dir,
                                   int[] fds,
                                   boolean redirectErrorStream)
        throws IOException;

    /**
     * The thread factory used to create "process reaper" daemon threads.
     */
    private static class ProcessReaperThreadFactory implements ThreadFactory {
        private final static ThreadGroup group = getRootThreadGroup();

        private static ThreadGroup getRootThreadGroup() {
            return doPrivileged(new PrivilegedAction<ThreadGroup> () {
                public ThreadGroup run() {
                    ThreadGroup root = Thread.currentThread().getThreadGroup();
                    while (root.getParent() != null)
                        root = root.getParent();
                    return root;
                }});
        }

        public Thread newThread(Runnable grimReaper) {
            // Our thread stack requirement is quite modest.
            Thread t = new Thread(group, grimReaper, "process reaper", 32768);
            t.setDaemon(true);
            // A small attempt (probably futile) to avoid priority inversion
            t.setPriority(Thread.MAX_PRIORITY);
            return t;
        }
    }

    /**
     * The thread pool of "process reaper" daemon threads.
     */
    private static final Executor processReaperExecutor =
        doPrivileged(new PrivilegedAction<Executor>() {
            public Executor run() {
                return Executors.newCachedThreadPool
                    (new ProcessReaperThreadFactory());
            }});

    UNIXProcess(final byte[] prog,
                final byte[] argBlock, final int argc,
                final byte[] envBlock, final int envc,
                final byte[] dir,
                final int[] fds,
                final boolean redirectErrorStream)
            throws IOException {

        pid = forkAndExec(prog,
                          argBlock, argc,
                          envBlock, envc,
                          dir,
                          fds,
                          redirectErrorStream);

        try {
            doPrivileged(new PrivilegedExceptionAction<Void>() {
                public Void run() throws IOException {
                    initStreams(fds);
                    return null;
                }});
        } catch (PrivilegedActionException ex) {
            throw (IOException) ex.getException();
        }
    }

    static FileDescriptor newFileDescriptor(int fd) {
        FileDescriptor fileDescriptor = new FileDescriptor();
        fileDescriptor.setInt$(fd);
        return fileDescriptor;
    }

    void initStreams(int[] fds) throws IOException {
        stdin = (fds[0] == -1) ?
            ProcessBuilder.NullOutputStream.INSTANCE :
            new ProcessPipeOutputStream(fds[0]);

        stdout = (fds[1] == -1) ?
            ProcessBuilder.NullInputStream.INSTANCE :
            new ProcessPipeInputStream(fds[1]);

        stderr = (fds[2] == -1) ?
            ProcessBuilder.NullInputStream.INSTANCE :
            new ProcessPipeInputStream(fds[2]);

        processReaperExecutor.execute(new Runnable() {
            public void run() {
                int exitcode = waitForProcessExit(pid);
                UNIXProcess.this.processExited(exitcode);
            }});
    }

    void processExited(int exitcode) {
        synchronized (this) {
            this.exitcode = exitcode;
            hasExited = true;
            notifyAll();
        }

        if (stdout instanceof ProcessPipeInputStream)
            ((ProcessPipeInputStream) stdout).processExited();

        if (stderr instanceof ProcessPipeInputStream)
            ((ProcessPipeInputStream) stderr).processExited();

        if (stdin instanceof ProcessPipeOutputStream)
            ((ProcessPipeOutputStream) stdin).processExited();
    }

    public OutputStream getOutputStream() {
        return stdin;
    }

    public InputStream getInputStream() {
        return stdout;
    }

    public InputStream getErrorStream() {
        return stderr;
    }

    public synchronized int waitFor() throws InterruptedException {
        while (!hasExited) {
            wait();
        }
        return exitcode;
    }

    public synchronized int exitValue() {
        if (!hasExited) {
            throw new IllegalThreadStateException("process hasn't exited");
        }
        return exitcode;
    }

    private static native void destroyProcess(int pid);
    public void destroy() {
        // There is a risk that pid will be recycled, causing us to
        // kill the wrong process!  So we only terminate processes
        // that appear to still be running.  Even with this check,
        // there is an unavoidable race condition here, but the window
        // is very small, and OSes try hard to not recycle pids too
        // soon, so this is quite safe.
        synchronized (this) {
            if (!hasExited)
                destroyProcess(pid);
        }
        try { stdin.close();  } catch (IOException ignored) {}
        try { stdout.close(); } catch (IOException ignored) {}
        try { stderr.close(); } catch (IOException ignored) {}
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Process[pid=");
        sb.append(pid);
        if (hasExited) {
            sb.append(" ,hasExited=true, exitcode=");
            sb.append(exitcode);
            sb.append("]");
        } else {
            sb.append(", hasExited=false]");
        }

        return sb.toString();
    }

    /* This routine initializes JNI field offsets for the class */
    private static native void initIDs();

    static {
        initIDs();
    }

    /**
     * A buffered input stream for a subprocess pipe file descriptor
     * that allows the underlying file descriptor to be reclaimed when
     * the process exits, via the processExited hook.
     *
     * This is tricky because we do not want the user-level InputStream to be
     * closed until the user invokes close(), and we need to continue to be
     * able to read any buffered data lingering in the OS pipe buffer.
     */
    static class ProcessPipeInputStream extends BufferedInputStream {
        ProcessPipeInputStream(int fd) {
            super(new FileInputStream(newFileDescriptor(fd), true /* isFdOwner */));
        }

        private static byte[] drainInputStream(InputStream in)
                throws IOException {
            if (in == null) return null;
            int n = 0;
            int j;
            byte[] a = null;
            while ((j = in.available()) > 0) {
                a = (a == null) ? new byte[j] : Arrays.copyOf(a, n + j);
                n += in.read(a, n, j);
            }
            return (a == null || n == a.length) ? a : Arrays.copyOf(a, n);
        }

        /** Called by the process reaper thread when the process exits. */
        synchronized void processExited() {
            // Most BufferedInputStream methods are synchronized, but close()
            // is not, and so we have to handle concurrent racing close().
            try {
                InputStream in = this.in;
                if (in != null) {
                    byte[] stragglers = drainInputStream(in);
                    in.close();
                    this.in = (stragglers == null) ?
                        ProcessBuilder.NullInputStream.INSTANCE :
                        new ByteArrayInputStream(stragglers);
                    if (buf == null) // asynchronous close()?
                        this.in = null;
                }
            } catch (IOException ignored) {
                // probably an asynchronous close().
            }
        }
    }

    /**
     * A buffered output stream for a subprocess pipe file descriptor
     * that allows the underlying file descriptor to be reclaimed when
     * the process exits, via the processExited hook.
     */
    static class ProcessPipeOutputStream extends BufferedOutputStream {
        ProcessPipeOutputStream(int fd) {
            super(new FileOutputStream(newFileDescriptor(fd), true /* isFdOwner */));
        }

        /** Called by the process reaper thread when the process exits. */
        synchronized void processExited() {
            OutputStream out = this.out;
            if (out != null) {
                try {
                    out.close();
                } catch (IOException ignored) {
                    // We know of no reason to get an IOException, but if
                    // we do, there's nothing else to do but carry on.
                }
                this.out = ProcessBuilder.NullOutputStream.INSTANCE;
            }
        }
    }
}
