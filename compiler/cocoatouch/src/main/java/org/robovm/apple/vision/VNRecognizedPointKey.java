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
    /*</constants>*/
    
    private static /*<name>*/VNRecognizedPointKey/*</name>*/[] values = new /*<name>*/VNRecognizedPointKey/*</name>*/[] {/*<value_list>*/BodyLandmarkKeyNose, BodyLandmarkKeyLeftEye, BodyLandmarkKeyRightEye, BodyLandmarkKeyLeftEar, BodyLandmarkKeyRightEar, BodyLandmarkKeyLeftShoulder, BodyLandmarkKeyRightShoulder, BodyLandmarkKeyNeck, BodyLandmarkKeyLeftElbow, BodyLandmarkKeyRightElbow, BodyLandmarkKeyLeftWrist, BodyLandmarkKeyRightWrist, BodyLandmarkKeyLeftHip, BodyLandmarkKeyRightHip, BodyLandmarkKeyRoot, BodyLandmarkKeyLeftKnee, BodyLandmarkKeyRightKnee, BodyLandmarkKeyLeftAnkle, BodyLandmarkKeyRightAnkle/*</value_list>*/};
    
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

    // dkimitsa: manually added code to support subclasses
    protected VNRecognizedPointKey (Class<?> clazz, String getterName) {
        super(clazz, getterName);
    }

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
        /*</values>*/
    }
}
