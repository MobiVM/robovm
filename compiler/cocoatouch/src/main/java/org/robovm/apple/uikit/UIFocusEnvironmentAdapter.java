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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIFocusEnvironmentAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIFocusEnvironment/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("preferredFocusEnvironments")
    public @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<UIFocusEnvironment> getPreferredFocusEnvironments() { return null; }
    /**
     * @since Available in iOS 12.0 and later.
     */
    @NotImplemented("parentFocusEnvironment")
    public UIFocusEnvironment getParentFocusEnvironment() { return null; }
    /**
     * @since Available in iOS 12.0 and later.
     */
    @NotImplemented("focusItemContainer")
    public UIFocusItemContainer getFocusItemContainer() { return null; }
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use -preferredFocusEnvironments instead.
     */
    @Deprecated
    @NotImplemented("preferredFocusedView")
    public UIView getPreferredFocusedView() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("setNeedsFocusUpdate")
    public void setNeedsFocusUpdate() {}
    @NotImplemented("updateFocusIfNeeded")
    public void updateFocusIfNeeded() {}
    @NotImplemented("shouldUpdateFocusInContext:")
    public boolean shouldUpdateFocus(UIFocusUpdateContext context) { return false; }
    @NotImplemented("didUpdateFocusInContext:withAnimationCoordinator:")
    public void didUpdateFocus(UIFocusUpdateContext context, UIFocusAnimationCoordinator coordinator) {}
    /*</methods>*/
}
