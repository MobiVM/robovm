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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLDrawPatchIndirectArguments/*</name>*/ 
    extends /*<extends>*/Struct<MTLDrawPatchIndirectArguments>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLDrawPatchIndirectArgumentsPtr extends Ptr<MTLDrawPatchIndirectArguments, MTLDrawPatchIndirectArgumentsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLDrawPatchIndirectArguments() {}
    public MTLDrawPatchIndirectArguments(int patchCount, int instanceCount, int patchStart, int baseInstance) {
        this.setPatchCount(patchCount);
        this.setInstanceCount(instanceCount);
        this.setPatchStart(patchStart);
        this.setBaseInstance(baseInstance);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getPatchCount();
    @StructMember(0) public native MTLDrawPatchIndirectArguments setPatchCount(int patchCount);
    @StructMember(1) public native int getInstanceCount();
    @StructMember(1) public native MTLDrawPatchIndirectArguments setInstanceCount(int instanceCount);
    @StructMember(2) public native int getPatchStart();
    @StructMember(2) public native MTLDrawPatchIndirectArguments setPatchStart(int patchStart);
    @StructMember(3) public native int getBaseInstance();
    @StructMember(3) public native MTLDrawPatchIndirectArguments setBaseInstance(int baseInstance);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
