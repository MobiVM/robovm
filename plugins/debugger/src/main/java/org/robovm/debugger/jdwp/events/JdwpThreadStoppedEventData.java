package org.robovm.debugger.jdwp.events;

import org.robovm.debugger.execution.EventData;

/**
 * @author Demyan Kimitsa
 * Event data of stopped thread (step/breakpoint)
 */
public class JdwpThreadStoppedEventData extends JdwpEventData {

    public JdwpThreadStoppedEventData(byte eventKind, long threadId) {
        super(eventKind, threadId);
    }
}
