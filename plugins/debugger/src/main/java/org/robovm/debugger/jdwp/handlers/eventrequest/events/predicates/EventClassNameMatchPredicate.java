package org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates;

import org.robovm.debugger.jdwp.handlers.eventrequest.events.EventData;

/**
 * @author Demyan Kimitsa
 * Predicate that matches against class name pattern
 */
public class EventClassNameMatchPredicate extends EventPredicate {
    private final String pattern;
    private final boolean negative;

    public EventClassNameMatchPredicate(byte eventKind, String pattern, boolean negative) {
        super(eventKind);
        this.pattern = pattern;
        this.negative = negative;
    }

    @Override
    public boolean test(EventData eventData) {
        boolean result = matchPattern(pattern, eventData.getClassName());
        return negative ? !result : result;
    }

    private static boolean matchPattern(String pattern, String str) {
        if (pattern.startsWith("*")) {
            return str.regionMatches(str.length() - (pattern.length() - 1), pattern, 1, pattern.length() - 1);
        } else if (pattern.endsWith("*")) {
            return str.regionMatches(0, pattern, 0, pattern.length() - 1);
        } else return pattern.equals(str);
    }

    @Override
    public String toString() {
        return "className" + (negative ? "!=" : "=") + pattern;
    }
}
