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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSStateTextureInfo/*</name>*/ 
    extends /*<extends>*/Struct<MPSStateTextureInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSStateTextureInfoPtr extends Ptr<MPSStateTextureInfo, MPSStateTextureInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSStateTextureInfo() {}
    public MPSStateTextureInfo(@MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long depth, @MachineSizedUInt long arrayLength, MTLPixelFormat pixelFormat, MTLTextureType textureType, MTLTextureUsage usage, MachineSizedUIntPtr _reserved) {
        this.setWidth(width);
        this.setHeight(height);
        this.setDepth(depth);
        this.setArrayLength(arrayLength);
        this.setPixelFormat(pixelFormat);
        this.setTextureType(textureType);
        this.setUsage(usage);
        this.set_reserved(_reserved);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @MachineSizedUInt long getWidth();
    @StructMember(0) public native MPSStateTextureInfo setWidth(@MachineSizedUInt long width);
    @StructMember(1) public native @MachineSizedUInt long getHeight();
    @StructMember(1) public native MPSStateTextureInfo setHeight(@MachineSizedUInt long height);
    @StructMember(2) public native @MachineSizedUInt long getDepth();
    @StructMember(2) public native MPSStateTextureInfo setDepth(@MachineSizedUInt long depth);
    @StructMember(3) public native @MachineSizedUInt long getArrayLength();
    @StructMember(3) public native MPSStateTextureInfo setArrayLength(@MachineSizedUInt long arrayLength);
    @StructMember(4) public native MTLPixelFormat getPixelFormat();
    @StructMember(4) public native MPSStateTextureInfo setPixelFormat(MTLPixelFormat pixelFormat);
    @StructMember(5) public native MTLTextureType getTextureType();
    @StructMember(5) public native MPSStateTextureInfo setTextureType(MTLTextureType textureType);
    @StructMember(6) public native MTLTextureUsage getUsage();
    @StructMember(6) public native MPSStateTextureInfo setUsage(MTLTextureUsage usage);
    @StructMember(7) public native @Array({4}) MachineSizedUIntPtr get_reserved();
    @StructMember(7) public native MPSStateTextureInfo set_reserved(@Array({4}) MachineSizedUIntPtr _reserved);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
