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

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIPageControl/*</name>*/ 
    extends /*<extends>*/UIControl/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIPageControlPtr extends Ptr<UIPageControl, UIPageControlPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIPageControl.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIPageControl() {}
    protected UIPageControl(Handle h, long handle) { super(h, handle); }
    protected UIPageControl(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public UIPageControl(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public UIPageControl(NSCoder coder) { super(coder); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithFrame:primaryAction:")
    public UIPageControl(@ByVal CGRect frame, UIAction primaryAction) { super(frame, primaryAction); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "numberOfPages")
    public native @MachineSizedSInt long getNumberOfPages();
    @Property(selector = "setNumberOfPages:")
    public native void setNumberOfPages(@MachineSizedSInt long v);
    @Property(selector = "currentPage")
    public native @MachineSizedSInt long getCurrentPage();
    @Property(selector = "setCurrentPage:")
    public native void setCurrentPage(@MachineSizedSInt long v);
    @Property(selector = "hidesForSinglePage")
    public native boolean hidesForSinglePage();
    @Property(selector = "setHidesForSinglePage:")
    public native void setHidesForSinglePage(boolean v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "progress")
    public native UIPageControlProgress getProgress();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setProgress:")
    public native void setProgress(UIPageControlProgress v);
    @Property(selector = "pageIndicatorTintColor")
    public native UIColor getPageIndicatorTintColor();
    @Property(selector = "setPageIndicatorTintColor:")
    public native void setPageIndicatorTintColor(UIColor v);
    @Property(selector = "currentPageIndicatorTintColor")
    public native UIColor getCurrentPageIndicatorTintColor();
    @Property(selector = "setCurrentPageIndicatorTintColor:")
    public native void setCurrentPageIndicatorTintColor(UIColor v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "backgroundStyle")
    public native UIPageControlBackgroundStyle getBackgroundStyle();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setBackgroundStyle:")
    public native void setBackgroundStyle(UIPageControlBackgroundStyle v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "direction")
    public native UIPageControlDirection getDirection();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setDirection:")
    public native void setDirection(UIPageControlDirection v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "interactionState")
    public native UIPageControlInteractionState getInteractionState();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "allowsContinuousInteraction")
    public native boolean allowsContinuousInteraction();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setAllowsContinuousInteraction:")
    public native void setAllowsContinuousInteraction(boolean v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "preferredIndicatorImage")
    public native UIImage getPreferredIndicatorImage();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setPreferredIndicatorImage:")
    public native void setPreferredIndicatorImage(UIImage v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "preferredCurrentPageIndicatorImage")
    public native UIImage getPreferredCurrentPageIndicatorImage();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setPreferredCurrentPageIndicatorImage:")
    public native void setPreferredCurrentPageIndicatorImage(UIImage v);
    /**
     * @deprecated Deprecated in iOS 14.0. defersCurrentPageDisplay no longer does anything reasonable with the new interaction mode.
     */
    @Deprecated
    @Property(selector = "defersCurrentPageDisplay")
    public native boolean defersCurrentPageDisplay();
    /**
     * @deprecated Deprecated in iOS 14.0. defersCurrentPageDisplay no longer does anything reasonable with the new interaction mode.
     */
    @Deprecated
    @Property(selector = "setDefersCurrentPageDisplay:")
    public native void setDefersCurrentPageDisplay(boolean v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "indicatorImageForPage:")
    public native UIImage indicatorImageForPage(@MachineSizedSInt long page);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "setIndicatorImage:forPage:")
    public native void setIndicatorImage(UIImage image, @MachineSizedSInt long page);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "currentPageIndicatorImageForPage:")
    public native UIImage currentPageIndicatorImageForPage(@MachineSizedSInt long page);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "setCurrentPageIndicatorImage:forPage:")
    public native void setCurrentPageIndicatorImage(UIImage image, @MachineSizedSInt long page);
    @Method(selector = "sizeForNumberOfPages:")
    public native @ByVal CGSize getSizeForNumberOfPages(@MachineSizedSInt long pageCount);
    /**
     * @deprecated Deprecated in iOS 14.0. updateCurrentPageDisplay no longer does anything reasonable with the new interaction mode.
     */
    @Deprecated
    @Method(selector = "updateCurrentPageDisplay")
    public native void updateCurrentPageDisplay();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /*</methods>*/
}
