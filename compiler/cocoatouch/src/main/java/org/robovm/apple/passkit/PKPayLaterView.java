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
package org.robovm.apple.passkit;

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
import org.robovm.apple.addressbook.*;
import org.robovm.apple.contacts.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKPayLaterView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKPayLaterViewPtr extends Ptr<PKPayLaterView, PKPayLaterViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKPayLaterView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PKPayLaterView() {}
    protected PKPayLaterView(Handle h, long handle) { super(h, handle); }
    protected PKPayLaterView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAmount:currencyCode:")
    public PKPayLaterView(NSDecimalNumber amount, String currencyCode) { super((SkipInit) null); initObject(init(amount, currencyCode)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native PKPayLaterViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(PKPayLaterViewDelegate v);
    @Property(selector = "amount")
    public native NSDecimalNumber getAmount();
    @Property(selector = "setAmount:")
    public native void setAmount(NSDecimalNumber v);
    @Property(selector = "currencyCode")
    public native String getCurrencyCode();
    @Property(selector = "setCurrencyCode:")
    public native void setCurrencyCode(String v);
    @Property(selector = "displayStyle")
    public native PKPayLaterDisplayStyle getDisplayStyle();
    @Property(selector = "setDisplayStyle:")
    public native void setDisplayStyle(PKPayLaterDisplayStyle v);
    @Property(selector = "action")
    public native PKPayLaterAction getAction();
    @Property(selector = "setAction:")
    public native void setAction(PKPayLaterAction v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAmount:currencyCode:")
    protected native @Pointer long init(NSDecimalNumber amount, String currencyCode);
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
