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
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIStackView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIStackViewPtr extends Ptr<UIStackView, UIStackViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIStackView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIStackView() {}
    protected UIStackView(Handle h, long handle) { super(h, handle); }
    protected UIStackView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public UIStackView(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithCoder:")
    public UIStackView(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    @Method(selector = "initWithArrangedSubviews:")
    public UIStackView(NSArray<UIView> views) { super((SkipInit) null); initObject(init(views)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "arrangedSubviews")
    public native NSArray<UIView> getArrangedSubviews();
    @Property(selector = "axis")
    public native UILayoutConstraintAxis getAxis();
    @Property(selector = "setAxis:")
    public native void setAxis(UILayoutConstraintAxis v);
    @Property(selector = "distribution")
    public native UIStackViewDistribution getDistribution();
    @Property(selector = "setDistribution:")
    public native void setDistribution(UIStackViewDistribution v);
    @Property(selector = "alignment")
    public native UIStackViewAlignment getAlignment();
    @Property(selector = "setAlignment:")
    public native void setAlignment(UIStackViewAlignment v);
    @Property(selector = "spacing")
    public native @MachineSizedFloat double getSpacing();
    @Property(selector = "setSpacing:")
    public native void setSpacing(@MachineSizedFloat double v);
    @Property(selector = "isBaselineRelativeArrangement")
    public native boolean isBaselineRelativeArrangement();
    @Property(selector = "setBaselineRelativeArrangement:")
    public native void setBaselineRelativeArrangement(boolean v);
    @Property(selector = "isLayoutMarginsRelativeArrangement")
    public native boolean isLayoutMarginsRelativeArrangement();
    @Property(selector = "setLayoutMarginsRelativeArrangement:")
    public native void setLayoutMarginsRelativeArrangement(boolean v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFrame:")
    protected native @Pointer long init(@ByVal CGRect frame);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "initWithArrangedSubviews:")
    protected native @Pointer long init(NSArray<UIView> views);
    @Method(selector = "addArrangedSubview:")
    public native void addArrangedSubview(UIView view);
    @Method(selector = "removeArrangedSubview:")
    public native void removeArrangedSubview(UIView view);
    @Method(selector = "insertArrangedSubview:atIndex:")
    public native void insertArrangedSubview(UIView view, @MachineSizedUInt long stackIndex);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setCustomSpacing:afterView:")
    public native void setCustomSpacing(@MachineSizedFloat double spacing, UIView arrangedSubview);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "customSpacingAfterView:")
    public native @MachineSizedFloat double customSpacingAfterView(UIView arrangedSubview);
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
