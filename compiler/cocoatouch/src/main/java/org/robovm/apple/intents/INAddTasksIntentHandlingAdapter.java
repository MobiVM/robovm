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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INAddTasksIntentHandlingAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements INAddTasksIntentHandling/*</implements>*/ {

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
    @NotImplemented("handleAddTasks:completion:")
    public void handleAddTasks(INAddTasksIntent intent, @Block VoidBlock1<INAddTasksIntentResponse> completion) {}
    @NotImplemented("confirmAddTasks:completion:")
    public void confirmAddTasks(INAddTasksIntent intent, @Block VoidBlock1<INAddTasksIntentResponse> completion) {}
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 13.0. resolveTargetTaskListForAddTasks:withCompletion: is deprecated. Use resolveTargetTaskListForAddTasks:completion: instead
     */
    @Deprecated
    @NotImplemented("resolveTargetTaskListForAddTasks:withCompletion:")
    public void resolveTargetTaskListForAddTasks(INAddTasksIntent intent, @Block VoidBlock1<INTaskListResolutionResult> completion) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("resolveTargetTaskListForAddTasks:completion:")
    public void resolveTargetTaskList(INAddTasksIntent intent, @Block VoidBlock1<INAddTasksTargetTaskListResolutionResult> completion) {}
    @NotImplemented("resolveTaskTitlesForAddTasks:withCompletion:")
    public void resolveTaskTitlesForAddTasks(INAddTasksIntent intent, @Block VoidBlock1<NSArray<INSpeakableStringResolutionResult>> completion) {}
    @NotImplemented("resolveSpatialEventTriggerForAddTasks:withCompletion:")
    public void resolveSpatialEventTriggerForAddTasks(INAddTasksIntent intent, @Block VoidBlock1<INSpatialEventTriggerResolutionResult> completion) {}
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 13.0. resolveTemporalEventTriggerForAddTasks:withCompletion: is deprecated. Use resolveTemporalEventTriggerForAddTasks:completion: instead
     */
    @Deprecated
    @NotImplemented("resolveTemporalEventTriggerForAddTasks:withCompletion:")
    public void resolveTemporalEventTriggerForAddTasks(INAddTasksIntent intent, @Block VoidBlock1<INTemporalEventTriggerResolutionResult> completion) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("resolveTemporalEventTriggerForAddTasks:completion:")
    public void resolveTemporalEventTrigger(INAddTasksIntent intent, @Block VoidBlock1<INAddTasksTemporalEventTriggerResolutionResult> completion) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("resolvePriorityForAddTasks:withCompletion:")
    public void resolvePriorityForAddTasks(INAddTasksIntent intent, @Block VoidBlock1<INTaskPriorityResolutionResult> completion) {}
    /*</methods>*/
}
