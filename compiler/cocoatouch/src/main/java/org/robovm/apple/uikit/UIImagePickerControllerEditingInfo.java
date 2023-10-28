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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.symbols.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("UIKit")/*</annotations>*/
@Marshaler(/*<name>*/UIImagePickerControllerEditingInfo/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIImagePickerControllerEditingInfo/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static UIImagePickerControllerEditingInfo toObject(Class<UIImagePickerControllerEditingInfo> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new UIImagePickerControllerEditingInfo(o);
        }
        @MarshalsPointer
        public static long toNative(UIImagePickerControllerEditingInfo o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<UIImagePickerControllerEditingInfo> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<UIImagePickerControllerEditingInfo> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new UIImagePickerControllerEditingInfo(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<UIImagePickerControllerEditingInfo> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (UIImagePickerControllerEditingInfo i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    UIImagePickerControllerEditingInfo(NSDictionary data) {
        super(data);
    }
    public UIImagePickerControllerEditingInfo() {}
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
    public UIImagePickerControllerEditingInfo set(NSString key, NSObject value) {
        data.put(key, value);
        return this;
    }
    

    public String getMediaType() {
        if (has(Keys.MediaType())) {
            NSString val = (NSString) get(Keys.MediaType());
            return val.toString();
        }
        return null;
    }
    public UIImagePickerControllerEditingInfo setMediaType(String mediaType) {
        set(Keys.MediaType(), new NSString(mediaType));
        return this;
    }
    public UIImage getOriginalImage() {
        if (has(Keys.OriginalImage())) {
            UIImage val = (UIImage) get(Keys.OriginalImage());
            return val;
        }
        return null;
    }
    public UIImagePickerControllerEditingInfo setOriginalImage(UIImage originalImage) {
        set(Keys.OriginalImage(), originalImage);
        return this;
    }
    public UIImage getEditedImage() {
        if (has(Keys.EditedImage())) {
            UIImage val = (UIImage) get(Keys.EditedImage());
            return val;
        }
        return null;
    }
    public UIImagePickerControllerEditingInfo setEditedImage(UIImage editedImage) {
        set(Keys.EditedImage(), editedImage);
        return this;
    }
    public CGRect getCropRect() {
        if (has(Keys.CropRect())) {
            NSValue val = (NSValue) get(Keys.CropRect());
            return val.rectValue();
        }
        return null;
    }
    public UIImagePickerControllerEditingInfo setCropRect(CGRect cropRect) {
        set(Keys.CropRect(), NSValue.valueOf(cropRect));
        return this;
    }
    public NSURL getMediaURL() {
        if (has(Keys.MediaURL())) {
            NSURL val = (NSURL) get(Keys.MediaURL());
            return val;
        }
        return null;
    }
    public UIImagePickerControllerEditingInfo setMediaURL(NSURL mediaURL) {
        set(Keys.MediaURL(), mediaURL);
        return this;
    }
    /**
     * @deprecated Deprecated in iOS 11.0. Will be removed in a future release, use PHPicker.
     */
    @Deprecated
    public NSURL getReferenceURL() {
        if (has(Keys.ReferenceURL())) {
            NSURL val = (NSURL) get(Keys.ReferenceURL());
            return val;
        }
        return null;
    }
    /**
     * @deprecated Deprecated in iOS 11.0. Will be removed in a future release, use PHPicker.
     */
    @Deprecated
    public UIImagePickerControllerEditingInfo setReferenceURL(NSURL referenceURL) {
        set(Keys.ReferenceURL(), referenceURL);
        return this;
    }
    public Map<String, NSObject> getMediaMetadata() {
        if (has(Keys.MediaMetadata())) {
            NSDictionary val = (NSDictionary) get(Keys.MediaMetadata());
            return val.asStringMap();
        }
        return null;
    }
    public UIImagePickerControllerEditingInfo setMediaMetadata(Map<String, NSObject> mediaMetadata) {
        set(Keys.MediaMetadata(), NSDictionary.fromStringMap(mediaMetadata));
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("UIKit")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        @GlobalValue(symbol="UIImagePickerControllerMediaType", optional=true)
        public static native NSString MediaType();
        @GlobalValue(symbol="UIImagePickerControllerOriginalImage", optional=true)
        public static native NSString OriginalImage();
        @GlobalValue(symbol="UIImagePickerControllerEditedImage", optional=true)
        public static native NSString EditedImage();
        @GlobalValue(symbol="UIImagePickerControllerCropRect", optional=true)
        public static native NSString CropRect();
        @GlobalValue(symbol="UIImagePickerControllerMediaURL", optional=true)
        public static native NSString MediaURL();
        /**
         * @deprecated Deprecated in iOS 11.0. Will be removed in a future release, use PHPicker.
         */
        @Deprecated
        @GlobalValue(symbol="UIImagePickerControllerReferenceURL", optional=true)
        public static native NSString ReferenceURL();
        @GlobalValue(symbol="UIImagePickerControllerMediaMetadata", optional=true)
        public static native NSString MediaMetadata();
        /**
         * @since Available in iOS 9.1 and later.
         */
        @GlobalValue(symbol="UIImagePickerControllerLivePhoto", optional=true)
        public static native NSString LivePhoto();
        /**
         * @since Available in iOS 11.0 and later.
         * @deprecated Will be removed in a future release, use PHPicker.
         */
        @Deprecated
        @GlobalValue(symbol="UIImagePickerControllerPHAsset", optional=true)
        public static native NSString PHAsset();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="UIImagePickerControllerImageURL", optional=true)
        public static native NSString ImageURL();
    }
    /*</keys>*/
}
