package org.robovm.debugger.jdwp.handlers.referencetype;

import org.robovm.debugger.state.VmDebuggerState;

/**
 * @author Demyan Kimitsa
 * Returns information, including the generic signature if any, for each method in a reference type. Inherited methodss are not included.
 */
public class JdwpRefTypeMethodsWithGenericHandler extends JdwpRefTypeMethodsHandler {
    public JdwpRefTypeMethodsWithGenericHandler(VmDebuggerState state) {
        super(state);
    }

    @Override
    protected String getGenericSignature() {
        // return empty string just to have this string to be reported
        return "";
    }

    @Override
    public byte getCommandSet() {
        return 2;
    }

    @Override
    public byte getCommand() {
        return 15;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).MethodsWithGeneric(15)";
    }

}
