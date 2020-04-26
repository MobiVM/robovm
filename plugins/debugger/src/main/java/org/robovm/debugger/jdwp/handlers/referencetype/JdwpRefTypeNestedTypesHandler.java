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
package org.robovm.debugger.jdwp.handlers.referencetype;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 * Returns the classes and interfaces directly nested within this type.Types further nested within those types are not included.
 */
public class JdwpRefTypeNestedTypesHandler implements IJdwpRequestHandler {
    @Override
    public short handle(DataBufferReader payload, DataBufferWriter output) {
        // TODO: there is no direct way to get this information, the only option would be
        // to scan all class names and to check by prefix
        return JdwpConsts.Error.ABSENT_INFORMATION;
    }

    @Override
    public byte getCommandSet() {
        return 2;
    }

    @Override
    public byte getCommand() {
        return 8;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).NestedTypes(8)";
    }

}
