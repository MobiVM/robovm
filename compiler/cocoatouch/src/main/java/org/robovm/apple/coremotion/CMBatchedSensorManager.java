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

/*</javadoc>*/
/*<annotations>*/@Library("CoreMotion") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CMBatchedSensorManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CMBatchedSensorManagerPtr extends Ptr<CMBatchedSensorManager, CMBatchedSensorManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CMBatchedSensorManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CMBatchedSensorManager() {}
    protected CMBatchedSensorManager(Handle h, long handle) { super(h, handle); }
    protected CMBatchedSensorManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "authorizationStatus")
    public static native CMAuthorizationStatus getAuthorizationStatus();
    @Property(selector = "isAccelerometerSupported")
    public static native boolean isAccelerometerSupported();
    @Property(selector = "isAccelerometerActive")
    public native boolean isAccelerometerActive();
    @Property(selector = "accelerometerDataFrequency")
    public native @MachineSizedSInt long getAccelerometerDataFrequency();
    @Property(selector = "accelerometerBatch")
    public native NSArray<CMAccelerometerData> getAccelerometerBatch();
    @Property(selector = "isDeviceMotionSupported")
    public static native boolean isDeviceMotionSupported();
    @Property(selector = "deviceMotionDataFrequency")
    public native @MachineSizedSInt long getDeviceMotionDataFrequency();
    @Property(selector = "isDeviceMotionActive")
    public native boolean isDeviceMotionActive();
    @Property(selector = "deviceMotionBatch")
    public native NSArray<CMDeviceMotion> getDeviceMotionBatch();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "startAccelerometerUpdates")
    public native void startAccelerometerUpdates();
    @Method(selector = "startAccelerometerUpdatesWithHandler:")
    public native void startAccelerometerUpdates(@Block VoidBlock2<NSArray<CMAccelerometerData>, NSError> handler);
    @Method(selector = "stopAccelerometerUpdates")
    public native void stopAccelerometerUpdates();
    @Method(selector = "startDeviceMotionUpdates")
    public native void startDeviceMotionUpdates();
    @Method(selector = "startDeviceMotionUpdatesWithHandler:")
    public native void startDeviceMotionUpdates(@Block VoidBlock2<NSArray<CMDeviceMotion>, NSError> handler);
    @Method(selector = "stopDeviceMotionUpdates")
    public native void stopDeviceMotionUpdates();
    /*</methods>*/
}
