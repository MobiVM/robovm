package org.robovm.debugger.jdwp.handlers.referencetype;

import org.robovm.debugger.state.VmDebuggerState;

/**
 * @author Demyan Kimitsa
 * Returns information, including the generic signature if any, for each field in a reference type. Inherited fields are not included.
 */
public class JdwpRefTypeFieldsWithGenericHandler extends JdwpRefTypeFieldsHandler {
    public JdwpRefTypeFieldsWithGenericHandler(VmDebuggerState state) {
        super(state);
    }

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
        return 14;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).FieldsWithGeneric(14)";
    }

}
