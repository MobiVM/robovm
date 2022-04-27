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
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Vision") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/VNVideoProcessingOption/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNVideoProcessingOption/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/VNVideoProcessingOption/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static VNVideoProcessingOption toObject(Class<VNVideoProcessingOption> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return VNVideoProcessingOption.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(VNVideoProcessingOption o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<VNVideoProcessingOption> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<VNVideoProcessingOption> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(VNVideoProcessingOption.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<VNVideoProcessingOption> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (VNVideoProcessingOption o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNVideoProcessorRequestProcessingOptions
     */
    @Deprecated
    public static final VNVideoProcessingOption FrameCadence = new VNVideoProcessingOption("FrameCadence");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNVideoProcessorRequestProcessingOptions
     */
    @Deprecated
    public static final VNVideoProcessingOption TimeInterval = new VNVideoProcessingOption("TimeInterval");
    /*</constants>*/
    
    private static /*<name>*/VNVideoProcessingOption/*</name>*/[] values = new /*<name>*/VNVideoProcessingOption/*</name>*/[] {/*<value_list>*/FrameCadence, TimeInterval/*</value_list>*/};
    
    /*<name>*/VNVideoProcessingOption/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/VNVideoProcessingOption/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/VNVideoProcessingOption/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/VNVideoProcessingOption/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Vision") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNVideoProcessorRequestProcessingOptions
         */
        @Deprecated
        @GlobalValue(symbol="VNVideoProcessingOptionFrameCadence", optional=true)
        public static native NSString FrameCadence();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNVideoProcessorRequestProcessingOptions
         */
        @Deprecated
        @GlobalValue(symbol="VNVideoProcessingOptionTimeInterval", optional=true)
        public static native NSString TimeInterval();
        /*</values>*/
    }
}
