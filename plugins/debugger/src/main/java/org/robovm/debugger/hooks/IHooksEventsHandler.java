package org.robovm.debugger.hooks;

/**
 * @author Demyan Kimitsa
 */
public interface IHooksEventsHandler {
    void attached(IHooksApi api, long robovmBaseSymbol);
    void handleEvent(Object eventPayload);
}
