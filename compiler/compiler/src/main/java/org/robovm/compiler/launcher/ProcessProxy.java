/*
 * Copyright (C) 2025 The MobiVM Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.compiler.launcher;

import org.robovm.compiler.util.io.NullOutputStream;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProcessProxy extends Process {
    /// exit code to return in case of internal exception in process task, e.g. uncaught exception, task manager failure etc.
    static int INTERNAL_EXCEPTION_EXIT_CODE = -300;

    /// Task to run in background, once it is complete -- process is considered as exited and exit code is delivered
    public interface ProcessTask {
        int run() throws Exception;
    }

    /// Manager of process task, allows to schedule task and to terminate it on demand (e.g. on process destroy)
    public interface ProcessTaskManager {
        Object scheduleTask(Runnable r);
        void terminateTask(Object ref);
    }

    private final CompletableFuture<Integer> exitCodePromise;
    private final InputStream inputStdoutStream;
    private final InputStream inputErrorStream;
    private final OutputStream outputStdinStream;
    private final ProcessTaskManager taskManager;
    private final Object taskRef;

    /**
     * Creates proxy process around scheduled task
     * Note about streams: most likely these are PipedInputStreams connected to some PipedOutputStreams,
     *                     but it is up to caller to decide how to prepare them,
     *                     e.g. they can be connected to some other process streams or not connected at all
     * @param inputStdoutStream stream that will be returned by getInputStream()
     * @param inputErrorStream stream that will be returned by getErrorStream()
     * @param outputStdinStream stream that will be returned by getOutputStream(), if null -- it will be replaced with NullOutputStream
     * @param listener listener to deliver process events, might be null
     * @param taskManager manager that starts task and allows to terminate it on demand
     */
    public ProcessProxy(
        InputStream inputStdoutStream,
        InputStream inputErrorStream,
        OutputStream outputStdinStream,
        ProcessTaskManager taskManager,
        Launcher.Listener listener,
        ProcessTask task
    ) {
        this.exitCodePromise = new CompletableFuture<>();
        this.inputStdoutStream = inputStdoutStream;
        this.inputErrorStream = inputErrorStream;
        this.outputStdinStream = outputStdinStream != null ? outputStdinStream : new NullOutputStream();
        this.taskManager = taskManager;

        // wrap the task and schedule it to run async, once it is complete -- complete the process exit promise
        taskRef = taskManager.scheduleTask( () -> {
            int exitCode;
            try {
                if (listener != null) listener.onLaunching();

                exitCode = task.run();
                exitCodePromise.complete(exitCode);
            } catch (Throwable t) {
                // exitCodePromise should not be completed exceptionally
                exitCode = INTERNAL_EXCEPTION_EXIT_CODE;
                exitCodePromise.complete(exitCode);
            }

            if (listener != null) listener.onExited(exitCode);
        });
    }


    @Override
    public void destroy() {
        // request process to be destroyed
        taskManager.terminateTask(taskRef);
    }

    @Override
    public OutputStream getOutputStream() {
        return outputStdinStream;
    }

    @Override
    public InputStream getErrorStream() {
        return inputErrorStream;
    }

    @Override
    public InputStream getInputStream() {
        return inputStdoutStream;
    }

    @Override
    public int exitValue() {
        int exitValue;
        if (!exitCodePromise.isDone()) throw new IllegalThreadStateException(); // process is not finished yet
        try {
            exitValue = exitCodePromise.get();
        } catch (InterruptedException e) {
            // consider as not complete yet
            throw new IllegalThreadStateException();
        } catch (ExecutionException e) {
            // completed exceptionally, return code for it
            exitValue = INTERNAL_EXCEPTION_EXIT_CODE;
        }

        return exitValue;
    }

    @Override
    public int waitFor() throws InterruptedException{
        try {
            return exitCodePromise.get();
        } catch (InterruptedException t) {
            throw t;
        } catch (Exception e) {
            return INTERNAL_EXCEPTION_EXIT_CODE;
        }
    }

    /**
     * Creates process proxy around task that will be executed in single thread executor
     */
    public static ProcessProxy singleThread(
        InputStream inputStdoutStream,
        InputStream inputErrorStream,
        OutputStream outputStdinStream,
        Launcher.Listener listener,
        ProcessTask task
    ) {
        ProcessTaskManager manager = new ProcessTaskManager() {
            @Override
            public ExecutorService scheduleTask(Runnable r) {
                ExecutorService executor = Executors.newSingleThreadExecutor();
                executor.execute(r);
                return executor;
            }

            @Override
            public void terminateTask(Object ref) {
                ((ExecutorService) ref).shutdownNow();
            }
        };

        return new ProcessProxy(inputStdoutStream, inputErrorStream, outputStdinStream, manager, listener, task);

    }
}