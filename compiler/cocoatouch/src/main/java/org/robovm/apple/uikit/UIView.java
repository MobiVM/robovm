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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIView/*</name>*/ 
    extends /*<extends>*/UIResponder/*</extends>*/ 
    /*<implements>*/implements NSCoding, UIAppearanceContainer, UIDynamicItem, UITraitEnvironment, UICoordinateSpace, UIFocusItem, UIFocusItemContainer, CALayerDelegate, UITraitChangeObservable, UIAccessibilityIdentification, UILargeContentViewerItem, UIPopoverPresentationControllerSourceItem/*</implements>*/ {

    /*<ptr>*/public static class UIViewPtr extends Ptr<UIView, UIViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIView() {}
    @Deprecated protected UIView(long handle) { super(handle); }
    protected UIView(Handle h, long handle) { super(h, handle); }
    protected UIView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public UIView(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithCoder:")
    public UIView(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    @Property(selector = "isUserInteractionEnabled")
    public native boolean isUserInteractionEnabled();
    @Property(selector = "setUserInteractionEnabled:")
    public native void setUserInteractionEnabled(boolean v);
    @Property(selector = "tag")
    public native @MachineSizedSInt long getTag();
    @Property(selector = "setTag:")
    public native void setTag(@MachineSizedSInt long v);
    @WeaklyLinked
    @Property(selector = "layer")
    public native CALayer getLayer();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "canBecomeFocused")
    public native boolean canBecomeFocused();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "isFocused")
    public native boolean isFocused();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "focusGroupIdentifier")
    public native String getFocusGroupIdentifier();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setFocusGroupIdentifier:")
    public native void setFocusGroupIdentifier(String v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "focusGroupPriority")
    public native @MachineSizedSInt long getFocusGroupPriority();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setFocusGroupPriority:")
    public native void setFocusGroupPriority(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "focusEffect")
    public native UIFocusEffect getFocusEffect();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setFocusEffect:")
    public native void setFocusEffect(UIFocusEffect v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "semanticContentAttribute")
    public native UISemanticContentAttribute getSemanticContentAttribute();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setSemanticContentAttribute:")
    public native void setSemanticContentAttribute(UISemanticContentAttribute v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "effectiveUserInterfaceLayoutDirection")
    public native UIUserInterfaceLayoutDirection getEffectiveUserInterfaceLayoutDirection();
    @Property(selector = "frame")
    public native @ByVal CGRect getFrame();
    @Property(selector = "setFrame:")
    public native void setFrame(@ByVal CGRect v);
    @Property(selector = "bounds")
    public native @ByVal CGRect getBounds();
    @Property(selector = "setBounds:")
    public native void setBounds(@ByVal CGRect v);
    @Property(selector = "center")
    public native @ByVal CGPoint getCenter();
    @Property(selector = "setCenter:")
    public native void setCenter(@ByVal CGPoint v);
    @Property(selector = "transform")
    public native @ByVal CGAffineTransform getTransform();
    @Property(selector = "setTransform:")
    public native void setTransform(@ByVal CGAffineTransform v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "transform3D")
    public native @ByVal CATransform3D getTransform3D();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setTransform3D:")
    public native void setTransform3D(@ByVal CATransform3D v);
    @Property(selector = "contentScaleFactor")
    public native @MachineSizedFloat double getContentScaleFactor();
    @Property(selector = "setContentScaleFactor:")
    public native void setContentScaleFactor(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "anchorPoint")
    public native @ByVal CGPoint getAnchorPoint();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setAnchorPoint:")
    public native void setAnchorPoint(@ByVal CGPoint v);
    @Property(selector = "isMultipleTouchEnabled")
    public native boolean isMultipleTouchEnabled();
    @Property(selector = "setMultipleTouchEnabled:")
    public native void setMultipleTouchEnabled(boolean v);
    @Property(selector = "isExclusiveTouch")
    public native boolean isExclusiveTouch();
    @Property(selector = "setExclusiveTouch:")
    public native void setExclusiveTouch(boolean v);
    @Property(selector = "autoresizesSubviews")
    public native boolean autoresizesSubviews();
    @Property(selector = "setAutoresizesSubviews:")
    public native void setAutoresizesSubviews(boolean v);
    @Property(selector = "autoresizingMask")
    public native UIViewAutoresizing getAutoresizingMask();
    @Property(selector = "setAutoresizingMask:")
    public native void setAutoresizingMask(UIViewAutoresizing v);
    @Property(selector = "superview")
    public native UIView getSuperview();
    @Property(selector = "subviews")
    public native NSArray<UIView> getSubviews();
    @Property(selector = "window")
    public native UIWindow getWindow();
    @Property(selector = "layoutMargins")
    public native @ByVal UIEdgeInsets getLayoutMargins();
    @Property(selector = "setLayoutMargins:")
    public native void setLayoutMargins(@ByVal UIEdgeInsets v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "directionalLayoutMargins")
    public native @ByVal NSDirectionalEdgeInsets getDirectionalLayoutMargins();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setDirectionalLayoutMargins:")
    public native void setDirectionalLayoutMargins(@ByVal NSDirectionalEdgeInsets v);
    @Property(selector = "preservesSuperviewLayoutMargins")
    public native boolean preservesSuperviewLayoutMargins();
    @Property(selector = "setPreservesSuperviewLayoutMargins:")
    public native void setPreservesSuperviewLayoutMargins(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "insetsLayoutMarginsFromSafeArea")
    public native boolean isInsetsLayoutMarginsFromSafeArea();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setInsetsLayoutMarginsFromSafeArea:")
    public native void setInsetsLayoutMarginsFromSafeArea(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "safeAreaInsets")
    public native @ByVal UIEdgeInsets getSafeAreaInsets();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "layoutMarginsGuide")
    public native UILayoutGuide getLayoutMarginsGuide();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "readableContentGuide")
    public native UILayoutGuide getReadableContentGuide();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "safeAreaLayoutGuide")
    public native UILayoutGuide getSafeAreaLayoutGuide();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "keyboardLayoutGuide")
    public native UIKeyboardLayoutGuide getKeyboardLayoutGuide();
    @Property(selector = "clipsToBounds")
    public native boolean clipsToBounds();
    @Property(selector = "setClipsToBounds:")
    public native void setClipsToBounds(boolean v);
    @Property(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    @Property(selector = "setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    @Property(selector = "alpha")
    public native @MachineSizedFloat double getAlpha();
    @Property(selector = "setAlpha:")
    public native void setAlpha(@MachineSizedFloat double v);
    @Property(selector = "isOpaque")
    public native boolean isOpaque();
    @Property(selector = "setOpaque:")
    public native void setOpaque(boolean v);
    @Property(selector = "clearsContextBeforeDrawing")
    public native boolean clearsContextBeforeDrawing();
    @Property(selector = "setClearsContextBeforeDrawing:")
    public native void setClearsContextBeforeDrawing(boolean v);
    @Property(selector = "isHidden")
    public native boolean isHidden();
    @Property(selector = "setHidden:")
    public native void setHidden(boolean v);
    @Property(selector = "contentMode")
    public native UIViewContentMode getContentMode();
    @Property(selector = "setContentMode:")
    public native void setContentMode(UIViewContentMode v);
    @Property(selector = "maskView")
    public native UIView getMaskView();
    @Property(selector = "setMaskView:")
    public native void setMaskView(UIView v);
    @Property(selector = "tintColor")
    public native UIColor getTintColor();
    @Property(selector = "setTintColor:")
    public native void setTintColor(UIColor v);
    @Property(selector = "tintAdjustmentMode")
    public native UIViewTintAdjustmentMode getTintAdjustmentMode();
    @Property(selector = "setTintAdjustmentMode:")
    public native void setTintAdjustmentMode(UIViewTintAdjustmentMode v);
    @Property(selector = "areAnimationsEnabled")
    public static native boolean areAnimationsEnabled();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "inheritedAnimationDuration")
    public static native double getInheritedAnimationDuration();
    @Property(selector = "gestureRecognizers")
    public native NSArray<UIGestureRecognizer> getGestureRecognizers();
    @Property(selector = "setGestureRecognizers:")
    public native void setGestureRecognizers(NSArray<UIGestureRecognizer> v);
    @Property(selector = "motionEffects")
    public native NSArray<UIMotionEffect> getMotionEffects();
    @Property(selector = "setMotionEffects:")
    public native void setMotionEffects(NSArray<UIMotionEffect> v);
    @Property(selector = "constraints")
    public native NSArray<NSLayoutConstraint> getConstraints();
    @Property(selector = "translatesAutoresizingMaskIntoConstraints")
    public native boolean translatesAutoresizingMaskIntoConstraints();
    @Property(selector = "setTranslatesAutoresizingMaskIntoConstraints:")
    public native void setTranslatesAutoresizingMaskIntoConstraints(boolean v);
    @Property(selector = "requiresConstraintBasedLayout")
    public static native boolean requiresConstraintBasedLayout();
    @Property(selector = "alignmentRectInsets")
    public native @ByVal UIEdgeInsets getAlignmentRectInsets();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "viewForFirstBaselineLayout")
    public native UIView getViewForFirstBaselineLayout();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "viewForLastBaselineLayout")
    public native UIView getViewForLastBaselineLayout();
    @Property(selector = "intrinsicContentSize")
    public native @ByVal CGSize getIntrinsicContentSize();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "layoutGuides")
    public native NSArray<UILayoutGuide> getLayoutGuides();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "leadingAnchor")
    public native NSLayoutXAxisAnchor getLeadingAnchor();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "trailingAnchor")
    public native NSLayoutXAxisAnchor getTrailingAnchor();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "leftAnchor")
    public native NSLayoutXAxisAnchor getLeftAnchor();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "rightAnchor")
    public native NSLayoutXAxisAnchor getRightAnchor();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "topAnchor")
    public native NSLayoutYAxisAnchor getTopAnchor();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "bottomAnchor")
    public native NSLayoutYAxisAnchor getBottomAnchor();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "widthAnchor")
    public native NSLayoutDimension getWidthAnchor();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "heightAnchor")
    public native NSLayoutDimension getHeightAnchor();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "centerXAnchor")
    public native NSLayoutXAxisAnchor getCenterXAnchor();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "centerYAnchor")
    public native NSLayoutYAxisAnchor getCenterYAnchor();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "firstBaselineAnchor")
    public native NSLayoutYAxisAnchor getFirstBaselineAnchor();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "lastBaselineAnchor")
    public native NSLayoutYAxisAnchor getLastBaselineAnchor();
    @Property(selector = "hasAmbiguousLayout")
    public native boolean hasAmbiguousLayout();
    @Property(selector = "restorationIdentifier")
    public native String getRestorationIdentifier();
    @Property(selector = "setRestorationIdentifier:")
    public native void setRestorationIdentifier(String v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "overrideUserInterfaceStyle")
    public native UIUserInterfaceStyle getOverrideUserInterfaceStyle();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setOverrideUserInterfaceStyle:")
    public native void setOverrideUserInterfaceStyle(UIUserInterfaceStyle v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "minimumContentSizeCategory")
    public native String getMinimumContentSizeCategory();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setMinimumContentSizeCategory:")
    public native void setMinimumContentSizeCategory(String v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "maximumContentSizeCategory")
    public native String getMaximumContentSizeCategory();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setMaximumContentSizeCategory:")
    public native void setMaximumContentSizeCategory(String v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "appliedContentSizeCategoryLimitsDescription")
    public native String getAppliedContentSizeCategoryLimitsDescription();
    @Property(selector = "traitOverrides")
    public native UITraitOverrides getTraitOverrides();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "interactions")
    public native NSArray<?> getInteractions();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setInteractions:")
    public native void setInteractions(NSArray<?> v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "accessibilityIgnoresInvertColors")
    public native boolean isAccessibilityIgnoresInvertColors();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setAccessibilityIgnoresInvertColors:")
    public native void setAccessibilityIgnoresInvertColors(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "showsLargeContentViewer")
    public native boolean showsLargeContentViewer();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setShowsLargeContentViewer:")
    public native void setShowsLargeContentViewer(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "largeContentTitle")
    public native String getLargeContentTitle();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setLargeContentTitle:")
    public native void setLargeContentTitle(String v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "largeContentImage")
    public native UIImage getLargeContentImage();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setLargeContentImage:")
    public native void setLargeContentImage(UIImage v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "scalesLargeContentImage")
    public native boolean isScalesLargeContentImage();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setScalesLargeContentImage:")
    public native void setScalesLargeContentImage(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "largeContentImageInsets")
    public native @ByVal UIEdgeInsets getLargeContentImageInsets();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setLargeContentImageInsets:")
    public native void setLargeContentImageInsets(@ByVal UIEdgeInsets v);
    @Property(selector = "hoverStyle")
    public native UIHoverStyle getHoverStyle();
    @Property(selector = "setHoverStyle:")
    public native void setHoverStyle(UIHoverStyle v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "collisionBoundsType")
    public native UIDynamicItemCollisionBoundsType getCollisionBoundsType();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "collisionBoundingPath")
    public native UIBezierPath getCollisionBoundingPath();
    @Property(selector = "traitCollection")
    public native UITraitCollection getTraitCollection();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "isTransparentFocusItem")
    public native boolean isTransparentFocusItem();
    @Property(selector = "preferredFocusEnvironments")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<UIFocusEnvironment> getPreferredFocusEnvironments();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "parentFocusEnvironment")
    public native UIFocusEnvironment getParentFocusEnvironment();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "focusItemContainer")
    public native UIFocusItemContainer getFocusItemContainer();
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use preferredFocusEnvironments
     */
    @Deprecated
    @Property(selector = "preferredFocusedView")
    public native UIView getPreferredFocusedView();
    @Property(selector = "coordinateSpace")
    public native UICoordinateSpace getCoordinateSpace();
    @Property(selector = "accessibilityIdentifier")
    public native String getAccessibilityIdentifier();
    @Property(selector = "setAccessibilityIdentifier:")
    public native void setAccessibilityIdentifier(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="UIViewNoIntrinsicMetric", optional=true)
    public static native @MachineSizedFloat double NoIntrinsicMetric();
    
    @Method(selector = "initWithFrame:")
    protected native @Pointer long init(@ByVal CGRect frame);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
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
    @Method(selector = "hitTest:withEvent:")
    public native UIView hitTest(@ByVal CGPoint point, UIEvent event);
    @Method(selector = "pointInside:withEvent:")
    public native boolean isPointInside(@ByVal CGPoint point, UIEvent event);
    @Method(selector = "convertPoint:toView:")
    public native @ByVal CGPoint convertPointToView(@ByVal CGPoint point, UIView view);
    @Method(selector = "convertPoint:fromView:")
    public native @ByVal CGPoint convertPointFromView(@ByVal CGPoint point, UIView view);
    @Method(selector = "convertRect:toView:")
    public native @ByVal CGRect convertRectToView(@ByVal CGRect rect, UIView view);
    @Method(selector = "convertRect:fromView:")
    public native @ByVal CGRect convertRectFromView(@ByVal CGRect rect, UIView view);
    @Method(selector = "sizeThatFits:")
    public native @ByVal CGSize getSizeThatFits(@ByVal CGSize size);
    @Method(selector = "sizeToFit")
    public native void sizeToFit();
    @Method(selector = "removeFromSuperview")
    public native void removeFromSuperview();
    @Method(selector = "insertSubview:atIndex:")
    public native void insertSubview(UIView view, @MachineSizedSInt long index);
    @Method(selector = "exchangeSubviewAtIndex:withSubviewAtIndex:")
    public native void exchangeSubview(@MachineSizedSInt long index1, @MachineSizedSInt long index2);
    @Method(selector = "addSubview:")
    public native void addSubview(UIView view);
    @Method(selector = "insertSubview:belowSubview:")
    public native void insertSubviewBelow(UIView view, UIView siblingSubview);
    @Method(selector = "insertSubview:aboveSubview:")
    public native void insertSubviewAbove(UIView view, UIView siblingSubview);
    @Method(selector = "bringSubviewToFront:")
    public native void bringSubviewToFront(UIView view);
    @Method(selector = "sendSubviewToBack:")
    public native void sendSubviewToBack(UIView view);
    @Method(selector = "didAddSubview:")
    public native void didAddSubview(UIView subview);
    @Method(selector = "willRemoveSubview:")
    public native void willRemoveSubview(UIView subview);
    @Method(selector = "willMoveToSuperview:")
    public native void willMoveToSuperview(UIView newSuperview);
    @Method(selector = "didMoveToSuperview")
    public native void didMoveToSuperview();
    @Method(selector = "willMoveToWindow:")
    public native void willMoveToWindow(UIWindow newWindow);
    @Method(selector = "didMoveToWindow")
    public native void didMoveToWindow();
    @Method(selector = "isDescendantOfView:")
    public native boolean isDescendantOf(UIView view);
    @Method(selector = "viewWithTag:")
    public native UIView getViewWithTag(@MachineSizedSInt long tag);
    @Method(selector = "setNeedsLayout")
    public native void setNeedsLayout();
    @Method(selector = "layoutIfNeeded")
    public native void layoutIfNeeded();
    @Method(selector = "layoutSubviews")
    public native void layoutSubviews();
    @Method(selector = "layoutMarginsDidChange")
    public native void layoutMarginsDidChange();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "safeAreaInsetsDidChange")
    public native void safeAreaInsetsDidChange();
    @Method(selector = "drawRect:")
    public native void draw(@ByVal CGRect rect);
    @Method(selector = "setNeedsDisplay")
    public native void setNeedsDisplay();
    @Method(selector = "setNeedsDisplayInRect:")
    public native void setNeedsDisplay(@ByVal CGRect rect);
    @Method(selector = "tintColorDidChange")
    public native void tintColorDidChange();
    @Method(selector = "setAnimationsEnabled:")
    public static native void setAnimationsEnabled(boolean enabled);
    @Method(selector = "performWithoutAnimation:")
    public static native void performWithoutAnimation(@Block Runnable actionsWithoutAnimation);
    @Method(selector = "animateWithDuration:delay:options:animations:completion:")
    public static native void animate(double duration, double delay, UIViewAnimationOptions options, @Block Runnable animations, @Block VoidBooleanBlock completion);
    @Method(selector = "animateWithDuration:animations:completion:")
    public static native void animate(double duration, @Block Runnable animations, @Block VoidBooleanBlock completion);
    @Method(selector = "animateWithDuration:animations:")
    public static native void animate(double duration, @Block Runnable animations);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "animateWithSpringDuration:bounce:initialSpringVelocity:delay:options:animations:completion:")
    public static native void animateWithSpring(double duration, @MachineSizedFloat double bounce, @MachineSizedFloat double velocity, double delay, UIViewAnimationOptions options, @Block Runnable animations, @Block VoidBooleanBlock completion);
    @Method(selector = "animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:")
    public static native void animate(double duration, double delay, @MachineSizedFloat double dampingRatio, @MachineSizedFloat double velocity, UIViewAnimationOptions options, @Block Runnable animations, @Block VoidBooleanBlock completion);
    @Method(selector = "transitionWithView:duration:options:animations:completion:")
    public static native void transition(UIView view, double duration, UIViewAnimationOptions options, @Block Runnable animations, @Block VoidBooleanBlock completion);
    @Method(selector = "transitionFromView:toView:duration:options:completion:")
    public static native void transition(UIView fromView, UIView toView, double duration, UIViewAnimationOptions options, @Block VoidBooleanBlock completion);
    @Method(selector = "performSystemAnimation:onViews:options:animations:completion:")
    public static native void performSystemAnimation(UISystemAnimation animation, NSArray<UIView> views, UIViewAnimationOptions options, @Block Runnable parallelAnimations, @Block VoidBooleanBlock completion);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimations(@MachineSizedFloat double count, boolean autoreverses, @Block Runnable animations);
    @Method(selector = "animateKeyframesWithDuration:delay:options:animations:completion:")
    public static native void animateKeyframes(double duration, double delay, UIViewKeyframeAnimationOptions options, @Block Runnable animations, @Block VoidBooleanBlock completion);
    @Method(selector = "addKeyframeWithRelativeStartTime:relativeDuration:animations:")
    public static native void addKeyframe(double frameStartTime, double frameDuration, @Block Runnable animations);
    @Method(selector = "addGestureRecognizer:")
    public native void addGestureRecognizer(UIGestureRecognizer gestureRecognizer);
    @Method(selector = "removeGestureRecognizer:")
    public native void removeGestureRecognizer(UIGestureRecognizer gestureRecognizer);
    @Method(selector = "gestureRecognizerShouldBegin:")
    public native boolean gestureRecognizerShouldBegin(UIGestureRecognizer gestureRecognizer);
    @Method(selector = "addMotionEffect:")
    public native void addMotionEffect(UIMotionEffect effect);
    @Method(selector = "removeMotionEffect:")
    public native void removeMotionEffect(UIMotionEffect effect);
    @Method(selector = "addConstraint:")
    public native void addConstraint(NSLayoutConstraint constraint);
    @Method(selector = "addConstraints:")
    public native void addConstraints(NSArray<NSLayoutConstraint> constraints);
    @Method(selector = "removeConstraint:")
    public native void removeConstraint(NSLayoutConstraint constraint);
    @Method(selector = "removeConstraints:")
    public native void removeConstraints(NSArray<NSLayoutConstraint> constraints);
    @Method(selector = "updateConstraintsIfNeeded")
    public native void updateConstraintsIfNeeded();
    @Method(selector = "updateConstraints")
    public native void updateConstraints();
    @Method(selector = "needsUpdateConstraints")
    public native boolean needsUpdateConstraints();
    @Method(selector = "setNeedsUpdateConstraints")
    public native void setNeedsUpdateConstraints();
    @Method(selector = "alignmentRectForFrame:")
    public native @ByVal CGRect getAlignmentRectForFrame(@ByVal CGRect frame);
    @Method(selector = "frameForAlignmentRect:")
    public native @ByVal CGRect getFrameForAlignmentRect(@ByVal CGRect alignmentRect);
    /**
     * @deprecated Deprecated in iOS 9.0. Override -viewForFirstBaselineLayout or -viewForLastBaselineLayout as appropriate, instead
     */
    @Deprecated
    @Method(selector = "viewForBaselineLayout")
    public native UIView getViewForBaselineLayout();
    @Method(selector = "invalidateIntrinsicContentSize")
    public native void invalidateIntrinsicContentSize();
    @Method(selector = "contentHuggingPriorityForAxis:")
    public native float getContentHuggingPriority(UILayoutConstraintAxis axis);
    @Method(selector = "setContentHuggingPriority:forAxis:")
    public native void setContentHuggingPriority(float priority, UILayoutConstraintAxis axis);
    @Method(selector = "contentCompressionResistancePriorityForAxis:")
    public native float getContentCompressionResistancePriority(UILayoutConstraintAxis axis);
    @Method(selector = "setContentCompressionResistancePriority:forAxis:")
    public native void setContentCompressionResistancePriority(float priority, UILayoutConstraintAxis axis);
    @Method(selector = "systemLayoutSizeFittingSize:")
    public native @ByVal CGSize getSystemLayoutSizeFittingSize(UILayoutFittingSize targetSize);
    @Method(selector = "systemLayoutSizeFittingSize:withHorizontalFittingPriority:verticalFittingPriority:")
    public native @ByVal CGSize getSystemLayoutSizeFittingSize(@ByVal CGSize targetSize, float horizontalFittingPriority, float verticalFittingPriority);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "addLayoutGuide:")
    public native void addLayoutGuide(UILayoutGuide layoutGuide);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "removeLayoutGuide:")
    public native void removeLayoutGuide(UILayoutGuide layoutGuide);
    @Method(selector = "constraintsAffectingLayoutForAxis:")
    public native NSArray<NSLayoutConstraint> getConstraintsAffectingLayout(UILayoutConstraintAxis axis);
    @Method(selector = "exerciseAmbiguityInLayout")
    public native void exerciseAmbiguityInLayout();
    @Method(selector = "encodeRestorableStateWithCoder:")
    public native void encodeRestorableState(NSCoder coder);
    @Method(selector = "decodeRestorableStateWithCoder:")
    public native void decodeRestorableState(NSCoder coder);
    @Method(selector = "snapshotViewAfterScreenUpdates:")
    public native UIView getSnapshot(boolean afterUpdates);
    @Method(selector = "resizableSnapshotViewFromRect:afterScreenUpdates:withCapInsets:")
    public native UIView getResizableSnapshot(@ByVal CGRect rect, boolean afterUpdates, @ByVal UIEdgeInsets capInsets);
    @Method(selector = "drawViewHierarchyInRect:afterScreenUpdates:")
    public native boolean drawViewHierarchy(@ByVal CGRect rect, boolean afterUpdates);
    /**
     * @deprecated Deprecated in iOS 13.0. Use the block-based animation API instead
     */
    @Deprecated
    @Method(selector = "beginAnimations:context:")
    public static native void beginAnimations(String animationID, VoidPtr context);
    /**
     * @deprecated Deprecated in iOS 13.0. Use the block-based animation API instead
     */
    @Deprecated
    @Method(selector = "commitAnimations")
    public static native void commitAnimations();
    /**
     * @deprecated Deprecated in iOS 13.0. Use the block-based animation API instead
     */
    @Deprecated
    @Method(selector = "setAnimationDelegate:")
    public static native void setAnimationDelegate(NSObject delegate);
    /**
     * @deprecated Deprecated in iOS 13.0. Use the block-based animation API instead
     */
    @Deprecated
    @Method(selector = "setAnimationWillStartSelector:")
    public static native void setAnimationWillStartSelector(Selector selector);
    /**
     * @deprecated Deprecated in iOS 13.0. Use the block-based animation API instead
     */
    @Deprecated
    @Method(selector = "setAnimationDidStopSelector:")
    public static native void setAnimationDidStopSelector(Selector selector);
    /**
     * @deprecated Deprecated in iOS 13.0. Use the block-based animation API instead
     */
    @Deprecated
    @Method(selector = "setAnimationDuration:")
    public static native void setAnimationDurationInSeconds(double duration);
    /**
     * @deprecated Deprecated in iOS 13.0. Use the block-based animation API instead
     */
    @Deprecated
    @Method(selector = "setAnimationDelay:")
    public static native void setAnimationDelay(double delay);
    /**
     * @deprecated Deprecated in iOS 13.0. Use the block-based animation API instead
     */
    @Deprecated
    @Method(selector = "setAnimationStartDate:")
    public static native void setAnimationStartDate(NSDate startDate);
    /**
     * @deprecated Deprecated in iOS 13.0. Use the block-based animation API instead
     */
    @Deprecated
    @Method(selector = "setAnimationCurve:")
    public static native void setAnimationCurve(UIViewAnimationCurve curve);
    /**
     * @deprecated Deprecated in iOS 13.0. Use the block-based animation API instead
     */
    @Deprecated
    @Method(selector = "setAnimationRepeatCount:")
    public static native void setAnimationRepeatCount(float repeatCount);
    /**
     * @deprecated Deprecated in iOS 13.0. Use the block-based animation API instead
     */
    @Deprecated
    @Method(selector = "setAnimationRepeatAutoreverses:")
    public static native void setAnimationRepeatAutoreverses(boolean repeatAutoreverses);
    /**
     * @deprecated Deprecated in iOS 13.0. Use the block-based animation API instead
     */
    @Deprecated
    @Method(selector = "setAnimationBeginsFromCurrentState:")
    public static native void setAnimationBeginsFromCurrentState(boolean fromCurrentState);
    /**
     * @deprecated Deprecated in iOS 13.0. Use the block-based animation API instead
     */
    @Deprecated
    @Method(selector = "setAnimationTransition:forView:cache:")
    public static native void setAnimationTransition(UIViewAnimationTransition transition, UIView view, boolean cache);
    @Method(selector = "updateTraitsIfNeeded")
    public native void updateTraitsIfNeeded();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "addInteraction:")
    public native void addInteraction(UIInteraction interaction);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "removeInteraction:")
    public native void removeInteraction(UIInteraction interaction);
    @Method(selector = "endEditing:")
    public native boolean endEditing(boolean force);
    @Method(selector = "viewPrintFormatter")
    public native UIViewPrintFormatter getViewPrintFormatter();
    @Method(selector = "drawRect:forViewPrintFormatter:")
    public native void draw(@ByVal CGRect rect, UIViewPrintFormatter formatter);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /**
     * @deprecated Deprecated in iOS 17.0. Use the trait change registration APIs declared in the UITraitChangeObservable protocol
     */
    @Deprecated
    @Method(selector = "traitCollectionDidChange:")
    public native void traitCollectionDidChange(UITraitCollection previousTraitCollection);
    @Method(selector = "convertPoint:toCoordinateSpace:")
    public native @ByVal CGPoint convertPointToCoordinateSpace(@ByVal CGPoint point, UICoordinateSpace coordinateSpace);
    @Method(selector = "convertPoint:fromCoordinateSpace:")
    public native @ByVal CGPoint convertPointFromCoordinateSpace(@ByVal CGPoint point, UICoordinateSpace coordinateSpace);
    @Method(selector = "convertRect:toCoordinateSpace:")
    public native @ByVal CGRect convertRectToCoordinateSpace(@ByVal CGRect rect, UICoordinateSpace coordinateSpace);
    @Method(selector = "convertRect:fromCoordinateSpace:")
    public native @ByVal CGRect convertRectFromCoordinateSpace(@ByVal CGRect rect, UICoordinateSpace coordinateSpace);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "didHintFocusMovement:")
    public native void didHintFocusMovement(UIFocusMovementHint hint);
    @Method(selector = "setNeedsFocusUpdate")
    public native void setNeedsFocusUpdate();
    @Method(selector = "updateFocusIfNeeded")
    public native void updateFocusIfNeeded();
    @Method(selector = "shouldUpdateFocusInContext:")
    public native boolean shouldUpdateFocus(UIFocusUpdateContext context);
    @Method(selector = "didUpdateFocusInContext:withAnimationCoordinator:")
    public native void didUpdateFocus(UIFocusUpdateContext context, UIFocusAnimationCoordinator coordinator);
    @Method(selector = "focusItemsInRect:")
    public native NSArray<?> focusItemsInRect(@ByVal CGRect rect);
    @Method(selector = "displayLayer:")
    public native void displayLayer(CALayer layer);
    @Method(selector = "drawLayer:inContext:")
    public native void drawLayer(CALayer layer, CGContext ctx);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "layerWillDraw:")
    public native void willDrawLayer(CALayer layer);
    @Method(selector = "layoutSublayersOfLayer:")
    public native void layoutSublayers(CALayer layer);
    @Method(selector = "actionForLayer:forKey:")
    public native CAAction getAction(CALayer layer, String event);
    @Method(selector = "unregisterForTraitChanges:")
    public native void unregisterForTraitChanges(UITraitChangeRegistration registration);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "frameInView:")
    public native @ByVal CGRect frameInView(UIView referenceView);
    /*</methods>*/
}
