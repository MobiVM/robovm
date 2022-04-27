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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("SpriteKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKSpriteNode/*</name>*/ 
    extends /*<extends>*/SKNode/*</extends>*/ 
    /*<implements>*/implements SKWarpable/*</implements>*/ {

    /*<ptr>*/public static class SKSpriteNodePtr extends Ptr<SKSpriteNode, SKSpriteNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKSpriteNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKSpriteNode() {}
    protected SKSpriteNode(Handle h, long handle) { super(h, handle); }
    protected SKSpriteNode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTexture:color:size:")
    public SKSpriteNode(SKTexture texture, UIColor color, @ByVal CGSize size) { super((SkipInit) null); initObject(init(texture, color, size)); }
    @Method(selector = "initWithTexture:")
    public SKSpriteNode(SKTexture texture) { super((SkipInit) null); initObject(init(texture)); }
    @Method(selector = "initWithImageNamed:")
    public SKSpriteNode(String name) { super((SkipInit) null); initObject(init(name)); }
    @Method(selector = "initWithColor:size:")
    public SKSpriteNode(UIColor color, @ByVal CGSize size) { super((SkipInit) null); initObject(init(color, size)); }
    @Method(selector = "initWithCoder:")
    public SKSpriteNode(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    public SKSpriteNode(SKTexture texture, @ByVal CGSize size) { super((Handle) null, create(texture, size)); retain(getHandle()); }
    public SKSpriteNode(SKTexture texture, SKTexture normalMap) { super((Handle) null, create(texture, normalMap)); retain(getHandle()); }
    public SKSpriteNode(String name, boolean generateNormalMap) { super((Handle) null, create(name, generateNormalMap)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "texture")
    public native SKTexture getTexture();
    @Property(selector = "setTexture:")
    public native void setTexture(SKTexture v);
    @Property(selector = "normalTexture")
    public native SKTexture getNormalTexture();
    @Property(selector = "setNormalTexture:")
    public native void setNormalTexture(SKTexture v);
    @Property(selector = "lightingBitMask")
    public native int getLightingBitMask();
    @Property(selector = "setLightingBitMask:")
    public native void setLightingBitMask(int v);
    @Property(selector = "shadowCastBitMask")
    public native int getShadowCastBitMask();
    @Property(selector = "setShadowCastBitMask:")
    public native void setShadowCastBitMask(int v);
    @Property(selector = "shadowedBitMask")
    public native int getShadowedBitMask();
    @Property(selector = "setShadowedBitMask:")
    public native void setShadowedBitMask(int v);
    @Property(selector = "centerRect")
    public native @ByVal CGRect getCenterRect();
    @Property(selector = "setCenterRect:")
    public native void setCenterRect(@ByVal CGRect v);
    @Property(selector = "colorBlendFactor")
    public native @MachineSizedFloat double getColorBlendFactor();
    @Property(selector = "setColorBlendFactor:")
    public native void setColorBlendFactor(@MachineSizedFloat double v);
    @Property(selector = "color")
    public native UIColor getColor();
    @Property(selector = "setColor:")
    public native void setColor(UIColor v);
    @Property(selector = "blendMode")
    public native SKBlendMode getBlendMode();
    @Property(selector = "setBlendMode:")
    public native void setBlendMode(SKBlendMode v);
    @Property(selector = "anchorPoint")
    public native @ByVal CGPoint getAnchorPoint();
    @Property(selector = "setAnchorPoint:")
    public native void setAnchorPoint(@ByVal CGPoint v);
    @Property(selector = "size")
    public native @ByVal CGSize getSize();
    @Property(selector = "setSize:")
    public native void setSize(@ByVal CGSize v);
    @Property(selector = "shader")
    public native SKShader getShader();
    @Property(selector = "setShader:")
    public native void setShader(SKShader v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "attributeValues")
    public native NSDictionary<NSString, SKAttributeValue> getAttributeValues();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setAttributeValues:")
    public native void setAttributeValues(NSDictionary<NSString, SKAttributeValue> v);
    @Property(selector = "warpGeometry")
    public native SKWarpGeometry getWarpGeometry();
    @Property(selector = "setWarpGeometry:")
    public native void setWarpGeometry(SKWarpGeometry v);
    @Property(selector = "subdivisionLevels")
    public native @MachineSizedSInt long getSubdivisionLevels();
    @Property(selector = "setSubdivisionLevels:")
    public native void setSubdivisionLevels(@MachineSizedSInt long v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTexture:color:size:")
    protected native @Pointer long init(SKTexture texture, UIColor color, @ByVal CGSize size);
    @Method(selector = "initWithTexture:")
    protected native @Pointer long init(SKTexture texture);
    @Method(selector = "initWithImageNamed:")
    protected native @Pointer long init(String name);
    @Method(selector = "initWithColor:size:")
    protected native @Pointer long init(UIColor color, @ByVal CGSize size);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "scaleToSize:")
    public native void scaleToSize(@ByVal CGSize size);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "valueForAttributeNamed:")
    public native SKAttributeValue valueForAttribute(String key);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "setValue:forAttributeNamed:")
    public native void setValueForAttribute(SKAttributeValue value, String key);
    @Method(selector = "spriteNodeWithTexture:size:")
    protected static native @Pointer long create(SKTexture texture, @ByVal CGSize size);
    @Method(selector = "spriteNodeWithTexture:normalMap:")
    protected static native @Pointer long create(SKTexture texture, SKTexture normalMap);
    @Method(selector = "spriteNodeWithImageNamed:normalMapped:")
    protected static native @Pointer long create(String name, boolean generateNormalMap);
    /*</methods>*/
}
