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
 * @since Available in iOS 12.1 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNNPad/*</name>*/ 
    extends /*<extends>*/MPSCNNKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNNPadPtr extends Ptr<MPSNNPad, MPSNNPadPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNNPad.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSNNPad() {}
    protected MPSNNPad(Handle h, long handle) { super(h, handle); }
    protected MPSNNPad(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:")
    public MPSNNPad(MTLDevice device) { super((SkipInit) null); initObject(init(device)); }
    @Method(selector = "initWithDevice:paddingSizeBefore:paddingSizeAfter:")
    public MPSNNPad(MTLDevice device, @ByVal MPSImageCoordinate paddingSizeBefore, @ByVal MPSImageCoordinate paddingSizeAfter) { super((SkipInit) null); initObject(init(device, paddingSizeBefore, paddingSizeAfter)); }
    @Method(selector = "initWithDevice:paddingSizeBefore:paddingSizeAfter:fillValueArray:")
    public MPSNNPad(MTLDevice device, @ByVal MPSImageCoordinate paddingSizeBefore, @ByVal MPSImageCoordinate paddingSizeAfter, NSData fillValueArray) { super((SkipInit) null); initObject(init(device, paddingSizeBefore, paddingSizeAfter, fillValueArray)); }
    @Method(selector = "initWithCoder:device:")
    public MPSNNPad(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSNNPad(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "paddingSizeBefore")
    public native @ByVal MPSImageCoordinate getPaddingSizeBefore();
    @Property(selector = "setPaddingSizeBefore:")
    public native void setPaddingSizeBefore(@ByVal MPSImageCoordinate v);
    @Property(selector = "paddingSizeAfter")
    public native @ByVal MPSImageCoordinate getPaddingSizeAfter();
    @Property(selector = "setPaddingSizeAfter:")
    public native void setPaddingSizeAfter(@ByVal MPSImageCoordinate v);
    @Property(selector = "fillValue")
    public native float getFillValue();
    @Property(selector = "setFillValue:")
    public native void setFillValue(float v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:")
    protected native @Pointer long init(MTLDevice device);
    @Method(selector = "initWithDevice:paddingSizeBefore:paddingSizeAfter:")
    protected native @Pointer long init(MTLDevice device, @ByVal MPSImageCoordinate paddingSizeBefore, @ByVal MPSImageCoordinate paddingSizeAfter);
    @Method(selector = "initWithDevice:paddingSizeBefore:paddingSizeAfter:fillValueArray:")
    protected native @Pointer long init(MTLDevice device, @ByVal MPSImageCoordinate paddingSizeBefore, @ByVal MPSImageCoordinate paddingSizeAfter, NSData fillValueArray);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    /*</methods>*/
}
