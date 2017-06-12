/*
 * Copyright 2016 Justin Shapcott.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.debugger.utils.bytebuffer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.nio.ByteBuffer;

/**
 * @author Demyan Kimitsa
 * Simple byte buffer logger for communication channel dumps
 */
public class ByteBufferLogger {
    private static PrintStream ps = null;
    private final byte eventType;

    public static void enableDumps(File logFile) throws FileNotFoundException {
        ps = new PrintStream(logFile);
    }

    public ByteBufferLogger(byte eventType) {
        this.eventType = eventType;
    }


    public void log(ByteBuffer buffer) {
        dump (this.eventType, buffer);
    }

    public static void dump(byte eventType, ByteBuffer buffer) {
        if (ps == null)
            return;

        synchronized (ByteBufferLogger.class) {
            try {
                ps.print(Long.toString(System.nanoTime()));
                ps.print('-');
                ps.print(Byte.toString(eventType));
                ps.print('-');
                ps.println(toHex(buffer));
            } catch (Throwable ignore) {
            }
        }
    }

    private static final char[] HEX = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static char[] toHex(ByteBuffer buffer) {
        int bufferSize = buffer.position() + buffer.remaining();
        char[] chars = new char[bufferSize * 2];
        for (int idx = 0; idx < bufferSize; idx ++) {
            byte b = buffer.get(idx);
            chars[idx * 2] = HEX[b >> 4];
            chars[idx * 2 +  2] = HEX[b & 0x0f];
        }

        return chars;
    }
}
