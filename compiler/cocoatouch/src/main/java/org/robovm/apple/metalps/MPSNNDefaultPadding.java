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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNNDefaultPadding/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MPSNNPadding/*</implements>*/ {

    /*<ptr>*/public static class MPSNNDefaultPaddingPtr extends Ptr<MPSNNDefaultPadding, MPSNNDefaultPaddingPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNNDefaultPadding.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSNNDefaultPadding() {}
    protected MPSNNDefaultPadding(Handle h, long handle) { super(h, handle); }
    protected MPSNNDefaultPadding(SkipInit skipInit) { super(skipInit); }
    public MPSNNDefaultPadding(MPSNNPaddingMethod method) { super((Handle) null, create(method)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public MPSNNDefaultPadding(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "label")
    public native String label();
    @Method(selector = "paddingWithMethod:")
    protected static native @Pointer long create(MPSNNPaddingMethod method);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "paddingForTensorflowAveragePooling")
    public static native MPSNNDefaultPadding paddingForTensorflowAveragePooling();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "paddingForTensorflowAveragePoolingValidOnly")
    public static native MPSNNDefaultPadding paddingForTensorflowAveragePoolingValidOnly();
    @Method(selector = "paddingMethod")
    public native MPSNNPaddingMethod paddingMethod();
    @Method(selector = "destinationImageDescriptorForSourceImages:sourceStates:forKernel:suggestedDescriptor:")
    public native MPSImageDescriptor getDestinationImageDescriptor(NSArray<MPSImage> sourceImages, NSArray<MPSState> sourceStates, MPSKernel kernel, MPSImageDescriptor inDescriptor);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "inverse")
    public native MPSNNDefaultPadding inverse();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
