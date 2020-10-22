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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLCounterResultStageUtilization/*</name>*/ 
    extends /*<extends>*/Struct<MTLCounterResultStageUtilization>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLCounterResultStageUtilizationPtr extends Ptr<MTLCounterResultStageUtilization, MTLCounterResultStageUtilizationPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLCounterResultStageUtilization() {}
    public MTLCounterResultStageUtilization(long totalCycles, long vertexCycles, long tessellationCycles, long postTessellationVertexCycles, long fragmentCycles, long renderTargetCycles) {
        this.setTotalCycles(totalCycles);
        this.setVertexCycles(vertexCycles);
        this.setTessellationCycles(tessellationCycles);
        this.setPostTessellationVertexCycles(postTessellationVertexCycles);
        this.setFragmentCycles(fragmentCycles);
        this.setRenderTargetCycles(renderTargetCycles);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native long getTotalCycles();
    @StructMember(0) public native MTLCounterResultStageUtilization setTotalCycles(long totalCycles);
    @StructMember(1) public native long getVertexCycles();
    @StructMember(1) public native MTLCounterResultStageUtilization setVertexCycles(long vertexCycles);
    @StructMember(2) public native long getTessellationCycles();
    @StructMember(2) public native MTLCounterResultStageUtilization setTessellationCycles(long tessellationCycles);
    @StructMember(3) public native long getPostTessellationVertexCycles();
    @StructMember(3) public native MTLCounterResultStageUtilization setPostTessellationVertexCycles(long postTessellationVertexCycles);
    @StructMember(4) public native long getFragmentCycles();
    @StructMember(4) public native MTLCounterResultStageUtilization setFragmentCycles(long fragmentCycles);
    @StructMember(5) public native long getRenderTargetCycles();
    @StructMember(5) public native MTLCounterResultStageUtilization setRenderTargetCycles(long renderTargetCycles);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
