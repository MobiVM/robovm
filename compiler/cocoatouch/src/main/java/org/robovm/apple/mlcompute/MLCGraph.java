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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCGraph/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCGraphPtr extends Ptr<MLCGraph, MLCGraphPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCGraph.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MLCGraph() {}
    protected MLCGraph(Handle h, long handle) { super(h, handle); }
    protected MLCGraph(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "device")
    public native MLCDevice getDevice();
    @Property(selector = "layers")
    public native NSArray<MLCLayer> getLayers();
    @Property(selector = "summarizedDOTDescription")
    public native String getSummarizedDOTDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "nodeWithLayer:source:")
    public native MLCTensor node(MLCLayer layer, MLCTensor source);
    @Method(selector = "nodeWithLayer:sources:")
    public native MLCTensor node(MLCLayer layer, NSArray<MLCTensor> sources);
    @Method(selector = "nodeWithLayer:sources:disableUpdate:")
    public native MLCTensor node(MLCLayer layer, NSArray<MLCTensor> sources, boolean disableUpdate);
    @Method(selector = "nodeWithLayer:sources:lossLabels:")
    public native MLCTensor node(MLCLayer layer, NSArray<MLCTensor> sources, NSArray<MLCTensor> lossLabels);
    @Method(selector = "splitWithSource:splitCount:dimension:")
    public native NSArray<MLCTensor> split(MLCTensor source, @MachineSizedUInt long splitCount, @MachineSizedUInt long dimension);
    @Method(selector = "splitWithSource:splitSectionLengths:dimension:")
    public native NSArray<MLCTensor> split(MLCTensor source, NSArray<NSNumber> splitSectionLengths, @MachineSizedUInt long dimension);
    @Method(selector = "concatenateWithSources:dimension:")
    public native MLCTensor concatenate(NSArray<MLCTensor> sources, @MachineSizedUInt long dimension);
    @Method(selector = "reshapeWithShape:source:")
    public native MLCTensor reshape(NSArray<NSNumber> shape, MLCTensor source);
    @Method(selector = "transposeWithDimensions:source:")
    public native MLCTensor transpose(NSArray<NSNumber> dimensions, MLCTensor source);
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Method(selector = "selectWithSources:condition:")
    public native MLCTensor select(NSArray<MLCTensor> sources, MLCTensor condition);
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Method(selector = "scatterWithDimension:source:indices:copyFrom:reductionType:")
    public native MLCTensor scatter(@MachineSizedUInt long dimension, MLCTensor source, MLCTensor indices, MLCTensor copyFrom, MLCReductionType reductionType);
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Method(selector = "gatherWithDimension:source:indices:")
    public native MLCTensor gather(@MachineSizedUInt long dimension, MLCTensor source, MLCTensor indices);
    @Method(selector = "bindAndWriteData:forInputs:toDevice:batchSize:synchronous:")
    public native boolean bindAndWriteData(NSDictionary<NSString, MLCTensorData> inputsData, NSDictionary<NSString, MLCTensor> inputTensors, MLCDevice device, @MachineSizedUInt long batchSize, boolean synchronous);
    @Method(selector = "bindAndWriteData:forInputs:toDevice:synchronous:")
    public native boolean bindAndWriteData(NSDictionary<NSString, MLCTensorData> inputsData, NSDictionary<NSString, MLCTensor> inputTensors, MLCDevice device, boolean synchronous);
    @Method(selector = "sourceTensorsForLayer:")
    public native NSArray<MLCTensor> sourceTensorsForLayer(MLCLayer layer);
    @Method(selector = "resultTensorsForLayer:")
    public native NSArray<MLCTensor> resultTensorsForLayer(MLCLayer layer);
    @Method(selector = "graph")
    public static native MLCGraph graph();
    /*</methods>*/
}
