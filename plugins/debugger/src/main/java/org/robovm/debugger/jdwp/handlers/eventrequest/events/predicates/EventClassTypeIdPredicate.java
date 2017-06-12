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
 * Predicate that matches against class type id
 */
public class EventClassTypeIdPredicate extends EventPredicate {
    private final long classTypeId;

    public EventClassTypeIdPredicate(int modifier, long classTypeId) {
        super(modifier);
        this.classTypeId = classTypeId;
    }

    @Override
    public boolean test(EventData eventData) {
        return classTypeId == eventData.getClassTypeId();
    }

    public long classTypeId() {
        return classTypeId;
    }

    @Override
    public String toString() {
        return "classTypeId=" + classTypeId;
    }
}
