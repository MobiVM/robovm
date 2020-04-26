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
package org.robovm.debugger.jdwp.protocol;

import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 * Common interface for all JDWP request handlers
 */
public interface IJdwpRequestHandler {
    /**
     * method is called to process command in specific command set and return error code
     * that will go to reply message
     * @param payload from incoming request
     * @param output to put output data if any
     * @return error code of operation
     */
    short handle(DataBufferReader payload, DataBufferWriter output);

    /**
     * @return command set this handler is working in
     */
    byte getCommandSet();

    /**
     * @return command this handler handles
     */
    byte getCommand();
}
