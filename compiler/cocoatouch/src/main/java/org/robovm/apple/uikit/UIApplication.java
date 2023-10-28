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
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIApplication/*</name>*/ 
    extends /*<extends>*/UIResponder/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 4.0 and later.
         */
        public static NSObject observeDidEnterBackground(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidEnterBackgroundNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        /**
         * @since Available in iOS 4.0 and later.
         */
        public static NSObject observeWillEnterForeground(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(WillEnterForegroundNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        public static NSObject observeDidFinishLaunching(final VoidBlock1<UIApplicationLaunchOptions> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidFinishLaunchingNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    if (a.getUserInfo() != null) {
                        block.invoke(new UIApplicationLaunchOptions(a.getUserInfo()));
                    } else {
                        block.invoke(null);
                    }
                }
            });
        }
        public static NSObject observeDidBecomeActive(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidBecomeActiveNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        public static NSObject observeWillResignActive(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(WillResignActiveNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        public static NSObject observeDidReceiveMemoryWarning(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidReceiveMemoryWarningNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        public static NSObject observeWillTerminate(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(WillTerminateNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        public static NSObject observeSignificantTimeChange(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(SignificantTimeChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        public static NSObject observeWillChangeStatusBarOrientation(final VoidBlock1<UIInterfaceOrientation> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(WillChangeStatusBarOrientationNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    NSNumber val = (NSNumber)a.getUserInfo().get(StatusBarOrientationUserInfoKey());
                    block.invoke(UIInterfaceOrientation.valueOf(val.intValue()));
                }
            });
        }
        public static NSObject observeDidChangeStatusBarOrientation(final VoidBlock1<UIInterfaceOrientation> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidChangeStatusBarOrientationNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    NSNumber val = (NSNumber)a.getUserInfo().get(StatusBarOrientationUserInfoKey());
                    block.invoke(UIInterfaceOrientation.valueOf(val.intValue()));
                }
            });
        }
        public static NSObject observeWillChangeStatusBarFrame(final VoidBlock1<CGRect> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(WillChangeStatusBarFrameNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    NSValue val = (NSValue)a.getUserInfo().get(StatusBarFrameUserInfoKey());
                    block.invoke(NSValueExtensions.getRectValue(val));
                }
            });
        }
        public static NSObject observeDidChangeStatusBarFrame(final VoidBlock1<CGRect> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidChangeStatusBarFrameNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    NSValue val = (NSValue)a.getUserInfo().get(StatusBarFrameUserInfoKey());
                    block.invoke(NSValueExtensions.getRectValue(val));
                }
            });
        }
        /**
         * @since Available in iOS 7.0 and later.
         */
        public static NSObject observeBackgroundRefreshStatusDidChange(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(BackgroundRefreshStatusDidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        /**
         * @since Available in iOS 4.0 and later.
         */
        public static NSObject observeProtectedDataWillBecomeUnavailable(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(ProtectedDataWillBecomeUnavailableNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        /**
         * @since Available in iOS 4.0 and later.
         */
        public static NSObject observeProtectedDataDidBecomeAvailable(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(ProtectedDataDidBecomeAvailableNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        /**
         * @since Available in iOS 7.0 and later.
         */
        public static NSObject observeContentSizeCategoryDidChange(final VoidBlock1<UIContentSizeCategory> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(ContentSizeCategoryDidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    NSString val = (NSString)a.getUserInfo().get(ContentSizeCategoryNewValueKey());
                    block.invoke(UIContentSizeCategory.valueOf(val));
                }
            });
        }
        /**
         * @since Available in iOS 7.0 and later.
         */
        public static NSObject observeUserDidTakeScreenshot(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(UserDidTakeScreenshotNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
    }
    
    /*<ptr>*/public static class UIApplicationPtr extends Ptr<UIApplication, UIApplicationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIApplication.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIApplication() {}
    protected UIApplication(Handle h, long handle) { super(h, handle); }
    protected UIApplication(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedApplication")
    public static native UIApplication getSharedApplication();
    @Property(selector = "delegate")
    public native UIApplicationDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIApplicationDelegate v);
    /**
     * @deprecated Deprecated in iOS 13.0. Use UIView's userInteractionEnabled property instead
     */
    @Deprecated
    @Property(selector = "isIgnoringInteractionEvents")
    public native boolean isIgnoringInteractionEvents();
    @Property(selector = "isIdleTimerDisabled")
    public native boolean isIdleTimerDisabled();
    @Property(selector = "setIdleTimerDisabled:")
    public native void setIdleTimerDisabled(boolean v);
    /**
     * @deprecated Deprecated in iOS 13.0. Should not be used for applications that support multiple scenes as it returns a key window across all connected scenes
     */
    @Deprecated
    @Property(selector = "keyWindow")
    public native UIWindow getKeyWindow();
    /**
     * @deprecated Deprecated in iOS 15.0. Use UIWindowScene.windows on a relevant window scene instead
     */
    @Deprecated
    @Property(selector = "windows")
    public native NSArray<UIWindow> getWindows();
    /**
     * @deprecated Deprecated in iOS 13.0. Provide a custom network activity UI in your app if desired.
     */
    @Deprecated
    @Property(selector = "isNetworkActivityIndicatorVisible")
    public native boolean isNetworkActivityIndicatorVisible();
    /**
     * @deprecated Deprecated in iOS 13.0. Provide a custom network activity UI in your app if desired.
     */
    @Deprecated
    @Property(selector = "setNetworkActivityIndicatorVisible:")
    public native void setNetworkActivityIndicatorVisible(boolean v);
    /**
     * @deprecated Deprecated in iOS 13.0. Use the statusBarManager property of the window scene instead.
     */
    @Deprecated
    @Property(selector = "statusBarStyle")
    public native UIStatusBarStyle getStatusBarStyle();
    /**
     * @deprecated Deprecated in iOS 13.0. Use the statusBarManager property of the window scene instead.
     */
    @Deprecated
    @Property(selector = "isStatusBarHidden")
    public native boolean isStatusBarHidden();
    /**
     * @deprecated Deprecated in iOS 13.0. Use the interfaceOrientation property of the window scene instead.
     */
    @Deprecated
    @Property(selector = "statusBarOrientation")
    public native UIInterfaceOrientation getStatusBarOrientation();
    /**
     * @deprecated Deprecated in iOS 13.0. Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @Property(selector = "statusBarOrientationAnimationDuration")
    public native double getStatusBarOrientationAnimationDuration();
    /**
     * @deprecated Deprecated in iOS 13.0. Use the statusBarManager property of the window scene instead.
     */
    @Deprecated
    @Property(selector = "statusBarFrame")
    public native @ByVal CGRect getStatusBarFrame();
    /**
     * @deprecated Deprecated in iOS 17.0. Use -[UNUserNotificationCenter setBadgeCount:withCompletionHandler:] instead.
     */
    @Deprecated
    @Property(selector = "applicationIconBadgeNumber")
    public native @MachineSizedSInt long getApplicationIconBadgeNumber();
    /**
     * @deprecated Deprecated in iOS 17.0. Use -[UNUserNotificationCenter setBadgeCount:withCompletionHandler:] instead.
     */
    @Deprecated
    @Property(selector = "setApplicationIconBadgeNumber:")
    public native void setApplicationIconBadgeNumber(@MachineSizedSInt long v);
    @Property(selector = "applicationSupportsShakeToEdit")
    public native boolean supportsShakeToEdit();
    @Property(selector = "setApplicationSupportsShakeToEdit:")
    public native void setSupportsShakeToEdit(boolean v);
    @Property(selector = "applicationState")
    public native UIApplicationState getApplicationState();
    @Property(selector = "backgroundTimeRemaining")
    public native double getBackgroundTimeRemaining();
    @Property(selector = "backgroundRefreshStatus")
    public native UIBackgroundRefreshStatus getBackgroundRefreshStatus();
    @Property(selector = "isProtectedDataAvailable")
    public native boolean isProtectedDataAvailable();
    @Property(selector = "userInterfaceLayoutDirection")
    public native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection();
    @Property(selector = "preferredContentSizeCategory")
    public native String getPreferredContentSizeCategory();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "connectedScenes")
    public native NSSet<UIScene> getConnectedScenes();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "openSessions")
    public native NSSet<UISceneSession> getOpenSessions();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "supportsMultipleScenes")
    public native boolean supportsMultipleScenes();
    @Property(selector = "isRegisteredForRemoteNotifications")
    public native boolean isRegisteredForRemoteNotifications();
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenter getPendingNotificationRequestsWithCompletionHandler:]
     */
    @Deprecated
    @Property(selector = "scheduledLocalNotifications")
    public native NSArray<UILocalNotification> getScheduledLocalNotifications();
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenter getPendingNotificationRequestsWithCompletionHandler:]
     */
    @Deprecated
    @Property(selector = "setScheduledLocalNotifications:")
    public native void setScheduledLocalNotifications(NSArray<UILocalNotification> v);
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenter getNotificationSettingsWithCompletionHandler:] and -[UNUserNotificationCenter getNotificationCategoriesWithCompletionHandler:]
     */
    @Deprecated
    @Property(selector = "currentUserNotificationSettings")
    public native UIUserNotificationSettings getCurrentUserNotificationSettings();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "shortcutItems")
    public native NSArray<UIApplicationShortcutItem> getShortcutItems();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setShortcutItems:")
    public native void setShortcutItems(NSArray<UIApplicationShortcutItem> v);
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Property(selector = "supportsAlternateIcons")
    public native boolean supportsAlternateIcons();
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Property(selector = "alternateIconName")
    public native String getAlternateIconName();
    /**
     * @deprecated Deprecated in iOS 9.0. Explicit setting of the status bar orientation is more limited in iOS 6.0 and later
     */
    @Deprecated
    @Property(selector = "setStatusBarOrientation:")
    public native void setStatusBarOrientation(UIInterfaceOrientation v);
    /**
     * @deprecated Deprecated in iOS 9.0. Use -[UIViewController preferredStatusBarStyle]
     */
    @Deprecated
    @Property(selector = "setStatusBarStyle:")
    public native void setStatusBarStyle(UIStatusBarStyle v);
    /**
     * @deprecated Deprecated in iOS 9.0. Use -[UIViewController prefersStatusBarHidden]
     */
    @Deprecated
    @Property(selector = "setStatusBarHidden:")
    public native void setStatusBarHidden(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    
    public static <P extends UIApplication, D extends NSObject & UIApplicationDelegate> 
        void main(String[] args, Class<P> principalClass, Class<D> delegateClass) {
        
        int argc = args.length;
        BytePtr.BytePtrPtr argv = null;
        if (argc > 0) {
            argv = Struct.allocate(BytePtr.BytePtrPtr.class, argc);
            for (int i = 0; i < argc; i++) {
                // TODO: Encoding?
                BytePtr arg = BytePtr.toBytePtrAsciiZ(args[i]);
                argv.next(i).set(arg);
            }
        }
        String principalClassName = null;
        if (principalClass != null) {
            principalClassName = ObjCClass.getByType(principalClass).getName();
        }
        String delegateClassName = null;
        if (delegateClass != null) {
            delegateClassName = ObjCClass.getByType(delegateClass).getName();            
        }

        if (System.getenv("ROBOVM_LAUNCH_MODE") == null) {
            if (!(System.err instanceof FoundationLogPrintStream)) {
                System.setErr(new FoundationLogPrintStream());
            }
            if (!(System.out instanceof FoundationLogPrintStream)) {
                System.setOut(new FoundationLogPrintStream());
            }
        }
        
        try {
            preloadClasses();
        } catch (UnsupportedEncodingException e) {
            throw new Error(e);
        }
        
        main(argc, argv, principalClassName, delegateClassName);
    }
    
    /**
     * Preloads classes added during compilation, if any.
     */
    private static void preloadClasses() throws UnsupportedEncodingException {
        byte[] data = VM.getRuntimeData(UIApplication.class.getName() + ".preloadClasses");
        if (data != null) {
            String[] customClasses = new String(data, "UTF8").split(",");
            for (String customClass : customClasses) {
                try {
                    // Register class.
                    @SuppressWarnings("unchecked")
                    Class<? extends ObjCClass> cls = (Class<? extends ObjCClass>) Class.forName(customClass);
                    ObjCClass.registerCustomClass(cls);
                } catch (Throwable t) {
                    Foundation.log("Failed to preload class " + customClass + ": " + t.getMessage());
                    t.printStackTrace();
                }
            }
        }
    }
    
    /*<methods>*/
    @GlobalValue(symbol="UIContentSizeCategoryDidChangeNotification", optional=true)
    public static native NSString ContentSizeCategoryDidChangeNotification();
    @GlobalValue(symbol="UIContentSizeCategoryNewValueKey", optional=true)
    protected static native NSString ContentSizeCategoryNewValueKey();
    @GlobalValue(symbol="UIBackgroundTaskInvalid", optional=true)
    public static native @MachineSizedUInt long getInvalidBackgroundTask();
    /**
     * @deprecated Deprecated in iOS 13.0. Please use PushKit for VoIP applications.
     */
    @Deprecated
    @GlobalValue(symbol="UIMinimumKeepAliveTimeout", optional=true)
    public static native double getMinimumKeepAliveTimeout();
    @GlobalValue(symbol="UIApplicationBackgroundFetchIntervalMinimum", optional=true)
    public static native double getBackgroundFetchIntervalMinimum();
    @GlobalValue(symbol="UIApplicationBackgroundFetchIntervalNever", optional=true)
    public static native double getBackgroundFetchIntervalNever();
    @GlobalValue(symbol="UIApplicationDidEnterBackgroundNotification", optional=true)
    public static native NSString DidEnterBackgroundNotification();
    @GlobalValue(symbol="UIApplicationWillEnterForegroundNotification", optional=true)
    public static native NSString WillEnterForegroundNotification();
    @GlobalValue(symbol="UIApplicationDidFinishLaunchingNotification", optional=true)
    public static native NSString DidFinishLaunchingNotification();
    @GlobalValue(symbol="UIApplicationDidBecomeActiveNotification", optional=true)
    public static native NSString DidBecomeActiveNotification();
    @GlobalValue(symbol="UIApplicationWillResignActiveNotification", optional=true)
    public static native NSString WillResignActiveNotification();
    @GlobalValue(symbol="UIApplicationDidReceiveMemoryWarningNotification", optional=true)
    public static native NSString DidReceiveMemoryWarningNotification();
    @GlobalValue(symbol="UIApplicationWillTerminateNotification", optional=true)
    public static native NSString WillTerminateNotification();
    @GlobalValue(symbol="UIApplicationSignificantTimeChangeNotification", optional=true)
    public static native NSString SignificantTimeChangeNotification();
    /**
     * @deprecated Deprecated in iOS 13.0. Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @GlobalValue(symbol="UIApplicationWillChangeStatusBarOrientationNotification", optional=true)
    public static native NSString WillChangeStatusBarOrientationNotification();
    /**
     * @deprecated Deprecated in iOS 13.0. Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @GlobalValue(symbol="UIApplicationDidChangeStatusBarOrientationNotification", optional=true)
    public static native NSString DidChangeStatusBarOrientationNotification();
    /**
     * @deprecated Deprecated in iOS 13.0. Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @GlobalValue(symbol="UIApplicationStatusBarOrientationUserInfoKey", optional=true)
    protected static native NSString StatusBarOrientationUserInfoKey();
    /**
     * @deprecated Deprecated in iOS 13.0. Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @GlobalValue(symbol="UIApplicationWillChangeStatusBarFrameNotification", optional=true)
    public static native NSString WillChangeStatusBarFrameNotification();
    /**
     * @deprecated Deprecated in iOS 13.0. Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @GlobalValue(symbol="UIApplicationDidChangeStatusBarFrameNotification", optional=true)
    public static native NSString DidChangeStatusBarFrameNotification();
    /**
     * @deprecated Deprecated in iOS 13.0. Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @GlobalValue(symbol="UIApplicationStatusBarFrameUserInfoKey", optional=true)
    protected static native NSString StatusBarFrameUserInfoKey();
    @GlobalValue(symbol="UIApplicationBackgroundRefreshStatusDidChangeNotification", optional=true)
    public static native NSString BackgroundRefreshStatusDidChangeNotification();
    @GlobalValue(symbol="UIApplicationProtectedDataWillBecomeUnavailable", optional=true)
    public static native NSString ProtectedDataWillBecomeUnavailableNotification();
    @GlobalValue(symbol="UIApplicationProtectedDataDidBecomeAvailable", optional=true)
    public static native NSString ProtectedDataDidBecomeAvailableNotification();
    @GlobalValue(symbol="UIApplicationOpenSettingsURLString", optional=true)
    public static native String getOpenSettingsURLString();
    /**
     * @since Available in iOS 15.4 and later.
     */
    @GlobalValue(symbol="UIApplicationOpenNotificationSettingsURLString", optional=true)
    public static native String getOpenNotificationSettingsURLString();
    @GlobalValue(symbol="UIApplicationUserDidTakeScreenshotNotification", optional=true)
    public static native NSString UserDidTakeScreenshotNotification();
    
    @Bridge(symbol="UIApplicationMain", optional=true)
    protected static native int main(int argc, BytePtr.BytePtrPtr argv, String principalClassName, String delegateClassName);
    
    /**
     * @deprecated Deprecated in iOS 13.0. Use UIView's userInteractionEnabled property instead
     */
    @Deprecated
    @Method(selector = "beginIgnoringInteractionEvents")
    public native void beginIgnoringInteractionEvents();
    /**
     * @deprecated Deprecated in iOS 13.0. Use UIView's userInteractionEnabled property instead
     */
    @Deprecated
    @Method(selector = "endIgnoringInteractionEvents")
    public native void endIgnoringInteractionEvents();
    /**
     * @deprecated Deprecated in iOS 10.0. Use openURL:options:completionHandler:
     */
    @Deprecated
    @Method(selector = "openURL:")
    public native boolean openURL(NSURL url);
    @Method(selector = "canOpenURL:")
    public native boolean canOpenURL(NSURL url);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "openURL:options:completionHandler:")
    public native void openURL(NSURL url, UIApplicationOpenURLOptions options, @Block VoidBooleanBlock completion);
    @Method(selector = "sendEvent:")
    public native void sendEvent(UIEvent event);
    @Method(selector = "sendAction:to:from:forEvent:")
    public native boolean sendAction(Selector action, NSObject target, NSObject sender, UIEvent event);
    @Method(selector = "supportedInterfaceOrientationsForWindow:")
    public native UIInterfaceOrientationMask getSupportedInterfaceOrientations(UIWindow window);
    @Method(selector = "beginBackgroundTaskWithExpirationHandler:")
    public native @MachineSizedUInt long beginBackgroundTask(@Block Runnable handler);
    @Method(selector = "beginBackgroundTaskWithName:expirationHandler:")
    public native @MachineSizedUInt long beginBackgroundTask(String taskName, @Block Runnable handler);
    @Method(selector = "endBackgroundTask:")
    public native void endBackgroundTask(@MachineSizedUInt long identifier);
    /**
     * @deprecated Deprecated in iOS 13.0. Use a BGAppRefreshTask in the BackgroundTasks framework instead
     */
    @Deprecated
    @Method(selector = "setMinimumBackgroundFetchInterval:")
    public native void setMinimumBackgroundFetchInterval(double minimumBackgroundFetchInterval);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "activateSceneSessionForRequest:errorHandler:")
    public native void activateSceneSession(UISceneSessionActivationRequest request, @Block VoidBlock1<NSError> errorHandler);
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Please use activateSceneSessionForRequest:errorHandler:
     */
    @Deprecated
    @Method(selector = "requestSceneSessionActivation:userActivity:options:errorHandler:")
    public native void requestSceneSessionActivation(UISceneSession sceneSession, NSUserActivity userActivity, UISceneActivationRequestOptions options, @Block VoidBlock1<NSError> errorHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "requestSceneSessionDestruction:options:errorHandler:")
    public native void requestSceneSessionDestruction(UISceneSession sceneSession, UISceneDestructionRequestOptions options, @Block VoidBlock1<NSError> errorHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "requestSceneSessionRefresh:")
    public native void requestSceneSessionRefresh(UISceneSession sceneSession);
    @Method(selector = "registerForRemoteNotifications")
    public native void registerForRemoteNotifications();
    @Method(selector = "unregisterForRemoteNotifications")
    public native void unregisterForRemoteNotifications();
    /**
     * @deprecated Deprecated in iOS 8.0. Use -[UIApplication registerForRemoteNotifications] and UserNotifications Framework's -[UNUserNotificationCenter requestAuthorizationWithOptions:completionHandler:]
     */
    @Deprecated
    @Method(selector = "registerForRemoteNotificationTypes:")
    public native void registerForRemoteNotificationTypes(UIRemoteNotificationType types);
    /**
     * @deprecated Deprecated in iOS 8.0. Use -[UIApplication isRegisteredForRemoteNotifications] and UserNotifications Framework's -[UNUserNotificationCenter getNotificationSettingsWithCompletionHandler:] to retrieve user-enabled remote notification and user notification settings
     */
    @Deprecated
    @Method(selector = "enabledRemoteNotificationTypes")
    public native UIRemoteNotificationType getEnabledRemoteNotificationTypes();
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenter addNotificationRequest:withCompletionHandler:]
     */
    @Deprecated
    @Method(selector = "presentLocalNotificationNow:")
    public native void presentLocalNotificationNow(UILocalNotification notification);
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenter addNotificationRequest:withCompletionHandler:]
     */
    @Deprecated
    @Method(selector = "scheduleLocalNotification:")
    public native void scheduleLocalNotification(UILocalNotification notification);
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenter removePendingNotificationRequestsWithIdentifiers:]
     */
    @Deprecated
    @Method(selector = "cancelLocalNotification:")
    public native void cancelLocalNotification(UILocalNotification notification);
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenter removeAllPendingNotificationRequests]
     */
    @Deprecated
    @Method(selector = "cancelAllLocalNotifications")
    public native void cancelAllLocalNotifications();
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenter requestAuthorizationWithOptions:completionHandler:] and -[UNUserNotificationCenter setNotificationCategories:]
     */
    @Deprecated
    @Method(selector = "registerUserNotificationSettings:")
    public native void registerUserNotificationSettings(UIUserNotificationSettings notificationSettings);
    @Method(selector = "beginReceivingRemoteControlEvents")
    public native void beginReceivingRemoteControlEvents();
    @Method(selector = "endReceivingRemoteControlEvents")
    public native void endReceivingRemoteControlEvents();
    /**
     * @deprecated Deprecated in iOS 9.0. Newsstand apps now behave like normal apps on SpringBoard
     */
    @Deprecated
    @Method(selector = "setNewsstandIconImage:")
    public native void setNewsstandIconImage(UIImage image);
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Method(selector = "setAlternateIconName:completionHandler:")
    public native void setAlternateIcon(String alternateIconName, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "extendStateRestoration")
    public native void extendStateRestoration();
    @Method(selector = "completeStateRestoration")
    public native void completeStateRestoration();
    @Method(selector = "ignoreSnapshotOnNextApplicationLaunch")
    public native void ignoreSnapshotOnNextApplicationLaunch();
    @Method(selector = "registerObjectForStateRestoration:restorationIdentifier:")
    public static native void registerObjectForStateRestoration(UIStateRestoring object, String restorationIdentifier);
    /**
     * @deprecated Deprecated in iOS 9.0. Explicit setting of the status bar orientation is more limited in iOS 6.0 and later
     */
    @Deprecated
    @Method(selector = "setStatusBarOrientation:animated:")
    public native void setStatusBarOrientation(UIInterfaceOrientation interfaceOrientation, boolean animated);
    /**
     * @deprecated Deprecated in iOS 9.0. Use -[UIViewController preferredStatusBarStyle]
     */
    @Deprecated
    @Method(selector = "setStatusBarStyle:animated:")
    public native void setStatusBarStyle(UIStatusBarStyle statusBarStyle, boolean animated);
    /**
     * @deprecated Deprecated in iOS 9.0. Use -[UIViewController prefersStatusBarHidden]
     */
    @Deprecated
    @Method(selector = "setStatusBarHidden:withAnimation:")
    public native void setStatusBarHidden(boolean hidden, UIStatusBarAnimation animation);
    /**
     * @deprecated Deprecated in iOS 9.0. Please use PushKit for VoIP applications instead of calling this method
     */
    @Deprecated
    @Method(selector = "setKeepAliveTimeout:handler:")
    public native boolean setKeepAliveTimeout(double timeout, @Block Runnable keepAliveHandler);
    /**
     * @deprecated Deprecated in iOS 9.0. Please use PushKit for VoIP applications instead of calling this method
     */
    @Deprecated
    @Method(selector = "clearKeepAliveTimeout")
    public native void clearKeepAliveTimeout();
    /*</methods>*/
}
