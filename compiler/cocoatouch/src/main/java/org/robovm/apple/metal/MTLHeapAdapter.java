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
package org.robovm.apple.metal;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLHeapAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MTLHeap/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("label")
    public String getLabel() { return null; }
    @NotImplemented("setLabel:")
    public void setLabel(String v) {}
    @NotImplemented("device")
    public MTLDevice getDevice() { return null; }
    @NotImplemented("storageMode")
    public MTLStorageMode getStorageMode() { return null; }
    @NotImplemented("cpuCacheMode")
    public MTLCPUCacheMode getCpuCacheMode() { return null; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("hazardTrackingMode")
    public MTLHazardTrackingMode getHazardTrackingMode() { return null; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("resourceOptions")
    public MTLResourceOptions getResourceOptions() { return null; }
    @NotImplemented("size")
    public @MachineSizedUInt long getSize() { return 0; }
    @NotImplemented("usedSize")
    public @MachineSizedUInt long getUsedSize() { return 0; }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("currentAllocatedSize")
    public @MachineSizedUInt long getCurrentAllocatedSize() { return 0; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("type")
    public MTLHeapType getType() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("maxAvailableSizeWithAlignment:")
    public @MachineSizedUInt long getMaxAvailableSize(@MachineSizedUInt long alignment) { return 0; }
    @NotImplemented("newBufferWithLength:options:")
    public MTLBuffer newBuffer(@MachineSizedUInt long length, MTLResourceOptions options) { return null; }
    @NotImplemented("newTextureWithDescriptor:")
    public MTLTexture newTexture(MTLTextureDescriptor descriptor) { return null; }
    @NotImplemented("setPurgeableState:")
    public MTLPurgeableState setPurgeableState(MTLPurgeableState state) { return null; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("newBufferWithLength:options:offset:")
    public MTLBuffer newBuffer(@MachineSizedUInt long length, MTLResourceOptions options, @MachineSizedUInt long offset) { return null; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("newTextureWithDescriptor:offset:")
    public MTLTexture newTexture(MTLTextureDescriptor descriptor, @MachineSizedUInt long offset) { return null; }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("newAccelerationStructureWithSize:")
    public MTLAccelerationStructure newAccelerationStructure(@MachineSizedUInt long size) { return null; }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("newAccelerationStructureWithDescriptor:")
    public MTLAccelerationStructure newAccelerationStructure(MTLAccelerationStructureDescriptor descriptor) { return null; }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("newAccelerationStructureWithSize:offset:")
    public MTLAccelerationStructure newAccelerationStructure(@MachineSizedUInt long size, @MachineSizedUInt long offset) { return null; }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("newAccelerationStructureWithDescriptor:offset:")
    public MTLAccelerationStructure newAccelerationStructure(MTLAccelerationStructureDescriptor descriptor, @MachineSizedUInt long offset) { return null; }
    /*</methods>*/
}
