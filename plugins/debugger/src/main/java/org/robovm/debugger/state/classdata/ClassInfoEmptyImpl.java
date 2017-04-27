package org.robovm.debugger.state.classdata;

/**
 * @author Demyan Kimitsa
 * empty class info implementation that is used just to return expected type
 */
public class ClassInfoEmptyImpl extends ClassInfo {
    public ClassInfoEmptyImpl(Type type) {
        super(type);
    }

    @Override
    protected int convertModifiers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String signature() {
        throw new UnsupportedOperationException();
    }

    @Override
    public FieldInfo[] fields(ClassInfoLoader loader) {
        throw new UnsupportedOperationException();
    }

    @Override
    public MethodInfo[] methods(ClassInfoLoader loader) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ClassInfo[] interfaces(ClassInfoLoader loader) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasError() {
        throw new UnsupportedOperationException();
    }
}
