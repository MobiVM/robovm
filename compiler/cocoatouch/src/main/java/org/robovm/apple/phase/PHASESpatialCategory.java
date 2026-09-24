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
package org.robovm.apple.phase;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.modelio.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("PHASE") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/PHASESpatialCategory/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHASESpatialCategory/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/PHASESpatialCategory/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static PHASESpatialCategory toObject(Class<PHASESpatialCategory> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return PHASESpatialCategory.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(PHASESpatialCategory o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<PHASESpatialCategory> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<PHASESpatialCategory> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(PHASESpatialCategory.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<PHASESpatialCategory> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (PHASESpatialCategory o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final PHASESpatialCategory DirectPathTransmission = new PHASESpatialCategory("DirectPathTransmission");
    public static final PHASESpatialCategory EarlyReflections = new PHASESpatialCategory("EarlyReflections");
    public static final PHASESpatialCategory LateReverb = new PHASESpatialCategory("LateReverb");
    /*</constants>*/
    
    private static /*<name>*/PHASESpatialCategory/*</name>*/[] values = new /*<name>*/PHASESpatialCategory/*</name>*/[] {/*<value_list>*/DirectPathTransmission, EarlyReflections, LateReverb/*</value_list>*/};
    
    /*<name>*/PHASESpatialCategory/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/PHASESpatialCategory/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/PHASESpatialCategory/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/PHASESpatialCategory/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("PHASE") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="PHASESpatialCategoryDirectPathTransmission", optional=true)
        public static native NSString DirectPathTransmission();
        @GlobalValue(symbol="PHASESpatialCategoryEarlyReflections", optional=true)
        public static native NSString EarlyReflections();
        @GlobalValue(symbol="PHASESpatialCategoryLateReverb", optional=true)
        public static native NSString LateReverb();
        /*</values>*/
    }
}
