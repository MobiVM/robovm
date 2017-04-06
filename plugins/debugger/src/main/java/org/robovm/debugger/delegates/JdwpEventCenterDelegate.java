package org.robovm.debugger.delegates;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.IJdwpEventDelegate;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.JdwpEventRequest;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates.EventClassTypeIdPredicate;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates.EventExceptionPredicate;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates.EventInstanceIdPredicate;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates.EventLocationPredicate;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates.EventPredicate;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates.EventStepModPredicate;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates.EventThreadRefIdPredicate;
import org.robovm.debugger.hooks.HookConsts;
import org.robovm.debugger.hooks.payloads.HooksCallStackEntry;
import org.robovm.debugger.hooks.payloads.HooksClassLoadedEventPayload;
import org.robovm.debugger.hooks.payloads.HooksEventPayload;
import org.robovm.debugger.hooks.payloads.HooksThreadEventPayload;
import org.robovm.debugger.hooks.payloads.HooksThreadStoppedEventPayload;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.JdwpClassLoadedEventData;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.JdwpEventData;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.JdwpThreadStoppedEventData;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.classdata.MethodInfo;
import org.robovm.debugger.state.instances.VmInstance;
import org.robovm.debugger.state.instances.VmStackTrace;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Demyan Kimitsa
 * Delegate that handles events from hooks.c and also event requests from JDWP
 */
public class JdwpEventCenterDelegate implements IJdwpEventDelegate {

    // all delegates and logic parts
    private final AllDelegates delegates;

    /**
     * list of event request ids that that went to target/simulator
     */
    private Set<Integer> requestIdsInTarget = new HashSet<>();

    /**
     * thread that is reading events from hooks interface
     */
    private Thread hooksEventsThread;

    /**
     * Byte buffer payload to deliver event to JDWP
     */
    private final ByteBufferPacket jdwpEventPayload;

    /**
     * queue to keep events from hooks channel
     */
    private LinkedBlockingQueue<HooksEventPayload> hooksEventsQueue = new LinkedBlockingQueue<>();


    public JdwpEventCenterDelegate(AllDelegates delegates) {
        this.delegates = delegates;

        jdwpEventPayload = new ByteBufferPacket();
        jdwpEventPayload.setByteOrder(ByteOrder.BIG_ENDIAN);
    }


    /**
     * called once connection to hooks is established
     */
    public void onConnectedToTarget() {
        // start thread to listen for events
        this.hooksEventsThread = new Thread(() -> processEventsCycle());
        this.hooksEventsThread.start();
   }


   public void postEventFromHooks(HooksEventPayload eventPayload) {
       // can't directly handle event payload here as callback is called from HooksChannel loop
       // as handling events often will cause sending message back to device which will cause
       // blocking of receiving thread on waiting for response
       hooksEventsQueue.add(eventPayload);
   }

