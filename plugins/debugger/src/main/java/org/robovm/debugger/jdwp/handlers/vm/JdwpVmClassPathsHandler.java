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
package org.robovm.debugger.jdwp.handlers.vm;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 * Retrieve the classpath and bootclasspath of the target VM. If the classpath is not defined, returns an empty list.
 * If the bootclasspath is not defined returns an empty list.
 */
public class JdwpVmClassPathsHandler implements IJdwpRequestHandler {
    @Override
    public short handle(DataBufferReader payload, DataBufferWriter output) {
        // base dir
        output.writeStringWithLen(".");
        // there is no class path
        output.writeInt32(0);
        // there is no boot class path
        output.writeInt32(0);

        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 1;
    }

    @Override
    public byte getCommand() {
        return 13;
    }

    @Override
    public String toString() {
        return "VirtualMachine(1).ClassPaths(13)";
    }
}
