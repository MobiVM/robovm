package org.robovm.debugger.state.classdata;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.runtime.ValueManipulator;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;
import org.robovm.debugger.utils.bytebuffer.ByteBufferReader;

/**
 * @author Demyan Kimitsa
 * Reperesents primitive types
*/
public class ClassInfoPrimitiveImpl extends ClassInfo {
    private final String signature;
    private final int size;
    private final ValueManipulator manipulator;

    public ClassInfoPrimitiveImpl(String signature, long clazzPtr, int size, ValueManipulator manipulator) {
        super(Type.PRIMITIVE);
        this.signature = signature;
        this.size = size;
        this.manipulator = manipulator;

        setClazzPtr(clazzPtr);
    }

    public int size() {
        return size;
    }

    public ValueManipulator manipulator() {
        return manipulator;
    }

    @Override
    public String signature() {
        return signature;
    }

    @Override
    public FieldInfo[] fields(ClassInfoLoader loader) {
        // there is no fields to report in array
        return new FieldInfo[0];
    }

    @Override
    public MethodInfo[] methods(ClassInfoLoader loader) {
        // there is no methods to report in array
        return new MethodInfo[0];
    }

    @Override
    public ClassInfo[] interfaces(ClassInfoLoader loader) {
        // there is interface in primitive classes
        return new ClassInfo[0];
    }

    @Override
    public boolean hasError() {
        return false;
    }

    @Override
    protected int convertModifiers() {
        // check class.c#createArrayClass
        // ACC_PUBLIC, ACC_PRIVATE, ACC_PROTECTED are in the 3 least significant bits
        return JdwpConsts.Modifiers.PUBLIC;
    }



    private interface TargetReader {
        Object read(ByteBufferReader reader);
    }

    private interface TargetWritter {
        void write(ByteBufferPacket packet, Object value);
    }

    private interface JdwpWritter {
        void write(ByteBufferPacket packet, Object value);
    }


}
