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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSMatrixRandomDistributionDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSMatrixRandomDistributionDescriptorPtr extends Ptr<MPSMatrixRandomDistributionDescriptor, MPSMatrixRandomDistributionDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSMatrixRandomDistributionDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSMatrixRandomDistributionDescriptor() {}
    protected MPSMatrixRandomDistributionDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSMatrixRandomDistributionDescriptor(SkipInit skipInit) { super(skipInit); }
    public MPSMatrixRandomDistributionDescriptor(float minimum, float maximum) { super((Handle) null, create(minimum, maximum)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "distributionType")
    public native MPSMatrixRandomDistribution getDistributionType();
    @Property(selector = "setDistributionType:")
    public native void setDistributionType(MPSMatrixRandomDistribution v);
    @Property(selector = "minimum")
    public native float getMinimum();
    @Property(selector = "setMinimum:")
    public native void setMinimum(float v);
    @Property(selector = "maximum")
    public native float getMaximum();
    @Property(selector = "setMaximum:")
    public native void setMaximum(float v);
    @Property(selector = "mean")
    public native float getMean();
    @Property(selector = "setMean:")
    public native void setMean(float v);
    @Property(selector = "standardDeviation")
    public native float getStandardDeviation();
    @Property(selector = "setStandardDeviation:")
    public native void setStandardDeviation(float v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "uniformDistributionDescriptorWithMinimum:maximum:")
    protected static native @Pointer long create(float minimum, float maximum);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "normalDistributionDescriptorWithMean:standardDeviation:")
    public static native MPSMatrixRandomDistributionDescriptor createNormalDistributionDescriptor(float mean, float standardDeviation);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "normalDistributionDescriptorWithMean:standardDeviation:minimum:maximum:")
    public static native MPSMatrixRandomDistributionDescriptor createNormalDistributionDescriptor(float mean, float standardDeviation, float minimum, float maximum);
    @Method(selector = "defaultDistributionDescriptor")
    public static native MPSMatrixRandomDistributionDescriptor defaultDistributionDescriptor();
    /*</methods>*/
}
