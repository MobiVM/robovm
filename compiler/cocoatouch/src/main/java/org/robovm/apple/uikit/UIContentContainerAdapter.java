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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIContentContainerAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIContentContainer/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("preferredContentSize")
    public @ByVal CGSize getPreferredContentSize() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("preferredContentSizeDidChangeForChildContentContainer:")
    public void preferredContentSizeDidChangeForChildContentContainer(UIContentContainer container) {}
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("systemLayoutFittingSizeDidChangeForChildContentContainer:")
    public void systemLayoutFittingSizeDidChangeForChildContentContainer(UIContentContainer container) {}
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("sizeForChildContentContainer:withParentContainerSize:")
    public @ByVal CGSize sizeForChildContentContainer(UIContentContainer container, @ByVal CGSize parentSize) { return null; }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("viewWillTransitionToSize:withTransitionCoordinator:")
    public void viewWillTransitionToSize(@ByVal CGSize size, UIViewControllerTransitionCoordinator coordinator) {}
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("willTransitionToTraitCollection:withTransitionCoordinator:")
    public void willTransitionToTraitCollection(UITraitCollection newCollection, UIViewControllerTransitionCoordinator coordinator) {}
    /*</methods>*/
}
