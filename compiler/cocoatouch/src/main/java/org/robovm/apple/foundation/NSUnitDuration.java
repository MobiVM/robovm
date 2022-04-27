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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSUnitDuration/*</name>*/ 
    extends /*<extends>*/NSDimension/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NSUnitDurationPtr extends Ptr<NSUnitDuration, NSUnitDurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSUnitDuration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSUnitDuration() {}
    protected NSUnitDuration(Handle h, long handle) { super(h, handle); }
    protected NSUnitDuration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSymbol:converter:")
    public NSUnitDuration(String symbol, NSUnitConverter converter) { super(symbol, converter); }
    @Method(selector = "initWithSymbol:")
    public NSUnitDuration(String symbol) { super(symbol); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "hours")
    public static native NSUnitDuration getHours();
    @Property(selector = "minutes")
    public static native NSUnitDuration getMinutes();
    @Property(selector = "seconds")
    public static native NSUnitDuration getSeconds();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "milliseconds")
    public static native NSUnitDuration getMilliseconds();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "microseconds")
    public static native NSUnitDuration getMicroseconds();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "nanoseconds")
    public static native NSUnitDuration getNanoseconds();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "picoseconds")
    public static native NSUnitDuration getPicoseconds();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "baseUnit")
    public static native NSUnitDuration getBaseUnit();
    /*</methods>*/
}
