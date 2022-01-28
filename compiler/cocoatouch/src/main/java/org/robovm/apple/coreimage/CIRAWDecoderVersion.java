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
@Marshaler(/*<name>*/CIRAWDecoderVersion/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIRAWDecoderVersion/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CIRAWDecoderVersion/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CIRAWDecoderVersion toObject(Class<CIRAWDecoderVersion> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CIRAWDecoderVersion.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CIRAWDecoderVersion o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<CIRAWDecoderVersion> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CIRAWDecoderVersion> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CIRAWDecoderVersion.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CIRAWDecoderVersion> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (CIRAWDecoderVersion o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final CIRAWDecoderVersion VersionNone = new CIRAWDecoderVersion("VersionNone");
    public static final CIRAWDecoderVersion Version8 = new CIRAWDecoderVersion("Version8");
    public static final CIRAWDecoderVersion Version8DNG = new CIRAWDecoderVersion("Version8DNG");
    public static final CIRAWDecoderVersion Version7 = new CIRAWDecoderVersion("Version7");
    public static final CIRAWDecoderVersion Version7DNG = new CIRAWDecoderVersion("Version7DNG");
    public static final CIRAWDecoderVersion Version6 = new CIRAWDecoderVersion("Version6");
    public static final CIRAWDecoderVersion Version6DNG = new CIRAWDecoderVersion("Version6DNG");
    /*</constants>*/
    
    private static /*<name>*/CIRAWDecoderVersion/*</name>*/[] values = new /*<name>*/CIRAWDecoderVersion/*</name>*/[] {/*<value_list>*/VersionNone, Version8, Version8DNG, Version7, Version7DNG, Version6, Version6DNG/*</value_list>*/};
    
    /*<name>*/CIRAWDecoderVersion/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CIRAWDecoderVersion/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/CIRAWDecoderVersion/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CIRAWDecoderVersion/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CoreImage") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="CIRAWDecoderVersionNone", optional=true)
        public static native NSString VersionNone();
        @GlobalValue(symbol="CIRAWDecoderVersion8", optional=true)
        public static native NSString Version8();
        @GlobalValue(symbol="CIRAWDecoderVersion8DNG", optional=true)
        public static native NSString Version8DNG();
        @GlobalValue(symbol="CIRAWDecoderVersion7", optional=true)
        public static native NSString Version7();
        @GlobalValue(symbol="CIRAWDecoderVersion7DNG", optional=true)
        public static native NSString Version7DNG();
        @GlobalValue(symbol="CIRAWDecoderVersion6", optional=true)
        public static native NSString Version6();
        @GlobalValue(symbol="CIRAWDecoderVersion6DNG", optional=true)
        public static native NSString Version6DNG();
        /*</values>*/
    }
}
