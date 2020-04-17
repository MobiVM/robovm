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
package org.robovm.apple.imageio;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("ImageIO") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CGImagePropertyNikon/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGImagePropertyNikon/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CGImagePropertyNikon/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CGImagePropertyNikon toObject(Class<CGImagePropertyNikon> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CGImagePropertyNikon.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CGImagePropertyNikon o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CGImagePropertyNikon> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CGImagePropertyNikon> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CGImagePropertyNikon.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CGImagePropertyNikon> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CGImagePropertyNikon o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final CGImagePropertyNikon ISOSetting = new CGImagePropertyNikon("ISOSetting");
    public static final CGImagePropertyNikon ColorMode = new CGImagePropertyNikon("ColorMode");
    public static final CGImagePropertyNikon Quality = new CGImagePropertyNikon("Quality");
    public static final CGImagePropertyNikon WhiteBalanceMode = new CGImagePropertyNikon("WhiteBalanceMode");
    public static final CGImagePropertyNikon SharpenMode = new CGImagePropertyNikon("SharpenMode");
    public static final CGImagePropertyNikon FocusMode = new CGImagePropertyNikon("FocusMode");
    public static final CGImagePropertyNikon FlashSetting = new CGImagePropertyNikon("FlashSetting");
    public static final CGImagePropertyNikon ISOSelection = new CGImagePropertyNikon("ISOSelection");
    public static final CGImagePropertyNikon FlashExposureComp = new CGImagePropertyNikon("FlashExposureComp");
    public static final CGImagePropertyNikon ImageAdjustment = new CGImagePropertyNikon("ImageAdjustment");
    public static final CGImagePropertyNikon LensAdapter = new CGImagePropertyNikon("LensAdapter");
    public static final CGImagePropertyNikon LensType = new CGImagePropertyNikon("LensType");
    public static final CGImagePropertyNikon LensInfo = new CGImagePropertyNikon("LensInfo");
    public static final CGImagePropertyNikon FocusDistance = new CGImagePropertyNikon("FocusDistance");
    public static final CGImagePropertyNikon DigitalZoom = new CGImagePropertyNikon("DigitalZoom");
    public static final CGImagePropertyNikon ShootingMode = new CGImagePropertyNikon("ShootingMode");
    public static final CGImagePropertyNikon CameraSerialNumber = new CGImagePropertyNikon("CameraSerialNumber");
    public static final CGImagePropertyNikon ShutterCount = new CGImagePropertyNikon("ShutterCount");
    /*</constants>*/
    
    private static /*<name>*/CGImagePropertyNikon/*</name>*/[] values = new /*<name>*/CGImagePropertyNikon/*</name>*/[] {/*<value_list>*/ISOSetting, ColorMode, Quality, WhiteBalanceMode, SharpenMode, FocusMode, FlashSetting, ISOSelection, FlashExposureComp, ImageAdjustment, LensAdapter, LensType, LensInfo, FocusDistance, DigitalZoom, ShootingMode, CameraSerialNumber, ShutterCount/*</value_list>*/};
    
    /*<name>*/CGImagePropertyNikon/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CGImagePropertyNikon/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CGImagePropertyNikon/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CGImagePropertyNikon/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("ImageIO") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kCGImagePropertyMakerNikonISOSetting", optional=true)
        public static native CFString ISOSetting();
        @GlobalValue(symbol="kCGImagePropertyMakerNikonColorMode", optional=true)
        public static native CFString ColorMode();
        @GlobalValue(symbol="kCGImagePropertyMakerNikonQuality", optional=true)
        public static native CFString Quality();
        @GlobalValue(symbol="kCGImagePropertyMakerNikonWhiteBalanceMode", optional=true)
        public static native CFString WhiteBalanceMode();
        @GlobalValue(symbol="kCGImagePropertyMakerNikonSharpenMode", optional=true)
        public static native CFString SharpenMode();
        @GlobalValue(symbol="kCGImagePropertyMakerNikonFocusMode", optional=true)
        public static native CFString FocusMode();
        @GlobalValue(symbol="kCGImagePropertyMakerNikonFlashSetting", optional=true)
        public static native CFString FlashSetting();
        @GlobalValue(symbol="kCGImagePropertyMakerNikonISOSelection", optional=true)
        public static native CFString ISOSelection();
        @GlobalValue(symbol="kCGImagePropertyMakerNikonFlashExposureComp", optional=true)
        public static native CFString FlashExposureComp();
        @GlobalValue(symbol="kCGImagePropertyMakerNikonImageAdjustment", optional=true)
        public static native CFString ImageAdjustment();
        @GlobalValue(symbol="kCGImagePropertyMakerNikonLensAdapter", optional=true)
        public static native CFString LensAdapter();
        @GlobalValue(symbol="kCGImagePropertyMakerNikonLensType", optional=true)
        public static native CFString LensType();
        @GlobalValue(symbol="kCGImagePropertyMakerNikonLensInfo", optional=true)
        public static native CFString LensInfo();
        @GlobalValue(symbol="kCGImagePropertyMakerNikonFocusDistance", optional=true)
        public static native CFString FocusDistance();
        @GlobalValue(symbol="kCGImagePropertyMakerNikonDigitalZoom", optional=true)
        public static native CFString DigitalZoom();
        @GlobalValue(symbol="kCGImagePropertyMakerNikonShootingMode", optional=true)
        public static native CFString ShootingMode();
        @GlobalValue(symbol="kCGImagePropertyMakerNikonCameraSerialNumber", optional=true)
        public static native CFString CameraSerialNumber();
        @GlobalValue(symbol="kCGImagePropertyMakerNikonShutterCount", optional=true)
        public static native CFString ShutterCount();
        /*</values>*/
    }
}
