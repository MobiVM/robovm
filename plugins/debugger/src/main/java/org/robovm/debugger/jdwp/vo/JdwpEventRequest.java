package org.robovm.debugger.jdwp.vo;

import java.util.List;
import java.util.Set;

/**
 * @author Demyan Kimitsa
 * Event container as received from JDWP Event Set command
 */
public class JdwpEventRequest {
    public final int requestId;
    public final byte eventKind;
    public final byte suspendPolicy;
    public final long threadID;
    public final int caseCount;
    public final Set<Long> referenceTypeIDs;
    public final List<String> classMatchPatterns;
    public final List<String> classExcludePatterns;
    public final List<ExceptionMod> exceptions;
    public final List<LocationMod> locations;
    public final Set<Long> instancesIDs;
    public final StepMod step;

    public JdwpEventRequest(int requestId, byte eventKind, byte suspendPolicy, long threadID, int caseCount,
                            Set<Long> referenceTypeIDs, List<String> classMatchPatterns, List<String> classExcludePatterns,
                            List<ExceptionMod> exceptions, List<LocationMod> locations, Set<Long> instancesIDs, StepMod step) {
        this.requestId = requestId;
        this.eventKind = eventKind;
        this.suspendPolicy = suspendPolicy;
        this.threadID = threadID;
        this.caseCount = caseCount;
        this.referenceTypeIDs = referenceTypeIDs;
        this.classMatchPatterns = classMatchPatterns;
        this.classExcludePatterns = classExcludePatterns;
        this.exceptions = exceptions;
        this.locations = locations;
        this.instancesIDs = instancesIDs;
        this.step = step;
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
                ", threadID=" + threadID +
                ", caseCount=" + caseCount +
                ", referenceTypeIDs=" + referenceTypeIDs +
                ", classMatchPatterns=" + classMatchPatterns +
                ", classExcludePatterns=" + classExcludePatterns +
                ", exceptions=" + exceptions +
                ", locations=" + locations +
                ", instancesIDs=" + instancesIDs +
                ", step=" + step +
                '}';
    }
}
