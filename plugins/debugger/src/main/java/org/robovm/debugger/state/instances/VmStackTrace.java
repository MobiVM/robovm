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
import org.robovm.debugger.state.classdata.MethodInfo;
import org.robovm.debugger.state.refid.RefIdHolder;

/**
 * @author Demyan Kimitsa
 * Represent stack trace converted from device one
 */
public class VmStackTrace implements RefIdHolder.IRefIdObject {
    private long refId;

    private final ClassInfo classInfo;
    private final MethodInfo methodInfo;
    private final int lineNumber;
    private final long fp;
    // PC offset from method impl start
    private final long pcoffset;

    public VmStackTrace(ClassInfo classInfo, MethodInfo methodInfo, int lineNumber, long fp, long pcoffset) {
        this.classInfo = classInfo;
        this.methodInfo = methodInfo;
        this.lineNumber = lineNumber;
        this.fp = fp;
        this.pcoffset = pcoffset;
    }

    public ClassInfo classInfo() {
        return classInfo;
    }

    public MethodInfo methodInfo() {
        return methodInfo;
    }

    public int lineNumber() {
        return lineNumber;
    }

    public long fp() {
        return fp;
    }

    public long pcoffset() {
        return pcoffset;
    }

    @Override
    public void setRefId(long refId) {
        this.refId = refId;
    }

    @Override
    public long refId() {
        return refId;
    }
}
