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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.symbols.*;
/*</imports>*/
import org.robovm.apple.corefoundation.CFDictionary;
import org.robovm.apple.coremedia.CMTextMarkupAttributes;

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIBarItem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding, UIAppearanceContainer/*</implements>*/ {

    /*<ptr>*/public static class UIBarItemPtr extends Ptr<UIBarItem, UIBarItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIBarItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIBarItem() {}
    protected UIBarItem(Handle h, long handle) { super(h, handle); }
    protected UIBarItem(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public UIBarItem(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "image")
    public native UIImage getImage();
    @Property(selector = "setImage:")
    public native void setImage(UIImage v);
    @Property(selector = "landscapeImagePhone")
    public native UIImage getLandscapeImagePhone();
    @Property(selector = "setLandscapeImagePhone:")
    public native void setLandscapeImagePhone(UIImage v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "largeContentSizeImage")
    public native UIImage getLargeContentSizeImage();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setLargeContentSizeImage:")
    public native void setLargeContentSizeImage(UIImage v);
    @Property(selector = "imageInsets")
    public native @ByVal UIEdgeInsets getImageInsets();
    @Property(selector = "setImageInsets:")
    public native void setImageInsets(@ByVal UIEdgeInsets v);
    @Property(selector = "landscapeImagePhoneInsets")
    public native @ByVal UIEdgeInsets getLandscapeImagePhoneInsets();
    @Property(selector = "setLandscapeImagePhoneInsets:")
    public native void setLandscapeImagePhoneInsets(@ByVal UIEdgeInsets v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "largeContentSizeImageInsets")
    public native @ByVal UIEdgeInsets getLargeContentSizeImageInsets();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setLargeContentSizeImageInsets:")
    public native void setLargeContentSizeImageInsets(@ByVal UIEdgeInsets v);
    @Property(selector = "tag")
    public native @MachineSizedSInt long getTag();
    @Property(selector = "setTag:")
    public native void setTag(@MachineSizedSInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /**
     * @since Available in iOS 5.0 and later.
     */
    public void setTitleTextAttributes(NSAttributedStringAttributes attributes, UIControlState state) {
        if (attributes == null) {
            setTitleTextAttributesDictionary(null, state);
        } else {
            setTitleTextAttributesDictionary(attributes.getDictionary(), state);
        }
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @WeaklyLinked
    public void setTitleTextMarkupAttributes(CMTextMarkupAttributes attributes, UIControlState state) {
        if (attributes == null) {
            setTitleTextAttributesDictionary(null, state);
        } else {
            setTitleTextAttributesDictionary(attributes.getDictionary().as(NSDictionary.class), state);
        }
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @WeaklyLinked
    public void setTitleCoreTextAttributes(CTAttributedStringAttributes attributes, UIControlState state) {
        if (attributes == null) {
            setTitleTextAttributesDictionary(null, state);
        } else {
            setTitleTextAttributesDictionary(attributes.getDictionary().as(NSDictionary.class), state);
        }
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    public NSAttributedStringAttributes getTitleTextAttributes(UIControlState state) {
        NSDictionary dict = getTitleTextAttributesDictionary(state);
        if (dict == null) return null;
        return new NSAttributedStringAttributes(dict);
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @WeaklyLinked
    public CMTextMarkupAttributes getTitleTextMarkupAttributes(UIControlState state) {
        NSDictionary dict = getTitleTextAttributesDictionary(state);
        if (dict == null) return null;
        return new CMTextMarkupAttributes(dict.as(CFDictionary.class));
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @WeaklyLinked
    public CTAttributedStringAttributes getTitleCoreTextAttributes(UIControlState state) {
        NSDictionary dict = getTitleTextAttributesDictionary(state);
        if (dict == null) return null;
        return new CTAttributedStringAttributes(dict.as(CFDictionary.class));
    }
    /*<methods>*/
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "setTitleTextAttributes:forState:")
    public native void setTitleTextAttributesDictionary(NSDictionary<NSString, ?> attributes, UIControlState state);
    @Method(selector = "titleTextAttributesForState:")
    public native NSDictionary<NSString, ?> getTitleTextAttributesDictionary(UIControlState state);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
