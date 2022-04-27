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
/*<annotations>*/@Library("CoreGraphics")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGColorDataFormat/*</name>*/ 
    extends /*<extends>*/Struct<CGColorDataFormat>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CGColorDataFormatPtr extends Ptr<CGColorDataFormat, CGColorDataFormatPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CGColorDataFormat.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CGColorDataFormat() {}
    public CGColorDataFormat(int version, CFType colorspace_info, CGBitmapInfo bitmap_info, @MachineSizedUInt long bits_per_component, @MachineSizedUInt long bytes_per_row, CGColorRenderingIntent intent, MachineSizedFloatPtr decode) {
        this.setVersion(version);
        this.setColorspace_info(colorspace_info);
        this.setBitmap_info(bitmap_info);
        this.setBits_per_component(bits_per_component);
        this.setBytes_per_row(bytes_per_row);
        this.setIntent(intent);
        this.setDecode(decode);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getVersion();
    @StructMember(0) public native CGColorDataFormat setVersion(int version);
    @StructMember(1) public native CFType getColorspace_info();
    @StructMember(1) public native CGColorDataFormat setColorspace_info(CFType colorspace_info);
    @StructMember(2) public native CGBitmapInfo getBitmap_info();
    @StructMember(2) public native CGColorDataFormat setBitmap_info(CGBitmapInfo bitmap_info);
    @StructMember(3) public native @MachineSizedUInt long getBits_per_component();
    @StructMember(3) public native CGColorDataFormat setBits_per_component(@MachineSizedUInt long bits_per_component);
    @StructMember(4) public native @MachineSizedUInt long getBytes_per_row();
    @StructMember(4) public native CGColorDataFormat setBytes_per_row(@MachineSizedUInt long bytes_per_row);
    @StructMember(5) public native CGColorRenderingIntent getIntent();
    @StructMember(5) public native CGColorDataFormat setIntent(CGColorRenderingIntent intent);
    @StructMember(6) public native MachineSizedFloatPtr getDecode();
    @StructMember(6) public native CGColorDataFormat setDecode(MachineSizedFloatPtr decode);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="CGConvertColorDataWithFormat", optional=true)
    public static native boolean convertColorData(@MachineSizedUInt long width, @MachineSizedUInt long height, VoidPtr dst_data, @ByVal CGColorDataFormat dst_format, VoidPtr src_data, @ByVal CGColorDataFormat src_format, NSDictionary options);
    /*</methods>*/
}
