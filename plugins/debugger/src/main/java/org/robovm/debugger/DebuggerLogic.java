package org.robovm.debugger;

import org.robovm.compiler.config.Arch;
import org.robovm.debugger.hooks.HookConsts;
import org.robovm.debugger.hooks.HooksChannel;
import org.robovm.debugger.hooks.IHooksApi;
import org.robovm.debugger.hooks.IHooksEventsHandler;
import org.robovm.debugger.hooks.payloads.ThreadCallStackPayload;
import org.robovm.debugger.hooks.payloads.ThreadEventClassLoadedPayload;
import org.robovm.debugger.hooks.payloads.ThreadEventPayload;
import org.robovm.debugger.hooks.payloads.ThreadEventStoppedPayload;
import org.robovm.debugger.hooks.unitls.TargetByteBufferReader;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.events.JdwpClassLoadedEventData;
import org.robovm.debugger.jdwp.events.JdwpEventData;
import org.robovm.debugger.jdwp.events.JdwpThreadStoppedEventData;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.classdata.MethodInfo;
import org.robovm.debugger.state.instances.VmInstance;
import org.robovm.debugger.state.instances.VmStackTrace;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.utils.DbgLogger;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author  Demyan Kimitsa
 * TODO: temporal file to handle logic and events
 */
public class DebuggerLogic implements IHooksEventsHandler {
    Thread hooksEventsThread;

    /**
     * queue to keep events from hooks channel
     */
    LinkedBlockingQueue hooksEventsQueue = new LinkedBlockingQueue();

    /**
     * debugger state
     */
    private final VmDebuggerState state;

    /**
     * API to hooks.c once connection with device is established
     */
    IHooksApi hooksApi;

    /**
     * diff of address of base symbol, used to offset mach-o addresses due PIE/ASLR mode
     * (e.g. runtimeMemoryOffset = robovmBaseSymbol(runtime) - robovmBaseSymbol(mach-o)
     */
    long runtimeMemoryOffset;

    /**
     * reader of device memory
     */
    TargetByteBufferReader deviceMemoryReader;

    // TODO: remove it from here !!!!
    HooksChannel hooksChannel;


    public DebuggerLogic(VmDebuggerState state) {
        this.state = state;
    }

    public void onJdwpConnected() {
        // JDWP connection is established, connect to target
        hooksChannel.start();
    }

    @Override
    public void attached(IHooksApi api, long robovmBaseSymbol) {
        hooksApi = api;
        deviceMemoryReader = new TargetByteBufferReader(hooksApi, state.isTarget64bit());

        // calculate runtime to mach-o memory offset
        long robovmBaseSymbolMachO = state.appFileLoader().resolveSymbol("robovmBaseSymbol");
        runtimeMemoryOffset = robovmBaseSymbol - robovmBaseSymbolMachO;

        // TODO: send VM_START event

        // start thread to listen for events
        this.hooksEventsThread = new Thread(() -> processEventsCycle());
        this.hooksEventsThread.start();
    }

    @Override
    public void handleEvent(Object eventPayload) {
        // can't directly handle event payload here as callback is called from HooksChannel loop
        // as handling events often will cause sending message back to device which will cause
        // blocking of receiving thread on waiting for response
        hooksEventsQueue.add(eventPayload);
    }

    private void processEventsCycle() {
        // start of working with target device/simulator
        hooksApi.threadResume(0);

        // TODO: apply all possible pending breakpoints here

        while (!hooksEventsThread.isInterrupted()) {
            Object o = null;
            try {
                o = hooksEventsQueue.take();
            } catch (InterruptedException e) {
                // TODO: should not happen
                e.printStackTrace();
            }

            while (o != null) {
                processSingleEvent(o);
                o = hooksEventsQueue.poll();
            }

        }
    }

    private void processSingleEvent(Object o) {
        JdwpEventData eventData;
        if (o instanceof ThreadEventClassLoadedPayload) {
            eventData = processClassLoadedEvent((ThreadEventClassLoadedPayload) o);
        } else if (o instanceof ThreadEventPayload) {
            eventData = processThreadEvent((ThreadEventPayload) o);
        } else if (o instanceof ThreadEventStoppedPayload) {
            eventData = processThreadStoppedEvent((ThreadEventStoppedPayload) o);
        } else {
            throw new DebuggerException("Unsupported Hooks object received " + o);
        }

        if (eventData == null) {
            // there is no event generated, as there is no support of these event in JDWP
            return;
        }

        // filter data through event requests and deliver them to JDPW

    }

    /**
     * processes class load event -- marks class info as loaded
     */
    private JdwpEventData processClassLoadedEvent(ThreadEventClassLoadedPayload event) {
        // mark class info as loaded
        ClassInfo classInfo = state.classInfoLoader().onClassLoaded(toMachOAddr(event.classInfo), event.clazz);

        // TODO: there is possible event with thread id and stack traces in case it is filtere
        if (event.callStack != null) {
            VmThread thread = state.referenceRefIdHolder().instanceByAddr(event.threadObj);
            if (thread == null)
                throw new DebuggerException("Thread " + Long.toHexString(event.threadObj) + " is not recognized!");
            resumeThread(thread);
        }

        // jdpw object
        return new JdwpClassLoadedEventData(JdwpConsts.EventKind.CLASS_PREPARE, null, classInfo);
    }

