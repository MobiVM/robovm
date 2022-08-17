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
import java.nio.ByteOrder;

/**
 * Handle a chunk of data sent from a DDM server.
 *
 * To handle a chunk type, sub-class {@link ChunkHandler} and register your class
 * with {@link DdmServer}.
 *
 * @hide
 */
@SystemApi(client = MODULE_LIBRARIES)
@libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
public abstract class ChunkHandler {

    /**
     * Byte order of the data in the chunk.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static final ByteOrder CHUNK_ORDER = ByteOrder.BIG_ENDIAN;

    /**
     * @hide
     */
    public static final int CHUNK_FAIL = type("FAIL");

    /**
     * Constructs chunk handler.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public ChunkHandler() {}

    /**
     * Called when the DDM server connects.  The handler is allowed to
     * send messages to the server.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public abstract void onConnected();

    /**
     * Called when the DDM server disconnects.  Can be used to disable
     * periodic transmissions or clean up saved state.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public abstract void onDisconnected();

    /**
     * Handle a single chunk of data.  {@code request} includes the type and
     * the chunk payload.
     *
     * Returns a response in a {@link Chunk}.
     *
     * @param request chunk type and payload
     * @return        {@link Chunk} with response
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public abstract Chunk handleChunk(Chunk request);

    /**
     * Create a FAIL chunk.  The {@link #handleChunk(Chunk)} methods can use this to
     * return an error message when they are not able to process a chunk.
     *
     * @param errorCode arbitrary number to distinguish error
     * @param msg       error message
     * @return          {@link Chunk} with response
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static Chunk createFailChunk(int errorCode, String msg) {
        if (msg == null)
            msg = "";

        ByteBuffer out = ByteBuffer.allocate(8 + msg.length() * 2);
        out.order(ChunkHandler.CHUNK_ORDER);
        out.putInt(errorCode);
        out.putInt(msg.length());
        final int len = msg.length();
        for (int i = 0; i < len; i++) {
            out.putChar(msg.charAt(i));
        }

        return new Chunk(CHUNK_FAIL, out);
    }

    /**
     * Utility function to wrap a {@link ByteBuffer} around a {@link Chunk}.
     *
     * @param request chunk to be wrapped
     * @return        {@link ByteBuffer} wrapping data from the given chunk
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static ByteBuffer wrapChunk(Chunk request) {
        ByteBuffer in;

        in = ByteBuffer.wrap(request.data, request.offset, request.length);
        in.order(CHUNK_ORDER);
        return in;
    }

    /**
     * Convert a 4-character string to a 32-bit type.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static int type(String typeName) {
        if (typeName.length() != 4) {
            throw new IllegalArgumentException("Bad type name: " + typeName);
        }
        int result = 0;
        for (int i = 0; i < 4; ++i) {
            result = ((result << 8) | (typeName.charAt(i) & 0xff));
        }
        return result;
    }

    /**
     * Convert an integer type to a 4-character string.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static String name(int type)
    {
        char[] ascii = new char[4];

        ascii[0] = (char) ((type >> 24) & 0xff);
        ascii[1] = (char) ((type >> 16) & 0xff);
        ascii[2] = (char) ((type >> 8) & 0xff);
        ascii[3] = (char) (type & 0xff);

        return new String(ascii);
    }
}
