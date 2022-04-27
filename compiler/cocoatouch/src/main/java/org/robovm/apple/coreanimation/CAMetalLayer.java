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
package org.robovm.apple.coreanimation;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("QuartzCore") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CAMetalLayer/*</name>*/ 
    extends /*<extends>*/CALayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CAMetalLayerPtr extends Ptr<CAMetalLayer, CAMetalLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CAMetalLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CAMetalLayer() {}
    protected CAMetalLayer(Handle h, long handle) { super(h, handle); }
    protected CAMetalLayer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLayer:")
    public CAMetalLayer(CALayer layer) { super(layer); }
    /*</constructors>*/
    /*<properties>*/
    @WeaklyLinked
    @Property(selector = "device")
    public native MTLDevice getDevice();
    @WeaklyLinked
    @Property(selector = "setDevice:")
    public native void setDevice(MTLDevice v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "preferredDevice")
    public native MTLDevice getPreferredDevice();
    @WeaklyLinked
    @Property(selector = "pixelFormat")
    public native MTLPixelFormat getPixelFormat();
    @WeaklyLinked
    @Property(selector = "setPixelFormat:")
    public native void setPixelFormat(MTLPixelFormat v);
    @Property(selector = "framebufferOnly")
    public native boolean isFramebufferOnly();
    @Property(selector = "setFramebufferOnly:")
    public native void setFramebufferOnly(boolean v);
    @Property(selector = "drawableSize")
    public native @ByVal CGSize getDrawableSize();
    @Property(selector = "setDrawableSize:")
    public native void setDrawableSize(@ByVal CGSize v);
    /**
     * @since Available in iOS 11.2 and later.
     */
    @Property(selector = "maximumDrawableCount")
    public native @MachineSizedUInt long getMaximumDrawableCount();
    /**
     * @since Available in iOS 11.2 and later.
     */
    @Property(selector = "setMaximumDrawableCount:")
    public native void setMaximumDrawableCount(@MachineSizedUInt long v);
    @Property(selector = "presentsWithTransaction")
    public native boolean presentsWithTransaction();
    @Property(selector = "setPresentsWithTransaction:")
    public native void setPresentsWithTransaction(boolean v);
    @Property(selector = "colorspace")
    public native CGColorSpace getColorspace();
    @Property(selector = "setColorspace:")
    public native void setColorspace(CGColorSpace v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "allowsNextDrawableTimeout")
    public native boolean allowsNextDrawableTimeout();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setAllowsNextDrawableTimeout:")
    public native void setAllowsNextDrawableTimeout(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "nextDrawable")
    public native CAMetalDrawable nextDrawable();
    @Method(selector = "defaultValueForKey:")
    public static native NSObject getDefaultValue(String key);
    @Method(selector = "needsDisplayForKey:")
    public static native boolean needsDisplay(String key);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "cornerCurveExpansionFactor:")
    public static native @MachineSizedFloat double cornerCurveExpansionFactor(CALayerCornerCurve curve);
    @Method(selector = "defaultActionForKey:")
    public static native CAAction getDefaultAction(String event);
    /*</methods>*/
}