    /**
     * processes thread events -- updates state
     */
    private JdwpEventData processThreadEvent(ThreadEventPayload event) {
        // get corresponding thread object
        VmThread thread = state.referenceRefIdHolder().instanceByAddr(event.threadObj);
        if (event.eventId == HookConsts.events.THREAD_ATTACHED || event.eventId == HookConsts.events.THREAD_STARTED) {
            if (thread != null)
                throw new DebuggerException("Thread " + Long.toHexString(event.threadObj) + " already attached/started!");

            // attach thread
            ClassInfo ci = getClassInfo(event.threadObj);
            thread = new VmThread(event.threadObj, event.thread, ci);
            state.referenceRefIdHolder().addObject(thread);
            state.threads().add(thread);

            // doesn't generate any event to JDWP
            return null;
        }

        if (thread == null)
            throw new DebuggerException("Thread " + Long.toHexString(event.threadObj) + " is not recognized!");

        switch (event.eventId) {
            case HookConsts.events.THREAD_RESUMED:
                thread.setStatus(VmThread.Status.RESUMED);
                // there is no corresponding JDPW event
                return null;

            case HookConsts.events.THREAD_DETTACHED:
                // remove thread
                state.referenceRefIdHolder().removeObject(thread);
                state.threads().remove(thread);
                return new JdwpEventData(JdwpConsts.EventKind.THREAD_END, thread);

            default:
                throw new DebuggerException("Unsupported ThreadEventPayload eventId " + event.eventId);
        }
    }

    /** thread stopped event */
    private JdwpEventData processThreadStoppedEvent(ThreadEventStoppedPayload event) {
        // get corresponding thread object
        VmThread thread = state.referenceRefIdHolder().instanceByAddr(event.threadObj);

        if (thread == null)
            throw new DebuggerException("Thread " + Long.toHexString(event.threadObj) + " is not recognized!");

        // convert call stack
        VmStackTrace[] callStack = convertCallStack(event.callStack);
        if (callStack.length == 0) {
            // TODO: log
            return null;
        }

        switch (event.eventId) {
            case HookConsts.events.THREAD_SUSPENDED:
                thread.setStatus(VmThread.Status.SUPENDED);
                // no corresponding JDWP events here
                return null;

            case HookConsts.events.EXCEPTION:
                resumeThread(thread);
                ClassInfo ci = getClassInfo(event.throwable);
                VmInstance exception = new VmInstance(event.throwable, ci);
                return new JdwpThreadStoppedEventData(JdwpConsts.EventKind.EXCEPTION, thread, callStack[0], exception);

            case HookConsts.events.THREAD_STEPPED:
                return new JdwpThreadStoppedEventData(JdwpConsts.EventKind.SINGLE_STEP, thread, callStack[0], null);

            case HookConsts.events.BREAKPOINT:
                return new JdwpThreadStoppedEventData(JdwpConsts.EventKind.BREAKPOINT, thread, callStack[0], null);

            default:
                throw new DebuggerException("Unsupported ThreadEventStoppedPayload eventId " + event.eventId);
        }
    }

    private void resumeThread(VmThread thread) {
        hooksApi.threadResume(thread.getThreadPtr());
        thread.setStatus(VmThread.Status.RESUMED);
    }

    private ClassInfo getClassInfo(long objectPtr) {
        // get pointer to class structure from Object, refer to types.h, struct Object
        deviceMemoryReader.setAddress(objectPtr);
        long classPointer = deviceMemoryReader.readPointer();

        // class has to be loaded
        return state.classInfoLoader().classByLoadedAddr(classPointer);
    }


    private VmStackTrace[] convertCallStack(ThreadCallStackPayload[] callStack) {
        List<VmStackTrace> result = new ArrayList<>();
        for (ThreadCallStackPayload entry : callStack) {
            VmStackTrace stackTrace = convertStackTrace(entry);
            if (stackTrace != null)
                result.add(stackTrace);
        }

        return result.toArray(new VmStackTrace[result.size()]);
    }


    private VmStackTrace convertStackTrace(ThreadCallStackPayload payload) {
        ClassInfo classInfo = state.classInfoLoader().classInfoByName(payload.clazzName);
        // TODO: warning
        if (classInfo == null)
            return null;

        // find method
        MethodInfo[] methods = state.classInfoLoader().classMethods(classInfo);
        long implPtr = toMachOAddr(payload.impl);
        MethodInfo methodInfo = null;
        for (MethodInfo mi : methods) {
            if (mi.getImplPtr() == implPtr) {
                methodInfo = mi;
                break;
            }
        }

        // TODO: warning
        if (methodInfo == null)
            return null;

        return new VmStackTrace(classInfo, methodInfo, payload.lineNumber);
    }


    /**
     * Converts runtime address to one that can be used with mach-o image
     * (runtime address differs due PIE/ASLR protection)
     *
     * @param runtimeAddr as it was read from device
     * @return address that can be use with mach-o space
     */
    private long toMachOAddr(long runtimeAddr) {
        return runtimeAddr - runtimeMemoryOffset;
    }


    public static void main(String[] argv) {
        DbgLogger.setup(null, true);

        File appFile = new File(argv[0]);
        Arch arch = Arch.valueOf(argv[1]);
        File portFile = new File(argv[2]);

        if (portFile.exists())
            portFile.delete();

        VmDebuggerState state = new VmDebuggerState(appFile, arch);
        DebuggerLogic logic = new DebuggerLogic(state);
        logic.hooksChannel = new HooksChannel(!arch.is32Bit(), portFile, logic);

        logic.onJdwpConnected();
    }
}
