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
@Marshaler(/*<name>*/AVSemanticSegmentationMatteType/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVSemanticSegmentationMatteType/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/AVSemanticSegmentationMatteType/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static AVSemanticSegmentationMatteType toObject(Class<AVSemanticSegmentationMatteType> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return AVSemanticSegmentationMatteType.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(AVSemanticSegmentationMatteType o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<AVSemanticSegmentationMatteType> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<AVSemanticSegmentationMatteType> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(AVSemanticSegmentationMatteType.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<AVSemanticSegmentationMatteType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (AVSemanticSegmentationMatteType o : l) {
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
    public static final AVSemanticSegmentationMatteType Skin = new AVSemanticSegmentationMatteType("Skin");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final AVSemanticSegmentationMatteType Hair = new AVSemanticSegmentationMatteType("Hair");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final AVSemanticSegmentationMatteType Teeth = new AVSemanticSegmentationMatteType("Teeth");
    /*</constants>*/
    
    private static /*<name>*/AVSemanticSegmentationMatteType/*</name>*/[] values = new /*<name>*/AVSemanticSegmentationMatteType/*</name>*/[] {/*<value_list>*/Skin, Hair, Teeth/*</value_list>*/};
    
    /*<name>*/AVSemanticSegmentationMatteType/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/AVSemanticSegmentationMatteType/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/AVSemanticSegmentationMatteType/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/AVSemanticSegmentationMatteType/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVSemanticSegmentationMatteTypeSkin", optional=true)
        public static native NSString Skin();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVSemanticSegmentationMatteTypeHair", optional=true)
        public static native NSString Hair();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVSemanticSegmentationMatteTypeTeeth", optional=true)
        public static native NSString Teeth();
        /*</values>*/
    }
}
