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
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIBarButtonItemBadge/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class UIBarButtonItemBadgePtr extends Ptr<UIBarButtonItemBadge, UIBarButtonItemBadgePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIBarButtonItemBadge.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIBarButtonItemBadge() {}
    protected UIBarButtonItemBadge(Handle h, long handle) { super(h, handle); }
    protected UIBarButtonItemBadge(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public UIBarButtonItemBadge(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "stringValue")
    public native String getStringValue();
    @Property(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    @Property(selector = "setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    @Property(selector = "foregroundColor")
    public native UIColor getForegroundColor();
    @Property(selector = "setForegroundColor:")
    public native void setForegroundColor(UIColor v);
    @Property(selector = "font")
    public native UIFont getFont();
    @Property(selector = "setFont:")
    public native void setFont(UIFont v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "badgeWithCount:")
    public static native UIBarButtonItemBadge getBadge(@MachineSizedUInt long count);
    @Method(selector = "badgeWithString:")
    public static native UIBarButtonItemBadge getBadge(String stringValue);
    @Method(selector = "indicatorBadge")
    public static native UIBarButtonItemBadge indicatorBadge();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
