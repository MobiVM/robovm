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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIBarAppearance/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class UIBarAppearancePtr extends Ptr<UIBarAppearance, UIBarAppearancePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIBarAppearance.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIBarAppearance() {}
    protected UIBarAppearance(Handle h, long handle) { super(h, handle); }
    protected UIBarAppearance(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdiom:")
    public UIBarAppearance(UIUserInterfaceIdiom idiom) { super((SkipInit) null); initObject(init(idiom)); }
    @Method(selector = "initWithBarAppearance:")
    public UIBarAppearance(UIBarAppearance barAppearance) { super((SkipInit) null); initObject(init(barAppearance)); }
    @Method(selector = "initWithCoder:")
    public UIBarAppearance(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "idiom")
    public native UIUserInterfaceIdiom getIdiom();
    @Property(selector = "backgroundEffect")
    public native UIBlurEffect getBackgroundEffect();
    @Property(selector = "setBackgroundEffect:")
    public native void setBackgroundEffect(UIBlurEffect v);
    @Property(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    @Property(selector = "setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    @Property(selector = "backgroundImage")
    public native UIImage getBackgroundImage();
    @Property(selector = "setBackgroundImage:")
    public native void setBackgroundImage(UIImage v);
    @Property(selector = "backgroundImageContentMode")
    public native UIViewContentMode getBackgroundImageContentMode();
    @Property(selector = "setBackgroundImageContentMode:")
    public native void setBackgroundImageContentMode(UIViewContentMode v);
    @Property(selector = "shadowColor")
    public native UIColor getShadowColor();
    @Property(selector = "setShadowColor:")
    public native void setShadowColor(UIColor v);
    @Property(selector = "shadowImage")
    public native UIImage getShadowImage();
    @Property(selector = "setShadowImage:")
    public native void setShadowImage(UIImage v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdiom:")
    protected native @Pointer long init(UIUserInterfaceIdiom idiom);
    @Method(selector = "initWithBarAppearance:")
    protected native @Pointer long init(UIBarAppearance barAppearance);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "copy")
    public native UIBarAppearance copy();
    @Method(selector = "configureWithDefaultBackground")
    public native void configureWithDefaultBackground();
    @Method(selector = "configureWithOpaqueBackground")
    public native void configureWithOpaqueBackground();
    @Method(selector = "configureWithTransparentBackground")
    public native void configureWithTransparentBackground();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
