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
 * @since Available in iOS 10.3 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/INActivateCarSignalIntentHandling/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "handleActivateCarSignal:completion:")
    void handleActivateCarSignal(INActivateCarSignalIntent intent, @Block VoidBlock1<INActivateCarSignalIntentResponse> completion);
    @Method(selector = "confirmActivateCarSignal:completion:")
    void confirmActivateCarSignal(INActivateCarSignalIntent intent, @Block VoidBlock1<INActivateCarSignalIntentResponse> completion);
    @Method(selector = "resolveCarNameForActivateCarSignal:withCompletion:")
    void resolveCarNameForActivateCarSignal(INActivateCarSignalIntent intent, @Block VoidBlock1<INSpeakableStringResolutionResult> completion);
    @Method(selector = "resolveSignalsForActivateCarSignal:withCompletion:")
    void resolveSignalsForActivateCarSignal(INActivateCarSignalIntent intent, @Block VoidBlock1<INCarSignalOptionsResolutionResult> completion);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
