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
 * @deprecated Deprecated in iOS 9.0. Access destinationViewController.popoverPresentationController from your segue's performHandler or override of -perform
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIStoryboardPopoverSegue/*</name>*/ 
    extends /*<extends>*/UIStoryboardSegue/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIStoryboardPopoverSeguePtr extends Ptr<UIStoryboardPopoverSegue, UIStoryboardPopoverSeguePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIStoryboardPopoverSegue.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIStoryboardPopoverSegue() {}
    protected UIStoryboardPopoverSegue(Handle h, long handle) { super(h, handle); }
    protected UIStoryboardPopoverSegue(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:source:destination:")
    public UIStoryboardPopoverSegue(String identifier, UIViewController source, UIViewController destination) { super(identifier, source, destination); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "popoverController")
    public native UIPopoverController getPopoverController();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
