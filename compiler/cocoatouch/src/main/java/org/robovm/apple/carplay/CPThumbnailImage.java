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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPThumbnailImage/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CPThumbnailImagePtr extends Ptr<CPThumbnailImage, CPThumbnailImagePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPThumbnailImage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPThumbnailImage() {}
    protected CPThumbnailImage(Handle h, long handle) { super(h, handle); }
    protected CPThumbnailImage(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Method(selector = "initWithImage:")
    public CPThumbnailImage(UIImage image) { super((SkipInit) null); initObject(init(image)); }
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Method(selector = "initWithImage:imageOverlay:sportsOverlay:")
    public CPThumbnailImage(UIImage image, CPImageOverlay imageOverlay, CPSportsOverlay sportsOverlay) { super((SkipInit) null); initObject(init(image, imageOverlay, sportsOverlay)); }
    @Method(selector = "initWithCoder:")
    public CPThumbnailImage(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "image")
    public native UIImage getImage();
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "setImage:")
    public native void setImage(UIImage v);
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "imageOverlay")
    public native CPImageOverlay getImageOverlay();
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "setImageOverlay:")
    public native void setImageOverlay(CPImageOverlay v);
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "sportsOverlay")
    public native CPSportsOverlay getSportsOverlay();
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "setSportsOverlay:")
    public native void setSportsOverlay(CPSportsOverlay v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Method(selector = "initWithImage:")
    protected native @Pointer long init(UIImage image);
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Method(selector = "initWithImage:imageOverlay:sportsOverlay:")
    protected native @Pointer long init(UIImage image, CPImageOverlay imageOverlay, CPSportsOverlay sportsOverlay);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Method(selector = "maximumImageSizeForAspectRatio:")
    public static native @ByVal CGSize maximumImageSizeForAspectRatio(@MachineSizedFloat double aspectRatio);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
