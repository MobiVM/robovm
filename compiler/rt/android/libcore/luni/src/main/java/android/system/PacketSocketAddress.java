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
 * Packet socket address.
 *
 * Corresponds to Linux's {@code struct sockaddr_ll}.
 *
 * See <a href="https://man7.org/linux/man-pages/man7/packet.7.html">packet(7)</a>.
 *
 * @hide
 */
@SystemApi(client = MODULE_LIBRARIES)
@libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
public final class PacketSocketAddress extends SocketAddress {
    /**
     * Protocol. An Ethernet protocol type, e.g., {@link OsConstants#ETH_P_IPV6}.
     *
     * @hide
     */
    public final int sll_protocol;

    /**
     * Interface index.
     *
     * @hide
     */
    public final int sll_ifindex;

    /**
     * ARP hardware type. One of the {@code ARPHRD_*} constants, such as
     * {@link OsConstants#ARPHRD_ETHER}.
     *
     * @hide
     */
    public final int sll_hatype;

    /**
     * Packet type.
     *
     * @hide
     */
    public final int sll_pkttype;

    /**
     * Hardware address.
     *
     * @hide
     */
    public final byte[] sll_addr;

    /**
     * Constructs a new PacketSocketAddress. Used from native code.
     *
     * @hide
     */
    public PacketSocketAddress(int sll_protocol, int sll_ifindex, int sll_hatype, int sll_pkttype,
            byte[] sll_addr) {
        this.sll_protocol = sll_protocol;
        this.sll_ifindex = sll_ifindex;
        this.sll_hatype = sll_hatype;
        this.sll_pkttype = sll_pkttype;
        this.sll_addr = sll_addr;
    }

    /**
     * Constructs a new PacketSocketAddress with all the "in" parameters which
     * correspond to Linux's {@code struct sockaddr_ll}.
     *
     * See <a href="https://man7.org/linux/man-pages/man7/packet.7.html">packet(7)</a>.
     *
     * @param sll_protocol protocol field in {@code struct sockaddr_ll}
     * @param sll_ifindex  interface index number field in {@code struct sockaddr_ll}
     * @param sll_addr     physical-layer address field in {@code struct sockaddr_ll}
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public PacketSocketAddress(int sll_protocol, int sll_ifindex, byte[] sll_addr) {
        this.sll_protocol = sll_protocol;
        this.sll_ifindex = sll_ifindex;
        this.sll_hatype = 0;
        this.sll_pkttype = 0;
        this.sll_addr = sll_addr;
    }

    /**
     * Legacy constructor. Kept for @UnsupportedAppUsage only.
     *
     * @hide
     */
    @UnsupportedAppUsage
    public PacketSocketAddress(short sll_protocol, int sll_ifindex) {
        this.sll_protocol = sll_protocol;
        this.sll_ifindex = sll_ifindex;
        this.sll_hatype = 0;
        this.sll_pkttype = 0;
        this.sll_addr = null;
    }

    /**
     * Legacy constructor. Kept for @UnsupportedAppUsage only.
     *
     * @hide
     */
    @UnsupportedAppUsage
    public PacketSocketAddress(int sll_ifindex, byte[] sll_addr) {
        this.sll_protocol = 0;
        this.sll_ifindex = sll_ifindex;
        this.sll_hatype = 0;
        this.sll_pkttype = 0;
        this.sll_addr = sll_addr;
    }

    /**
     * @hide
     */
    @Override
    public String toString() {
        return Objects.toString(this);
    }
}
