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
@Marshaler(/*<name>*/VNRecognizedPointKey/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNRecognizedPointKey/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/VNRecognizedPointKey/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static VNRecognizedPointKey toObject(Class<VNRecognizedPointKey> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return VNRecognizedPointKey.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(VNRecognizedPointKey o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<VNRecognizedPointKey> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<VNRecognizedPointKey> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(VNRecognizedPointKey.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<VNRecognizedPointKey> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (VNRecognizedPointKey o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameNose
     */
    @Deprecated
    public static final VNRecognizedPointKey BodyLandmarkKeyNose = new VNRecognizedPointKey("BodyLandmarkKeyNose");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameLeftEye
     */
    @Deprecated
    public static final VNRecognizedPointKey BodyLandmarkKeyLeftEye = new VNRecognizedPointKey("BodyLandmarkKeyLeftEye");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameRightEye
     */
    @Deprecated
    public static final VNRecognizedPointKey BodyLandmarkKeyRightEye = new VNRecognizedPointKey("BodyLandmarkKeyRightEye");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameLeftEar
     */
    @Deprecated
    public static final VNRecognizedPointKey BodyLandmarkKeyLeftEar = new VNRecognizedPointKey("BodyLandmarkKeyLeftEar");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameRightEar
     */
    @Deprecated
    public static final VNRecognizedPointKey BodyLandmarkKeyRightEar = new VNRecognizedPointKey("BodyLandmarkKeyRightEar");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameLeftShoulder
     */
    @Deprecated
    public static final VNRecognizedPointKey BodyLandmarkKeyLeftShoulder = new VNRecognizedPointKey("BodyLandmarkKeyLeftShoulder");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameRightShoulder
     */
    @Deprecated
    public static final VNRecognizedPointKey BodyLandmarkKeyRightShoulder = new VNRecognizedPointKey("BodyLandmarkKeyRightShoulder");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameNeck
     */
    @Deprecated
    public static final VNRecognizedPointKey BodyLandmarkKeyNeck = new VNRecognizedPointKey("BodyLandmarkKeyNeck");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameLeftElbow
     */
    @Deprecated
    public static final VNRecognizedPointKey BodyLandmarkKeyLeftElbow = new VNRecognizedPointKey("BodyLandmarkKeyLeftElbow");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameRightElbow
     */
    @Deprecated
    public static final VNRecognizedPointKey BodyLandmarkKeyRightElbow = new VNRecognizedPointKey("BodyLandmarkKeyRightElbow");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameLeftWrist
     */
    @Deprecated
    public static final VNRecognizedPointKey BodyLandmarkKeyLeftWrist = new VNRecognizedPointKey("BodyLandmarkKeyLeftWrist");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameRightWrist
     */
    @Deprecated
    public static final VNRecognizedPointKey BodyLandmarkKeyRightWrist = new VNRecognizedPointKey("BodyLandmarkKeyRightWrist");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameLeftHip
     */
    @Deprecated
    public static final VNRecognizedPointKey BodyLandmarkKeyLeftHip = new VNRecognizedPointKey("BodyLandmarkKeyLeftHip");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameRightHip
     */
    @Deprecated
    public static final VNRecognizedPointKey BodyLandmarkKeyRightHip = new VNRecognizedPointKey("BodyLandmarkKeyRightHip");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameRoot
     */
    @Deprecated
    public static final VNRecognizedPointKey BodyLandmarkKeyRoot = new VNRecognizedPointKey("BodyLandmarkKeyRoot");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameLeftKnee
     */
    @Deprecated
    public static final VNRecognizedPointKey BodyLandmarkKeyLeftKnee = new VNRecognizedPointKey("BodyLandmarkKeyLeftKnee");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameRightKnee
     */
    @Deprecated
    public static final VNRecognizedPointKey BodyLandmarkKeyRightKnee = new VNRecognizedPointKey("BodyLandmarkKeyRightKnee");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameLeftAnkle
     */
    @Deprecated
    public static final VNRecognizedPointKey BodyLandmarkKeyLeftAnkle = new VNRecognizedPointKey("BodyLandmarkKeyLeftAnkle");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameRightAnkle
     */
    @Deprecated
    public static final VNRecognizedPointKey BodyLandmarkKeyRightAnkle = new VNRecognizedPointKey("BodyLandmarkKeyRightAnkle");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameWrist
     */
    @Deprecated
    public static final VNRecognizedPointKey HandLandmarkKeyWrist = new VNRecognizedPointKey("HandLandmarkKeyWrist");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameThumbCMC
     */
    @Deprecated
    public static final VNRecognizedPointKey HandLandmarkKeyThumbCMC = new VNRecognizedPointKey("HandLandmarkKeyThumbCMC");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameThumbMP
     */
    @Deprecated
    public static final VNRecognizedPointKey HandLandmarkKeyThumbMP = new VNRecognizedPointKey("HandLandmarkKeyThumbMP");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameThumbIP
     */
    @Deprecated
    public static final VNRecognizedPointKey HandLandmarkKeyThumbIP = new VNRecognizedPointKey("HandLandmarkKeyThumbIP");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameThumbTip
     */
    @Deprecated
    public static final VNRecognizedPointKey HandLandmarkKeyThumbTIP = new VNRecognizedPointKey("HandLandmarkKeyThumbTIP");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameIndexMCP
     */
    @Deprecated
    public static final VNRecognizedPointKey HandLandmarkKeyIndexMCP = new VNRecognizedPointKey("HandLandmarkKeyIndexMCP");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameIndexPIP
     */
    @Deprecated
    public static final VNRecognizedPointKey HandLandmarkKeyIndexPIP = new VNRecognizedPointKey("HandLandmarkKeyIndexPIP");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameIndexDIP
     */
    @Deprecated
    public static final VNRecognizedPointKey HandLandmarkKeyIndexDIP = new VNRecognizedPointKey("HandLandmarkKeyIndexDIP");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameIndexTip
     */
    @Deprecated
    public static final VNRecognizedPointKey HandLandmarkKeyIndexTIP = new VNRecognizedPointKey("HandLandmarkKeyIndexTIP");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameMiddleMCP
     */
    @Deprecated
    public static final VNRecognizedPointKey HandLandmarkKeyMiddleMCP = new VNRecognizedPointKey("HandLandmarkKeyMiddleMCP");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameMiddlePIP
     */
    @Deprecated
    public static final VNRecognizedPointKey HandLandmarkKeyMiddlePIP = new VNRecognizedPointKey("HandLandmarkKeyMiddlePIP");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameMiddleDIP
     */
    @Deprecated
    public static final VNRecognizedPointKey HandLandmarkKeyMiddleDIP = new VNRecognizedPointKey("HandLandmarkKeyMiddleDIP");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameMiddleTip
     */
    @Deprecated
    public static final VNRecognizedPointKey HandLandmarkKeyMiddleTIP = new VNRecognizedPointKey("HandLandmarkKeyMiddleTIP");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameRingMCP
     */
    @Deprecated
    public static final VNRecognizedPointKey HandLandmarkKeyRingMCP = new VNRecognizedPointKey("HandLandmarkKeyRingMCP");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameRingPIP
     */
    @Deprecated
    public static final VNRecognizedPointKey HandLandmarkKeyRingPIP = new VNRecognizedPointKey("HandLandmarkKeyRingPIP");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameRingDIP
     */
    @Deprecated
    public static final VNRecognizedPointKey HandLandmarkKeyRingDIP = new VNRecognizedPointKey("HandLandmarkKeyRingDIP");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameRingTip
     */
    @Deprecated
    public static final VNRecognizedPointKey HandLandmarkKeyRingTIP = new VNRecognizedPointKey("HandLandmarkKeyRingTIP");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameLittleMCP
     */
    @Deprecated
    public static final VNRecognizedPointKey HandLandmarkKeyLittleMCP = new VNRecognizedPointKey("HandLandmarkKeyLittleMCP");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameLittlePIP
     */
    @Deprecated
    public static final VNRecognizedPointKey HandLandmarkKeyLittlePIP = new VNRecognizedPointKey("HandLandmarkKeyLittlePIP");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameLittleDIP
     */
    @Deprecated
    public static final VNRecognizedPointKey HandLandmarkKeyLittleDIP = new VNRecognizedPointKey("HandLandmarkKeyLittleDIP");
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameLittleTip
     */
    @Deprecated
    public static final VNRecognizedPointKey HandLandmarkKeyLittleTIP = new VNRecognizedPointKey("HandLandmarkKeyLittleTIP");
    /*</constants>*/
    
    private static /*<name>*/VNRecognizedPointKey/*</name>*/[] values = new /*<name>*/VNRecognizedPointKey/*</name>*/[] {/*<value_list>*/BodyLandmarkKeyNose, BodyLandmarkKeyLeftEye, BodyLandmarkKeyRightEye, BodyLandmarkKeyLeftEar, BodyLandmarkKeyRightEar, BodyLandmarkKeyLeftShoulder, BodyLandmarkKeyRightShoulder, BodyLandmarkKeyNeck, BodyLandmarkKeyLeftElbow, BodyLandmarkKeyRightElbow, BodyLandmarkKeyLeftWrist, BodyLandmarkKeyRightWrist, BodyLandmarkKeyLeftHip, BodyLandmarkKeyRightHip, BodyLandmarkKeyRoot, BodyLandmarkKeyLeftKnee, BodyLandmarkKeyRightKnee, BodyLandmarkKeyLeftAnkle, BodyLandmarkKeyRightAnkle, HandLandmarkKeyWrist, HandLandmarkKeyThumbCMC, HandLandmarkKeyThumbMP, HandLandmarkKeyThumbIP, HandLandmarkKeyThumbTIP, HandLandmarkKeyIndexMCP, HandLandmarkKeyIndexPIP, HandLandmarkKeyIndexDIP, HandLandmarkKeyIndexTIP, HandLandmarkKeyMiddleMCP, HandLandmarkKeyMiddlePIP, HandLandmarkKeyMiddleDIP, HandLandmarkKeyMiddleTIP, HandLandmarkKeyRingMCP, HandLandmarkKeyRingPIP, HandLandmarkKeyRingDIP, HandLandmarkKeyRingTIP, HandLandmarkKeyLittleMCP, HandLandmarkKeyLittlePIP, HandLandmarkKeyLittleDIP, HandLandmarkKeyLittleTIP/*</value_list>*/};
    
    /*<name>*/VNRecognizedPointKey/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/VNRecognizedPointKey/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/VNRecognizedPointKey/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/VNRecognizedPointKey/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Vision") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameNose
         */
        @Deprecated
        @GlobalValue(symbol="VNBodyLandmarkKeyNose", optional=true)
        public static native NSString BodyLandmarkKeyNose();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameLeftEye
         */
        @Deprecated
        @GlobalValue(symbol="VNBodyLandmarkKeyLeftEye", optional=true)
        public static native NSString BodyLandmarkKeyLeftEye();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameRightEye
         */
        @Deprecated
        @GlobalValue(symbol="VNBodyLandmarkKeyRightEye", optional=true)
        public static native NSString BodyLandmarkKeyRightEye();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameLeftEar
         */
        @Deprecated
        @GlobalValue(symbol="VNBodyLandmarkKeyLeftEar", optional=true)
        public static native NSString BodyLandmarkKeyLeftEar();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameRightEar
         */
        @Deprecated
        @GlobalValue(symbol="VNBodyLandmarkKeyRightEar", optional=true)
        public static native NSString BodyLandmarkKeyRightEar();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameLeftShoulder
         */
        @Deprecated
        @GlobalValue(symbol="VNBodyLandmarkKeyLeftShoulder", optional=true)
        public static native NSString BodyLandmarkKeyLeftShoulder();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameRightShoulder
         */
        @Deprecated
        @GlobalValue(symbol="VNBodyLandmarkKeyRightShoulder", optional=true)
        public static native NSString BodyLandmarkKeyRightShoulder();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameNeck
         */
        @Deprecated
        @GlobalValue(symbol="VNBodyLandmarkKeyNeck", optional=true)
        public static native NSString BodyLandmarkKeyNeck();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameLeftElbow
         */
        @Deprecated
        @GlobalValue(symbol="VNBodyLandmarkKeyLeftElbow", optional=true)
        public static native NSString BodyLandmarkKeyLeftElbow();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameRightElbow
         */
        @Deprecated
        @GlobalValue(symbol="VNBodyLandmarkKeyRightElbow", optional=true)
        public static native NSString BodyLandmarkKeyRightElbow();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameLeftWrist
         */
        @Deprecated
        @GlobalValue(symbol="VNBodyLandmarkKeyLeftWrist", optional=true)
        public static native NSString BodyLandmarkKeyLeftWrist();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameRightWrist
         */
        @Deprecated
        @GlobalValue(symbol="VNBodyLandmarkKeyRightWrist", optional=true)
        public static native NSString BodyLandmarkKeyRightWrist();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameLeftHip
         */
        @Deprecated
        @GlobalValue(symbol="VNBodyLandmarkKeyLeftHip", optional=true)
        public static native NSString BodyLandmarkKeyLeftHip();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameRightHip
         */
        @Deprecated
        @GlobalValue(symbol="VNBodyLandmarkKeyRightHip", optional=true)
        public static native NSString BodyLandmarkKeyRightHip();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameRoot
         */
        @Deprecated
        @GlobalValue(symbol="VNBodyLandmarkKeyRoot", optional=true)
        public static native NSString BodyLandmarkKeyRoot();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameLeftKnee
         */
        @Deprecated
        @GlobalValue(symbol="VNBodyLandmarkKeyLeftKnee", optional=true)
        public static native NSString BodyLandmarkKeyLeftKnee();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameRightKnee
         */
        @Deprecated
        @GlobalValue(symbol="VNBodyLandmarkKeyRightKnee", optional=true)
        public static native NSString BodyLandmarkKeyRightKnee();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameLeftAnkle
         */
        @Deprecated
        @GlobalValue(symbol="VNBodyLandmarkKeyLeftAnkle", optional=true)
        public static native NSString BodyLandmarkKeyLeftAnkle();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanBodyPoseObservationJointNameRightAnkle
         */
        @Deprecated
        @GlobalValue(symbol="VNBodyLandmarkKeyRightAnkle", optional=true)
        public static native NSString BodyLandmarkKeyRightAnkle();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameWrist
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkKeyWrist", optional=true)
        public static native NSString HandLandmarkKeyWrist();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameThumbCMC
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkKeyThumbCMC", optional=true)
        public static native NSString HandLandmarkKeyThumbCMC();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameThumbMP
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkKeyThumbMP", optional=true)
        public static native NSString HandLandmarkKeyThumbMP();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameThumbIP
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkKeyThumbIP", optional=true)
        public static native NSString HandLandmarkKeyThumbIP();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameThumbTip
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkKeyThumbTIP", optional=true)
        public static native NSString HandLandmarkKeyThumbTIP();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameIndexMCP
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkKeyIndexMCP", optional=true)
        public static native NSString HandLandmarkKeyIndexMCP();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameIndexPIP
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkKeyIndexPIP", optional=true)
        public static native NSString HandLandmarkKeyIndexPIP();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameIndexDIP
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkKeyIndexDIP", optional=true)
        public static native NSString HandLandmarkKeyIndexDIP();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameIndexTip
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkKeyIndexTIP", optional=true)
        public static native NSString HandLandmarkKeyIndexTIP();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameMiddleMCP
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkKeyMiddleMCP", optional=true)
        public static native NSString HandLandmarkKeyMiddleMCP();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameMiddlePIP
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkKeyMiddlePIP", optional=true)
        public static native NSString HandLandmarkKeyMiddlePIP();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameMiddleDIP
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkKeyMiddleDIP", optional=true)
        public static native NSString HandLandmarkKeyMiddleDIP();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameMiddleTip
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkKeyMiddleTIP", optional=true)
        public static native NSString HandLandmarkKeyMiddleTIP();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameRingMCP
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkKeyRingMCP", optional=true)
        public static native NSString HandLandmarkKeyRingMCP();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameRingPIP
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkKeyRingPIP", optional=true)
        public static native NSString HandLandmarkKeyRingPIP();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameRingDIP
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkKeyRingDIP", optional=true)
        public static native NSString HandLandmarkKeyRingDIP();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameRingTip
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkKeyRingTIP", optional=true)
        public static native NSString HandLandmarkKeyRingTIP();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameLittleMCP
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkKeyLittleMCP", optional=true)
        public static native NSString HandLandmarkKeyLittleMCP();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameLittlePIP
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkKeyLittlePIP", optional=true)
        public static native NSString HandLandmarkKeyLittlePIP();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameLittleDIP
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkKeyLittleDIP", optional=true)
        public static native NSString HandLandmarkKeyLittleDIP();
        /**
         * @since Available in iOS 14.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use VNHumanHandPoseObservationJointNameLittleTip
         */
        @Deprecated
        @GlobalValue(symbol="VNHandLandmarkKeyLittleTIP", optional=true)
        public static native NSString HandLandmarkKeyLittleTIP();
        /*</values>*/
    }
}
