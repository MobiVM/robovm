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
package org.robovm.apple.metalps;

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
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNConvolutionGradientState/*</name>*/ 
    extends /*<extends>*/MPSNNGradientState/*</extends>*/ 
    /*<implements>*/implements MPSImageSizeEncodingState/*</implements>*/ {

    /*<ptr>*/public static class MPSCNNConvolutionGradientStatePtr extends Ptr<MPSCNNConvolutionGradientState, MPSCNNConvolutionGradientStatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNConvolutionGradientState.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSCNNConvolutionGradientState() {}
    protected MPSCNNConvolutionGradientState(Handle h, long handle) { super(h, handle); }
    protected MPSCNNConvolutionGradientState(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:bufferSize:")
    public MPSCNNConvolutionGradientState(MTLDevice device, @MachineSizedUInt long bufferSize) { super(device, bufferSize); }
    @Method(selector = "initWithDevice:textureDescriptor:")
    public MPSCNNConvolutionGradientState(MTLDevice device, MTLTextureDescriptor descriptor) { super(device, descriptor); }
    @Method(selector = "initWithResource:")
    public MPSCNNConvolutionGradientState(MTLResource resource) { super(resource); }
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "initWithDevice:resourceList:")
    public MPSCNNConvolutionGradientState(MTLDevice device, MPSStateResourceList resourceList) { super(device, resourceList); }
    @Method(selector = "initWithResources:")
    public MPSCNNConvolutionGradientState(NSArray<?> resources) { super(resources); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "gradientForWeights")
    public native MTLBuffer getGradientForWeights();
    @Property(selector = "gradientForBiases")
    public native MTLBuffer getGradientForBiases();
    @Property(selector = "convolution")
    public native MPSCNNConvolution getConvolution();
    @Property(selector = "sourceWidth")
    public native @MachineSizedUInt long getSourceWidth();
    @Property(selector = "sourceHeight")
    public native @MachineSizedUInt long getSourceHeight();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
