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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPListItem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements CPSelectableListItem/*</implements>*/ {

    /*<ptr>*/public static class CPListItemPtr extends Ptr<CPListItem, CPListItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPListItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CPListItem() {}
    protected CPListItem(Handle h, long handle) { super(h, handle); }
    protected CPListItem(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithText:detailText:image:accessoryImage:accessoryType:")
    public CPListItem(String text, String detailText, UIImage image, UIImage accessoryImage, CPListItemAccessoryType accessoryType) { super((SkipInit) null); initObject(init(text, detailText, image, accessoryImage, accessoryType)); }
    @Method(selector = "initWithText:detailText:image:")
    public CPListItem(String text, String detailText, UIImage image) { super((SkipInit) null); initObject(init(text, detailText, image)); }
    @Method(selector = "initWithText:detailText:")
    public CPListItem(String text, String detailText) { super((SkipInit) null); initObject(init(text, detailText)); }
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use initWithText:detailText:image:accessoryImage:accessoryType:
     */
    @Deprecated
    @Method(selector = "initWithText:detailText:image:showsDisclosureIndicator:")
    public CPListItem(String text, String detailText, UIImage image, boolean showsDisclosureIndicator) { super((SkipInit) null); initObject(init(text, detailText, image, showsDisclosureIndicator)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "accessoryType")
    public native CPListItemAccessoryType getAccessoryType();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setAccessoryType:")
    public native void setAccessoryType(CPListItemAccessoryType v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "isExplicitContent")
    public native boolean isExplicitContent();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setExplicitContent:")
    public native void setExplicitContent(boolean v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "playbackProgress")
    public native @MachineSizedFloat double getPlaybackProgress();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setPlaybackProgress:")
    public native void setPlaybackProgress(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "isPlaying")
    public native boolean isPlaying();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setPlaying:")
    public native void setPlaying(boolean v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "playingIndicatorLocation")
    public native CPListItemPlayingIndicatorLocation getPlayingIndicatorLocation();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setPlayingIndicatorLocation:")
    public native void setPlayingIndicatorLocation(CPListItemPlayingIndicatorLocation v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "maximumImageSize")
    public static native @ByVal CGSize getMaximumImageSize();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "handler")
    public native @Block("(,@Block)") VoidBlock2<CPSelectableListItem, Runnable> getHandler();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setHandler:")
    public native void setHandler(@Block("(,@Block)") VoidBlock2<CPSelectableListItem, Runnable> v);
    @Property(selector = "text")
    public native String getText();
    @Property(selector = "setText:")
    public native void setText(String v);
    @Property(selector = "userInfo")
    public native NSObject getUserInfo();
    @Property(selector = "setUserInfo:")
    public native void setUserInfo(NSObject v);
    @Property(selector = "detailText")
    public native String getDetailText();
    @Property(selector = "setDetailText:")
    public native void setDetailText(String v);
    @Property(selector = "image")
    public native UIImage getImage();
    @Property(selector = "setImage:")
    public native void setImage(UIImage v);
    @Property(selector = "accessoryImage")
    public native UIImage getAccessoryImage();
    @Property(selector = "setAccessoryImage:")
    public native void setAccessoryImage(UIImage v);
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use CPListItemAccessoryType
     */
    @Deprecated
    @Property(selector = "showsDisclosureIndicator")
    public native boolean showsDisclosureIndicator();
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use -explicitContent
     */
    @Deprecated
    @Property(selector = "showsExplicitLabel")
    public native boolean showsExplicitLabel();
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use -explicitContent
     */
    @Deprecated
    @Property(selector = "setShowsExplicitLabel:")
    public native void setShowsExplicitLabel(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithText:detailText:image:accessoryImage:accessoryType:")
    protected native @Pointer long init(String text, String detailText, UIImage image, UIImage accessoryImage, CPListItemAccessoryType accessoryType);
    @Method(selector = "initWithText:detailText:image:")
    protected native @Pointer long init(String text, String detailText, UIImage image);
    @Method(selector = "initWithText:detailText:")
    protected native @Pointer long init(String text, String detailText);
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use initWithText:detailText:image:accessoryImage:accessoryType:
     */
    @Deprecated
    @Method(selector = "initWithText:detailText:image:showsDisclosureIndicator:")
    protected native @Pointer long init(String text, String detailText, UIImage image, boolean showsDisclosureIndicator);
    /*</methods>*/
}
