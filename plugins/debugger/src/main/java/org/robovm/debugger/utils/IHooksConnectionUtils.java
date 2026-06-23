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

import org.robovm.debugger.hooks.IHooksConnection;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * Utilities for getting IHooksConnection:
 */
public final class IHooksConnectionUtils {
    private IHooksConnectionUtils() {
    }

    /**
     * @return constants Feature for already resolved connection
     */
    public static <T> Future<T> constantFuture(T resolved) {
        CompletableFuture<T> f = new CompletableFuture<>();
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
    }
}
