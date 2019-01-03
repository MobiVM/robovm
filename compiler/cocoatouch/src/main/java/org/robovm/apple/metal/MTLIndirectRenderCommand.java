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
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTLIndirectRenderCommand/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "setVertexBuffer:offset:atIndex:")
    void setVertexBuffer(MTLBuffer buffer, @MachineSizedUInt long offset, @MachineSizedUInt long index);
    @Method(selector = "setFragmentBuffer:offset:atIndex:")
    void setFragmentBuffer(MTLBuffer buffer, @MachineSizedUInt long offset, @MachineSizedUInt long index);
    @Method(selector = "drawPatches:patchStart:patchCount:patchIndexBuffer:patchIndexBufferOffset:instanceCount:baseInstance:tessellationFactorBuffer:tessellationFactorBufferOffset:tessellationFactorBufferInstanceStride:")
    void drawPatches(@MachineSizedUInt long numberOfPatchControlPoints, @MachineSizedUInt long patchStart, @MachineSizedUInt long patchCount, MTLBuffer patchIndexBuffer, @MachineSizedUInt long patchIndexBufferOffset, @MachineSizedUInt long instanceCount, @MachineSizedUInt long baseInstance, MTLBuffer buffer, @MachineSizedUInt long offset, @MachineSizedUInt long instanceStride);
    @Method(selector = "drawIndexedPatches:patchStart:patchCount:patchIndexBuffer:patchIndexBufferOffset:controlPointIndexBuffer:controlPointIndexBufferOffset:instanceCount:baseInstance:tessellationFactorBuffer:tessellationFactorBufferOffset:tessellationFactorBufferInstanceStride:")
    void drawIndexedPatches(@MachineSizedUInt long numberOfPatchControlPoints, @MachineSizedUInt long patchStart, @MachineSizedUInt long patchCount, MTLBuffer patchIndexBuffer, @MachineSizedUInt long patchIndexBufferOffset, MTLBuffer controlPointIndexBuffer, @MachineSizedUInt long controlPointIndexBufferOffset, @MachineSizedUInt long instanceCount, @MachineSizedUInt long baseInstance, MTLBuffer buffer, @MachineSizedUInt long offset, @MachineSizedUInt long instanceStride);
    @Method(selector = "drawPrimitives:vertexStart:vertexCount:instanceCount:baseInstance:")
    void drawPrimitives(MTLPrimitiveType primitiveType, @MachineSizedUInt long vertexStart, @MachineSizedUInt long vertexCount, @MachineSizedUInt long instanceCount, @MachineSizedUInt long baseInstance);
    @Method(selector = "drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:baseVertex:baseInstance:")
    void drawIndexedPrimitives(MTLPrimitiveType primitiveType, @MachineSizedUInt long indexCount, MTLIndexType indexType, MTLBuffer indexBuffer, @MachineSizedUInt long indexBufferOffset, @MachineSizedUInt long instanceCount, @MachineSizedSInt long baseVertex, @MachineSizedUInt long baseInstance);
    @Method(selector = "reset")
    void reset();
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
