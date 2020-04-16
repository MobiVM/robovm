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
package org.robovm.debugger.jdwp.handlers.array;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

/**
 * @author Demyan Kimitsa
 * Interface to debugger to support JDPW operations with array
 */
public interface IJdwpArrayDelegate {

    /**
     * returns the nubmer of components in a given array
     * @param arrayId instance ID of array
     * @return number of elements in array
     * @throws DebuggerException with JDWP error code if something went wrong
     */
    int jdwpArrayLength(long arrayId) throws DebuggerException;

    /**
     * returns a range of array components
     * @param arrayId instance ID of array
     * @param index the first index to retrieve
     * @param length the number of components to retrieve
     * @param writer packet buffer to dump JDWP data to
     * @throws DebuggerException with JDWP error code if something went wrong
     */
    void jdwpArrayGetValue(long arrayId, int index, int length, DataBufferWriter writer) throws DebuggerException;

    /**
     * Sets a range of array components
     * @param arrayId instance ID of array
     * @param index the first index to set
     * @param length the number of components to set
     * @param reader byte buffer reader to read data from
     * @throws DebuggerException with JDWP error code if something went wrong
     */
    void jdwpArraySetValue(long arrayId, int index, int length, DataBufferReader reader) throws DebuggerException;

    /**
     * creates new instance of array
     * @param arrayTypeId -- type of array to create
     * @param length -- number of elements to create
     * @return instance id of new array
     */
    long jdwpArrayCreateInstance(long arrayTypeId, int length);
}
