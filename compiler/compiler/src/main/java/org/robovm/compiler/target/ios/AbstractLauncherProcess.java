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
import org.robovm.compiler.log.ErrorOutputStream;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.target.LaunchParameters;
import org.robovm.compiler.target.Launcher;

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
public abstract class AbstractLauncherProcess<T extends LaunchParameters> extends Process implements Launcher {
    protected final Logger log;
    protected final CountDownLatch countDownLatch = new CountDownLatch(1);
    private final Thread launcherThread;
    private volatile boolean cleanedUp = false;
    private volatile boolean finished = false;
    private volatile int exitCode = -1;
    protected final Listener listener;
    protected final T launchParameters;

    public AbstractLauncherProcess(Logger log, Listener listener, T launchParameters) {
        this.log = log;
        this.listener = listener;
        this.launchParameters = launchParameters;
        this.launcherThread = new Thread(this::internalPerformLaunch, getThreadName());
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

    @Override
    public final Process execAsync() {
        listener.beforeLaunch();
        this.launcherThread.start();
        listener.justLaunched(this);
        return this;
    }

    protected abstract int performLaunch() throws IOException;

    protected abstract OutputStream getPipeForStdIn();

    protected abstract InputStream getPipeForStdOut();

    protected abstract InputStream getPipeForStdErr();

    @Override
    public final OutputStream getOutputStream() {
        return getPipeForStdIn();
    }

    @Override
    public final InputStream getInputStream() {
        return getPipeForStdOut();
    }

    @Override
    public final InputStream getErrorStream() {
        return getPipeForStdErr();
    }

    @Override
    public final int waitFor() throws InterruptedException {
        countDownLatch.await();
        return exitCode;
    }

    @Override
    public final int exitValue() {
        if (!finished) {
            throw new IllegalThreadStateException("Not terminated");
        }
        return exitCode;
    }

    @Override
    public final void destroy() {
        try {
            this.launcherThread.interrupt();
            this.launcherThread.join();
        } catch (InterruptedException ignored) {
        }
        cleanUp();
    }

    private void cleanUp() {
        synchronized (this) {
            if (!cleanedUp) {
                cleanedUp = true;
                listener.launchFinished();
            }
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
