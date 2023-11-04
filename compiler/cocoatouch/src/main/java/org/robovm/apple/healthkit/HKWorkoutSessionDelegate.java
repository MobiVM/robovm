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
package org.robovm.apple.healthkit;

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
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/HKWorkoutSessionDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "workoutSession:didChangeToState:fromState:date:")
    void didChangeToState(HKWorkoutSession workoutSession, HKWorkoutSessionState toState, HKWorkoutSessionState fromState, NSDate date);
    @Method(selector = "workoutSession:didFailWithError:")
    void didFail(HKWorkoutSession workoutSession, NSError error);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "workoutSession:didGenerateEvent:")
    void didGenerateEvent(HKWorkoutSession workoutSession, HKWorkoutEvent event);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "workoutSession:didBeginActivityWithConfiguration:date:")
    void didBeginActivity(HKWorkoutSession workoutSession, HKWorkoutConfiguration workoutConfiguration, NSDate date);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "workoutSession:didEndActivityWithConfiguration:date:")
    void didEndActivity(HKWorkoutSession workoutSession, HKWorkoutConfiguration workoutConfiguration, NSDate date);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "workoutSession:didReceiveDataFromRemoteWorkoutSession:")
    void didReceiveDataFromRemoteWorkoutSession(HKWorkoutSession workoutSession, NSArray<NSData> data);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "workoutSession:didDisconnectFromRemoteDeviceWithError:")
    void didDisconnectFromRemoteDevice(HKWorkoutSession workoutSession, NSError error);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
