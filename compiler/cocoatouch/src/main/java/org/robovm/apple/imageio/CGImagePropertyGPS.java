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
@Marshaler(/*<name>*/CGImagePropertyGPS/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGImagePropertyGPS/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CGImagePropertyGPS/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CGImagePropertyGPS toObject(Class<CGImagePropertyGPS> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CGImagePropertyGPS.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CGImagePropertyGPS o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CGImagePropertyGPS> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CGImagePropertyGPS> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CGImagePropertyGPS.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CGImagePropertyGPS> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CGImagePropertyGPS o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final CGImagePropertyGPS Version = new CGImagePropertyGPS("Version");
    public static final CGImagePropertyGPS LatitudeRef = new CGImagePropertyGPS("LatitudeRef");
    public static final CGImagePropertyGPS Latitude = new CGImagePropertyGPS("Latitude");
    public static final CGImagePropertyGPS LongitudeRef = new CGImagePropertyGPS("LongitudeRef");
    public static final CGImagePropertyGPS Longitude = new CGImagePropertyGPS("Longitude");
    public static final CGImagePropertyGPS AltitudeRef = new CGImagePropertyGPS("AltitudeRef");
    public static final CGImagePropertyGPS Altitude = new CGImagePropertyGPS("Altitude");
    public static final CGImagePropertyGPS TimeStamp = new CGImagePropertyGPS("TimeStamp");
    public static final CGImagePropertyGPS Satellites = new CGImagePropertyGPS("Satellites");
    public static final CGImagePropertyGPS Status = new CGImagePropertyGPS("Status");
    public static final CGImagePropertyGPS MeasureMode = new CGImagePropertyGPS("MeasureMode");
    public static final CGImagePropertyGPS DOP = new CGImagePropertyGPS("DOP");
    public static final CGImagePropertyGPS SpeedRef = new CGImagePropertyGPS("SpeedRef");
    public static final CGImagePropertyGPS Speed = new CGImagePropertyGPS("Speed");
    public static final CGImagePropertyGPS TrackRef = new CGImagePropertyGPS("TrackRef");
    public static final CGImagePropertyGPS Track = new CGImagePropertyGPS("Track");
    public static final CGImagePropertyGPS ImgDirectionRef = new CGImagePropertyGPS("ImgDirectionRef");
    public static final CGImagePropertyGPS ImgDirection = new CGImagePropertyGPS("ImgDirection");
    public static final CGImagePropertyGPS MapDatum = new CGImagePropertyGPS("MapDatum");
    public static final CGImagePropertyGPS DestLatitudeRef = new CGImagePropertyGPS("DestLatitudeRef");
    public static final CGImagePropertyGPS DestLatitude = new CGImagePropertyGPS("DestLatitude");
    public static final CGImagePropertyGPS DestLongitudeRef = new CGImagePropertyGPS("DestLongitudeRef");
    public static final CGImagePropertyGPS DestLongitude = new CGImagePropertyGPS("DestLongitude");
    public static final CGImagePropertyGPS DestBearingRef = new CGImagePropertyGPS("DestBearingRef");
    public static final CGImagePropertyGPS DestBearing = new CGImagePropertyGPS("DestBearing");
    public static final CGImagePropertyGPS DestDistanceRef = new CGImagePropertyGPS("DestDistanceRef");
    public static final CGImagePropertyGPS DestDistance = new CGImagePropertyGPS("DestDistance");
    public static final CGImagePropertyGPS ProcessingMethod = new CGImagePropertyGPS("ProcessingMethod");
    public static final CGImagePropertyGPS AreaInformation = new CGImagePropertyGPS("AreaInformation");
    public static final CGImagePropertyGPS DateStamp = new CGImagePropertyGPS("DateStamp");
    public static final CGImagePropertyGPS Differental = new CGImagePropertyGPS("Differental");
    public static final CGImagePropertyGPS HPositioningError = new CGImagePropertyGPS("HPositioningError");
    /*</constants>*/
    
    private static /*<name>*/CGImagePropertyGPS/*</name>*/[] values = new /*<name>*/CGImagePropertyGPS/*</name>*/[] {/*<value_list>*/Version, LatitudeRef, Latitude, LongitudeRef, Longitude, AltitudeRef, Altitude, TimeStamp, Satellites, Status, MeasureMode, DOP, SpeedRef, Speed, TrackRef, Track, ImgDirectionRef, ImgDirection, MapDatum, DestLatitudeRef, DestLatitude, DestLongitudeRef, DestLongitude, DestBearingRef, DestBearing, DestDistanceRef, DestDistance, ProcessingMethod, AreaInformation, DateStamp, Differental, HPositioningError/*</value_list>*/};
    
    /*<name>*/CGImagePropertyGPS/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CGImagePropertyGPS/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CGImagePropertyGPS/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CGImagePropertyGPS/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("ImageIO") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kCGImagePropertyGPSVersion", optional=true)
        public static native CFString Version();
        @GlobalValue(symbol="kCGImagePropertyGPSLatitudeRef", optional=true)
        public static native CFString LatitudeRef();
        @GlobalValue(symbol="kCGImagePropertyGPSLatitude", optional=true)
        public static native CFString Latitude();
        @GlobalValue(symbol="kCGImagePropertyGPSLongitudeRef", optional=true)
        public static native CFString LongitudeRef();
        @GlobalValue(symbol="kCGImagePropertyGPSLongitude", optional=true)
        public static native CFString Longitude();
        @GlobalValue(symbol="kCGImagePropertyGPSAltitudeRef", optional=true)
        public static native CFString AltitudeRef();
        @GlobalValue(symbol="kCGImagePropertyGPSAltitude", optional=true)
        public static native CFString Altitude();
        @GlobalValue(symbol="kCGImagePropertyGPSTimeStamp", optional=true)
        public static native CFString TimeStamp();
        @GlobalValue(symbol="kCGImagePropertyGPSSatellites", optional=true)
        public static native CFString Satellites();
        @GlobalValue(symbol="kCGImagePropertyGPSStatus", optional=true)
        public static native CFString Status();
        @GlobalValue(symbol="kCGImagePropertyGPSMeasureMode", optional=true)
        public static native CFString MeasureMode();
        @GlobalValue(symbol="kCGImagePropertyGPSDOP", optional=true)
        public static native CFString DOP();
        @GlobalValue(symbol="kCGImagePropertyGPSSpeedRef", optional=true)
        public static native CFString SpeedRef();
        @GlobalValue(symbol="kCGImagePropertyGPSSpeed", optional=true)
        public static native CFString Speed();
        @GlobalValue(symbol="kCGImagePropertyGPSTrackRef", optional=true)
        public static native CFString TrackRef();
        @GlobalValue(symbol="kCGImagePropertyGPSTrack", optional=true)
        public static native CFString Track();
        @GlobalValue(symbol="kCGImagePropertyGPSImgDirectionRef", optional=true)
        public static native CFString ImgDirectionRef();
        @GlobalValue(symbol="kCGImagePropertyGPSImgDirection", optional=true)
        public static native CFString ImgDirection();
        @GlobalValue(symbol="kCGImagePropertyGPSMapDatum", optional=true)
        public static native CFString MapDatum();
        @GlobalValue(symbol="kCGImagePropertyGPSDestLatitudeRef", optional=true)
        public static native CFString DestLatitudeRef();
        @GlobalValue(symbol="kCGImagePropertyGPSDestLatitude", optional=true)
        public static native CFString DestLatitude();
        @GlobalValue(symbol="kCGImagePropertyGPSDestLongitudeRef", optional=true)
        public static native CFString DestLongitudeRef();
        @GlobalValue(symbol="kCGImagePropertyGPSDestLongitude", optional=true)
        public static native CFString DestLongitude();
        @GlobalValue(symbol="kCGImagePropertyGPSDestBearingRef", optional=true)
        public static native CFString DestBearingRef();
        @GlobalValue(symbol="kCGImagePropertyGPSDestBearing", optional=true)
        public static native CFString DestBearing();
        @GlobalValue(symbol="kCGImagePropertyGPSDestDistanceRef", optional=true)
        public static native CFString DestDistanceRef();
        @GlobalValue(symbol="kCGImagePropertyGPSDestDistance", optional=true)
        public static native CFString DestDistance();
        @GlobalValue(symbol="kCGImagePropertyGPSProcessingMethod", optional=true)
        public static native CFString ProcessingMethod();
        @GlobalValue(symbol="kCGImagePropertyGPSAreaInformation", optional=true)
        public static native CFString AreaInformation();
        @GlobalValue(symbol="kCGImagePropertyGPSDateStamp", optional=true)
        public static native CFString DateStamp();
        @GlobalValue(symbol="kCGImagePropertyGPSDifferental", optional=true)
        public static native CFString Differental();
        @GlobalValue(symbol="kCGImagePropertyGPSHPositioningError", optional=true)
        public static native CFString HPositioningError();
        /*</values>*/
    }
}
