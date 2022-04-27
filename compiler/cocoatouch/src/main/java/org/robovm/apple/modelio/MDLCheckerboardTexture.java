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
package org.robovm.apple.modelio;

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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ModelIO") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLCheckerboardTexture/*</name>*/ 
    extends /*<extends>*/MDLTexture/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MDLCheckerboardTexturePtr extends Ptr<MDLCheckerboardTexture, MDLCheckerboardTexturePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLCheckerboardTexture.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLCheckerboardTexture() {}
    protected MDLCheckerboardTexture(Handle h, long handle) { super(h, handle); }
    protected MDLCheckerboardTexture(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDivisions:name:dimensions:channelCount:channelEncoding:color1:color2:")
    public MDLCheckerboardTexture(float divisions, String name, @ByVal VectorInt2 dimensions, int channelCount, MDLTextureChannelEncoding channelEncoding, CGColor color1, CGColor color2) { super((SkipInit) null); initObject(init(divisions, name, dimensions, channelCount, channelEncoding, color1, color2)); }
    @Method(selector = "initWithData:topLeftOrigin:name:dimensions:rowStride:channelCount:channelEncoding:isCube:")
    public MDLCheckerboardTexture(NSData pixelData, boolean topLeftOrigin, String name, @ByVal VectorInt2 dimensions, @MachineSizedSInt long rowStride, @MachineSizedUInt long channelCount, MDLTextureChannelEncoding channelEncoding, boolean isCube) { super(pixelData, topLeftOrigin, name, dimensions, rowStride, channelCount, channelEncoding, isCube); }
    public MDLCheckerboardTexture(String name) { super((Handle) null, create(name)); retain(getHandle()); }
    public MDLCheckerboardTexture(String name, NSBundle bundleOrNil) { super((Handle) null, create(name, bundleOrNil)); retain(getHandle()); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    public MDLCheckerboardTexture(String name, MDLAssetResolver resolver) { super((Handle) null, create(name, resolver)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "divisions")
    public native float getDivisions();
    @Property(selector = "setDivisions:")
    public native void setDivisions(float v);
    @Property(selector = "color1")
    public native CGColor getColor1();
    @Property(selector = "setColor1:")
    public native void setColor1(CGColor v);
    @Property(selector = "color2")
    public native CGColor getColor2();
    @Property(selector = "setColor2:")
    public native void setColor2(CGColor v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDivisions:name:dimensions:channelCount:channelEncoding:color1:color2:")
    protected native @Pointer long init(float divisions, String name, @ByVal VectorInt2 dimensions, int channelCount, MDLTextureChannelEncoding channelEncoding, CGColor color1, CGColor color2);
    @Method(selector = "textureNamed:")
    protected static native @Pointer long create(String name);
    @Method(selector = "textureNamed:bundle:")
    protected static native @Pointer long create(String name, NSBundle bundleOrNil);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "textureNamed:assetResolver:")
    protected static native @Pointer long create(String name, MDLAssetResolver resolver);
    @Method(selector = "textureCubeWithImagesNamed:")
    public static native MDLCheckerboardTexture newTextureCube(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> names);
    @Method(selector = "textureCubeWithImagesNamed:bundle:")
    public static native MDLCheckerboardTexture newTextureCube(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> names, NSBundle bundleOrNil);
    @Method(selector = "irradianceTextureCubeWithTexture:name:dimensions:")
    public static native MDLCheckerboardTexture newIrradianceTextureCube(MDLTexture texture, String name, @ByVal VectorInt2 dimensions);
    @Method(selector = "irradianceTextureCubeWithTexture:name:dimensions:roughness:")
    public static native MDLCheckerboardTexture newIrradianceTextureCube(MDLTexture texture, String name, @ByVal VectorInt2 dimensions, float roughness);
    /*</methods>*/
}
