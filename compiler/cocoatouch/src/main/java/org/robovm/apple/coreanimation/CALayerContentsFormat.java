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
package org.robovm.apple.coreanimation;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.corevideo.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("QuartzCore") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CALayerContentsFormat/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CALayerContentsFormat/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CALayerContentsFormat/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CALayerContentsFormat toObject(Class<CALayerContentsFormat> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CALayerContentsFormat.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CALayerContentsFormat o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<CALayerContentsFormat> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CALayerContentsFormat> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CALayerContentsFormat.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CALayerContentsFormat> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (CALayerContentsFormat o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CALayerContentsFormat RGBA8Uint = new CALayerContentsFormat("RGBA8Uint");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CALayerContentsFormat RGBA16Float = new CALayerContentsFormat("RGBA16Float");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CALayerContentsFormat Gray8Uint = new CALayerContentsFormat("Gray8Uint");
    /*</constants>*/
    
    private static /*<name>*/CALayerContentsFormat/*</name>*/[] values = new /*<name>*/CALayerContentsFormat/*</name>*/[] {/*<value_list>*/RGBA8Uint, RGBA16Float, Gray8Uint/*</value_list>*/};
    
    /*<name>*/CALayerContentsFormat/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CALayerContentsFormat/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/CALayerContentsFormat/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CALayerContentsFormat/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("QuartzCore") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCAContentsFormatRGBA8Uint", optional=true)
        public static native NSString RGBA8Uint();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCAContentsFormatRGBA16Float", optional=true)
        public static native NSString RGBA16Float();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCAContentsFormatGray8Uint", optional=true)
        public static native NSString Gray8Uint();
        /*</values>*/
    }
}
