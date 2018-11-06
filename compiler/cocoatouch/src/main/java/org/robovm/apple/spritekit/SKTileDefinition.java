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
package org.robovm.apple.spritekit;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.glkit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.gameplaykit.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SpriteKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKTileDefinition/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class SKTileDefinitionPtr extends Ptr<SKTileDefinition, SKTileDefinitionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKTileDefinition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKTileDefinition() {}
    protected SKTileDefinition(Handle h, long handle) { super(h, handle); }
    protected SKTileDefinition(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTexture:")
    public SKTileDefinition(SKTexture texture) { super((SkipInit) null); initObject(init(texture)); }
    @Method(selector = "initWithTexture:size:")
    public SKTileDefinition(SKTexture texture, @ByVal CGSize size) { super((SkipInit) null); initObject(init(texture, size)); }
    @Method(selector = "initWithTexture:normalTexture:size:")
    public SKTileDefinition(SKTexture texture, SKTexture normalTexture, @ByVal CGSize size) { super((SkipInit) null); initObject(init(texture, normalTexture, size)); }
    @Method(selector = "initWithTextures:size:timePerFrame:")
    public SKTileDefinition(NSArray<SKTexture> textures, @ByVal CGSize size, @MachineSizedFloat double timePerFrame) { super((SkipInit) null); initObject(init(textures, size, timePerFrame)); }
    @Method(selector = "initWithTextures:normalTextures:size:timePerFrame:")
    public SKTileDefinition(NSArray<SKTexture> textures, NSArray<SKTexture> normalTextures, @ByVal CGSize size, @MachineSizedFloat double timePerFrame) { super((SkipInit) null); initObject(init(textures, normalTextures, size, timePerFrame)); }
    @Method(selector = "initWithCoder:")
    public SKTileDefinition(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "textures")
    public native NSArray<SKTexture> getTextures();
    @Property(selector = "setTextures:")
    public native void setTextures(NSArray<SKTexture> v);
    @Property(selector = "normalTextures")
    public native NSArray<SKTexture> getNormalTextures();
    @Property(selector = "setNormalTextures:")
    public native void setNormalTextures(NSArray<SKTexture> v);
    @Property(selector = "userData")
    public native NSMutableDictionary<?, ?> getUserData();
    @Property(selector = "setUserData:")
    public native void setUserData(NSMutableDictionary<?, ?> v);
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "size")
    public native @ByVal CGSize getSize();
    @Property(selector = "setSize:")
    public native void setSize(@ByVal CGSize v);
    @Property(selector = "timePerFrame")
    public native @MachineSizedFloat double getTimePerFrame();
    @Property(selector = "setTimePerFrame:")
    public native void setTimePerFrame(@MachineSizedFloat double v);
    @Property(selector = "placementWeight")
    public native @MachineSizedUInt long getPlacementWeight();
    @Property(selector = "setPlacementWeight:")
    public native void setPlacementWeight(@MachineSizedUInt long v);
    @Property(selector = "rotation")
    public native SKTileDefinitionRotation getRotation();
    @Property(selector = "setRotation:")
    public native void setRotation(SKTileDefinitionRotation v);
    @Property(selector = "flipVertically")
    public native boolean isFlipVertically();
    @Property(selector = "setFlipVertically:")
    public native void setFlipVertically(boolean v);
    @Property(selector = "flipHorizontally")
    public native boolean isFlipHorizontally();
    @Property(selector = "setFlipHorizontally:")
    public native void setFlipHorizontally(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTexture:")
    protected native @Pointer long init(SKTexture texture);
    @Method(selector = "initWithTexture:size:")
    protected native @Pointer long init(SKTexture texture, @ByVal CGSize size);
    @Method(selector = "initWithTexture:normalTexture:size:")
    protected native @Pointer long init(SKTexture texture, SKTexture normalTexture, @ByVal CGSize size);
    @Method(selector = "initWithTextures:size:timePerFrame:")
    protected native @Pointer long init(NSArray<SKTexture> textures, @ByVal CGSize size, @MachineSizedFloat double timePerFrame);
    @Method(selector = "initWithTextures:normalTextures:size:timePerFrame:")
    protected native @Pointer long init(NSArray<SKTexture> textures, NSArray<SKTexture> normalTextures, @ByVal CGSize size, @MachineSizedFloat double timePerFrame);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
