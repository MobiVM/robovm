/*
 * Copyright (C) 2015 The Android Open Source Project
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
import android.compat.annotation.UnsupportedAppUsage;

import java.net.SocketAddress;
import libcore.util.Objects;

/**
 * Netlink socket address.
 *
 * Corresponds to Linux's {@code struct sockaddr_nl} from
 * <a href="https://github.com/torvalds/linux/blob/master/include/uapi/linux/netlink.h">&lt;linux/netlink.h&gt;</a>.
 *
 * Netlink socket address descirbes a netlink client is user space or in kernel.
 * A {@link NetlinkSocketAddress} can be either unicast (only sent to one peer)
 * or sent to netlink multicast groups ({@code nlGroupsMask} not equal 0).
 *
 * Any {@link NetlinkSocketAddress} is described by {@code nlPortId} and {@code nlGroupsMask}.
 *
 * {@code nlPortId} is the unicast address of netlink socket. It's always 0
 * if the destination is in the kernel. For a user-space process,
 * {@nlPortId} is usually the PID of the process owning the destination
 * socket. However, {@nlPortId} identifies a netlink socket, not a
 * process. If a process owns several netlink sockets, then {@nlPortId}
 * can be equal to the process ID only for at most one socket.
 *
 * {@code nlGroupsMask} is a bit mask with every bit representing a netlink
 * group number. The default value for this field is zero which means that
 * no multicasts will be received. A socket may multicast messages to any
 * of the multicast groups by setting {@code nlGroupsMask} to a bit mask of
 * the groups it wishes to send to.
 *
 * @hide
 */
@SystemApi(client = MODULE_LIBRARIES)
@libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
public final class NetlinkSocketAddress extends SocketAddress {
    /**
     * port ID
     *
     * @hide
     */
    private final int nlPortId;

    /**
     * multicast groups mask
     *
     * @hide
     */
    private final int nlGroupsMask;

    /**
     * @hide
     */
    // VisibleForTesting
    public NetlinkSocketAddress() {
        this(0, 0);
    }
    /**
     * @hide
     */
    // VisibleForTesting
    public NetlinkSocketAddress(int nlPortId) {
        this(nlPortId, 0);
    }

    /**
     * Constructs an instance with the given port id and groups mask.
     *
     * @param nlPortId     port id
     * @param nlGroupsMask groups mask
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public NetlinkSocketAddress(int nlPortId, int nlGroupsMask) {
        this.nlPortId = nlPortId;
        this.nlGroupsMask = nlGroupsMask;
    }

    /**
     * Returns this address's port id.
     *
     * @return port id
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public int getPortId() {
        return nlPortId;
    }

    /**
     * Returns this address's groups multicast mask.
     *
     * @return groups mask
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public int getGroupsMask() {
        return nlGroupsMask;
    }

    /**
     * @hide
     */
    @Override public String toString() {
      return Objects.toString(this);
    }
}
