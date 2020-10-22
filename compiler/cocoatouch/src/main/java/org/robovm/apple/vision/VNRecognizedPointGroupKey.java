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
@Marshaler(/*<name>*/VNRecognizedPointGroupKey/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNRecognizedPointGroupKey/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/VNRecognizedPointGroupKey/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static VNRecognizedPointGroupKey toObject(Class<VNRecognizedPointGroupKey> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return VNRecognizedPointGroupKey.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(VNRecognizedPointGroupKey o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<VNRecognizedPointGroupKey> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<VNRecognizedPointGroupKey> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(VNRecognizedPointGroupKey.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<VNRecognizedPointGroupKey> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (VNRecognizedPointGroupKey o : l) {
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
    public static final VNRecognizedPointGroupKey RecognizedPointGroupKeyAll = new VNRecognizedPointGroupKey("RecognizedPointGroupKeyAll");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointsGroupNameFace
     */
    @Deprecated
    public static final VNRecognizedPointGroupKey BodyLandmarkRegionKeyFace = new VNRecognizedPointGroupKey("BodyLandmarkRegionKeyFace");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointsGroupNameTorso
     */
    @Deprecated
    public static final VNRecognizedPointGroupKey BodyLandmarkRegionKeyTorso = new VNRecognizedPointGroupKey("BodyLandmarkRegionKeyTorso");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointsGroupNameLeftArm
     */
    @Deprecated
    public static final VNRecognizedPointGroupKey BodyLandmarkRegionKeyLeftArm = new VNRecognizedPointGroupKey("BodyLandmarkRegionKeyLeftArm");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointsGroupNameRightArm
     */
    @Deprecated
    public static final VNRecognizedPointGroupKey BodyLandmarkRegionKeyRightArm = new VNRecognizedPointGroupKey("BodyLandmarkRegionKeyRightArm");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointsGroupNameLeftLeg
     */
    @Deprecated
    public static final VNRecognizedPointGroupKey BodyLandmarkRegionKeyLeftLeg = new VNRecognizedPointGroupKey("BodyLandmarkRegionKeyLeftLeg");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointsGroupNameRightLeg
     */
    @Deprecated
    public static final VNRecognizedPointGroupKey BodyLandmarkRegionKeyRightLeg = new VNRecognizedPointGroupKey("BodyLandmarkRegionKeyRightLeg");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointsGroupNameThumb
     */
    @Deprecated
    public static final VNRecognizedPointGroupKey HandLandmarkRegionKeyThumb = new VNRecognizedPointGroupKey("HandLandmarkRegionKeyThumb");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointsGroupNameIndexFinger
     */
    @Deprecated
    public static final VNRecognizedPointGroupKey HandLandmarkRegionKeyIndexFinger = new VNRecognizedPointGroupKey("HandLandmarkRegionKeyIndexFinger");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointsGroupNameMiddleFinger
     */
    @Deprecated
    public static final VNRecognizedPointGroupKey HandLandmarkRegionKeyMiddleFinger = new VNRecognizedPointGroupKey("HandLandmarkRegionKeyMiddleFinger");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointsGroupNameRingFinger
     */
    @Deprecated
    public static final VNRecognizedPointGroupKey HandLandmarkRegionKeyRingFinger = new VNRecognizedPointGroupKey("HandLandmarkRegionKeyRingFinger");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointsGroupNameLittleFinger
     */
    @Deprecated
    public static final VNRecognizedPointGroupKey HandLandmarkRegionKeyLittleFinger = new VNRecognizedPointGroupKey("HandLandmarkRegionKeyLittleFinger");
    /*</constants>*/
    
    private static /*<name>*/VNRecognizedPointGroupKey/*</name>*/[] values = new /*<name>*/VNRecognizedPointGroupKey/*</name>*/[] {/*<value_list>*/RecognizedPointGroupKeyAll, BodyLandmarkRegionKeyFace, BodyLandmarkRegionKeyTorso, BodyLandmarkRegionKeyLeftArm, BodyLandmarkRegionKeyRightArm, BodyLandmarkRegionKeyLeftLeg, BodyLandmarkRegionKeyRightLeg, HandLandmarkRegionKeyThumb, HandLandmarkRegionKeyIndexFinger, HandLandmarkRegionKeyMiddleFinger, HandLandmarkRegionKeyRingFinger, HandLandmarkRegionKeyLittleFinger/*</value_list>*/};
    
    /*<name>*/VNRecognizedPointGroupKey/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/VNRecognizedPointGroupKey/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/VNRecognizedPointGroupKey/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/VNRecognizedPointGroupKey/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Vision") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNRecognizedPointGroupKeyAll", optional=true)
        public static native NSString RecognizedPointGroupKeyAll();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointsGroupNameFace
         */
        @Deprecated
        @GlobalValue(symbol="VNBodyLandmarkRegionKeyFace", optional=true)
        public static native NSString BodyLandmarkRegionKeyFace();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointsGroupNameTorso
         */
        @Deprecated
        @GlobalValue(symbol="VNBodyLandmarkRegionKeyTorso", optional=true)
        public static native NSString BodyLandmarkRegionKeyTorso();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointsGroupNameLeftArm
         */
        @Deprecated
        @GlobalValue(symbol="VNBodyLandmarkRegionKeyLeftArm", optional=true)
        public static native NSString BodyLandmarkRegionKeyLeftArm();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointsGroupNameRightArm
         */
        @Deprecated
        @GlobalValue(symbol="VNBodyLandmarkRegionKeyRightArm", optional=true)
        public static native NSString BodyLandmarkRegionKeyRightArm();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointsGroupNameLeftLeg
         */
        @Deprecated
        @GlobalValue(symbol="VNBodyLandmarkRegionKeyLeftLeg", optional=true)
        public static native NSString BodyLandmarkRegionKeyLeftLeg();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointsGroupNameRightLeg
         */
        @Deprecated
        @GlobalValue(symbol="VNBodyLandmarkRegionKeyRightLeg", optional=true)
        public static native NSString BodyLandmarkRegionKeyRightLeg();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointsGroupNameThumb
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkRegionKeyThumb", optional=true)
        public static native NSString HandLandmarkRegionKeyThumb();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointsGroupNameIndexFinger
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkRegionKeyIndexFinger", optional=true)
        public static native NSString HandLandmarkRegionKeyIndexFinger();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointsGroupNameMiddleFinger
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkRegionKeyMiddleFinger", optional=true)
        public static native NSString HandLandmarkRegionKeyMiddleFinger();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointsGroupNameRingFinger
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkRegionKeyRingFinger", optional=true)
        public static native NSString HandLandmarkRegionKeyRingFinger();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointsGroupNameLittleFinger
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkRegionKeyLittleFinger", optional=true)
        public static native NSString HandLandmarkRegionKeyLittleFinger();
        /*</values>*/
    }
}
