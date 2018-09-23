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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNYOLOLossDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNYOLOLossDescriptorPtr extends Ptr<MPSCNNYOLOLossDescriptor, MPSCNNYOLOLossDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNYOLOLossDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSCNNYOLOLossDescriptor() {}
    protected MPSCNNYOLOLossDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSCNNYOLOLossDescriptor(SkipInit skipInit) { super(skipInit); }
    public MPSCNNYOLOLossDescriptor(MPSCNNLossType XYLossType, MPSCNNLossType WHLossType, MPSCNNLossType confidenceLossType, MPSCNNLossType classesLossType, MPSCNNReductionType reductionType, NSData anchorBoxes, @MachineSizedUInt long numberOfAnchorBoxes) { super((Handle) null, create(XYLossType, WHLossType, confidenceLossType, classesLossType, reductionType, anchorBoxes, numberOfAnchorBoxes)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "XYLossDescriptor")
    public native MPSCNNLossDescriptor getXYLossDescriptor();
    @Property(selector = "setXYLossDescriptor:")
    public native void setXYLossDescriptor(MPSCNNLossDescriptor v);
    @Property(selector = "WHLossDescriptor")
    public native MPSCNNLossDescriptor getWHLossDescriptor();
    @Property(selector = "setWHLossDescriptor:")
    public native void setWHLossDescriptor(MPSCNNLossDescriptor v);
    @Property(selector = "confidenceLossDescriptor")
    public native MPSCNNLossDescriptor getConfidenceLossDescriptor();
    @Property(selector = "setConfidenceLossDescriptor:")
    public native void setConfidenceLossDescriptor(MPSCNNLossDescriptor v);
    @Property(selector = "classesLossDescriptor")
    public native MPSCNNLossDescriptor getClassesLossDescriptor();
    @Property(selector = "setClassesLossDescriptor:")
    public native void setClassesLossDescriptor(MPSCNNLossDescriptor v);
    @Property(selector = "reductionType")
    public native MPSCNNReductionType getReductionType();
    @Property(selector = "setReductionType:")
    public native void setReductionType(MPSCNNReductionType v);
    @Property(selector = "rescore")
    public native boolean isRescore();
    @Property(selector = "setRescore:")
    public native void setRescore(boolean v);
    @Property(selector = "scaleXY")
    public native float getScaleXY();
    @Property(selector = "setScaleXY:")
    public native void setScaleXY(float v);
    @Property(selector = "scaleWH")
    public native float getScaleWH();
    @Property(selector = "setScaleWH:")
    public native void setScaleWH(float v);
    @Property(selector = "scaleNoObject")
    public native float getScaleNoObject();
    @Property(selector = "setScaleNoObject:")
    public native void setScaleNoObject(float v);
    @Property(selector = "scaleObject")
    public native float getScaleObject();
    @Property(selector = "setScaleObject:")
    public native void setScaleObject(float v);
    @Property(selector = "scaleClass")
    public native float getScaleClass();
    @Property(selector = "setScaleClass:")
    public native void setScaleClass(float v);
    @Property(selector = "minIOUForObjectPresence")
    public native float getMinIOUForObjectPresence();
    @Property(selector = "setMinIOUForObjectPresence:")
    public native void setMinIOUForObjectPresence(float v);
    @Property(selector = "maxIOUForObjectAbsence")
    public native float getMaxIOUForObjectAbsence();
    @Property(selector = "setMaxIOUForObjectAbsence:")
    public native void setMaxIOUForObjectAbsence(float v);
    @Property(selector = "numberOfAnchorBoxes")
    public native @MachineSizedUInt long getNumberOfAnchorBoxes();
    @Property(selector = "setNumberOfAnchorBoxes:")
    public native void setNumberOfAnchorBoxes(@MachineSizedUInt long v);
    @Property(selector = "anchorBoxes")
    public native NSData getAnchorBoxes();
    @Property(selector = "setAnchorBoxes:")
    public native void setAnchorBoxes(NSData v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "cnnLossDescriptorWithXYLossType:WHLossType:confidenceLossType:classesLossType:reductionType:anchorBoxes:numberOfAnchorBoxes:")
    protected static native @Pointer long create(MPSCNNLossType XYLossType, MPSCNNLossType WHLossType, MPSCNNLossType confidenceLossType, MPSCNNLossType classesLossType, MPSCNNReductionType reductionType, NSData anchorBoxes, @MachineSizedUInt long numberOfAnchorBoxes);
    /*</methods>*/
}
