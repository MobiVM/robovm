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
package org.robovm.apple.coreimage;

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
import org.robovm.apple.corevideo.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.iosurface.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreImage")/*</annotations>*/
@Marshaler(/*<name>*/CIImageRepresentationOptions/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIImageRepresentationOptions/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CIImageRepresentationOptions toObject(Class<CIImageRepresentationOptions> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CIImageRepresentationOptions(o);
        }
        @MarshalsPointer
        public static long toNative(CIImageRepresentationOptions o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CIImageRepresentationOptions> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CIImageRepresentationOptions> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CIImageRepresentationOptions(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CIImageRepresentationOptions> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (CIImageRepresentationOptions i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    CIImageRepresentationOptions(NSDictionary data) {
        super(data);
    }
    public CIImageRepresentationOptions() {}
    /*</constructors>*/

    /*<methods>*/
    public boolean has(NSString key) {
        return data.containsKey(key);
    }
    public NSObject get(NSString key) {
        if (has(key)) {
            return data.get(key);
        }
        return null;
    }
    public CIImageRepresentationOptions set(NSString key, NSObject value) {
        data.put(key, value);
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("CoreImage")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCIImageRepresentationAVDepthData", optional=true)
        public static native NSString AVDepthData();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCIImageRepresentationDepthImage", optional=true)
        public static native NSString DepthImage();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCIImageRepresentationDisparityImage", optional=true)
        public static native NSString DisparityImage();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCIImageRepresentationAVPortraitEffectsMatte", optional=true)
        public static native NSString AVPortraitEffectsMatte();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCIImageRepresentationPortraitEffectsMatteImage", optional=true)
        public static native NSString PortraitEffectsMatteImage();
    }
    /*</keys>*/
}
