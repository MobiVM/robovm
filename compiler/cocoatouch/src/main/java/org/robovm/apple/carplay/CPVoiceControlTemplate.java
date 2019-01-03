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
package org.robovm.apple.carplay;

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
import org.robovm.apple.mapkit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPVoiceControlTemplate/*</name>*/ 
    extends /*<extends>*/CPTemplate/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CPVoiceControlTemplatePtr extends Ptr<CPVoiceControlTemplate, CPVoiceControlTemplatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPVoiceControlTemplate.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CPVoiceControlTemplate() {}
    protected CPVoiceControlTemplate(Handle h, long handle) { super(h, handle); }
    protected CPVoiceControlTemplate(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithVoiceControlStates:")
    public CPVoiceControlTemplate(NSArray<CPVoiceControlState> voiceControlStates) { super((SkipInit) null); initObject(init(voiceControlStates)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "voiceControlStates")
    public native NSArray<CPVoiceControlState> getVoiceControlStates();
    @Property(selector = "activeStateIdentifier")
    public native String getActiveStateIdentifier();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithVoiceControlStates:")
    protected native @Pointer long init(NSArray<CPVoiceControlState> voiceControlStates);
    @Method(selector = "activateVoiceControlStateWithIdentifier:")
    public native void activateVoiceControlState(String identifier);
    /*</methods>*/
}
