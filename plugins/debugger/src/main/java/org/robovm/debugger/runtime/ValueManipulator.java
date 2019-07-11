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
package org.robovm.debugger.runtime;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;
import org.robovm.debugger.utils.bytebuffer.ByteBufferReader;

/**
 * @author Demyan Kimitsa
 * Value manipulator of different kinds
 */
public class ValueManipulator {

    protected interface Reader {
        Object read(ByteBufferReader reader);
    }

    protected interface Writer {
        void write(ByteBufferPacket writer, Object o);
    }

    // writes zeroes in case value is missing
    protected interface UndefinedWriter {
        void write(ByteBufferPacket writer);
    }

    protected interface ArrayReader {
        Object read(ByteBufferReader reader, int length);
    }

    private final Reader fromDevice;
    private final Reader fromJdwp;
    private final Writer toDevice;
    private final Writer toJdwp;
    private final UndefinedWriter toJdwpDefault;
    private final ArrayReader fromDeviceArray;

    protected ValueManipulator(Reader fromDevice, Reader fromJdwp, Writer toDevice, Writer toJdwp,
                               UndefinedWriter toJdwpDefault, ArrayReader fromDeviceArray) {
        this.fromDevice = fromDevice;
        this.fromJdwp = fromJdwp;
        this.toDevice = toDevice;
        this.toJdwp = toJdwp;
        this.toJdwpDefault = toJdwpDefault;
        this.fromDeviceArray = fromDeviceArray;
    }

    protected ValueManipulator(Reader reader, Writer writer, UndefinedWriter toJdwpDefault, ArrayReader fromDeviceArray) {
        this.fromDevice = reader;
        this.fromJdwp = reader;
        this.toDevice = writer;
        this.toJdwp = writer;
        this.toJdwpDefault = toJdwpDefault;
        this.fromDeviceArray = fromDeviceArray;
    }

    protected ValueManipulator(Reader reader, Writer writer, Writer jdwpWriter, UndefinedWriter toJdwpDefault, ArrayReader fromDeviceArray) {
        this.fromDevice = reader;
        this.fromJdwp = reader;
        this.toDevice = writer;
        this.toJdwp = jdwpWriter;
        this.toJdwpDefault = toJdwpDefault;
        this.fromDeviceArray = fromDeviceArray;
    }

    public Object readFromDevice(ByteBufferReader reader) {
        return fromDevice.read(reader);
    }

    public <T> T readArrayFromDevice(ByteBufferReader reader, int length) {
        //noinspection unchecked
        return (T)fromDeviceArray.read(reader, length);
    }

    public Object readFromJdwp(ByteBufferReader reader) {
        return fromJdwp.read(reader);
    }

    public void writeToDevice(ByteBufferPacket writer, Object o) {
        toDevice.write(writer, o);
    }

    public void writeToJdwp(ByteBufferPacket writer, Object o) {
        toJdwp.write(writer, o);
    }

    public void writeDefaultToJdwp(ByteBufferPacket writer) {
        toJdwpDefault.write(writer);
    }

    //
    // Implementation for manipulators of different kind
    //
    public static ValueManipulator Boolean = new ValueManipulator(
            ByteBufferReader::readBoolean,
            (writer, o) -> writer.writeBoolean((Boolean) o),
            (jdwpWriter, o) -> { jdwpWriter.writeByte(JdwpConsts.Tag.BOOLEAN); jdwpWriter.writeBoolean((Boolean) o); },
            (jdwpWriter) -> { jdwpWriter.writeByte(JdwpConsts.Tag.BOOLEAN); jdwpWriter.writeBoolean(false); },
            (reader, length) -> {
                boolean[] arr = new boolean[length];
                for (int idx = 0; idx < length; idx ++)
                    arr[idx] = reader.readBoolean();
                return arr;
            });

    public static ValueManipulator Byte = new ValueManipulator(
            ByteBufferReader::readByte,
            (writer, o) -> writer.writeByte((Byte)o),
            (jdwpWriter, o) -> { jdwpWriter.writeByte(JdwpConsts.Tag.BYTE); jdwpWriter.writeByte((Byte)o);},
            (jdwpWriter) -> { jdwpWriter.writeByte(JdwpConsts.Tag.BYTE); jdwpWriter.writeByte((byte)0);},
            (reader, length) -> {
                byte[] arr = new byte[length];
                for (int idx = 0; idx < length; idx ++)
                    arr[idx] = reader.readByte();
                return arr;
            });

