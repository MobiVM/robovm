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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INRidesharingDomainHandlingAdapter/*</name>*/ 
    extends /*<extends>*/INListRideOptionsIntentHandlingAdapter/*</extends>*/ 
    /*<implements>*/implements INRidesharingDomainHandling/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("handleRequestRide:completion:")
    public void handleRequestRide(INRequestRideIntent intent, @Block VoidBlock1<INRequestRideIntentResponse> completion) {}
    @NotImplemented("confirmRequestRide:completion:")
    public void confirmRequestRide(INRequestRideIntent intent, @Block VoidBlock1<INRequestRideIntentResponse> completion) {}
    @NotImplemented("resolvePickupLocationForRequestRide:withCompletion:")
    public void resolvePickupLocationForRequestRide(INRequestRideIntent intent, @Block VoidBlock1<INPlacemarkResolutionResult> completion) {}
    @NotImplemented("resolveDropOffLocationForRequestRide:withCompletion:")
    public void resolveDropOffLocationForRequestRide(INRequestRideIntent intent, @Block VoidBlock1<INPlacemarkResolutionResult> completion) {}
    @NotImplemented("resolveRideOptionNameForRequestRide:withCompletion:")
    public void resolveRideOptionNameForRequestRide(INRequestRideIntent intent, @Block VoidBlock1<INSpeakableStringResolutionResult> completion) {}
    @NotImplemented("resolvePartySizeForRequestRide:withCompletion:")
    public void resolvePartySizeForRequestRide(INRequestRideIntent intent, @Block VoidBlock1<INIntegerResolutionResult> completion) {}
    /**
     * @since Available in iOS 10.3 and later.
     */
    @NotImplemented("resolveScheduledPickupTimeForRequestRide:withCompletion:")
    public void resolveScheduledPickupTimeForRequestRide(INRequestRideIntent intent, @Block VoidBlock1<INDateComponentsRangeResolutionResult> completion) {}
    @NotImplemented("handleGetRideStatus:completion:")
    public void handleGetRideStatus(INGetRideStatusIntent intent, @Block VoidBlock1<INGetRideStatusIntentResponse> completion) {}
    @NotImplemented("startSendingUpdatesForGetRideStatus:toObserver:")
    public void startSendingUpdatesForGetRideStatus(INGetRideStatusIntent intent, INGetRideStatusIntentResponseObserver observer) {}
    @NotImplemented("stopSendingUpdatesForGetRideStatus:")
    public void stopSendingUpdatesForGetRideStatus(INGetRideStatusIntent intent) {}
    @NotImplemented("confirmGetRideStatus:completion:")
    public void confirmGetRideStatus(INGetRideStatusIntent intent, @Block VoidBlock1<INGetRideStatusIntentResponse> completion) {}
    @NotImplemented("handleCancelRide:completion:")
    public void handleCancelRide(INCancelRideIntent intent, @Block VoidBlock1<INCancelRideIntentResponse> completion) {}
    @NotImplemented("confirmCancelRide:completion:")
    public void confirmCancelRide(INCancelRideIntent intent, @Block VoidBlock1<INCancelRideIntentResponse> completion) {}
    @NotImplemented("handleSendRideFeedback:completion:")
    public void handleSendRideFeedback(INSendRideFeedbackIntent sendRideFeedbackintent, @Block VoidBlock1<INSendRideFeedbackIntentResponse> completion) {}
    @NotImplemented("confirmSendRideFeedback:completion:")
    public void confirmSendRideFeedback(INSendRideFeedbackIntent sendRideFeedbackIntent, @Block VoidBlock1<INSendRideFeedbackIntentResponse> completion) {}
    /*</methods>*/
}
