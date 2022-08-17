/*
 * Copyright (C) 2007 The Android Open Source Project
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

package org.apache.harmony.dalvik.ddmc;

import static android.annotation.SystemApi.Client.MODULE_LIBRARIES;

import android.annotation.SystemApi;
import android.compat.annotation.UnsupportedAppUsage;
import java.nio.ByteBuffer;

/**
 * A chunk of DDM data.  This is really just meant to hold a few pieces
 * of data together.
 *
 * The "offset" and "length" fields are present so handlers can over-allocate
 * or share byte buffers.
 *
 * @hide
 */
@SystemApi(client = MODULE_LIBRARIES)
@libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
public class Chunk {

    /**
     * Public members.  Do not rename without updating the VM.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public int type;                // chunk type
    /**
     * @hide
     */
    public byte[] data;             // chunk data
    /**
     * @hide
     */
    public int offset;              // position within "dataf"

    /**
     * @hide
     */
    public int length;

    /**
     * Blank constructor.  Fill in your own fields.
     *
     * @hide
     */
    public Chunk() {}

    /**
     * Constructor with all fields.
     *
     * @param type   chunk type
     * @param data   chunk data
     * @param offset offset in {@code data} where actual data starts from
     * @param length length of the {@code data}
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public Chunk(int type, byte[] data, int offset, int length) {
        this.type = type;
        this.data = data;
        this.offset = offset;
        this.length = length;
    }

    /**
     * Construct from a {@link ByteBuffer}.  The chunk is assumed to start at
     * offset 0 and continue to the current position.
     *
     * @param type chunk type
     * @param buf  {@link ByteBuffer} containing chunk data
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public Chunk(int type, ByteBuffer buf) {
        this.type = type;

        this.data = buf.array();
        this.offset = buf.arrayOffset();
        this.length = buf.position();
    }
}
