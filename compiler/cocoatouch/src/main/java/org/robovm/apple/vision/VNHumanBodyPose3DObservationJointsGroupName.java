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
@Marshaler(/*<name>*/VNHumanBodyPose3DObservationJointsGroupName/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNHumanBodyPose3DObservationJointsGroupName/*</name>*/ 
    extends /*<extends>*/VNRecognizedPointGroupKey/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/VNHumanBodyPose3DObservationJointsGroupName/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static VNHumanBodyPose3DObservationJointsGroupName toObject(Class<VNHumanBodyPose3DObservationJointsGroupName> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return VNHumanBodyPose3DObservationJointsGroupName.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(VNHumanBodyPose3DObservationJointsGroupName o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<VNHumanBodyPose3DObservationJointsGroupName> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<VNHumanBodyPose3DObservationJointsGroupName> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(VNHumanBodyPose3DObservationJointsGroupName.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<VNHumanBodyPose3DObservationJointsGroupName> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (VNHumanBodyPose3DObservationJointsGroupName o : l) {
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
    public static final VNHumanBodyPose3DObservationJointsGroupName Head = new VNHumanBodyPose3DObservationJointsGroupName("Head");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNHumanBodyPose3DObservationJointsGroupName Torso = new VNHumanBodyPose3DObservationJointsGroupName("Torso");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNHumanBodyPose3DObservationJointsGroupName LeftArm = new VNHumanBodyPose3DObservationJointsGroupName("LeftArm");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNHumanBodyPose3DObservationJointsGroupName RightArm = new VNHumanBodyPose3DObservationJointsGroupName("RightArm");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNHumanBodyPose3DObservationJointsGroupName LeftLeg = new VNHumanBodyPose3DObservationJointsGroupName("LeftLeg");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNHumanBodyPose3DObservationJointsGroupName RightLeg = new VNHumanBodyPose3DObservationJointsGroupName("RightLeg");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNHumanBodyPose3DObservationJointsGroupName All = new VNHumanBodyPose3DObservationJointsGroupName("All");
    /*</constants>*/
    
    private static /*<name>*/VNHumanBodyPose3DObservationJointsGroupName/*</name>*/[] values = new /*<name>*/VNHumanBodyPose3DObservationJointsGroupName/*</name>*/[] {/*<value_list>*/Head, Torso, LeftArm, RightArm, LeftLeg, RightLeg, All/*</value_list>*/};
    
    /*<name>*/VNHumanBodyPose3DObservationJointsGroupName/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/VNHumanBodyPose3DObservationJointsGroupName/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/VNHumanBodyPose3DObservationJointsGroupName/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/VNHumanBodyPose3DObservationJointsGroupName/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Vision") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPose3DObservationJointsGroupNameHead", optional=true)
        public static native NSString Head();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPose3DObservationJointsGroupNameTorso", optional=true)
        public static native NSString Torso();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPose3DObservationJointsGroupNameLeftArm", optional=true)
        public static native NSString LeftArm();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPose3DObservationJointsGroupNameRightArm", optional=true)
        public static native NSString RightArm();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPose3DObservationJointsGroupNameLeftLeg", optional=true)
        public static native NSString LeftLeg();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPose3DObservationJointsGroupNameRightLeg", optional=true)
        public static native NSString RightLeg();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPose3DObservationJointsGroupNameAll", optional=true)
        public static native NSString All();
        /*</values>*/
    }
}
