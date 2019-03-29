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
package org.robovm.apple.intentsui;

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
import org.robovm.apple.intents.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("IntentsUI") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INUIAddVoiceShortcutViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INUIAddVoiceShortcutViewControllerPtr extends Ptr<INUIAddVoiceShortcutViewController, INUIAddVoiceShortcutViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INUIAddVoiceShortcutViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INUIAddVoiceShortcutViewController() {}
    protected INUIAddVoiceShortcutViewController(Handle h, long handle) { super(h, handle); }
    protected INUIAddVoiceShortcutViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithShortcut:")
    public INUIAddVoiceShortcutViewController(INShortcut shortcut) { super((SkipInit) null); initObject(init(shortcut)); }
    @Method(selector = "initWithNibName:bundle:")
    public INUIAddVoiceShortcutViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    @Method(selector = "initWithCoder:")
    public INUIAddVoiceShortcutViewController(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native INUIAddVoiceShortcutViewControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(INUIAddVoiceShortcutViewControllerDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithShortcut:")
    protected native @Pointer long init(INShortcut shortcut);
    /*</methods>*/
}
