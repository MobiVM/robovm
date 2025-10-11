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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLFXFrameInterpolatorBaseAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MTLFXFrameInterpolatorBase/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("colorTextureUsage")
    public MTLTextureUsage getColorTextureUsage() { return null; }
    @NotImplemented("outputTextureUsage")
    public MTLTextureUsage getOutputTextureUsage() { return null; }
    @NotImplemented("depthTextureUsage")
    public MTLTextureUsage getDepthTextureUsage() { return null; }
    @NotImplemented("motionTextureUsage")
    public MTLTextureUsage getMotionTextureUsage() { return null; }
    @NotImplemented("uiTextureUsage")
    public MTLTextureUsage getUiTextureUsage() { return null; }
    @NotImplemented("colorTextureFormat")
    public MTLPixelFormat getColorTextureFormat() { return null; }
    @NotImplemented("depthTextureFormat")
    public MTLPixelFormat getDepthTextureFormat() { return null; }
    @NotImplemented("motionTextureFormat")
    public MTLPixelFormat getMotionTextureFormat() { return null; }
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
    @NotImplemented("uiTextureFormat")
    public MTLPixelFormat getUiTextureFormat() { return null; }
    @NotImplemented("colorTexture")
    public MTLTexture getColorTexture() { return null; }
    @NotImplemented("setColorTexture:")
    public void setColorTexture(MTLTexture v) {}
    @NotImplemented("prevColorTexture")
    public MTLTexture getPrevColorTexture() { return null; }
    @NotImplemented("setPrevColorTexture:")
    public void setPrevColorTexture(MTLTexture v) {}
    @NotImplemented("depthTexture")
    public MTLTexture getDepthTexture() { return null; }
    @NotImplemented("setDepthTexture:")
    public void setDepthTexture(MTLTexture v) {}
    @NotImplemented("motionTexture")
    public MTLTexture getMotionTexture() { return null; }
    @NotImplemented("setMotionTexture:")
    public void setMotionTexture(MTLTexture v) {}
    @NotImplemented("motionVectorScaleX")
    public float getMotionVectorScaleX() { return 0; }
    @NotImplemented("setMotionVectorScaleX:")
    public void setMotionVectorScaleX(float v) {}
    @NotImplemented("motionVectorScaleY")
    public float getMotionVectorScaleY() { return 0; }
    @NotImplemented("setMotionVectorScaleY:")
    public void setMotionVectorScaleY(float v) {}
    @NotImplemented("deltaTime")
    public float getDeltaTime() { return 0; }
    @NotImplemented("setDeltaTime:")
    public void setDeltaTime(float v) {}
    @NotImplemented("nearPlane")
    public float getNearPlane() { return 0; }
    @NotImplemented("setNearPlane:")
    public void setNearPlane(float v) {}
    @NotImplemented("farPlane")
    public float getFarPlane() { return 0; }
    @NotImplemented("setFarPlane:")
    public void setFarPlane(float v) {}
    @NotImplemented("fieldOfView")
    public float getFieldOfView() { return 0; }
    @NotImplemented("setFieldOfView:")
    public void setFieldOfView(float v) {}
    @NotImplemented("aspectRatio")
    public float getAspectRatio() { return 0; }
    @NotImplemented("setAspectRatio:")
    public void setAspectRatio(float v) {}
    @NotImplemented("uiTexture")
    public MTLTexture getUiTexture() { return null; }
    @NotImplemented("setUITexture:")
    public void setUiTexture(MTLTexture v) {}
    @NotImplemented("jitterOffsetX")
    public float getJitterOffsetX() { return 0; }
    @NotImplemented("setJitterOffsetX:")
    public void setJitterOffsetX(float v) {}
    @NotImplemented("jitterOffsetY")
    public float getJitterOffsetY() { return 0; }
    @NotImplemented("setJitterOffsetY:")
    public void setJitterOffsetY(float v) {}
    @NotImplemented("isUITextureComposited")
    public boolean isUiTextureComposited() { return false; }
    @NotImplemented("setIsUITextureComposited:")
    public void setUiTextureComposited(boolean v) {}
    @NotImplemented("shouldResetHistory")
    public boolean shouldResetHistory() { return false; }
    @NotImplemented("setShouldResetHistory:")
    public void setShouldResetHistory(boolean v) {}
    @NotImplemented("outputTexture")
    public MTLTexture getOutputTexture() { return null; }
    @NotImplemented("setOutputTexture:")
    public void setOutputTexture(MTLTexture v) {}
    @NotImplemented("fence")
    public MTLFence getFence() { return null; }
    @NotImplemented("setFence:")
    public void setFence(MTLFence v) {}
    @NotImplemented("isDepthReversed")
    public boolean isDepthReversed() { return false; }
    @NotImplemented("setDepthReversed:")
    public void setDepthReversed(boolean v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
