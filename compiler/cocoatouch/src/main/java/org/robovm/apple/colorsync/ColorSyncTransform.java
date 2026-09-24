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
package org.robovm.apple.colorsync;

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
import org.robovm.apple.corefoundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("ColorSync")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ColorSyncTransform/*</name>*/ 
    extends /*<extends>*/NativeObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ColorSyncTransformPtr extends Ptr<ColorSyncTransform, ColorSyncTransformPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(ColorSyncTransform.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ColorSyncTransform() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncTransformGetTypeID", optional=true)
    public static native @MachineSizedUInt long getTypeID();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncTransformCreate", optional=true)
    public static native ColorSyncTransform create(CFArray profileSequence, CFDictionary options);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncTransformCopyProperty", optional=true)
    public native CFType copyProperty(CFType key, CFDictionary options);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncTransformSetProperty", optional=true)
    public native void setProperty(CFType key, CFType property);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncTransformGetProfileSequence", optional=true)
    public native CFArray getProfileSequence();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncTransformConvert", optional=true)
    public native boolean convert(@MachineSizedUInt long width, @MachineSizedUInt long height, VoidPtr dst, ColorSyncDataDepth dstDepth, int dstLayout, @MachineSizedUInt long dstBytesPerRow, VoidPtr src, ColorSyncDataDepth srcDepth, int srcLayout, @MachineSizedUInt long srcBytesPerRow, CFDictionary options);
    /*</methods>*/
}
