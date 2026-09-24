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
package org.robovm.apple.phase;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.modelio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PHASE") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHASESamplerNodeDefinition/*</name>*/ 
    extends /*<extends>*/PHASEGeneratorNodeDefinition/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHASESamplerNodeDefinitionPtr extends Ptr<PHASESamplerNodeDefinition, PHASESamplerNodeDefinitionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHASESamplerNodeDefinition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PHASESamplerNodeDefinition() {}
    protected PHASESamplerNodeDefinition(Handle h, long handle) { super(h, handle); }
    protected PHASESamplerNodeDefinition(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSoundAssetIdentifier:mixerDefinition:identifier:")
    public PHASESamplerNodeDefinition(String soundAssetIdentifier, PHASEMixerDefinition mixerDefinition, String identifier) { super((SkipInit) null); initObject(init(soundAssetIdentifier, mixerDefinition, identifier)); }
    @Method(selector = "initWithSoundAssetIdentifier:mixerDefinition:")
    public PHASESamplerNodeDefinition(String soundAssetIdentifier, PHASEMixerDefinition mixerDefinition) { super((SkipInit) null); initObject(init(soundAssetIdentifier, mixerDefinition)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "assetIdentifier")
    public native String getAssetIdentifier();
    @Property(selector = "cullOption")
    public native PHASECullOption getCullOption();
    @Property(selector = "setCullOption:")
    public native void setCullOption(PHASECullOption v);
    @Property(selector = "playbackMode")
    public native PHASEPlaybackMode getPlaybackMode();
    @Property(selector = "setPlaybackMode:")
    public native void setPlaybackMode(PHASEPlaybackMode v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSoundAssetIdentifier:mixerDefinition:identifier:")
    protected native @Pointer long init(String soundAssetIdentifier, PHASEMixerDefinition mixerDefinition, String identifier);
    @Method(selector = "initWithSoundAssetIdentifier:mixerDefinition:")
    protected native @Pointer long init(String soundAssetIdentifier, PHASEMixerDefinition mixerDefinition);
    /*</methods>*/
}
