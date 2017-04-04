package org.robovm.debugger.state.classdata;

import org.robovm.debugger.jdwp.JdwpConsts;

/**
 * @author Demyan Kimitsa
 * Reperesents primitive types
*/
public class ClassInfoPrimitiveImpl extends ClassInfo {
    private final String signature;

    public ClassInfoPrimitiveImpl(String signature, long clazzPtr) {
        super(Type.PRIMITIVE);
        this.signature = signature;
        setClazzPtr(clazzPtr);
    }

    @Override
    public String getSignature() {
        return signature;
    }

    @Override
    public FieldInfo[] fields(ClassInfoLoader loader) {
        // there is no fields to report in array
        return null;
    }

    @Override
    public MethodInfo[] methods(ClassInfoLoader loader) {
        // there is no methods to report in array
        return null;
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
}
