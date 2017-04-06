package org.robovm.debugger.runtime;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.state.instances.VmInstance;
import org.robovm.debugger.state.refid.InstanceRefIdHolder;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;
import org.robovm.debugger.utils.bytebuffer.ByteBufferReader;

/**
 * @author Demyan Kimitsa
 * Value manipulator of different kinds
 */
public class ValueManipulator {

    private interface Reader {
        Object read(ByteBufferReader reader);
    }

    private interface Writer {
        void write(ByteBufferPacket writer, Object o);
    }

    private final Reader fromDevice;
    private final Reader fromJdwp;
    private final Writer toDevice;
    private final Writer toJdwp;

    protected ValueManipulator(Reader fromDevice, Reader fromJdwp, Writer toDevice, Writer toJdwp) {
        this.fromDevice = fromDevice;
        this.fromJdwp = fromJdwp;
        this.toDevice = toDevice;
        this.toJdwp = toJdwp;
    }

    protected ValueManipulator(Reader reader, Writer writer) {
        this.fromDevice = reader;
        this.fromJdwp = reader;
        this.toDevice = writer;
        this.toJdwp = writer;
    }

    protected ValueManipulator(Reader reader, Writer writer, Writer jdwpWriter) {
        this.fromDevice = reader;
        this.fromJdwp = reader;
        this.toDevice = writer;
        this.toJdwp = jdwpWriter;
    }

    public Object readFromDevice(ByteBufferReader reader) {
        return fromDevice.read(reader);
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

    //
    // Implementation for manipulators of different kind
    //
    public static ValueManipulator Boolean = new ValueManipulator(
            reader -> reader.readBoolean(),
            (writer, o) -> writer.writeBoolean((Boolean)o),
            (jdwpWriter, o) -> { jdwpWriter.writeByte(JdwpConsts.Tag.BOOLEAN); jdwpWriter.writeBoolean((Boolean)o);});

    public static ValueManipulator Byte = new ValueManipulator(
            reader -> reader.readByte(),
            (writer, o) -> writer.writeByte((Byte)o),
            (jdwpWriter, o) -> { jdwpWriter.writeByte(JdwpConsts.Tag.BYTE); jdwpWriter.writeByte((Byte)o);});

    public static ValueManipulator Character = new ValueManipulator(
            reader -> reader.readChar16(),
            (writer, o) -> writer.writeChar16((Character)o),
            (jdwpWriter, o) -> { jdwpWriter.writeByte(JdwpConsts.Tag.CHAR); jdwpWriter.writeChar16((Character)o);});

    public static ValueManipulator Short = new ValueManipulator(
            reader -> reader.readInt16(),
            (writer, o) -> writer.writeInt16((Short)o),
            (jdwpWriter, o) -> { jdwpWriter.writeByte(JdwpConsts.Tag.SHORT); jdwpWriter.writeInt16((Short)o);});

    public static ValueManipulator Integer = new ValueManipulator(
            reader -> reader.readInt32(),
            (writer, o) -> writer.writeInt32((Integer)o),
            (jdwpWriter, o) -> { jdwpWriter.writeByte(JdwpConsts.Tag.INT); jdwpWriter.writeInt32((Integer)o);});

    public static ValueManipulator Long = new ValueManipulator(
            reader -> reader.readLong(),
            (writer, o) -> writer.writeLong((Long)o),
            (jdwpWriter, o) -> { jdwpWriter.writeByte(JdwpConsts.Tag.LONG); jdwpWriter.writeLong((Long)o);});

    public static ValueManipulator Float = new ValueManipulator(
            reader -> reader.readFloat(),
            (writer, o) -> writer.writeFloat((Float)o),
            (jdwpWriter, o) -> { jdwpWriter.writeByte(JdwpConsts.Tag.FLOAT); jdwpWriter.writeFloat((Float) o);});

    public static ValueManipulator Double = new ValueManipulator(
            reader -> reader.readDouble(),
            (writer, o) -> writer.writeDouble((Double)o),
            (jdwpWriter, o) -> { jdwpWriter.writeByte(JdwpConsts.Tag.DOUBLE); jdwpWriter.writeDouble((Double) o);});

    public static ValueManipulator Void = new ValueManipulator(
            reader -> {throw new DebuggerException("invalid access for type VOID");},
            (writer, o) -> {throw new DebuggerException("invalid access for type VOID");});


    /**
     * Special subclass for object manipulations
     */
    public static class ObjectValueManipulator extends ValueManipulator {
        private final InstanceRefIdHolder refIdHolder;

        public ObjectValueManipulator(InstanceRefIdHolder refIdHolder) {
            super(
                    fromDevice -> {
                        long ptr = fromDevice.readLong();
                        return ptr != 0 ? refIdHolder.instanceByAddr(ptr) : null;
                    },
                    fromJdwp -> {
                        long refId = fromJdwp.readLong();
                        return refId != 0 ? refIdHolder.objectById(refId) : null;
                    },
                    (writer, o) -> {
                        VmInstance instance = (VmInstance) o;
                        writer.writeLong(instance != null ? instance.objectPtr() : 0);
                    },
                    (jdwpWriter, o) -> {
                        VmInstance instance = (VmInstance) o;
                        jdwpWriter.writeByte(JdwpConsts.Tag.OBJECT);
                        jdwpWriter.writeLong(instance != null ? instance.refId() : 0);
                    });
            this.refIdHolder = refIdHolder;
        }
    }
}
