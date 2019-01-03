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
package org.robovm.apple.classkit;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ClassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CLSActivity/*</name>*/ 
    extends /*<extends>*/CLSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CLSActivityPtr extends Ptr<CLSActivity, CLSActivityPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CLSActivity.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CLSActivity() {}
    protected CLSActivity(Handle h, long handle) { super(h, handle); }
    protected CLSActivity(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "progress")
    public native double getProgress();
    @Property(selector = "setProgress:")
    public native void setProgress(double v);
    @Property(selector = "duration")
    public native double getDuration();
    @Property(selector = "primaryActivityItem")
    public native CLSActivityItem getPrimaryActivityItem();
    @Property(selector = "setPrimaryActivityItem:")
    public native void setPrimaryActivityItem(CLSActivityItem v);
    @Property(selector = "additionalActivityItems")
    public native NSArray<CLSActivityItem> getAdditionalActivityItems();
    @Property(selector = "isStarted")
    public native boolean isStarted();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addProgressRangeFromStart:toEnd:")
    public native void addProgressRange(double start, double end);
    @Method(selector = "addAdditionalActivityItem:")
    public native void addAdditionalActivityItem(CLSActivityItem activityItem);
    @Method(selector = "start")
    public native void start();
    @Method(selector = "stop")
    public native void stop();
    /*</methods>*/
}
