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
package org.robovm.apple.scenekit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.glkit.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SceneKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNAudioPlayer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SCNAudioPlayerPtr extends Ptr<SCNAudioPlayer, SCNAudioPlayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCNAudioPlayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SCNAudioPlayer() {}
    protected SCNAudioPlayer(Handle h, long handle) { super(h, handle); }
    protected SCNAudioPlayer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSource:")
    public SCNAudioPlayer(SCNAudioSource source) { super((SkipInit) null); initObject(initWithSource(source)); }
    @Method(selector = "initWithAVAudioNode:")
    public SCNAudioPlayer(AVAudioNode audioNode) { super((SkipInit) null); initObject(initWithAVAudioNode(audioNode)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "willStartPlayback")
    public native @Block Runnable getWillStartPlayback();
    @Property(selector = "setWillStartPlayback:")
    public native void setWillStartPlayback(@Block Runnable v);
    @Property(selector = "didFinishPlayback")
    public native @Block Runnable getDidFinishPlayback();
    @Property(selector = "setDidFinishPlayback:")
    public native void setDidFinishPlayback(@Block Runnable v);
    @Property(selector = "audioNode")
    public native AVAudioNode getAudioNode();
    @Property(selector = "audioSource")
    public native SCNAudioSource getAudioSource();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSource:")
    protected native @Pointer long initWithSource(SCNAudioSource source);
    @Method(selector = "initWithAVAudioNode:")
    protected native @Pointer long initWithAVAudioNode(AVAudioNode audioNode);
    @Method(selector = "audioPlayerWithSource:")
    public static native SCNAudioPlayer audioPlayerWithSource(SCNAudioSource source);
    @Method(selector = "audioPlayerWithAVAudioNode:")
    public static native SCNAudioPlayer audioPlayerWithAVAudioNode(AVAudioNode audioNode);
    /*</methods>*/
}
