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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UISwitch/*</name>*/ 
    extends /*<extends>*/UIControl/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class UISwitchPtr extends Ptr<UISwitch, UISwitchPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UISwitch.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UISwitch() {}
    protected UISwitch(Handle h, long handle) { super(h, handle); }
    protected UISwitch(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public UISwitch(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithCoder:")
    public UISwitch(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithFrame:primaryAction:")
    public UISwitch(@ByVal CGRect frame, UIAction primaryAction) { super(frame, primaryAction); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "onTintColor")
    public native UIColor getOnTintColor();
    @Property(selector = "setOnTintColor:")
    public native void setOnTintColor(UIColor v);
    @Property(selector = "thumbTintColor")
    public native UIColor getThumbTintColor();
    @Property(selector = "setThumbTintColor:")
    public native void setThumbTintColor(UIColor v);
    @Property(selector = "onImage")
    public native UIImage getOnImage();
    @Property(selector = "setOnImage:")
    public native void setOnImage(UIImage v);
    @Property(selector = "offImage")
    public native UIImage getOffImage();
    @Property(selector = "setOffImage:")
    public native void setOffImage(UIImage v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "title")
    public native String getTitle();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "style")
    public native UISwitchStyle getStyle();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "preferredStyle")
    public native UISwitchStyle getPreferredStyle();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setPreferredStyle:")
    public native void setPreferredStyle(UISwitchStyle v);
    @Property(selector = "isOn")
    public native boolean isOn();
    @Property(selector = "setOn:")
    public native void setOn(boolean v);
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
    @Method(selector = "setOn:animated:")
    public native void setOn(boolean on, boolean animated);
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