    /**
     * sets event request
     * @param eventKind (breakpoint etc, check JdpwConst.EventKind)
     * @param suspendPolicy once event triggered
     * @param predicates to filter this event before it triggered
     * @return JDWP error code
     */
    @Override
    public int jdwpSetEventRequest(byte eventKind, byte suspendPolicy, List<EventPredicate> predicates) {
        // validate predicates
        long itemId;
        for (EventPredicate predicate : predicates) {
            switch (predicate.modifierKind()) {
                case JdwpConsts.EventModifier.CLASS_ONLY:
                    itemId = ((EventClassTypeIdPredicate) predicate).classTypeId();
                    if (delegates.state().classRefIdHolder().objectById(itemId) == null)
                        throw new DebuggerException(JdwpConsts.Error.INVALID_CLASS);
                    break;

                case JdwpConsts.EventModifier.EXCEPTION_ONLY:
                    itemId = ((EventExceptionPredicate) predicate).refTypeId();
                    if (delegates.state().classRefIdHolder().objectById(itemId) == null)
                        throw new DebuggerException(JdwpConsts.Error.INVALID_CLASS);
                    break;

                case JdwpConsts.EventModifier.THREAD_ONLY:
                    itemId = ((EventThreadRefIdPredicate) predicate).threadRefId();
                    if (delegates.state().referenceRefIdHolder().instanceById(itemId) == null)
                        throw new DebuggerException(JdwpConsts.Error.INVALID_THREAD);
                    break;

                case JdwpConsts.EventModifier.INSTANCE_ONLY:
                    itemId = ((EventInstanceIdPredicate) predicate).instaceId();
                    if (delegates.state().referenceRefIdHolder().instanceById(itemId) == null)
                        throw new DebuggerException(JdwpConsts.Error.INVALID_OBJECT);
                    break;

                case JdwpConsts.EventModifier.STEP:
                    itemId = ((EventStepModPredicate) predicate).threadId();
                    if (itemId != 0) {
                        VmThread thread = delegates.state().referenceRefIdHolder().instanceById(itemId);
                        if (thread == null)
                            throw new DebuggerException(JdwpConsts.Error.INVALID_THREAD);
                    }
                    break;
                case JdwpConsts.EventModifier.LOCATION_ONLY:
                    EventLocationPredicate locationPredicate = (EventLocationPredicate) predicate;
                    if (delegates.state().classRefIdHolder().objectById(locationPredicate.classId()) == null)
                        throw new DebuggerException(JdwpConsts.Error.INVALID_CLASS);
                    if (delegates.state().methodsRefIdHolder().objectById(locationPredicate.methodId()) == null)
                        throw new DebuggerException(JdwpConsts.Error.INVALID_METHODID);
                    break;
            }
        }

        // meanwhile just adding items to the list
        int requestId = delegates.state().allocateJdwpEventRequestId();
        JdwpEventRequest request = new JdwpEventRequest(requestId, eventKind, suspendPolicy, predicates);

        delegates.log().debug("jdwpSetEventRequest: " + request);

        // apply event to target before adding it to list as it could fail with exception due wrong location etc
        onEventRequestSet(request);

        delegates.state().jdwpEventRequests().add(request);
        return requestId;
    }


    /**
     * Clears previously set event request
     * @param eventKind Event kind to clear
     * @param requestID ID of request to clear
     * @return JDWP error code
     */
    @Override
    public short jdwpClearEventRequest(byte eventKind, int requestID) {
        synchronized (delegates.state().centralLock()) {
            Iterator<JdwpEventRequest> it = delegates.state().jdwpEventRequests().iterator();
            while (it.hasNext()) {
                JdwpEventRequest req = it.next();
                if (req.requestId() == requestID) {
                    if (req.eventKind() != eventKind)
                        return JdwpConsts.Error.INVALID_EVENT_TYPE;

                    onEventRequestRemoved(req);
                    it.remove();

                    return JdwpConsts.Error.NONE;
                }
            }

            // not found
            return JdwpConsts.Error.INVALID_EVENT_TYPE;
        }
    }

    /**
     * remove all breakpoint event types
     */
    @Override
    public void jdwpClearAllBreakpoints() {
        synchronized (delegates.state().centralLock()) {
            Iterator<JdwpEventRequest> it = delegates.state().jdwpEventRequests().iterator();
            while (it.hasNext()) {
                JdwpEventRequest req = it.next();
                if (req.eventKind() == JdwpConsts.EventKind.BREAKPOINT) {
                    onEventRequestRemoved(req);
                    it.remove();
                }
            }
        }
    }

