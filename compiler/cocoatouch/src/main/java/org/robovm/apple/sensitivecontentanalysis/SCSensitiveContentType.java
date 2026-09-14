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
package org.robovm.apple.sensitivecontentanalysis;

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
import org.robovm.apple.imageio.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.videotoolbox.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("SensitiveContentAnalysis") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/SCSensitiveContentType/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCSensitiveContentType/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/SCSensitiveContentType/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static SCSensitiveContentType toObject(Class<SCSensitiveContentType> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return SCSensitiveContentType.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(SCSensitiveContentType o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<SCSensitiveContentType> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<SCSensitiveContentType> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(SCSensitiveContentType.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<SCSensitiveContentType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (SCSensitiveContentType o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 27.0 and later.
     */
    public static final SCSensitiveContentType SexuallyExplicit = new SCSensitiveContentType("SexuallyExplicit");
    /**
     * @since Available in iOS 27.0 and later.
     */
    public static final SCSensitiveContentType GoreOrViolence = new SCSensitiveContentType("GoreOrViolence");
    /*</constants>*/
    
    private static /*<name>*/SCSensitiveContentType/*</name>*/[] values = new /*<name>*/SCSensitiveContentType/*</name>*/[] {/*<value_list>*/SexuallyExplicit, GoreOrViolence/*</value_list>*/};
    
    /*<name>*/SCSensitiveContentType/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/SCSensitiveContentType/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/SCSensitiveContentType/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/SCSensitiveContentType/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("SensitiveContentAnalysis") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 27.0 and later.
         */
        @GlobalValue(symbol="SCSensitiveContentTypeSexuallyExplicit", optional=true)
        public static native NSString SexuallyExplicit();
        /**
         * @since Available in iOS 27.0 and later.
         */
        @GlobalValue(symbol="SCSensitiveContentTypeGoreOrViolence", optional=true)
        public static native NSString GoreOrViolence();
        /*</values>*/
    }
}
