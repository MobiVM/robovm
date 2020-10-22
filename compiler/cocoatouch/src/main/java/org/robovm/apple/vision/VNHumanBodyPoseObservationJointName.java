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
@Marshaler(/*<name>*/VNHumanBodyPoseObservationJointName/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNHumanBodyPoseObservationJointName/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/VNHumanBodyPoseObservationJointName/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static VNHumanBodyPoseObservationJointName toObject(Class<VNHumanBodyPoseObservationJointName> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return VNHumanBodyPoseObservationJointName.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(VNHumanBodyPoseObservationJointName o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<VNHumanBodyPoseObservationJointName> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<VNHumanBodyPoseObservationJointName> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(VNHumanBodyPoseObservationJointName.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<VNHumanBodyPoseObservationJointName> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (VNHumanBodyPoseObservationJointName o : l) {
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
    public static final VNHumanBodyPoseObservationJointName Nose = new VNHumanBodyPoseObservationJointName("Nose");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanBodyPoseObservationJointName LeftEye = new VNHumanBodyPoseObservationJointName("LeftEye");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanBodyPoseObservationJointName RightEye = new VNHumanBodyPoseObservationJointName("RightEye");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanBodyPoseObservationJointName LeftEar = new VNHumanBodyPoseObservationJointName("LeftEar");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanBodyPoseObservationJointName RightEar = new VNHumanBodyPoseObservationJointName("RightEar");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanBodyPoseObservationJointName LeftShoulder = new VNHumanBodyPoseObservationJointName("LeftShoulder");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanBodyPoseObservationJointName RightShoulder = new VNHumanBodyPoseObservationJointName("RightShoulder");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanBodyPoseObservationJointName Neck = new VNHumanBodyPoseObservationJointName("Neck");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanBodyPoseObservationJointName LeftElbow = new VNHumanBodyPoseObservationJointName("LeftElbow");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanBodyPoseObservationJointName RightElbow = new VNHumanBodyPoseObservationJointName("RightElbow");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanBodyPoseObservationJointName LeftWrist = new VNHumanBodyPoseObservationJointName("LeftWrist");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanBodyPoseObservationJointName RightWrist = new VNHumanBodyPoseObservationJointName("RightWrist");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanBodyPoseObservationJointName LeftHip = new VNHumanBodyPoseObservationJointName("LeftHip");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanBodyPoseObservationJointName RightHip = new VNHumanBodyPoseObservationJointName("RightHip");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanBodyPoseObservationJointName Root = new VNHumanBodyPoseObservationJointName("Root");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanBodyPoseObservationJointName LeftKnee = new VNHumanBodyPoseObservationJointName("LeftKnee");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanBodyPoseObservationJointName RightKnee = new VNHumanBodyPoseObservationJointName("RightKnee");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanBodyPoseObservationJointName LeftAnkle = new VNHumanBodyPoseObservationJointName("LeftAnkle");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanBodyPoseObservationJointName RightAnkle = new VNHumanBodyPoseObservationJointName("RightAnkle");
    /*</constants>*/
    
    private static /*<name>*/VNHumanBodyPoseObservationJointName/*</name>*/[] values = new /*<name>*/VNHumanBodyPoseObservationJointName/*</name>*/[] {/*<value_list>*/Nose, LeftEye, RightEye, LeftEar, RightEar, LeftShoulder, RightShoulder, Neck, LeftElbow, RightElbow, LeftWrist, RightWrist, LeftHip, RightHip, Root, LeftKnee, RightKnee, LeftAnkle, RightAnkle/*</value_list>*/};
    
    /*<name>*/VNHumanBodyPoseObservationJointName/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/VNHumanBodyPoseObservationJointName/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/VNHumanBodyPoseObservationJointName/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/VNHumanBodyPoseObservationJointName/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Vision") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointNameNose", optional=true)
        public static native NSString Nose();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointNameLeftEye", optional=true)
        public static native NSString LeftEye();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointNameRightEye", optional=true)
        public static native NSString RightEye();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointNameLeftEar", optional=true)
        public static native NSString LeftEar();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointNameRightEar", optional=true)
        public static native NSString RightEar();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointNameLeftShoulder", optional=true)
        public static native NSString LeftShoulder();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointNameRightShoulder", optional=true)
        public static native NSString RightShoulder();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointNameNeck", optional=true)
        public static native NSString Neck();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointNameLeftElbow", optional=true)
        public static native NSString LeftElbow();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointNameRightElbow", optional=true)
        public static native NSString RightElbow();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointNameLeftWrist", optional=true)
        public static native NSString LeftWrist();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointNameRightWrist", optional=true)
        public static native NSString RightWrist();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointNameLeftHip", optional=true)
        public static native NSString LeftHip();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointNameRightHip", optional=true)
        public static native NSString RightHip();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointNameRoot", optional=true)
        public static native NSString Root();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointNameLeftKnee", optional=true)
        public static native NSString LeftKnee();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointNameRightKnee", optional=true)
        public static native NSString RightKnee();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointNameLeftAnkle", optional=true)
        public static native NSString LeftAnkle();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointNameRightAnkle", optional=true)
        public static native NSString RightAnkle();
        /*</values>*/
    }
}
