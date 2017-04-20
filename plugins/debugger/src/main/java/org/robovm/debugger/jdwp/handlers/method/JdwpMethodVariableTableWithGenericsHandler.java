package org.robovm.debugger.jdwp.handlers.method;

import org.robovm.debugger.state.VmDebuggerState;

/**
 * @author Demyan Kimitsa
 * Returns variable information for the method, including generic signatures for the variables. The variable table includes arguments and locals declared within the method.
 *
 * Implementation is same as JdwpMethodVariableTableHandler so just tell it to dump generics
 */
public class JdwpMethodVariableTableWithGenericsHandler extends JdwpMethodVariableTableHandler {

    public JdwpMethodVariableTableWithGenericsHandler(VmDebuggerState state) {
        super(state);
    }

    @Override
    protected boolean shallWriteEmptyGeneric() {
        return true;
    }

    @Override
    public byte getCommandSet() {
        return 6;
    }

    @Override
    public byte getCommand() {
        return 5;
    }

    @Override
    public String toString() {
        return "Method(6).VariableTableWithGenerics(5)";
    }

}
