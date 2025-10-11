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
package org.robovm.apple.metalfx;

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
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalFX") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLFXTemporalDenoisedScalerDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLFXTemporalDenoisedScalerDescriptorPtr extends Ptr<MTLFXTemporalDenoisedScalerDescriptor, MTLFXTemporalDenoisedScalerDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLFXTemporalDenoisedScalerDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLFXTemporalDenoisedScalerDescriptor() {}
    protected MTLFXTemporalDenoisedScalerDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTLFXTemporalDenoisedScalerDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "colorTextureFormat")
    public native MTLPixelFormat getColorTextureFormat();
    @Property(selector = "setColorTextureFormat:")
    public native void setColorTextureFormat(MTLPixelFormat v);
    @Property(selector = "depthTextureFormat")
    public native MTLPixelFormat getDepthTextureFormat();
    @Property(selector = "setDepthTextureFormat:")
    public native void setDepthTextureFormat(MTLPixelFormat v);
    @Property(selector = "motionTextureFormat")
    public native MTLPixelFormat getMotionTextureFormat();
    @Property(selector = "setMotionTextureFormat:")
    public native void setMotionTextureFormat(MTLPixelFormat v);
    @Property(selector = "diffuseAlbedoTextureFormat")
    public native MTLPixelFormat getDiffuseAlbedoTextureFormat();
    @Property(selector = "setDiffuseAlbedoTextureFormat:")
    public native void setDiffuseAlbedoTextureFormat(MTLPixelFormat v);
    @Property(selector = "specularAlbedoTextureFormat")
    public native MTLPixelFormat getSpecularAlbedoTextureFormat();
    @Property(selector = "setSpecularAlbedoTextureFormat:")
    public native void setSpecularAlbedoTextureFormat(MTLPixelFormat v);
    @Property(selector = "normalTextureFormat")
    public native MTLPixelFormat getNormalTextureFormat();
    @Property(selector = "setNormalTextureFormat:")
    public native void setNormalTextureFormat(MTLPixelFormat v);
    @Property(selector = "roughnessTextureFormat")
    public native MTLPixelFormat getRoughnessTextureFormat();
    @Property(selector = "setRoughnessTextureFormat:")
    public native void setRoughnessTextureFormat(MTLPixelFormat v);
    @Property(selector = "specularHitDistanceTextureFormat")
    public native MTLPixelFormat getSpecularHitDistanceTextureFormat();
    @Property(selector = "setSpecularHitDistanceTextureFormat:")
    public native void setSpecularHitDistanceTextureFormat(MTLPixelFormat v);
    @Property(selector = "denoiseStrengthMaskTextureFormat")
    public native MTLPixelFormat getDenoiseStrengthMaskTextureFormat();
    @Property(selector = "setDenoiseStrengthMaskTextureFormat:")
    public native void setDenoiseStrengthMaskTextureFormat(MTLPixelFormat v);
    @Property(selector = "transparencyOverlayTextureFormat")
    public native MTLPixelFormat getTransparencyOverlayTextureFormat();
    @Property(selector = "setTransparencyOverlayTextureFormat:")
    public native void setTransparencyOverlayTextureFormat(MTLPixelFormat v);
    @Property(selector = "outputTextureFormat")
    public native MTLPixelFormat getOutputTextureFormat();
    @Property(selector = "setOutputTextureFormat:")
    public native void setOutputTextureFormat(MTLPixelFormat v);
    @Property(selector = "inputWidth")
    public native @MachineSizedUInt long getInputWidth();
    @Property(selector = "setInputWidth:")
    public native void setInputWidth(@MachineSizedUInt long v);
    @Property(selector = "inputHeight")
    public native @MachineSizedUInt long getInputHeight();
    @Property(selector = "setInputHeight:")
    public native void setInputHeight(@MachineSizedUInt long v);
    @Property(selector = "outputWidth")
    public native @MachineSizedUInt long getOutputWidth();
    @Property(selector = "setOutputWidth:")
    public native void setOutputWidth(@MachineSizedUInt long v);
    @Property(selector = "outputHeight")
    public native @MachineSizedUInt long getOutputHeight();
    @Property(selector = "setOutputHeight:")
    public native void setOutputHeight(@MachineSizedUInt long v);
    @Property(selector = "requiresSynchronousInitialization")
    public native boolean requiresSynchronousInitialization();
    @Property(selector = "setRequiresSynchronousInitialization:")
    public native void setRequiresSynchronousInitialization(boolean v);
    @Property(selector = "isAutoExposureEnabled")
    public native boolean isAutoExposureEnabled();
    @Property(selector = "setAutoExposureEnabled:")
    public native void setAutoExposureEnabled(boolean v);
    @Property(selector = "isReactiveMaskTextureEnabled")
    public native boolean isReactiveMaskTextureEnabled();
    @Property(selector = "setReactiveMaskTextureEnabled:")
    public native void setReactiveMaskTextureEnabled(boolean v);
    @Property(selector = "reactiveMaskTextureFormat")
    public native MTLPixelFormat getReactiveMaskTextureFormat();
    @Property(selector = "setReactiveMaskTextureFormat:")
    public native void setReactiveMaskTextureFormat(MTLPixelFormat v);
    @Property(selector = "isSpecularHitDistanceTextureEnabled")
    public native boolean isSpecularHitDistanceTextureEnabled();
    @Property(selector = "setSpecularHitDistanceTextureEnabled:")
    public native void setSpecularHitDistanceTextureEnabled(boolean v);
    @Property(selector = "isDenoiseStrengthMaskTextureEnabled")
    public native boolean isDenoiseStrengthMaskTextureEnabled();
    @Property(selector = "setDenoiseStrengthMaskTextureEnabled:")
    public native void setDenoiseStrengthMaskTextureEnabled(boolean v);
    @Property(selector = "isTransparencyOverlayTextureEnabled")
    public native boolean isTransparencyOverlayTextureEnabled();
    @Property(selector = "setTransparencyOverlayTextureEnabled:")
    public native void setTransparencyOverlayTextureEnabled(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "newTemporalDenoisedScalerWithDevice:")
    public native MTLFXTemporalDenoisedScaler newTemporalDenoisedScalerWithDevice$(MTLDevice device);
    @Method(selector = "newTemporalDenoisedScalerWithDevice:compiler:")
    public native MTL4FXTemporalDenoisedScaler newTemporalDenoisedScalerWithDevice$compiler$(MTLDevice device, MTL4Compiler compiler);
    @Method(selector = "supportedInputContentMinScaleForDevice:")
    public static native float supportedInputContentMinScaleForDevice(MTLDevice device);
    @Method(selector = "supportedInputContentMaxScaleForDevice:")
    public static native float supportedInputContentMaxScaleForDevice(MTLDevice device);
    @Method(selector = "supportsMetal4FX:")
    public static native boolean supportsMetal4FX(MTLDevice device);
    @Method(selector = "supportsDevice:")
    public static native boolean supportsDevice(MTLDevice device);
    /*</methods>*/
}
