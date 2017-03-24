package org.robovm.debugger.execution.predicates;

import org.robovm.debugger.execution.EventData;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author Demyan Kimitsa
 * Predicate that matches against class name pattern
 */
public class EventClassNameMatchPredicate implements Predicate<EventData> {
    private final List<String> patterns;
    private final boolean negative;

    public EventClassNameMatchPredicate(List<String> patterns, boolean negative) {
        this.patterns = patterns;
        this.negative = negative;
    }

    @Override
    public boolean test(EventData eventData) {
        boolean result = applyPatterns(eventData.getClassName());
        return negative ? !result : result;
    }

    private boolean applyPatterns(String className) {
        for (String p : patterns) {
            if (matchPattern(p, className))
                return true;
        }

        // doesn't match
        return false;
    }

    private static boolean matchPattern(String pattern, String str) {
        if (pattern.startsWith("*")) {
            return str.regionMatches(str.length() - (pattern.length() - 1), pattern, 1, pattern.length() - 1);
        } else if (pattern.endsWith("*")) {
            return str.regionMatches(0, pattern, 0, pattern.length() - 1);
        } else return pattern.equals(str);
    }
}
