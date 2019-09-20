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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLMapIndirectArguments/*</name>*/ 
    extends /*<extends>*/Struct<MTLMapIndirectArguments>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLMapIndirectArgumentsPtr extends Ptr<MTLMapIndirectArguments, MTLMapIndirectArgumentsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLMapIndirectArguments() {}
    public MTLMapIndirectArguments(int regionOriginX, int regionOriginY, int regionOriginZ, int regionSizeWidth, int regionSizeHeight, int regionSizeDepth, int mipMapLevel, int sliceId) {
        this.setRegionOriginX(regionOriginX);
        this.setRegionOriginY(regionOriginY);
        this.setRegionOriginZ(regionOriginZ);
        this.setRegionSizeWidth(regionSizeWidth);
        this.setRegionSizeHeight(regionSizeHeight);
        this.setRegionSizeDepth(regionSizeDepth);
        this.setMipMapLevel(mipMapLevel);
        this.setSliceId(sliceId);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getRegionOriginX();
    @StructMember(0) public native MTLMapIndirectArguments setRegionOriginX(int regionOriginX);
    @StructMember(1) public native int getRegionOriginY();
    @StructMember(1) public native MTLMapIndirectArguments setRegionOriginY(int regionOriginY);
    @StructMember(2) public native int getRegionOriginZ();
    @StructMember(2) public native MTLMapIndirectArguments setRegionOriginZ(int regionOriginZ);
    @StructMember(3) public native int getRegionSizeWidth();
    @StructMember(3) public native MTLMapIndirectArguments setRegionSizeWidth(int regionSizeWidth);
    @StructMember(4) public native int getRegionSizeHeight();
    @StructMember(4) public native MTLMapIndirectArguments setRegionSizeHeight(int regionSizeHeight);
    @StructMember(5) public native int getRegionSizeDepth();
    @StructMember(5) public native MTLMapIndirectArguments setRegionSizeDepth(int regionSizeDepth);
    @StructMember(6) public native int getMipMapLevel();
    @StructMember(6) public native MTLMapIndirectArguments setMipMapLevel(int mipMapLevel);
    @StructMember(7) public native int getSliceId();
    @StructMember(7) public native MTLMapIndirectArguments setSliceId(int sliceId);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
