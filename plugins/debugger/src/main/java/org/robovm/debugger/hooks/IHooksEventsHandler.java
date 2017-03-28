package org.robovm.debugger.hooks;

import org.robovm.debugger.hooks.payloads.HooksEventPayload;

/**
 * @author Demyan Kimitsa
 */
public interface IHooksEventsHandler {
    void onHooksTargetAttached(IHooksApi api, long robovmBaseSymbol);
    void onHooksTargetEvent(HooksEventPayload eventPayload);
}
