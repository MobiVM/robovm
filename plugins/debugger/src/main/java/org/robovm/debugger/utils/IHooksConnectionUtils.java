/*
 * Copyright (C) 2025 The MobiVM Contributors
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
package org.robovm.debugger.utils;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.hooks.IHooksConnection;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.concurrent.*;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Utilities for getting IHooksConnection:
 */
public final class IHooksConnectionUtils {
    private IHooksConnectionUtils() {
    }

    /**
     * @return constants Feature for already resolved connection
     */
    public static Future<IHooksConnection> constantFuture(IHooksConnection resolved) {
        CompletableFuture<IHooksConnection> f = new CompletableFuture<>();
        f.complete(resolved);
        return f;
    }


    /**
     * Connection for socket case (simulator/ios device over tunnel)
     */
    public static class SocketHooksConnection implements IHooksConnection {
        private final SocketAddress socketAddress;
        private Socket socket;

        public SocketHooksConnection(SocketAddress socketAddress) {
            this.socketAddress = socketAddress;
        }

        /**
         * Connection to local host at specific port number
         */
        public SocketHooksConnection(int port) {
            this.socketAddress = new InetSocketAddress("127.0.0.1", port);
        }

        @Override
        public void connect() throws IOException {
            socket = new Socket();
            socket.connect(socketAddress, 1000);
            socket.setTcpNoDelay(true);
        }

        @Override
        public void disconnect() throws IOException {
            if (socket != null && socket.isClosed())
                socket.close();
        }

        @Override
        public InputStream getInputStream() throws IOException {
            return socket.getInputStream();
        }

        @Override
        public OutputStream getOutputStream() throws IOException {
            return socket.getOutputStream();
        }

        public static Future<IHooksConnection> constantFuture(SocketAddress address) {
            return IHooksConnectionUtils.constantFuture(new SocketHooksConnection(address));
        }

        public static Future<IHooksConnection> constantFuture(int port) {
            return IHooksConnectionUtils.constantFuture(new SocketHooksConnection(port));
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

    /**
     * Completable Future that observe Output for "hooks: debugPort=" line to capture port number from it
     */
    public static class OutputHookPortObserverFuture extends CompletableFuture<Integer> {
        private String incompleteLine;
        private final static String tag = "[DEBUG] hooks: debugPort=";

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
                    if (str.startsWith(tag, lookingPos)) {
                        // got it
                        this.complete(Integer.parseInt(str.substring(lookingPos + tag.length(), newLineIdx).trim()));
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

        public <U> ChainingFuture<T, U> thenApply(Function<? super T, ? extends U> fn) {
            return new ChainingFuture<>(this, fn);
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
     * Wrapper around another Future.
     * Used as request to provide a Future that will produce IHooksConnection
     */
    public static class DelegatingFuture<T> implements Future<T> {
        volatile Future<T> delegate = null;
        public void setDelegate(Future<T> delegate) {
            this.delegate = delegate;
        }
        private Future<T> getDelegate() {
            Future<T> d = this.delegate;
            if (d == null) throw new DebuggerException("Debugger support is not available!");
            return d;
        }

        @Override
        public boolean cancel(boolean mayInterruptIfRunning) {
            return getDelegate().cancel(mayInterruptIfRunning);
        }

        @Override
        public boolean isCancelled() {
            return getDelegate().isCancelled();
        }

        @Override
        public boolean isDone() {
            return getDelegate().isDone();
        }

        @Override
        public T get() throws InterruptedException, ExecutionException {
            return getDelegate().get();
        }

        @Override
        public T get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
            return getDelegate().get(timeout, unit);
        }
    }

    /**
     * Wrapper around another Future with map functionality .
     * will wait another future to complete and then map result
     */
    public static class ChainingFuture<T, U> implements Future<U> {
        private final Future<T> dependency;
        private final Function<? super T, ? extends U> mutator;
        private final CompletableFuture<U> internalFuture = new CompletableFuture<>();

        public ChainingFuture(Future<T> dependency, Function<? super T, ? extends U> mutator) {
            this.dependency = dependency;
            this.mutator = mutator;
        }

        @Override
        public boolean cancel(boolean mayInterruptIfRunning) {
            return dependency.cancel(mayInterruptIfRunning);
        }

        @Override
        public boolean isCancelled() {
            return dependency.isCancelled();
        }

        @Override
        public boolean isDone() {
            return internalFuture.isDone();
        }

        @Override
        public U get() throws InterruptedException, ExecutionException {
            synchronized (internalFuture) {
                if (internalFuture.isDone()) return internalFuture.get();
            }

            T intermediate = dependency.get();
            synchronized (internalFuture) {
                if (!internalFuture.isDone()) internalFuture.complete(mutator.apply(intermediate));
                return internalFuture.get();
            }
        }

        @Override
        public U get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
            synchronized (internalFuture) {
                if (internalFuture.isDone()) return internalFuture.get();
            }

            T intermediate = dependency.get(timeout, unit);
            synchronized (internalFuture) {
                if (!internalFuture.isDone()) internalFuture.complete(mutator.apply(intermediate));
                return internalFuture.get();
            }
        }

        public <U2> ChainingFuture<U, U2> thenApply(Function<? super U, ? extends U2> fn) {
            return new ChainingFuture<>(this, fn);
        }
    }
}