    public static ValueManipulator Character = new ValueManipulator(
            ByteBufferReader::readChar16,
            (writer, o) -> writer.writeChar16((Character)o),
            (jdwpWriter, o) -> { jdwpWriter.writeByte(JdwpConsts.Tag.CHAR); jdwpWriter.writeChar16((Character)o);},
            (jdwpWriter) -> { jdwpWriter.writeByte(JdwpConsts.Tag.CHAR); jdwpWriter.writeChar16((char)0);},
            (reader, length) -> {
                char[] arr = new char[length];
                for (int idx = 0; idx < length; idx ++)
                    arr[idx] = reader.readChar16();
                return arr;
            });

    public static ValueManipulator Short = new ValueManipulator(
            ByteBufferReader::readInt16,
            (writer, o) -> writer.writeInt16((Short)o),
            (jdwpWriter, o) -> { jdwpWriter.writeByte(JdwpConsts.Tag.SHORT); jdwpWriter.writeInt16((Short)o);},
            (jdwpWriter) -> { jdwpWriter.writeByte(JdwpConsts.Tag.SHORT); jdwpWriter.writeInt16((short)0);},
            (reader, length) -> {
                short[] arr = new short[length];
                for (int idx = 0; idx < length; idx ++)
                    arr[idx] = reader.readInt16();
                return arr;
            });

    public static ValueManipulator Integer = new ValueManipulator(
            ByteBufferReader::readInt32,
            (writer, o) -> writer.writeInt32((Integer)o),
            (jdwpWriter, o) -> { jdwpWriter.writeByte(JdwpConsts.Tag.INT); jdwpWriter.writeInt32((Integer)o);},
            (jdwpWriter) -> { jdwpWriter.writeByte(JdwpConsts.Tag.INT); jdwpWriter.writeInt32(0);},
            (reader, length) -> {
                int[] arr = new int[length];
                for (int idx = 0; idx < length; idx ++)
                    arr[idx] = reader.readInt32();
                return arr;
            });

    public static ValueManipulator Long = new ValueManipulator(
            ByteBufferReader::readLong,
            (writer, o) -> writer.writeLong((Long)o),
            (jdwpWriter, o) -> { jdwpWriter.writeByte(JdwpConsts.Tag.LONG); jdwpWriter.writeLong((Long)o);},
            (jdwpWriter) -> { jdwpWriter.writeByte(JdwpConsts.Tag.LONG); jdwpWriter.writeLong(0L);},
            (reader, length) -> {
                long[] arr = new long[length];
                for (int idx = 0; idx < length; idx ++)
                    arr[idx] = reader.readLong();
                return arr;
            });

    public static ValueManipulator Float = new ValueManipulator(
            ByteBufferReader::readFloat,
            (writer, o) -> writer.writeFloat((Float)o),
            (jdwpWriter, o) -> { jdwpWriter.writeByte(JdwpConsts.Tag.FLOAT); jdwpWriter.writeFloat((Float) o);},
            (jdwpWriter) -> { jdwpWriter.writeByte(JdwpConsts.Tag.FLOAT); jdwpWriter.writeFloat(0.0f);},
            (reader, length) -> {
                float[] arr = new float[length];
                for (int idx = 0; idx < length; idx ++)
                    arr[idx] = reader.readFloat();
                return arr;
            });

    public static ValueManipulator Double = new ValueManipulator(
            ByteBufferReader::readDouble,
            (writer, o) -> writer.writeDouble((Double)o),
            (jdwpWriter, o) -> { jdwpWriter.writeByte(JdwpConsts.Tag.DOUBLE); jdwpWriter.writeDouble((Double) o);},
            (jdwpWriter) -> { jdwpWriter.writeByte(JdwpConsts.Tag.DOUBLE); jdwpWriter.writeDouble(0.0);},
            (reader, length) -> {
                double[] arr = new double[length];
                for (int idx = 0; idx < length; idx ++)
                    arr[idx] = reader.readDouble();
                return arr;
            });

    public static ValueManipulator Void = new ValueManipulator(
            reader -> {throw new DebuggerException("invalid access for type VOID");},
            (writer, o) -> {throw new DebuggerException("invalid access for type VOID");},
            (writer) -> {throw new DebuggerException("invalid access for type VOID");},
            (reader, length) -> {throw new DebuggerException("invalid access for type VOID");});
}
