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
 * TODO: here all internal state of VM and debugger will go
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

    // counter of request set
    private int jdwpEventRequestCounter = 100;
    // list of active event filters as received from JDWP
    private List<JdwpEventRequest> jdwpEventRequests = new ArrayList<>();


    MachOLoader appFileLoader;
    ByteBufferMemoryReader appFileDataMemoryReader;
    ClassInfoLoader classInfoLoader;
    boolean isTarget64bit;

    /**
     * lock that is used for main logic synchronization
     */
    ReentrantLock centralLock = new ReentrantLock();

    public VmDebuggerState(File appFile, Arch arch) {
        try {

            // load and parse binary, will dig some useful info from it
            appFileLoader  = new MachOLoader(appFile, MachOLoader.cpuTypeFromString(arch.toString()));
            appFileDataMemoryReader = appFileLoader.readDataSegment();

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
        if (!centralLock.isHeldByCurrentThread())
            throw new DebuggerException(LOCK_NOT_ACQUIRED);

        return classInfoLoader;
    }

    public boolean isTarget64bit() {
        return isTarget64bit;
    }

    public List<VmThread> threads() {
        if (!centralLock.isHeldByCurrentThread())
            throw new DebuggerException(LOCK_NOT_ACQUIRED);

        return threads;
    }

    public int allocateJdwpEventRequestId() {
        return jdwpEventRequestCounter++;
    }

    public List<JdwpEventRequest> jdwpEventRequests() {
        if (!centralLock.isHeldByCurrentThread())
            throw new DebuggerException(LOCK_NOT_ACQUIRED);

        return jdwpEventRequests;
    }

    public ReentrantLock centralLock() {
        return centralLock;
    }
}
