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
package org.robovm.debugger.state.refid;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Demyan Kimitsa
 * Class intended to generate reference ID and keep map of id to object and vice verse
 * Also the to increment Id by specific number to allow find out the type of id.
 */
public class RefIdHolder<T extends RefIdHolder.IRefIdObject> {

    /** interface for object to work with this clss */
    public interface IRefIdObject {
        void setRefId(long refId);
        long refId();
    }

    /** types of ref-ids */
    public enum RefIdType {
        CLASS_TYPE,
        FIELD_TYPE,
        METHOD_TYPE,
        REFERENCE_TYPE,
        FRAME_TYPE,
    }

    private final AtomicLong generator;
    protected final Map<Long, T> idToObject;
    private final long refIdStep;

    public RefIdHolder(RefIdType type) {
        // get next power of 2 of type
        refIdStep = RefIdType.values().length;
        generator = new AtomicLong(type.ordinal());
        idToObject = new HashMap<>();
    }

    public T addObject(T obj) {
        long refId = generator.addAndGet(refIdStep);
        obj.setRefId(refId);
        synchronized (idToObject) {
            idToObject.put(refId, obj);
        }

        return obj;
    }

    public T removeObject(T obj) {
        synchronized (idToObject) {
            return idToObject.remove(obj.refId());
        }
    }

    public T objectById(long refId) {
        synchronized (idToObject) {
            return idToObject.get(refId);
        }
    }

    public RefIdType typeOf(T obj) {
        long refIdTypeIdx = obj.refId() % refIdStep;
        return RefIdType.values()[(int) refIdTypeIdx];
    }
}
