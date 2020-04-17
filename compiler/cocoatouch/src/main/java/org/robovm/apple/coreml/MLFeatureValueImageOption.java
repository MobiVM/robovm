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
package org.robovm.apple.coreml;

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
import org.robovm.apple.corevideo.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.vision.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreML")/*</annotations>*/
@Marshaler(/*<name>*/MLFeatureValueImageOption/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLFeatureValueImageOption/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static MLFeatureValueImageOption toObject(Class<MLFeatureValueImageOption> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new MLFeatureValueImageOption(o);
        }
        @MarshalsPointer
        public static long toNative(MLFeatureValueImageOption o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<MLFeatureValueImageOption> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<MLFeatureValueImageOption> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new MLFeatureValueImageOption(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<MLFeatureValueImageOption> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (MLFeatureValueImageOption i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    MLFeatureValueImageOption(NSDictionary data) {
        super(data);
    }
    public MLFeatureValueImageOption() {}
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
    public MLFeatureValueImageOption set(NSString key, NSObject value) {
        data.put(key, value);
        return this;
    }
    

    /**
     * @since Available in iOS 13.0 and later.
     */
    public CGRect getCropRect() {
        if (has(Keys.CropRect())) {
            NSValue val = (NSValue) get(Keys.CropRect());
            return val.rectValue();
        }
        return null;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public MLFeatureValueImageOption setCropRect(CGRect cropRect) {
        set(Keys.CropRect(), NSValue.valueOf(cropRect));
        return this;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public VNImageCropAndScaleOption getCropAndScale() {
        if (has(Keys.CropAndScale())) {
            NSNumber val = (NSNumber) get(Keys.CropAndScale());
            return VNImageCropAndScaleOption.valueOf(val.longValue());
        }
        return null;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public MLFeatureValueImageOption setCropAndScale(VNImageCropAndScaleOption cropAndScale) {
        set(Keys.CropAndScale(), NSNumber.valueOf(cropAndScale.value()));
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("CoreML")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MLFeatureValueImageOptionCropRect", optional=true)
        public static native NSString CropRect();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="MLFeatureValueImageOptionCropAndScale", optional=true)
        public static native NSString CropAndScale();
    }
    /*</keys>*/
}
