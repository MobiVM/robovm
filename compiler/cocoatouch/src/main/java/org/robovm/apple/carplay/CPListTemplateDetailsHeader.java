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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPListTemplateDetailsHeader/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding, CPPlayableItem/*</implements>*/ {

    /*<ptr>*/public static class CPListTemplateDetailsHeaderPtr extends Ptr<CPListTemplateDetailsHeader, CPListTemplateDetailsHeaderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPListTemplateDetailsHeader.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CPListTemplateDetailsHeader() {}
    protected CPListTemplateDetailsHeader(Handle h, long handle) { super(h, handle); }
    protected CPListTemplateDetailsHeader(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Method(selector = "initWithThumbnail:title:subtitle:actionButtons:")
    public CPListTemplateDetailsHeader(CPThumbnailImage thumbnail, String title, String subtitle, NSArray<CPButton> actionButton) { super((SkipInit) null); initObject(init(thumbnail, title, subtitle, actionButton)); }
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Method(selector = "initWithThumbnail:title:subtitle:bodyVariants:actionButtons:")
    public CPListTemplateDetailsHeader(CPThumbnailImage thumbnail, String title, String subtitle, NSArray<NSAttributedString> bodyVariants, NSArray<CPButton> actionButtons) { super((SkipInit) null); initObject(init(thumbnail, title, subtitle, bodyVariants, actionButtons)); }
    @Method(selector = "initWithCoder:")
    public CPListTemplateDetailsHeader(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "thumbnail")
    public native CPThumbnailImage getThumbnail();
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "setThumbnail:")
    public native void setThumbnail(CPThumbnailImage v);
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "title")
    public native String getTitle();
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "subtitle")
    public native String getSubtitle();
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "setSubtitle:")
    public native void setSubtitle(String v);
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "bodyVariants")
    public native NSArray<NSAttributedString> getBodyVariants();
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "setBodyVariants:")
    public native void setBodyVariants(NSArray<NSAttributedString> v);
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "actionButtons")
    public native NSArray<CPButton> getActionButtons();
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "setActionButtons:")
    public native void setActionButtons(NSArray<CPButton> v);
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "wantsAdaptiveBackgroundStyle")
    public native boolean isAdaptiveBackgroundStyle();
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "setAdaptiveBackgroundStyle:")
    public native void setAdaptiveBackgroundStyle(boolean v);
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "maximumActionButtonCount")
    public static native @MachineSizedSInt long getMaximumActionButtonCount();
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "maximumActionButtonSize")
    public static native @ByVal CGSize getMaximumActionButtonSize();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "playbackConfiguration")
    public native CPPlaybackConfiguration getPlaybackConfiguration();
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "setPlaybackConfiguration:")
    public native void setPlaybackConfiguration(CPPlaybackConfiguration v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Method(selector = "initWithThumbnail:title:subtitle:actionButtons:")
    protected native @Pointer long init(CPThumbnailImage thumbnail, String title, String subtitle, NSArray<CPButton> actionButton);
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Method(selector = "initWithThumbnail:title:subtitle:bodyVariants:actionButtons:")
    protected native @Pointer long init(CPThumbnailImage thumbnail, String title, String subtitle, NSArray<NSAttributedString> bodyVariants, NSArray<CPButton> actionButtons);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
