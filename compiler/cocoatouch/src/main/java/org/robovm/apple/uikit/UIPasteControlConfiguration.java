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
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIPasteControlConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class UIPasteControlConfigurationPtr extends Ptr<UIPasteControlConfiguration, UIPasteControlConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIPasteControlConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIPasteControlConfiguration() {}
    protected UIPasteControlConfiguration(Handle h, long handle) { super(h, handle); }
    protected UIPasteControlConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public UIPasteControlConfiguration(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "displayMode")
    public native UIPasteControlDisplayMode getDisplayMode();
    @Property(selector = "setDisplayMode:")
    public native void setDisplayMode(UIPasteControlDisplayMode v);
    @Property(selector = "cornerStyle")
    public native UIButtonConfigurationCornerStyle getCornerStyle();
    @Property(selector = "setCornerStyle:")
    public native void setCornerStyle(UIButtonConfigurationCornerStyle v);
    @Property(selector = "cornerRadius")
    public native @MachineSizedFloat double getCornerRadius();
    @Property(selector = "setCornerRadius:")
    public native void setCornerRadius(@MachineSizedFloat double v);
    @Property(selector = "baseForegroundColor")
    public native UIColor getBaseForegroundColor();
    @Property(selector = "setBaseForegroundColor:")
    public native void setBaseForegroundColor(UIColor v);
    @Property(selector = "baseBackgroundColor")
    public native UIColor getBaseBackgroundColor();
    @Property(selector = "setBaseBackgroundColor:")
    public native void setBaseBackgroundColor(UIColor v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
