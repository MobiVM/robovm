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
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSImageCopyToMatrix/*</name>*/ 
    extends /*<extends>*/MPSKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSImageCopyToMatrixPtr extends Ptr<MPSImageCopyToMatrix, MPSImageCopyToMatrixPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSImageCopyToMatrix.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSImageCopyToMatrix() {}
    protected MPSImageCopyToMatrix(Handle h, long handle) { super(h, handle); }
    protected MPSImageCopyToMatrix(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:dataLayout:")
    public MPSImageCopyToMatrix(MTLDevice device, MPSDataLayout dataLayout) { super((SkipInit) null); initObject(init(device, dataLayout)); }
    @Method(selector = "initWithCoder:device:")
    public MPSImageCopyToMatrix(NSCoder aDecoder, MTLDevice device) { super((SkipInit) null); initObject(init(aDecoder, device)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "destinationMatrixOrigin")
    public native @ByVal MTLOrigin getDestinationMatrixOrigin();
    @Property(selector = "setDestinationMatrixOrigin:")
    public native void setDestinationMatrixOrigin(@ByVal MTLOrigin v);
    @Property(selector = "destinationMatrixBatchIndex")
    public native @MachineSizedUInt long getDestinationMatrixBatchIndex();
    @Property(selector = "setDestinationMatrixBatchIndex:")
    public native void setDestinationMatrixBatchIndex(@MachineSizedUInt long v);
    @Property(selector = "dataLayout")
    public native MPSDataLayout getDataLayout();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:dataLayout:")
    protected native @Pointer long init(MTLDevice device, MPSDataLayout dataLayout);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder aDecoder, MTLDevice device);
    @Method(selector = "encodeToCommandBuffer:sourceImage:destinationMatrix:")
    public native void encode(MTLCommandBuffer commandBuffer, MPSImage sourceImage, MPSMatrix destinationMatrix);
    /*</methods>*/
}
