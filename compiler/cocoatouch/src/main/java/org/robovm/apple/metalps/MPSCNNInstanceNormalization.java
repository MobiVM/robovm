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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNInstanceNormalization/*</name>*/ 
    extends /*<extends>*/MPSCNNKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNInstanceNormalizationPtr extends Ptr<MPSCNNInstanceNormalization, MPSCNNInstanceNormalizationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNInstanceNormalization.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNInstanceNormalization() {}
    protected MPSCNNInstanceNormalization(Handle h, long handle) { super(h, handle); }
    protected MPSCNNInstanceNormalization(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:dataSource:")
    public MPSCNNInstanceNormalization(MTLDevice device, MPSCNNInstanceNormalizationDataSource dataSource) { super((SkipInit) null); initObject(init(device, dataSource)); }
    @Method(selector = "initWithCoder:device:")
    public MPSCNNInstanceNormalization(NSCoder aDecoder, MTLDevice device) { super((SkipInit) null); initObject(init(aDecoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSCNNInstanceNormalization(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "epsilon")
    public native float getEpsilon();
    @Property(selector = "setEpsilon:")
    public native void setEpsilon(float v);
    @Property(selector = "dataSource")
    public native MPSCNNInstanceNormalizationDataSource getDataSource();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:dataSource:")
    protected native @Pointer long init(MTLDevice device, MPSCNNInstanceNormalizationDataSource dataSource);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder aDecoder, MTLDevice device);
    /**
     * @since Available in iOS 11.3 and later.
     * @deprecated Deprecated in iOS 12.0. Use Please use -reloadGammaAndBetaFromDataSource instead.
     */
    @Deprecated
    @Method(selector = "reloadDataSource:")
    public native void reloadDataSource(MPSCNNInstanceNormalizationDataSource dataSource);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "reloadGammaAndBetaFromDataSource")
    public native void reloadGammaAndBetaFromDataSource();
    @Method(selector = "reloadGammaAndBetaWithCommandBuffer:gammaAndBetaState:")
    public native void reloadGammaAndBeta(MTLCommandBuffer commandBuffer, MPSCNNNormalizationGammaAndBetaState gammaAndBetaState);
    @Method(selector = "resultStateForSourceImage:sourceStates:destinationImage:")
    public native MPSCNNInstanceNormalizationGradientState getResultState(MPSImage sourceImage, NSArray<MPSState> sourceStates, MPSImage destinationImage);
    @Method(selector = "temporaryResultStateForCommandBuffer:sourceImage:sourceStates:destinationImage:")
    public native MPSCNNInstanceNormalizationGradientState getTemporaryResultState(MTLCommandBuffer commandBuffer, MPSImage sourceImage, NSArray<MPSState> sourceStates, MPSImage destinationImage);
    /*</methods>*/
}
