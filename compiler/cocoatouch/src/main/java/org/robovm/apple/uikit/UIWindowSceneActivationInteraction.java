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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIWindowSceneActivationInteraction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIInteraction/*</implements>*/ {

    /*<ptr>*/public static class UIWindowSceneActivationInteractionPtr extends Ptr<UIWindowSceneActivationInteraction, UIWindowSceneActivationInteractionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIWindowSceneActivationInteraction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIWindowSceneActivationInteraction() {}
    protected UIWindowSceneActivationInteraction(Handle h, long handle) { super(h, handle); }
    protected UIWindowSceneActivationInteraction(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithConfigurationProvider:errorHandler:")
    public UIWindowSceneActivationInteraction(@Block("(,@ByVal)") Block2<UIWindowSceneActivationInteraction, CGPoint, UIWindowSceneActivationConfiguration> configurationProvider, @Block VoidBlock1<NSError> errorHandler) { super((SkipInit) null); initObject(init(configurationProvider, errorHandler)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "view")
    public native UIView getView();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithConfigurationProvider:errorHandler:")
    protected native @Pointer long init(@Block("(,@ByVal)") Block2<UIWindowSceneActivationInteraction, CGPoint, UIWindowSceneActivationConfiguration> configurationProvider, @Block VoidBlock1<NSError> errorHandler);
    @Method(selector = "willMoveToView:")
    public native void willMoveToView(UIView view);
    @Method(selector = "didMoveToView:")
    public native void didMoveToView(UIView view);
    /*</methods>*/
}
