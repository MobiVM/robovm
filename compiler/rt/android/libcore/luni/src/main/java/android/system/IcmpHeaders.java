/*
 * Copyright (C) 2016 The Android Open Source Project
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

import static android.system.OsConstants.ICMP6_ECHO_REQUEST;
import static android.system.OsConstants.ICMP_ECHO;

import java.io.FileDescriptor;
import java.net.SocketAddress;

/**
 * A utility class that can create ICMP header bytes corresponding to C's {@code struct icmphdr}
 * from linux/icmp.h and {@code struct icmp6hdr} from linux/icmpv6.h. The bytes can be passed to
 * methods like {@link Os#sendto(FileDescriptor, byte[], int, int, int, SocketAddress)}.
 *
 * @hide
 */
public final class IcmpHeaders {

    private IcmpHeaders() {}

    /**
     * Creates the header bytes for an {@link OsConstants#ICMP_ECHO} or
     * {@link OsConstants#ICMP6_ECHO_REQUEST} message. Code, checksum and identifier are left as
     * zeros.
     *
     * <pre>
     * 0                   1                   2                   3
     * 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1
     * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
     * |     Type      |     Code      |          Checksum             |
     * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
     * |           Identifier          |        Sequence Number        |
     * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
     * </pre>
     */
    public static byte[] createIcmpEchoHdr(boolean ipv4, int seq) {
        byte[] bytes = new byte[8];
        bytes[0] = ipv4 ? (byte) ICMP_ECHO : (byte) ICMP6_ECHO_REQUEST;
        // packet[1]: Code is always zero.
        // packet[2,3]: Checksum is computed by kernel.
        // packet[4,5]: ID (= port) inserted by kernel.
        bytes[6] = (byte) (seq >> 8);
        bytes[7] = (byte) seq;
        return bytes;
    }
}
