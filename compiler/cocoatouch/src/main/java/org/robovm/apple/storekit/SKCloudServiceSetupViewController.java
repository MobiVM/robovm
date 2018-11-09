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
package org.robovm.apple.storekit;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.1 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("StoreKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKCloudServiceSetupViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKCloudServiceSetupViewControllerPtr extends Ptr<SKCloudServiceSetupViewController, SKCloudServiceSetupViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKCloudServiceSetupViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKCloudServiceSetupViewController() {}
    protected SKCloudServiceSetupViewController(Handle h, long handle) { super(h, handle); }
    protected SKCloudServiceSetupViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithNibName:bundle:")
    public SKCloudServiceSetupViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    @Method(selector = "initWithCoder:")
    public SKCloudServiceSetupViewController(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native SKCloudServiceSetupViewControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(SKCloudServiceSetupViewControllerDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "loadWithOptions:completionHandler:")
    public native void load(SKCloudServiceSetupOptions options, @Block VoidBlock2<Boolean, NSError> completionHandler);
    /*</methods>*/
}
