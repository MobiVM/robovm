package org.robovm.debugger.jdwp.handlers.classtype;

import org.robovm.debugger.jdwp.handlers.objectreference.IJdwpInstanceDelegate;

/**
 * @author Demyan Kimitsa
 * Creates a new object of this type, invoking the specified constructor. The constructor method ID must be a member of the class type.
 *
 * Format and functionality is same as in JdwpClassTypeInvokeMethodHandler,
 * the only moment is that constructor signature defined to return void, e.g. ()V so
 * instance handler shall do this workaround check to setup proper return type
 */
public class JdwpClassTypeNewInstanceHandler extends JdwpClassTypeInvokeMethodHandler {

    public JdwpClassTypeNewInstanceHandler(IJdwpInstanceDelegate delegate) {
        super(delegate);
    }

    @Override
    public byte getCommandSet() {
        return 3;
    }

    @Override
    public byte getCommand() {
        return 4;
    }

    @Override
    public String toString() {
        return "ClassType(3).NewInstance(4)";
    }

}
