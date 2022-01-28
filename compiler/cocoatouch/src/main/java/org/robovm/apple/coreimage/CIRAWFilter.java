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
package org.robovm.apple.coreimage;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.iosurface.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreImage") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIRAWFilter/*</name>*/ 
    extends /*<extends>*/CIFilter/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CIRAWFilterPtr extends Ptr<CIRAWFilter, CIRAWFilterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CIRAWFilter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CIRAWFilter(Handle h, long handle) { super(h, handle); }
    protected CIRAWFilter(SkipInit skipInit) { super(skipInit); }
    public CIRAWFilter(NSURL url) { super((Handle) null, create(url)); retain(getHandle()); }
    public CIRAWFilter(NSData data, String identifierHint) { super((Handle) null, create(data, identifierHint)); retain(getHandle()); }
    public CIRAWFilter(CVPixelBuffer buffer, NSDictionary<?, ?> properties) { super((Handle) null, create(buffer, properties)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportedCameraModels")
    public static native NSArray<NSString> getSupportedCameraModels();
    @Property(selector = "supportedDecoderVersions")
    public native NSArray<NSString> getSupportedDecoderVersions();
    @Property(selector = "nativeSize")
    public native @ByVal CGSize getNativeSize();
    @Property(selector = "properties")
    public native NSDictionary<?, ?> getProperties();
    @Property(selector = "orientation")
    public native CGImagePropertyOrientation getOrientation();
    @Property(selector = "setOrientation:")
    public native void setOrientation(CGImagePropertyOrientation v);
    @Property(selector = "isDraftModeEnabled")
    public native boolean isDraftModeEnabled();
    @Property(selector = "setDraftModeEnabled:")
    public native void setDraftModeEnabled(boolean v);
    @Property(selector = "decoderVersion")
    public native CIRAWDecoderVersion getDecoderVersion();
    @Property(selector = "setDecoderVersion:")
    public native void setDecoderVersion(CIRAWDecoderVersion v);
    @Property(selector = "scaleFactor")
    public native float getScaleFactor();
    @Property(selector = "setScaleFactor:")
    public native void setScaleFactor(float v);
    @Property(selector = "exposure")
    public native float getExposure();
    @Property(selector = "setExposure:")
    public native void setExposure(float v);
    @Property(selector = "baselineExposure")
    public native float getBaselineExposure();
    @Property(selector = "setBaselineExposure:")
    public native void setBaselineExposure(float v);
    @Property(selector = "shadowBias")
    public native float getShadowBias();
    @Property(selector = "setShadowBias:")
    public native void setShadowBias(float v);
    @Property(selector = "boostAmount")
    public native float getBoostAmount();
    @Property(selector = "setBoostAmount:")
    public native void setBoostAmount(float v);
    @Property(selector = "boostShadowAmount")
    public native float getBoostShadowAmount();
    @Property(selector = "setBoostShadowAmount:")
    public native void setBoostShadowAmount(float v);
    @Property(selector = "isGamutMappingEnabled")
    public native boolean isGamutMappingEnabled();
    @Property(selector = "setGamutMappingEnabled:")
    public native void setGamutMappingEnabled(boolean v);
    @Property(selector = "isLensCorrectionSupported")
    public native boolean isLensCorrectionSupported();
    @Property(selector = "isLensCorrectionEnabled")
    public native boolean isLensCorrectionEnabled();
    @Property(selector = "setLensCorrectionEnabled:")
    public native void setLensCorrectionEnabled(boolean v);
    @Property(selector = "isLuminanceNoiseReductionSupported")
    public native boolean isLuminanceNoiseReductionSupported();
    @Property(selector = "luminanceNoiseReductionAmount")
    public native float getLuminanceNoiseReductionAmount();
    @Property(selector = "setLuminanceNoiseReductionAmount:")
    public native void setLuminanceNoiseReductionAmount(float v);
    @Property(selector = "isColorNoiseReductionSupported")
    public native boolean isColorNoiseReductionSupported();
    @Property(selector = "colorNoiseReductionAmount")
    public native float getColorNoiseReductionAmount();
    @Property(selector = "setColorNoiseReductionAmount:")
    public native void setColorNoiseReductionAmount(float v);
    @Property(selector = "isSharpnessSupported")
    public native boolean isSharpnessSupported();
    @Property(selector = "sharpnessAmount")
    public native float getSharpnessAmount();
    @Property(selector = "setSharpnessAmount:")
    public native void setSharpnessAmount(float v);
    @Property(selector = "isContrastSupported")
    public native boolean isContrastSupported();
    @Property(selector = "contrastAmount")
    public native float getContrastAmount();
    @Property(selector = "setContrastAmount:")
    public native void setContrastAmount(float v);
    @Property(selector = "isDetailSupported")
    public native boolean isDetailSupported();
    @Property(selector = "detailAmount")
    public native float getDetailAmount();
    @Property(selector = "setDetailAmount:")
    public native void setDetailAmount(float v);
    @Property(selector = "isMoireReductionSupported")
    public native boolean isMoireReductionSupported();
    @Property(selector = "moireReductionAmount")
    public native float getMoireReductionAmount();
    @Property(selector = "setMoireReductionAmount:")
    public native void setMoireReductionAmount(float v);
    @Property(selector = "isLocalToneMapSupported")
    public native boolean isLocalToneMapSupported();
    @Property(selector = "localToneMapAmount")
    public native float getLocalToneMapAmount();
    @Property(selector = "setLocalToneMapAmount:")
    public native void setLocalToneMapAmount(float v);
    @Property(selector = "extendedDynamicRangeAmount")
    public native float getExtendedDynamicRangeAmount();
    @Property(selector = "setExtendedDynamicRangeAmount:")
    public native void setExtendedDynamicRangeAmount(float v);
    @Property(selector = "neutralChromaticity")
    public native @ByVal CGPoint getNeutralChromaticity();
    @Property(selector = "setNeutralChromaticity:")
    public native void setNeutralChromaticity(@ByVal CGPoint v);
    @Property(selector = "neutralLocation")
    public native @ByVal CGPoint getNeutralLocation();
    @Property(selector = "setNeutralLocation:")
    public native void setNeutralLocation(@ByVal CGPoint v);
    @Property(selector = "neutralTemperature")
    public native float getNeutralTemperature();
    @Property(selector = "setNeutralTemperature:")
    public native void setNeutralTemperature(float v);
    @Property(selector = "neutralTint")
    public native float getNeutralTint();
    @Property(selector = "setNeutralTint:")
    public native void setNeutralTint(float v);
    @Property(selector = "linearSpaceFilter")
    public native CIFilter getLinearSpaceFilter();
    @Property(selector = "setLinearSpaceFilter:")
    public native void setLinearSpaceFilter(CIFilter v);
    @Property(selector = "previewImage")
    public native CIImage getPreviewImage();
    @Property(selector = "portraitEffectsMatte")
    public native CIImage getPortraitEffectsMatte();
    @Property(selector = "semanticSegmentationSkinMatte")
    public native CIImage getSemanticSegmentationSkinMatte();
    @Property(selector = "semanticSegmentationHairMatte")
    public native CIImage getSemanticSegmentationHairMatte();
    @Property(selector = "semanticSegmentationGlassesMatte")
    public native CIImage getSemanticSegmentationGlassesMatte();
    @Property(selector = "semanticSegmentationSkyMatte")
    public native CIImage getSemanticSegmentationSkyMatte();
    @Property(selector = "semanticSegmentationTeethMatte")
    public native CIImage getSemanticSegmentationTeethMatte();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "filterWithImageURL:")
    protected static native @Pointer long create(NSURL url);
    @Method(selector = "filterWithImageData:identifierHint:")
    protected static native @Pointer long create(NSData data, String identifierHint);
    @Method(selector = "filterWithCVPixelBuffer:properties:")
    protected static native @Pointer long create(CVPixelBuffer buffer, NSDictionary<?, ?> properties);
    /*</methods>*/
}
