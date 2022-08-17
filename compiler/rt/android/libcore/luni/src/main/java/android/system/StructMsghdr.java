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

import libcore.util.NonNull;
import libcore.util.Nullable;

import java.net.SocketAddress;
import java.nio.ByteBuffer;

/**
 * Corresponds to C's {@code struct msghdr}
 *
 */
public final class StructMsghdr{
    /**
     * Optional address.
     * <p>Sendmsg: Caller must populate to specify the target address for a datagram, or pass
     * {@code null} to send to the destination of an already-connected socket.
     * Recvmsg: Populated by the system to specify the source address.
     */
    @Nullable public SocketAddress msg_name;

    /** Scatter/gather array */
    @NonNull public final ByteBuffer[] msg_iov;

    /** Ancillary data */
    @Nullable public StructCmsghdr[] msg_control;

    /** Flags on received message. */
    public int msg_flags;

    /**
     * Constructs an instance with the given field values
     */
    public StructMsghdr(@Nullable SocketAddress msg_name, @NonNull ByteBuffer[] msg_iov,
                        @Nullable StructCmsghdr[] msg_control, int msg_flags) {
        this.msg_name = msg_name;
        this.msg_iov = msg_iov;
        this.msg_control = msg_control;
        this.msg_flags = msg_flags;
    }
}
