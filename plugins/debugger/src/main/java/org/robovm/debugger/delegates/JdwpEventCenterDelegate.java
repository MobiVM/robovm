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
package org.robovm.debugger.delegates;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.hooks.HookConsts;
import org.robovm.debugger.hooks.payloads.HooksCallStackEntry;
import org.robovm.debugger.hooks.payloads.HooksClassLoadedEventPayload;
import org.robovm.debugger.hooks.payloads.HooksEventPayload;
import org.robovm.debugger.hooks.payloads.HooksThreadEventPayload;
import org.robovm.debugger.hooks.payloads.HooksThreadStoppedEventPayload;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.IJdwpEventDelegate;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.JdwpClassLoadedEventData;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.JdwpEventData;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.JdwpEventRequest;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.JdwpThreadStoppedEventData;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates.EventClassNameMatchPredicate;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates.EventClassTypeIdPredicate;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates.EventExceptionPredicate;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates.EventInstanceIdPredicate;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates.EventLocationPredicate;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates.EventModCountPredicate;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates.EventPredicate;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates.EventStepModPredicate;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates.EventThreadRefIdPredicate;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.classdata.ClassInfoImpl;
import org.robovm.debugger.state.classdata.MethodInfo;
import org.robovm.debugger.state.instances.VmInstance;
import org.robovm.debugger.state.instances.VmStackTrace;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.utils.DbgLogger;
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
    private DbgLogger log = DbgLogger.get(this.getClass().getSimpleName());

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

    // counter of request set
    private int jdwpEventRequestCounter = 100;

    // list of active event filters as received from JDWP
    private List<JdwpEventRequest> jdwpEventRequests = new ArrayList<>();

    /** local flag that VM was resumed */
    private boolean vmStartedNotified;

    /** active step-in event request to be able to resume suspended thread and keep step in */
    private RuntimeUtils.RuntimeStepReference activeStepRequest;


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
        this.hooksEventsThread = delegates.toolBox().createThread(() -> processEventsCycle(), "EventCenterThread");

        // there is a need to resume VM and do other things with target itself
        // do this in entry of that tread as it is not allowed here -- as this callback is being called from
        // hooks socket listening thread which will cause deadlock
        this.hooksEventsThread.start();
    }


    /**
     * Called once JDPW connection is established
     */
    public void onConnectedToJdpw() {
        // if there is connection to hooks established -- resume VM
        if (delegates.hooksApi() != null)
            notifyVmStarted();
    }


    /**
     * Resumes target VM
     */
    private void notifyVmStarted() {
        if (vmStartedNotified)
            return;
        vmStartedNotified = true;

        if (delegates.hooksApi() == null)
            throw new DebuggerException("Hooks API is required to be set to resume VM");

        // suspend all thread
        delegates.threads().jdwpSuspendAllThreads();

        // send VM started notification, keep all thread suspended, e.g. keep hooks on handbreak till VM resume is received
        jdwpEventPayload.reset();
        JdwpEventData data = new JdwpEventData(JdwpConsts.EventKind.VM_START, null);
        data.dump(jdwpEventPayload, 0);
        delegates.jdwpServerApi().sendEvent(JdwpConsts.SuspendPolicy.ALL, 1, jdwpEventPayload);
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
                    if (itemId != 0 && delegates.state().classRefIdHolder().objectById(itemId) == null)
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
                    MethodInfo methodInfo = delegates.state().methodsRefIdHolder().objectById(locationPredicate.methodId());
                    if (methodInfo == null)
                        throw new DebuggerException(JdwpConsts.Error.INVALID_METHODID);
                    if (methodInfo.debugInfo() == null ||  methodInfo.bpTableAddr() <= 0)
                        throw new DebuggerException(JdwpConsts.Error.INVALID_LOCATION);
                    if (locationPredicate.index() < methodInfo.debugInfo().startLine() || locationPredicate.index() > methodInfo.debugInfo().finalLine())
                        throw new DebuggerException(JdwpConsts.Error.INVALID_LOCATION);
                    break;
            }
        }

        // meanwhile just adding items to the list
        int requestId = allocateJdwpEventRequestId();
        JdwpEventRequest request = new JdwpEventRequest(requestId, eventKind, suspendPolicy, predicates);

        log.debug("jdwpSetEventRequest: " + request);

        // save
        jdwpEventRequests.add(request);

        // apply event to target before adding it to list as it could fail with exception due wrong location etc
        applyRequestToTarget(request);

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
        Iterator<JdwpEventRequest> it = jdwpEventRequests.iterator();
        while (it.hasNext()) {
            JdwpEventRequest req = it.next();
            if (req.requestId() == requestID) {
                if (req.eventKind() != eventKind)
                    return JdwpConsts.Error.INVALID_EVENT_TYPE;

                it.remove();
                removeRequestFromTarget(req);

                return JdwpConsts.Error.NONE;
            }
        }

        // not found
        return JdwpConsts.Error.INVALID_EVENT_TYPE;
    }

    /**
     * remove all breakpoint event types
     */
    @Override
    public void jdwpClearAllBreakpoints() {
        Iterator<JdwpEventRequest> it = jdwpEventRequests.iterator();
        while (it.hasNext()) {
            JdwpEventRequest req = it.next();
            if (req.eventKind() == JdwpConsts.EventKind.BREAKPOINT) {
                removeRequestFromTarget(req);
                it.remove();
            }
        }
    }

    /**
     * stops sending events to JDPW but keeps buffering them
     */
    @Override
    public void jdwpHoldEvents() {
        // TODO: implement
    }

    /**
     * resumes sending of all events -- also sends buffered events
     */
    @Override
    public void jdwpReleaseEvents() {
        // TODO: implement
    }

    private void applyRequestToTarget(JdwpEventRequest request) {
        // doesn't do anything if there is no connection with hooks yet
        if (delegates.hooksApi() == null)
            return;

        if (requestIdsInTarget.contains(request.requestId()))
            throw new DebuggerException("Request with id " + request.requestId() + " already registered with target");

        switch (request.eventKind() ) {
            case JdwpConsts.EventKind.BREAKPOINT:
                // find location
                EventLocationPredicate location = request.predicateByKind(JdwpConsts.EventModifier.LOCATION_ONLY);
                if (location == null)
                    throw new DebuggerException(JdwpConsts.Error.INVALID_LOCATION);

                // apply it to target
                MethodInfo methodInfo = delegates.state().methodsRefIdHolder().objectById(location.methodId());
                delegates.runtime().setBreakPoint(methodInfo, (int) location.index());
                break;

            case JdwpConsts.EventKind.SINGLE_STEP:
                EventStepModPredicate stepMod = request.predicateByKind(JdwpConsts.EventModifier.STEP);
                if (stepMod == null) {
                    // probably this is wrong error code but this should not happen ever
                    throw new DebuggerException(JdwpConsts.Error.INVALID_EVENT_TYPE);
                }

                VmThread thread = delegates.state().referenceRefIdHolder().instanceById(stepMod.threadId());
                if (thread == null)
                    throw new DebuggerException(JdwpConsts.Error.INVALID_THREAD);

                // thread shall be suspended
                if (thread.suspendCount() == 0)
                    throw new DebuggerException(JdwpConsts.Error.THREAD_NOT_SUSPENDED);

                // apply it to target
                // size modifier is ignored as stepping in hooks implemented as line only
                RuntimeUtils.RuntimeStepReference ref = delegates.runtime().step(thread, stepMod.depth());

                // remember the request to be able to resume it in case some of criteria doesn't pass (e.g. class is filtered out)
                // or execution is interrupted and stepping is canceled by exception event
                activeStepRequest = ref != null ? ref.setPayload(request) : null;
                break;

            case JdwpConsts.EventKind.CLASS_PREPARE:
                // check if there is class name filtering and suspend policy is other than
                if (request.suspendPolicy() == JdwpConsts.SuspendPolicy.ALL || request.suspendPolicy() == JdwpConsts.SuspendPolicy.EVENT_THREAD) {
                    Set<String> classNamesToReport = null;
                    // get list of class names that matches to this event
                    for (EventPredicate p : request.predicates()) {
                        if (!(p instanceof EventClassNameMatchPredicate))
                            continue;

                        EventClassNameMatchPredicate predicate = (EventClassNameMatchPredicate) p;
                        if (classNamesToReport == null) {
                            // so there is any predicate, get all known classes for start
                            classNamesToReport = new HashSet<>(delegates.state().classInfoLoader().allClassNames());
                        }

                        // filter things
                        String pattern = predicate.pattern().replace('.', '/');
                        boolean negative = predicate.isNegative();
                        if (predicate.isExact()) {
                            // corner case -- there is only one to be left/removed
                            if (negative) {
                                classNamesToReport.remove(pattern);
                            } else {
                                boolean pass = classNamesToReport.contains(pattern);
                                classNamesToReport.clear();
                                if (pass)
                                    classNamesToReport.add(pattern);
                            }
                        } else {
                            // need to walk through all classes
                            // removing not matching
                            // keeping only matching
                            classNamesToReport.removeIf(v -> EventClassNameMatchPredicate.matchPattern(pattern, v) == negative);
                        }
                    }

                    if (classNamesToReport != null && !classNamesToReport.isEmpty()) {
                        // there are some classes to listen on

                        // build new set of classes to listen on
                        request.setFilteredClassNames(classNamesToReport);

                        // update the list and put to divece
                        udpateActiveClassFilters();
                    }
                }
                break;

            default:
                // this event request either doesn't affect target or not fully supported
                return;
        }

        requestIdsInTarget.add(request.requestId());
    }

    private void removeRequestFromTarget(JdwpEventRequest request) {
        // doesn't do anything if there is no connection with hooks yet
        if (delegates.hooksApi() == null)
            return;

        // check if this request has touched the targets
        if (!requestIdsInTarget.contains(request.requestId()))
            return;

        switch (request.eventKind() ) {
            case JdwpConsts.EventKind.BREAKPOINT:
                EventLocationPredicate location = request.predicateByKind(JdwpConsts.EventModifier.LOCATION_ONLY);
                if (location == null)
                    throw new DebuggerException(JdwpConsts.Error.INVALID_LOCATION);

                // remove from device
                MethodInfo methodInfo = delegates.state().methodsRefIdHolder().objectById(location.methodId());
                delegates.runtime().clearBreakPoint(methodInfo, (int) location.index());
                break;

            case JdwpConsts.EventKind.SINGLE_STEP:
                if (activeStepRequest != null && request == activeStepRequest.payload())
                    activeStepRequest = null;
                break;

            case JdwpConsts.EventKind.CLASS_PREPARE:
                // check if there is class name filtering and suspend policy is other than
                if (request.filteredClassNames() != null &&  (request.suspendPolicy() == JdwpConsts.SuspendPolicy.ALL ||
                        request.suspendPolicy() == JdwpConsts.SuspendPolicy.EVENT_THREAD)) {
                    // request is already removed from the list, update the list
                    udpateActiveClassFilters();
                }
                break;
        }
    }

    private void udpateActiveClassFilters() {
        // make total list of classes
        Set<String> allClassesToFilter = new HashSet<>();
        for (JdwpEventRequest r : jdwpEventRequests) {
            if (r.eventKind() == JdwpConsts.EventKind.CLASS_PREPARE && r.filteredClassNames() != null) {
                allClassesToFilter.addAll(r.filteredClassNames());
            }
        }

        // put to device
        delegates.runtime().setClassLoadFilter(allClassesToFilter);
    }

    private void processEventsCycle() {
        synchronized (delegates.state().centralLock()) {
            if (delegates.jdwpServerApi() != null) {
                // hooks channels is connected, notify that VM is started
                notifyVmStarted();

                // apply breakpoints if any
                for (JdwpEventRequest request : jdwpEventRequests) {
                    applyRequestToTarget(request);
                }
            }
        }


        while (!hooksEventsThread.isInterrupted()) {
            HooksEventPayload eventPayload;
            try {
                eventPayload = hooksEventsQueue.take();
            } catch (InterruptedException e) {
                // silently exit as probably
                return;
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
                    stoppedThread = getThread(classLoadEvent.eventId(), classLoadEvent.threadObj());
                    stoppedThreadCallStack = convertCallStack(classLoadEvent.eventId(), classLoadEvent.callStack());
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
                    // there is no JDWP event for this
                    // notify that thread is suspended and if it is expected it will update stack,
                    // otherwise thread will be released
                    delegates.threads().onThreadSuspended(stoppedThread, stoppedThreadCallStack, false);

                    // no event to be processed
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
        if (suspendPolicy <= 0) {
            if (suspendPolicy < 0) {
                // event was filtered out, e.g. JDWP client is not interested in it

                // there are two cases when stepping has to be resumed
                // 1. VM performed stepped event but thread is stopped in class that is filtered out, so we have to
                //    continue stepping till stop that was requested
                // 2. there was exception generated in VM (probably it will be handled) and JDWP client is not interested
                //    in it, in this case stepping/stepping over/stepping out shall be resumed
                if ((eventPayload.eventId() == HookConsts.events.THREAD_STEPPED || eventPayload.eventId() == HookConsts.events.EXCEPTION) &&
                        stoppedThread != null && activeStepRequest != null && !((JdwpEventRequest) activeStepRequest.payload()).isCanceled()) {
                    if (activeStepRequest.thread().refId() == stoppedThread.refId() && stoppedThread.suspendCount() == 0) {
                        // step again
                        delegates.runtime().restep(activeStepRequest);
                        delegates.threads().onThreadSuspended(stoppedThread, stoppedThreadCallStack, false);
                        return;
                    }
                }
                // event didn't pass filters no need to keep suspended thread
            }

            // or it pass but suspend policy is none
            if (stoppedThread != null)
                delegates.threads().onThreadSuspended(stoppedThread, stoppedThreadCallStack, false);
        } else {
            if (stoppedThread != null) {
                delegates.threads().onThreadSuspended(stoppedThread, stoppedThreadCallStack, true);
                if (suspendPolicy == JdwpConsts.SuspendPolicy.ALL) {
                    // suspend all threads (stopped one already suspended)
                    delegates.threads().suspendAllOtherThreads(stoppedThread);
                }
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
            for (JdwpEventRequest request : jdwpEventRequests) {
                if (request.isCanceled())
                    continue;
                // check if event type matched
                if (eventData.eventKind() != request.eventKind())
                    continue;
                boolean testResult = request.test(eventData);
                // check if there was case counter and it has been decremented to zero -- in this case this
                // event will never fire again so mark it as canceled
                EventModCountPredicate predicate = request.predicateByKind(JdwpConsts.EventModifier.CASE_COUNT);
                if (predicate != null && predicate.modCount() < 0)
                    request.setCanceled(true);
                if (!testResult)
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
        if (!classInfo.isClass())
            throw new DebuggerException("Class load event for not class " + classInfo.signature());

        VmThread thread = event.threadObj() != 0 ? getThread(event.eventId(), event.threadObj()) : null;

        // jdpw object
        return new JdwpClassLoadedEventData(JdwpConsts.EventKind.CLASS_PREPARE, thread, (ClassInfoImpl) classInfo);
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
            thread = delegates.instances().instanceByPointer(event.threadObj(), event.thread(), true);
            delegates.state().threads().add(thread);

            log.debug("THREAD_STARTED: " + thread);

            return new JdwpEventData(JdwpConsts.EventKind.THREAD_START, thread);
        }

        if (thread == null)
            throw new DebuggerException("Thread " + Long.toHexString(event.threadObj()) + " is not recognized!");

        switch (event.eventId()) {
            case HookConsts.events.THREAD_RESUMED:
                log.debug("THREAD_RESUMED: " + thread);

                thread.setStatus(VmThread.Status.RUNNING);
                // there is no corresponding JDPW event

                return null;

            case HookConsts.events.THREAD_DETTACHED:
                log.debug("THREAD_DETTACHED: " + thread);

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
        VmStackTrace topTrace = callStack.length > 0 ? callStack[0] : null;
        switch (event.eventId()) {
            case HookConsts.events.EXCEPTION:
                ClassInfo ci = delegates.instances().classInfoLoader().resolveObjectRuntimeDataTypeInfo(event.throwable());
                VmInstance exception = new VmInstance(event.throwable(), ci);
                return new JdwpThreadStoppedEventData(JdwpConsts.EventKind.EXCEPTION, thread, topTrace, exception, event.isCaught());

            case HookConsts.events.THREAD_STEPPED:
                return new JdwpThreadStoppedEventData(JdwpConsts.EventKind.SINGLE_STEP, thread, topTrace);

            case HookConsts.events.BREAKPOINT:
                return new JdwpThreadStoppedEventData(JdwpConsts.EventKind.BREAKPOINT, thread, topTrace);

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
            log.error(HookConsts.commandToString(eventId) + ": Empty callstack!");

        return result.toArray(new VmStackTrace[result.size()]);
    }

    private VmStackTrace convertStackTrace(int eventId, HooksCallStackEntry payload) {
        String signature = "L" + payload.clazzName() + ";";
        ClassInfo classInfo = delegates.state().classInfoLoader().classInfoBySignature(signature);
        if (classInfo == null) {
            log.error(HookConsts.commandToString(eventId) + ": Failed to get get stack entry. Class is not known " +
                    payload.clazzName());
            return null;
        }

        // find method
        MethodInfo[] methods = delegates.state().classInfoLoader().classMethods(classInfo);
        long implPtr = delegates.runtime().toMachOAddr(payload.impl());
        MethodInfo methodInfo = null;
        for (MethodInfo mi : methods) {
            if (mi.implPtr() == implPtr) {
                methodInfo = mi;
                break;
            }
        }

        if (methodInfo == null) {
            log.error(HookConsts.commandToString(eventId) + ": Failed to get get stack entry. Method not found for impl " +
                    Long.toHexString(payload.impl()) + " class " + payload.clazzName());
            return null;
        }

        return new VmStackTrace(classInfo, methodInfo, payload.lineNumber(), payload.fp());
    }

    private VmThread getThread(int eventId, long threadObj) {
        VmThread thread = delegates.state().referenceRefIdHolder().instanceByAddr(threadObj);
        if (thread == null)
            throw new DebuggerException(HookConsts.commandToString(eventId) +
                    ": Thread " + Long.toHexString(threadObj) + " is not recognized!");
        return thread;
    }

    private int allocateJdwpEventRequestId() {
        return jdwpEventRequestCounter++;
    }
}
