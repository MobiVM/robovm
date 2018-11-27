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
package org.robovm.apple.coreml;

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
import org.robovm.apple.corevideo.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class) @Library("CoreML")/*</annotations>*/
public enum /*<name>*/MLModelError/*</name>*/ implements NSErrorCode {
    /*<values>*/
    Generic(0L),
    FeatureType(1L),
    IO(3L),
    /**
     * @since Available in iOS 11.2 and later.
     */
    CustomLayer(4L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    CustomModel(5L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(MLModelError.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="MLModelErrorDomain", optional=true)
    public static native String getClassDomain();
    /*</methods>*/

    private final long n;

    private /*<name>*/MLModelError/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MLModelError/*</name>*/ valueOf(long n) {
        for (/*<name>*/MLModelError/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in "
            + /*<name>*/MLModelError/*</name>*/.class.getName());
    }

    // bind wrap to include it in compilation as long as nserror enum is used
    static { Bro.bind(NSErrorWrap.class); }
    @StronglyLinked
    public static class NSErrorWrap extends NSError {
        protected NSErrorWrap(SkipInit skipInit) {super(skipInit);}

        @Override public NSErrorCode getErrorCode() {
             try {
                 return  /*<name>*/MLModelError/*</name>*/.valueOf(getCode());
             } catch (IllegalArgumentException e) {
                 return null;
             }
         }

        public static String getClassDomain() {
            /** must be incerted in value section */
            return /*<name>*/MLModelError/*</name>*/.getClassDomain();
        }
    }
}
