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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKMutableTexture/*</name>*/ 
    extends /*<extends>*/SKTexture/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKMutableTexturePtr extends Ptr<SKMutableTexture, SKMutableTexturePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKMutableTexture.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKMutableTexture() {}
    protected SKMutableTexture(Handle h, long handle) { super(h, handle); }
    protected SKMutableTexture(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSize:")
    public SKMutableTexture(@ByVal CGSize size) { super((SkipInit) null); initObject(init(size)); }
    @Method(selector = "initWithSize:pixelFormat:")
    public SKMutableTexture(@ByVal CGSize size, int format) { super((SkipInit) null); initObject(init(size, format)); }
    public SKMutableTexture(String name) { super((Handle) null, create(name)); retain(getHandle()); }
    public SKMutableTexture(@ByVal CGRect rect, SKTexture texture) { super((Handle) null, create(rect, texture)); retain(getHandle()); }
    public SKMutableTexture(CGImage image) { super((Handle) null, create(image)); retain(getHandle()); }
    public SKMutableTexture(UIImage image) { super((Handle) null, create(image)); retain(getHandle()); }
    public SKMutableTexture(NSData pixelData, @ByVal CGSize size) { super((Handle) null, create(pixelData, size)); retain(getHandle()); }
    public SKMutableTexture(NSData pixelData, @ByVal CGSize size, boolean flipped) { super((Handle) null, create(pixelData, size, flipped)); retain(getHandle()); }
    public SKMutableTexture(NSData pixelData, @ByVal CGSize size, int rowLength, int alignment) { super((Handle) null, create(pixelData, size, rowLength, alignment)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSize:")
    protected native @Pointer long init(@ByVal CGSize size);
    @Method(selector = "initWithSize:pixelFormat:")
    protected native @Pointer long init(@ByVal CGSize size, int format);
    @Method(selector = "modifyPixelDataWithBlock:")
    public native void modifyPixelData(@Block("(,@MachineSizedUInt)") VoidBlock2<VoidPtr, Long> block);
    @Method(selector = "textureWithImageNamed:")
    protected static native @Pointer long create(String name);
    @Method(selector = "textureWithRect:inTexture:")
    protected static native @Pointer long create(@ByVal CGRect rect, SKTexture texture);
    @Method(selector = "textureVectorNoiseWithSmoothness:size:")
    public static native SKMutableTexture createVectorNoise(@MachineSizedFloat double smoothness, @ByVal CGSize size);
    @Method(selector = "textureNoiseWithSmoothness:size:grayscale:")
    public static native SKMutableTexture createNoise(@MachineSizedFloat double smoothness, @ByVal CGSize size, boolean grayscale);
    @Method(selector = "textureWithCGImage:")
    protected static native @Pointer long create(CGImage image);
    @Method(selector = "textureWithImage:")
    protected static native @Pointer long create(UIImage image);
    @Method(selector = "textureWithData:size:")
    protected static native @Pointer long create(NSData pixelData, @ByVal CGSize size);
    @Method(selector = "textureWithData:size:flipped:")
    protected static native @Pointer long create(NSData pixelData, @ByVal CGSize size, boolean flipped);
    @Method(selector = "textureWithData:size:rowLength:alignment:")
    protected static native @Pointer long create(NSData pixelData, @ByVal CGSize size, int rowLength, int alignment);
    @Method(selector = "preloadTextures:withCompletionHandler:")
    public static native void preloadTextures(NSArray<SKTexture> textures, @Block Runnable completionHandler);
    /*</methods>*/
}
