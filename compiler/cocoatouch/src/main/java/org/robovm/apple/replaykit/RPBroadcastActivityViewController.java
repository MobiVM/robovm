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
package org.robovm.apple.replaykit;

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
import org.robovm.apple.coremedia.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ReplayKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RPBroadcastActivityViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RPBroadcastActivityViewControllerPtr extends Ptr<RPBroadcastActivityViewController, RPBroadcastActivityViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RPBroadcastActivityViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public RPBroadcastActivityViewController() {}
    protected RPBroadcastActivityViewController(Handle h, long handle) { super(h, handle); }
    protected RPBroadcastActivityViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithNibName:bundle:")
    public RPBroadcastActivityViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    @Method(selector = "initWithCoder:")
    public RPBroadcastActivityViewController(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native RPBroadcastActivityViewControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(RPBroadcastActivityViewControllerDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "loadBroadcastActivityViewControllerWithHandler:")
    public static native void load(@Block VoidBlock2<RPBroadcastActivityViewController, NSError> handler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "loadBroadcastActivityViewControllerWithPreferredExtension:handler:")
    public static native void load(String preferredExtension, @Block VoidBlock2<RPBroadcastActivityViewController, NSError> handler);
    /*</methods>*/
}
