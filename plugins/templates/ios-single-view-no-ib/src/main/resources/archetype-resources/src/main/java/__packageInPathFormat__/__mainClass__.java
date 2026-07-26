${package}

import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.uikit.*;
import org.robovm.objc.annotation.CustomClass;
import org.robovm.rt.annotation.ForceLinkClass;

/// note: @ForceLinkClass(Main.SceneDelegate.class) is important here in this setup
///       as there is no reference in Java code to SceneDelegate class and it will be
///       dropped. Options either have @ForceLinkClass annotation or add it to
///       `forceLinkClasses` in robovm.xml.
@ForceLinkClass(Main.SceneDelegate.class)
public class ${mainClass} {

    private static class AppDelegate extends UIApplicationDelegateAdapter {
        @Override
        public boolean didFinishLaunching(UIApplication application, UIApplicationLaunchOptions launchOptions) {
            return true;
        }

//        This method is optional as long as UIApplicationSceneManifest section in Info.plist is configured properly
//        @Override
//        public UISceneConfiguration getConfigurationForConnectingSceneSession(UIApplication application, UISceneSession connectingSceneSession, UISceneConnectionOptions options) {
//            UISceneConfiguration config = new UISceneConfiguration("Default Configuration", connectingSceneSession.getRole());
//            config.setDelegateClass(SceneDelegate.class);
//            return config;
//        }
    }

    /**
     * SceneDelegate.
     * UISceneDelegateClassName section of Info.plist should match its full qualified name,
     * e.g. "${package}.${mainClass}.SceneDelegate" for this class.
     * Note: preload = true in @CustomClass annotation is critical here to make this class
     * discoverably by ObjC runtime.
     */
    @CustomClass(preload = true)
    public static class SceneDelegate extends UIWindowSceneDelegateAdapter {
        private UIWindow window;
        private MyViewController rootViewController;

        @Override
        public void willConnect(UIScene scene, UISceneSession session, UISceneConnectionOptions connectionOptions) {
            if (scene instanceof UIWindowScene) {
                UIWindowScene windowScene = (UIWindowScene) scene;

                // Set up the view controller.
                rootViewController = new MyViewController();

                // Create a new window
                window = new UIWindow(windowScene);
                // Set the view controller as the root controller for the window.
                window.setRootViewController(rootViewController);
                // Make the window visible.
                window.makeKeyAndVisible();
            }
        }
    }


    public static void main(String[] args) {
        try (NSAutoreleasePool pool = new NSAutoreleasePool()) {
            UIApplication.main(args, null, AppDelegate.class);
        }
    }
}
