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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIWindowScene/*</name>*/ 
    extends /*<extends>*/UIScene/*</extends>*/ 
    /*<implements>*/implements UITraitEnvironment, UITraitChangeObservable/*</implements>*/ {

    /*<ptr>*/public static class UIWindowScenePtr extends Ptr<UIWindowScene, UIWindowScenePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIWindowScene.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIWindowScene() {}
    protected UIWindowScene(Handle h, long handle) { super(h, handle); }
    protected UIWindowScene(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSession:connectionOptions:")
    public UIWindowScene(UISceneSession session, UISceneConnectionOptions connectionOptions) { super(session, connectionOptions); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "screen")
    public native UIScreen getScreen();
    @Property(selector = "interfaceOrientation")
    public native UIInterfaceOrientation getInterfaceOrientation();
    @Property(selector = "coordinateSpace")
    public native UICoordinateSpace getCoordinateSpace();
    @Property(selector = "traitCollection")
    public native UITraitCollection getTraitCollection();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "effectiveGeometry")
    public native UIWindowSceneGeometry getEffectiveGeometry();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "sizeRestrictions")
    public native UISceneSizeRestrictions getSizeRestrictions();
    @Property(selector = "windows")
    public native NSArray<UIWindow> getWindows();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "keyWindow")
    public native UIWindow getKeyWindow();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "activityItemsConfigurationSource")
    public native UIActivityItemsConfigurationProviding getActivityItemsConfigurationSource();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setActivityItemsConfigurationSource:", strongRef = true)
    public native void setActivityItemsConfigurationSource(UIActivityItemsConfigurationProviding v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "windowingBehaviors")
    public native UISceneWindowingBehaviors getWindowingBehaviors();
    @Property(selector = "isFullScreen")
    public native boolean isFullScreen();
    @Property(selector = "traitOverrides")
    public native UITraitOverrides getTraitOverrides();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "focusSystem")
    public native UIFocusSystem getFocusSystem();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "statusBarManager")
    public native UIStatusBarManager getStatusBarManager();
    @Property(selector = "screenshotService")
    public native UIScreenshotService getScreenshotService();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "requestGeometryUpdateWithPreferences:errorHandler:")
    public native void requestGeometryUpdate(UIWindowSceneGeometryPreferences geometryPreferences, @Block VoidBlock1<NSError> errorHandler);
    /**
     * @deprecated Deprecated in iOS 17.0. Use the trait change registration APIs declared in the UITraitChangeObservable protocol
     */
    @Deprecated
    @Method(selector = "traitCollectionDidChange:")
    public native void traitCollectionDidChange(UITraitCollection previousTraitCollection);
    @Method(selector = "unregisterForTraitChanges:")
    public native void unregisterForTraitChanges(UITraitChangeRegistration registration);
    /*</methods>*/
}
