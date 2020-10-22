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
package org.robovm.apple.metal;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/MTLCommonCounter/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLCommonCounter/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/MTLCommonCounter/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static MTLCommonCounter toObject(Class<MTLCommonCounter> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return MTLCommonCounter.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(MTLCommonCounter o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<MTLCommonCounter> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<MTLCommonCounter> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(MTLCommonCounter.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<MTLCommonCounter> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (MTLCommonCounter o : l) {
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
    public static final MTLCommonCounter Timestamp = new MTLCommonCounter("Timestamp");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final MTLCommonCounter TessellationInputPatches = new MTLCommonCounter("TessellationInputPatches");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final MTLCommonCounter VertexInvocations = new MTLCommonCounter("VertexInvocations");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final MTLCommonCounter PostTessellationVertexInvocations = new MTLCommonCounter("PostTessellationVertexInvocations");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final MTLCommonCounter ClipperInvocations = new MTLCommonCounter("ClipperInvocations");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final MTLCommonCounter ClipperPrimitivesOut = new MTLCommonCounter("ClipperPrimitivesOut");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final MTLCommonCounter FragmentInvocations = new MTLCommonCounter("FragmentInvocations");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final MTLCommonCounter FragmentsPassed = new MTLCommonCounter("FragmentsPassed");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final MTLCommonCounter ComputeKernelInvocations = new MTLCommonCounter("ComputeKernelInvocations");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final MTLCommonCounter TotalCycles = new MTLCommonCounter("TotalCycles");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final MTLCommonCounter VertexCycles = new MTLCommonCounter("VertexCycles");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final MTLCommonCounter TessellationCycles = new MTLCommonCounter("TessellationCycles");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final MTLCommonCounter PostTessellationVertexCycles = new MTLCommonCounter("PostTessellationVertexCycles");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final MTLCommonCounter FragmentCycles = new MTLCommonCounter("FragmentCycles");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final MTLCommonCounter RenderTargetWriteCycles = new MTLCommonCounter("RenderTargetWriteCycles");
    /*</constants>*/
    
    private static /*<name>*/MTLCommonCounter/*</name>*/[] values = new /*<name>*/MTLCommonCounter/*</name>*/[] {/*<value_list>*/Timestamp, TessellationInputPatches, VertexInvocations, PostTessellationVertexInvocations, ClipperInvocations, ClipperPrimitivesOut, FragmentInvocations, FragmentsPassed, ComputeKernelInvocations, TotalCycles, VertexCycles, TessellationCycles, PostTessellationVertexCycles, FragmentCycles, RenderTargetWriteCycles/*</value_list>*/};
    
    /*<name>*/MTLCommonCounter/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/MTLCommonCounter/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/MTLCommonCounter/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/MTLCommonCounter/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Metal") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="MTLCommonCounterTimestamp", optional=true)
        public static native NSString Timestamp();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="MTLCommonCounterTessellationInputPatches", optional=true)
        public static native NSString TessellationInputPatches();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="MTLCommonCounterVertexInvocations", optional=true)
        public static native NSString VertexInvocations();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="MTLCommonCounterPostTessellationVertexInvocations", optional=true)
        public static native NSString PostTessellationVertexInvocations();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="MTLCommonCounterClipperInvocations", optional=true)
        public static native NSString ClipperInvocations();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="MTLCommonCounterClipperPrimitivesOut", optional=true)
        public static native NSString ClipperPrimitivesOut();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="MTLCommonCounterFragmentInvocations", optional=true)
        public static native NSString FragmentInvocations();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="MTLCommonCounterFragmentsPassed", optional=true)
        public static native NSString FragmentsPassed();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="MTLCommonCounterComputeKernelInvocations", optional=true)
        public static native NSString ComputeKernelInvocations();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="MTLCommonCounterTotalCycles", optional=true)
        public static native NSString TotalCycles();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="MTLCommonCounterVertexCycles", optional=true)
        public static native NSString VertexCycles();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="MTLCommonCounterTessellationCycles", optional=true)
        public static native NSString TessellationCycles();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="MTLCommonCounterPostTessellationVertexCycles", optional=true)
        public static native NSString PostTessellationVertexCycles();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="MTLCommonCounterFragmentCycles", optional=true)
        public static native NSString FragmentCycles();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="MTLCommonCounterRenderTargetWriteCycles", optional=true)
        public static native NSString RenderTargetWriteCycles();
        /*</values>*/
    }
}
