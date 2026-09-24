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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTL4CopySparseTextureMappingOperation/*</name>*/ 
    extends /*<extends>*/Struct<MTL4CopySparseTextureMappingOperation>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTL4CopySparseTextureMappingOperationPtr extends Ptr<MTL4CopySparseTextureMappingOperation, MTL4CopySparseTextureMappingOperationPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTL4CopySparseTextureMappingOperation() {}
    public MTL4CopySparseTextureMappingOperation(MTLRegion sourceRegion, @MachineSizedUInt long sourceLevel, @MachineSizedUInt long sourceSlice, MTLOrigin destinationOrigin, @MachineSizedUInt long destinationLevel, @MachineSizedUInt long destinationSlice) {
        this.setSourceRegion(sourceRegion);
        this.setSourceLevel(sourceLevel);
        this.setSourceSlice(sourceSlice);
        this.setDestinationOrigin(destinationOrigin);
        this.setDestinationLevel(destinationLevel);
        this.setDestinationSlice(destinationSlice);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @ByVal MTLRegion getSourceRegion();
    @StructMember(0) public native MTL4CopySparseTextureMappingOperation setSourceRegion(@ByVal MTLRegion sourceRegion);
    @StructMember(1) public native @MachineSizedUInt long getSourceLevel();
    @StructMember(1) public native MTL4CopySparseTextureMappingOperation setSourceLevel(@MachineSizedUInt long sourceLevel);
    @StructMember(2) public native @MachineSizedUInt long getSourceSlice();
    @StructMember(2) public native MTL4CopySparseTextureMappingOperation setSourceSlice(@MachineSizedUInt long sourceSlice);
    @StructMember(3) public native @ByVal MTLOrigin getDestinationOrigin();
    @StructMember(3) public native MTL4CopySparseTextureMappingOperation setDestinationOrigin(@ByVal MTLOrigin destinationOrigin);
    @StructMember(4) public native @MachineSizedUInt long getDestinationLevel();
    @StructMember(4) public native MTL4CopySparseTextureMappingOperation setDestinationLevel(@MachineSizedUInt long destinationLevel);
    @StructMember(5) public native @MachineSizedUInt long getDestinationSlice();
    @StructMember(5) public native MTL4CopySparseTextureMappingOperation setDestinationSlice(@MachineSizedUInt long destinationSlice);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
