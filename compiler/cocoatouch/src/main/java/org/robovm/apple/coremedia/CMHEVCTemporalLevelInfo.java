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
package org.robovm.apple.coremedia;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreMedia")/*</annotations>*/
@Marshaler(/*<name>*/CMHEVCTemporalLevelInfo/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CMHEVCTemporalLevelInfo/*</name>*/ 
    extends /*<extends>*/CFDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CMHEVCTemporalLevelInfo toObject(Class<CMHEVCTemporalLevelInfo> cls, long handle, long flags) {
            CFDictionary o = (CFDictionary) CFType.Marshaler.toObject(CFDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CMHEVCTemporalLevelInfo(o);
        }
        @MarshalsPointer
        public static long toNative(CMHEVCTemporalLevelInfo o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CMHEVCTemporalLevelInfo> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CMHEVCTemporalLevelInfo> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CMHEVCTemporalLevelInfo(o.get(i, CFDictionary.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CMHEVCTemporalLevelInfo> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CMHEVCTemporalLevelInfo i : l) {
                array.add(i.getDictionary());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    CMHEVCTemporalLevelInfo(CFDictionary data) {
        super(data);
    }
    public CMHEVCTemporalLevelInfo() {}
    /*</constructors>*/

    /*<methods>*/
    public boolean has(CFString key) {
        return data.containsKey(key);
    }
    public <T extends NativeObject> T get(CFString key, Class<T> type) {
        if (has(key)) {
            return data.get(key, type);
        }
        return null;
    }
    public CMHEVCTemporalLevelInfo set(CFString key, NativeObject value) {
        data.put(key, value);
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("CoreMedia")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCMHEVCTemporalLevelInfoKey_TemporalLevel", optional=true)
        public static native CFString TemporalLevel();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCMHEVCTemporalLevelInfoKey_ProfileSpace", optional=true)
        public static native CFString ProfileSpace();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCMHEVCTemporalLevelInfoKey_TierFlag", optional=true)
        public static native CFString TierFlag();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCMHEVCTemporalLevelInfoKey_ProfileIndex", optional=true)
        public static native CFString ProfileIndex();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCMHEVCTemporalLevelInfoKey_ProfileCompatibilityFlags", optional=true)
        public static native CFString ProfileCompatibilityFlags();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCMHEVCTemporalLevelInfoKey_ConstraintIndicatorFlags", optional=true)
        public static native CFString ConstraintIndicatorFlags();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCMHEVCTemporalLevelInfoKey_LevelIndex", optional=true)
        public static native CFString LevelIndex();
    }
    /*</keys>*/
}
