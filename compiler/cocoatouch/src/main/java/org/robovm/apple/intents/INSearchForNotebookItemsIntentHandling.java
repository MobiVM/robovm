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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/INSearchForNotebookItemsIntentHandling/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "handleSearchForNotebookItems:completion:")
    void handleSearchForNotebookItems(INSearchForNotebookItemsIntent intent, @Block VoidBlock1<INSearchForNotebookItemsIntentResponse> completion);
    @Method(selector = "confirmSearchForNotebookItems:completion:")
    void confirmSearchForNotebookItems(INSearchForNotebookItemsIntent intent, @Block VoidBlock1<INSearchForNotebookItemsIntentResponse> completion);
    @Method(selector = "resolveTitleForSearchForNotebookItems:withCompletion:")
    void resolveTitleForSearchForNotebookItems(INSearchForNotebookItemsIntent intent, @Block VoidBlock1<INSpeakableStringResolutionResult> completion);
    @Method(selector = "resolveContentForSearchForNotebookItems:withCompletion:")
    void resolveContentForSearchForNotebookItems(INSearchForNotebookItemsIntent intent, @Block VoidBlock1<INStringResolutionResult> completion);
    @Method(selector = "resolveItemTypeForSearchForNotebookItems:withCompletion:")
    void resolveItemTypeForSearchForNotebookItems(INSearchForNotebookItemsIntent intent, @Block VoidBlock1<INNotebookItemTypeResolutionResult> completion);
    @Method(selector = "resolveStatusForSearchForNotebookItems:withCompletion:")
    void resolveStatusForSearchForNotebookItems(INSearchForNotebookItemsIntent intent, @Block VoidBlock1<INTaskStatusResolutionResult> completion);
    @Method(selector = "resolveLocationForSearchForNotebookItems:withCompletion:")
    void resolveLocationForSearchForNotebookItems(INSearchForNotebookItemsIntent intent, @Block VoidBlock1<INPlacemarkResolutionResult> completion);
    @Method(selector = "resolveLocationSearchTypeForSearchForNotebookItems:withCompletion:")
    void resolveLocationSearchTypeForSearchForNotebookItems(INSearchForNotebookItemsIntent intent, @Block VoidBlock1<INLocationSearchTypeResolutionResult> completion);
    @Method(selector = "resolveDateTimeForSearchForNotebookItems:withCompletion:")
    void resolveDateTimeForSearchForNotebookItems(INSearchForNotebookItemsIntent intent, @Block VoidBlock1<INDateComponentsRangeResolutionResult> completion);
    @Method(selector = "resolveDateSearchTypeForSearchForNotebookItems:withCompletion:")
    void resolveDateSearchTypeForSearchForNotebookItems(INSearchForNotebookItemsIntent intent, @Block VoidBlock1<INDateSearchTypeResolutionResult> completion);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "resolveTemporalEventTriggerTypesForSearchForNotebookItems:withCompletion:")
    void resolveTemporalEventTriggerTypesForSearchForNotebookItems(INSearchForNotebookItemsIntent intent, @Block VoidBlock1<INTemporalEventTriggerTypeOptionsResolutionResult> completion);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "resolveTaskPriorityForSearchForNotebookItems:withCompletion:")
    void resolveTaskPriorityForSearchForNotebookItems(INSearchForNotebookItemsIntent intent, @Block VoidBlock1<INTaskPriorityResolutionResult> completion);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
