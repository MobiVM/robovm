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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIWindowSceneActivationAction/*</name>*/ 
    extends /*<extends>*/UIAction/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIWindowSceneActivationActionPtr extends Ptr<UIWindowSceneActivationAction, UIWindowSceneActivationActionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIWindowSceneActivationAction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIWindowSceneActivationAction() {}
    protected UIWindowSceneActivationAction(Handle h, long handle) { super(h, handle); }
    protected UIWindowSceneActivationAction(SkipInit skipInit) { super(skipInit); }
    public UIWindowSceneActivationAction(UIActionIdentifier identifier, UIAction alternateAction, @Block Block1<UIWindowSceneActivationAction, UIWindowSceneActivationConfiguration> configurationProvider) { super((Handle) null, create(identifier, alternateAction, configurationProvider)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public UIWindowSceneActivationAction(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "actionWithIdentifier:alternateAction:configurationProvider:")
    protected static native @Pointer long create(UIActionIdentifier identifier, UIAction alternateAction, @Block Block1<UIWindowSceneActivationAction, UIWindowSceneActivationConfiguration> configurationProvider);
    /*</methods>*/
}
