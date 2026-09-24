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
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITextFormattingViewControllerFormattingStyle/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class UITextFormattingViewControllerFormattingStylePtr extends Ptr<UITextFormattingViewControllerFormattingStyle, UITextFormattingViewControllerFormattingStylePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UITextFormattingViewControllerFormattingStyle.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UITextFormattingViewControllerFormattingStyle() {}
    protected UITextFormattingViewControllerFormattingStyle(Handle h, long handle) { super(h, handle); }
    protected UITextFormattingViewControllerFormattingStyle(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithStyleKey:title:attributes:")
    public UITextFormattingViewControllerFormattingStyle(String styleKey, String string, NSDictionary<NSString, ?> attributes) { super((SkipInit) null); initObject(init(styleKey, string, attributes)); }
    @Method(selector = "initWithCoder:")
    public UITextFormattingViewControllerFormattingStyle(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "styleKey")
    public native String getStyleKey();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "attributes")
    public native NSDictionary<NSString, ?> getAttributes();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithStyleKey:title:attributes:")
    protected native @Pointer long init(String styleKey, String string, NSDictionary<NSString, ?> attributes);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
