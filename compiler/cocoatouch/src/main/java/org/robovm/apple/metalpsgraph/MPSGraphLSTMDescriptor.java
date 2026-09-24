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
package org.robovm.apple.metalpsgraph;

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
 * @since Available in iOS 15.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShadersGraph") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSGraphLSTMDescriptor/*</name>*/ 
    extends /*<extends>*/MPSGraphObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSGraphLSTMDescriptorPtr extends Ptr<MPSGraphLSTMDescriptor, MPSGraphLSTMDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSGraphLSTMDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSGraphLSTMDescriptor() {}
    protected MPSGraphLSTMDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSGraphLSTMDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "reverse")
    public native boolean isReverse();
    @Property(selector = "setReverse:")
    public native void setReverse(boolean v);
    @Property(selector = "bidirectional")
    public native boolean isBidirectional();
    @Property(selector = "setBidirectional:")
    public native void setBidirectional(boolean v);
    @Property(selector = "produceCell")
    public native boolean isProduceCell();
    @Property(selector = "setProduceCell:")
    public native void setProduceCell(boolean v);
    @Property(selector = "training")
    public native boolean isTraining();
    @Property(selector = "setTraining:")
    public native void setTraining(boolean v);
    @Property(selector = "forgetGateLast")
    public native boolean isForgetGateLast();
    @Property(selector = "setForgetGateLast:")
    public native void setForgetGateLast(boolean v);
    @Property(selector = "inputGateActivation")
    public native MPSGraphRNNActivation getInputGateActivation();
    @Property(selector = "setInputGateActivation:")
    public native void setInputGateActivation(MPSGraphRNNActivation v);
    @Property(selector = "forgetGateActivation")
    public native MPSGraphRNNActivation getForgetGateActivation();
    @Property(selector = "setForgetGateActivation:")
    public native void setForgetGateActivation(MPSGraphRNNActivation v);
    @Property(selector = "cellGateActivation")
    public native MPSGraphRNNActivation getCellGateActivation();
    @Property(selector = "setCellGateActivation:")
    public native void setCellGateActivation(MPSGraphRNNActivation v);
    @Property(selector = "outputGateActivation")
    public native MPSGraphRNNActivation getOutputGateActivation();
    @Property(selector = "setOutputGateActivation:")
    public native void setOutputGateActivation(MPSGraphRNNActivation v);
    @Property(selector = "activation")
    public native MPSGraphRNNActivation getActivation();
    @Property(selector = "setActivation:")
    public native void setActivation(MPSGraphRNNActivation v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "descriptor")
    public static native MPSGraphLSTMDescriptor descriptor();
    /*</methods>*/
}
