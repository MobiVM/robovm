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
package org.robovm.debugger.jdwp.handlers.stackframe;

import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 * describes operations around stack frame and variables
 */
public interface IJdwpStackFrameDelegate {
    /**
     * reads frame local variables
     * @param threadId of thread
     * @param frameId stack frame to check variables in
     * @param varIndexes array of indexes
     * @param varTags array of variable tags
     * @param output to write variables to
     */
    void getFrameValues(long threadId, long frameId, int[] varIndexes, byte[] varTags, DataBufferWriter output);

    /**
     * sets frame local variables to values
     * @param threadId of thread
     * @param frameId stack frame to check variables in
     * @param payload JDWP byte packet with data to pick
     * @param count number of frame values to set
     */
    void setFrameValues(long threadId, long frameId, DataBufferReader payload, int count);

    /**
     * gets frame local variable by its name (actually to get this value only)
     * @param threadId of thread
     * @param frameId stack frame to check variables in
     * @param variableName of variable to fetch
     * @param output to write variable to
     */
    void getFrameVariable(long threadId, long frameId, String variableName, DataBufferWriter output);
}
