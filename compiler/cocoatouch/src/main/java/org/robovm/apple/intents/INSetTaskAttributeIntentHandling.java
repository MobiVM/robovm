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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/INSetTaskAttributeIntentHandling/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "handleSetTaskAttribute:completion:")
    void handleSetTaskAttribute(INSetTaskAttributeIntent intent, @Block VoidBlock1<INSetTaskAttributeIntentResponse> completion);
    @Method(selector = "confirmSetTaskAttribute:completion:")
    void confirmSetTaskAttribute(INSetTaskAttributeIntent intent, @Block VoidBlock1<INSetTaskAttributeIntentResponse> completion);
    @Method(selector = "resolveTargetTaskForSetTaskAttribute:withCompletion:")
    void resolveTargetTaskForSetTaskAttribute(INSetTaskAttributeIntent intent, @Block VoidBlock1<INTaskResolutionResult> completion);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "resolveTaskTitleForSetTaskAttribute:withCompletion:")
    void resolveTaskTitleForSetTaskAttribute(INSetTaskAttributeIntent intent, @Block VoidBlock1<INSpeakableStringResolutionResult> completion);
    @Method(selector = "resolveStatusForSetTaskAttribute:withCompletion:")
    void resolveStatusForSetTaskAttribute(INSetTaskAttributeIntent intent, @Block VoidBlock1<INTaskStatusResolutionResult> completion);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "resolvePriorityForSetTaskAttribute:withCompletion:")
    void resolvePriorityForSetTaskAttribute(INSetTaskAttributeIntent intent, @Block VoidBlock1<INTaskPriorityResolutionResult> completion);
    @Method(selector = "resolveSpatialEventTriggerForSetTaskAttribute:withCompletion:")
    void resolveSpatialEventTriggerForSetTaskAttribute(INSetTaskAttributeIntent intent, @Block VoidBlock1<INSpatialEventTriggerResolutionResult> completion);
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 13.0. resolveTemporalEventTriggerForSetTaskAttribute:withCompletion: is deprecated. Use resolveTemporalEventTriggerForSetTaskAttribute:completion: instead
     */
    @Deprecated
    @Method(selector = "resolveTemporalEventTriggerForSetTaskAttribute:withCompletion:")
    void resolveTemporalEventTriggerForSetTaskAttribute(INSetTaskAttributeIntent intent, @Block VoidBlock1<INTemporalEventTriggerResolutionResult> completion);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "resolveTemporalEventTriggerForSetTaskAttribute:completion:")
    void resolveTemporalEventTrigger(INSetTaskAttributeIntent intent, @Block VoidBlock1<INSetTaskAttributeTemporalEventTriggerResolutionResult> completion);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
