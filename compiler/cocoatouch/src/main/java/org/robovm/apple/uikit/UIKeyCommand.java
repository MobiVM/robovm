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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIKeyCommand/*</name>*/ 
    extends /*<extends>*/UICommand/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIKeyCommandPtr extends Ptr<UIKeyCommand, UIKeyCommandPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIKeyCommand.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIKeyCommand() {}
    protected UIKeyCommand(Handle h, long handle) { super(h, handle); }
    protected UIKeyCommand(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public UIKeyCommand(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    public UIKeyCommand(String title, UIImage image, Selector action, String input, UIKeyModifierFlags modifierFlags, NSObject propertyList) { super((Handle) null, create(title, image, action, input, modifierFlags, propertyList)); retain(getHandle()); }
    public UIKeyCommand(String title, UIImage image, Selector action, String input, UIKeyModifierFlags modifierFlags, NSObject propertyList, NSArray<UICommandAlternate> alternates) { super((Handle) null, create(title, image, action, input, modifierFlags, propertyList, alternates)); retain(getHandle()); }
    public UIKeyCommand(String input, UIKeyModifierFlags modifierFlags, Selector action) { super((Handle) null, create(input, modifierFlags, action)); retain(getHandle()); }
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 13.0. Use keyCommandWithInput:modifierFlags:action:
     */
    @Deprecated
    public UIKeyCommand(String input, UIKeyModifierFlags modifierFlags, Selector action, String discoverabilityTitle) { super((Handle) null, create(input, modifierFlags, action, discoverabilityTitle)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "title")
    public native String getTitle();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "image")
    public native UIImage getImage();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setImage:")
    public native void setImage(UIImage v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "discoverabilityTitle")
    public native String getDiscoverabilityTitle();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setDiscoverabilityTitle:")
    public native void setDiscoverabilityTitle(String v);
    @Property(selector = "action")
    public native Selector getAction();
    @Property(selector = "input")
    public native String getInput();
    @Property(selector = "modifierFlags")
    public native UIKeyModifierFlags getModifierFlags();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "propertyList")
    public native NSObject getPropertyList();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "attributes")
    public native UIMenuElementAttributes getAttributes();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setAttributes:")
    public native void setAttributes(UIMenuElementAttributes v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "state")
    public native UIMenuElementState getState();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setState:")
    public native void setState(UIMenuElementState v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "alternates")
    public native NSArray<UICommandAlternate> getAlternates();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "wantsPriorityOverSystemBehavior")
    public native boolean wantsPriorityOverSystemBehavior();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setWantsPriorityOverSystemBehavior:")
    public native void setWantsPriorityOverSystemBehavior(boolean v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "allowsAutomaticLocalization")
    public native boolean allowsAutomaticLocalization();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setAllowsAutomaticLocalization:")
    public native void setAllowsAutomaticLocalization(boolean v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "allowsAutomaticMirroring")
    public native boolean allowsAutomaticMirroring();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setAllowsAutomaticMirroring:")
    public native void setAllowsAutomaticMirroring(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="UIKeyInputUpArrow", optional=true)
    public static native String UpArrow();
    @GlobalValue(symbol="UIKeyInputDownArrow", optional=true)
    public static native String DownArrow();
    @GlobalValue(symbol="UIKeyInputLeftArrow", optional=true)
    public static native String LeftArrow();
    @GlobalValue(symbol="UIKeyInputRightArrow", optional=true)
    public static native String RightArrow();
    @GlobalValue(symbol="UIKeyInputEscape", optional=true)
    public static native String Escape();
    @GlobalValue(symbol="UIKeyInputPageUp", optional=true)
    public static native String PageUp();
    @GlobalValue(symbol="UIKeyInputPageDown", optional=true)
    public static native String PageDown();
    /**
     * @since Available in iOS 13.4 and later.
     */
    @GlobalValue(symbol="UIKeyInputHome", optional=true)
    public static native String Home();
    /**
     * @since Available in iOS 13.4 and later.
     */
    @GlobalValue(symbol="UIKeyInputEnd", optional=true)
    public static native String End();
    /**
     * @since Available in iOS 13.4 and later.
     */
    @GlobalValue(symbol="UIKeyInputF1", optional=true)
    public static native String F1();
    /**
     * @since Available in iOS 13.4 and later.
     */
    @GlobalValue(symbol="UIKeyInputF2", optional=true)
    public static native String F2();
    /**
     * @since Available in iOS 13.4 and later.
     */
    @GlobalValue(symbol="UIKeyInputF3", optional=true)
    public static native String F3();
    /**
     * @since Available in iOS 13.4 and later.
     */
    @GlobalValue(symbol="UIKeyInputF4", optional=true)
    public static native String F4();
    /**
     * @since Available in iOS 13.4 and later.
     */
    @GlobalValue(symbol="UIKeyInputF5", optional=true)
    public static native String F5();
    /**
     * @since Available in iOS 13.4 and later.
     */
    @GlobalValue(symbol="UIKeyInputF6", optional=true)
    public static native String F6();
    /**
     * @since Available in iOS 13.4 and later.
     */
    @GlobalValue(symbol="UIKeyInputF7", optional=true)
    public static native String F7();
    /**
     * @since Available in iOS 13.4 and later.
     */
    @GlobalValue(symbol="UIKeyInputF8", optional=true)
    public static native String F8();
    /**
     * @since Available in iOS 13.4 and later.
     */
    @GlobalValue(symbol="UIKeyInputF9", optional=true)
    public static native String F9();
    /**
     * @since Available in iOS 13.4 and later.
     */
    @GlobalValue(symbol="UIKeyInputF10", optional=true)
    public static native String F10();
    /**
     * @since Available in iOS 13.4 and later.
     */
    @GlobalValue(symbol="UIKeyInputF11", optional=true)
    public static native String F11();
    /**
     * @since Available in iOS 13.4 and later.
     */
    @GlobalValue(symbol="UIKeyInputF12", optional=true)
    public static native String F12();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="UIKeyInputDelete", optional=true)
    public static native String Delete();
    
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "commandWithTitle:image:action:input:modifierFlags:propertyList:")
    protected static native @Pointer long create(String title, UIImage image, Selector action, String input, UIKeyModifierFlags modifierFlags, NSObject propertyList);
    @Method(selector = "commandWithTitle:image:action:input:modifierFlags:propertyList:alternates:")
    protected static native @Pointer long create(String title, UIImage image, Selector action, String input, UIKeyModifierFlags modifierFlags, NSObject propertyList, NSArray<UICommandAlternate> alternates);
    @Method(selector = "keyCommandWithInput:modifierFlags:action:")
    protected static native @Pointer long create(String input, UIKeyModifierFlags modifierFlags, Selector action);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 13.0. Use keyCommandWithInput:modifierFlags:action:
     */
    @Deprecated
    @Method(selector = "keyCommandWithInput:modifierFlags:action:discoverabilityTitle:")
    protected static native @Pointer long create(String input, UIKeyModifierFlags modifierFlags, Selector action, String discoverabilityTitle);
    /*</methods>*/
}
