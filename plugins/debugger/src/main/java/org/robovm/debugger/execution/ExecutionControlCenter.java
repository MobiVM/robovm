package org.robovm.debugger.execution;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.execution.predicates.EventClassTypeIdPredicate;
import org.robovm.debugger.execution.predicates.EventExceptionPredicate;
import org.robovm.debugger.execution.predicates.EventInstanceIdPredicate;
import org.robovm.debugger.execution.predicates.EventPredicate;
import org.robovm.debugger.execution.predicates.EventStepModPredicate;
import org.robovm.debugger.execution.predicates.EventThreadRefIdPredicate;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.state.VmDebuggerState;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.utils.DbgLogger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Demyan Kimitsa
 *         Combines information received from JDWP and Hooks interface and controlls steps/breakpoints/events
 */
public class ExecutionControlCenter {
    private final DbgLogger log = DbgLogger.get(this.getClass().getSimpleName());

    // counter of request set
    private int eventRequestCounter = 100;

    // list of active event requests
    private List<JdwpEventRequest> eventRequests = new ArrayList<>();

    private VmDebuggerState state;

    /**
     * set event request
     * TODO: this method is called in context of JDWP server receiving thread. add synchronization to
     * elements once required
     */
    public int jdwpSetEventRequest(byte eventKind, byte suspendPolicy, List<EventPredicate> predicates) {

        // validate predicates
        long itemId;
        for (EventPredicate predicate : predicates) {
            switch (predicate.modifierKind()) {
                case JdwpConsts.EventModifier.CLASS_ONLY:
                    itemId = ((EventClassTypeIdPredicate) predicate).classTypeId();
                    if (state.classRefIdHolder().objectById(itemId) == null)
                        throw new DebuggerException(JdwpConsts.Error.INVALID_CLASS);
                    break;

                case JdwpConsts.EventModifier.EXCEPTION_ONLY:
                    itemId = ((EventExceptionPredicate) predicate).refTypeId();
                    if (state.classRefIdHolder().objectById(itemId) == null)
                        throw new DebuggerException(JdwpConsts.Error.INVALID_CLASS);
                    break;

                case JdwpConsts.EventModifier.THREAD_ONLY:
                    itemId = ((EventThreadRefIdPredicate) predicate).threadRefId();
                    if (state.referenceRefIdHolder().instanceById(itemId) == null)
                        throw new DebuggerException(JdwpConsts.Error.INVALID_THREAD);
                    break;

                case JdwpConsts.EventModifier.INSTANCE_ONLY:
                    itemId = ((EventInstanceIdPredicate) predicate).instaceId();
                    if (state.referenceRefIdHolder().instanceById(itemId) == null)
                        throw new DebuggerException(JdwpConsts.Error.INVALID_OBJECT);
                    break;

                case JdwpConsts.EventModifier.STEP:
                    itemId = ((EventStepModPredicate) predicate).threadId();
                    if (itemId != 0) {
                        VmThread thread = state.referenceRefIdHolder().instanceById(itemId);
                        if (thread == null)
                            throw new DebuggerException(JdwpConsts.Error.INVALID_THREAD);
                    }
                    break;
            }
        }

        // meanwhile just adding items to the list
        int requestId = eventRequestCounter += 1;
        JdwpEventRequest request = new JdwpEventRequest(requestId, eventKind, suspendPolicy, predicates);

        log.debug("jdwpSetEventRequest: " + request);

        eventRequests.add(request);
        return requestId;
    }


    /**
     * Clear previously set event request
     *
     * @param eventKind Event kind to clear
     * @param requestID ID of request to clear
     * @return JDWP error code
     * TODO: synchronization
     */
    public short jdwpClearEventRequest(byte eventKind, int requestID) {
        Iterator<JdwpEventRequest> it = eventRequests.iterator();
        while (it.hasNext()) {
            JdwpEventRequest req = it.next();
            if (req.requestId == requestID) {
                if (req.eventKind != eventKind)
                    return JdwpConsts.Error.INVALID_EVENT_TYPE;

                onEventRequestRemoved(req);
                it.remove();

                return JdwpConsts.Error.NONE;
            }
        }

        // not found
        return JdwpConsts.Error.INVALID_EVENT_TYPE;
    }

    /**
     * remove all breakpoint event types
     * TODO: synchronization
     */
    public void jdwpClearAllBreakpoints() {
        Iterator<JdwpEventRequest> it = eventRequests.iterator();
        while (it.hasNext()) {
            JdwpEventRequest req = it.next();
            if (req.eventKind == JdwpConsts.EventKind.BREAKPOINT) {
                onEventRequestRemoved(req);
                it.remove();
            }
        }
    }

    protected void onEventRequestRemoved(JdwpEventRequest request) {
        // TODO: perform device side removal of breakpoint
    }
}
