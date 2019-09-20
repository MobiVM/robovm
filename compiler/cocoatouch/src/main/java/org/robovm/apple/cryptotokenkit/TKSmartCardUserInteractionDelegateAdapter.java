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
package org.robovm.apple.cryptotokenkit;

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
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TKSmartCardUserInteractionDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements TKSmartCardUserInteractionDelegate/*</implements>*/ {

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
    @NotImplemented("characterEnteredInUserInteraction:")
    public void characterEntered(TKSmartCardUserInteraction interaction) {}
    @NotImplemented("correctionKeyPressedInUserInteraction:")
    public void correctionKeyPressed(TKSmartCardUserInteraction interaction) {}
    @NotImplemented("validationKeyPressedInUserInteraction:")
    public void validationKeyPressed(TKSmartCardUserInteraction interaction) {}
    @NotImplemented("invalidCharacterEnteredInUserInteraction:")
    public void invalidCharacterEntered(TKSmartCardUserInteraction interaction) {}
    @NotImplemented("oldPINRequestedInUserInteraction:")
    public void oldPINRequested(TKSmartCardUserInteraction interaction) {}
    @NotImplemented("newPINRequestedInUserInteraction:")
    public void newPINRequested(TKSmartCardUserInteraction interaction) {}
    @NotImplemented("newPINConfirmationRequestedInUserInteraction:")
    public void newPINConfirmationRequested(TKSmartCardUserInteraction interaction) {}
    /*</methods>*/
}
