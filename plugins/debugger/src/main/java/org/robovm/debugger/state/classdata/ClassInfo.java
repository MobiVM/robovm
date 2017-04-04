package org.robovm.debugger.state.classdata;

/**
 * @author Demyan Kimitsa
 * base class for Class/Array/Primitive info
 */
public abstract class ClassInfo extends BaseModifiersInfo {

    /**
     * @author Demyan Kimitsa
     * specifies type of class/array/primitive information structure
     */
    public enum Type {
        CLASS,
        ARRAY,
        PRIMITIVE
    }

    /** specifies type of data this entry is attached to  */
    private final Type type;

    /** clazz ptr once loaded */
    private long clazzPtr;

    public ClassInfo(Type type) {
        this.type = type;
    }

    public long getClazzPtr() {
        return clazzPtr;
    }

    public void setClazzPtr(long clazzPtr) {
        this.clazzPtr = clazzPtr;
    }

    public boolean isArray() {
        return type == Type.ARRAY;
    }

    public boolean isPrimitive() {
        return type == Type.PRIMITIVE;
    }

    public abstract String getSignature();
    public abstract FieldInfo[] fields(ClassInfoLoader loader);
    public abstract MethodInfo[] methods(ClassInfoLoader loader);
    public abstract boolean hasError();

}
