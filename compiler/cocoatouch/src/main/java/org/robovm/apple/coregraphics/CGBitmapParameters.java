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
package org.robovm.apple.coregraphics;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGBitmapParameters/*</name>*/ 
    extends /*<extends>*/Struct<CGBitmapParameters>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CGBitmapParametersPtr extends Ptr<CGBitmapParameters, CGBitmapParametersPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CGBitmapParameters() {}
    public CGBitmapParameters(@MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long bytesPerPixel, @MachineSizedUInt long alignedBytesPerRow, CGComponent component, CGBitmapLayout layout, CGImagePixelFormatInfo format, CGColorSpace colorSpace, boolean hasPremultipliedAlpha, CFByteOrder byteOrder, float edrTargetHeadroom) {
        this.setWidth(width);
        this.setHeight(height);
        this.setBytesPerPixel(bytesPerPixel);
        this.setAlignedBytesPerRow(alignedBytesPerRow);
        this.setComponent(component);
        this.setLayout(layout);
        this.setFormat(format);
        this.setColorSpace(colorSpace);
        this.setHasPremultipliedAlpha(hasPremultipliedAlpha);
        this.setByteOrder(byteOrder);
        this.setEdrTargetHeadroom(edrTargetHeadroom);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @MachineSizedUInt long getWidth();
    @StructMember(0) public native CGBitmapParameters setWidth(@MachineSizedUInt long width);
    @StructMember(1) public native @MachineSizedUInt long getHeight();
    @StructMember(1) public native CGBitmapParameters setHeight(@MachineSizedUInt long height);
    @StructMember(2) public native @MachineSizedUInt long getBytesPerPixel();
    @StructMember(2) public native CGBitmapParameters setBytesPerPixel(@MachineSizedUInt long bytesPerPixel);
    @StructMember(3) public native @MachineSizedUInt long getAlignedBytesPerRow();
    @StructMember(3) public native CGBitmapParameters setAlignedBytesPerRow(@MachineSizedUInt long alignedBytesPerRow);
    @StructMember(4) public native CGComponent getComponent();
    @StructMember(4) public native CGBitmapParameters setComponent(CGComponent component);
    @StructMember(5) public native CGBitmapLayout getLayout();
    @StructMember(5) public native CGBitmapParameters setLayout(CGBitmapLayout layout);
    @StructMember(6) public native CGImagePixelFormatInfo getFormat();
    @StructMember(6) public native CGBitmapParameters setFormat(CGImagePixelFormatInfo format);
    @StructMember(7) public native CGColorSpace getColorSpace();
    @StructMember(7) public native CGBitmapParameters setColorSpace(CGColorSpace colorSpace);
    @StructMember(8) public native boolean isHasPremultipliedAlpha();
    @StructMember(8) public native CGBitmapParameters setHasPremultipliedAlpha(boolean hasPremultipliedAlpha);
    @StructMember(9) public native CFByteOrder getByteOrder();
    @StructMember(9) public native CGBitmapParameters setByteOrder(CFByteOrder byteOrder);
    @StructMember(10) public native float getEdrTargetHeadroom();
    @StructMember(10) public native CGBitmapParameters setEdrTargetHeadroom(float edrTargetHeadroom);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
