package org.robovm.debugger.execution;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/**
 * @author Demyan Kimitsa
 * Event container as received from JDWP Event Set command
 */
public class JdwpEventRequest {
    public final int requestId;
    public final byte eventKind;
    public final byte suspendPolicy;
    public final List<Predicate<EventData>> predicates;

    public JdwpEventRequest(int requestId, byte eventKind, byte suspendPolicy, List<Predicate<EventData>> predicates) {
        this.requestId = requestId;
        this.eventKind = eventKind;
        this.suspendPolicy = suspendPolicy;
        this.predicates = predicates;
    }

    public boolean test(EventData data) {
        // test through all predicates
        for (Predicate<EventData> predicate : predicates)
            if (!predicate.test(data))
                return false;
        return true;
    }

    /** VO for step modifier */
    public static class StepMod {
        public final int size;
        public final int depth;

        public StepMod(int size, int depth) {
            this.size = size;
            this.depth = depth;
        }
    }

    /** VO for exception modifier */
    public static class ExceptionMod {
        public final long refTypeID;
        public final boolean caught;
        public final boolean uncaught;

        public ExceptionMod(long refTypeID, boolean caught, boolean uncaught) {
            this.refTypeID = refTypeID;
            this.caught = caught;
            this.uncaught = uncaught;
        }
    }

    /** VO for locations modifier */
    public static class LocationMod {
        public final byte tag;
        public final long classID;
        public final long methodID;
        public final long index;

        public LocationMod(byte tag, long classID, long methodID, long index) {
            this.tag = tag;
            this.classID = classID;
            this.methodID = methodID;
            this.index = index;
        }
    }


    @Override
    public String toString() {
        return "JdwpEventRequest{" +
                "requestId=" + requestId +
                ", eventKind=" + eventKind +
                ", suspendPolicy=" + suspendPolicy +
                ", predicates=" + predicates +
                '}';
    }
}
