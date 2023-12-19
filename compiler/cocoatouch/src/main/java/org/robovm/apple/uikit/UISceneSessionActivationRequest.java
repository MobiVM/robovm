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
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UISceneSessionActivationRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UISceneSessionActivationRequestPtr extends Ptr<UISceneSessionActivationRequest, UISceneSessionActivationRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UISceneSessionActivationRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UISceneSessionActivationRequest(Handle h, long handle) { super(h, handle); }
    protected UISceneSessionActivationRequest(SkipInit skipInit) { super(skipInit); }
    public UISceneSessionActivationRequest() { super((Handle) null, create()); retain(getHandle()); }
    public UISceneSessionActivationRequest(UISceneSessionRole role) { super((Handle) null, create(role)); retain(getHandle()); }
    public UISceneSessionActivationRequest(UISceneSession session) { super((Handle) null, create(session)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "role")
    public native UISceneSessionRole getRole();
    @Property(selector = "session")
    public native UISceneSession getSession();
    @Property(selector = "userActivity")
    public native NSUserActivity getUserActivity();
    @Property(selector = "setUserActivity:")
    public native void setUserActivity(NSUserActivity v);
    @Property(selector = "options")
    public native UISceneActivationRequestOptions getOptions();
    @Property(selector = "setOptions:")
    public native void setOptions(UISceneActivationRequestOptions v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "request")
    protected static native @Pointer long create();
    @Method(selector = "requestWithRole:")
    protected static native @Pointer long create(UISceneSessionRole role);
    @Method(selector = "requestWithSession:")
    protected static native @Pointer long create(UISceneSession session);
    /*</methods>*/
}
