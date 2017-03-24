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
        long getRefId();
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
            return idToObject.remove(obj.getRefId());
        }
    }

    public T objectById(long refId) {
        synchronized (idToObject) {
            return idToObject.get(refId);
        }
    }

    public RefIdType typeOf(T obj) {
        long refIdTypeIdx = obj.getRefId() % refIdStep;
        return RefIdType.values()[(int) refIdTypeIdx];
    }
}
