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
package org.robovm.debugger.jdwp.handlers.eventrequest.events;

import org.robovm.debugger.state.classdata.ClassInfoImpl;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.utils.Converter;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 * JDWP data for class loaded
 */
public class JdwpClassLoadedEventData extends JdwpEventData {
    private final ClassInfoImpl classInfo;
    private final String className;

    public JdwpClassLoadedEventData(byte eventKind, VmThread thread, ClassInfoImpl classInfo) {
        super(eventKind, thread);
        this.classInfo = classInfo;
        this.className = makeClassName(classInfo);
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    protected void dumpCustomData(DataBufferWriter packet) {
        packet.writeByte(Converter.jdwpTypeTag(classInfo));
        packet.writeLong(classInfo.refId());
        packet.writeStringWithLen(classInfo.signature());
        packet.writeInt32(Converter.jdwpClassStatus(classInfo));
    }

    @Override
    public boolean cancelIfNotHandled() {
        // don't stop application if there is no interested instance in it
        return thread() != null;
    }

}
