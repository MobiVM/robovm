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
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreImage")/*</annotations>*/
@Marshaler(/*<name>*/CIImageAutoAdjustmentOptions/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIImageAutoAdjustmentOptions/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CIImageAutoAdjustmentOptions toObject(Class<CIImageAutoAdjustmentOptions> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CIImageAutoAdjustmentOptions(o);
        }
        @MarshalsPointer
        public static long toNative(CIImageAutoAdjustmentOptions o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CIImageAutoAdjustmentOptions> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CIImageAutoAdjustmentOptions> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CIImageAutoAdjustmentOptions(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CIImageAutoAdjustmentOptions> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (CIImageAutoAdjustmentOptions i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    CIImageAutoAdjustmentOptions(NSDictionary data) {
        super(data);
    }
    public CIImageAutoAdjustmentOptions() {}
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
    public CIImageAutoAdjustmentOptions set(NSString key, NSObject value) {
        data.put(key, value);
        return this;
    }
    

    public boolean appliesEnhancementFilter() {
        if (has(Keys.Enhance())) {
            NSNumber val = (NSNumber) get(Keys.Enhance());
            return val.booleanValue();
        }
        return false;
    }
    public CIImageAutoAdjustmentOptions setAppliesEnhancementFilter(boolean appliesEnhancementFilter) {
        set(Keys.Enhance(), NSNumber.valueOf(appliesEnhancementFilter));
        return this;
    }
    public boolean appliesRedEyeFilter() {
        if (has(Keys.RedEye())) {
            NSNumber val = (NSNumber) get(Keys.RedEye());
            return val.booleanValue();
        }
        return false;
    }
    public CIImageAutoAdjustmentOptions setAppliesRedEyeFilter(boolean appliesRedEyeFilter) {
        set(Keys.RedEye(), NSNumber.valueOf(appliesRedEyeFilter));
        return this;
    }
    public List<CIFeature> getFeatures() {
        if (has(Keys.Features())) {
            NSArray<CIFeature> val = (NSArray<CIFeature>) get(Keys.Features());
            return val;
        }
        return null;
    }
    public CIImageAutoAdjustmentOptions setFeatures(List<CIFeature> features) {
        set(Keys.Features(), new NSArray<>(features));
        return this;
    }
    public boolean appliesCropFilter() {
        if (has(Keys.Crop())) {
            NSNumber val = (NSNumber) get(Keys.Crop());
            return val.booleanValue();
        }
        return false;
    }
    public CIImageAutoAdjustmentOptions setAppliesCropFilter(boolean appliesCropFilter) {
        set(Keys.Crop(), NSNumber.valueOf(appliesCropFilter));
        return this;
    }
    public boolean appliesAutoLevel() {
        if (has(Keys.Level())) {
            NSNumber val = (NSNumber) get(Keys.Level());
            return val.booleanValue();
        }
        return false;
    }
    public CIImageAutoAdjustmentOptions setAppliesAutoLevel(boolean appliesAutoLevel) {
        set(Keys.Level(), NSNumber.valueOf(appliesAutoLevel));
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("CoreImage")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        @GlobalValue(symbol="kCIImageAutoAdjustEnhance", optional=true)
        public static native NSString Enhance();
        @GlobalValue(symbol="kCIImageAutoAdjustRedEye", optional=true)
        public static native NSString RedEye();
        @GlobalValue(symbol="kCIImageAutoAdjustFeatures", optional=true)
        public static native NSString Features();
        @GlobalValue(symbol="kCIImageAutoAdjustCrop", optional=true)
        public static native NSString Crop();
        @GlobalValue(symbol="kCIImageAutoAdjustLevel", optional=true)
        public static native NSString Level();
    }
    /*</keys>*/
}
