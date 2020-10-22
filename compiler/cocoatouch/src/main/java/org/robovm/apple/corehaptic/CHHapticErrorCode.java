/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.corehaptic;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/CHHapticErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    EngineNotRunning(-4805L),
    OperationNotPermitted(-4806L),
    EngineStartTimeout(-4808L),
    NotSupported(-4809L),
    ServerInitFailed(-4810L),
    ServerInterrupted(-4811L),
    InvalidPatternPlayer(-4812L),
    InvalidPatternData(-4813L),
    InvalidPatternDictionary(-4814L),
    InvalidAudioSession(-4815L),
    InvalidParameterType(-4820L),
    InvalidEventType(-4821L),
    InvalidEventTime(-4822L),
    InvalidEventDuration(-4823L),
    InvalidAudioResource(-4824L),
    ResourceNotAvailable(-4825L),
    BadEventEntry(-4830L),
    BadParameterEntry(-4831L),
    InvalidTime(-4840L),
    UnknownError(-4898L),
    MemoryError(-4899L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*/
    public static final String ClassDomain = "com.apple.CoreHaptics";
    /*</constants>*/
    /*<members>*//*</members>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/CHHapticErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/CHHapticErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/CHHapticErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in "
            + /*<name>*/CHHapticErrorCode/*</name>*/.class.getName());
    }

    // dkimitsa: manually added as CoreHapticsErrorDomain is static global
    public static String getClassDomain() {
        return ClassDomain;
    }

    // bind wrap to include it in compilation as long as nserror enum is used
    static { Bro.bind(NSErrorWrap.class); }
    @StronglyLinked
    public static class NSErrorWrap extends NSError {
        protected NSErrorWrap(SkipInit skipInit) {super(skipInit);}

        @Override public NSErrorCode getErrorCode() {
             try {
                 return  /*<name>*/CHHapticErrorCode/*</name>*/.valueOf(getCode());
             } catch (IllegalArgumentException e) {
                 return null;
             }
         }

        public static String getClassDomain() {
            /** must be inserted in value section */
            return /*<name>*/CHHapticErrorCode/*</name>*/.getClassDomain();
        }
    }
}
