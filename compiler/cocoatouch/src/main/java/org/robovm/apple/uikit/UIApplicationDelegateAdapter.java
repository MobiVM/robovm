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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIApplicationDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIApplicationDelegate/*</implements>*/ {

    private UIWindow window;

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Override
    public UIWindow getWindow() { 
        return window;
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Override
    public void setWindow(UIWindow window) {
        this.window = window;
    }
    
    @Override
    public void didReceiveMemoryWarning(UIApplication application) {
        /*
         * We have to tell the GC to free some memory when we get a memory warning.
         * Multiple calls to System.gc() will instruct the GC to start his work
         * immediately.
         */
        for (int i = 0; i < 10; i++) {
            System.gc();
        }
    }
    
    /*<methods>*/
    @NotImplemented("applicationDidFinishLaunching:")
    public void didFinishLaunching(UIApplication application) {}
    @NotImplemented("application:willFinishLaunchingWithOptions:")
    public boolean willFinishLaunching(UIApplication application, UIApplicationLaunchOptions launchOptions) { return false; }
    @NotImplemented("application:didFinishLaunchingWithOptions:")
    public boolean didFinishLaunching(UIApplication application, UIApplicationLaunchOptions launchOptions) { return false; }
    @NotImplemented("applicationDidBecomeActive:")
    public void didBecomeActive(UIApplication application) {}
    @NotImplemented("applicationWillResignActive:")
    public void willResignActive(UIApplication application) {}
    /**
     * @deprecated Deprecated in iOS 9.0. Use application:openURL:options:
     */
    @Deprecated
    @NotImplemented("application:handleOpenURL:")
    public boolean handleOpenURL(UIApplication application, NSURL url) { return false; }
    /**
     * @deprecated Deprecated in iOS 9.0. Use application:openURL:options:
     */
    @Deprecated
    @NotImplemented("application:openURL:sourceApplication:annotation:")
    public boolean openURL(UIApplication application, NSURL url, String sourceApplication, NSPropertyList annotation) { return false; }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @NotImplemented("application:openURL:options:")
    public boolean openURL(UIApplication app, NSURL url, UIApplicationOpenURLOptions options) { return false; }
    @NotImplemented("applicationWillTerminate:")
    public void willTerminate(UIApplication application) {}
    @NotImplemented("applicationSignificantTimeChange:")
    public void significantTimeChange(UIApplication application) {}
    /**
     * @deprecated Deprecated in iOS 13.0. Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @NotImplemented("application:willChangeStatusBarOrientation:duration:")
    public void willChangeStatusBarOrientation(UIApplication application, UIInterfaceOrientation newStatusBarOrientation, double duration) {}
    /**
     * @deprecated Deprecated in iOS 13.0. Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @NotImplemented("application:didChangeStatusBarOrientation:")
    public void didChangStatusBarOrientation(UIApplication application, UIInterfaceOrientation oldStatusBarOrientation) {}
    /**
     * @deprecated Deprecated in iOS 13.0. Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @NotImplemented("application:willChangeStatusBarFrame:")
    public void willChangeStatusBarFrame(UIApplication application, @ByVal CGRect newStatusBarFrame) {}
    /**
     * @deprecated Deprecated in iOS 13.0. Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @NotImplemented("application:didChangeStatusBarFrame:")
    public void didChangStatusBarFrame(UIApplication application, @ByVal CGRect oldStatusBarFrame) {}
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenter requestAuthorizationWithOptions:completionHandler:]
     */
    @Deprecated
    @NotImplemented("application:didRegisterUserNotificationSettings:")
    public void didRegisterUserNotificationSettings(UIApplication application, UIUserNotificationSettings notificationSettings) {}
    @NotImplemented("application:didRegisterForRemoteNotificationsWithDeviceToken:")
    public void didRegisterForRemoteNotifications(UIApplication application, NSData deviceToken) {}
    @NotImplemented("application:didFailToRegisterForRemoteNotificationsWithError:")
    public void didFailToRegisterForRemoteNotifications(UIApplication application, NSError error) {}
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate willPresentNotification:withCompletionHandler:] or -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:] for user visible notifications and -[UIApplicationDelegate application:didReceiveRemoteNotification:fetchCompletionHandler:] for silent remote notifications
     */
    @Deprecated
    @NotImplemented("application:didReceiveRemoteNotification:")
    public void didReceiveRemoteNotification(UIApplication application, UIRemoteNotification userInfo) {}
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate willPresentNotification:withCompletionHandler:] or -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    @NotImplemented("application:didReceiveLocalNotification:")
    public void didReceiveLocalNotification(UIApplication application, UILocalNotification notification) {}
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    @NotImplemented("application:handleActionWithIdentifier:forLocalNotification:completionHandler:")
    public void handleLocalNotificationAction(UIApplication application, String identifier, UILocalNotification notification, @Block Runnable completionHandler) {}
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    @NotImplemented("application:handleActionWithIdentifier:forRemoteNotification:withResponseInfo:completionHandler:")
    public void handleRemoteNotificationAction(UIApplication application, String identifier, UIRemoteNotification userInfo, NSDictionary<?, ?> responseInfo, @Block Runnable completionHandler) {}
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    @NotImplemented("application:handleActionWithIdentifier:forRemoteNotification:completionHandler:")
    public void handleRemoteNotificationAction(UIApplication application, String identifier, UIRemoteNotification userInfo, @Block Runnable completionHandler) {}
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    @NotImplemented("application:handleActionWithIdentifier:forLocalNotification:withResponseInfo:completionHandler:")
    public void handleLocalNotificationAction(UIApplication application, String identifier, UILocalNotification notification, NSDictionary<?, ?> responseInfo, @Block Runnable completionHandler) {}
    @NotImplemented("application:didReceiveRemoteNotification:fetchCompletionHandler:")
    public void didReceiveRemoteNotification(UIApplication application, UIRemoteNotification userInfo, @Block VoidBlock1<UIBackgroundFetchResult> completionHandler) {}
    /**
     * @deprecated Deprecated in iOS 13.0. Use a BGAppRefreshTask in the BackgroundTasks framework instead
     */
    @Deprecated
    @NotImplemented("application:performFetchWithCompletionHandler:")
    public void performFetch(UIApplication application, @Block VoidBlock1<UIBackgroundFetchResult> completionHandler) {}
    /**
     * @since Available in iOS 9.0 and later.
     */
    @NotImplemented("application:performActionForShortcutItem:completionHandler:")
    public void performAction(UIApplication application, UIApplicationShortcutItem shortcutItem, @Block VoidBooleanBlock completionHandler) {}
    @NotImplemented("application:handleEventsForBackgroundURLSession:completionHandler:")
    public void handleEventsForBackgroundURLSession(UIApplication application, String identifier, @Block Runnable completionHandler) {}
    /**
     * @since Available in iOS 8.2 and later.
     */
    @NotImplemented("application:handleWatchKitExtensionRequest:reply:")
    public void handleWatchKitExtensionRequest(UIApplication application, NSDictionary<?, ?> userInfo, @Block VoidBlock1<NSDictionary<?, ?>> reply) {}
    /**
     * @since Available in iOS 9.0 and later.
     */
    @NotImplemented("applicationShouldRequestHealthAuthorization:")
    public void shouldRequestHealthAuthorization(UIApplication application) {}
    /**
     * @since Available in iOS 14.0 and later.
     */
    @NotImplemented("application:handlerForIntent:")
    public NSObject getHandlerForIntent(UIApplication application, INIntent intent) { return null; }
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use application:handlerForIntent: instead
     */
    @Deprecated
    @NotImplemented("application:handleIntent:completionHandler:")
    public void handleIntent(UIApplication application, INIntent intent, @Block VoidBlock1<INIntentResponse> completionHandler) {}
    @NotImplemented("applicationDidEnterBackground:")
    public void didEnterBackground(UIApplication application) {}
    @NotImplemented("applicationWillEnterForeground:")
    public void willEnterForeground(UIApplication application) {}
    @NotImplemented("applicationProtectedDataWillBecomeUnavailable:")
    public void protectedDataWillBecomeUnavailable(UIApplication application) {}
    @NotImplemented("applicationProtectedDataDidBecomeAvailable:")
    public void protectedDataDidBecomeAvailable(UIApplication application) {}
    @NotImplemented("application:supportedInterfaceOrientationsForWindow:")
    public UIInterfaceOrientationMask getSupportedInterfaceOrientations(UIApplication application, UIWindow window) { return null; }
    @NotImplemented("application:shouldAllowExtensionPointIdentifier:")
    public boolean shouldAllowExtensionPointIdentifier(UIApplication application, UIApplicationExtensionPointIdentifier extensionPointIdentifier) { return false; }
    @NotImplemented("application:viewControllerWithRestorationIdentifierPath:coder:")
    public UIViewController getViewController(UIApplication application, @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> identifierComponents, NSCoder coder) { return null; }
    /**
     * @since Available in iOS 13.2 and later.
     */
    @NotImplemented("application:shouldSaveSecureApplicationState:")
    public boolean shouldSaveSecureApplicationState(UIApplication application, NSCoder coder) { return false; }
    /**
     * @since Available in iOS 13.2 and later.
     */
    @NotImplemented("application:shouldRestoreSecureApplicationState:")
    public boolean shouldRestoreSecureApplicationState(UIApplication application, NSCoder coder) { return false; }
    @NotImplemented("application:willEncodeRestorableStateWithCoder:")
    public void willEncodeRestorableState(UIApplication application, NSCoder coder) {}
    @NotImplemented("application:didDecodeRestorableStateWithCoder:")
    public void didDecodeRestorableState(UIApplication application, NSCoder coder) {}
    /**
     * @deprecated Deprecated in iOS 13.2. Use application:shouldSaveSecureApplicationState: instead
     */
    @Deprecated
    @NotImplemented("application:shouldSaveApplicationState:")
    public boolean shouldSaveApplicationState(UIApplication application, NSCoder coder) { return false; }
    /**
     * @deprecated Deprecated in iOS 13.2. Use application:shouldRestoreSecureApplicationState: instead
     */
    @Deprecated
    @NotImplemented("application:shouldRestoreApplicationState:")
    public boolean shouldRestoreApplicationState(UIApplication application, NSCoder coder) { return false; }
    @NotImplemented("application:willContinueUserActivityWithType:")
    public boolean willContinueUserActivity(UIApplication application, String userActivityType) { return false; }
    @NotImplemented("application:continueUserActivity:restorationHandler:")
    public boolean continueUserActivity(UIApplication application, NSUserActivity userActivity, @Block VoidBlock1<NSArray<UIResponder>> restorationHandler) { return false; }
    @NotImplemented("application:didFailToContinueUserActivityWithType:error:")
    public void didFailToContinueUserActivity(UIApplication application, String userActivityType, NSError error) {}
    @NotImplemented("application:didUpdateUserActivity:")
    public void didUpdateUserActivity(UIApplication application, NSUserActivity userActivity) {}
    /**
     * @since Available in iOS 10.0 and later.
     */
    @NotImplemented("application:userDidAcceptCloudKitShareWithMetadata:")
    public void didAcceptCloudKitShare(UIApplication application, CKShareMetadata cloudKitShareMetadata) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("application:configurationForConnectingSceneSession:options:")
    public UISceneConfiguration getConfigurationForConnectingSceneSession(UIApplication application, UISceneSession connectingSceneSession, UISceneConnectionOptions options) { return null; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("application:didDiscardSceneSessions:")
    public void didDiscardSceneSessions(UIApplication application, NSSet<UISceneSession> sceneSessions) {}
    /**
     * @since Available in iOS 15.0 and later.
     */
    @NotImplemented("applicationShouldAutomaticallyLocalizeKeyCommands:")
    public boolean applicationShouldAutomaticallyLocalizeKeyCommands(UIApplication application) { return false; }
    /*</methods>*/
}
