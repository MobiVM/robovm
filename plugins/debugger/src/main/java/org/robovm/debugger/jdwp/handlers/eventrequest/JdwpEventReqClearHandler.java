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
package org.robovm.debugger.jdwp.handlers.eventrequest;

import org.robovm.debugger.jdwp.handlers.eventrequest.events.IJdwpEventDelegate;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 * Clear an event request.
 */
public class JdwpEventReqClearHandler implements IJdwpRequestHandler {

    private final IJdwpEventDelegate center;

    public JdwpEventReqClearHandler(IJdwpEventDelegate center) {
        this.center = center;
    }

    @Override
    public short handle(DataBufferReader payload, DataBufferWriter output) {
        byte eventKind = payload.readByte();
        int requestID = payload.readInt32();
        return center.jdwpClearEventRequest(eventKind, requestID);
    }

    @Override
    public byte getCommandSet() {
        return 15;
    }

    @Override
    public byte getCommand() {
        return 2;
    }

    @Override
    public String toString() {
        return "EventRequest(15).Clear(2)";
    }
}
