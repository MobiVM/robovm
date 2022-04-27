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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNNLocalCorrelation/*</name>*/ 
    extends /*<extends>*/MPSNNReduceBinary/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNNLocalCorrelationPtr extends Ptr<MPSNNLocalCorrelation, MPSNNLocalCorrelationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNNLocalCorrelation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSNNLocalCorrelation() {}
    protected MPSNNLocalCorrelation(Handle h, long handle) { super(h, handle); }
    protected MPSNNLocalCorrelation(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:")
    public MPSNNLocalCorrelation(MTLDevice device) { super((SkipInit) null); initObject(init(device)); }
    @Method(selector = "initWithDevice:windowInX:windowInY:strideInX:strideInY:")
    public MPSNNLocalCorrelation(MTLDevice device, @MachineSizedUInt long windowInX, @MachineSizedUInt long windowInY, @MachineSizedUInt long strideInX, @MachineSizedUInt long strideInY) { super((SkipInit) null); initObject(init(device, windowInX, windowInY, strideInX, strideInY)); }
    @Method(selector = "initWithCoder:device:")
    public MPSNNLocalCorrelation(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSNNLocalCorrelation(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "windowInX")
    public native @MachineSizedUInt long getWindowInX();
    @Property(selector = "setWindowInX:")
    public native void setWindowInX(@MachineSizedUInt long v);
    @Property(selector = "windowInY")
    public native @MachineSizedUInt long getWindowInY();
    @Property(selector = "setWindowInY:")
    public native void setWindowInY(@MachineSizedUInt long v);
    @Property(selector = "strideInX")
    public native @MachineSizedUInt long getStrideInX();
    @Property(selector = "setStrideInX:")
    public native void setStrideInX(@MachineSizedUInt long v);
    @Property(selector = "strideInY")
    public native @MachineSizedUInt long getStrideInY();
    @Property(selector = "setStrideInY:")
    public native void setStrideInY(@MachineSizedUInt long v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:")
    protected native @Pointer long init(MTLDevice device);
    @Method(selector = "initWithDevice:windowInX:windowInY:strideInX:strideInY:")
    protected native @Pointer long init(MTLDevice device, @MachineSizedUInt long windowInX, @MachineSizedUInt long windowInY, @MachineSizedUInt long strideInX, @MachineSizedUInt long strideInY);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    /*</methods>*/
}
