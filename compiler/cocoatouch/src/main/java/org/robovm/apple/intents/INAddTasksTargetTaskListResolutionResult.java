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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INAddTasksTargetTaskListResolutionResult/*</name>*/ 
    extends /*<extends>*/INTaskListResolutionResult/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INAddTasksTargetTaskListResolutionResultPtr extends Ptr<INAddTasksTargetTaskListResolutionResult, INAddTasksTargetTaskListResolutionResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INAddTasksTargetTaskListResolutionResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INAddTasksTargetTaskListResolutionResult() {}
    protected INAddTasksTargetTaskListResolutionResult(Handle h, long handle) { super(h, handle); }
    protected INAddTasksTargetTaskListResolutionResult(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTaskListResolutionResult:")
    public INAddTasksTargetTaskListResolutionResult(INTaskListResolutionResult taskListResolutionResult) { super((SkipInit) null); initObject(init(taskListResolutionResult)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTaskListResolutionResult:")
    protected native @Pointer long init(INTaskListResolutionResult taskListResolutionResult);
    @Method(selector = "confirmationRequiredWithTaskListToConfirm:forReason:")
    public static native INAddTasksTargetTaskListResolutionResult confirmationRequired(INTaskList taskListToConfirm, INAddTasksTargetTaskListConfirmationReason reason);
    @Method(selector = "successWithResolvedTaskList:")
    public static native INAddTasksTargetTaskListResolutionResult success(INTaskList resolvedTaskList);
    @Method(selector = "disambiguationWithTaskListsToDisambiguate:")
    public static native INAddTasksTargetTaskListResolutionResult disambiguation(NSArray<INTaskList> taskListsToDisambiguate);
    @Method(selector = "confirmationRequiredWithTaskListToConfirm:")
    public static native INAddTasksTargetTaskListResolutionResult confirmationRequired(INTaskList taskListToConfirm);
    @Method(selector = "needsValue")
    public static native INAddTasksTargetTaskListResolutionResult needsValue();
    @Method(selector = "notRequired")
    public static native INAddTasksTargetTaskListResolutionResult notRequired();
    @Method(selector = "unsupported")
    public static native INAddTasksTargetTaskListResolutionResult unsupported();
    /*</methods>*/
}
