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
package org.robovm.apple.soundanalysis;

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
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coreml.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SoundAnalysis") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SNTimeDurationConstraint/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SNTimeDurationConstraintPtr extends Ptr<SNTimeDurationConstraint, SNTimeDurationConstraintPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SNTimeDurationConstraint.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SNTimeDurationConstraint() {}
    protected SNTimeDurationConstraint(Handle h, long handle) { super(h, handle); }
    protected SNTimeDurationConstraint(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEnumeratedDurations:")
    public SNTimeDurationConstraint(NSArray<NSValue> enumeratedDurations) { super((SkipInit) null); initObject(init(enumeratedDurations)); }
    @Method(selector = "initWithDurationRange:")
    public SNTimeDurationConstraint(@ByVal CMTimeRange durationRange) { super((SkipInit) null); initObject(init(durationRange)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "type")
    public native SNTimeDurationConstraintType getType();
    @Property(selector = "enumeratedDurations")
    public native NSArray<NSValue> getEnumeratedDurations();
    @Property(selector = "durationRange")
    public native @ByVal CMTimeRange getDurationRange();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEnumeratedDurations:")
    protected native @Pointer long init(NSArray<NSValue> enumeratedDurations);
    @Method(selector = "initWithDurationRange:")
    protected native @Pointer long init(@ByVal CMTimeRange durationRange);
    /*</methods>*/
}
