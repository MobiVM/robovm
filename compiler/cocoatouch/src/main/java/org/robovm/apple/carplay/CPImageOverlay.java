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
package org.robovm.apple.carplay;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.mapkit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coremedia.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPImageOverlay/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CPImageOverlayPtr extends Ptr<CPImageOverlay, CPImageOverlayPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPImageOverlay.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPImageOverlay() {}
    protected CPImageOverlay(Handle h, long handle) { super(h, handle); }
    protected CPImageOverlay(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Method(selector = "initWithImage:alignment:")
    public CPImageOverlay(UIImage image, CPImageOverlayAlignment alignment) { super((SkipInit) null); initObject(init(image, alignment)); }
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Method(selector = "initWithText:textColor:backgroundColor:alignment:")
    public CPImageOverlay(String text, UIColor textColor, UIColor backgroundColor, CPImageOverlayAlignment alignment) { super((SkipInit) null); initObject(init(text, textColor, backgroundColor, alignment)); }
    @Method(selector = "initWithCoder:")
    public CPImageOverlay(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "text")
    public native String getText();
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "textColor")
    public native UIColor getTextColor();
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "image")
    public native UIImage getImage();
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "alignment")
    public native CPImageOverlayAlignment getAlignment();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Method(selector = "initWithImage:alignment:")
    protected native @Pointer long init(UIImage image, CPImageOverlayAlignment alignment);
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Method(selector = "initWithText:textColor:backgroundColor:alignment:")
    protected native @Pointer long init(String text, UIColor textColor, UIColor backgroundColor, CPImageOverlayAlignment alignment);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
