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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGColorBufferFormat/*</name>*/ 
    extends /*<extends>*/Struct<CGColorBufferFormat>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CGColorBufferFormatPtr extends Ptr<CGColorBufferFormat, CGColorBufferFormatPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CGColorBufferFormat() {}
    public CGColorBufferFormat(int version, CGBitmapInfo bitmapInfo, @MachineSizedUInt long bitsPerComponent, @MachineSizedUInt long bitsPerPixel, @MachineSizedUInt long bytesPerRow) {
        this.setVersion(version);
        this.setBitmapInfo(bitmapInfo);
        this.setBitsPerComponent(bitsPerComponent);
        this.setBitsPerPixel(bitsPerPixel);
        this.setBytesPerRow(bytesPerRow);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getVersion();
    @StructMember(0) public native CGColorBufferFormat setVersion(int version);
    @StructMember(1) public native CGBitmapInfo getBitmapInfo();
    @StructMember(1) public native CGColorBufferFormat setBitmapInfo(CGBitmapInfo bitmapInfo);
    @StructMember(2) public native @MachineSizedUInt long getBitsPerComponent();
    @StructMember(2) public native CGColorBufferFormat setBitsPerComponent(@MachineSizedUInt long bitsPerComponent);
    @StructMember(3) public native @MachineSizedUInt long getBitsPerPixel();
    @StructMember(3) public native CGColorBufferFormat setBitsPerPixel(@MachineSizedUInt long bitsPerPixel);
    @StructMember(4) public native @MachineSizedUInt long getBytesPerRow();
    @StructMember(4) public native CGColorBufferFormat setBytesPerRow(@MachineSizedUInt long bytesPerRow);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
