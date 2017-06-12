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
package org.robovm.debugger.state;

import org.robovm.compiler.config.Arch;
import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.JdwpEventRequest;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.classdata.ClassInfoLoader;
import org.robovm.debugger.state.classdata.FieldInfo;
import org.robovm.debugger.state.classdata.MethodInfo;
import org.robovm.debugger.state.instances.VmStackTrace;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.state.refid.InstanceRefIdHolder;
import org.robovm.debugger.state.refid.RefIdHolder;
import org.robovm.debugger.utils.bytebuffer.ByteBufferMemoryReader;
import org.robovm.debugger.utils.macho.MachOException;
import org.robovm.debugger.utils.macho.MachOLoader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Demyan Kimitsa
 */
public class VmDebuggerState {

    private final String LOCK_NOT_ACQUIRED = "Lock has to be acquired before accessing state members";

    // maps of references to objects
    RefIdHolder<ClassInfo> classRefIdHolder = new RefIdHolder<>(RefIdHolder.RefIdType.CLASS_TYPE);
    RefIdHolder<MethodInfo> methodsRefIdHolder = new RefIdHolder<>(RefIdHolder.RefIdType.METHOD_TYPE);
    RefIdHolder<FieldInfo> fieldRefIdHolder = new RefIdHolder<>(RefIdHolder.RefIdType.FIELD_TYPE);
    InstanceRefIdHolder referenceRefIdHolder = new InstanceRefIdHolder();
    RefIdHolder frameRefIdHolder = new RefIdHolder(RefIdHolder.RefIdType.FRAME_TYPE);

    // list of active threads
    List<VmThread> threads = new ArrayList<>();

    MachOLoader appFileLoader;
    ByteBufferMemoryReader appFileDataMemoryReader;
    ClassInfoLoader classInfoLoader;
    boolean isTarget64bit;

    /**
     * Central synchronization object
     */
    Object centralLock = new Object();

    public VmDebuggerState(File appFile, Arch arch) {
        try {

            // load and parse binary, will dig some useful info from it
            appFileLoader  = new MachOLoader(appFile, MachOLoader.cpuTypeFromString(arch.toString()));
            appFileDataMemoryReader = appFileLoader.memoryReader();

            // now load all classes info
            classInfoLoader = new ClassInfoLoader(classRefIdHolder, methodsRefIdHolder, fieldRefIdHolder,
                    appFileLoader, appFileDataMemoryReader);

            isTarget64bit = appFileLoader.isPatform64Bit();
        } catch (MachOException e) {
            throw new DebuggerException(e);
        }
    }


    public RefIdHolder<ClassInfo> classRefIdHolder() {
        return classRefIdHolder;
    }

    public RefIdHolder<MethodInfo> methodsRefIdHolder() {
        return methodsRefIdHolder;
    }

    public RefIdHolder<FieldInfo> fieldRefIdHolder() {
        return fieldRefIdHolder;
    }

    public InstanceRefIdHolder referenceRefIdHolder() {
        return referenceRefIdHolder;
    }

    public RefIdHolder<VmStackTrace> frameRefIdHolder() {
        return frameRefIdHolder;
    }

    public MachOLoader appFileLoader() {
        return appFileLoader;
    }

    public ByteBufferMemoryReader appFileDataMemoryReader() {
        return appFileDataMemoryReader;
    }

    public ClassInfoLoader classInfoLoader() {
        if (!Thread.holdsLock(centralLock))
            throw new DebuggerException(LOCK_NOT_ACQUIRED);

        return classInfoLoader;
    }

    public boolean isTarget64bit() {
        return isTarget64bit;
    }

    public List<VmThread> threads() {
        if (!Thread.holdsLock(centralLock))
            throw new DebuggerException(LOCK_NOT_ACQUIRED);

        return threads;
    }

    public Object centralLock() {
        return centralLock;
    }
}
