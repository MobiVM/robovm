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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIBarButtonItem/*</name>*/
    extends /*<extends>*/UIBarItem/*</extends>*/
    /*<implements>*/implements NSCoding, UISpringLoadedInteractionSupporting/*</implements>*/ {

    /*<ptr>*/public static class UIBarButtonItemPtr extends Ptr<UIBarButtonItem, UIBarButtonItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIBarButtonItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/

    public interface OnClickListener {
        void onClick(UIBarButtonItem barButtonItem);
    }

    private static final Selector handleClick = Selector.register("handleClick");
    private static class ListenerWrapper extends NSObject {
        private final OnClickListener listener;
        private ListenerWrapper(OnClickListener listener) {
            this.listener = listener;
        }
        @Method(selector = "handleClick")
        private void handleClick(UIBarButtonItem barButtonItem) {
            listener.onClick(barButtonItem);
        }
    }

    public UIBarButtonItem(UIImage image, UIBarButtonItemStyle style) {
        this(image, style, null);
    }
    public UIBarButtonItem(UIImage image, UIBarButtonItemStyle style, OnClickListener listener) {
        super((SkipInit) null);
        if (listener != null) {
            ListenerWrapper l = new ListenerWrapper(listener);
            initObject(init(image, style, l, handleClick));
            this.addStrongRef(l);
        } else {
            initObject(init(image, style, null, null));
        }
    }
    public UIBarButtonItem(UIImage image, UIImage landscapeImagePhone, UIBarButtonItemStyle style) {
        this(image, landscapeImagePhone, style, null);
    }
    public UIBarButtonItem(UIImage image, UIImage landscapeImagePhone, UIBarButtonItemStyle style, OnClickListener listener) {
        super((SkipInit) null);
        if (listener != null) {
            ListenerWrapper l = new ListenerWrapper(listener);
            initObject(init(image, landscapeImagePhone, style, l, handleClick));
            this.addStrongRef(l);
        } else {
            initObject(init(image, landscapeImagePhone, style, null, null));
        }
    }
    public UIBarButtonItem(String title, UIBarButtonItemStyle style) {
        this(title, style, null);
    }
    public UIBarButtonItem(String title, UIBarButtonItemStyle style, OnClickListener listener) {
        super((SkipInit) null);
        if (listener != null) {
            ListenerWrapper l = new ListenerWrapper(listener);
            initObject(init(title, style, l, handleClick));
            this.addStrongRef(l);
        } else {
            initObject(init(title, style, null, null));
        }
    }
    public UIBarButtonItem(UIBarButtonSystemItem systemItem) {
        this(systemItem, (OnClickListener)null);
    }
    public UIBarButtonItem(UIBarButtonSystemItem systemItem, OnClickListener listener) {
        super((SkipInit) null);
        if (listener != null) {
            ListenerWrapper l = new ListenerWrapper(listener);
            initObject(init(systemItem, l, handleClick));
            this.addStrongRef(l);
        } else {
            initObject(init(systemItem, null, null));
        }
    }

    /*<constructors>*/
    public UIBarButtonItem() {}
    protected UIBarButtonItem(Handle h, long handle) { super(h, handle); }
    protected UIBarButtonItem(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public UIBarButtonItem(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    @Method(selector = "initWithImage:style:target:action:")
    public UIBarButtonItem(UIImage image, UIBarButtonItemStyle style, NSObject target, Selector action) { super((SkipInit) null); initObject(init(image, style, target, action)); }
    @Method(selector = "initWithImage:landscapeImagePhone:style:target:action:")
    public UIBarButtonItem(UIImage image, UIImage landscapeImagePhone, UIBarButtonItemStyle style, NSObject target, Selector action) { super((SkipInit) null); initObject(init(image, landscapeImagePhone, style, target, action)); }
    @Method(selector = "initWithTitle:style:target:action:")
    public UIBarButtonItem(String title, UIBarButtonItemStyle style, NSObject target, Selector action) { super((SkipInit) null); initObject(init(title, style, target, action)); }
    @Method(selector = "initWithBarButtonSystemItem:target:action:")
    public UIBarButtonItem(UIBarButtonSystemItem systemItem, NSObject target, Selector action) { super((SkipInit) null); initObject(init(systemItem, target, action)); }
    @Method(selector = "initWithCustomView:")
    public UIBarButtonItem(UIView customView) { super((SkipInit) null); initObject(init(customView)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithBarButtonSystemItem:primaryAction:")
    public UIBarButtonItem(UIBarButtonSystemItem systemItem, UIAction primaryAction) { super((SkipInit) null); initObject(init(systemItem, primaryAction)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithPrimaryAction:")
    public UIBarButtonItem(UIAction primaryAction) { super((SkipInit) null); initObject(init(primaryAction)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithBarButtonSystemItem:menu:")
    public UIBarButtonItem(UIBarButtonSystemItem systemItem, UIMenu menu) { super((SkipInit) null); initObject(init(systemItem, menu)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithTitle:menu:")
    public UIBarButtonItem(String title, UIMenu menu) { super((SkipInit) null); initObject(init(title, menu)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithImage:menu:")
    public UIBarButtonItem(UIImage image, UIMenu menu) { super((SkipInit) null); initObject(init(image, menu)); }
    /*</constructors>*/

    public void setOnClickListener(OnClickListener listener) {
        NSObject t = getTarget();
        if (t instanceof ListenerWrapper) {
            this.removeStrongRef(t);
        }
        ListenerWrapper l = new ListenerWrapper(listener);
        setAction(handleClick);
        setTarget(l);
        this.addStrongRef(l);
    }

    /*<properties>*/
    @Property(selector = "style")
    public native UIBarButtonItemStyle getStyle();
    @Property(selector = "setStyle:")
    public native void setStyle(UIBarButtonItemStyle v);
    @Property(selector = "width")
    public native @MachineSizedFloat double getWidth();
    @Property(selector = "setWidth:")
    public native void setWidth(@MachineSizedFloat double v);
    @Property(selector = "possibleTitles")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSSet.AsStringSetMarshaler.class) Set<String> getPossibleTitles();
    @Property(selector = "setPossibleTitles:")
    public native void setPossibleTitles(@org.robovm.rt.bro.annotation.Marshaler(NSSet.AsStringSetMarshaler.class) Set<String> v);
    @Property(selector = "customView")
    public native UIView getCustomView();
    @Property(selector = "setCustomView:")
    public native void setCustomView(UIView v);
    @Property(selector = "action")
    public native Selector getAction();
    @Property(selector = "setAction:", strongRef = true)
    public native void setAction(Selector v);
    @Property(selector = "target")
    public native NSObject getTarget();
    @Property(selector = "setTarget:")
    public native void setTarget(NSObject v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "primaryAction")
    public native UIAction getPrimaryAction();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setPrimaryAction:")
    public native void setPrimaryAction(UIAction v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "menu")
    public native UIMenu getMenu();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setMenu:")
    public native void setMenu(UIMenu v);
    @Property(selector = "tintColor")
    public native UIColor getTintColor();
    @Property(selector = "setTintColor:")
    public native void setTintColor(UIColor v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "buttonGroup")
    public native UIBarButtonItemGroup getButtonGroup();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isSpringLoaded")
    public native boolean isSpringLoaded();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSpringLoaded:")
    public native void setSpringLoaded(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "initWithImage:style:target:action:")
    protected native @Pointer long init(UIImage image, UIBarButtonItemStyle style, NSObject target, Selector action);
    @Method(selector = "initWithImage:landscapeImagePhone:style:target:action:")
    protected native @Pointer long init(UIImage image, UIImage landscapeImagePhone, UIBarButtonItemStyle style, NSObject target, Selector action);
    @Method(selector = "initWithTitle:style:target:action:")
    protected native @Pointer long init(String title, UIBarButtonItemStyle style, NSObject target, Selector action);
    @Method(selector = "initWithBarButtonSystemItem:target:action:")
    protected native @Pointer long init(UIBarButtonSystemItem systemItem, NSObject target, Selector action);
    @Method(selector = "initWithCustomView:")
    protected native @Pointer long init(UIView customView);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithBarButtonSystemItem:primaryAction:")
    protected native @Pointer long init(UIBarButtonSystemItem systemItem, UIAction primaryAction);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithPrimaryAction:")
    protected native @Pointer long init(UIAction primaryAction);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithBarButtonSystemItem:menu:")
    protected native @Pointer long init(UIBarButtonSystemItem systemItem, UIMenu menu);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithTitle:menu:")
    protected native @Pointer long init(String title, UIMenu menu);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithImage:menu:")
    protected native @Pointer long init(UIImage image, UIMenu menu);
    @Method(selector = "setBackgroundImage:forState:barMetrics:")
    public native void setBackgroundImage(UIImage backgroundImage, UIControlState state, UIBarMetrics barMetrics);
    @Method(selector = "backgroundImageForState:barMetrics:")
    public native UIImage getBackgroundImage(UIControlState state, UIBarMetrics barMetrics);
    @Method(selector = "setBackgroundImage:forState:style:barMetrics:")
    public native void setBackgroundImage(UIImage backgroundImage, UIControlState state, UIBarButtonItemStyle style, UIBarMetrics barMetrics);
    @Method(selector = "backgroundImageForState:style:barMetrics:")
    public native UIImage getBackgroundImage(UIControlState state, UIBarButtonItemStyle style, UIBarMetrics barMetrics);
    @Method(selector = "setBackgroundVerticalPositionAdjustment:forBarMetrics:")
    public native void setBackgroundVerticalPositionAdjustment(@MachineSizedFloat double adjustment, UIBarMetrics barMetrics);
    @Method(selector = "backgroundVerticalPositionAdjustmentForBarMetrics:")
    public native @MachineSizedFloat double getBackgroundVerticalPositionAdjustment(UIBarMetrics barMetrics);
    @Method(selector = "setTitlePositionAdjustment:forBarMetrics:")
    public native void setTitlePositionAdjustment(@ByVal UIOffset adjustment, UIBarMetrics barMetrics);
    @Method(selector = "titlePositionAdjustmentForBarMetrics:")
    public native @ByVal UIOffset getTitlePositionAdjustment(UIBarMetrics barMetrics);
    @Method(selector = "setBackButtonBackgroundImage:forState:barMetrics:")
    public native void setBackButtonBackgroundImage(UIImage backgroundImage, UIControlState state, UIBarMetrics barMetrics);
    @Method(selector = "backButtonBackgroundImageForState:barMetrics:")
    public native UIImage getBackButtonBackgroundImage(UIControlState state, UIBarMetrics barMetrics);
    @Method(selector = "setBackButtonTitlePositionAdjustment:forBarMetrics:")
    public native void setBackButtonTitlePositionAdjustment(@ByVal UIOffset adjustment, UIBarMetrics barMetrics);
    @Method(selector = "backButtonTitlePositionAdjustmentForBarMetrics:")
    public native @ByVal UIOffset getBackButtonTitlePositionAdjustment(UIBarMetrics barMetrics);
    @Method(selector = "setBackButtonBackgroundVerticalPositionAdjustment:forBarMetrics:")
    public native void setBackButtonBackgroundVerticalPositionAdjustment(@MachineSizedFloat double adjustment, UIBarMetrics barMetrics);
    @Method(selector = "backButtonBackgroundVerticalPositionAdjustmentForBarMetrics:")
    public native @MachineSizedFloat double getBackButtonBackgroundVerticalPositionAdjustment(UIBarMetrics barMetrics);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "fixedSpaceItemOfWidth:")
    public static native UIBarButtonItem fixedSpaceItemOfWidth(@MachineSizedFloat double width);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "flexibleSpaceItem")
    public static native UIBarButtonItem flexibleSpaceItem();
    /*</methods>*/
}
