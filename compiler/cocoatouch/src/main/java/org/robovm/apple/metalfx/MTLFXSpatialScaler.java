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
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTLFXSpatialScaler/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "colorTextureUsage")
    MTLTextureUsage getColorTextureUsage();
    @Property(selector = "outputTextureUsage")
    MTLTextureUsage getOutputTextureUsage();
    @Property(selector = "inputContentWidth")
    @MachineSizedUInt long getInputContentWidth();
    @Property(selector = "setInputContentWidth:")
    void setInputContentWidth(@MachineSizedUInt long v);
    @Property(selector = "inputContentHeight")
    @MachineSizedUInt long getInputContentHeight();
    @Property(selector = "setInputContentHeight:")
    void setInputContentHeight(@MachineSizedUInt long v);
    @Property(selector = "colorTexture")
    MTLTexture getColorTexture();
    @Property(selector = "setColorTexture:")
    void setColorTexture(MTLTexture v);
    @Property(selector = "outputTexture")
    MTLTexture getOutputTexture();
    @Property(selector = "setOutputTexture:")
    void setOutputTexture(MTLTexture v);
    @Property(selector = "colorTextureFormat")
    MTLPixelFormat getColorTextureFormat();
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
    @Property(selector = "colorProcessingMode")
    MTLFXSpatialScalerColorProcessingMode getColorProcessingMode();
    @Property(selector = "fence")
    MTLFence getFence();
    @Property(selector = "setFence:")
    void setFence(MTLFence v);
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "encodeToCommandBuffer:")
    void encodeToCommandBuffer(MTLCommandBuffer commandBuffer);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
