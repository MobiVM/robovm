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

    public String pattern() {
        return pattern;
    }

    public boolean isNegative() {
        return negative;
    }

    public boolean isExact() {
        return !pattern.startsWith("*") && !pattern.endsWith("*");
    }

    @Override
    public boolean test(EventData eventData) {
        boolean result = matchPattern(pattern, eventData.getClassName());
        return negative ? !result : result;
    }

    public static boolean matchPattern(String pattern, String str) {
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
