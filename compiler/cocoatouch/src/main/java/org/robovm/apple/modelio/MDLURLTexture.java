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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLURLTexture/*</name>*/ 
    extends /*<extends>*/MDLTexture/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MDLURLTexturePtr extends Ptr<MDLURLTexture, MDLURLTexturePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLURLTexture.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLURLTexture() {}
    protected MDLURLTexture(Handle h, long handle) { super(h, handle); }
    protected MDLURLTexture(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithURL:name:")
    public MDLURLTexture(NSURL URL, String name) { super((SkipInit) null); initObject(init(URL, name)); }
    @Method(selector = "initWithData:topLeftOrigin:name:dimensions:rowStride:channelCount:channelEncoding:isCube:")
    public MDLURLTexture(NSData pixelData, boolean topLeftOrigin, String name, @ByVal VectorInt2 dimensions, @MachineSizedSInt long rowStride, @MachineSizedUInt long channelCount, MDLTextureChannelEncoding channelEncoding, boolean isCube) { super(pixelData, topLeftOrigin, name, dimensions, rowStride, channelCount, channelEncoding, isCube); }
    public MDLURLTexture(String name) { super((Handle) null, create(name)); retain(getHandle()); }
    public MDLURLTexture(String name, NSBundle bundleOrNil) { super((Handle) null, create(name, bundleOrNil)); retain(getHandle()); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    public MDLURLTexture(String name, MDLAssetResolver resolver) { super((Handle) null, create(name, resolver)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "URL")
    public native NSURL getURL();
    @Property(selector = "setURL:")
    public native void setURL(NSURL v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithURL:name:")
    protected native @Pointer long init(NSURL URL, String name);
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
    public static native MDLURLTexture newTextureCube(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> names);
    @Method(selector = "textureCubeWithImagesNamed:bundle:")
    public static native MDLURLTexture newTextureCube(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> names, NSBundle bundleOrNil);
    @Method(selector = "irradianceTextureCubeWithTexture:name:dimensions:")
    public static native MDLURLTexture newIrradianceTextureCube(MDLTexture texture, String name, @ByVal VectorInt2 dimensions);
    @Method(selector = "irradianceTextureCubeWithTexture:name:dimensions:roughness:")
    public static native MDLURLTexture newIrradianceTextureCube(MDLTexture texture, String name, @ByVal VectorInt2 dimensions, float roughness);
    /*</methods>*/
}
