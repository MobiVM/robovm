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
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNNormalizationMeanAndVarianceState/*</name>*/ 
    extends /*<extends>*/MPSState/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNNormalizationMeanAndVarianceStatePtr extends Ptr<MPSCNNNormalizationMeanAndVarianceState, MPSCNNNormalizationMeanAndVarianceStatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNNormalizationMeanAndVarianceState.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSCNNNormalizationMeanAndVarianceState() {}
    protected MPSCNNNormalizationMeanAndVarianceState(Handle h, long handle) { super(h, handle); }
    protected MPSCNNNormalizationMeanAndVarianceState(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithMean:variance:")
    public MPSCNNNormalizationMeanAndVarianceState(MTLBuffer mean, MTLBuffer variance) { super((SkipInit) null); initObject(initWithMean$variance$(mean, variance)); }
    @Method(selector = "initWithDevice:bufferSize:")
    public MPSCNNNormalizationMeanAndVarianceState(MTLDevice device, @MachineSizedUInt long bufferSize) { super((SkipInit) null); initObject(init(device, bufferSize)); }
    @Method(selector = "initWithDevice:textureDescriptor:")
    public MPSCNNNormalizationMeanAndVarianceState(MTLDevice device, MTLTextureDescriptor descriptor) { super((SkipInit) null); initObject(init(device, descriptor)); }
    @Method(selector = "initWithResource:")
    public MPSCNNNormalizationMeanAndVarianceState(MTLResource resource) { super((SkipInit) null); initObject(init(resource)); }
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "initWithDevice:resourceList:")
    public MPSCNNNormalizationMeanAndVarianceState(MTLDevice device, MPSStateResourceList resourceList) { super((SkipInit) null); initObject(init(device, resourceList)); }
    @Method(selector = "initWithResources:")
    public MPSCNNNormalizationMeanAndVarianceState(NSArray<?> resources) { super((SkipInit) null); initObject(init(resources)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mean")
    public native MTLBuffer getMean();
    @Property(selector = "variance")
    public native MTLBuffer getVariance();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMean:variance:")
    protected native @Pointer long initWithMean$variance$(MTLBuffer mean, MTLBuffer variance);
    @Method(selector = "temporaryStateWithCommandBuffer:numberOfFeatureChannels:")
    public static native MPSCNNNormalizationMeanAndVarianceState temporaryStateWithCommandBuffer$numberOfFeatureChannels$(MTLCommandBuffer commandBuffer, @MachineSizedUInt long numberOfFeatureChannels);
    @Method(selector = "initWithDevice:bufferSize:")
    protected native @Pointer long init(MTLDevice device, @MachineSizedUInt long bufferSize);
    @Method(selector = "initWithDevice:textureDescriptor:")
    protected native @Pointer long init(MTLDevice device, MTLTextureDescriptor descriptor);
    @Method(selector = "initWithResource:")
    protected native @Pointer long init(MTLResource resource);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "initWithDevice:resourceList:")
    protected native @Pointer long init(MTLDevice device, MPSStateResourceList resourceList);
    @Method(selector = "initWithResources:")
    protected native @Pointer long init(NSArray<?> resources);
    /*</methods>*/
}