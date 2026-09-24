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
/*<annotations>*/@Library("CoreImage") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CIDynamicRangeOption/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIDynamicRangeOption/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CIDynamicRangeOption/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CIDynamicRangeOption toObject(Class<CIDynamicRangeOption> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CIDynamicRangeOption.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CIDynamicRangeOption o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<CIDynamicRangeOption> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CIDynamicRangeOption> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CIDynamicRangeOption.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CIDynamicRangeOption> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (CIDynamicRangeOption o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 19.0 and later.
     */
    public static final CIDynamicRangeOption Standard = new CIDynamicRangeOption("Standard");
    /**
     * @since Available in iOS 19.0 and later.
     */
    public static final CIDynamicRangeOption ConstrainedHigh = new CIDynamicRangeOption("ConstrainedHigh");
    /**
     * @since Available in iOS 19.0 and later.
     */
    public static final CIDynamicRangeOption High = new CIDynamicRangeOption("High");
    /*</constants>*/
    
    private static /*<name>*/CIDynamicRangeOption/*</name>*/[] values = new /*<name>*/CIDynamicRangeOption/*</name>*/[] {/*<value_list>*/Standard, ConstrainedHigh, High/*</value_list>*/};
    
    /*<name>*/CIDynamicRangeOption/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CIDynamicRangeOption/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/CIDynamicRangeOption/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CIDynamicRangeOption/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CoreImage") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 19.0 and later.
         */
        @GlobalValue(symbol="kCIDynamicRangeStandard", optional=true)
        public static native NSString Standard();
        /**
         * @since Available in iOS 19.0 and later.
         */
        @GlobalValue(symbol="kCIDynamicRangeConstrainedHigh", optional=true)
        public static native NSString ConstrainedHigh();
        /**
         * @since Available in iOS 19.0 and later.
         */
        @GlobalValue(symbol="kCIDynamicRangeHigh", optional=true)
        public static native NSString High();
        /*</values>*/
    }
}
