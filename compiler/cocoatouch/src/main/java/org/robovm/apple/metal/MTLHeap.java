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
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTLHeap/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "label")
    String getLabel();
    @Property(selector = "setLabel:")
    void setLabel(String v);
    @Property(selector = "device")
    MTLDevice getDevice();
    @Property(selector = "storageMode")
    MTLStorageMode getStorageMode();
    @Property(selector = "cpuCacheMode")
    MTLCPUCacheMode getCpuCacheMode();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "hazardTrackingMode")
    MTLHazardTrackingMode getHazardTrackingMode();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "resourceOptions")
    MTLResourceOptions getResourceOptions();
    @Property(selector = "size")
    @MachineSizedUInt long getSize();
    @Property(selector = "usedSize")
    @MachineSizedUInt long getUsedSize();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "currentAllocatedSize")
    @MachineSizedUInt long getCurrentAllocatedSize();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "type")
    MTLHeapType getType();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "maxAvailableSizeWithAlignment:")
    @MachineSizedUInt long getMaxAvailableSize(@MachineSizedUInt long alignment);
    @Method(selector = "newBufferWithLength:options:")
    MTLBuffer newBuffer(@MachineSizedUInt long length, MTLResourceOptions options);
    @Method(selector = "newTextureWithDescriptor:")
    MTLTexture newTexture(MTLTextureDescriptor descriptor);
    @Method(selector = "setPurgeableState:")
    MTLPurgeableState setPurgeableState(MTLPurgeableState state);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "newBufferWithLength:options:offset:")
    MTLBuffer newBuffer(@MachineSizedUInt long length, MTLResourceOptions options, @MachineSizedUInt long offset);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "newTextureWithDescriptor:offset:")
    MTLTexture newTexture(MTLTextureDescriptor descriptor, @MachineSizedUInt long offset);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "newAccelerationStructureWithSize:")
    MTLAccelerationStructure newAccelerationStructure(@MachineSizedUInt long size);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "newAccelerationStructureWithDescriptor:")
    MTLAccelerationStructure newAccelerationStructure(MTLAccelerationStructureDescriptor descriptor);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "newAccelerationStructureWithSize:offset:")
    MTLAccelerationStructure newAccelerationStructure(@MachineSizedUInt long size, @MachineSizedUInt long offset);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "newAccelerationStructureWithDescriptor:offset:")
    MTLAccelerationStructure newAccelerationStructure(MTLAccelerationStructureDescriptor descriptor, @MachineSizedUInt long offset);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
