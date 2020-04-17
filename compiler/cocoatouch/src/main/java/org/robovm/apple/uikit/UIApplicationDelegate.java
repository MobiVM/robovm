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

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UIApplicationDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "window")
    UIWindow getWindow();
    @Property(selector = "setWindow:")
    void setWindow(UIWindow v);
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "applicationDidFinishLaunching:")
    void didFinishLaunching(UIApplication application);
    @Method(selector = "application:willFinishLaunchingWithOptions:")
    boolean willFinishLaunching(UIApplication application, UIApplicationLaunchOptions launchOptions);
    @Method(selector = "application:didFinishLaunchingWithOptions:")
    boolean didFinishLaunching(UIApplication application, UIApplicationLaunchOptions launchOptions);
    @Method(selector = "applicationDidBecomeActive:")
    void didBecomeActive(UIApplication application);
    @Method(selector = "applicationWillResignActive:")
    void willResignActive(UIApplication application);
    /**
     * @deprecated Deprecated in iOS 9.0. Use application:openURL:options:
     */
    @Deprecated
    @Method(selector = "application:handleOpenURL:")
    boolean handleOpenURL(UIApplication application, NSURL url);
    /**
     * @deprecated Deprecated in iOS 9.0. Use application:openURL:options:
     */
    @Deprecated
    @Method(selector = "application:openURL:sourceApplication:annotation:")
    boolean openURL(UIApplication application, NSURL url, String sourceApplication, NSPropertyList annotation);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "application:openURL:options:")
    boolean openURL(UIApplication app, NSURL url, UIApplicationOpenURLOptions options);
    @Method(selector = "applicationDidReceiveMemoryWarning:")
    void didReceiveMemoryWarning(UIApplication application);
    @Method(selector = "applicationWillTerminate:")
    void willTerminate(UIApplication application);
    @Method(selector = "applicationSignificantTimeChange:")
    void significantTimeChange(UIApplication application);
    /**
     * @deprecated Deprecated in iOS 13.0. Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @Method(selector = "application:willChangeStatusBarOrientation:duration:")
    void willChangeStatusBarOrientation(UIApplication application, UIInterfaceOrientation newStatusBarOrientation, double duration);
    /**
     * @deprecated Deprecated in iOS 13.0. Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @Method(selector = "application:didChangeStatusBarOrientation:")
    void didChangStatusBarOrientation(UIApplication application, UIInterfaceOrientation oldStatusBarOrientation);
    /**
     * @deprecated Deprecated in iOS 13.0. Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @Method(selector = "application:willChangeStatusBarFrame:")
    void willChangeStatusBarFrame(UIApplication application, @ByVal CGRect newStatusBarFrame);
    /**
     * @deprecated Deprecated in iOS 13.0. Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @Method(selector = "application:didChangeStatusBarFrame:")
    void didChangStatusBarFrame(UIApplication application, @ByVal CGRect oldStatusBarFrame);
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenter requestAuthorizationWithOptions:completionHandler:]
     */
    @Deprecated
    @Method(selector = "application:didRegisterUserNotificationSettings:")
    void didRegisterUserNotificationSettings(UIApplication application, UIUserNotificationSettings notificationSettings);
    @Method(selector = "application:didRegisterForRemoteNotificationsWithDeviceToken:")
    void didRegisterForRemoteNotifications(UIApplication application, NSData deviceToken);
    @Method(selector = "application:didFailToRegisterForRemoteNotificationsWithError:")
    void didFailToRegisterForRemoteNotifications(UIApplication application, NSError error);
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate willPresentNotification:withCompletionHandler:] or -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:] for user visible notifications and -[UIApplicationDelegate application:didReceiveRemoteNotification:fetchCompletionHandler:] for silent remote notifications
     */
    @Deprecated
    @Method(selector = "application:didReceiveRemoteNotification:")
    void didReceiveRemoteNotification(UIApplication application, UIRemoteNotification userInfo);
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate willPresentNotification:withCompletionHandler:] or -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    @Method(selector = "application:didReceiveLocalNotification:")
    void didReceiveLocalNotification(UIApplication application, UILocalNotification notification);
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    @Method(selector = "application:handleActionWithIdentifier:forLocalNotification:completionHandler:")
    void handleLocalNotificationAction(UIApplication application, String identifier, UILocalNotification notification, @Block Runnable completionHandler);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    @Method(selector = "application:handleActionWithIdentifier:forRemoteNotification:withResponseInfo:completionHandler:")
    void handleRemoteNotificationAction(UIApplication application, String identifier, UIRemoteNotification userInfo, NSDictionary<?, ?> responseInfo, @Block Runnable completionHandler);
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    @Method(selector = "application:handleActionWithIdentifier:forRemoteNotification:completionHandler:")
    void handleRemoteNotificationAction(UIApplication application, String identifier, UIRemoteNotification userInfo, @Block Runnable completionHandler);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    @Method(selector = "application:handleActionWithIdentifier:forLocalNotification:withResponseInfo:completionHandler:")
    void handleLocalNotificationAction(UIApplication application, String identifier, UILocalNotification notification, NSDictionary<?, ?> responseInfo, @Block Runnable completionHandler);
    @Method(selector = "application:didReceiveRemoteNotification:fetchCompletionHandler:")
    void didReceiveRemoteNotification(UIApplication application, UIRemoteNotification userInfo, @Block VoidBlock1<UIBackgroundFetchResult> completionHandler);
    /**
     * @deprecated Deprecated in iOS 13.0. Use a BGAppRefreshTask in the BackgroundTasks framework instead
     */
    @Deprecated
    @Method(selector = "application:performFetchWithCompletionHandler:")
    void performFetch(UIApplication application, @Block VoidBlock1<UIBackgroundFetchResult> completionHandler);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "application:performActionForShortcutItem:completionHandler:")
    void performAction(UIApplication application, UIApplicationShortcutItem shortcutItem, @Block VoidBooleanBlock completionHandler);
    @Method(selector = "application:handleEventsForBackgroundURLSession:completionHandler:")
    void handleEventsForBackgroundURLSession(UIApplication application, String identifier, @Block Runnable completionHandler);
    /**
     * @since Available in iOS 8.2 and later.
     */
    @Method(selector = "application:handleWatchKitExtensionRequest:reply:")
    void handleWatchKitExtensionRequest(UIApplication application, NSDictionary<?, ?> userInfo, @Block VoidBlock1<NSDictionary<?, ?>> reply);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "applicationShouldRequestHealthAuthorization:")
    void shouldRequestHealthAuthorization(UIApplication application);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "application:handleIntent:completionHandler:")
    void handleIntent(UIApplication application, INIntent intent, @Block VoidBlock1<INIntentResponse> completionHandler);
    @Method(selector = "applicationDidEnterBackground:")
    void didEnterBackground(UIApplication application);
    @Method(selector = "applicationWillEnterForeground:")
    void willEnterForeground(UIApplication application);
    @Method(selector = "applicationProtectedDataWillBecomeUnavailable:")
    void protectedDataWillBecomeUnavailable(UIApplication application);
    @Method(selector = "applicationProtectedDataDidBecomeAvailable:")
    void protectedDataDidBecomeAvailable(UIApplication application);
    @Method(selector = "application:supportedInterfaceOrientationsForWindow:")
    UIInterfaceOrientationMask getSupportedInterfaceOrientations(UIApplication application, UIWindow window);
    @Method(selector = "application:shouldAllowExtensionPointIdentifier:")
    boolean shouldAllowExtensionPointIdentifier(UIApplication application, UIApplicationExtensionPointIdentifier extensionPointIdentifier);
    @Method(selector = "application:viewControllerWithRestorationIdentifierPath:coder:")
    UIViewController getViewController(UIApplication application, @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> identifierComponents, NSCoder coder);
    /**
     * @since Available in iOS 13.2 and later.
     */
    @Method(selector = "application:shouldSaveSecureApplicationState:")
    boolean shouldSaveSecureApplicationState(UIApplication application, NSCoder coder);
    /**
     * @since Available in iOS 13.2 and later.
     */
    @Method(selector = "application:shouldRestoreSecureApplicationState:")
    boolean shouldRestoreSecureApplicationState(UIApplication application, NSCoder coder);
    @Method(selector = "application:willEncodeRestorableStateWithCoder:")
    void willEncodeRestorableState(UIApplication application, NSCoder coder);
    @Method(selector = "application:didDecodeRestorableStateWithCoder:")
    void didDecodeRestorableState(UIApplication application, NSCoder coder);
    /**
     * @deprecated Deprecated in iOS 13.2. Use application:shouldSaveSecureApplicationState: instead
     */
    @Deprecated
    @Method(selector = "application:shouldSaveApplicationState:")
    boolean shouldSaveApplicationState(UIApplication application, NSCoder coder);
    /**
     * @deprecated Deprecated in iOS 13.2. Use application:shouldRestoreSecureApplicationState: instead
     */
    @Deprecated
    @Method(selector = "application:shouldRestoreApplicationState:")
    boolean shouldRestoreApplicationState(UIApplication application, NSCoder coder);
    @Method(selector = "application:willContinueUserActivityWithType:")
    boolean willContinueUserActivity(UIApplication application, String userActivityType);
    @Method(selector = "application:continueUserActivity:restorationHandler:")
    boolean continueUserActivity(UIApplication application, NSUserActivity userActivity, @Block VoidBlock1<NSArray<UIResponder>> restorationHandler);
    @Method(selector = "application:didFailToContinueUserActivityWithType:error:")
    void didFailToContinueUserActivity(UIApplication application, String userActivityType, NSError error);
    @Method(selector = "application:didUpdateUserActivity:")
    void didUpdateUserActivity(UIApplication application, NSUserActivity userActivity);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "application:userDidAcceptCloudKitShareWithMetadata:")
    void didAcceptCloudKitShare(UIApplication application, CKShareMetadata cloudKitShareMetadata);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "application:configurationForConnectingSceneSession:options:")
    UISceneConfiguration getConfigurationForConnectingSceneSession(UIApplication application, UISceneSession connectingSceneSession, UISceneConnectionOptions options);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "application:didDiscardSceneSessions:")
    void didDiscardSceneSessions(UIApplication application, NSSet<UISceneSession> sceneSessions);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
