package org.robovm.debugger.hooks.payloads;

/**
 * @author Demyan Kimitsa
 * base class for hook response/event payload
 */
public class HooksEventPayload {
    private final int eventId;

    public HooksEventPayload(int eventId) {
        this.eventId = eventId;
    }

    public int eventId() {
        return eventId;
    }
}
