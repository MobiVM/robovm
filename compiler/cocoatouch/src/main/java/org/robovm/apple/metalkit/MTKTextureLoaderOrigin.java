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
package org.robovm.apple.metalkit;

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
import org.robovm.apple.metal.*;
import org.robovm.apple.modelio.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("MetalKit") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/MTKTextureLoaderOrigin/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTKTextureLoaderOrigin/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<String>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/MTKTextureLoaderOrigin/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static MTKTextureLoaderOrigin toObject(Class<MTKTextureLoaderOrigin> cls, long handle, long flags) {
            String o = (String) NSObject.Marshaler.toObject(String.class, handle, flags);
            if (o == null) {
                return null;
            }
            return MTKTextureLoaderOrigin.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(MTKTextureLoaderOrigin o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<MTKTextureLoaderOrigin> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<String> o = (NSArray<String>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<MTKTextureLoaderOrigin> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(MTKTextureLoaderOrigin.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<MTKTextureLoaderOrigin> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<String> array = new NSMutableArray<>();
            for (MTKTextureLoaderOrigin o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final MTKTextureLoaderOrigin TopLeft = new MTKTextureLoaderOrigin("TopLeft");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final MTKTextureLoaderOrigin BottomLeft = new MTKTextureLoaderOrigin("BottomLeft");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final MTKTextureLoaderOrigin FlippedVertically = new MTKTextureLoaderOrigin("FlippedVertically");
    /*</constants>*/
    
    private static /*<name>*/MTKTextureLoaderOrigin/*</name>*/[] values = new /*<name>*/MTKTextureLoaderOrigin/*</name>*/[] {/*<value_list>*/TopLeft, BottomLeft, FlippedVertically/*</value_list>*/};
    
    /*<name>*/MTKTextureLoaderOrigin/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/MTKTextureLoaderOrigin/*</name>*/ valueOf(/*<type>*/String/*</type>*/ value) {
        for (/*<name>*/MTKTextureLoaderOrigin/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/MTKTextureLoaderOrigin/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("MetalKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="MTKTextureLoaderOriginTopLeft", optional=true)
        public static native String TopLeft();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="MTKTextureLoaderOriginBottomLeft", optional=true)
        public static native String BottomLeft();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="MTKTextureLoaderOriginFlippedVertically", optional=true)
        public static native String FlippedVertically();
        /*</values>*/
    }
}
