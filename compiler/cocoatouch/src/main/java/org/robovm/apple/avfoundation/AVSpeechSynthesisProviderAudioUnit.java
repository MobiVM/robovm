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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVSpeechSynthesisProviderAudioUnit/*</name>*/ 
    extends /*<extends>*/AUAudioUnit/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVSpeechSynthesisProviderAudioUnitPtr extends Ptr<AVSpeechSynthesisProviderAudioUnit, AVSpeechSynthesisProviderAudioUnitPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVSpeechSynthesisProviderAudioUnit.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVSpeechSynthesisProviderAudioUnit() {}
    protected AVSpeechSynthesisProviderAudioUnit(Handle h, long handle) { super(h, handle); }
    protected AVSpeechSynthesisProviderAudioUnit(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithComponentDescription:options:error:")
    public AVSpeechSynthesisProviderAudioUnit(@ByVal AudioComponentDescription componentDescription, AudioComponentInstantiationOptions options) throws NSErrorException { super(componentDescription, options); }
    @Method(selector = "initWithComponentDescription:error:")
    public AVSpeechSynthesisProviderAudioUnit(@ByVal AudioComponentDescription componentDescription) throws NSErrorException { super(componentDescription); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "speechVoices")
    public native NSArray<AVSpeechSynthesisProviderVoice> getSpeechVoices();
    @Property(selector = "setSpeechVoices:")
    public native void setSpeechVoices(NSArray<AVSpeechSynthesisProviderVoice> v);
    @Property(selector = "speechSynthesisOutputMetadataBlock")
    public native @Block VoidBlock2<NSArray<AVSpeechSynthesisMarker>, AVSpeechSynthesisProviderRequest> getSpeechSynthesisOutputMetadataBlock();
    @Property(selector = "setSpeechSynthesisOutputMetadataBlock:")
    public native void setSpeechSynthesisOutputMetadataBlock(@Block VoidBlock2<NSArray<AVSpeechSynthesisMarker>, AVSpeechSynthesisProviderRequest> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "synthesizeSpeechRequest:")
    public native void synthesizeSpeechRequest(AVSpeechSynthesisProviderRequest speechRequest);
    @Method(selector = "cancelSpeechRequest")
    public native void cancelSpeechRequest();
    @Method(selector = "instantiateWithComponentDescription:options:completionHandler:")
    public static native void instantiate(@ByVal AudioComponentDescription componentDescription, AudioComponentInstantiationOptions options, @Block VoidBlock2<AUAudioUnit, NSError> completionHandler);
    /*</methods>*/
}
