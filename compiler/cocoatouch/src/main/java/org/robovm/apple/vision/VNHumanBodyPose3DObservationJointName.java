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
@Marshaler(/*<name>*/VNHumanBodyPose3DObservationJointName/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNHumanBodyPose3DObservationJointName/*</name>*/ 
    extends /*<extends>*/VNRecognizedPointKey/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/VNHumanBodyPose3DObservationJointName/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static VNHumanBodyPose3DObservationJointName toObject(Class<VNHumanBodyPose3DObservationJointName> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return VNHumanBodyPose3DObservationJointName.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(VNHumanBodyPose3DObservationJointName o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<VNHumanBodyPose3DObservationJointName> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<VNHumanBodyPose3DObservationJointName> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(VNHumanBodyPose3DObservationJointName.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<VNHumanBodyPose3DObservationJointName> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (VNHumanBodyPose3DObservationJointName o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNHumanBodyPose3DObservationJointName Root = new VNHumanBodyPose3DObservationJointName("Root");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNHumanBodyPose3DObservationJointName RightHip = new VNHumanBodyPose3DObservationJointName("RightHip");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNHumanBodyPose3DObservationJointName RightKnee = new VNHumanBodyPose3DObservationJointName("RightKnee");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNHumanBodyPose3DObservationJointName RightAnkle = new VNHumanBodyPose3DObservationJointName("RightAnkle");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNHumanBodyPose3DObservationJointName LeftHip = new VNHumanBodyPose3DObservationJointName("LeftHip");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNHumanBodyPose3DObservationJointName LeftKnee = new VNHumanBodyPose3DObservationJointName("LeftKnee");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNHumanBodyPose3DObservationJointName LeftAnkle = new VNHumanBodyPose3DObservationJointName("LeftAnkle");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNHumanBodyPose3DObservationJointName Spine = new VNHumanBodyPose3DObservationJointName("Spine");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNHumanBodyPose3DObservationJointName CenterShoulder = new VNHumanBodyPose3DObservationJointName("CenterShoulder");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNHumanBodyPose3DObservationJointName CenterHead = new VNHumanBodyPose3DObservationJointName("CenterHead");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNHumanBodyPose3DObservationJointName TopHead = new VNHumanBodyPose3DObservationJointName("TopHead");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNHumanBodyPose3DObservationJointName LeftShoulder = new VNHumanBodyPose3DObservationJointName("LeftShoulder");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNHumanBodyPose3DObservationJointName LeftElbow = new VNHumanBodyPose3DObservationJointName("LeftElbow");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNHumanBodyPose3DObservationJointName LeftWrist = new VNHumanBodyPose3DObservationJointName("LeftWrist");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNHumanBodyPose3DObservationJointName RightShoulder = new VNHumanBodyPose3DObservationJointName("RightShoulder");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNHumanBodyPose3DObservationJointName RightElbow = new VNHumanBodyPose3DObservationJointName("RightElbow");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNHumanBodyPose3DObservationJointName RightWrist = new VNHumanBodyPose3DObservationJointName("RightWrist");
    /*</constants>*/
    
    private static /*<name>*/VNHumanBodyPose3DObservationJointName/*</name>*/[] values = new /*<name>*/VNHumanBodyPose3DObservationJointName/*</name>*/[] {/*<value_list>*/Root, RightHip, RightKnee, RightAnkle, LeftHip, LeftKnee, LeftAnkle, Spine, CenterShoulder, CenterHead, TopHead, LeftShoulder, LeftElbow, LeftWrist, RightShoulder, RightElbow, RightWrist/*</value_list>*/};
    
    /*<name>*/VNHumanBodyPose3DObservationJointName/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/VNHumanBodyPose3DObservationJointName/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/VNHumanBodyPose3DObservationJointName/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/VNHumanBodyPose3DObservationJointName/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Vision") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPose3DObservationJointNameRoot", optional=true)
        public static native NSString Root();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPose3DObservationJointNameRightHip", optional=true)
        public static native NSString RightHip();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPose3DObservationJointNameRightKnee", optional=true)
        public static native NSString RightKnee();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPose3DObservationJointNameRightAnkle", optional=true)
        public static native NSString RightAnkle();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPose3DObservationJointNameLeftHip", optional=true)
        public static native NSString LeftHip();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPose3DObservationJointNameLeftKnee", optional=true)
        public static native NSString LeftKnee();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPose3DObservationJointNameLeftAnkle", optional=true)
        public static native NSString LeftAnkle();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPose3DObservationJointNameSpine", optional=true)
        public static native NSString Spine();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPose3DObservationJointNameCenterShoulder", optional=true)
        public static native NSString CenterShoulder();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPose3DObservationJointNameCenterHead", optional=true)
        public static native NSString CenterHead();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPose3DObservationJointNameTopHead", optional=true)
        public static native NSString TopHead();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPose3DObservationJointNameLeftShoulder", optional=true)
        public static native NSString LeftShoulder();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPose3DObservationJointNameLeftElbow", optional=true)
        public static native NSString LeftElbow();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPose3DObservationJointNameLeftWrist", optional=true)
        public static native NSString LeftWrist();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPose3DObservationJointNameRightShoulder", optional=true)
        public static native NSString RightShoulder();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPose3DObservationJointNameRightElbow", optional=true)
        public static native NSString RightElbow();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPose3DObservationJointNameRightWrist", optional=true)
        public static native NSString RightWrist();
        /*</values>*/
    }
}
