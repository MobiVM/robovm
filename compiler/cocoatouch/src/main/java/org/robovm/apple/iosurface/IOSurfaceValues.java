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
package org.robovm.apple.iosurface;

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
/*<annotations>*/@Library("IOSurface")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IOSurfaceValues/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(IOSurfaceValues.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="kIOSurfaceAllocSize", optional=true)
    public static native CFString AllocSize();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="kIOSurfaceWidth", optional=true)
    public static native CFString Width();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="kIOSurfaceHeight", optional=true)
    public static native CFString Height();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="kIOSurfaceBytesPerRow", optional=true)
    public static native CFString BytesPerRow();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="kIOSurfaceBytesPerElement", optional=true)
    public static native CFString BytesPerElement();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="kIOSurfaceElementWidth", optional=true)
    public static native CFString ElementWidth();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="kIOSurfaceElementHeight", optional=true)
    public static native CFString ElementHeight();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="kIOSurfaceOffset", optional=true)
    public static native CFString Offset();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="kIOSurfacePlaneInfo", optional=true)
    public static native CFString PlaneInfo();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="kIOSurfacePlaneWidth", optional=true)
    public static native CFString PlaneWidth();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="kIOSurfacePlaneHeight", optional=true)
    public static native CFString PlaneHeight();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="kIOSurfacePlaneBytesPerRow", optional=true)
    public static native CFString PlaneBytesPerRow();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="kIOSurfacePlaneOffset", optional=true)
    public static native CFString PlaneOffset();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="kIOSurfacePlaneSize", optional=true)
    public static native CFString PlaneSize();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="kIOSurfacePlaneBase", optional=true)
    public static native CFString PlaneBase();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kIOSurfacePlaneBitsPerElement", optional=true)
    public static native CFString PlaneBitsPerElement();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="kIOSurfacePlaneBytesPerElement", optional=true)
    public static native CFString PlaneBytesPerElement();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="kIOSurfacePlaneElementWidth", optional=true)
    public static native CFString PlaneElementWidth();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="kIOSurfacePlaneElementHeight", optional=true)
    public static native CFString PlaneElementHeight();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="kIOSurfaceCacheMode", optional=true)
    public static native CFString CacheMode();
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    @GlobalValue(symbol="kIOSurfaceIsGlobal", optional=true)
    public static native CFString IsGlobal();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalValue(symbol="kIOSurfacePixelFormat", optional=true)
    public static native CFString PixelFormat();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kIOSurfacePixelSizeCastingAllowed", optional=true)
    public static native CFString PixelSizeCastingAllowed();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kIOSurfacePlaneComponentBitDepths", optional=true)
    public static native CFString PlaneComponentBitDepths();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kIOSurfacePlaneComponentBitOffsets", optional=true)
    public static native CFString PlaneComponentBitOffsets();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kIOSurfacePlaneComponentNames", optional=true)
    public static native CFString PlaneComponentNames();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kIOSurfacePlaneComponentTypes", optional=true)
    public static native CFString PlaneComponentTypes();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kIOSurfacePlaneComponentRanges", optional=true)
    public static native CFString PlaneComponentRanges();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kIOSurfaceSubsampling", optional=true)
    public static native CFString Subsampling();
    /*</methods>*/
}
