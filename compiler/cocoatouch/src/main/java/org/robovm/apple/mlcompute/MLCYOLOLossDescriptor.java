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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCYOLOLossDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCYOLOLossDescriptorPtr extends Ptr<MLCYOLOLossDescriptor, MLCYOLOLossDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCYOLOLossDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCYOLOLossDescriptor() {}
    protected MLCYOLOLossDescriptor(Handle h, long handle) { super(h, handle); }
    protected MLCYOLOLossDescriptor(SkipInit skipInit) { super(skipInit); }
    public MLCYOLOLossDescriptor(NSData anchorBoxes, @MachineSizedUInt long anchorBoxCount) { super((Handle) null, create(anchorBoxes, anchorBoxCount)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "anchorBoxCount")
    public native @MachineSizedUInt long getAnchorBoxCount();
    @Property(selector = "anchorBoxes")
    public native NSData getAnchorBoxes();
    @Property(selector = "shouldRescore")
    public native boolean shouldRescore();
    @Property(selector = "setShouldRescore:")
    public native void setShouldRescore(boolean v);
    @Property(selector = "scaleSpatialPositionLoss")
    public native float getScaleSpatialPositionLoss();
    @Property(selector = "setScaleSpatialPositionLoss:")
    public native void setScaleSpatialPositionLoss(float v);
    @Property(selector = "scaleSpatialSizeLoss")
    public native float getScaleSpatialSizeLoss();
    @Property(selector = "setScaleSpatialSizeLoss:")
    public native void setScaleSpatialSizeLoss(float v);
    @Property(selector = "scaleNoObjectConfidenceLoss")
    public native float getScaleNoObjectConfidenceLoss();
    @Property(selector = "setScaleNoObjectConfidenceLoss:")
    public native void setScaleNoObjectConfidenceLoss(float v);
    @Property(selector = "scaleObjectConfidenceLoss")
    public native float getScaleObjectConfidenceLoss();
    @Property(selector = "setScaleObjectConfidenceLoss:")
    public native void setScaleObjectConfidenceLoss(float v);
    @Property(selector = "scaleClassLoss")
    public native float getScaleClassLoss();
    @Property(selector = "setScaleClassLoss:")
    public native void setScaleClassLoss(float v);
    @Property(selector = "minimumIOUForObjectPresence")
    public native float getMinimumIOUForObjectPresence();
    @Property(selector = "setMinimumIOUForObjectPresence:")
    public native void setMinimumIOUForObjectPresence(float v);
    @Property(selector = "maximumIOUForObjectAbsence")
    public native float getMaximumIOUForObjectAbsence();
    @Property(selector = "setMaximumIOUForObjectAbsence:")
    public native void setMaximumIOUForObjectAbsence(float v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "descriptorWithAnchorBoxes:anchorBoxCount:")
    protected static native @Pointer long create(NSData anchorBoxes, @MachineSizedUInt long anchorBoxCount);
    /*</methods>*/
}
