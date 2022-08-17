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

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * Corresponds to C's {@code struct cmsghdr}.
 *
 */
public final class StructCmsghdr {
    /** Originating protocol */
    public final int cmsg_level;

    /** Protocol-specific type */
    public final int cmsg_type;

    /** message data sent/received */
    @NonNull public final byte[] cmsg_data;

    public StructCmsghdr(int cmsg_level, int cmsg_type, short value) {
        // Short.Size unit is bits, ByteBuffer data unit is bytes
        ByteBuffer buf = ByteBuffer.allocate(Short.SIZE / 8);
        buf.order(ByteOrder.nativeOrder());
        buf.putShort(value);

        this.cmsg_level = cmsg_level;
        this.cmsg_type = cmsg_type;
        this.cmsg_data = buf.array();
    }

    public StructCmsghdr(int cmsg_level, int cmsg_type, @NonNull byte[] value) {
        this.cmsg_level = cmsg_level;
        this.cmsg_type = cmsg_type;
        this.cmsg_data = value;
    }

}
