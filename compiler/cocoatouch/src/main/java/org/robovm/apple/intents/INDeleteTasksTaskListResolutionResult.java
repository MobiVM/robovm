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
 * @deprecated Deprecated in iOS 15.0. INDeleteTasksTaskListResolutionResult is deprecated. There is no replacement.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INDeleteTasksTaskListResolutionResult/*</name>*/ 
    extends /*<extends>*/INTaskListResolutionResult/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INDeleteTasksTaskListResolutionResultPtr extends Ptr<INDeleteTasksTaskListResolutionResult, INDeleteTasksTaskListResolutionResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INDeleteTasksTaskListResolutionResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INDeleteTasksTaskListResolutionResult() {}
    protected INDeleteTasksTaskListResolutionResult(Handle h, long handle) { super(h, handle); }
    protected INDeleteTasksTaskListResolutionResult(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTaskListResolutionResult:")
    public INDeleteTasksTaskListResolutionResult(INTaskListResolutionResult taskListResolutionResult) { super((SkipInit) null); initObject(init(taskListResolutionResult)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTaskListResolutionResult:")
    protected native @Pointer long init(INTaskListResolutionResult taskListResolutionResult);
    @Method(selector = "unsupportedForReason:")
    public static native INDeleteTasksTaskListResolutionResult unsupportedForReason(INDeleteTasksTaskListUnsupportedReason reason);
    @Method(selector = "successWithResolvedTaskList:")
    public static native INDeleteTasksTaskListResolutionResult success(INTaskList resolvedTaskList);
    @Method(selector = "disambiguationWithTaskListsToDisambiguate:")
    public static native INDeleteTasksTaskListResolutionResult disambiguation(NSArray<INTaskList> taskListsToDisambiguate);
    @Method(selector = "confirmationRequiredWithTaskListToConfirm:")
    public static native INDeleteTasksTaskListResolutionResult confirmationRequired(INTaskList taskListToConfirm);
    @Method(selector = "needsValue")
    public static native INDeleteTasksTaskListResolutionResult needsValue();
    @Method(selector = "notRequired")
    public static native INDeleteTasksTaskListResolutionResult notRequired();
    @Method(selector = "unsupported")
    public static native INDeleteTasksTaskListResolutionResult unsupported();
    /*</methods>*/
}
