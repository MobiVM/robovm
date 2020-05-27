/*
 * Copyright (C) 2013 RoboVM AB
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/gpl-2.0.html>.
 */
package org.robovm.compiler.target.ios;

import org.apache.commons.exec.ExecuteException;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.robovm.compiler.log.ErrorOutputStream;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.target.LaunchParameters;
import org.robovm.compiler.target.Launchers.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.concurrent.CountDownLatch;

import static org.apache.commons.exec.Executor.INVALID_EXITVALUE;

/**
 * base {@link Process} class that provides base functionality for concrete implementations
 */
public abstract class AbstractLauncherProcess<T extends LaunchParameters> {
    protected final Logger log;
    protected final Listener listener;
    protected final T launchParameters;

    protected final CountDownLatch countDownLatch = new CountDownLatch(1);
    private final Thread launcherThread;
    private volatile boolean cleanedUp = false;
    private volatile boolean finished = false;
    private volatile int exitCode = -1;

    // input/output redirection. if not set -- launcher specific will be used
    protected final OutputStream out;
    protected final OutputStream err;
    protected final InputStream in;

    protected final InputStream waitInputStream = new WaitInputStream();

    protected AbstractLauncherProcess(Logger log, Listener listener, T launchParameters,
                                      OutputStream out, OutputStream err, InputStream in) {
        this.log = log;
        this.listener = listener;
        this.launchParameters = launchParameters;
        this.out = out;
        this.err = err;
        this.in = in;
        this.launcherThread = new Thread(this::internalPerformLaunch, getThreadName());

        // notify right in the bottom of constructors. this allows all launchers to
        // use finished launchParameters at constructor level
        listener.beforeLaunch();
    }

    protected AbstractLauncherProcess(Builder<T> builder) {
        this(builder.log, builder.listener, builder.launchParameters,
                builder.out.getLeft(), builder.err.getLeft(), builder.in.getLeft());
    }

    private void internalPerformLaunch() {
        try {
            exitCode = performLaunch();
        } catch (ExecuteException e) {
            exitCode = e.getExitValue();
            // if process is interrupted Apache Executor will use this constant, replace with 0 otherwise
            // -559038737 looks odd in console output
            if (exitCode == INVALID_EXITVALUE)
                exitCode = 0;
        } catch (Throwable t) {
            log.error(getLauncherName() + " failed with an exception:", t.getMessage());
            t.printStackTrace(new PrintStream(new ErrorOutputStream(log), true));
        } finally {
            finished = true;
            countDownLatch.countDown();
            cleanUp();
        }
    }

    protected String getLauncherName() {
        return this.getClass().getSimpleName().replace("Process", "");
    }

    protected String getThreadName() {
        return getLauncherName() + "Thread";
    }

    public final int waitFor() throws InterruptedException {
        countDownLatch.await();
        return exitCode;
    }

    protected void launchThread() {
        launcherThread.start();
    }

    protected abstract int performLaunch() throws IOException;

    private void cleanUp() {
        synchronized (this) {
            if (!cleanedUp) {
                cleanedUp = true;
                listener.launchFinished();
            }
        }
    }

    /**
     * builder for synchronous launcher
     */
    protected static abstract class Builder<T extends LaunchParameters> implements CustomizableLauncher, SyncLauncherBuilder, AsyncLauncherBuilder{
        protected final Logger log;
        protected final Listener listener;
        protected final T launchParameters;

        // input/output stream and their related sinks (for process)
        protected Pair<OutputStream, InputStream> out;
        protected Pair<OutputStream, InputStream> err;
        protected Pair<InputStream, OutputStream> in;

        public Builder(Logger log, Listener listener, T launchParameters) {
            this.log = log;
            this.listener = listener;
            this.launchParameters = launchParameters;
        }

        /// subclasses should return a duplicate of object to be returned as customization ones
        protected abstract Builder<T> duplicate();

        /// subclass expected create launcher thread and finish initialization there
        protected abstract AbstractLauncherProcess<T> createAndSetupThread(boolean async) throws IOException;

        @Override
        public SyncLauncherBuilder setOut(OutputStream out) {
            this.out = new ImmutablePair<>(out, null);
            return this;
        }

        @Override
        public SyncLauncherBuilder setErr(OutputStream err) {
            this.err = new ImmutablePair<>(err, null);
            return this;
        }

        @Override
        public SyncLauncherBuilder setIn(InputStream in) {
            this.in = new ImmutablePair<>(in, null);
            return this;
        }

        @Override
        public AsyncLauncherBuilder setOut(OutputStream out, InputStream outSink) {
            this.out = new ImmutablePair<>(out, outSink);
            return this;
        }

        @Override
        public AsyncLauncherBuilder setErr(OutputStream err, InputStream errSink) {
            this.err = new ImmutablePair<>(err, errSink);
            return this;
        }

        @Override
        public AsyncLauncherBuilder setIn(InputStream in, OutputStream inSink) {
            this.in = new ImmutablePair<>(in, inSink);
            return this;
        }

        @Override
        public int exec() throws IOException, InterruptedException {
            AbstractLauncherProcess<T> launcher = createAndSetupThread(false);
            launcher.launchThread();
            return launcher.waitFor();
        }

        @Override
        public Process execAsync() throws IOException {
            AbstractLauncherProcess<T> launcher = createAndSetupThread(true);
            Process process = new LauncherProcess(launcher, in.getRight(), out.getRight(), err.getRight());
            launcher.launchThread();
            listener.justLaunched(process);
            return process;
        }

        @Override
        public SyncLauncherBuilder customizeExec() {
            return duplicate();
        }

        @Override
        public AsyncLauncherBuilder customizeExecAsync() {
            return duplicate();
        }
    }

    protected static class LauncherProcess extends Process {
        private final AbstractLauncherProcess<?> launcher;
        // streams will be initialized once before starting the thread
        private final OutputStream inSink;
        private final InputStream outSink;
        private final InputStream errSink;

        public LauncherProcess(AbstractLauncherProcess<?> launcher, OutputStream inSink, InputStream outSink, InputStream errSink) {
            this.launcher = launcher;
            this.inSink = inSink;
            this.outSink = outSink;
            this.errSink = errSink;
        }

        @Override
        public final OutputStream getOutputStream() {
            return inSink;
        }

        @Override
        public final InputStream getInputStream() {
            return outSink;
        }

        @Override
        public final InputStream getErrorStream() {
            return errSink;
        }

        @Override
        public final int waitFor() throws InterruptedException {
            return launcher.waitFor();
        }

        @Override
        public final int exitValue() {
            if (!launcher.finished) {
                throw new IllegalThreadStateException("Not terminated");
            }
            return launcher.exitCode;
        }

        @Override
        public final void destroy() {
            try {
                launcher.launcherThread.interrupt();
                launcher.launcherThread.join();
            } catch (InterruptedException ignored) {
            }
            launcher.cleanUp();
        }
    }

    protected class WaitInputStream extends InputStream {
        @Override
        public int read() throws IOException {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                throw new InterruptedIOException();
            }
            return -1;
        }
    }
}
