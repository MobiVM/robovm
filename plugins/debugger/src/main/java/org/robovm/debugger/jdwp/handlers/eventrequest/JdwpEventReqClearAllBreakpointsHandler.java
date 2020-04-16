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
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 * Removes all set breakpoints, a no-op if there are no breakpoints set.
 */
public class JdwpEventReqClearAllBreakpointsHandler implements IJdwpRequestHandler {

    private final IJdwpEventDelegate center;

    public JdwpEventReqClearAllBreakpointsHandler(IJdwpEventDelegate center) {
        this.center = center;
    }

    @Override
    public short handle(DataBufferReader payload, DataBufferWriter output) {
        center.jdwpClearAllBreakpoints();
        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 15;
    }

    @Override
    public byte getCommand() {
        return 3;
    }

    @Override
    public String toString() {
        return "EventRequest(15).ClearAllBreakpoints(3)";
    }
}
