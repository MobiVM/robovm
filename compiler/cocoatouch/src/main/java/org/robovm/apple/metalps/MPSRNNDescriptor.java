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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSRNNDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSRNNDescriptorPtr extends Ptr<MPSRNNDescriptor, MPSRNNDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSRNNDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSRNNDescriptor() {}
    protected MPSRNNDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSRNNDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "inputFeatureChannels")
    public native @MachineSizedUInt long getInputFeatureChannels();
    @Property(selector = "setInputFeatureChannels:")
    public native void setInputFeatureChannels(@MachineSizedUInt long v);
    @Property(selector = "outputFeatureChannels")
    public native @MachineSizedUInt long getOutputFeatureChannels();
    @Property(selector = "setOutputFeatureChannels:")
    public native void setOutputFeatureChannels(@MachineSizedUInt long v);
    @Property(selector = "useLayerInputUnitTransformMode")
    public native boolean isUseLayerInputUnitTransformMode();
    @Property(selector = "setUseLayerInputUnitTransformMode:")
    public native void setUseLayerInputUnitTransformMode(boolean v);
    @Property(selector = "useFloat32Weights")
    public native boolean isUseFloat32Weights();
    @Property(selector = "setUseFloat32Weights:")
    public native void setUseFloat32Weights(boolean v);
    @Property(selector = "layerSequenceDirection")
    public native MPSRNNSequenceDirection getLayerSequenceDirection();
    @Property(selector = "setLayerSequenceDirection:")
    public native void setLayerSequenceDirection(MPSRNNSequenceDirection v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
