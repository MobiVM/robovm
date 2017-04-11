package org.robovm.debugger.jdwp.handlers.referencetype;

import org.robovm.debugger.state.VmDebuggerState;

/**
 * @author Demyan Kimitsa
 * Returns the JNI signature of a reference type along with the generic signature if there is one.
 */
public class JdwpRefTypeSignatureWithGenericHandler extends JdwpRefTypeSignatureHandler {

    public JdwpRefTypeSignatureWithGenericHandler(VmDebuggerState state) {
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
        return 13;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).SignatureWithGeneric(13)";
    }

}
