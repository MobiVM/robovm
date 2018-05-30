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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSState/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSStatePtr extends Ptr<MPSState, MPSStatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSState.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSState() {}
    protected MPSState(Handle h, long handle) { super(h, handle); }
    protected MPSState(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:bufferSize:")
    public MPSState(MTLDevice device, @MachineSizedUInt long bufferSize) { super((SkipInit) null); initObject(init(device, bufferSize)); }
    @Method(selector = "initWithDevice:textureDescriptor:")
    public MPSState(MTLDevice device, MTLTextureDescriptor descriptor) { super((SkipInit) null); initObject(init(device, descriptor)); }
    @Method(selector = "initWithResource:")
    public MPSState(MTLResource resource) { super((SkipInit) null); initObject(init(resource)); }
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "initWithDevice:resourceList:")
    public MPSState(MTLDevice device, MPSStateResourceList resourceList) { super((SkipInit) null); initObject(init(device, resourceList)); }
    @Method(selector = "initWithResources:")
    public MPSState(NSArray<?> resources) { super((SkipInit) null); initObject(init(resources)); }
    public MPSState(MTLCommandBuffer cmdBuf, @MachineSizedUInt long bufferSize) { super((Handle) null, create(cmdBuf, bufferSize)); retain(getHandle()); }
    public MPSState(MTLCommandBuffer cmdBuf, MTLTextureDescriptor descriptor) { super((Handle) null, create(cmdBuf, descriptor)); retain(getHandle()); }
    /**
     * @since Available in iOS 11.3 and later.
     */
    public MPSState(MTLCommandBuffer commandBuffer, MPSStateResourceList resourceList) { super((Handle) null, create(commandBuffer, resourceList)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "resourceCount")
    public native @MachineSizedUInt long getResourceCount();
    @Property(selector = "readCount")
    public native @MachineSizedUInt long getReadCount();
    @Property(selector = "setReadCount:")
    public native void setReadCount(@MachineSizedUInt long v);
    @Property(selector = "isTemporary")
    public native boolean isTemporary();
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Property(selector = "resource")
    public native MTLResource getResource();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:bufferSize:")
    protected native @Pointer long init(MTLDevice device, @MachineSizedUInt long bufferSize);
    @Method(selector = "initWithDevice:textureDescriptor:")
    protected native @Pointer long init(MTLDevice device, MTLTextureDescriptor descriptor);
    @Method(selector = "initWithResource:")
    protected native @Pointer long init(MTLResource resource);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "initWithDevice:resourceList:")
    protected native @Pointer long init(MTLDevice device, MPSStateResourceList resourceList);
    @Method(selector = "initWithResources:")
    protected native @Pointer long init(NSArray<?> resources);
    @Method(selector = "resourceAtIndex:allocateMemory:")
    public native MTLResource getResource(@MachineSizedUInt long index, boolean allocateMemory);
    @Method(selector = "bufferSizeAtIndex:")
    public native @MachineSizedUInt long bufferSizeAtIndex(@MachineSizedUInt long index);
    @Method(selector = "textureInfoAtIndex:")
    public native @ByVal MPSStateTextureInfo textureInfoAtIndex(@MachineSizedUInt long index);
    @Method(selector = "resourceTypeAtIndex:")
    public native MPSStateResourceType resourceTypeAtIndex(@MachineSizedUInt long index);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "synchronizeOnCommandBuffer:")
    public native void synchronizeOnCommandBuffer(MTLCommandBuffer commandBuffer);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "resourceSize")
    public native @MachineSizedUInt long resourceSize();
    @Method(selector = "destinationImageDescriptorForSourceImages:sourceStates:forKernel:suggestedDescriptor:")
    public native MPSImageDescriptor getDestinationImageDescriptor(NSArray<MPSImage> sourceImages, NSArray<MPSState> sourceStates, MPSKernel kernel, MPSImageDescriptor inDescriptor);
    @Method(selector = "temporaryStateWithCommandBuffer:bufferSize:")
    protected static native @Pointer long create(MTLCommandBuffer cmdBuf, @MachineSizedUInt long bufferSize);
    @Method(selector = "temporaryStateWithCommandBuffer:textureDescriptor:")
    protected static native @Pointer long create(MTLCommandBuffer cmdBuf, MTLTextureDescriptor descriptor);
    @Method(selector = "temporaryStateWithCommandBuffer:")
    public static native MPSState temporaryStateWithCommandBuffer(MTLCommandBuffer cmdBuf);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "temporaryStateWithCommandBuffer:resourceList:")
    protected static native @Pointer long create(MTLCommandBuffer commandBuffer, MPSStateResourceList resourceList);
    /*</methods>*/
}
