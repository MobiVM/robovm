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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/INAddTasksIntentHandling/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "handleAddTasks:completion:")
    void handleAddTasks(INAddTasksIntent intent, @Block VoidBlock1<INAddTasksIntentResponse> completion);
    @Method(selector = "confirmAddTasks:completion:")
    void confirmAddTasks(INAddTasksIntent intent, @Block VoidBlock1<INAddTasksIntentResponse> completion);
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 13.0. resolveTargetTaskListForAddTasks:withCompletion: is deprecated. Use resolveTargetTaskListForAddTasks:completion: instead
     */
    @Deprecated
    @Method(selector = "resolveTargetTaskListForAddTasks:withCompletion:")
    void resolveTargetTaskListForAddTasks(INAddTasksIntent intent, @Block VoidBlock1<INTaskListResolutionResult> completion);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "resolveTargetTaskListForAddTasks:completion:")
    void resolveTargetTaskList(INAddTasksIntent intent, @Block VoidBlock1<INAddTasksTargetTaskListResolutionResult> completion);
    @Method(selector = "resolveTaskTitlesForAddTasks:withCompletion:")
    void resolveTaskTitlesForAddTasks(INAddTasksIntent intent, @Block VoidBlock1<NSArray<INSpeakableStringResolutionResult>> completion);
    @Method(selector = "resolveSpatialEventTriggerForAddTasks:withCompletion:")
    void resolveSpatialEventTriggerForAddTasks(INAddTasksIntent intent, @Block VoidBlock1<INSpatialEventTriggerResolutionResult> completion);
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 13.0. resolveTemporalEventTriggerForAddTasks:withCompletion: is deprecated. Use resolveTemporalEventTriggerForAddTasks:completion: instead
     */
    @Deprecated
    @Method(selector = "resolveTemporalEventTriggerForAddTasks:withCompletion:")
    void resolveTemporalEventTriggerForAddTasks(INAddTasksIntent intent, @Block VoidBlock1<INTemporalEventTriggerResolutionResult> completion);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "resolveTemporalEventTriggerForAddTasks:completion:")
    void resolveTemporalEventTrigger(INAddTasksIntent intent, @Block VoidBlock1<INAddTasksTemporalEventTriggerResolutionResult> completion);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "resolvePriorityForAddTasks:withCompletion:")
    void resolvePriorityForAddTasks(INAddTasksIntent intent, @Block VoidBlock1<INTaskPriorityResolutionResult> completion);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
