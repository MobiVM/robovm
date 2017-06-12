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
 * Predicate that matches against thread ref id
 */
public class EventThreadRefIdPredicate extends EventPredicate {

    private final long threadRefId;

    public EventThreadRefIdPredicate(int modifier, long threadRefId) {
        super(modifier);
        this.threadRefId = threadRefId;
    }

    public long threadRefId() {
        return threadRefId;
    }

    @Override
    public boolean test(EventData eventData) {
        return eventData.getThreadRefId() == threadRefId;
    }

    @Override
    public String toString() {
        return "threadRefId{" + threadRefId + "}";
    }
}
