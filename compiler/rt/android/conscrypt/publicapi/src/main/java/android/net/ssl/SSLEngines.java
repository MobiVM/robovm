/*
 * Copyright (C) 2018 The Android Open Source Project
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

package android.net.ssl;

import com.android.org.conscrypt.Conscrypt;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;
import libcore.util.NonNull;
import libcore.util.Nullable;

/**
 * Static utility methods for accessing additional functionality of supported instances of
 * {@link SSLEngine}.  Engines from the platform TLS provider will be compatible with all
 * methods in this class.
 */
public class SSLEngines {
    private SSLEngines() {}

    /**
     * Returns whether the given engine can be used with the methods in this class.  In general,
     * only engines from the platform TLS provider are supported.
     */
    public static boolean isSupportedEngine(@NonNull SSLEngine engine) {
        return Conscrypt.isConscrypt(engine);
    }

    private static void checkSupported(@NonNull SSLEngine e) {
        if (!isSupportedEngine(e)) {
            throw new IllegalArgumentException("Engine is not a supported engine.");
        }
    }

    /**
     * Enables or disables the use of session tickets.
     *
     * <p>This function must be called before the handshake is started or it will have no effect.
     *
     * @param engine the engine
     * @param useSessionTickets whether to enable or disable the use of session tickets
     * @throws IllegalArgumentException if the given engine is not a platform engine
     */
    public static void setUseSessionTickets(@NonNull SSLEngine engine, boolean useSessionTickets) {
        checkSupported(engine);
        Conscrypt.setUseSessionTickets(engine, useSessionTickets);
    }

    /**
     * Exports a value derived from the TLS master secret as described in RFC 5705.
     *
     * A number of protocols leverage Transport Layer Security (TLS) to perform key
     * establishment but then use some of the keying material for their own purposes.
     *
     * This method allows an application to export keying material from a TLS connection.
     * The exported material will be the same on the client and server if they pass in
     * the same values for {@code label} and {@code context}.  See RFC 5705 for further
     * details.
     *
     * @param engine the engine to use for exporting keying material
     * @param label the label to use in calculating the exported value.  This must be
     * an ASCII-only string.
     * @param context the application-specific context value to use in calculating the
     * exported value.  This may be {@code null} to use no application context, which is
     * treated differently than an empty byte array.
     * @param length the number of bytes of keying material to return.
     * @return a value of the specified length, or {@code null} if the handshake has not yet
     * completed or the connection has been closed.
     * @throws SSLException if the value could not be exported.
     */
    @Nullable
    public static byte[] exportKeyingMaterial(@NonNull SSLEngine engine, @NonNull String label,
            @Nullable byte[] context, int length) throws SSLException {
        checkSupported(engine);
        return Conscrypt.exportKeyingMaterial(engine, label, context, length);
    }
}
