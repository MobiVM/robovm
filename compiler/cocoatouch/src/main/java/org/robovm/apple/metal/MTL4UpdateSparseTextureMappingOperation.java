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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTL4UpdateSparseTextureMappingOperation/*</name>*/ 
    extends /*<extends>*/Struct<MTL4UpdateSparseTextureMappingOperation>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTL4UpdateSparseTextureMappingOperationPtr extends Ptr<MTL4UpdateSparseTextureMappingOperation, MTL4UpdateSparseTextureMappingOperationPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTL4UpdateSparseTextureMappingOperation() {}
    public MTL4UpdateSparseTextureMappingOperation(MTLSparseTextureMappingMode mode, MTLRegion textureRegion, @MachineSizedUInt long textureLevel, @MachineSizedUInt long textureSlice, @MachineSizedUInt long heapOffset) {
        this.setMode(mode);
        this.setTextureRegion(textureRegion);
        this.setTextureLevel(textureLevel);
        this.setTextureSlice(textureSlice);
        this.setHeapOffset(heapOffset);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native MTLSparseTextureMappingMode getMode();
    @StructMember(0) public native MTL4UpdateSparseTextureMappingOperation setMode(MTLSparseTextureMappingMode mode);
    @StructMember(1) public native @ByVal MTLRegion getTextureRegion();
    @StructMember(1) public native MTL4UpdateSparseTextureMappingOperation setTextureRegion(@ByVal MTLRegion textureRegion);
    @StructMember(2) public native @MachineSizedUInt long getTextureLevel();
    @StructMember(2) public native MTL4UpdateSparseTextureMappingOperation setTextureLevel(@MachineSizedUInt long textureLevel);
    @StructMember(3) public native @MachineSizedUInt long getTextureSlice();
    @StructMember(3) public native MTL4UpdateSparseTextureMappingOperation setTextureSlice(@MachineSizedUInt long textureSlice);
    @StructMember(4) public native @MachineSizedUInt long getHeapOffset();
    @StructMember(4) public native MTL4UpdateSparseTextureMappingOperation setHeapOffset(@MachineSizedUInt long heapOffset);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
