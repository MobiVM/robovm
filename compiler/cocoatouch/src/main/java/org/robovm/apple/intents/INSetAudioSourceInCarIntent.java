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
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSetAudioSourceInCarIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INSetAudioSourceInCarIntentPtr extends Ptr<INSetAudioSourceInCarIntent, INSetAudioSourceInCarIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INSetAudioSourceInCarIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INSetAudioSourceInCarIntent() {}
    protected INSetAudioSourceInCarIntent(Handle h, long handle) { super(h, handle); }
    protected INSetAudioSourceInCarIntent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAudioSource:relativeAudioSourceReference:")
    public INSetAudioSourceInCarIntent(INCarAudioSource audioSource, INRelativeReference relativeAudioSourceReference) { super((SkipInit) null); initObject(init(audioSource, relativeAudioSourceReference)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "audioSource")
    public native INCarAudioSource getAudioSource();
    @Property(selector = "relativeAudioSourceReference")
    public native INRelativeReference getRelativeAudioSourceReference();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAudioSource:relativeAudioSourceReference:")
    protected native @Pointer long init(INCarAudioSource audioSource, INRelativeReference relativeAudioSourceReference);
    /*</methods>*/
}
