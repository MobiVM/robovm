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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNDArrayAffineInt4Dequantize/*</name>*/ 
    extends /*<extends>*/MPSNDArrayMultiaryKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNDArrayAffineInt4DequantizePtr extends Ptr<MPSNDArrayAffineInt4Dequantize, MPSNDArrayAffineInt4DequantizePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNDArrayAffineInt4Dequantize.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSNDArrayAffineInt4Dequantize() {}
    protected MPSNDArrayAffineInt4Dequantize(Handle h, long handle) { super(h, handle); }
    protected MPSNDArrayAffineInt4Dequantize(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:quantizationDescriptor:")
    public MPSNDArrayAffineInt4Dequantize(MTLDevice device, MPSNDArrayAffineQuantizationDescriptor quantizationDescriptor) { super((SkipInit) null); initObject(init(device, quantizationDescriptor)); }
    @Method(selector = "initWithCoder:device:")
    public MPSNDArrayAffineInt4Dequantize(NSCoder coder, MTLDevice device) { super(coder, device); }
    @Method(selector = "initWithCoder:")
    public MPSNDArrayAffineInt4Dequantize(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:quantizationDescriptor:")
    protected native @Pointer long init(MTLDevice device, MPSNDArrayAffineQuantizationDescriptor quantizationDescriptor);
    /*</methods>*/
}
