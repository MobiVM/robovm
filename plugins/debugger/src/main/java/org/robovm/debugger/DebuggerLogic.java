package org.robovm.debugger;

import org.robovm.compiler.config.Arch;
import org.robovm.debugger.hooks.HookConsts;
import org.robovm.debugger.hooks.HooksChannel;
import org.robovm.debugger.hooks.IHooksApi;
import org.robovm.debugger.hooks.IHooksEventsHandler;
import org.robovm.debugger.hooks.payloads.ThreadEventClassLoadedPayload;
import org.robovm.debugger.hooks.payloads.ThreadEventPayload;
import org.robovm.debugger.hooks.payloads.ThreadEventStoppedPayload;
import org.robovm.debugger.hooks.unitls.TargetByteBufferReader;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.utils.DbgLogger;

import java.io.File;
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

        // TODO: send VM attached event

        // start thread to listen for events
        this.hooksEventsThread = new Thread(new Runnable() {
            @Override
            public void run() {
                processEventsCycle();
            }
        });
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
        if (o instanceof ThreadEventClassLoadedPayload) {
            ThreadEventClassLoadedPayload event = (ThreadEventClassLoadedPayload) o;

            // mark class info as loaded
            state.classInfoLoader().onClassLoaded(toMachOAddr(event.classInfo), event.clazz);

            // deliver to JDWP

        } else if (o instanceof ThreadEventPayload) {
            ThreadEventPayload event = (ThreadEventPayload) o;
            if (event.eventId == HookConsts.events.THREAD_ATTACHED) {
                // adding a thread
                VmThread thread = state.referenceRefIdHolder().objectByAddr(event.threadObj);
                if (thread == null) {
                    ClassInfo ci = getClassInfo(event.threadObj);
                    thread = new VmThread(event.threadObj, ci);
                    state.referenceRefIdHolder().addObject(thread);
                    state.threads().add(thread);

                    // process as event
                } else {
                    // TODO: warning double attached thread !
                }

            } else if (event.eventId == HookConsts.events.THREAD_STARTED) {
                VmThread thread = state.referenceRefIdHolder().objectByAddr(event.threadObj);
                if (thread != null) {
                    thread.setStatus(VmThread.Status.STARTED);
                } else {
                    // TODO: should not happen
                }

            } else if (event.eventId == HookConsts.events.THREAD_RESUMED) {
                // there is no corresponding JDWP event
            } else if (event.eventId == HookConsts.events.THREAD_SUSPENDED) {
                // there is no corresponding JDWP event
            } else if (event.eventId == HookConsts.events.THREAD_DETTACHED) {

            } else {
                throw new DebuggerException("Unsupported ThreadEventPayload eventId " + event.eventId);
            }

        } else if (o instanceof ThreadEventStoppedPayload) {
            ThreadEventStoppedPayload event = (ThreadEventStoppedPayload) o;
        } else {
            throw new DebuggerException("Unsupported Hooks object received " + o);
        }
    }

    private void jdwpReportClassLoaded(ThreadEventClassLoadedPayload event) {

    }

    private ClassInfo getClassInfo(long objectPtr) {
        // get pointer to class structure from Object, refer to types.h, struct Object
        deviceMemoryReader.setAddress(objectPtr);
        long classPointer = deviceMemoryReader.readPointer();

        // class has to be loaded
        return state.classInfoLoader().classByLoadedAddr(classPointer);
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
