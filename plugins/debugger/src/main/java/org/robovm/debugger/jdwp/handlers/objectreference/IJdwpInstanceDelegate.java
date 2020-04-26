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
package org.robovm.debugger.jdwp.handlers.objectreference;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.state.instances.VmClassInstance;
import org.robovm.debugger.state.instances.VmStringInstance;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 * Interface that describes operations around instance
 */
public interface IJdwpInstanceDelegate {
    VmStringInstance jdwpCreateStringInstance(String value);
    String jdwpGetStringValue(long stringRefId);

    void jdwpFieldGetValues(long objectId, long[] fields, boolean isStatic, DataBufferWriter output);
    void jdwpFieldSetValues(long objectId, int fieldsCount, boolean isStatic, DataBufferReader payload);

    /**
     * for given object finds it clazz object (creates if required)
     * @param objectId to get clazz object from
     * @return clazz object
     */
    VmClassInstance jdwpGetClazzObject(long objectId) throws DebuggerException;

    /**
     *  @param objectOrClassId class id or instance id
     * @param threadId thread to invoke on
     * @param methodId method to invoke
     * @param isStatic true if method is static
     * @param singleThread otherwise, all thread started
     * @param args values of arguments
     * @param output to write result and exception back
     */
    void jdwpInvokeMethod(long objectOrClassId, long threadId, long methodId, boolean isStatic,
                          boolean singleThread, Object[] args, DataBufferWriter output);
}
