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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/AVMetadataObjectType/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMetadataObjectType/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/AVMetadataObjectType/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static AVMetadataObjectType toObject(Class<AVMetadataObjectType> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return AVMetadataObjectType.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(AVMetadataObjectType o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<AVMetadataObjectType> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<AVMetadataObjectType> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(AVMetadataObjectType.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<AVMetadataObjectType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (AVMetadataObjectType o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final AVMetadataObjectType HumanBody = new AVMetadataObjectType("HumanBody");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final AVMetadataObjectType CatBody = new AVMetadataObjectType("CatBody");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final AVMetadataObjectType DogBody = new AVMetadataObjectType("DogBody");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final AVMetadataObjectType SalientObject = new AVMetadataObjectType("SalientObject");
    public static final AVMetadataObjectType Face = new AVMetadataObjectType("Face");
    public static final AVMetadataObjectType UPCECode = new AVMetadataObjectType("UPCECode");
    public static final AVMetadataObjectType Code39Code = new AVMetadataObjectType("Code39Code");
    public static final AVMetadataObjectType Code39Mod43Code = new AVMetadataObjectType("Code39Mod43Code");
    public static final AVMetadataObjectType EAN13Code = new AVMetadataObjectType("EAN13Code");
    public static final AVMetadataObjectType EAN8Code = new AVMetadataObjectType("EAN8Code");
    public static final AVMetadataObjectType Code93Code = new AVMetadataObjectType("Code93Code");
    public static final AVMetadataObjectType Code128Code = new AVMetadataObjectType("Code128Code");
    public static final AVMetadataObjectType PDF417Code = new AVMetadataObjectType("PDF417Code");
    public static final AVMetadataObjectType QRCode = new AVMetadataObjectType("QRCode");
    public static final AVMetadataObjectType AztecCode = new AVMetadataObjectType("AztecCode");
    public static final AVMetadataObjectType Interleaved2of5Code = new AVMetadataObjectType("Interleaved2of5Code");
    public static final AVMetadataObjectType ITF14Code = new AVMetadataObjectType("ITF14Code");
    public static final AVMetadataObjectType DataMatrixCode = new AVMetadataObjectType("DataMatrixCode");
    /*</constants>*/
    
    private static /*<name>*/AVMetadataObjectType/*</name>*/[] values = new /*<name>*/AVMetadataObjectType/*</name>*/[] {/*<value_list>*/HumanBody, CatBody, DogBody, SalientObject, Face, UPCECode, Code39Code, Code39Mod43Code, EAN13Code, EAN8Code, Code93Code, Code128Code, PDF417Code, QRCode, AztecCode, Interleaved2of5Code, ITF14Code, DataMatrixCode/*</value_list>*/};

    /*<name>*/AVMetadataObjectType/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    /*<name>*/AVMetadataObjectType/*</name>*/ (/*<type>*/NSString/*</type>*/ value) {
        super(value);
    }

    public static /*<name>*/AVMetadataObjectType/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        synchronized (/*<name>*/AVMetadataObjectType/*</name>*/.class) {
            for (/*<name>*/AVMetadataObjectType/*</name>*/ v : values) {
                if (v.isAvailable() && v.value().equals(value)) {
                    return v;
                }
            }
            // entry was not known compilation time. probably new entry available on new OS version, extending instead
            // of crashing with exception
            /*<name>*/AVMetadataObjectType/*</name>*/ v = new /*<name>*/AVMetadataObjectType/*</name>*/(value);
            values = Arrays.copyOf(values, values.length + 1);
            values[values.length - 1] = v;
            return v;
        }
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVMetadataObjectTypeHumanBody", optional=true)
        public static native NSString HumanBody();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVMetadataObjectTypeCatBody", optional=true)
        public static native NSString CatBody();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVMetadataObjectTypeDogBody", optional=true)
        public static native NSString DogBody();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVMetadataObjectTypeSalientObject", optional=true)
        public static native NSString SalientObject();
        @GlobalValue(symbol="AVMetadataObjectTypeFace", optional=true)
        public static native NSString Face();
        @GlobalValue(symbol="AVMetadataObjectTypeUPCECode", optional=true)
        public static native NSString UPCECode();
        @GlobalValue(symbol="AVMetadataObjectTypeCode39Code", optional=true)
        public static native NSString Code39Code();
        @GlobalValue(symbol="AVMetadataObjectTypeCode39Mod43Code", optional=true)
        public static native NSString Code39Mod43Code();
        @GlobalValue(symbol="AVMetadataObjectTypeEAN13Code", optional=true)
        public static native NSString EAN13Code();
        @GlobalValue(symbol="AVMetadataObjectTypeEAN8Code", optional=true)
        public static native NSString EAN8Code();
        @GlobalValue(symbol="AVMetadataObjectTypeCode93Code", optional=true)
        public static native NSString Code93Code();
        @GlobalValue(symbol="AVMetadataObjectTypeCode128Code", optional=true)
        public static native NSString Code128Code();
        @GlobalValue(symbol="AVMetadataObjectTypePDF417Code", optional=true)
        public static native NSString PDF417Code();
        @GlobalValue(symbol="AVMetadataObjectTypeQRCode", optional=true)
        public static native NSString QRCode();
        @GlobalValue(symbol="AVMetadataObjectTypeAztecCode", optional=true)
        public static native NSString AztecCode();
        @GlobalValue(symbol="AVMetadataObjectTypeInterleaved2of5Code", optional=true)
        public static native NSString Interleaved2of5Code();
        @GlobalValue(symbol="AVMetadataObjectTypeITF14Code", optional=true)
        public static native NSString ITF14Code();
        @GlobalValue(symbol="AVMetadataObjectTypeDataMatrixCode", optional=true)
        public static native NSString DataMatrixCode();
        /*</values>*/
    }
}
