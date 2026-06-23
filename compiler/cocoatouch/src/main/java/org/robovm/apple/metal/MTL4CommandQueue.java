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
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTL4CommandQueue/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "device")
    MTLDevice getDevice();
    @Property(selector = "label")
    String getLabel();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "commit:count:")
    void commit(MTL4CommandBuffer commandBuffers, @MachineSizedUInt long count);
    @Method(selector = "commit:count:options:")
    void commit(MTL4CommandBuffer commandBuffers, @MachineSizedUInt long count, MTL4CommitOptions options);
    @Method(selector = "signalEvent:value:")
    void signalEvent(MTLEvent event, long value);
    @Method(selector = "waitForEvent:value:")
    void waitForEvent(MTLEvent event, long value);
    @Method(selector = "signalDrawable:")
    void signalDrawable(MTLDrawable drawable);
    @Method(selector = "waitForDrawable:")
    void waitForDrawable(MTLDrawable drawable);
    @Method(selector = "addResidencySet:")
    void addResidencySet(MTLResidencySet residencySet);
    @Method(selector = "addResidencySets:count:")
    void addResidencySets(MTLResidencySet residencySets, @MachineSizedUInt long count);
    @Method(selector = "removeResidencySet:")
    void removeResidencySet(MTLResidencySet residencySet);
    @Method(selector = "removeResidencySets:count:")
    void removeResidencySets(MTLResidencySet residencySets, @MachineSizedUInt long count);
    @Method(selector = "updateTextureMappings:heap:operations:count:")
    void updateTextureMappings(MTLTexture texture, MTLHeap heap, MTL4UpdateSparseTextureMappingOperation operations, @MachineSizedUInt long count);
    @Method(selector = "copyTextureMappingsFromTexture:toTexture:operations:count:")
    void copyTextureMappingsFromTexture(MTLTexture sourceTexture, MTLTexture destinationTexture, MTL4CopySparseTextureMappingOperation operations, @MachineSizedUInt long count);
    @Method(selector = "updateBufferMappings:heap:operations:count:")
    void updateBufferMappings(MTLBuffer buffer, MTLHeap heap, MTL4UpdateSparseBufferMappingOperation operations, @MachineSizedUInt long count);
    @Method(selector = "copyBufferMappingsFromBuffer:toBuffer:operations:count:")
    void copyBufferMappingsFromBuffer(MTLBuffer sourceBuffer, MTLBuffer destinationBuffer, MTL4CopySparseBufferMappingOperation operations, @MachineSizedUInt long count);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
