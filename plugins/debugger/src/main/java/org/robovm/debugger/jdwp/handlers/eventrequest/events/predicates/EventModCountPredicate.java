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
 * Predicate that matches number of events this event request fired
 */
public class EventModCountPredicate extends EventPredicate {
    private int modCount;

    public EventModCountPredicate(int modifier, int modCount) {
        super(modifier);
        this.modCount = modCount;
    }

    public int modCount() {
        return modCount;
    }

    @Override
    public boolean test(EventData eventData) {
        if (modCount < 0)
            return false;

        if (modCount == 1) {
            // passed this predicate, this allowed only once, make it never run again
            modCount = -1;
            return true;
        }

        // keep counting
        modCount -= 1;
        return false;
    }

    @Override
    public String toString() {
        return "count=" + modCount;
    }
}
