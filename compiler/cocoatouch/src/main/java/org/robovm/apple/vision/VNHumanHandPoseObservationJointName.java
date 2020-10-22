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
@Marshaler(/*<name>*/VNHumanHandPoseObservationJointName/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNHumanHandPoseObservationJointName/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/VNHumanHandPoseObservationJointName/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static VNHumanHandPoseObservationJointName toObject(Class<VNHumanHandPoseObservationJointName> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return VNHumanHandPoseObservationJointName.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(VNHumanHandPoseObservationJointName o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<VNHumanHandPoseObservationJointName> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<VNHumanHandPoseObservationJointName> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(VNHumanHandPoseObservationJointName.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<VNHumanHandPoseObservationJointName> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (VNHumanHandPoseObservationJointName o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointName Wrist = new VNHumanHandPoseObservationJointName("Wrist");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointName ThumbCMC = new VNHumanHandPoseObservationJointName("ThumbCMC");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointName ThumbMP = new VNHumanHandPoseObservationJointName("ThumbMP");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointName ThumbIP = new VNHumanHandPoseObservationJointName("ThumbIP");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointName ThumbTip = new VNHumanHandPoseObservationJointName("ThumbTip");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointName IndexMCP = new VNHumanHandPoseObservationJointName("IndexMCP");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointName IndexPIP = new VNHumanHandPoseObservationJointName("IndexPIP");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointName IndexDIP = new VNHumanHandPoseObservationJointName("IndexDIP");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointName IndexTip = new VNHumanHandPoseObservationJointName("IndexTip");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointName MiddleMCP = new VNHumanHandPoseObservationJointName("MiddleMCP");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointName MiddlePIP = new VNHumanHandPoseObservationJointName("MiddlePIP");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointName MiddleDIP = new VNHumanHandPoseObservationJointName("MiddleDIP");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointName MiddleTip = new VNHumanHandPoseObservationJointName("MiddleTip");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointName RingMCP = new VNHumanHandPoseObservationJointName("RingMCP");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointName RingPIP = new VNHumanHandPoseObservationJointName("RingPIP");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointName RingDIP = new VNHumanHandPoseObservationJointName("RingDIP");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointName RingTip = new VNHumanHandPoseObservationJointName("RingTip");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointName LittleMCP = new VNHumanHandPoseObservationJointName("LittleMCP");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointName LittlePIP = new VNHumanHandPoseObservationJointName("LittlePIP");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointName LittleDIP = new VNHumanHandPoseObservationJointName("LittleDIP");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointName LittleTip = new VNHumanHandPoseObservationJointName("LittleTip");
    /*</constants>*/
    
    private static /*<name>*/VNHumanHandPoseObservationJointName/*</name>*/[] values = new /*<name>*/VNHumanHandPoseObservationJointName/*</name>*/[] {/*<value_list>*/Wrist, ThumbCMC, ThumbMP, ThumbIP, ThumbTip, IndexMCP, IndexPIP, IndexDIP, IndexTip, MiddleMCP, MiddlePIP, MiddleDIP, MiddleTip, RingMCP, RingPIP, RingDIP, RingTip, LittleMCP, LittlePIP, LittleDIP, LittleTip/*</value_list>*/};
    
    /*<name>*/VNHumanHandPoseObservationJointName/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/VNHumanHandPoseObservationJointName/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/VNHumanHandPoseObservationJointName/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/VNHumanHandPoseObservationJointName/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Vision") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointNameWrist", optional=true)
        public static native NSString Wrist();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointNameThumbCMC", optional=true)
        public static native NSString ThumbCMC();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointNameThumbMP", optional=true)
        public static native NSString ThumbMP();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointNameThumbIP", optional=true)
        public static native NSString ThumbIP();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointNameThumbTip", optional=true)
        public static native NSString ThumbTip();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointNameIndexMCP", optional=true)
        public static native NSString IndexMCP();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointNameIndexPIP", optional=true)
        public static native NSString IndexPIP();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointNameIndexDIP", optional=true)
        public static native NSString IndexDIP();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointNameIndexTip", optional=true)
        public static native NSString IndexTip();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointNameMiddleMCP", optional=true)
        public static native NSString MiddleMCP();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointNameMiddlePIP", optional=true)
        public static native NSString MiddlePIP();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointNameMiddleDIP", optional=true)
        public static native NSString MiddleDIP();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointNameMiddleTip", optional=true)
        public static native NSString MiddleTip();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointNameRingMCP", optional=true)
        public static native NSString RingMCP();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointNameRingPIP", optional=true)
        public static native NSString RingPIP();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointNameRingDIP", optional=true)
        public static native NSString RingDIP();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointNameRingTip", optional=true)
        public static native NSString RingTip();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointNameLittleMCP", optional=true)
        public static native NSString LittleMCP();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointNameLittlePIP", optional=true)
        public static native NSString LittlePIP();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointNameLittleDIP", optional=true)
        public static native NSString LittleDIP();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointNameLittleTip", optional=true)
        public static native NSString LittleTip();
        /*</values>*/
    }
}
