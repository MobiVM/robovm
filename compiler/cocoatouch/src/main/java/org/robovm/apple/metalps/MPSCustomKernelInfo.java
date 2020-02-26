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

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCustomKernelInfo/*</name>*/ 
    extends /*<extends>*/Struct<MPSCustomKernelInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCustomKernelInfoPtr extends Ptr<MPSCustomKernelInfo, MPSCustomKernelInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCustomKernelInfo() {}
    public MPSCustomKernelInfo(VectorShort4 clipOrigin, VectorShort4 clipSize, short destinationFeatureChannels, short destImageArraySize, short sourceImageCount, short threadgroupSize, short subbatchIndex, short subbatchStride, MPSIntegerDivisionParams idiv) {
        this.setClipOrigin(clipOrigin);
        this.setClipSize(clipSize);
        this.setDestinationFeatureChannels(destinationFeatureChannels);
        this.setDestImageArraySize(destImageArraySize);
        this.setSourceImageCount(sourceImageCount);
        this.setThreadgroupSize(threadgroupSize);
        this.setSubbatchIndex(subbatchIndex);
        this.setSubbatchStride(subbatchStride);
        this.setIdiv(idiv);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @ByVal VectorShort4 getClipOrigin();
    @StructMember(0) public native MPSCustomKernelInfo setClipOrigin(@ByVal VectorShort4 clipOrigin);
    @StructMember(1) public native @ByVal VectorShort4 getClipSize();
    @StructMember(1) public native MPSCustomKernelInfo setClipSize(@ByVal VectorShort4 clipSize);
    @StructMember(2) public native short getDestinationFeatureChannels();
    @StructMember(2) public native MPSCustomKernelInfo setDestinationFeatureChannels(short destinationFeatureChannels);
    @StructMember(3) public native short getDestImageArraySize();
    @StructMember(3) public native MPSCustomKernelInfo setDestImageArraySize(short destImageArraySize);
    @StructMember(4) public native short getSourceImageCount();
    @StructMember(4) public native MPSCustomKernelInfo setSourceImageCount(short sourceImageCount);
    @StructMember(5) public native short getThreadgroupSize();
    @StructMember(5) public native MPSCustomKernelInfo setThreadgroupSize(short threadgroupSize);
    @StructMember(6) public native short getSubbatchIndex();
    @StructMember(6) public native MPSCustomKernelInfo setSubbatchIndex(short subbatchIndex);
    @StructMember(7) public native short getSubbatchStride();
    @StructMember(7) public native MPSCustomKernelInfo setSubbatchStride(short subbatchStride);
    @StructMember(8) public native @ByVal MPSIntegerDivisionParams getIdiv();
    @StructMember(8) public native MPSCustomKernelInfo setIdiv(@ByVal MPSIntegerDivisionParams idiv);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
