package org.robovm.debugger.state.classdata;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.handlers.RefIdHolder;

/**
 * @author Demyan Kimitsa
 * refer to access.h
 * Class that provides modifier status  for fields/methods
 */
public abstract class BaseModifiersInfo implements RefIdHolder.IRefIdObject{
    private Integer modifiers;
    private long refId;

    public int modifiers() {
        return modifiersValue();
    }

    /**
     * Subclasses are responsible to convert internal presentation to Java ones
     * @return Individual flag values are defined in Chapter 4 of The Java Virtual Machine Specification.
     */
    protected abstract int convertModifiers();

    private int modifiersValue() {
        if (modifiers == null)
            modifiers = convertModifiers();
        return modifiers;
    }

    @Override
    public void setRefId(long refId) {
        this.refId = refId;
    }

    @Override
    public long getRefId() {
        return refId;
    }

    public boolean isPublic() {
        return (modifiersValue() & JdwpConsts.Modifiers.PUBLIC) != 0;
    }

    public boolean isPrivate() {
        return (modifiersValue() & JdwpConsts.Modifiers.PRIVATE) != 0;
    }

    public boolean isProtected() {
        return (modifiersValue() & JdwpConsts.Modifiers.PROTECTED) != 0;
    }

    public boolean isStatic() {
        return (modifiersValue() & JdwpConsts.Modifiers.STATIC) != 0;
    }

    public boolean isFinal() {
        return (modifiersValue() & JdwpConsts.Modifiers.FINAL) != 0;
    }

    public boolean isSuper() {
        return (modifiersValue() & JdwpConsts.Modifiers.SUPER) != 0;
    }

    public boolean isSynchronized() {
        return (modifiersValue() & JdwpConsts.Modifiers.SYNCHRONIZED) != 0;
    }

    public boolean isVolatile() {
        return (modifiersValue() & JdwpConsts.Modifiers.VOLATILE) != 0;
    }

    public boolean isBridge() {
        return (modifiersValue() & JdwpConsts.Modifiers.BRIDGE) != 0;
    }

    public boolean isVarargs() {
        return (modifiersValue() & JdwpConsts.Modifiers.VARARGS) != 0;
    }

    public boolean isTransient() {
        return (modifiersValue() & JdwpConsts.Modifiers.TRANSIENT) != 0;
    }

    public boolean isNative() {
        return (modifiersValue() & JdwpConsts.Modifiers.NATIVE) != 0;
    }

    public boolean isInterface() {
        return (modifiersValue() & JdwpConsts.Modifiers.INTERFACE) != 0;
    }

    public boolean isAbstract() {
        return (modifiersValue() & JdwpConsts.Modifiers.ABSTRACT) != 0;
    }

    public boolean isStrict() {
        return (modifiersValue() & JdwpConsts.Modifiers.STRICT) != 0;
    }

    public boolean isSynthetic() {
        return (modifiersValue() & JdwpConsts.Modifiers.SYNTHETIC) != 0;
    }

    public boolean isAnnotation() {
        return (modifiersValue() & JdwpConsts.Modifiers.ANNOTATION) != 0;
    }

    public boolean isEnum() {
        return (modifiersValue() & JdwpConsts.Modifiers.ENUM) != 0;
    }

    public boolean isPackagePrivate() {
        return !isPrivate() && !isProtected() && !isPublic();
    }

}
