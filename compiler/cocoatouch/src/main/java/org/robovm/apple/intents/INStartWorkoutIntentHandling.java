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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/INStartWorkoutIntentHandling/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "handleStartWorkout:completion:")
    void handleStartWorkout(INStartWorkoutIntent intent, @Block VoidBlock1<INStartWorkoutIntentResponse> completion);
    @Method(selector = "confirmStartWorkout:completion:")
    void confirmStartWorkout(INStartWorkoutIntent intent, @Block VoidBlock1<INStartWorkoutIntentResponse> completion);
    @Method(selector = "resolveWorkoutNameForStartWorkout:withCompletion:")
    void resolveWorkoutNameForStartWorkout(INStartWorkoutIntent intent, @Block VoidBlock1<INSpeakableStringResolutionResult> completion);
    @Method(selector = "resolveGoalValueForStartWorkout:withCompletion:")
    void resolveGoalValueForStartWorkout(INStartWorkoutIntent intent, @Block VoidBlock1<INDoubleResolutionResult> completion);
    @Method(selector = "resolveWorkoutGoalUnitTypeForStartWorkout:withCompletion:")
    void resolveWorkoutGoalUnitTypeForStartWorkout(INStartWorkoutIntent intent, @Block VoidBlock1<INWorkoutGoalUnitTypeResolutionResult> completion);
    @Method(selector = "resolveWorkoutLocationTypeForStartWorkout:withCompletion:")
    void resolveWorkoutLocationTypeForStartWorkout(INStartWorkoutIntent intent, @Block VoidBlock1<INWorkoutLocationTypeResolutionResult> completion);
    @Method(selector = "resolveIsOpenEndedForStartWorkout:withCompletion:")
    void resolveIsOpenEndedForStartWorkout(INStartWorkoutIntent intent, @Block VoidBlock1<INBooleanResolutionResult> completion);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
