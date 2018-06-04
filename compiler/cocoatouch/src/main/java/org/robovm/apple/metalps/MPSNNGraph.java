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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNNGraph/*</name>*/ 
    extends /*<extends>*/MPSKernel/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MPSNNGraphPtr extends Ptr<MPSNNGraph, MPSNNGraphPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNNGraph.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSNNGraph() {}
    protected MPSNNGraph(Handle h, long handle) { super(h, handle); }
    protected MPSNNGraph(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:resultImage:resultImageIsNeeded:")
    public MPSNNGraph(MTLDevice device, MPSNNImageNode resultImage, boolean resultIsNeeded) { super((SkipInit) null); initObject(init(device, resultImage, resultIsNeeded)); }
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 11.3.
     */
    @Deprecated
    @Method(selector = "initWithDevice:resultImage:")
    public MPSNNGraph(MTLDevice device, MPSNNImageNode resultImage) { super((SkipInit) null); initObject(init(device, resultImage)); }
    @Method(selector = "initWithCoder:device:")
    public MPSNNGraph(NSCoder aDecoder, MTLDevice device) { super((SkipInit) null); initObject(init(aDecoder, device)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sourceImageHandles")
    public native NSArray<?> getSourceImageHandles();
    @Property(selector = "sourceStateHandles")
    public native NSArray<?> getSourceStateHandles();
    @Property(selector = "intermediateImageHandles")
    public native NSArray<?> getIntermediateImageHandles();
    @Property(selector = "resultStateHandles")
    public native NSArray<?> getResultStateHandles();
    @Property(selector = "resultHandle")
    public native MPSHandle getResultHandle();
    @Property(selector = "outputStateIsTemporary")
    public native boolean isOutputStateIsTemporary();
    @Property(selector = "setOutputStateIsTemporary:")
    public native void setOutputStateIsTemporary(boolean v);
    @Property(selector = "destinationImageAllocator")
    public native MPSImageAllocator getDestinationImageAllocator();
    @Property(selector = "setDestinationImageAllocator:")
    public native void setDestinationImageAllocator(MPSImageAllocator v);
    @Property(selector = "format")
    public native MPSImageFeatureChannelFormat getFormat();
    @Property(selector = "setFormat:")
    public native void setFormat(MPSImageFeatureChannelFormat v);
    @Property(selector = "resultImageIsNeeded")
    public native boolean isResultImageIsNeeded();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:resultImage:resultImageIsNeeded:")
    protected native @Pointer long init(MTLDevice device, MPSNNImageNode resultImage, boolean resultIsNeeded);
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 11.3.
     */
    @Deprecated
    @Method(selector = "initWithDevice:resultImage:")
    protected native @Pointer long init(MTLDevice device, MPSNNImageNode resultImage);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder aDecoder, MTLDevice device);
    @Method(selector = "encodeToCommandBuffer:sourceImages:sourceStates:intermediateImages:destinationStates:")
    public native MPSImage encode(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceImages, NSArray<MPSState> sourceStates, NSMutableArray<MPSImage> intermediateImages, NSMutableArray<MPSState> destinationStates);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "encodeBatchToCommandBuffer:sourceImages:sourceStates:intermediateImages:destinationStates:")
    public native NSArray<MPSImage> encodeBatch(MTLCommandBuffer commandBuffer, NSArray<NSArray<MPSImage>> sourceImages, NSArray<NSArray<? extends MPSState>> sourceStates, NSMutableArray<NSArray<MPSImage>> intermediateImages, NSMutableArray<NSArray<? extends MPSState>> destinationStates);
    @Method(selector = "encodeToCommandBuffer:sourceImages:")
    public native MPSImage encode(MTLCommandBuffer commandBuffer, NSArray<MPSImage> sourceImages);
    @Method(selector = "encodeBatchToCommandBuffer:sourceImages:sourceStates:")
    public native NSArray<MPSImage> encodeBatch(MTLCommandBuffer commandBuffer, NSArray<NSArray<MPSImage>> sourceImages, NSArray<NSArray<? extends MPSState>> sourceStates);
    @Method(selector = "executeAsyncWithSourceImages:completionHandler:")
    public native MPSImage executeAsync(NSArray<MPSImage> sourceImages, @Block VoidBlock2<MPSImage, NSError> handler);
    /*</methods>*/
}
