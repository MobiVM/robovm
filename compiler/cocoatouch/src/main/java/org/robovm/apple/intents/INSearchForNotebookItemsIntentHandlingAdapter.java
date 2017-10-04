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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSearchForNotebookItemsIntentHandlingAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements INSearchForNotebookItemsIntentHandling/*</implements>*/ {

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
    /*</methods>*/
}
