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
package org.robovm.apple.coremotion;

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
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreMotion") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CMHeadphoneActivityManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CMHeadphoneActivityManagerPtr extends Ptr<CMHeadphoneActivityManager, CMHeadphoneActivityManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CMHeadphoneActivityManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CMHeadphoneActivityManager() {}
    protected CMHeadphoneActivityManager(Handle h, long handle) { super(h, handle); }
    protected CMHeadphoneActivityManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isActivityAvailable")
    public native boolean isActivityAvailable();
    @Property(selector = "isActivityActive")
    public native boolean isActivityActive();
    @Property(selector = "isStatusAvailable")
    public native boolean isStatusAvailable();
    @Property(selector = "isStatusActive")
    public native boolean isStatusActive();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "startActivityUpdatesToQueue:withHandler:")
    public native void startActivityUpdates(NSOperationQueue queue, @Block VoidBlock2<CMMotionActivity, NSError> handler);
    @Method(selector = "stopActivityUpdates")
    public native void stopActivityUpdates();
    @Method(selector = "startStatusUpdatesToQueue:withHandler:")
    public native void startStatusUpdates(NSOperationQueue queue, @Block VoidBlock2<CMHeadphoneActivityStatus, NSError> handler);
    @Method(selector = "stopStatusUpdates")
    public native void stopStatusUpdates();
    @Method(selector = "authorizationStatus")
    public static native CMAuthorizationStatus authorizationStatus();
    /*</methods>*/
}
