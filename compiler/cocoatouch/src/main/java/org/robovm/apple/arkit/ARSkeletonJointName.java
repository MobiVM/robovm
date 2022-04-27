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
package org.robovm.apple.arkit;

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
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("ARKit") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/ARSkeletonJointName/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ARSkeletonJointName/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/ARSkeletonJointName/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static ARSkeletonJointName toObject(Class<ARSkeletonJointName> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return ARSkeletonJointName.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(ARSkeletonJointName o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<ARSkeletonJointName> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<ARSkeletonJointName> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(ARSkeletonJointName.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<ARSkeletonJointName> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (ARSkeletonJointName o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final ARSkeletonJointName Root = new ARSkeletonJointName("Root");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final ARSkeletonJointName Head = new ARSkeletonJointName("Head");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final ARSkeletonJointName LeftHand = new ARSkeletonJointName("LeftHand");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final ARSkeletonJointName RightHand = new ARSkeletonJointName("RightHand");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final ARSkeletonJointName LeftFoot = new ARSkeletonJointName("LeftFoot");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final ARSkeletonJointName RightFoot = new ARSkeletonJointName("RightFoot");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final ARSkeletonJointName LeftShoulder = new ARSkeletonJointName("LeftShoulder");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final ARSkeletonJointName RightShoulder = new ARSkeletonJointName("RightShoulder");
    /*</constants>*/
    
    private static /*<name>*/ARSkeletonJointName/*</name>*/[] values = new /*<name>*/ARSkeletonJointName/*</name>*/[] {/*<value_list>*/Root, Head, LeftHand, RightHand, LeftFoot, RightFoot, LeftShoulder, RightShoulder/*</value_list>*/};
    
    /*<name>*/ARSkeletonJointName/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/ARSkeletonJointName/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/ARSkeletonJointName/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/ARSkeletonJointName/*</name>*/.class.getName());
    }
    
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="ARSkeletonJointNameForRecognizedPointKey", optional=true)
    public static native ARSkeletonJointName create(String recognizedPointKey);
    /*</methods>*/
    
    /*<annotations>*/@Library("ARKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="ARSkeletonJointNameRoot", optional=true)
        public static native NSString Root();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="ARSkeletonJointNameHead", optional=true)
        public static native NSString Head();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="ARSkeletonJointNameLeftHand", optional=true)
        public static native NSString LeftHand();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="ARSkeletonJointNameRightHand", optional=true)
        public static native NSString RightHand();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="ARSkeletonJointNameLeftFoot", optional=true)
        public static native NSString LeftFoot();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="ARSkeletonJointNameRightFoot", optional=true)
        public static native NSString RightFoot();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="ARSkeletonJointNameLeftShoulder", optional=true)
        public static native NSString LeftShoulder();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="ARSkeletonJointNameRightShoulder", optional=true)
        public static native NSString RightShoulder();
        /*</values>*/
    }
}
