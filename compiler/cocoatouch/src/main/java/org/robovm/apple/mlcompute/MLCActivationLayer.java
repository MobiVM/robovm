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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCActivationLayer/*</name>*/ 
    extends /*<extends>*/MLCLayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCActivationLayerPtr extends Ptr<MLCActivationLayer, MLCActivationLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCActivationLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCActivationLayer() {}
    protected MLCActivationLayer(Handle h, long handle) { super(h, handle); }
    protected MLCActivationLayer(SkipInit skipInit) { super(skipInit); }
    public MLCActivationLayer(MLCActivationDescriptor descriptor) { super((Handle) null, create(descriptor)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "descriptor")
    public native MLCActivationDescriptor getDescriptor();
    @Property(selector = "reluLayer")
    public static native MLCActivationLayer getReluLayer();
    @Property(selector = "relu6Layer")
    public static native MLCActivationLayer getRelu6Layer();
    @Property(selector = "leakyReLULayer")
    public static native MLCActivationLayer getLeakyReLULayer();
    @Property(selector = "sigmoidLayer")
    public static native MLCActivationLayer getSigmoidLayer();
    @Property(selector = "hardSigmoidLayer")
    public static native MLCActivationLayer getHardSigmoidLayer();
    @Property(selector = "tanhLayer")
    public static native MLCActivationLayer getTanhLayer();
    @Property(selector = "absoluteLayer")
    public static native MLCActivationLayer getAbsoluteLayer();
    @Property(selector = "softPlusLayer")
    public static native MLCActivationLayer getSoftPlusLayer();
    @Property(selector = "softSignLayer")
    public static native MLCActivationLayer getSoftSignLayer();
    @Property(selector = "eluLayer")
    public static native MLCActivationLayer getEluLayer();
    @Property(selector = "logSigmoidLayer")
    public static native MLCActivationLayer getLogSigmoidLayer();
    @Property(selector = "seluLayer")
    public static native MLCActivationLayer getSeluLayer();
    @Property(selector = "celuLayer")
    public static native MLCActivationLayer getCeluLayer();
    @Property(selector = "hardShrinkLayer")
    public static native MLCActivationLayer getHardShrinkLayer();
    @Property(selector = "softShrinkLayer")
    public static native MLCActivationLayer getSoftShrinkLayer();
    @Property(selector = "tanhShrinkLayer")
    public static native MLCActivationLayer getTanhShrinkLayer();
    @Property(selector = "geluLayer")
    public static native MLCActivationLayer getGeluLayer();
    @Property(selector = "hardSwishLayer")
    public static native MLCActivationLayer getHardSwishLayer();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "layerWithDescriptor:")
    protected static native @Pointer long create(MLCActivationDescriptor descriptor);
    @Method(selector = "leakyReLULayerWithNegativeSlope:")
    public static native MLCActivationLayer createLeakyReLULayer(float negativeSlope);
    @Method(selector = "linearLayerWithScale:bias:")
    public static native MLCActivationLayer createLinearLayer(float scale, float bias);
    @Method(selector = "softPlusLayerWithBeta:")
    public static native MLCActivationLayer createSoftPlusLayer(float beta);
    @Method(selector = "eluLayerWithA:")
    public static native MLCActivationLayer createEluLayer(float a);
    @Method(selector = "relunLayerWithA:b:")
    public static native MLCActivationLayer createRelunLayer(float a, float b);
    @Method(selector = "celuLayerWithA:")
    public static native MLCActivationLayer createCeluLayer(float a);
    @Method(selector = "hardShrinkLayerWithA:")
    public static native MLCActivationLayer createHardShrinkLayer(float a);
    @Method(selector = "softShrinkLayerWithA:")
    public static native MLCActivationLayer createSoftShrinkLayer(float a);
    @Method(selector = "thresholdLayerWithThreshold:replacement:")
    public static native MLCActivationLayer createThresholdLayer(float threshold, float replacement);
    @Method(selector = "clampLayerWithMinValue:maxValue:")
    public static native MLCActivationLayer createClampLayer(float minValue, float maxValue);
    @Method(selector = "supportsDataType:onDevice:")
    public static native boolean supportsDataType(MLCDataType dataType, MLCDevice device);
    /*</methods>*/
}
