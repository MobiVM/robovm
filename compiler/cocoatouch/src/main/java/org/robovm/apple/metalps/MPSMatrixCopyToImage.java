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
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSMatrixCopyToImage/*</name>*/ 
    extends /*<extends>*/MPSKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSMatrixCopyToImagePtr extends Ptr<MPSMatrixCopyToImage, MPSMatrixCopyToImagePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSMatrixCopyToImage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSMatrixCopyToImage() {}
    protected MPSMatrixCopyToImage(Handle h, long handle) { super(h, handle); }
    protected MPSMatrixCopyToImage(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:dataLayout:")
    public MPSMatrixCopyToImage(MTLDevice device, MPSDataLayout dataLayout) { super((SkipInit) null); initObject(init(device, dataLayout)); }
    @Method(selector = "initWithCoder:device:")
    public MPSMatrixCopyToImage(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithDevice:")
    public MPSMatrixCopyToImage(MTLDevice device) { super(device); }
    @Method(selector = "initWithCoder:")
    public MPSMatrixCopyToImage(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sourceMatrixOrigin")
    public native @ByVal MTLOrigin getSourceMatrixOrigin();
    @Property(selector = "setSourceMatrixOrigin:")
    public native void setSourceMatrixOrigin(@ByVal MTLOrigin v);
    @Property(selector = "sourceMatrixBatchIndex")
    public native @MachineSizedUInt long getSourceMatrixBatchIndex();
    @Property(selector = "setSourceMatrixBatchIndex:")
    public native void setSourceMatrixBatchIndex(@MachineSizedUInt long v);
    @Property(selector = "dataLayout")
    public native MPSDataLayout getDataLayout();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:dataLayout:")
    protected native @Pointer long init(MTLDevice device, MPSDataLayout dataLayout);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    @Method(selector = "encodeToCommandBuffer:sourceMatrix:destinationImage:")
    public native void encodeToCommandBuffer(MTLCommandBuffer commandBuffer, MPSMatrix sourceMatrix, MPSImage destinationImage);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "encodeBatchToCommandBuffer:sourceMatrix:destinationImages:")
    public native void encodeBatchToCommandBuffer(MTLCommandBuffer commandBuffer, MPSMatrix sourceMatrix, NSArray<MPSImage> destinationImages);
    /*</methods>*/
}
