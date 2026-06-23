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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLFXTemporalDenoisedScalerBaseAdapter/*</name>*/ 
    extends /*<extends>*/MTLFXFrameInterpolatableScalerAdapter/*</extends>*/ 
    /*<implements>*/implements MTLFXTemporalDenoisedScalerBase/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("colorTextureUsage")
    public MTLTextureUsage getColorTextureUsage() { return null; }
    @NotImplemented("depthTextureUsage")
    public MTLTextureUsage getDepthTextureUsage() { return null; }
    @NotImplemented("motionTextureUsage")
    public MTLTextureUsage getMotionTextureUsage() { return null; }
    @NotImplemented("reactiveTextureUsage")
    public MTLTextureUsage getReactiveTextureUsage() { return null; }
    @NotImplemented("diffuseAlbedoTextureUsage")
    public MTLTextureUsage getDiffuseAlbedoTextureUsage() { return null; }
    @NotImplemented("specularAlbedoTextureUsage")
    public MTLTextureUsage getSpecularAlbedoTextureUsage() { return null; }
    @NotImplemented("normalTextureUsage")
    public MTLTextureUsage getNormalTextureUsage() { return null; }
    @NotImplemented("roughnessTextureUsage")
    public MTLTextureUsage getRoughnessTextureUsage() { return null; }
    @NotImplemented("specularHitDistanceTextureUsage")
    public MTLTextureUsage getSpecularHitDistanceTextureUsage() { return null; }
    @NotImplemented("denoiseStrengthMaskTextureUsage")
    public MTLTextureUsage getDenoiseStrengthMaskTextureUsage() { return null; }
    @NotImplemented("transparencyOverlayTextureUsage")
    public MTLTextureUsage getTransparencyOverlayTextureUsage() { return null; }
    @NotImplemented("outputTextureUsage")
    public MTLTextureUsage getOutputTextureUsage() { return null; }
    @NotImplemented("colorTexture")
    public MTLTexture getColorTexture() { return null; }
    @NotImplemented("setColorTexture:")
    public void setColorTexture(MTLTexture v) {}
    @NotImplemented("depthTexture")
    public MTLTexture getDepthTexture() { return null; }
    @NotImplemented("setDepthTexture:")
    public void setDepthTexture(MTLTexture v) {}
    @NotImplemented("motionTexture")
    public MTLTexture getMotionTexture() { return null; }
    @NotImplemented("setMotionTexture:")
    public void setMotionTexture(MTLTexture v) {}
    @NotImplemented("diffuseAlbedoTexture")
    public MTLTexture getDiffuseAlbedoTexture() { return null; }
    @NotImplemented("setDiffuseAlbedoTexture:")
    public void setDiffuseAlbedoTexture(MTLTexture v) {}
    @NotImplemented("specularAlbedoTexture")
    public MTLTexture getSpecularAlbedoTexture() { return null; }
    @NotImplemented("setSpecularAlbedoTexture:")
    public void setSpecularAlbedoTexture(MTLTexture v) {}
    @NotImplemented("normalTexture")
    public MTLTexture getNormalTexture() { return null; }
    @NotImplemented("setNormalTexture:")
    public void setNormalTexture(MTLTexture v) {}
    @NotImplemented("roughnessTexture")
    public MTLTexture getRoughnessTexture() { return null; }
    @NotImplemented("setRoughnessTexture:")
    public void setRoughnessTexture(MTLTexture v) {}
    @NotImplemented("specularHitDistanceTexture")
    public MTLTexture getSpecularHitDistanceTexture() { return null; }
    @NotImplemented("setSpecularHitDistanceTexture:")
    public void setSpecularHitDistanceTexture(MTLTexture v) {}
    @NotImplemented("denoiseStrengthMaskTexture")
    public MTLTexture getDenoiseStrengthMaskTexture() { return null; }
    @NotImplemented("setDenoiseStrengthMaskTexture:")
    public void setDenoiseStrengthMaskTexture(MTLTexture v) {}
    @NotImplemented("transparencyOverlayTexture")
    public MTLTexture getTransparencyOverlayTexture() { return null; }
    @NotImplemented("setTransparencyOverlayTexture:")
    public void setTransparencyOverlayTexture(MTLTexture v) {}
    @NotImplemented("outputTexture")
    public MTLTexture getOutputTexture() { return null; }
    @NotImplemented("setOutputTexture:")
    public void setOutputTexture(MTLTexture v) {}
    @NotImplemented("exposureTexture")
    public MTLTexture getExposureTexture() { return null; }
    @NotImplemented("setExposureTexture:")
    public void setExposureTexture(MTLTexture v) {}
    @NotImplemented("preExposure")
    public float getPreExposure() { return 0; }
    @NotImplemented("setPreExposure:")
    public void setPreExposure(float v) {}
    @NotImplemented("reactiveMaskTexture")
    public MTLTexture getReactiveMaskTexture() { return null; }
    @NotImplemented("setReactiveMaskTexture:")
    public void setReactiveMaskTexture(MTLTexture v) {}
    @NotImplemented("jitterOffsetX")
    public float getJitterOffsetX() { return 0; }
    @NotImplemented("setJitterOffsetX:")
    public void setJitterOffsetX(float v) {}
    @NotImplemented("jitterOffsetY")
    public float getJitterOffsetY() { return 0; }
    @NotImplemented("setJitterOffsetY:")
    public void setJitterOffsetY(float v) {}
    @NotImplemented("motionVectorScaleX")
    public float getMotionVectorScaleX() { return 0; }
    @NotImplemented("setMotionVectorScaleX:")
    public void setMotionVectorScaleX(float v) {}
    @NotImplemented("motionVectorScaleY")
    public float getMotionVectorScaleY() { return 0; }
    @NotImplemented("setMotionVectorScaleY:")
    public void setMotionVectorScaleY(float v) {}
    @NotImplemented("shouldResetHistory")
    public boolean shouldResetHistory() { return false; }
    @NotImplemented("setShouldResetHistory:")
    public void setShouldResetHistory(boolean v) {}
    @NotImplemented("isDepthReversed")
    public boolean isDepthReversed() { return false; }
    @NotImplemented("setDepthReversed:")
    public void setDepthReversed(boolean v) {}
    @NotImplemented("colorTextureFormat")
    public MTLPixelFormat getColorTextureFormat() { return null; }
    @NotImplemented("depthTextureFormat")
    public MTLPixelFormat getDepthTextureFormat() { return null; }
    @NotImplemented("motionTextureFormat")
    public MTLPixelFormat getMotionTextureFormat() { return null; }
    @NotImplemented("diffuseAlbedoTextureFormat")
    public MTLPixelFormat getDiffuseAlbedoTextureFormat() { return null; }
    @NotImplemented("specularAlbedoTextureFormat")
    public MTLPixelFormat getSpecularAlbedoTextureFormat() { return null; }
    @NotImplemented("normalTextureFormat")
    public MTLPixelFormat getNormalTextureFormat() { return null; }
    @NotImplemented("roughnessTextureFormat")
    public MTLPixelFormat getRoughnessTextureFormat() { return null; }
    @NotImplemented("specularHitDistanceTextureFormat")
    public MTLPixelFormat getSpecularHitDistanceTextureFormat() { return null; }
    @NotImplemented("denoiseStrengthMaskTextureFormat")
    public MTLPixelFormat getDenoiseStrengthMaskTextureFormat() { return null; }
    @NotImplemented("transparencyOverlayTextureFormat")
    public MTLPixelFormat getTransparencyOverlayTextureFormat() { return null; }
    @NotImplemented("reactiveMaskTextureFormat")
    public MTLPixelFormat getReactiveMaskTextureFormat() { return null; }
    @NotImplemented("outputTextureFormat")
    public MTLPixelFormat getOutputTextureFormat() { return null; }
    @NotImplemented("inputWidth")
    public @MachineSizedUInt long getInputWidth() { return 0; }
    @NotImplemented("inputHeight")
    public @MachineSizedUInt long getInputHeight() { return 0; }
    @NotImplemented("outputWidth")
    public @MachineSizedUInt long getOutputWidth() { return 0; }
    @NotImplemented("outputHeight")
    public @MachineSizedUInt long getOutputHeight() { return 0; }
    @NotImplemented("inputContentMinScale")
    public float getInputContentMinScale() { return 0; }
    @NotImplemented("inputContentMaxScale")
    public float getInputContentMaxScale() { return 0; }
    @NotImplemented("worldToViewMatrix")
    public @ByVal MatrixFloat4x4 getWorldToViewMatrix() { return null; }
    @NotImplemented("setWorldToViewMatrix:")
    public void setWorldToViewMatrix(@ByVal MatrixFloat4x4 v) {}
    @NotImplemented("viewToClipMatrix")
    public @ByVal MatrixFloat4x4 getViewToClipMatrix() { return null; }
    @NotImplemented("setViewToClipMatrix:")
    public void setViewToClipMatrix(@ByVal MatrixFloat4x4 v) {}
    @NotImplemented("fence")
    public MTLFence getFence() { return null; }
    @NotImplemented("setFence:")
    public void setFence(MTLFence v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
