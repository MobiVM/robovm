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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCustomKernelSourceInfo/*</name>*/
    extends /*<extends>*/Struct<MPSCustomKernelSourceInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCustomKernelSourceInfoPtr extends Ptr<MPSCustomKernelSourceInfo, MPSCustomKernelSourceInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCustomKernelSourceInfo() {}
    public MPSCustomKernelSourceInfo(VectorShort2 kernelOrigin, VectorShort2 kernelPhase, VectorShort2 kernelSize, VectorShort2 offset, VectorShort2 stride, VectorShort2 dilationRate, short featureChannelOffset, short featureChannels, short imageArrayOffset, short imageArraySize) {
        this.setKernelOrigin(kernelOrigin);
        this.setKernelPhase(kernelPhase);
        this.setKernelSize(kernelSize);
        this.setOffset(offset);
        this.setStride(stride);
        this.setDilationRate(dilationRate);
        this.setFeatureChannelOffset(featureChannelOffset);
        this.setFeatureChannels(featureChannels);
        this.setImageArrayOffset(imageArrayOffset);
        this.setImageArraySize(imageArraySize);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @ByVal VectorShort2 getKernelOrigin();
    @StructMember(0) public native MPSCustomKernelSourceInfo setKernelOrigin(@ByVal VectorShort2 kernelOrigin);
    @StructMember(1) public native @ByVal VectorShort2 getKernelPhase();
    @StructMember(1) public native MPSCustomKernelSourceInfo setKernelPhase(@ByVal VectorShort2 kernelPhase);
    @StructMember(2) public native @ByVal VectorShort2 getKernelSize();
    @StructMember(2) public native MPSCustomKernelSourceInfo setKernelSize(@ByVal VectorShort2 kernelSize);
    @StructMember(3) public native @ByVal VectorShort2 getOffset();
    @StructMember(3) public native MPSCustomKernelSourceInfo setOffset(@ByVal VectorShort2 offset);
    @StructMember(4) public native @ByVal VectorShort2 getStride();
    @StructMember(4) public native MPSCustomKernelSourceInfo setStride(@ByVal VectorShort2 stride);
    @StructMember(5) public native @ByVal VectorShort2 getDilationRate();
    @StructMember(5) public native MPSCustomKernelSourceInfo setDilationRate(@ByVal VectorShort2 dilationRate);
    @StructMember(6) public native short getFeatureChannelOffset();
    @StructMember(6) public native MPSCustomKernelSourceInfo setFeatureChannelOffset(short featureChannelOffset);
    @StructMember(7) public native short getFeatureChannels();
    @StructMember(7) public native MPSCustomKernelSourceInfo setFeatureChannels(short featureChannels);
    @StructMember(8) public native short getImageArrayOffset();
    @StructMember(8) public native MPSCustomKernelSourceInfo setImageArrayOffset(short imageArrayOffset);
    @StructMember(9) public native short getImageArraySize();
    @StructMember(9) public native MPSCustomKernelSourceInfo setImageArraySize(short imageArraySize);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
