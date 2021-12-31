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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNDArrayMultiaryBase/*</name>*/ 
    extends /*<extends>*/MPSKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNDArrayMultiaryBasePtr extends Ptr<MPSNDArrayMultiaryBase, MPSNDArrayMultiaryBasePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNDArrayMultiaryBase.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSNDArrayMultiaryBase() {}
    protected MPSNDArrayMultiaryBase(Handle h, long handle) { super(h, handle); }
    protected MPSNDArrayMultiaryBase(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:sourceCount:")
    public MPSNDArrayMultiaryBase(MTLDevice device, @MachineSizedUInt long count) { super((SkipInit) null); initObject(init(device, count)); }
    @Method(selector = "initWithCoder:device:")
    public MPSNDArrayMultiaryBase(NSCoder coder, MTLDevice device) { super((SkipInit) null); initObject(init(coder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSNDArrayMultiaryBase(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "destinationArrayAllocator")
    public native MPSNDArrayAllocator getDestinationArrayAllocator();
    @Property(selector = "setDestinationArrayAllocator:")
    public native void setDestinationArrayAllocator(MPSNDArrayAllocator v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use derived filter properties
     */
    @Deprecated
    @Method(selector = "offsetsAtSourceIndex:")
    public native @ByVal MPSNDArrayOffsets offsetsAtSourceIndex(@MachineSizedUInt long sourceIndex);
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use derived filter properties
     */
    @Deprecated
    @Method(selector = "edgeModeAtSourceIndex:")
    public native MPSImageEdgeMode edgeModeAtSourceIndex(@MachineSizedUInt long sourceIndex);
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use derived filter properties
     */
    @Deprecated
    @Method(selector = "kernelSizesForSourceIndex:")
    public native @ByVal MPSNDArraySizes kernelSizesForSourceIndex(@MachineSizedUInt long sourceIndex);
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use derived filter properties
     */
    @Deprecated
    @Method(selector = "stridesForSourceIndex:")
    public native @ByVal MPSNDArrayOffsets stridesForSourceIndex(@MachineSizedUInt long sourceIndex);
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use derived filter properties
     */
    @Deprecated
    @Method(selector = "dilationRatesForSourceIndex:")
    public native @ByVal MPSNDArraySizes dilationRatesForSourceIndex(@MachineSizedUInt long sourceIndex);
    @Method(selector = "initWithDevice:sourceCount:")
    protected native @Pointer long init(MTLDevice device, @MachineSizedUInt long count);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder coder, MTLDevice device);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "copyWithZone:device:")
    public native MPSNDArrayMultiaryBase copy(NSZone zone, MTLDevice device);
    @Method(selector = "resultStateForSourceArrays:sourceStates:destinationArray:")
    public native MPSState getResultState(NSArray<MPSNDArray> sourceArrays, NSArray<MPSState> sourceStates, MPSNDArray destinationArray);
    @Method(selector = "destinationArrayDescriptorForSourceArrays:sourceState:")
    public native MPSNDArrayDescriptor getDestinationArrayDescriptor(NSArray<MPSNDArray> sources, MPSState state);
    /*</methods>*/
}
