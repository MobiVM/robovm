package org.robovm.debugger.jdwp.handlers.eventrequest.events;

import org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates.EventPredicate;

import java.util.List;

/**
 * @author Demyan Kimitsa
 * Interface that will be shared with JDWP handlers to deliver event requests for processingl
 */
public interface IJdwpEventDelegate {

    /**
     * set event request
     */
     int jdwpSetEventRequest(byte eventKind, byte suspendPolicy, List<EventPredicate> predicates);

    /**
     * Clear previously set event request
     *
     * @param eventKind Event kind to clear
     * @param requestID ID of request to clear
     * @return JDWP error code
     */
    short jdwpClearEventRequest(byte eventKind, int requestID);

    /**
     * remove all breakpoint event types
     */
    void jdwpClearAllBreakpoints();

    /**
     * stops sending events to JDPW but keeps buffering them
     */
    void jdwpHoldEvents();

    /**
     * resumes sending of all events -- also sends buffered events
     */
    void jdwpReleaseEvents();
}
