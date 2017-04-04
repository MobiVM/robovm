package org.robovm.debugger.state.classdata;

/**
 * @author Demyan Kimitsa
 * Reperesents array class info
 * This infor is created at runtime from signature
 * refer class.c#createArrayClass
 */
public class ClassInfoArrayImpl extends ClassInfo {
    private final String signature;
    private final ClassInfo elementType;
    private ClassInfo[] interfaces;
    private FieldInfo[] fields;
    private MethodInfo[] methods;

    // out of header position
    private int endOfHeaderPos;

    public ClassInfoArrayImpl(String signature, ClassInfo elementType) {
        super(Type.ARRAY);
        this.signature = signature;
        this.elementType = elementType;
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
        return elementType.convertModifiers() & 7;
    }
}
