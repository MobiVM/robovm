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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreMotion") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CMHeadphoneMotionManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CMHeadphoneMotionManagerPtr extends Ptr<CMHeadphoneMotionManager, CMHeadphoneMotionManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CMHeadphoneMotionManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CMHeadphoneMotionManager() {}
    protected CMHeadphoneMotionManager(Handle h, long handle) { super(h, handle); }
    protected CMHeadphoneMotionManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native CMHeadphoneMotionManagerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(CMHeadphoneMotionManagerDelegate v);
    @Property(selector = "isDeviceMotionAvailable")
    public native boolean isDeviceMotionAvailable();
    @Property(selector = "isDeviceMotionActive")
    public native boolean isDeviceMotionActive();
    @Property(selector = "deviceMotion")
    public native CMDeviceMotion getDeviceMotion();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "startDeviceMotionUpdates")
    public native void startDeviceMotionUpdates();
    @Method(selector = "startDeviceMotionUpdatesToQueue:withHandler:")
    public native void startDeviceMotionUpdates(NSOperationQueue queue, @Block VoidBlock2<CMDeviceMotion, NSError> handler);
    @Method(selector = "stopDeviceMotionUpdates")
    public native void stopDeviceMotionUpdates();
    @Method(selector = "authorizationStatus")
    public static native CMAuthorizationStatus authorizationStatus();
    /*</methods>*/
}
