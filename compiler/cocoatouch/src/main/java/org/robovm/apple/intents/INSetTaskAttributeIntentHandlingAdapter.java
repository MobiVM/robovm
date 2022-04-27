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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSetTaskAttributeIntentHandlingAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements INSetTaskAttributeIntentHandling/*</implements>*/ {

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
    @NotImplemented("handleSetTaskAttribute:completion:")
    public void handleSetTaskAttribute(INSetTaskAttributeIntent intent, @Block VoidBlock1<INSetTaskAttributeIntentResponse> completion) {}
    @NotImplemented("confirmSetTaskAttribute:completion:")
    public void confirmSetTaskAttribute(INSetTaskAttributeIntent intent, @Block VoidBlock1<INSetTaskAttributeIntentResponse> completion) {}
    @NotImplemented("resolveTargetTaskForSetTaskAttribute:withCompletion:")
    public void resolveTargetTaskForSetTaskAttribute(INSetTaskAttributeIntent intent, @Block VoidBlock1<INTaskResolutionResult> completion) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("resolveTaskTitleForSetTaskAttribute:withCompletion:")
    public void resolveTaskTitleForSetTaskAttribute(INSetTaskAttributeIntent intent, @Block VoidBlock1<INSpeakableStringResolutionResult> completion) {}
    @NotImplemented("resolveStatusForSetTaskAttribute:withCompletion:")
    public void resolveStatusForSetTaskAttribute(INSetTaskAttributeIntent intent, @Block VoidBlock1<INTaskStatusResolutionResult> completion) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("resolvePriorityForSetTaskAttribute:withCompletion:")
    public void resolvePriorityForSetTaskAttribute(INSetTaskAttributeIntent intent, @Block VoidBlock1<INTaskPriorityResolutionResult> completion) {}
    @NotImplemented("resolveSpatialEventTriggerForSetTaskAttribute:withCompletion:")
    public void resolveSpatialEventTriggerForSetTaskAttribute(INSetTaskAttributeIntent intent, @Block VoidBlock1<INSpatialEventTriggerResolutionResult> completion) {}
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 13.0. resolveTemporalEventTriggerForSetTaskAttribute:withCompletion: is deprecated. Use resolveTemporalEventTriggerForSetTaskAttribute:completion: instead
     */
    @Deprecated
    @NotImplemented("resolveTemporalEventTriggerForSetTaskAttribute:withCompletion:")
    public void resolveTemporalEventTriggerForSetTaskAttribute(INSetTaskAttributeIntent intent, @Block VoidBlock1<INTemporalEventTriggerResolutionResult> completion) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("resolveTemporalEventTriggerForSetTaskAttribute:completion:")
    public void resolveTemporalEventTrigger(INSetTaskAttributeIntent intent, @Block VoidBlock1<INSetTaskAttributeTemporalEventTriggerResolutionResult> completion) {}
    /*</methods>*/
}
