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

import org.robovm.compiler.util.io.OutputStreamChain;
import org.robovm.debugger.DebuggerException;

import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * set of utilities for {@link Launcher}, e.g. for waiting for port number from output or file
 */
final public class LauncherUtils {
    private LauncherUtils() {
    }

    /**
     * Completable Future that observe Output for "hooks: debugPort=" line to capture port number from it
     */
    public static class OutputPortObserverFuture extends CompletableFuture<Integer> {
        /// interface to delegate port extraction logic from string, passes offset after last line break
        /// if string contains multiple lines
        @FunctionalInterface
        public interface PortExtractor {
            String extractPort(String s, int lineStartOffset, int lineEndOffset);
        }

        private String incompleteLine;
        private final PortExtractor portExtractor;
        private final static String hooksDebugPortTag = "[DEBUG] hooks: debugPort=";

        public OutputPortObserverFuture(PortExtractor portExtractor) {
            this.portExtractor = portExtractor;
        }

        // default implementation of port extractor, with hooks debug port tag
        public OutputPortObserverFuture() {
            this((s, start, end) -> {
                if (s.startsWith(hooksDebugPortTag, start))
                    return s.substring(start + hooksDebugPortTag.length(), end).trim();
                return null;
            });
        }

        public void observeOutput(byte[] data, int offset, int length) {
            if (!isDone()) {
                // port is not received yet, keep working
                String str = new String(data, offset, length, StandardCharsets.UTF_8);
                if (incompleteLine != null) {
                    str = incompleteLine + str;
                    incompleteLine = null;
                }

                int lookingPos = 0;
                int newLineIdx = str.indexOf('\n');
                while (newLineIdx >= 0) {
                    // get next new line
                    String port = portExtractor.extractPort(str, lookingPos, newLineIdx);
                    if (port != null) {
                        // got it
                        this.complete(Integer.parseInt(port));
                        break;
                    } else {
                        // move to next line
                        lookingPos = newLineIdx + 1;
                        newLineIdx = str.indexOf('\n', newLineIdx + 1);
                    }
                }

                // keep trailing line (without eol)
                if (!isDone() && lookingPos < str.length()) {
                    incompleteLine = lookingPos != 0 ? str.substring(lookingPos) : str;
                }
            }
        }
    }

    /**
     * Attaches observer to output stream chain, so it will receive all output data and can parse port number from it
     */
    public static void attachOutputPortObserver(OutputStreamChain chain, OutputPortObserverFuture observer) {
        chain.registerLink(parent -> new FilterOutputStream(parent) {
            @Override
            public void write(byte[] b, int off, int len) throws IOException {
                observer.observeOutput(b, off, len);
                super.write(b, off, len);
            }

            @Override
            public void write(int b) throws IOException {
                observer.observeOutput(new byte[]{(byte) b}, 0, 1);
                super.write(b);
            }
        });
    }

    /**
     * Features that periodically polls supplier for value
     * Useful for periodical check for value, e.g. file on disk
     */
    public static class PollingFuture<T> implements Future<T> {
        private final CompletableFuture<T> internalFuture = new CompletableFuture<>();
        private final Long pollingTimeoutNano;
        private final Supplier<T> tryGet;

        PollingFuture(Long pollingTimeoutNano, Supplier<T> tryGet) {
            this.tryGet = tryGet;
            this.pollingTimeoutNano = pollingTimeoutNano;
        }

        PollingFuture(Supplier<T> tryGet) {
            this.tryGet = tryGet;
            this.pollingTimeoutNano = TimeUnit.MILLISECONDS.toNanos(50);
        }

        @Override
        public boolean cancel(boolean mayInterruptIfRunning) {
            return internalFuture.cancel(mayInterruptIfRunning);
        }

        @Override
        public boolean isCancelled() {
            return internalFuture.isCancelled();
        }

        @Override
        public boolean isDone() {
            return internalFuture.isDone();
        }

        @Override
        public T get() throws InterruptedException, ExecutionException {
            try {
                return get(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (TimeoutException e) {
                throw new ExecutionException(e);
            }
        }

        @Override
        public T get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
            long nanoTimeout = unit.toNanos(timeout);
            long ts = System.currentTimeMillis();
            long deadLine = ts + nanoTimeout;
            long remain = deadLine - ts;
            while (remain > 0) {
                synchronized (internalFuture) {
                    // check if complete by another thread
                    if (isDone()) return internalFuture.get();
                    if (isCancelled()) throw new CancellationException();
                    try {
                        T result = tryGet.get();
                        if (result != null) {
                            internalFuture.complete(result);
                            return result;
                        }
                    } catch (Exception e) {
                        internalFuture.completeExceptionally(e);
                        throw e;
                    }
                }
                // use internal future for sleep:
                // it allows to get canceled if cancel() is called
                try {
                    T result = internalFuture.get(Long.min(remain, pollingTimeoutNano), TimeUnit.NANOSECONDS);
                    if (result != null) return result;
                } catch (TimeoutException ignored) {
                }

                ts = System.currentTimeMillis();
                remain = deadLine - ts;
            }
            if (isCancelled()) throw new CancellationException();
            throw new TimeoutException();
        }
    }

    /**
     * Feature that waits for file with port number to appear and then completes
     */
    public static PollingFuture<Integer> waitForPortFromFile(File portFile) {
        return new PollingFuture<>(() -> portFromFile(portFile));
    }

    /**
     * tries to read port number from file, if file doesn't exist -- returns null
     */
    public static Integer portFromFile(File portFile) {
        if (portFile.exists() && portFile.length() != 0) {
            try {
                return Integer.parseInt(new String(Files.readAllBytes(portFile.toPath())));
            } catch (IOException e) {
                throw new DebuggerException(e);
            }
        }

        return null;
    }


    public static List<String> splitCommandLine(String args) {
        if (args == null || args.trim().isEmpty()) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        Matcher matcher = Pattern.compile("\"([^\"]*)\"|'([^']*)'|([^\\s\"']+)").matcher(args);
        StringBuilder currentArg = new StringBuilder();

        // Keep track of the end index of the last match to detect gaps (spaces) between arguments.
        // if there is no gap -- consider as sinle argument e.g. "aaa"'bbb' -> aaabbb
        int lastEnd = -1;
        while (matcher.find()) {
            if (lastEnd != -1 && matcher.start() > lastEnd) {
                result.add(currentArg.toString());
                currentArg.setLength(0);
            }

            if (matcher.group(1) != null)
                currentArg.append(matcher.group(1)); // Double quoted
            else if (matcher.group(2) != null)
                currentArg.append(matcher.group(2)); // Single quoted
            else if (matcher.group(3) != null)
                currentArg.append(matcher.group(3)); // Unquoted

            lastEnd = matcher.end();
        }
        if (lastEnd != -1) result.add(currentArg.toString());

        return result;
    }
}
