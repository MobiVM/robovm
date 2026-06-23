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
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNDArrayAffineQuantizationDescriptor/*</name>*/ 
    extends /*<extends>*/MPSNDArrayQuantizationDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNDArrayAffineQuantizationDescriptorPtr extends Ptr<MPSNDArrayAffineQuantizationDescriptor, MPSNDArrayAffineQuantizationDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNDArrayAffineQuantizationDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSNDArrayAffineQuantizationDescriptor() {}
    protected MPSNDArrayAffineQuantizationDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSNDArrayAffineQuantizationDescriptor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDataType:hasZeroPoint:hasMinValue:")
    public MPSNDArrayAffineQuantizationDescriptor(MPSDataType quantizationDataType, boolean hasZeroPoint, boolean hasMinValue) { super((SkipInit) null); initObject(init(quantizationDataType, hasZeroPoint, hasMinValue)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "hasZeroPoint")
    public native boolean hasZeroPoint();
    @Property(selector = "setHasZeroPoint:")
    public native void setHasZeroPoint(boolean v);
    @Property(selector = "hasMinValue")
    public native boolean hasMinValue();
    @Property(selector = "setHasMinValue:")
    public native void setHasMinValue(boolean v);
    @Property(selector = "implicitZeroPoint")
    public native boolean isImplicitZeroPoint();
    @Property(selector = "setImplicitZeroPoint:")
    public native void setImplicitZeroPoint(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDataType:hasZeroPoint:hasMinValue:")
    protected native @Pointer long init(MPSDataType quantizationDataType, boolean hasZeroPoint, boolean hasMinValue);
    /*</methods>*/
}
