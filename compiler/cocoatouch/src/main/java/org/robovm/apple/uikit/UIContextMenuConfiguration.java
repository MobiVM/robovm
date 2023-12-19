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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIContextMenuConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIContextMenuConfigurationPtr extends Ptr<UIContextMenuConfiguration, UIContextMenuConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIContextMenuConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIContextMenuConfiguration() {}
    protected UIContextMenuConfiguration(Handle h, long handle) { super(h, handle); }
    protected UIContextMenuConfiguration(SkipInit skipInit) { super(skipInit); }
    public UIContextMenuConfiguration(NSObject identifier, @Block Block0<UIViewController> previewProvider, @Block Block1<NSArray<UIMenuElement>, UIMenu> actionProvider) { super((Handle) null, create(identifier, previewProvider, actionProvider)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native NSObject getIdentifier();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "secondaryItemIdentifiers")
    public native NSSet<?> getSecondaryItemIdentifiers();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setSecondaryItemIdentifiers:")
    public native void setSecondaryItemIdentifiers(NSSet<?> v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "badgeCount")
    public native @MachineSizedSInt long getBadgeCount();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setBadgeCount:")
    public native void setBadgeCount(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "preferredMenuElementOrder")
    public native UIContextMenuConfigurationElementOrder getPreferredMenuElementOrder();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setPreferredMenuElementOrder:")
    public native void setPreferredMenuElementOrder(UIContextMenuConfigurationElementOrder v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "configurationWithIdentifier:previewProvider:actionProvider:")
    protected static native @Pointer long create(NSObject identifier, @Block Block0<UIViewController> previewProvider, @Block Block1<NSArray<UIMenuElement>, UIMenu> actionProvider);
    /*</methods>*/
}
