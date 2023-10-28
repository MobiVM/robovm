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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIFocusSystem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIFocusSystemPtr extends Ptr<UIFocusSystem, UIFocusSystemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIFocusSystem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIFocusSystem() {}
    protected UIFocusSystem(Handle h, long handle) { super(h, handle); }
    protected UIFocusSystem(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "focusedItem")
    public native UIFocusItem getFocusedItem();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "requestFocusUpdateToEnvironment:")
    public native void requestFocusUpdateToEnvironment(UIFocusEnvironment environment);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "updateFocusIfNeeded")
    public native void updateFocusIfNeeded();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "focusSystemForEnvironment:")
    public static native UIFocusSystem focusSystemForEnvironment(UIFocusEnvironment environment);
    @Method(selector = "environment:containsEnvironment:")
    public static native boolean isEnvironmentContainsEnvironment(UIFocusEnvironment environment, UIFocusEnvironment otherEnvironment);
    /*</methods>*/
}
