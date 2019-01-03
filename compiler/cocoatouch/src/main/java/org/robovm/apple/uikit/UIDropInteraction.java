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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIDropInteraction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIInteraction/*</implements>*/ {

    /*<ptr>*/public static class UIDropInteractionPtr extends Ptr<UIDropInteraction, UIDropInteractionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIDropInteraction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIDropInteraction() {}
    protected UIDropInteraction(Handle h, long handle) { super(h, handle); }
    protected UIDropInteraction(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDelegate:")
    public UIDropInteraction(UIDropInteractionDelegate delegate) { super((SkipInit) null); initObject(init(delegate)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native UIDropInteractionDelegate getDelegate();
    @Property(selector = "allowsSimultaneousDropSessions")
    public native boolean allowsSimultaneousDropSessions();
    @Property(selector = "setAllowsSimultaneousDropSessions:")
    public native void setAllowsSimultaneousDropSessions(boolean v);
    @Property(selector = "view")
    public native UIView getView();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDelegate:")
    protected native @Pointer long init(UIDropInteractionDelegate delegate);
    @Method(selector = "willMoveToView:")
    public native void willMoveToView(UIView view);
    @Method(selector = "didMoveToView:")
    public native void didMoveToView(UIView view);
    /*</methods>*/
}
