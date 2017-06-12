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
