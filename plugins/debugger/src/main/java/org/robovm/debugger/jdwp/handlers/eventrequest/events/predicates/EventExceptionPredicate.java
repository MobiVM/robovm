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
 *         Predicate that matches exception
 */
public class EventExceptionPredicate extends EventPredicate {
    public final long refTypeId;
    public final boolean caught;
    public final boolean uncaught;

    public EventExceptionPredicate(int modifier, long refTypeId, boolean caught, boolean uncaught) {
        super(modifier);
        this.refTypeId = refTypeId;
        this.caught = caught;
        this.uncaught = uncaught;
    }

    public long refTypeId() {
        return refTypeId;
    }

    @Override
    public boolean test(EventData eventData) {
        // TODO: handle subtypes
        if (refTypeId != 0 && refTypeId != eventData.getExceptionTypeId())
            return false;
        if (caught && eventData.isExceptionCaught() || uncaught && !eventData.isExceptionCaught())
            return true;

        // doesn't match
        return false;
    }

    @Override
    public String toString() {
        return "exceptionType=" + refTypeId + "(caught=" + caught + ", uncaught=" + uncaught + ")";
    }
}
