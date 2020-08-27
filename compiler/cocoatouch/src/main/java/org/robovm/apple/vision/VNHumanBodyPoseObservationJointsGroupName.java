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
@Marshaler(/*<name>*/VNHumanBodyPoseObservationJointsGroupName/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNHumanBodyPoseObservationJointsGroupName/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/VNHumanBodyPoseObservationJointsGroupName/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static VNHumanBodyPoseObservationJointsGroupName toObject(Class<VNHumanBodyPoseObservationJointsGroupName> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return VNHumanBodyPoseObservationJointsGroupName.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(VNHumanBodyPoseObservationJointsGroupName o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<VNHumanBodyPoseObservationJointsGroupName> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<VNHumanBodyPoseObservationJointsGroupName> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(VNHumanBodyPoseObservationJointsGroupName.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<VNHumanBodyPoseObservationJointsGroupName> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (VNHumanBodyPoseObservationJointsGroupName o : l) {
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
    public static final VNHumanBodyPoseObservationJointsGroupName Face = new VNHumanBodyPoseObservationJointsGroupName("Face");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanBodyPoseObservationJointsGroupName Torso = new VNHumanBodyPoseObservationJointsGroupName("Torso");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanBodyPoseObservationJointsGroupName LeftArm = new VNHumanBodyPoseObservationJointsGroupName("LeftArm");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanBodyPoseObservationJointsGroupName RightArm = new VNHumanBodyPoseObservationJointsGroupName("RightArm");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanBodyPoseObservationJointsGroupName LeftLeg = new VNHumanBodyPoseObservationJointsGroupName("LeftLeg");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanBodyPoseObservationJointsGroupName RightLeg = new VNHumanBodyPoseObservationJointsGroupName("RightLeg");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanBodyPoseObservationJointsGroupName All = new VNHumanBodyPoseObservationJointsGroupName("All");
    /*</constants>*/
    
    private static /*<name>*/VNHumanBodyPoseObservationJointsGroupName/*</name>*/[] values = new /*<name>*/VNHumanBodyPoseObservationJointsGroupName/*</name>*/[] {/*<value_list>*/Face, Torso, LeftArm, RightArm, LeftLeg, RightLeg, All/*</value_list>*/};
    
    /*<name>*/VNHumanBodyPoseObservationJointsGroupName/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/VNHumanBodyPoseObservationJointsGroupName/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/VNHumanBodyPoseObservationJointsGroupName/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/VNHumanBodyPoseObservationJointsGroupName/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Vision") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointsGroupNameFace", optional=true)
        public static native NSString Face();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointsGroupNameTorso", optional=true)
        public static native NSString Torso();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointsGroupNameLeftArm", optional=true)
        public static native NSString LeftArm();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointsGroupNameRightArm", optional=true)
        public static native NSString RightArm();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointsGroupNameLeftLeg", optional=true)
        public static native NSString LeftLeg();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointsGroupNameRightLeg", optional=true)
        public static native NSString RightLeg();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanBodyPoseObservationJointsGroupNameAll", optional=true)
        public static native NSString All();
        /*</values>*/
    }
}
