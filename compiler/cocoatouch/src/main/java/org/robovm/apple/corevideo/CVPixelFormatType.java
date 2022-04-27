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
package org.robovm.apple.corevideo;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.iosurface.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("CoreVideo")/*</annotations>*/
public enum /*<name>*/CVPixelFormatType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    _1Monochrome(1L),
    _2Indexed(2L),
    _4Indexed(4L),
    _8Indexed(8L),
    _1IndexedGray_WhiteIsZero(33L),
    _2IndexedGray_WhiteIsZero(34L),
    _4IndexedGray_WhiteIsZero(36L),
    _8IndexedGray_WhiteIsZero(40L),
    _16BE555(16L),
    _16LE555(1278555445L),
    _16LE5551(892679473L),
    _16BE565(1110783541L),
    _16LE565(1278555701L),
    _24RGB(24L),
    _24BGR(842285639L),
    _32ARGB(32L),
    _32BGRA(1111970369L),
    _32ABGR(1094862674L),
    _32RGBA(1380401729L),
    _64ARGB(1647719521L),
    _64RGBALE(1815491698L),
    _48RGB(1647589490L),
    _32AlphaGray(1647522401L),
    _16Gray(1647392359L),
    _30RGB(1378955371L),
    _422YpCbCr8(846624121L),
    _4444YpCbCrA8(1983131704L),
    _4444YpCbCrA8R(1916022840L),
    _4444AYpCbCr8(2033463352L),
    _4444AYpCbCr16(2033463606L),
    _444YpCbCr8(1983066168L),
    _422YpCbCr16(1983000886L),
    _422YpCbCr10(1983000880L),
    _444YpCbCr10(1983131952L),
    _420YpCbCr8Planar(2033463856L),
    _420YpCbCr8PlanarFullRange(1714696752L),
    _422YpCbCr_4A_8BiPlanar(1630697081L),
    _420YpCbCr8BiPlanarVideoRange(875704438L),
    _420YpCbCr8BiPlanarFullRange(875704422L),
    _422YpCbCr8BiPlanarVideoRange(875704950L),
    _422YpCbCr8BiPlanarFullRange(875704934L),
    _444YpCbCr8BiPlanarVideoRange(875836534L),
    _444YpCbCr8BiPlanarFullRange(875836518L),
    _422YpCbCr8_yuvs(2037741171L),
    _422YpCbCr8FullRange(2037741158L),
    OneComponent8(1278226488L),
    TwoComponent8(843264056L),
    _30RGBLEPackedWideGamut(1999843442L),
    ARGB2101010LEPacked(1815162994L),
    _40ARGBLEWideGamut(1999908961L),
    _40ARGBLEWideGamutPremultiplied(1999908973L),
    OneComponent10(1278226736L),
    OneComponent12(1278226738L),
    OneComponent16(1278226742L),
    TwoComponent16(843264310L),
    OneComponent16Half(1278226536L),
    OneComponent32Float(1278226534L),
    TwoComponent16Half(843264104L),
    TwoComponent32Float(843264102L),
    _64RGBAHalf(1380411457L),
    _128RGBAFloat(1380410945L),
    _14Bayer_GRBG(1735549492L),
    _14Bayer_RGGB(1919379252L),
    _14Bayer_BGGR(1650943796L),
    _14Bayer_GBRG(1734505012L),
    DisparityFloat16(1751411059L),
    DisparityFloat32(1717856627L),
    DepthFloat16(1751410032L),
    DepthFloat32(1717855600L),
    _420YpCbCr10BiPlanarVideoRange(2016686640L),
    _422YpCbCr10BiPlanarVideoRange(2016686642L),
    _444YpCbCr10BiPlanarVideoRange(2016687156L),
    _420YpCbCr10BiPlanarFullRange(2019963440L),
    _422YpCbCr10BiPlanarFullRange(2019963442L),
    _444YpCbCr10BiPlanarFullRange(2019963956L),
    _420YpCbCr8VideoRange_8A_TriPlanar(1982882104L),
    _16VersatileBayer(1651519798L),
    _64RGBA_DownscaledProResRAW(1651521076L),
    _422YpCbCr16BiPlanarVideoRange(1937125938L),
    _444YpCbCr16BiPlanarVideoRange(1937126452L),
    _444YpCbCr16VideoRange_16A_TriPlanar(1932812659L),
    Lossless_32BGRA(641877825L),
    Lossless_420YpCbCr8BiPlanarVideoRange(641234480L),
    Lossless_420YpCbCr8BiPlanarFullRange(641230384L),
    Lossless_420YpCbCr10PackedBiPlanarVideoRange(645428784L),
    Lossless_422YpCbCr10PackedBiPlanarVideoRange(645428786L),
    Lossy_32BGRA(759318337L),
    Lossy_420YpCbCr8BiPlanarVideoRange(758674992L),
    Lossy_420YpCbCr8BiPlanarFullRange(758670896L),
    Lossy_420YpCbCr10PackedBiPlanarVideoRange(762869296L),
    Lossy_422YpCbCr10PackedBiPlanarVideoRange(762869298L);
    /*</values>*/

    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<CVPixelFormatType> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSNumber> o = (NSArray<NSNumber>) NSObject.Marshaler.toObject(cls, handle, flags);
            if (o == null) {
                return null;
            }
            List<CVPixelFormatType> list = new ArrayList<>();
            for (NSNumber n : o) {
                list.add(CVPixelFormatType.valueOf(n.longValue()));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CVPixelFormatType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSMutableArray<NSNumber> array = new NSMutableArray<>();
            for (CVPixelFormatType i : l) {
                array.add(NSNumber.valueOf(i.value()));
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    
    /*<bind>*/static { Bro.bind(CVPixelFormatType.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="CVIsCompressedPixelFormatAvailable", optional=true)
    public static native boolean isCompressedFormatAvailable(CVPixelFormatType pixelFormatType);
    /*</methods>*/

    private final long n;

    private /*<name>*/CVPixelFormatType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/CVPixelFormatType/*</name>*/ valueOf(long n) {
        for (/*<name>*/CVPixelFormatType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/CVPixelFormatType/*</name>*/.class.getName());
    }
}
