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

/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShadersGraph") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSGraphRandomOpDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSGraphRandomOpDescriptorPtr extends Ptr<MPSGraphRandomOpDescriptor, MPSGraphRandomOpDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSGraphRandomOpDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSGraphRandomOpDescriptor() {}
    protected MPSGraphRandomOpDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSGraphRandomOpDescriptor(SkipInit skipInit) { super(skipInit); }
    public MPSGraphRandomOpDescriptor(MPSGraphRandomDistribution distribution, MPSDataType dataType) { super((Handle) null, create(distribution, dataType)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "distribution")
    public native MPSGraphRandomDistribution getDistribution();
    @Property(selector = "setDistribution:")
    public native void setDistribution(MPSGraphRandomDistribution v);
    @Property(selector = "dataType")
    public native MPSDataType getDataType();
    @Property(selector = "setDataType:")
    public native void setDataType(MPSDataType v);
    @Property(selector = "min")
    public native float getMin();
    @Property(selector = "setMin:")
    public native void setMin(float v);
    @Property(selector = "max")
    public native float getMax();
    @Property(selector = "setMax:")
    public native void setMax(float v);
    @Property(selector = "minInteger")
    public native @MachineSizedSInt long getMinInteger();
    @Property(selector = "setMinInteger:")
    public native void setMinInteger(@MachineSizedSInt long v);
    @Property(selector = "maxInteger")
    public native @MachineSizedSInt long getMaxInteger();
    @Property(selector = "setMaxInteger:")
    public native void setMaxInteger(@MachineSizedSInt long v);
    @Property(selector = "mean")
    public native float getMean();
    @Property(selector = "setMean:")
    public native void setMean(float v);
    @Property(selector = "standardDeviation")
    public native float getStandardDeviation();
    @Property(selector = "setStandardDeviation:")
    public native void setStandardDeviation(float v);
    @Property(selector = "samplingMethod")
    public native MPSGraphRandomNormalSamplingMethod getSamplingMethod();
    @Property(selector = "setSamplingMethod:")
    public native void setSamplingMethod(MPSGraphRandomNormalSamplingMethod v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "descriptorWithDistribution:dataType:")
    protected static native @Pointer long create(MPSGraphRandomDistribution distribution, MPSDataType dataType);
    /*</methods>*/
}
