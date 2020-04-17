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
package org.robovm.apple.callkit;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/CXProviderDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "providerDidReset:")
    void providerDidReset(CXProvider provider);
    @Method(selector = "providerDidBegin:")
    void providerDidBegin(CXProvider provider);
    @Method(selector = "provider:executeTransaction:")
    boolean executeTransaction(CXProvider provider, CXTransaction transaction);
    @Method(selector = "provider:performStartCallAction:")
    void performStartCallAction(CXProvider provider, CXStartCallAction action);
    @Method(selector = "provider:performAnswerCallAction:")
    void performAnswerCallAction(CXProvider provider, CXAnswerCallAction action);
    @Method(selector = "provider:performEndCallAction:")
    void performEndCallAction(CXProvider provider, CXEndCallAction action);
    @Method(selector = "provider:performSetHeldCallAction:")
    void performSetHeldCallAction(CXProvider provider, CXSetHeldCallAction action);
    @Method(selector = "provider:performSetMutedCallAction:")
    void performSetMutedCallAction(CXProvider provider, CXSetMutedCallAction action);
    @Method(selector = "provider:performSetGroupCallAction:")
    void performSetGroupCallAction(CXProvider provider, CXSetGroupCallAction action);
    @Method(selector = "provider:performPlayDTMFCallAction:")
    void performPlayDTMFCallAction(CXProvider provider, CXPlayDTMFCallAction action);
    @Method(selector = "provider:timedOutPerformingAction:")
    void timedOutPerformingAction(CXProvider provider, CXAction action);
    @Method(selector = "provider:didActivateAudioSession:")
    void didActivateAudioSession(CXProvider provider, AVAudioSession audioSession);
    @Method(selector = "provider:didDeactivateAudioSession:")
    void didDeactivateAudioSession(CXProvider provider, AVAudioSession audioSession);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
