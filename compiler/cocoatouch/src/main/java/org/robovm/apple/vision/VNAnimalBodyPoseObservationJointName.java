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
@Marshaler(/*<name>*/VNAnimalBodyPoseObservationJointName/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNAnimalBodyPoseObservationJointName/*</name>*/ 
    extends /*<extends>*/VNRecognizedPointKey/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/VNAnimalBodyPoseObservationJointName/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static VNAnimalBodyPoseObservationJointName toObject(Class<VNAnimalBodyPoseObservationJointName> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return VNAnimalBodyPoseObservationJointName.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(VNAnimalBodyPoseObservationJointName o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<VNAnimalBodyPoseObservationJointName> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<VNAnimalBodyPoseObservationJointName> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(VNAnimalBodyPoseObservationJointName.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<VNAnimalBodyPoseObservationJointName> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (VNAnimalBodyPoseObservationJointName o : l) {
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
    public static final VNAnimalBodyPoseObservationJointName LeftEarTop = new VNAnimalBodyPoseObservationJointName("LeftEarTop");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointName RightEarTop = new VNAnimalBodyPoseObservationJointName("RightEarTop");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointName LeftEarMiddle = new VNAnimalBodyPoseObservationJointName("LeftEarMiddle");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointName RightEarMiddle = new VNAnimalBodyPoseObservationJointName("RightEarMiddle");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointName LeftEarBottom = new VNAnimalBodyPoseObservationJointName("LeftEarBottom");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointName RightEarBottom = new VNAnimalBodyPoseObservationJointName("RightEarBottom");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointName LeftEye = new VNAnimalBodyPoseObservationJointName("LeftEye");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointName RightEye = new VNAnimalBodyPoseObservationJointName("RightEye");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointName Nose = new VNAnimalBodyPoseObservationJointName("Nose");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointName Neck = new VNAnimalBodyPoseObservationJointName("Neck");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointName LeftFrontElbow = new VNAnimalBodyPoseObservationJointName("LeftFrontElbow");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointName RightFrontElbow = new VNAnimalBodyPoseObservationJointName("RightFrontElbow");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointName LeftFrontKnee = new VNAnimalBodyPoseObservationJointName("LeftFrontKnee");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointName RightFrontKnee = new VNAnimalBodyPoseObservationJointName("RightFrontKnee");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointName LeftFrontPaw = new VNAnimalBodyPoseObservationJointName("LeftFrontPaw");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointName RightFrontPaw = new VNAnimalBodyPoseObservationJointName("RightFrontPaw");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointName LeftBackElbow = new VNAnimalBodyPoseObservationJointName("LeftBackElbow");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointName RightBackElbow = new VNAnimalBodyPoseObservationJointName("RightBackElbow");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointName LeftBackKnee = new VNAnimalBodyPoseObservationJointName("LeftBackKnee");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointName RightBackKnee = new VNAnimalBodyPoseObservationJointName("RightBackKnee");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointName LeftBackPaw = new VNAnimalBodyPoseObservationJointName("LeftBackPaw");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointName RightBackPaw = new VNAnimalBodyPoseObservationJointName("RightBackPaw");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointName TailTop = new VNAnimalBodyPoseObservationJointName("TailTop");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointName TailMiddle = new VNAnimalBodyPoseObservationJointName("TailMiddle");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointName TailBottom = new VNAnimalBodyPoseObservationJointName("TailBottom");
    /*</constants>*/
    
    private static /*<name>*/VNAnimalBodyPoseObservationJointName/*</name>*/[] values = new /*<name>*/VNAnimalBodyPoseObservationJointName/*</name>*/[] {/*<value_list>*/LeftEarTop, RightEarTop, LeftEarMiddle, RightEarMiddle, LeftEarBottom, RightEarBottom, LeftEye, RightEye, Nose, Neck, LeftFrontElbow, RightFrontElbow, LeftFrontKnee, RightFrontKnee, LeftFrontPaw, RightFrontPaw, LeftBackElbow, RightBackElbow, LeftBackKnee, RightBackKnee, LeftBackPaw, RightBackPaw, TailTop, TailMiddle, TailBottom/*</value_list>*/};
    
    /*<name>*/VNAnimalBodyPoseObservationJointName/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/VNAnimalBodyPoseObservationJointName/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/VNAnimalBodyPoseObservationJointName/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/VNAnimalBodyPoseObservationJointName/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Vision") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointNameLeftEarTop", optional=true)
        public static native NSString LeftEarTop();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointNameRightEarTop", optional=true)
        public static native NSString RightEarTop();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointNameLeftEarMiddle", optional=true)
        public static native NSString LeftEarMiddle();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointNameRightEarMiddle", optional=true)
        public static native NSString RightEarMiddle();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointNameLeftEarBottom", optional=true)
        public static native NSString LeftEarBottom();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointNameRightEarBottom", optional=true)
        public static native NSString RightEarBottom();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointNameLeftEye", optional=true)
        public static native NSString LeftEye();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointNameRightEye", optional=true)
        public static native NSString RightEye();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointNameNose", optional=true)
        public static native NSString Nose();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointNameNeck", optional=true)
        public static native NSString Neck();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointNameLeftFrontElbow", optional=true)
        public static native NSString LeftFrontElbow();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointNameRightFrontElbow", optional=true)
        public static native NSString RightFrontElbow();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointNameLeftFrontKnee", optional=true)
        public static native NSString LeftFrontKnee();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointNameRightFrontKnee", optional=true)
        public static native NSString RightFrontKnee();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointNameLeftFrontPaw", optional=true)
        public static native NSString LeftFrontPaw();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointNameRightFrontPaw", optional=true)
        public static native NSString RightFrontPaw();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointNameLeftBackElbow", optional=true)
        public static native NSString LeftBackElbow();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointNameRightBackElbow", optional=true)
        public static native NSString RightBackElbow();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointNameLeftBackKnee", optional=true)
        public static native NSString LeftBackKnee();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointNameRightBackKnee", optional=true)
        public static native NSString RightBackKnee();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointNameLeftBackPaw", optional=true)
        public static native NSString LeftBackPaw();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointNameRightBackPaw", optional=true)
        public static native NSString RightBackPaw();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointNameTailTop", optional=true)
        public static native NSString TailTop();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointNameTailMiddle", optional=true)
        public static native NSString TailMiddle();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointNameTailBottom", optional=true)
        public static native NSString TailBottom();
        /*</values>*/
    }
}
