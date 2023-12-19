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
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UIMenuLeaf/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "title")
    String getTitle();
    @Property(selector = "setTitle:")
    void setTitle(String v);
    @Property(selector = "image")
    UIImage getImage();
    @Property(selector = "setImage:")
    void setImage(UIImage v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "selectedImage")
    UIImage getSelectedImage();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setSelectedImage:")
    void setSelectedImage(UIImage v);
    @Property(selector = "discoverabilityTitle")
    String getDiscoverabilityTitle();
    @Property(selector = "setDiscoverabilityTitle:")
    void setDiscoverabilityTitle(String v);
    @Property(selector = "attributes")
    UIMenuElementAttributes getAttributes();
    @Property(selector = "setAttributes:")
    void setAttributes(UIMenuElementAttributes v);
    @Property(selector = "state")
    UIMenuElementState getState();
    @Property(selector = "setState:")
    void setState(UIMenuElementState v);
    @Property(selector = "sender")
    NSObject getSender();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "presentationSourceItem")
    UIPopoverPresentationControllerSourceItem getPresentationSourceItem();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "performWithSender:target:")
    void perform(NSObject sender, NSObject target);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
