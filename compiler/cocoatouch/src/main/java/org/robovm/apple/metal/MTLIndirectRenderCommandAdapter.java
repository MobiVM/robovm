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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLIndirectRenderCommandAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MTLIndirectRenderCommand/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("setVertexBuffer:offset:atIndex:")
    public void setVertexBuffer(MTLBuffer buffer, @MachineSizedUInt long offset, @MachineSizedUInt long index) {}
    @NotImplemented("setFragmentBuffer:offset:atIndex:")
    public void setFragmentBuffer(MTLBuffer buffer, @MachineSizedUInt long offset, @MachineSizedUInt long index) {}
    @NotImplemented("drawPatches:patchStart:patchCount:patchIndexBuffer:patchIndexBufferOffset:instanceCount:baseInstance:tessellationFactorBuffer:tessellationFactorBufferOffset:tessellationFactorBufferInstanceStride:")
    public void drawPatches(@MachineSizedUInt long numberOfPatchControlPoints, @MachineSizedUInt long patchStart, @MachineSizedUInt long patchCount, MTLBuffer patchIndexBuffer, @MachineSizedUInt long patchIndexBufferOffset, @MachineSizedUInt long instanceCount, @MachineSizedUInt long baseInstance, MTLBuffer buffer, @MachineSizedUInt long offset, @MachineSizedUInt long instanceStride) {}
    @NotImplemented("drawIndexedPatches:patchStart:patchCount:patchIndexBuffer:patchIndexBufferOffset:controlPointIndexBuffer:controlPointIndexBufferOffset:instanceCount:baseInstance:tessellationFactorBuffer:tessellationFactorBufferOffset:tessellationFactorBufferInstanceStride:")
    public void drawIndexedPatches(@MachineSizedUInt long numberOfPatchControlPoints, @MachineSizedUInt long patchStart, @MachineSizedUInt long patchCount, MTLBuffer patchIndexBuffer, @MachineSizedUInt long patchIndexBufferOffset, MTLBuffer controlPointIndexBuffer, @MachineSizedUInt long controlPointIndexBufferOffset, @MachineSizedUInt long instanceCount, @MachineSizedUInt long baseInstance, MTLBuffer buffer, @MachineSizedUInt long offset, @MachineSizedUInt long instanceStride) {}
    @NotImplemented("drawPrimitives:vertexStart:vertexCount:instanceCount:baseInstance:")
    public void drawPrimitives(MTLPrimitiveType primitiveType, @MachineSizedUInt long vertexStart, @MachineSizedUInt long vertexCount, @MachineSizedUInt long instanceCount, @MachineSizedUInt long baseInstance) {}
    @NotImplemented("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:baseVertex:baseInstance:")
    public void drawIndexedPrimitives(MTLPrimitiveType primitiveType, @MachineSizedUInt long indexCount, MTLIndexType indexType, MTLBuffer indexBuffer, @MachineSizedUInt long indexBufferOffset, @MachineSizedUInt long instanceCount, @MachineSizedSInt long baseVertex, @MachineSizedUInt long baseInstance) {}
    @NotImplemented("reset")
    public void reset() {}
    /*</methods>*/
}
