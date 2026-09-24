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
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShadersGraph") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSGraphGRUDescriptor/*</name>*/ 
    extends /*<extends>*/MPSGraphObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSGraphGRUDescriptorPtr extends Ptr<MPSGraphGRUDescriptor, MPSGraphGRUDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSGraphGRUDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSGraphGRUDescriptor() {}
    protected MPSGraphGRUDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSGraphGRUDescriptor(SkipInit skipInit) { super(skipInit); }
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
    @Property(selector = "training")
    public native boolean isTraining();
    @Property(selector = "setTraining:")
    public native void setTraining(boolean v);
    @Property(selector = "resetGateFirst")
    public native boolean isResetGateFirst();
    @Property(selector = "setResetGateFirst:")
    public native void setResetGateFirst(boolean v);
    @Property(selector = "resetAfter")
    public native boolean isResetAfter();
    @Property(selector = "setResetAfter:")
    public native void setResetAfter(boolean v);
    @Property(selector = "flipZ")
    public native boolean isFlipZ();
    @Property(selector = "setFlipZ:")
    public native void setFlipZ(boolean v);
    @Property(selector = "updateGateActivation")
    public native MPSGraphRNNActivation getUpdateGateActivation();
    @Property(selector = "setUpdateGateActivation:")
    public native void setUpdateGateActivation(MPSGraphRNNActivation v);
    @Property(selector = "resetGateActivation")
    public native MPSGraphRNNActivation getResetGateActivation();
    @Property(selector = "setResetGateActivation:")
    public native void setResetGateActivation(MPSGraphRNNActivation v);
    @Property(selector = "outputGateActivation")
    public native MPSGraphRNNActivation getOutputGateActivation();
    @Property(selector = "setOutputGateActivation:")
    public native void setOutputGateActivation(MPSGraphRNNActivation v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "descriptor")
    public static native MPSGraphGRUDescriptor descriptor();
    /*</methods>*/
}