    private void onEventRequestSet(JdwpEventRequest request) {
        if (requestIdsInTarget.contains(request.requestId()))
            throw new DebuggerException("Request with id " + request.requestId() + " already registered with target");

        switch (request.eventKind() ) {
            case JdwpConsts.EventKind.BREAKPOINT:
                // find location
                EventLocationPredicate location = request.predicateByKind(JdwpConsts.EventModifier.LOCATION_ONLY);
                if (location == null)
                    throw new DebuggerException(JdwpConsts.Error.INVALID_LOCATION);

                // TODO: apply it to target
                break;

            case JdwpConsts.EventKind.SINGLE_STEP:
                EventStepModPredicate stepMod = request.predicateByKind(JdwpConsts.EventModifier.STEP);
                if (stepMod == null) {
                    // probably this is wrong error code but this should not happen ever
                    throw new DebuggerException(JdwpConsts.Error.INVALID_EVENT_TYPE);
                }

                // TODO: apply it to target
                break;

            default:
                // this event request either doesn't affect target or not fully supported
                return;
        }

        requestIdsInTarget.add(request.requestId());
    }

    private void onEventRequestRemoved(JdwpEventRequest request) {
        // check if this request has touched the targets
        if (!requestIdsInTarget.contains(request.requestId()))
            return;

        switch (request.eventKind() ) {
            case JdwpConsts.EventKind.BREAKPOINT:
                // remove from device
                break;

            case JdwpConsts.EventKind.SINGLE_STEP:
                // SHOULD NOT HAPPEN ?
                break;
        }
    }


    private void processEventsCycle() {
        // TODO: send VM_START event

        // start of working with target device/simulator
        delegates.hooksApi().threadResume(0); // TODO: remove from here ! 

        // TODO: apply all possible pending breakpoints here

        while (!hooksEventsThread.isInterrupted()) {
            HooksEventPayload eventPayload = null;
            try {
                eventPayload = hooksEventsQueue.take();
            } catch (InterruptedException e) {
                // TODO: should not happen
                e.printStackTrace();
            }

            while (eventPayload != null) {
                synchronized (delegates.state().centralLock()) {
                    processSingleEvent(eventPayload);
                }
                eventPayload = hooksEventsQueue.poll();
            }

        }
    }

    private void processSingleEvent(HooksEventPayload eventPayload) {
        JdwpEventData eventData;
        VmThread stoppedThread = null;
        VmStackTrace[] stoppedThreadCallStack = null;

        switch (eventPayload.eventId()) {
            case HookConsts.events.CLASS_LOAD:
                HooksClassLoadedEventPayload classLoadEvent = (HooksClassLoadedEventPayload) eventPayload;
                if (classLoadEvent.threadObj() != 0 && classLoadEvent.callStack() != null) {
                    // event with thread id and stack traces
                    // TODO: it should stop but it is not clear at the moment how to use it, so resume
                    VmThread classLoadThread = getThread(classLoadEvent.eventId(), classLoadEvent.threadObj());
                    VmStackTrace[] classLoadThreadCallStack = convertCallStack(classLoadEvent.eventId(), classLoadEvent.callStack());
                    delegates.threads().onThreadSuspended(classLoadThread, classLoadThreadCallStack, false);
                }

                eventData = processClassLoadedEvent(classLoadEvent);
                break;

            case HookConsts.events.THREAD_ATTACHED:
            case HookConsts.events.THREAD_STARTED:
            case HookConsts.events.THREAD_DETTACHED:
            case HookConsts.events.THREAD_RESUMED:
                eventData = processThreadEvent((HooksThreadEventPayload) eventPayload);
                break;

            case HookConsts.events.THREAD_STEPPED:
            case HookConsts.events.BREAKPOINT:
            case HookConsts.events.EXCEPTION:
            case HookConsts.events.THREAD_SUSPENDED:
                // need to get thread and stack objects here as these will be required to notify that thread is stopped
                HooksThreadStoppedEventPayload stoppedEvent = (HooksThreadStoppedEventPayload) eventPayload;

                // get corresponding thread object and stack
                stoppedThread = getThread(stoppedEvent.eventId(), stoppedEvent.threadObj());
                stoppedThreadCallStack = convertCallStack(stoppedEvent.eventId(), stoppedEvent.callStack());

                if (eventPayload.eventId() == HookConsts.events.THREAD_SUSPENDED) {
                    // there is no JDWP event for this, just update call stack
                    delegates.threads().onThreadSuspended(stoppedThread, stoppedThreadCallStack, false);
                    eventData = null;
                } else {
                    eventData = processThreadStoppedEvent(stoppedEvent, stoppedThread, stoppedThreadCallStack);
                }
                break;

            default:
                throw new DebuggerException("Unsupported Hooks object received " + eventPayload);
        }

        if (eventData == null) {
            // there is no event generated, as there is no support of these event in JDWP
            return;
        }

        // filter data through event requests and deliver them to JDPW
        int suspendPolicy = deliverEventToJdpwFiltered(eventData);
        if (suspendPolicy < 0) {
            // event didn't pass filters
            if (stoppedThread != null)
                delegates.threads().onThreadSuspended(stoppedThread, stoppedThreadCallStack, false);
        } else {
            if (suspendPolicy == JdwpConsts.SuspendPolicy.ALL) {
                // suspend all threads (stopped one already suspended)
                delegates.threads().suspendAllOtherThreads(stoppedThread);
            }
        }
    }

