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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLSkyCubeTexture/*</name>*/ 
    extends /*<extends>*/MDLTexture/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MDLSkyCubeTexturePtr extends Ptr<MDLSkyCubeTexture, MDLSkyCubeTexturePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLSkyCubeTexture.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLSkyCubeTexture() {}
    protected MDLSkyCubeTexture(Handle h, long handle) { super(h, handle); }
    protected MDLSkyCubeTexture(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithName:channelEncoding:textureDimensions:turbidity:sunElevation:upperAtmosphereScattering:groundAlbedo:")
    public MDLSkyCubeTexture(String name, MDLTextureChannelEncoding channelEncoding, @ByVal VectorInt2 textureDimensions, float turbidity, float sunElevation, float upperAtmosphereScattering, float groundAlbedo) { super((SkipInit) null); initObject(init(name, channelEncoding, textureDimensions, turbidity, sunElevation, upperAtmosphereScattering, groundAlbedo)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithName:channelEncoding:textureDimensions:turbidity:sunElevation:sunAzimuth:upperAtmosphereScattering:groundAlbedo:")
    public MDLSkyCubeTexture(String name, MDLTextureChannelEncoding channelEncoding, @ByVal VectorInt2 textureDimensions, float turbidity, float sunElevation, float sunAzimuth, float upperAtmosphereScattering, float groundAlbedo) { super((SkipInit) null); initObject(init(name, channelEncoding, textureDimensions, turbidity, sunElevation, sunAzimuth, upperAtmosphereScattering, groundAlbedo)); }
    @Method(selector = "initWithData:topLeftOrigin:name:dimensions:rowStride:channelCount:channelEncoding:isCube:")
    public MDLSkyCubeTexture(NSData pixelData, boolean topLeftOrigin, String name, @ByVal VectorInt2 dimensions, @MachineSizedSInt long rowStride, @MachineSizedUInt long channelCount, MDLTextureChannelEncoding channelEncoding, boolean isCube) { super(pixelData, topLeftOrigin, name, dimensions, rowStride, channelCount, channelEncoding, isCube); }
    public MDLSkyCubeTexture(String name) { super((Handle) null, create(name)); retain(getHandle()); }
    public MDLSkyCubeTexture(String name, NSBundle bundleOrNil) { super((Handle) null, create(name, bundleOrNil)); retain(getHandle()); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    public MDLSkyCubeTexture(String name, MDLAssetResolver resolver) { super((Handle) null, create(name, resolver)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "turbidity")
    public native float getTurbidity();
    @Property(selector = "setTurbidity:")
    public native void setTurbidity(float v);
    @Property(selector = "sunElevation")
    public native float getSunElevation();
    @Property(selector = "setSunElevation:")
    public native void setSunElevation(float v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "sunAzimuth")
    public native float getSunAzimuth();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSunAzimuth:")
    public native void setSunAzimuth(float v);
    @Property(selector = "upperAtmosphereScattering")
    public native float getUpperAtmosphereScattering();
    @Property(selector = "setUpperAtmosphereScattering:")
    public native void setUpperAtmosphereScattering(float v);
    @Property(selector = "groundAlbedo")
    public native float getGroundAlbedo();
    @Property(selector = "setGroundAlbedo:")
    public native void setGroundAlbedo(float v);
    @Property(selector = "horizonElevation")
    public native float getHorizonElevation();
    @Property(selector = "setHorizonElevation:")
    public native void setHorizonElevation(float v);
    @Property(selector = "groundColor")
    public native CGColor getGroundColor();
    @Property(selector = "setGroundColor:")
    public native void setGroundColor(CGColor v);
    @Property(selector = "gamma")
    public native float getGamma();
    @Property(selector = "setGamma:")
    public native void setGamma(float v);
    @Property(selector = "exposure")
    public native float getExposure();
    @Property(selector = "setExposure:")
    public native void setExposure(float v);
    @Property(selector = "brightness")
    public native float getBrightness();
    @Property(selector = "setBrightness:")
    public native void setBrightness(float v);
    @Property(selector = "contrast")
    public native float getContrast();
    @Property(selector = "setContrast:")
    public native void setContrast(float v);
    @Property(selector = "saturation")
    public native float getSaturation();
    @Property(selector = "setSaturation:")
    public native void setSaturation(float v);
    @Property(selector = "highDynamicRangeCompression")
    public native @ByVal VectorFloat2 getHighDynamicRangeCompression();
    @Property(selector = "setHighDynamicRangeCompression:")
    public native void setHighDynamicRangeCompression(@ByVal VectorFloat2 v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithName:channelEncoding:textureDimensions:turbidity:sunElevation:upperAtmosphereScattering:groundAlbedo:")
    protected native @Pointer long init(String name, MDLTextureChannelEncoding channelEncoding, @ByVal VectorInt2 textureDimensions, float turbidity, float sunElevation, float upperAtmosphereScattering, float groundAlbedo);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithName:channelEncoding:textureDimensions:turbidity:sunElevation:sunAzimuth:upperAtmosphereScattering:groundAlbedo:")
    protected native @Pointer long init(String name, MDLTextureChannelEncoding channelEncoding, @ByVal VectorInt2 textureDimensions, float turbidity, float sunElevation, float sunAzimuth, float upperAtmosphereScattering, float groundAlbedo);
    @Method(selector = "updateTexture")
    public native void updateTexture();
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
    public static native MDLSkyCubeTexture newTextureCube(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> names);
    @Method(selector = "textureCubeWithImagesNamed:bundle:")
    public static native MDLSkyCubeTexture newTextureCube(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> names, NSBundle bundleOrNil);
    @Method(selector = "irradianceTextureCubeWithTexture:name:dimensions:")
    public static native MDLSkyCubeTexture newIrradianceTextureCube(MDLTexture texture, String name, @ByVal VectorInt2 dimensions);
    @Method(selector = "irradianceTextureCubeWithTexture:name:dimensions:roughness:")
    public static native MDLSkyCubeTexture newIrradianceTextureCube(MDLTexture texture, String name, @ByVal VectorInt2 dimensions, float roughness);
    /*</methods>*/
}
