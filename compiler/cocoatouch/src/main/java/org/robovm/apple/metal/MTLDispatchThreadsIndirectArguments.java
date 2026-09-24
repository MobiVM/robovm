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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLDispatchThreadsIndirectArguments/*</name>*/ 
    extends /*<extends>*/Struct<MTLDispatchThreadsIndirectArguments>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLDispatchThreadsIndirectArgumentsPtr extends Ptr<MTLDispatchThreadsIndirectArguments, MTLDispatchThreadsIndirectArgumentsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLDispatchThreadsIndirectArguments() {}
    public MTLDispatchThreadsIndirectArguments(IntBuffer threadsPerGrid, IntBuffer threadsPerThreadgroup) {
        this.setThreadsPerGrid(threadsPerGrid);
        this.setThreadsPerThreadgroup(threadsPerThreadgroup);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @Array({3}) IntBuffer getThreadsPerGrid();
    @StructMember(0) public native MTLDispatchThreadsIndirectArguments setThreadsPerGrid(@Array({3}) IntBuffer threadsPerGrid);
    @StructMember(1) public native @Array({3}) IntBuffer getThreadsPerThreadgroup();
    @StructMember(1) public native MTLDispatchThreadsIndirectArguments setThreadsPerThreadgroup(@Array({3}) IntBuffer threadsPerThreadgroup);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
