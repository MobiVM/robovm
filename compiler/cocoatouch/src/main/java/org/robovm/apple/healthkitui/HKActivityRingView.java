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
package org.robovm.apple.healthkitui;

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
import org.robovm.apple.healthkit.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKitUI") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKActivityRingView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKActivityRingViewPtr extends Ptr<HKActivityRingView, HKActivityRingViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKActivityRingView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HKActivityRingView() {}
    protected HKActivityRingView(Handle h, long handle) { super(h, handle); }
    protected HKActivityRingView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public HKActivityRingView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public HKActivityRingView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "activitySummary")
    public native HKActivitySummary getActivitySummary();
    @Property(selector = "setActivitySummary:")
    public native void setActivitySummary(HKActivitySummary v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setActivitySummary:animated:")
    public native void setActivitySummary(HKActivitySummary activitySummary, boolean animated);
    /*</methods>*/
}
