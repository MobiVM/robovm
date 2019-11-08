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
package org.robovm.libimobiledevice;

import org.robovm.libimobiledevice.binding.DebugServerClientRef;
import org.robovm.libimobiledevice.binding.DebugServerClientRefOut;
import org.robovm.libimobiledevice.binding.DebugServerError;
import org.robovm.libimobiledevice.binding.IntOut;
import org.robovm.libimobiledevice.binding.LibIMobileDevice;
import org.robovm.libimobiledevice.binding.LockdowndServiceDescriptorStruct;

/**
 * Handles connection with debugserver running on device
 */
public class DebugServerClient implements AutoCloseable {
    protected DebugServerClientRef ref;

    DebugServerClient(DebugServerClientRef ref) {
        this.ref = ref;
    }

    /**
     * Creates a new {@link DebugServerClient} for the specified {@link IDevice}.
     *
     * @param device the device to create a {@link DebugServerClient} for.
     * @param label the label to use for communication. Usually the program
     *        name. Pass <code>null</code> to disable sending the label in
     *        requests to lockdownd.
     */
    public DebugServerClient(IDevice device, String label) {
        if (device == null) {
            throw new NullPointerException("device");
        }
        DebugServerClientRefOut refOut = new DebugServerClientRefOut();
        try {
            checkResult(LibIMobileDevice.debugserver_client_start_service(device.getRef(), refOut, label));
            this.ref = refOut.getValue();
        } finally {
            refOut.delete();
        }
    }

    /**
     * Creates a new {@link DebugServerClient} for the specified {@link IDevice}.
     *
     * @param device the device to create a {@link DebugServerClient} for.
     * @param descriptor LockdownService descriptor of opened DebugServer service
     */
    public DebugServerClient(IDevice device, LockdowndServiceDescriptor descriptor) {
        this(device, descriptor.toDescriptorStruct());
    }

    /**
     * Creates a new {@link DebugServerClient} for the specified {@link IDevice}.
     *
     * @param device the device to create a {@link DebugServerClient} for.
     * @param descriptor LockdownService descriptor struct of opened DebugServer service
     */
    public DebugServerClient(IDevice device, LockdowndServiceDescriptorStruct descriptor) {
        if (device == null) {
            throw new NullPointerException("device");
        }
        DebugServerClientRefOut refOut = new DebugServerClientRefOut();
        try {
            checkResult(LibIMobileDevice.debugserver_client_new(device.getRef(), descriptor, refOut));
            this.ref = refOut.getValue();
        } finally {
            refOut.delete();
        }
    }

    protected DebugServerClientRef getRef() {
        checkDisposed();
        return ref;
    }

    protected final void checkDisposed() {
        if (ref == null) {
            throw new LibIMobileDeviceException("Already disposed");
        }
    }
    
    public synchronized void dispose() {
        checkDisposed();
        LibIMobileDevice.debugserver_client_free(ref);
        ref = null;
    }
    
    @Override
    public void close() {
        dispose();
    }

    /**
     * Sends data to the device using connection behind this DebugServerClient.
     *
     * @param buffer the buffer to be sent.
     * @param offset the start position in {@code buffer} from where to get bytes.
     * @param count the number of bytes from {@code buffer} to send.
     * @return the number of bytes actually sent.
     */
    public int send(byte[] buffer, int offset, int count) {
        checkArrayBounds(buffer, offset, count);

        if (count == 0) {
            return 0;
        }

        byte[] data = buffer;
        if (offset > 0) {
            data = new byte[count];
            System.arraycopy(buffer, offset, data, 0, count);
        }

        IntOut bytesSentOut = new IntOut();
        try {
            checkResult(LibIMobileDevice.debugserver_client_send(getRef(), data, count, bytesSentOut));
            return bytesSentOut.getValue();
        } finally {
            bytesSentOut.delete();
        }
    }


    /**
     * Receives data from the device. Returns after the given timeout even if no
     * data has been received.
     *
     * @param buffer the byte array in which to store the received data.
     * @param offset the initial position in {@code buffer} to store the
     *               received bytes.
     * @param count the maximum number of bytes to store in {@code buffer}.
     * @param timeout timeout in milliseconds after which this method will
     *                return even if no data has been received.
     * @return the number of bytes received.
     */
    public int receive(byte[] buffer, int offset, int count, int timeout) {
        checkArrayBounds(buffer, offset, count);

        if (count == 0) {
            return 0;
        }

        byte[] data = buffer;
        if (offset > 0) {
            data = new byte[count];
        }

        IntOut bytesReceivedOut = new IntOut();
        try {
            checkResult(LibIMobileDevice.debugserver_client_receive_with_timeout(getRef(),
                    data, count, bytesReceivedOut, timeout),  DebugServerError.DEBUGSERVER_E_TIMEOUT);
            int bytesRead = bytesReceivedOut.getValue();
            if (bytesRead > 0 && data != buffer) {
                System.arraycopy(data, 0, buffer, offset, bytesRead);
            }
            return bytesRead;
        } finally {
            bytesReceivedOut.delete();
        }
    }

    private void checkArrayBounds(byte[] buffer, int offset, int count) {
        if ((offset | count) < 0 || offset > buffer.length || buffer.length - offset < count) {
            throw new ArrayIndexOutOfBoundsException("length=" + buffer.length
                    + "; regionStart=" + offset + "; regionLength=" + count);
        }
    }

    private static void checkResult(DebugServerError result) {
        if (result != DebugServerError.DEBUGSERVER_E_SUCCESS) {
            throw new LibIMobileDeviceException(result.swigValue(), result.name());
        }
    }

    /**
     * overloaded version to allow known error, for example TIMEOUT
     */
    static void checkResult(DebugServerError result, DebugServerError allowed) {
        if (result != DebugServerError.DEBUGSERVER_E_SUCCESS && result != allowed) {
            throw new LibIMobileDeviceException(result.swigValue(), result.name());
        }
    }
}
