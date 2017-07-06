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
package org.robovm.debugger.state.instances;

import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.classdata.ClassInfoArrayImpl;

/**
 * @author Demyan Kimitsa
 * Instance for array type
 */
public class VmArrayInstance extends VmInstance {
    private final int length;
    private final long dataPtr;

    public VmArrayInstance(long objectPtr, ClassInfoArrayImpl classInfo, int length, long dataPtr) {
        super(objectPtr, classInfo);
        this.length = length;
        this.dataPtr = dataPtr;
    }

    public int length() {
        return length;
    }

    public long dataPtr() {
        return dataPtr;
    }

    public ClassInfo elementType() {
        return ((ClassInfoArrayImpl)classInfo()).elementType();
    }
}
