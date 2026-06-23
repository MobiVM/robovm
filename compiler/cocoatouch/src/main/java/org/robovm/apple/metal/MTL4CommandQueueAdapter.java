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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTL4CommandQueueAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MTL4CommandQueue/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("device")
    public MTLDevice getDevice() { return null; }
    @NotImplemented("label")
    public String getLabel() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("commit:count:")
    public void commit(MTL4CommandBuffer commandBuffers, @MachineSizedUInt long count) {}
    @NotImplemented("commit:count:options:")
    public void commit(MTL4CommandBuffer commandBuffers, @MachineSizedUInt long count, MTL4CommitOptions options) {}
    @NotImplemented("signalEvent:value:")
    public void signalEvent(MTLEvent event, long value) {}
    @NotImplemented("waitForEvent:value:")
    public void waitForEvent(MTLEvent event, long value) {}
    @NotImplemented("signalDrawable:")
    public void signalDrawable(MTLDrawable drawable) {}
    @NotImplemented("waitForDrawable:")
    public void waitForDrawable(MTLDrawable drawable) {}
    @NotImplemented("addResidencySet:")
    public void addResidencySet(MTLResidencySet residencySet) {}
    @NotImplemented("addResidencySets:count:")
    public void addResidencySets(MTLResidencySet residencySets, @MachineSizedUInt long count) {}
    @NotImplemented("removeResidencySet:")
    public void removeResidencySet(MTLResidencySet residencySet) {}
    @NotImplemented("removeResidencySets:count:")
    public void removeResidencySets(MTLResidencySet residencySets, @MachineSizedUInt long count) {}
    @NotImplemented("updateTextureMappings:heap:operations:count:")
    public void updateTextureMappings(MTLTexture texture, MTLHeap heap, MTL4UpdateSparseTextureMappingOperation operations, @MachineSizedUInt long count) {}
    @NotImplemented("copyTextureMappingsFromTexture:toTexture:operations:count:")
    public void copyTextureMappingsFromTexture(MTLTexture sourceTexture, MTLTexture destinationTexture, MTL4CopySparseTextureMappingOperation operations, @MachineSizedUInt long count) {}
    @NotImplemented("updateBufferMappings:heap:operations:count:")
    public void updateBufferMappings(MTLBuffer buffer, MTLHeap heap, MTL4UpdateSparseBufferMappingOperation operations, @MachineSizedUInt long count) {}
    @NotImplemented("copyBufferMappingsFromBuffer:toBuffer:operations:count:")
    public void copyBufferMappingsFromBuffer(MTLBuffer sourceBuffer, MTLBuffer destinationBuffer, MTL4CopySparseBufferMappingOperation operations, @MachineSizedUInt long count) {}
    /*</methods>*/
}
