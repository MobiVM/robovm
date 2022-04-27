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
/*<annotations>*/@Library("CoreVideo") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CVImageBufferYCbCrMatrix/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CVImageBufferYCbCrMatrix/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CVImageBufferYCbCrMatrix/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CVImageBufferYCbCrMatrix toObject(Class<CVImageBufferYCbCrMatrix> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CVImageBufferYCbCrMatrix.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CVImageBufferYCbCrMatrix o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CVImageBufferYCbCrMatrix> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CVImageBufferYCbCrMatrix> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CVImageBufferYCbCrMatrix.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CVImageBufferYCbCrMatrix> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CVImageBufferYCbCrMatrix o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final CVImageBufferYCbCrMatrix ITU_R_709_2 = new CVImageBufferYCbCrMatrix("ITU_R_709_2");
    public static final CVImageBufferYCbCrMatrix ITU_R_601_4 = new CVImageBufferYCbCrMatrix("ITU_R_601_4");
    public static final CVImageBufferYCbCrMatrix SMPTE_240M_1995 = new CVImageBufferYCbCrMatrix("SMPTE_240M_1995");
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 14.0. kCVImageBufferYCbCrMatrix_DCI_P3 no longer supported.
     */
    @Deprecated
    public static final CVImageBufferYCbCrMatrix DCI_P3 = new CVImageBufferYCbCrMatrix("DCI_P3");
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 14.0. kCVImageBufferYCbCrMatrix_P3_D65 no longer supported.
     */
    @Deprecated
    public static final CVImageBufferYCbCrMatrix P3_D65 = new CVImageBufferYCbCrMatrix("P3_D65");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CVImageBufferYCbCrMatrix ITU_R_2020 = new CVImageBufferYCbCrMatrix("ITU_R_2020");
    /*</constants>*/
    
    private static /*<name>*/CVImageBufferYCbCrMatrix/*</name>*/[] values = new /*<name>*/CVImageBufferYCbCrMatrix/*</name>*/[] {/*<value_list>*/ITU_R_709_2, ITU_R_601_4, SMPTE_240M_1995, DCI_P3, P3_D65, ITU_R_2020/*</value_list>*/};
    
    /*<name>*/CVImageBufferYCbCrMatrix/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CVImageBufferYCbCrMatrix/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CVImageBufferYCbCrMatrix/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CVImageBufferYCbCrMatrix/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CoreVideo") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kCVImageBufferYCbCrMatrix_ITU_R_709_2", optional=true)
        public static native CFString ITU_R_709_2();
        @GlobalValue(symbol="kCVImageBufferYCbCrMatrix_ITU_R_601_4", optional=true)
        public static native CFString ITU_R_601_4();
        @GlobalValue(symbol="kCVImageBufferYCbCrMatrix_SMPTE_240M_1995", optional=true)
        public static native CFString SMPTE_240M_1995();
        /**
         * @since Available in iOS 9.0 and later.
         * @deprecated Deprecated in iOS 14.0. kCVImageBufferYCbCrMatrix_DCI_P3 no longer supported.
         */
        @Deprecated
        @GlobalValue(symbol="kCVImageBufferYCbCrMatrix_DCI_P3", optional=true)
        public static native CFString DCI_P3();
        /**
         * @since Available in iOS 9.0 and later.
         * @deprecated Deprecated in iOS 14.0. kCVImageBufferYCbCrMatrix_P3_D65 no longer supported.
         */
        @Deprecated
        @GlobalValue(symbol="kCVImageBufferYCbCrMatrix_P3_D65", optional=true)
        public static native CFString P3_D65();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCVImageBufferYCbCrMatrix_ITU_R_2020", optional=true)
        public static native CFString ITU_R_2020();
        /*</values>*/
    }
}
