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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CXProviderDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements CXProviderDelegate/*</implements>*/ {

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
    @NotImplemented("providerDidReset:")
    public void providerDidReset(CXProvider provider) {}
    @NotImplemented("providerDidBegin:")
    public void providerDidBegin(CXProvider provider) {}
    @NotImplemented("provider:executeTransaction:")
    public boolean executeTransaction(CXProvider provider, CXTransaction transaction) { return false; }
    @NotImplemented("provider:performStartCallAction:")
    public void performStartCallAction(CXProvider provider, CXStartCallAction action) {}
    @NotImplemented("provider:performAnswerCallAction:")
    public void performAnswerCallAction(CXProvider provider, CXAnswerCallAction action) {}
    @NotImplemented("provider:performEndCallAction:")
    public void performEndCallAction(CXProvider provider, CXEndCallAction action) {}
    @NotImplemented("provider:performSetHeldCallAction:")
    public void performSetHeldCallAction(CXProvider provider, CXSetHeldCallAction action) {}
    @NotImplemented("provider:performSetMutedCallAction:")
    public void performSetMutedCallAction(CXProvider provider, CXSetMutedCallAction action) {}
    @NotImplemented("provider:performSetGroupCallAction:")
    public void performSetGroupCallAction(CXProvider provider, CXSetGroupCallAction action) {}
    @NotImplemented("provider:performPlayDTMFCallAction:")
    public void performPlayDTMFCallAction(CXProvider provider, CXPlayDTMFCallAction action) {}
    @NotImplemented("provider:timedOutPerformingAction:")
    public void timedOutPerformingAction(CXProvider provider, CXAction action) {}
    @NotImplemented("provider:didActivateAudioSession:")
    public void didActivateAudioSession(CXProvider provider, AVAudioSession audioSession) {}
    @NotImplemented("provider:didDeactivateAudioSession:")
    public void didDeactivateAudioSession(CXProvider provider, AVAudioSession audioSession) {}
    /*</methods>*/
}
