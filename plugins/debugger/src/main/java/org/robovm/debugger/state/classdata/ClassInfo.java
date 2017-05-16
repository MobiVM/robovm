package org.robovm.debugger.state.classdata;

/**
 * @author Demyan Kimitsa
 * base class for Class/Array/Primitive info
 */
public abstract class ClassInfo extends BaseModifiersInfo {

    /**
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

    public long clazzPtr() {
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

    public boolean isClass() {
        return type == Type.CLASS;
    }

    public abstract String signature();
    public abstract String superclassSignature();
    public abstract FieldInfo[] fields(ClassInfoLoader loader);
    public abstract MethodInfo[] methods(ClassInfoLoader loader);
    public abstract ClassInfo[] interfaces(ClassInfoLoader loader);
    public abstract boolean hasError();

    /**
     * Finds field info in class and super classes if not found
     * @param fieldName of field to get
     * @param loader to load field info if class is not loaded
     * @return
     */
    public FieldInfo getField(String fieldName, ClassInfoLoader loader) {
        ClassInfo ci = this;
        while (ci != null) {
            FieldInfo[] fields = ci.fields(loader);
            FieldInfo fi = null;
            if (fields != null) {
                for (FieldInfo fieldInfo : fields) {
                    if (fieldName.equals(fieldInfo.name())) {
                        return fieldInfo;
                    }
                }
            }

            ci = loader.classInfoBySignature(ci.superclassSignature());
        }

        return null;
    }

}
