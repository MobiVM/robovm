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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INAddTasksTemporalEventTriggerResolutionResult/*</name>*/ 
    extends /*<extends>*/INTemporalEventTriggerResolutionResult/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INAddTasksTemporalEventTriggerResolutionResultPtr extends Ptr<INAddTasksTemporalEventTriggerResolutionResult, INAddTasksTemporalEventTriggerResolutionResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INAddTasksTemporalEventTriggerResolutionResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INAddTasksTemporalEventTriggerResolutionResult() {}
    protected INAddTasksTemporalEventTriggerResolutionResult(Handle h, long handle) { super(h, handle); }
    protected INAddTasksTemporalEventTriggerResolutionResult(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTemporalEventTriggerResolutionResult:")
    public INAddTasksTemporalEventTriggerResolutionResult(INTemporalEventTriggerResolutionResult temporalEventTriggerResolutionResult) { super((SkipInit) null); initObject(init(temporalEventTriggerResolutionResult)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTemporalEventTriggerResolutionResult:")
    protected native @Pointer long init(INTemporalEventTriggerResolutionResult temporalEventTriggerResolutionResult);
    @Method(selector = "unsupportedForReason:")
    public static native INAddTasksTemporalEventTriggerResolutionResult unsupportedForReason(INAddTasksTemporalEventTriggerUnsupportedReason reason);
    @Method(selector = "successWithResolvedTemporalEventTrigger:")
    public static native INAddTasksTemporalEventTriggerResolutionResult success(INTemporalEventTrigger resolvedTemporalEventTrigger);
    @Method(selector = "disambiguationWithTemporalEventTriggersToDisambiguate:")
    public static native INAddTasksTemporalEventTriggerResolutionResult disambiguation(NSArray<INTemporalEventTrigger> temporalEventTriggersToDisambiguate);
    @Method(selector = "confirmationRequiredWithTemporalEventTriggerToConfirm:")
    public static native INAddTasksTemporalEventTriggerResolutionResult confirmationRequired(INTemporalEventTrigger temporalEventTriggerToConfirm);
    @Method(selector = "needsValue")
    public static native INAddTasksTemporalEventTriggerResolutionResult needsValue();
    @Method(selector = "notRequired")
    public static native INAddTasksTemporalEventTriggerResolutionResult notRequired();
    @Method(selector = "unsupported")
    public static native INAddTasksTemporalEventTriggerResolutionResult unsupported();
    /*</methods>*/
}
