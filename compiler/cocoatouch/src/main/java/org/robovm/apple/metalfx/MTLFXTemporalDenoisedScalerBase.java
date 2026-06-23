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
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTLFXTemporalDenoisedScalerBase/*</name>*/ 
    /*<implements>*/extends MTLFXFrameInterpolatableScaler/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "colorTextureUsage")
    MTLTextureUsage getColorTextureUsage();
    @Property(selector = "depthTextureUsage")
    MTLTextureUsage getDepthTextureUsage();
    @Property(selector = "motionTextureUsage")
    MTLTextureUsage getMotionTextureUsage();
    @Property(selector = "reactiveTextureUsage")
    MTLTextureUsage getReactiveTextureUsage();
    @Property(selector = "diffuseAlbedoTextureUsage")
    MTLTextureUsage getDiffuseAlbedoTextureUsage();
    @Property(selector = "specularAlbedoTextureUsage")
    MTLTextureUsage getSpecularAlbedoTextureUsage();
    @Property(selector = "normalTextureUsage")
    MTLTextureUsage getNormalTextureUsage();
    @Property(selector = "roughnessTextureUsage")
    MTLTextureUsage getRoughnessTextureUsage();
    @Property(selector = "specularHitDistanceTextureUsage")
    MTLTextureUsage getSpecularHitDistanceTextureUsage();
    @Property(selector = "denoiseStrengthMaskTextureUsage")
    MTLTextureUsage getDenoiseStrengthMaskTextureUsage();
    @Property(selector = "transparencyOverlayTextureUsage")
    MTLTextureUsage getTransparencyOverlayTextureUsage();
    @Property(selector = "outputTextureUsage")
    MTLTextureUsage getOutputTextureUsage();
    @Property(selector = "colorTexture")
    MTLTexture getColorTexture();
    @Property(selector = "setColorTexture:")
    void setColorTexture(MTLTexture v);
    @Property(selector = "depthTexture")
    MTLTexture getDepthTexture();
    @Property(selector = "setDepthTexture:")
    void setDepthTexture(MTLTexture v);
    @Property(selector = "motionTexture")
    MTLTexture getMotionTexture();
    @Property(selector = "setMotionTexture:")
    void setMotionTexture(MTLTexture v);
    @Property(selector = "diffuseAlbedoTexture")
    MTLTexture getDiffuseAlbedoTexture();
    @Property(selector = "setDiffuseAlbedoTexture:")
    void setDiffuseAlbedoTexture(MTLTexture v);
    @Property(selector = "specularAlbedoTexture")
    MTLTexture getSpecularAlbedoTexture();
    @Property(selector = "setSpecularAlbedoTexture:")
    void setSpecularAlbedoTexture(MTLTexture v);
    @Property(selector = "normalTexture")
    MTLTexture getNormalTexture();
    @Property(selector = "setNormalTexture:")
    void setNormalTexture(MTLTexture v);
    @Property(selector = "roughnessTexture")
    MTLTexture getRoughnessTexture();
    @Property(selector = "setRoughnessTexture:")
    void setRoughnessTexture(MTLTexture v);
    @Property(selector = "specularHitDistanceTexture")
    MTLTexture getSpecularHitDistanceTexture();
    @Property(selector = "setSpecularHitDistanceTexture:")
    void setSpecularHitDistanceTexture(MTLTexture v);
    @Property(selector = "denoiseStrengthMaskTexture")
    MTLTexture getDenoiseStrengthMaskTexture();
    @Property(selector = "setDenoiseStrengthMaskTexture:")
    void setDenoiseStrengthMaskTexture(MTLTexture v);
    @Property(selector = "transparencyOverlayTexture")
    MTLTexture getTransparencyOverlayTexture();
    @Property(selector = "setTransparencyOverlayTexture:")
    void setTransparencyOverlayTexture(MTLTexture v);
    @Property(selector = "outputTexture")
    MTLTexture getOutputTexture();
    @Property(selector = "setOutputTexture:")
    void setOutputTexture(MTLTexture v);
    @Property(selector = "exposureTexture")
    MTLTexture getExposureTexture();
    @Property(selector = "setExposureTexture:")
    void setExposureTexture(MTLTexture v);
    @Property(selector = "preExposure")
    float getPreExposure();
    @Property(selector = "setPreExposure:")
    void setPreExposure(float v);
    @Property(selector = "reactiveMaskTexture")
    MTLTexture getReactiveMaskTexture();
    @Property(selector = "setReactiveMaskTexture:")
    void setReactiveMaskTexture(MTLTexture v);
    @Property(selector = "jitterOffsetX")
    float getJitterOffsetX();
    @Property(selector = "setJitterOffsetX:")
    void setJitterOffsetX(float v);
    @Property(selector = "jitterOffsetY")
    float getJitterOffsetY();
    @Property(selector = "setJitterOffsetY:")
    void setJitterOffsetY(float v);
    @Property(selector = "motionVectorScaleX")
    float getMotionVectorScaleX();
    @Property(selector = "setMotionVectorScaleX:")
    void setMotionVectorScaleX(float v);
    @Property(selector = "motionVectorScaleY")
    float getMotionVectorScaleY();
    @Property(selector = "setMotionVectorScaleY:")
    void setMotionVectorScaleY(float v);
    @Property(selector = "shouldResetHistory")
    boolean shouldResetHistory();
    @Property(selector = "setShouldResetHistory:")
    void setShouldResetHistory(boolean v);
    @Property(selector = "isDepthReversed")
    boolean isDepthReversed();
    @Property(selector = "setDepthReversed:")
    void setDepthReversed(boolean v);
    @Property(selector = "colorTextureFormat")
    MTLPixelFormat getColorTextureFormat();
    @Property(selector = "depthTextureFormat")
    MTLPixelFormat getDepthTextureFormat();
    @Property(selector = "motionTextureFormat")
    MTLPixelFormat getMotionTextureFormat();
    @Property(selector = "diffuseAlbedoTextureFormat")
    MTLPixelFormat getDiffuseAlbedoTextureFormat();
    @Property(selector = "specularAlbedoTextureFormat")
    MTLPixelFormat getSpecularAlbedoTextureFormat();
    @Property(selector = "normalTextureFormat")
    MTLPixelFormat getNormalTextureFormat();
    @Property(selector = "roughnessTextureFormat")
    MTLPixelFormat getRoughnessTextureFormat();
    @Property(selector = "specularHitDistanceTextureFormat")
    MTLPixelFormat getSpecularHitDistanceTextureFormat();
    @Property(selector = "denoiseStrengthMaskTextureFormat")
    MTLPixelFormat getDenoiseStrengthMaskTextureFormat();
    @Property(selector = "transparencyOverlayTextureFormat")
    MTLPixelFormat getTransparencyOverlayTextureFormat();
    @Property(selector = "reactiveMaskTextureFormat")
    MTLPixelFormat getReactiveMaskTextureFormat();
    @Property(selector = "outputTextureFormat")
    MTLPixelFormat getOutputTextureFormat();
    @Property(selector = "inputWidth")
    @MachineSizedUInt long getInputWidth();
    @Property(selector = "inputHeight")
    @MachineSizedUInt long getInputHeight();
    @Property(selector = "outputWidth")
    @MachineSizedUInt long getOutputWidth();
    @Property(selector = "outputHeight")
    @MachineSizedUInt long getOutputHeight();
    @Property(selector = "inputContentMinScale")
    float getInputContentMinScale();
    @Property(selector = "inputContentMaxScale")
    float getInputContentMaxScale();
    @Property(selector = "worldToViewMatrix")
    @ByVal MatrixFloat4x4 getWorldToViewMatrix();
    @Property(selector = "setWorldToViewMatrix:")
    void setWorldToViewMatrix(@ByVal MatrixFloat4x4 v);
    @Property(selector = "viewToClipMatrix")
    @ByVal MatrixFloat4x4 getViewToClipMatrix();
    @Property(selector = "setViewToClipMatrix:")
    void setViewToClipMatrix(@ByVal MatrixFloat4x4 v);
    @Property(selector = "fence")
    MTLFence getFence();
    @Property(selector = "setFence:")
    void setFence(MTLFence v);
    /*</properties>*/
    /*<methods>*/
    
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
