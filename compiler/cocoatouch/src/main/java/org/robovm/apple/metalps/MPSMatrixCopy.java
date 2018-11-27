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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSMatrixCopy/*</name>*/ 
    extends /*<extends>*/MPSKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSMatrixCopyPtr extends Ptr<MPSMatrixCopy, MPSMatrixCopyPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSMatrixCopy.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSMatrixCopy() {}
    protected MPSMatrixCopy(Handle h, long handle) { super(h, handle); }
    protected MPSMatrixCopy(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDevice:copyRows:copyColumns:sourcesAreTransposed:destinationsAreTransposed:")
    public MPSMatrixCopy(MTLDevice device, @MachineSizedUInt long copyRows, @MachineSizedUInt long copyColumns, boolean sourcesAreTransposed, boolean destinationsAreTransposed) { super((SkipInit) null); initObject(init(device, copyRows, copyColumns, sourcesAreTransposed, destinationsAreTransposed)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    public MPSMatrixCopy(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSMatrixCopy(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "copyRows")
    public native @MachineSizedUInt long getCopyRows();
    @Property(selector = "copyColumns")
    public native @MachineSizedUInt long getCopyColumns();
    @Property(selector = "sourcesAreTransposed")
    public native boolean isSourcesAreTransposed();
    @Property(selector = "destinationsAreTransposed")
    public native boolean isDestinationsAreTransposed();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDevice:copyRows:copyColumns:sourcesAreTransposed:destinationsAreTransposed:")
    protected native @Pointer long init(MTLDevice device, @MachineSizedUInt long copyRows, @MachineSizedUInt long copyColumns, boolean sourcesAreTransposed, boolean destinationsAreTransposed);
    @Method(selector = "encodeToCommandBuffer:copyDescriptor:")
    public native void encode(MTLCommandBuffer commandBuffer, MPSMatrixCopyDescriptor copyDescriptor);
    @Method(selector = "encodeToCommandBuffer:copyDescriptor:rowPermuteIndices:rowPermuteOffset:columnPermuteIndices:columnPermuteOffset:")
    public native void encode(MTLCommandBuffer commandBuffer, MPSMatrixCopyDescriptor copyDescriptor, MPSVector rowPermuteIndices, @MachineSizedUInt long rowPermuteOffset, MPSVector columnPermuteIndices, @MachineSizedUInt long columnPermuteOffset);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    /*</methods>*/
}
