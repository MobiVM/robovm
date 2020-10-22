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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLCounterResultStatistic/*</name>*/ 
    extends /*<extends>*/Struct<MTLCounterResultStatistic>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLCounterResultStatisticPtr extends Ptr<MTLCounterResultStatistic, MTLCounterResultStatisticPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLCounterResultStatistic() {}
    public MTLCounterResultStatistic(long tessellationInputPatches, long vertexInvocations, long postTessellationVertexInvocations, long clipperInvocations, long clipperPrimitivesOut, long fragmentInvocations, long fragmentsPassed, long computeKernelInvocations) {
        this.setTessellationInputPatches(tessellationInputPatches);
        this.setVertexInvocations(vertexInvocations);
        this.setPostTessellationVertexInvocations(postTessellationVertexInvocations);
        this.setClipperInvocations(clipperInvocations);
        this.setClipperPrimitivesOut(clipperPrimitivesOut);
        this.setFragmentInvocations(fragmentInvocations);
        this.setFragmentsPassed(fragmentsPassed);
        this.setComputeKernelInvocations(computeKernelInvocations);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native long getTessellationInputPatches();
    @StructMember(0) public native MTLCounterResultStatistic setTessellationInputPatches(long tessellationInputPatches);
    @StructMember(1) public native long getVertexInvocations();
    @StructMember(1) public native MTLCounterResultStatistic setVertexInvocations(long vertexInvocations);
    @StructMember(2) public native long getPostTessellationVertexInvocations();
    @StructMember(2) public native MTLCounterResultStatistic setPostTessellationVertexInvocations(long postTessellationVertexInvocations);
    @StructMember(3) public native long getClipperInvocations();
    @StructMember(3) public native MTLCounterResultStatistic setClipperInvocations(long clipperInvocations);
    @StructMember(4) public native long getClipperPrimitivesOut();
    @StructMember(4) public native MTLCounterResultStatistic setClipperPrimitivesOut(long clipperPrimitivesOut);
    @StructMember(5) public native long getFragmentInvocations();
    @StructMember(5) public native MTLCounterResultStatistic setFragmentInvocations(long fragmentInvocations);
    @StructMember(6) public native long getFragmentsPassed();
    @StructMember(6) public native MTLCounterResultStatistic setFragmentsPassed(long fragmentsPassed);
    @StructMember(7) public native long getComputeKernelInvocations();
    @StructMember(7) public native MTLCounterResultStatistic setComputeKernelInvocations(long computeKernelInvocations);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
