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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INNotebookDomainHandlingAdapter/*</name>*/ 
    extends /*<extends>*/INCreateNoteIntentHandlingAdapter/*</extends>*/ 
    /*<implements>*/implements INNotebookDomainHandling/*</implements>*/ {

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
    @NotImplemented("handleAppendToNote:completion:")
    public void handleAppendToNote(INAppendToNoteIntent intent, @Block VoidBlock1<INAppendToNoteIntentResponse> completion) {}
    @NotImplemented("confirmAppendToNote:completion:")
    public void confirmAppendToNote(INAppendToNoteIntent intent, @Block VoidBlock1<INAppendToNoteIntentResponse> completion) {}
    @NotImplemented("resolveTargetNoteForAppendToNote:withCompletion:")
    public void resolveTargetNoteForAppendToNote(INAppendToNoteIntent intent, @Block VoidBlock1<INNoteResolutionResult> completion) {}
    @NotImplemented("resolveContentForAppendToNote:withCompletion:")
    public void resolveContentForAppendToNote(INAppendToNoteIntent intent, @Block VoidBlock1<INNoteContentResolutionResult> completion) {}
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
    @NotImplemented("handleCreateTaskList:completion:")
    public void handleCreateTaskList(INCreateTaskListIntent intent, @Block VoidBlock1<INCreateTaskListIntentResponse> completion) {}
    @NotImplemented("confirmCreateTaskList:completion:")
    public void confirmCreateTaskList(INCreateTaskListIntent intent, @Block VoidBlock1<INCreateTaskListIntentResponse> completion) {}
    @NotImplemented("resolveTitleForCreateTaskList:withCompletion:")
    public void resolveTitleForCreateTaskList(INCreateTaskListIntent intent, @Block VoidBlock1<INSpeakableStringResolutionResult> completion) {}
    @NotImplemented("resolveTaskTitlesForCreateTaskList:withCompletion:")
    public void resolveTaskTitlesForCreateTaskList(INCreateTaskListIntent intent, @Block VoidBlock1<NSArray<INSpeakableStringResolutionResult>> completion) {}
    @NotImplemented("resolveGroupNameForCreateTaskList:withCompletion:")
    public void resolveGroupNameForCreateTaskList(INCreateTaskListIntent intent, @Block VoidBlock1<INSpeakableStringResolutionResult> completion) {}
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
    @NotImplemented("handleSearchForNotebookItems:completion:")
    public void handleSearchForNotebookItems(INSearchForNotebookItemsIntent intent, @Block VoidBlock1<INSearchForNotebookItemsIntentResponse> completion) {}
    @NotImplemented("confirmSearchForNotebookItems:completion:")
    public void confirmSearchForNotebookItems(INSearchForNotebookItemsIntent intent, @Block VoidBlock1<INSearchForNotebookItemsIntentResponse> completion) {}
    @NotImplemented("resolveTitleForSearchForNotebookItems:withCompletion:")
    public void resolveTitleForSearchForNotebookItems(INSearchForNotebookItemsIntent intent, @Block VoidBlock1<INSpeakableStringResolutionResult> completion) {}
    @NotImplemented("resolveContentForSearchForNotebookItems:withCompletion:")
    public void resolveContentForSearchForNotebookItems(INSearchForNotebookItemsIntent intent, @Block VoidBlock1<INStringResolutionResult> completion) {}
    @NotImplemented("resolveItemTypeForSearchForNotebookItems:withCompletion:")
    public void resolveItemTypeForSearchForNotebookItems(INSearchForNotebookItemsIntent intent, @Block VoidBlock1<INNotebookItemTypeResolutionResult> completion) {}
    @NotImplemented("resolveStatusForSearchForNotebookItems:withCompletion:")
    public void resolveStatusForSearchForNotebookItems(INSearchForNotebookItemsIntent intent, @Block VoidBlock1<INTaskStatusResolutionResult> completion) {}
    @NotImplemented("resolveLocationForSearchForNotebookItems:withCompletion:")
    public void resolveLocationForSearchForNotebookItems(INSearchForNotebookItemsIntent intent, @Block VoidBlock1<INPlacemarkResolutionResult> completion) {}
    @NotImplemented("resolveLocationSearchTypeForSearchForNotebookItems:withCompletion:")
    public void resolveLocationSearchTypeForSearchForNotebookItems(INSearchForNotebookItemsIntent intent, @Block VoidBlock1<INLocationSearchTypeResolutionResult> completion) {}
    @NotImplemented("resolveDateTimeForSearchForNotebookItems:withCompletion:")
    public void resolveDateTimeForSearchForNotebookItems(INSearchForNotebookItemsIntent intent, @Block VoidBlock1<INDateComponentsRangeResolutionResult> completion) {}
    @NotImplemented("resolveDateSearchTypeForSearchForNotebookItems:withCompletion:")
    public void resolveDateSearchTypeForSearchForNotebookItems(INSearchForNotebookItemsIntent intent, @Block VoidBlock1<INDateSearchTypeResolutionResult> completion) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("resolveTemporalEventTriggerTypesForSearchForNotebookItems:withCompletion:")
    public void resolveTemporalEventTriggerTypesForSearchForNotebookItems(INSearchForNotebookItemsIntent intent, @Block VoidBlock1<INTemporalEventTriggerTypeOptionsResolutionResult> completion) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("resolveTaskPriorityForSearchForNotebookItems:withCompletion:")
    public void resolveTaskPriorityForSearchForNotebookItems(INSearchForNotebookItemsIntent intent, @Block VoidBlock1<INTaskPriorityResolutionResult> completion) {}
    /*</methods>*/
}
