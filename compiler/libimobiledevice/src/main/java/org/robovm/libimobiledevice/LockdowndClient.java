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

import java.io.IOException;

import org.robovm.libimobiledevice.binding.LibIMobileDevice;
import org.robovm.libimobiledevice.binding.LockdowndClientRef;
import org.robovm.libimobiledevice.binding.LockdowndClientRefOut;
import org.robovm.libimobiledevice.binding.LockdowndError;
import org.robovm.libimobiledevice.binding.LockdowndServiceDescriptorStruct;
import org.robovm.libimobiledevice.binding.LockdowndServiceDescriptorStructOut;
import org.robovm.libimobiledevice.binding.PlistRef;
import org.robovm.libimobiledevice.binding.PlistRefOut;

import com.dd.plist.NSObject;

/**
 * Handles device connection communication.
 */
public class LockdowndClient implements AutoCloseable {
    protected LockdowndClientRef ref;
    private IDevice device;

    LockdowndClient(LockdowndClientRef ref) {
        this.ref = ref;
    }
    
    /**
     * Creates a new {@link LockdowndClient} for the specified {@link IDevice}.
     * 
     * @param device the device to create a {@link LockdowndClient} for.
     * @param label the label to use for communication. Usually the program 
     *        name. Pass <code>null</code> to disable sending the label in 
     *        requests to lockdownd.
     * @param handshake <code>true</code> if initial handshake should be done.
     */
    public LockdowndClient(IDevice device, String label, boolean handshake) {
        if (device == null) {
            throw new NullPointerException("device");
        }
        LockdowndClientRefOut refOut = new LockdowndClientRefOut();
        try {
            checkResult(handshake ? 
                    LibIMobileDevice.lockdownd_client_new_with_handshake(device.getRef(), refOut, label) :
                    LibIMobileDevice.lockdownd_client_new(device.getRef(), refOut, label));
            this.ref = refOut.getValue();
            this.device = device;
        } finally {
            refOut.delete();
        }
    }
    
    protected LockdowndClientRef getRef() {
        checkDisposed();
        return ref;
    }

    public IDevice getDevice() {
        return device;
    }

    /**
     * Requests to start a service.
     * 
     * @param identifier the name of the service to start.
     * @return the service descriptor.
     */
    public LockdowndServiceDescriptor startService(String identifier) {
        if (identifier == null) {
            throw new NullPointerException("identifier");
        }
        LockdowndServiceDescriptorStructOut serviceOut = new LockdowndServiceDescriptorStructOut();
        try {
            checkResult(LibIMobileDevice.lockdownd_start_service(getRef(), identifier, serviceOut));
            return new LockdowndServiceDescriptor(serviceOut.getValue());
        } finally {
            LockdowndServiceDescriptorStruct d = serviceOut.getValue();
            if (d != null) {
                LibIMobileDevice.lockdownd_service_descriptor_free(d);
            }
            serviceOut.delete();
        }
    }
    
    /**
     * Retrieves a preferences plist using an optional domain and/or key name.
     * 
     * @param domain the domain to query on or <code>null</code> for the global 
     *        domain.
     * @param key the key name to request or <code>null</code> to query for all 
     *        keys.
     * @return a plist node representing the result value node.
     */
    public NSObject getValue(String domain, String key) throws IOException {
        PlistRefOut plistOut = new PlistRefOut();
        try {
            checkResult(LibIMobileDevice.lockdownd_get_value(getRef(), domain, key, plistOut));
            PlistRef plist = plistOut.getValue();
            return PlistUtil.toJavaPlist(plist);
        } finally {
            plistOut.delete();
        }
    }
    
    protected final void checkDisposed() {
        if (ref == null) {
            throw new LibIMobileDeviceException("Already disposed");
        }
    }
    
    public synchronized void dispose() {
        checkDisposed();
        LibIMobileDevice.lockdownd_client_free(ref);
        ref = null;
    }
    
    @Override
    public void close() {
        dispose();
    }

    private static void checkResult(LockdowndError result) {
        if (result != LockdowndError.LOCKDOWN_E_SUCCESS) {
            throw new LibIMobileDeviceException(result.swigValue(), result.name());
        }
    }
}
