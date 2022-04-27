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
/*<annotations>*/@Library("CoreMedia") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CMSampleAttachmentKey/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CMSampleAttachmentKey/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CMSampleAttachmentKey toObject(Class<CMSampleAttachmentKey> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CMSampleAttachmentKey.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CMSampleAttachmentKey o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CMSampleAttachmentKey> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CMSampleAttachmentKey> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CMSampleAttachmentKey.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CMSampleAttachmentKey> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CMSampleAttachmentKey o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final CMSampleAttachmentKey NotSync = new CMSampleAttachmentKey("NotSync");
    public static final CMSampleAttachmentKey PartialSync = new CMSampleAttachmentKey("PartialSync");
    public static final CMSampleAttachmentKey HasRedundantCoding = new CMSampleAttachmentKey("HasRedundantCoding");
    public static final CMSampleAttachmentKey IsDependedOnByOthers = new CMSampleAttachmentKey("IsDependedOnByOthers");
    public static final CMSampleAttachmentKey DependsOnOthers = new CMSampleAttachmentKey("DependsOnOthers");
    public static final CMSampleAttachmentKey EarlierDisplayTimesAllowed = new CMSampleAttachmentKey("EarlierDisplayTimesAllowed");
    public static final CMSampleAttachmentKey DisplayImmediately = new CMSampleAttachmentKey("DisplayImmediately");
    public static final CMSampleAttachmentKey DoNotDisplay = new CMSampleAttachmentKey("DoNotDisplay");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final CMSampleAttachmentKey HEVCTemporalLevelInfo = new CMSampleAttachmentKey("HEVCTemporalLevelInfo");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final CMSampleAttachmentKey HEVCTemporalSubLayerAccess = new CMSampleAttachmentKey("HEVCTemporalSubLayerAccess");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final CMSampleAttachmentKey HEVCStepwiseTemporalSubLayerAccess = new CMSampleAttachmentKey("HEVCStepwiseTemporalSubLayerAccess");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final CMSampleAttachmentKey HEVCSyncSampleNALUnitType = new CMSampleAttachmentKey("HEVCSyncSampleNALUnitType");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CMSampleAttachmentKey AudioIndependentSampleDecoderRefreshCount = new CMSampleAttachmentKey("AudioIndependentSampleDecoderRefreshCount");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final CMSampleAttachmentKey CryptorSubsampleAuxiliaryData = new CMSampleAttachmentKey("CryptorSubsampleAuxiliaryData");
    /*</constants>*/
    
    private static /*<name>*/CMSampleAttachmentKey/*</name>*/[] values = new /*<name>*/CMSampleAttachmentKey/*</name>*/[] {/*<value_list>*/NotSync, PartialSync, HasRedundantCoding, IsDependedOnByOthers, DependsOnOthers, EarlierDisplayTimesAllowed, DisplayImmediately, DoNotDisplay, HEVCTemporalLevelInfo, HEVCTemporalSubLayerAccess, HEVCStepwiseTemporalSubLayerAccess, HEVCSyncSampleNALUnitType, AudioIndependentSampleDecoderRefreshCount, CryptorSubsampleAuxiliaryData/*</value_list>*/};
    
    /*<name>*/CMSampleAttachmentKey/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CMSampleAttachmentKey/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CMSampleAttachmentKey/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CMSampleAttachmentKey/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CoreMedia") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kCMSampleAttachmentKey_NotSync", optional=true)
        public static native CFString NotSync();
        @GlobalValue(symbol="kCMSampleAttachmentKey_PartialSync", optional=true)
        public static native CFString PartialSync();
        @GlobalValue(symbol="kCMSampleAttachmentKey_HasRedundantCoding", optional=true)
        public static native CFString HasRedundantCoding();
        @GlobalValue(symbol="kCMSampleAttachmentKey_IsDependedOnByOthers", optional=true)
        public static native CFString IsDependedOnByOthers();
        @GlobalValue(symbol="kCMSampleAttachmentKey_DependsOnOthers", optional=true)
        public static native CFString DependsOnOthers();
        @GlobalValue(symbol="kCMSampleAttachmentKey_EarlierDisplayTimesAllowed", optional=true)
        public static native CFString EarlierDisplayTimesAllowed();
        @GlobalValue(symbol="kCMSampleAttachmentKey_DisplayImmediately", optional=true)
        public static native CFString DisplayImmediately();
        @GlobalValue(symbol="kCMSampleAttachmentKey_DoNotDisplay", optional=true)
        public static native CFString DoNotDisplay();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCMSampleAttachmentKey_HEVCTemporalLevelInfo", optional=true)
        public static native CFString HEVCTemporalLevelInfo();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCMSampleAttachmentKey_HEVCTemporalSubLayerAccess", optional=true)
        public static native CFString HEVCTemporalSubLayerAccess();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCMSampleAttachmentKey_HEVCStepwiseTemporalSubLayerAccess", optional=true)
        public static native CFString HEVCStepwiseTemporalSubLayerAccess();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCMSampleAttachmentKey_HEVCSyncSampleNALUnitType", optional=true)
        public static native CFString HEVCSyncSampleNALUnitType();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCMSampleAttachmentKey_AudioIndependentSampleDecoderRefreshCount", optional=true)
        public static native CFString AudioIndependentSampleDecoderRefreshCount();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kCMSampleAttachmentKey_CryptorSubsampleAuxiliaryData", optional=true)
        public static native CFString CryptorSubsampleAuxiliaryData();
        /*</values>*/
    }
}
