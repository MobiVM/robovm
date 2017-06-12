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
import org.robovm.debugger.state.refid.RefIdHolder;

/**
 * @author Demyan Kimitsa
 * Represent instance received from target
 */
public class VmInstance  implements RefIdHolder.IRefIdObject{
    private final long objectPtr;
    private final ClassInfo classInfo;
    private long refId;

    public VmInstance(long objectPtr, ClassInfo classInfo) {
        this.objectPtr = objectPtr;
        this.classInfo = classInfo;
    }

    @Override
    public void setRefId(long refId) {
        this.refId = refId;
    }

    @Override
    public long refId() {
        return refId;
    }

    public long objectPtr() {
        return objectPtr;
    }

    public ClassInfo classInfo() {
        return classInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VmInstance that = (VmInstance) o;

        if (objectPtr != that.objectPtr) return false;
        return refId == that.refId;
    }

    @Override
    public int hashCode() {
        int result = (int) (objectPtr ^ (objectPtr >>> 32));
        result = 31 * result + (int) (refId ^ (refId >>> 32));
        return result;
    }
}
