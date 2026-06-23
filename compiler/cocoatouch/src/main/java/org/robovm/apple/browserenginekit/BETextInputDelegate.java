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
package org.robovm.apple.browserenginekit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.4 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/BETextInputDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "shouldDeferEventHandlingToSystemForTextInput:context:")
    boolean shouldDeferEventHandlingToSystemForTextInput(BETextInput textInput, BEKeyEntryContext keyEventContext);
    @Method(selector = "textInput:setCandidateSuggestions:")
    void setCandidateSuggestions(BETextInput textInput, NSArray<BETextSuggestion> suggestions);
    @Method(selector = "selectionWillChangeForTextInput:")
    void selectionWillChangeForTextInput(BETextInput textInput);
    @Method(selector = "selectionDidChangeForTextInput:")
    void selectionDidChangeForTextInput(BETextInput textInput);
    @Method(selector = "textInput:deferReplaceTextActionToSystem:")
    void deferReplaceTextActionToSystem(BETextInput textInput, NSObject sender);
    @Method(selector = "invalidateTextEntryContextForTextInput:")
    void invalidateTextEntryContextForTextInput(BETextInput textInput);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
