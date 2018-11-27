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
package org.robovm.apple.arkit;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class) @Library("ARKit")/*</annotations>*/
public enum /*<name>*/ARErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    UnsupportedConfiguration(100L),
    SensorUnavailable(101L),
    SensorFailed(102L),
    CameraUnauthorized(103L),
    MicrophoneUnauthorized(104L),
    WorldTrackingFailed(200L),
    /**
     * @since Available in iOS 11.3 and later.
     */
    InvalidReferenceImage(300L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    InvalidReferenceObject(301L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    InvalidWorldMap(302L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    InvalidConfiguration(303L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    InsufficientFeatures(400L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    ObjectMergeFailed(401L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    FileIOFailed(500L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(ARErrorCode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="ARErrorDomain", optional=true)
    public static native String getClassDomain();
    /*</methods>*/

    private final long n;

    private /*<name>*/ARErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/ARErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/ARErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in "
            + /*<name>*/ARErrorCode/*</name>*/.class.getName());
    }

    @StronglyLinked
    public static class NSErrorWrap extends NSError {
        protected NSErrorWrap(SkipInit skipInit) {super(skipInit);}

        @Override public NSErrorCode getErrorCode() {
             try {
                 return  /*<name>*/ARErrorCode/*</name>*/.valueOf(getCode());
             } catch (IllegalArgumentException e) {
                 return null;
             }
         }

        public static String getClassDomain() {
            /** must be incerted in value section */
            return /*<name>*/ARErrorCode/*</name>*/.getClassDomain();
        }
    }
}
