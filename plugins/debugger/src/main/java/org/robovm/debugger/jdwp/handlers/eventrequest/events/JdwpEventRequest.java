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
package org.robovm.debugger.jdwp.handlers.eventrequest.events;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.predicates.EventPredicate;

import java.util.List;
import java.util.Set;

/**
 * @author Demyan Kimitsa
 * Event container as received from JDWP Event Set command
 */
public class JdwpEventRequest {
    private final int requestId;
    private final byte eventKind;
    private final byte suspendPolicy;
    private final List<EventPredicate> predicates;
    private boolean canceled;
    private Set<String> filteredClassNames;

    public JdwpEventRequest(int requestId, byte eventKind, byte suspendPolicy, List<EventPredicate> predicates) {
        this.requestId = requestId;
        this.eventKind = eventKind;
        this.suspendPolicy = suspendPolicy;
        this.predicates = predicates;
    }

    public boolean test(EventData data) {
        // test through all predicates
        for (EventPredicate predicate : predicates)
            if (!predicate.test(data))
                return false;
        return true;
    }

    public boolean test(EventData data, int modifierKind) {
        // test through specific predicates
        for (EventPredicate predicate : predicates)
            if (predicate.modifierKind() == modifierKind && !predicate.test(data))
                return false;
        return true;
    }

    public int requestId() {
        return requestId;
    }

    public byte eventKind() {
        return eventKind;
    }

    public byte suspendPolicy() {
        return suspendPolicy;
    }

    public List<EventPredicate> predicates() {
        return predicates;
    }

    public <T> T predicateByKind(byte modifierKind) {
        for (EventPredicate predicate : predicates)
            if (predicate.modifierKind() == modifierKind)
                //noinspection unchecked
                return (T)predicate;
        return null;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }

    @Override
    public String toString() {
        return "JdwpEventRequest{" +
                "requestId=" + requestId +
                ", eventKind=" + JdwpConsts.stringEventKind(eventKind) +
                ", suspendPolicy=" + JdwpConsts.stringSuspendPolicy(suspendPolicy) +
                ", predicates=" + predicates +
                '}';
    }

    public void setFilteredClassNames(Set<String> filteredClassNames) {
        this.filteredClassNames = filteredClassNames;
    }

    public Set<String> filteredClassNames() {
        return filteredClassNames;
    }
}
