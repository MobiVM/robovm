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
package org.robovm.apple.vision;

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
import org.robovm.apple.coreml.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Vision") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/VNBarcodeSymbology/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNBarcodeSymbology/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/VNBarcodeSymbology/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static VNBarcodeSymbology toObject(Class<VNBarcodeSymbology> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return VNBarcodeSymbology.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(VNBarcodeSymbology o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<VNBarcodeSymbology> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<VNBarcodeSymbology> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(VNBarcodeSymbology.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<VNBarcodeSymbology> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (VNBarcodeSymbology o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final VNBarcodeSymbology Aztec = new VNBarcodeSymbology("Aztec");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final VNBarcodeSymbology Code39 = new VNBarcodeSymbology("Code39");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final VNBarcodeSymbology Code39Checksum = new VNBarcodeSymbology("Code39Checksum");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final VNBarcodeSymbology Code39FullASCII = new VNBarcodeSymbology("Code39FullASCII");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final VNBarcodeSymbology Code39FullASCIIChecksum = new VNBarcodeSymbology("Code39FullASCIIChecksum");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final VNBarcodeSymbology Code93 = new VNBarcodeSymbology("Code93");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final VNBarcodeSymbology Code93i = new VNBarcodeSymbology("Code93i");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final VNBarcodeSymbology Code128 = new VNBarcodeSymbology("Code128");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final VNBarcodeSymbology DataMatrix = new VNBarcodeSymbology("DataMatrix");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final VNBarcodeSymbology EAN8 = new VNBarcodeSymbology("EAN8");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final VNBarcodeSymbology EAN13 = new VNBarcodeSymbology("EAN13");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final VNBarcodeSymbology I2of5 = new VNBarcodeSymbology("I2of5");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final VNBarcodeSymbology I2of5Checksum = new VNBarcodeSymbology("I2of5Checksum");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final VNBarcodeSymbology ITF14 = new VNBarcodeSymbology("ITF14");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final VNBarcodeSymbology PDF417 = new VNBarcodeSymbology("PDF417");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final VNBarcodeSymbology QR = new VNBarcodeSymbology("QR");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final VNBarcodeSymbology UPCE = new VNBarcodeSymbology("UPCE");
    /*</constants>*/
    
    private static /*<name>*/VNBarcodeSymbology/*</name>*/[] values = new /*<name>*/VNBarcodeSymbology/*</name>*/[] {/*<value_list>*/Aztec, Code39, Code39Checksum, Code39FullASCII, Code39FullASCIIChecksum, Code93, Code93i, Code128, DataMatrix, EAN8, EAN13, I2of5, I2of5Checksum, ITF14, PDF417, QR, UPCE/*</value_list>*/};
    
    /*<name>*/VNBarcodeSymbology/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/VNBarcodeSymbology/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/VNBarcodeSymbology/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/VNBarcodeSymbology/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Vision") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="VNBarcodeSymbologyAztec", optional=true)
        public static native NSString Aztec();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="VNBarcodeSymbologyCode39", optional=true)
        public static native NSString Code39();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="VNBarcodeSymbologyCode39Checksum", optional=true)
        public static native NSString Code39Checksum();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="VNBarcodeSymbologyCode39FullASCII", optional=true)
        public static native NSString Code39FullASCII();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="VNBarcodeSymbologyCode39FullASCIIChecksum", optional=true)
        public static native NSString Code39FullASCIIChecksum();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="VNBarcodeSymbologyCode93", optional=true)
        public static native NSString Code93();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="VNBarcodeSymbologyCode93i", optional=true)
        public static native NSString Code93i();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="VNBarcodeSymbologyCode128", optional=true)
        public static native NSString Code128();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="VNBarcodeSymbologyDataMatrix", optional=true)
        public static native NSString DataMatrix();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="VNBarcodeSymbologyEAN8", optional=true)
        public static native NSString EAN8();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="VNBarcodeSymbologyEAN13", optional=true)
        public static native NSString EAN13();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="VNBarcodeSymbologyI2of5", optional=true)
        public static native NSString I2of5();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="VNBarcodeSymbologyI2of5Checksum", optional=true)
        public static native NSString I2of5Checksum();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="VNBarcodeSymbologyITF14", optional=true)
        public static native NSString ITF14();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="VNBarcodeSymbologyPDF417", optional=true)
        public static native NSString PDF417();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="VNBarcodeSymbologyQR", optional=true)
        public static native NSString QR();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="VNBarcodeSymbologyUPCE", optional=true)
        public static native NSString UPCE();
        /*</values>*/
    }
}
