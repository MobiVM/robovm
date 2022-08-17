/*
 * Copyright (C) 2021 The Android Open Source Project
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

package android.system;

import static android.annotation.SystemApi.Client.MODULE_LIBRARIES;

import android.annotation.SystemApi;

import java.net.SocketAddress;
import libcore.api.CorePlatformApi;
import libcore.util.Objects;

/**
 * A virtio-vsock address {@link VmSocketAddress}.
 *
 * <p>
 * virtio-vsock socket address, linux specific.
 *
 * <p>
 * {@link VmSocketAddress} corresponds to {@code struct sockaddr_vm} in
 * bionic/libc/kernel/uapi/linux/vm_sockets.h.
 *
 * <p>
 * Currently virtio-vsock is used as a generic purpose pipe in emulators
 * to talk to the host.
 *
 * @see <a href="https://man7.org/linux/man-pages/man7/vsock.7.html">vsock(7)</a>
 * @hide
 */
@SystemApi(client = MODULE_LIBRARIES)
@libcore.api.CorePlatformApi(status = CorePlatformApi.Status.STABLE)
public final class VmSocketAddress extends SocketAddress {
    /**
      * sockaddr_vm::svmPort, see {@code struct sockaddr_vm} in
      * bionic/libc/kernel/uapi/linux/vm_sockets.h for more details.
      */
    private int svmPort;

    /**
      * sockaddr_vm::svmCid, see {@code struct sockaddr_vm} in
      * bionic/libc/kernel/uapi/linux/vm_sockets.h for more details.
      */
    private int svmCid;

    /**
     * Creates a new instance of VmSocketAddress.
     *
     * @param svmPort      The svmPort field value,
     *                     see {@link OsConstants.VMADDR_PORT_ANY}.
     * @param svmCid       The svmCid field value,
     *                     see OsConstants.VMADDR_CID_* for VMADDR_CID_* values.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    public VmSocketAddress(int svmPort, int svmCid) {
        this.svmPort = svmPort;
        this.svmCid = svmCid;
    }

    /**
     * Returns the value of the svmPort field
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    public int getSvmPort() {
        return svmPort;
    }

    /**
     * Returns the value of the svmCid field
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = CorePlatformApi.Status.STABLE)
    public int getSvmCid() {
        return svmCid;
    }
}
