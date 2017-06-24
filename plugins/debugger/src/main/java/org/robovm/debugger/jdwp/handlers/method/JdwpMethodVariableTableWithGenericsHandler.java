/*
 * Copyright 2016 Justin Shapcott.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
