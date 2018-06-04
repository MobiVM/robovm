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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIAccessibilityCustomRotor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIAccessibilityCustomRotorPtr extends Ptr<UIAccessibilityCustomRotor, UIAccessibilityCustomRotorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIAccessibilityCustomRotor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIAccessibilityCustomRotor() {}
    protected UIAccessibilityCustomRotor(Handle h, long handle) { super(h, handle); }
    protected UIAccessibilityCustomRotor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithName:itemSearchBlock:")
    public UIAccessibilityCustomRotor(String name, @Block Block1<UIAccessibilityCustomRotorSearchPredicate, UIAccessibilityCustomRotorItemResult> itemSearchBlock) { super((SkipInit) null); initObject(init(name, itemSearchBlock)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithAttributedName:itemSearchBlock:")
    public UIAccessibilityCustomRotor(NSAttributedString attributedName, @Block Block1<UIAccessibilityCustomRotorSearchPredicate, UIAccessibilityCustomRotorItemResult> itemSearchBlock) { super((SkipInit) null); initObject(init(attributedName, itemSearchBlock)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithSystemType:itemSearchBlock:")
    public UIAccessibilityCustomRotor(UIAccessibilityCustomSystemRotorType type, @Block Block1<UIAccessibilityCustomRotorSearchPredicate, UIAccessibilityCustomRotorItemResult> itemSearchBlock) { super((SkipInit) null); initObject(init(type, itemSearchBlock)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "attributedName")
    public native NSAttributedString getAttributedName();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setAttributedName:")
    public native void setAttributedName(NSAttributedString v);
    @Property(selector = "itemSearchBlock")
    public native @Block Block1<UIAccessibilityCustomRotorSearchPredicate, UIAccessibilityCustomRotorItemResult> getItemSearchBlock();
    @Property(selector = "setItemSearchBlock:")
    public native void setItemSearchBlock(@Block Block1<UIAccessibilityCustomRotorSearchPredicate, UIAccessibilityCustomRotorItemResult> v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "systemRotorType")
    public native UIAccessibilityCustomSystemRotorType getSystemRotorType();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithName:itemSearchBlock:")
    protected native @Pointer long init(String name, @Block Block1<UIAccessibilityCustomRotorSearchPredicate, UIAccessibilityCustomRotorItemResult> itemSearchBlock);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithAttributedName:itemSearchBlock:")
    protected native @Pointer long init(NSAttributedString attributedName, @Block Block1<UIAccessibilityCustomRotorSearchPredicate, UIAccessibilityCustomRotorItemResult> itemSearchBlock);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithSystemType:itemSearchBlock:")
    protected native @Pointer long init(UIAccessibilityCustomSystemRotorType type, @Block Block1<UIAccessibilityCustomRotorSearchPredicate, UIAccessibilityCustomRotorItemResult> itemSearchBlock);
    /*</methods>*/
}
