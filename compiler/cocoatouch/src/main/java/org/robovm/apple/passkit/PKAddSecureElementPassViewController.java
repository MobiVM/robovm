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
 * @since Available in iOS 13.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKAddSecureElementPassViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKAddSecureElementPassViewControllerPtr extends Ptr<PKAddSecureElementPassViewController, PKAddSecureElementPassViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKAddSecureElementPassViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PKAddSecureElementPassViewController() {}
    protected PKAddSecureElementPassViewController(Handle h, long handle) { super(h, handle); }
    protected PKAddSecureElementPassViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithConfiguration:delegate:")
    public PKAddSecureElementPassViewController(PKAddSecureElementPassConfiguration configuration, PKAddSecureElementPassViewControllerDelegate delegate) { super((SkipInit) null); initObject(init(configuration, delegate)); }
    @Method(selector = "initWithNibName:bundle:")
    public PKAddSecureElementPassViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    @Method(selector = "initWithCoder:")
    public PKAddSecureElementPassViewController(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native PKAddSecureElementPassViewControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(PKAddSecureElementPassViewControllerDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithConfiguration:delegate:")
    protected native @Pointer long init(PKAddSecureElementPassConfiguration configuration, PKAddSecureElementPassViewControllerDelegate delegate);
    @Method(selector = "canAddSecureElementPassWithConfiguration:")
    public static native boolean canAddSecureElementPass(PKAddSecureElementPassConfiguration configuration);
    /*</methods>*/
}
