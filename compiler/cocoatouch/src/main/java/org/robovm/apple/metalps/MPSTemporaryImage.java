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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSTemporaryImage/*</name>*/ 
    extends /*<extends>*/MPSImage/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSTemporaryImagePtr extends Ptr<MPSTemporaryImage, MPSTemporaryImagePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSTemporaryImage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSTemporaryImage() {}
    protected MPSTemporaryImage(Handle h, long handle) { super(h, handle); }
    protected MPSTemporaryImage(SkipInit skipInit) { super(skipInit); }
    public MPSTemporaryImage(MTLCommandBuffer commandBuffer, MPSImageDescriptor imageDescriptor) { super((Handle) null, create(commandBuffer, imageDescriptor)); retain(getHandle()); }
    public MPSTemporaryImage(MTLCommandBuffer commandBuffer, MTLTextureDescriptor textureDescriptor) { super((Handle) null, create(commandBuffer, textureDescriptor)); retain(getHandle()); }
    /**
     * @since Available in iOS 11.3 and later.
     */
    public MPSTemporaryImage(MTLCommandBuffer commandBuffer, MTLTextureDescriptor textureDescriptor, @MachineSizedUInt long featureChannels) { super((Handle) null, create(commandBuffer, textureDescriptor, featureChannels)); retain(getHandle()); }
    @Method(selector = "initWithParentImage:sliceRange:featureChannels:")
    public MPSTemporaryImage(MPSImage parent, @ByVal NSRange sliceRange, @MachineSizedUInt long featureChannels) { super(parent, sliceRange, featureChannels); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "readCount")
    public native @MachineSizedUInt long getReadCount();
    @Property(selector = "setReadCount:")
    public native void setReadCount(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "defaultAllocator")
    public static native MPSImageAllocator defaultAllocator();
    @Method(selector = "temporaryImageWithCommandBuffer:imageDescriptor:")
    protected static native @Pointer long create(MTLCommandBuffer commandBuffer, MPSImageDescriptor imageDescriptor);
    @Method(selector = "temporaryImageWithCommandBuffer:textureDescriptor:")
    protected static native @Pointer long create(MTLCommandBuffer commandBuffer, MTLTextureDescriptor textureDescriptor);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "temporaryImageWithCommandBuffer:textureDescriptor:featureChannels:")
    protected static native @Pointer long create(MTLCommandBuffer commandBuffer, MTLTextureDescriptor textureDescriptor, @MachineSizedUInt long featureChannels);
    @Method(selector = "prefetchStorageWithCommandBuffer:imageDescriptorList:")
    public static native void createPrefetchStorage(MTLCommandBuffer commandBuffer, NSArray<MPSImageDescriptor> descriptorList);
    /*</methods>*/
}
