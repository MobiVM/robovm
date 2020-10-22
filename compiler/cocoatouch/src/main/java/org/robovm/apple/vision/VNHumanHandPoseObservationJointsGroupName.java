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
@Marshaler(/*<name>*/VNHumanHandPoseObservationJointsGroupName/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNHumanHandPoseObservationJointsGroupName/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/VNHumanHandPoseObservationJointsGroupName/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static VNHumanHandPoseObservationJointsGroupName toObject(Class<VNHumanHandPoseObservationJointsGroupName> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return VNHumanHandPoseObservationJointsGroupName.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(VNHumanHandPoseObservationJointsGroupName o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<VNHumanHandPoseObservationJointsGroupName> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<VNHumanHandPoseObservationJointsGroupName> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(VNHumanHandPoseObservationJointsGroupName.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<VNHumanHandPoseObservationJointsGroupName> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (VNHumanHandPoseObservationJointsGroupName o : l) {
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
    public static final VNHumanHandPoseObservationJointsGroupName Thumb = new VNHumanHandPoseObservationJointsGroupName("Thumb");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointsGroupName IndexFinger = new VNHumanHandPoseObservationJointsGroupName("IndexFinger");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointsGroupName MiddleFinger = new VNHumanHandPoseObservationJointsGroupName("MiddleFinger");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointsGroupName RingFinger = new VNHumanHandPoseObservationJointsGroupName("RingFinger");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointsGroupName LittleFinger = new VNHumanHandPoseObservationJointsGroupName("LittleFinger");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final VNHumanHandPoseObservationJointsGroupName All = new VNHumanHandPoseObservationJointsGroupName("All");
    /*</constants>*/
    
    private static /*<name>*/VNHumanHandPoseObservationJointsGroupName/*</name>*/[] values = new /*<name>*/VNHumanHandPoseObservationJointsGroupName/*</name>*/[] {/*<value_list>*/Thumb, IndexFinger, MiddleFinger, RingFinger, LittleFinger, All/*</value_list>*/};
    
    /*<name>*/VNHumanHandPoseObservationJointsGroupName/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/VNHumanHandPoseObservationJointsGroupName/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/VNHumanHandPoseObservationJointsGroupName/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/VNHumanHandPoseObservationJointsGroupName/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Vision") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointsGroupNameThumb", optional=true)
        public static native NSString Thumb();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointsGroupNameIndexFinger", optional=true)
        public static native NSString IndexFinger();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointsGroupNameMiddleFinger", optional=true)
        public static native NSString MiddleFinger();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointsGroupNameRingFinger", optional=true)
        public static native NSString RingFinger();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointsGroupNameLittleFinger", optional=true)
        public static native NSString LittleFinger();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="VNHumanHandPoseObservationJointsGroupNameAll", optional=true)
        public static native NSString All();
        /*</values>*/
    }
}