    /**
     * filters event through predicate, dumps it to byte buffer packet and send it to JDWP client
     * @param eventData prepared event data
     * @return negative if not processed, otherwise suspend policy
     */
    private int deliverEventToJdpwFiltered(JdwpEventData eventData) {
        int processed = 0;
        byte suspendPolicy = JdwpConsts.SuspendPolicy.NONE;
        jdwpEventPayload.reset();
        if (delegates.jdwpServerApi() != null) {
            // there is JDWP server attached
            List<JdwpEventRequest> requests = delegates.state().jdwpEventRequests();
            for (JdwpEventRequest request : requests) {
                if (!request.test(eventData))
                    continue;

                // event filtered through, deliver to JDWP client
                processed += 1;
                if (request.suspendPolicy() > suspendPolicy)
                    suspendPolicy = request.suspendPolicy();
                eventData.dump(jdwpEventPayload, request.requestId());
            }
        }

        if (processed > 0) {
            delegates.jdwpServerApi().sendEvent(suspendPolicy, processed, jdwpEventPayload);
            return suspendPolicy;
        } else {
            // there was no event processed
            return -1;
        }
    }

    /**
     * processes class load event -- marks class info as loaded
     */
    private JdwpEventData processClassLoadedEvent(HooksClassLoadedEventPayload event) {
        // mark class info as loaded
        ClassInfo classInfo = delegates.state().classInfoLoader().onClassLoaded(delegates.runtime().toMachOAddr(event.classInfo()),
                event.clazz());
        VmThread thread = event.threadObj() != 0 ? getThread(event.eventId(), event.threadObj()) : null;

        // jdpw object
        return new JdwpClassLoadedEventData(JdwpConsts.EventKind.CLASS_PREPARE, thread, classInfo);
    }

    /**
     * processes thread events -- updates state
     */
    private JdwpEventData processThreadEvent(HooksThreadEventPayload event) {
        // get corresponding thread object
        VmThread thread = delegates.state().referenceRefIdHolder().instanceByAddr(event.threadObj());
        if (event.eventId() == HookConsts.events.THREAD_ATTACHED || event.eventId() == HookConsts.events.THREAD_STARTED) {
            if (thread != null)
                throw new DebuggerException("Thread " + Long.toHexString(event.threadObj()) + " already attached/started!");

            // attach thread
            ClassInfo ci = delegates.runtime().classInfoLoader().resolveObjectRuntimeDataTypeInfo(event.threadObj());
            thread = new VmThread(event.threadObj(), event.thread(), ci);
            delegates.state().referenceRefIdHolder().addObject(thread);
            delegates.state().threads().add(thread);

            // doesn't generate any event to JDWP
            return null;
        }

        if (thread == null)
            throw new DebuggerException("Thread " + Long.toHexString(event.threadObj()) + " is not recognized!");

        switch (event.eventId()) {
            case HookConsts.events.THREAD_RESUMED:
                thread.setStatus(VmThread.Status.RUNNING);
                // there is no corresponding JDPW event
                return null;

            case HookConsts.events.THREAD_DETTACHED:
                // remove thread
                delegates.state().referenceRefIdHolder().removeObject(thread);
                delegates.state().threads().remove(thread);
                return new JdwpEventData(JdwpConsts.EventKind.THREAD_END, thread);

            default:
                throw new DebuggerException("Unsupported HooksThreadEventPayload eventId " + event.eventId());
        }
    }

