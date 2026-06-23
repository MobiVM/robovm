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

import org.robovm.libimobiledevice.IDevice;
import org.robovm.libimobiledevice.IDeviceConnection;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * Generic implementations of {@link Launcher.Connection}
 */
public final class LauncherConnections {
    private LauncherConnections() {
    }

    /**
     * {@link Launcher.Connection} implementation based on socket connection to target
     */
    public static class SocketConnection implements Launcher.Connection {
        private final String address;
        private volatile Socket socket;

        public SocketConnection(String address) {
            this.address = address;
        }

        private void requireSocket() {
            if (socket == null) throw new IllegalStateException("Not connected");
        }

        @Override
        public void connect(int port) throws IOException {
            if (socket != null) throw new IllegalStateException("Already connected");
            socket = new Socket();
            socket.connect(new InetSocketAddress(address, port), 1000);
            socket.setTcpNoDelay(true);
        }

        @Override
        public void disconnect() throws IOException {
            requireSocket();
            socket.close();
        }

        public SocketAddress getSocketAddress() {
            requireSocket();
            return socket.getRemoteSocketAddress();
        }

        public int getPort() {
            requireSocket();
            return socket.getPort();
        }

        @Override
        public InputStream in() throws IOException {
            requireSocket();
            return socket.getInputStream();
        }

        @Override
        public OutputStream out() throws IOException {
            requireSocket();
            return socket.getOutputStream();
        }
    }

    /**
     * implements hooks connection to device over ILibMobileDevice
     */
    public static class LibMobileDeviceConnection implements Launcher.Connection {
        private volatile IDeviceConnection deviceConnection;
        private final IDevice device;

        public LibMobileDeviceConnection(IDevice device) {
            this.device = device;
        }

        private void requireConnection() {
            if (deviceConnection == null) throw new IllegalStateException("Not connected");
        }

        @Override
        public void connect(int port) throws IOException {
            if (deviceConnection != null) throw new IllegalStateException("Already connected");
            deviceConnection = device.connect(port);
        }

        @Override
        public void disconnect() {
            requireConnection();
            deviceConnection.close();
        }

        @Override
        public InputStream in() throws IOException {
            requireConnection();
            return deviceConnection.getInputStream();
        }

        @Override
        public OutputStream out() throws IOException {
            requireConnection();
            return deviceConnection.getOutputStream();
        }
    }
}
