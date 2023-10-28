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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIStoryboard/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIStoryboardPtr extends Ptr<UIStoryboard, UIStoryboardPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIStoryboard.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIStoryboard() {}
    protected UIStoryboard(Handle h, long handle) { super(h, handle); }
    protected UIStoryboard(SkipInit skipInit) { super(skipInit); }
    public UIStoryboard(String name, NSBundle storyboardBundleOrNil) { super((Handle) null, create(name, storyboardBundleOrNil)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "instantiateInitialViewController")
    public native UIViewController instantiateInitialViewController();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "instantiateInitialViewControllerWithCreator:")
    public native UIViewController instantiateViewController(@Block Block1<NSCoder, UIViewController> block);
    @Method(selector = "instantiateViewControllerWithIdentifier:")
    public native UIViewController instantiateViewController(String identifier);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "instantiateViewControllerWithIdentifier:creator:")
    public native UIViewController instantiateViewController(String identifier, @Block Block1<NSCoder, UIViewController> block);
    @Method(selector = "storyboardWithName:bundle:")
    protected static native @Pointer long create(String name, NSBundle storyboardBundleOrNil);
    /*</methods>*/
}
