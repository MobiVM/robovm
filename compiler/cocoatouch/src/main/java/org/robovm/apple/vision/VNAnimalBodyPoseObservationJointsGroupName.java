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
@Marshaler(/*<name>*/VNAnimalBodyPoseObservationJointsGroupName/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNAnimalBodyPoseObservationJointsGroupName/*</name>*/ 
    extends /*<extends>*/VNRecognizedPointGroupKey/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/VNAnimalBodyPoseObservationJointsGroupName/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static VNAnimalBodyPoseObservationJointsGroupName toObject(Class<VNAnimalBodyPoseObservationJointsGroupName> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return VNAnimalBodyPoseObservationJointsGroupName.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(VNAnimalBodyPoseObservationJointsGroupName o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<VNAnimalBodyPoseObservationJointsGroupName> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<VNAnimalBodyPoseObservationJointsGroupName> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(VNAnimalBodyPoseObservationJointsGroupName.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<VNAnimalBodyPoseObservationJointsGroupName> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (VNAnimalBodyPoseObservationJointsGroupName o : l) {
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
    public static final VNAnimalBodyPoseObservationJointsGroupName Head = new VNAnimalBodyPoseObservationJointsGroupName("Head");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointsGroupName Trunk = new VNAnimalBodyPoseObservationJointsGroupName("Trunk");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointsGroupName Forelegs = new VNAnimalBodyPoseObservationJointsGroupName("Forelegs");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointsGroupName Hindlegs = new VNAnimalBodyPoseObservationJointsGroupName("Hindlegs");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointsGroupName Tail = new VNAnimalBodyPoseObservationJointsGroupName("Tail");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final VNAnimalBodyPoseObservationJointsGroupName All = new VNAnimalBodyPoseObservationJointsGroupName("All");
    /*</constants>*/
    
    private static /*<name>*/VNAnimalBodyPoseObservationJointsGroupName/*</name>*/[] values = new /*<name>*/VNAnimalBodyPoseObservationJointsGroupName/*</name>*/[] {/*<value_list>*/Head, Trunk, Forelegs, Hindlegs, Tail, All/*</value_list>*/};
    
    /*<name>*/VNAnimalBodyPoseObservationJointsGroupName/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/VNAnimalBodyPoseObservationJointsGroupName/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/VNAnimalBodyPoseObservationJointsGroupName/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/VNAnimalBodyPoseObservationJointsGroupName/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Vision") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointsGroupNameHead", optional=true)
        public static native NSString Head();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointsGroupNameTrunk", optional=true)
        public static native NSString Trunk();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointsGroupNameForelegs", optional=true)
        public static native NSString Forelegs();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointsGroupNameHindlegs", optional=true)
        public static native NSString Hindlegs();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointsGroupNameTail", optional=true)
        public static native NSString Tail();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="VNAnimalBodyPoseObservationJointsGroupNameAll", optional=true)
        public static native NSString All();
        /*</values>*/
    }
}
