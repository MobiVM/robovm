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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSDateInterval/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NSDateIntervalPtr extends Ptr<NSDateInterval, NSDateIntervalPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSDateInterval.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSDateInterval() {}
    protected NSDateInterval(Handle h, long handle) { super(h, handle); }
    protected NSDateInterval(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public NSDateInterval(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    @Method(selector = "initWithStartDate:duration:")
    public NSDateInterval(NSDate startDate, double duration) { super((SkipInit) null); initObject(init(startDate, duration)); }
    @Method(selector = "initWithStartDate:endDate:")
    public NSDateInterval(NSDate startDate, NSDate endDate) { super((SkipInit) null); initObject(init(startDate, endDate)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "startDate")
    public native NSDate getStartDate();
    @Property(selector = "endDate")
    public native NSDate getEndDate();
    @Property(selector = "duration")
    public native double getDuration();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "initWithStartDate:duration:")
    protected native @Pointer long init(NSDate startDate, double duration);
    @Method(selector = "initWithStartDate:endDate:")
    protected native @Pointer long init(NSDate startDate, NSDate endDate);
    @Method(selector = "compare:")
    public native NSComparisonResult compare(NSDateInterval dateInterval);
    @Method(selector = "isEqualToDateInterval:")
    public native boolean equalsTo(NSDateInterval dateInterval);
    @Method(selector = "intersectsDateInterval:")
    public native boolean intersects(NSDateInterval dateInterval);
    @Method(selector = "intersectionWithDateInterval:")
    public native NSDateInterval getIntersection(NSDateInterval dateInterval);
    @Method(selector = "containsDate:")
    public native boolean containsDate(NSDate date);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
