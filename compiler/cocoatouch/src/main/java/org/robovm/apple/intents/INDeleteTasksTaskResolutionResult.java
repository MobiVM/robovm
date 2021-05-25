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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INDeleteTasksTaskResolutionResult/*</name>*/ 
    extends /*<extends>*/INTaskResolutionResult/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INDeleteTasksTaskResolutionResultPtr extends Ptr<INDeleteTasksTaskResolutionResult, INDeleteTasksTaskResolutionResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INDeleteTasksTaskResolutionResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INDeleteTasksTaskResolutionResult() {}
    protected INDeleteTasksTaskResolutionResult(Handle h, long handle) { super(h, handle); }
    protected INDeleteTasksTaskResolutionResult(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTaskResolutionResult:")
    public INDeleteTasksTaskResolutionResult(INTaskResolutionResult taskResolutionResult) { super((SkipInit) null); initObject(init(taskResolutionResult)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTaskResolutionResult:")
    protected native @Pointer long init(INTaskResolutionResult taskResolutionResult);
    @Method(selector = "unsupportedForReason:")
    public static native INDeleteTasksTaskResolutionResult unsupportedForReason(INDeleteTasksTaskUnsupportedReason reason);
    @Method(selector = "successWithResolvedTask:")
    public static native INDeleteTasksTaskResolutionResult success(INTask resolvedTask);
    @Method(selector = "disambiguationWithTasksToDisambiguate:")
    public static native INDeleteTasksTaskResolutionResult disambiguation(NSArray<INTask> tasksToDisambiguate);
    @Method(selector = "confirmationRequiredWithTaskToConfirm:")
    public static native INDeleteTasksTaskResolutionResult confirmationRequired(INTask taskToConfirm);
    @Method(selector = "needsValue")
    public static native INDeleteTasksTaskResolutionResult needsValue();
    @Method(selector = "notRequired")
    public static native INDeleteTasksTaskResolutionResult notRequired();
    @Method(selector = "unsupported")
    public static native INDeleteTasksTaskResolutionResult unsupported();
    /*</methods>*/
}
