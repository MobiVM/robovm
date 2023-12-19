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
package org.robovm.apple.mlcompute;

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
import org.robovm.apple.metalps.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 * @deprecated Use Metal Performance Shaders Graph or BNNS instead.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MLCompute") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCLayerNormalizationLayer/*</name>*/ 
    extends /*<extends>*/MLCLayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCLayerNormalizationLayerPtr extends Ptr<MLCLayerNormalizationLayer, MLCLayerNormalizationLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCLayerNormalizationLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCLayerNormalizationLayer() {}
    protected MLCLayerNormalizationLayer(Handle h, long handle) { super(h, handle); }
    protected MLCLayerNormalizationLayer(SkipInit skipInit) { super(skipInit); }
    public MLCLayerNormalizationLayer(NSArray<NSNumber> normalizedShape, MLCTensor beta, MLCTensor gamma, float varianceEpsilon) { super((Handle) null, create(normalizedShape, beta, gamma, varianceEpsilon)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "normalizedShape")
    public native NSArray<NSNumber> getNormalizedShape();
    @Property(selector = "beta")
    public native MLCTensor getBeta();
    @Property(selector = "gamma")
    public native MLCTensor getGamma();
    @Property(selector = "betaParameter")
    public native MLCTensorParameter getBetaParameter();
    @Property(selector = "gammaParameter")
    public native MLCTensorParameter getGammaParameter();
    @Property(selector = "varianceEpsilon")
    public native float getVarianceEpsilon();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "layerWithNormalizedShape:beta:gamma:varianceEpsilon:")
    protected static native @Pointer long create(NSArray<NSNumber> normalizedShape, MLCTensor beta, MLCTensor gamma, float varianceEpsilon);
    @Method(selector = "supportsDataType:onDevice:")
    public static native boolean supportsDataType(MLCDataType dataType, MLCDevice device);
    /*</methods>*/
}