    /** thread stopped event */
    private JdwpEventData processThreadStoppedEvent(HooksThreadStoppedEventPayload event, VmThread thread, VmStackTrace[] callStack) {
        switch (event.eventId()) {
            case HookConsts.events.EXCEPTION:
                ClassInfo ci = delegates.runtime().classInfoLoader().resolveObjectRuntimeDataTypeInfo(event.throwable());
                VmInstance exception = new VmInstance(event.throwable(), ci);
                return new JdwpThreadStoppedEventData(JdwpConsts.EventKind.EXCEPTION, thread, callStack[0], exception);

            case HookConsts.events.THREAD_STEPPED:
                return new JdwpThreadStoppedEventData(JdwpConsts.EventKind.SINGLE_STEP, thread, callStack[0], null);

            case HookConsts.events.BREAKPOINT:
                return new JdwpThreadStoppedEventData(JdwpConsts.EventKind.BREAKPOINT, thread, callStack[0], null);

            default:
                throw new DebuggerException("Unsupported HooksThreadStoppedEventPayload eventId " + event.eventId());
        }
    }

    private VmStackTrace[] convertCallStack(int eventId, HooksCallStackEntry[] callStack) {
        List<VmStackTrace> result = new ArrayList<>();
        for (HooksCallStackEntry entry : callStack) {
            VmStackTrace stackTrace = convertStackTrace(eventId, entry);
            if (stackTrace != null)
                result.add(stackTrace);
        }

        if (result.size() == 0)
            delegates.log().error(HookConsts.commandToString(eventId) + ": Empty callstack!");

        return result.toArray(new VmStackTrace[result.size()]);
    }

    private VmStackTrace convertStackTrace(int eventId, HooksCallStackEntry payload) {
        ClassInfo classInfo = delegates.state().classInfoLoader().classInfoBySignature(payload.clazzName());
        if (classInfo == null) {
            delegates.log().error(HookConsts.commandToString(eventId) + ": Failed to get get stack entry. Class is not known " +
                    payload.clazzName());
            return null;
        }

        // find method
        MethodInfo[] methods = delegates.state().classInfoLoader().classMethods(classInfo);
        long implPtr = delegates.runtime().toMachOAddr(payload.impl());
        MethodInfo methodInfo = null;
        for (MethodInfo mi : methods) {
            if (mi.getImplPtr() == implPtr) {
                methodInfo = mi;
                break;
            }
        }

        if (methodInfo == null) {
            delegates.log().error(HookConsts.commandToString(eventId) + ": Failed to get get stack entry. Method not found for impl " +
                    Long.toHexString(payload.impl()) + " class " + payload.clazzName());
            return null;
        }

        return new VmStackTrace(classInfo, methodInfo, payload.lineNumber());
    }

    private VmThread getThread(int eventId, long threadObj) {
        VmThread thread = delegates.state().referenceRefIdHolder().instanceByAddr(threadObj);
        if (thread == null)
            throw new DebuggerException(HookConsts.commandToString(eventId) +
                    ": Thread " + Long.toHexString(threadObj) + " is not recognized!");
        return thread;
    }
}
