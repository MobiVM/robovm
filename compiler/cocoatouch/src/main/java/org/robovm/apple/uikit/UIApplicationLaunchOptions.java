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
/*<annotations>*/@Library("UIKit")/*</annotations>*/
@Marshaler(/*<name>*/UIApplicationLaunchOptions/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIApplicationLaunchOptions/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static UIApplicationLaunchOptions toObject(Class<UIApplicationLaunchOptions> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new UIApplicationLaunchOptions(o);
        }
        @MarshalsPointer
        public static long toNative(UIApplicationLaunchOptions o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<UIApplicationLaunchOptions> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<UIApplicationLaunchOptions> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new UIApplicationLaunchOptions(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<UIApplicationLaunchOptions> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (UIApplicationLaunchOptions i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    UIApplicationLaunchOptions(NSDictionary data) {
        super(data);
    }
    public UIApplicationLaunchOptions() {}
    /*</constructors>*/

    /*<methods>*/
    public boolean has(NSString key) {
        return data.containsKey(key);
    }
    public NSObject get(NSString key) {
        if (has(key)) {
            return data.get(key);
        }
        return null;
    }
    public UIApplicationLaunchOptions set(NSString key, NSObject value) {
        data.put(key, value);
        return this;
    }
    

    /**
     * @deprecated Deprecated in iOS 26.0. Use UIScene lifecycle and UIScene.ConnectionOptions.URLContexts instead.
     */
    @Deprecated
    public NSURL getURL() {
        if (has(Keys.URL())) {
            NSURL val = (NSURL) get(Keys.URL());
            return val;
        }
        return null;
    }
    /**
     * @deprecated Deprecated in iOS 26.0. Use UIScene lifecycle and UIScene.ConnectionOptions.URLContexts instead.
     */
    @Deprecated
    public UIApplicationLaunchOptions setURL(NSURL uRL) {
        set(Keys.URL(), uRL);
        return this;
    }
    /**
     * @deprecated Deprecated in iOS 26.0. Use UIScene lifecycle and UIScene.ConnectionOptions.sourceApplication instead.
     */
    @Deprecated
    public String getSourceApplication() {
        if (has(Keys.SourceApplication())) {
            NSString val = (NSString) get(Keys.SourceApplication());
            return val.toString();
        }
        return null;
    }
    /**
     * @deprecated Deprecated in iOS 26.0. Use UIScene lifecycle and UIScene.ConnectionOptions.sourceApplication instead.
     */
    @Deprecated
    public UIApplicationLaunchOptions setSourceApplication(String sourceApplication) {
        set(Keys.SourceApplication(), new NSString(sourceApplication));
        return this;
    }
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    public UILocalNotification getLocalNotification() {
        if (has(Keys.LocalNotification())) {
            UILocalNotification val = (UILocalNotification) get(Keys.LocalNotification());
            return val;
        }
        return null;
    }
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    public UIApplicationLaunchOptions setLocalNotification(UILocalNotification localNotification) {
        set(Keys.LocalNotification(), localNotification);
        return this;
    }
    /**
     * @deprecated Deprecated in iOS 16.0. This dictionary key is no longer used.
     */
    @Deprecated
    public NSObject getAnnotation() {
        if (has(Keys.Annotation())) {
            NSObject val = (NSObject) get(Keys.Annotation());
            return val;
        }
        return null;
    }
    /**
     * @deprecated Deprecated in iOS 16.0. This dictionary key is no longer used.
     */
    @Deprecated
    public UIApplicationLaunchOptions setAnnotation(NSObject annotation) {
        set(Keys.Annotation(), annotation);
        return this;
    }
    /**
     * @deprecated Deprecated in iOS 26.0. Adopt CLLocationUpdate or CLMonitor, or use CLLocationManagerDelegate from CoreLocation to handle expected location events after scene connection.
     */
    @Deprecated
    public boolean isLocationStart() {
        if (has(Keys.Location())) {
            NSNumber val = (NSNumber) get(Keys.Location());
            return val.booleanValue();
        }
        return false;
    }
    /**
     * @deprecated Deprecated in iOS 26.0. Adopt CLLocationUpdate or CLMonitor, or use CLLocationManagerDelegate from CoreLocation to handle expected location events after scene connection.
     */
    @Deprecated
    public UIApplicationLaunchOptions setLocationStart(boolean locationStart) {
        set(Keys.Location(), NSNumber.valueOf(locationStart));
        return this;
    }
    /**
     * @deprecated Deprecated in iOS 26.0. This dictionary key is no longer used.
     */
    @Deprecated
    public List<String> getNewsstandDownloadIdentifiers() {
        if (has(Keys.NewsstandDownloads())) {
            NSArray<NSString> val = (NSArray<NSString>) get(Keys.NewsstandDownloads());
            return val.asStringList();
        }
        return null;
    }
    /**
     * @deprecated Deprecated in iOS 26.0. This dictionary key is no longer used.
     */
    @Deprecated
    public UIApplicationLaunchOptions setNewsstandDownloadIdentifiers(List<String> newsstandDownloadIdentifiers) {
        set(Keys.NewsstandDownloads(), NSArray.fromStrings(newsstandDownloadIdentifiers));
        return this;
    }
    /**
     * @deprecated Deprecated in iOS 26.0. Store restoration identifiers and reinstantiate central managers with those identifiers on app launch to resume previous functionality.
     */
    @Deprecated
    public List<String> getBluetoothCentralIdentifiers() {
        if (has(Keys.BluetoothCentrals())) {
            NSArray<NSString> val = (NSArray<NSString>) get(Keys.BluetoothCentrals());
            return val.asStringList();
        }
        return null;
    }
    /**
     * @deprecated Deprecated in iOS 26.0. Store restoration identifiers and reinstantiate central managers with those identifiers on app launch to resume previous functionality.
     */
    @Deprecated
    public UIApplicationLaunchOptions setBluetoothCentralIdentifiers(List<String> bluetoothCentralIdentifiers) {
        set(Keys.BluetoothCentrals(), NSArray.fromStrings(bluetoothCentralIdentifiers));
        return this;
    }
    /**
     * @deprecated Deprecated in iOS 26.0. Store restoration identifiers and reinstantiate peripheral managers with those identifiers on app launch to resume previous functionality.
     */
    @Deprecated
    public List<String> getBluetoothPeripheralIdentifiers() {
        if (has(Keys.BluetoothPeripherals())) {
            NSArray<NSString> val = (NSArray<NSString>) get(Keys.BluetoothPeripherals());
            return val.asStringList();
        }
        return null;
    }
    /**
     * @deprecated Deprecated in iOS 26.0. Store restoration identifiers and reinstantiate peripheral managers with those identifiers on app launch to resume previous functionality.
     */
    @Deprecated
    public UIApplicationLaunchOptions setBluetoothPeripheralIdentifiers(List<String> bluetoothPeripheralIdentifiers) {
        set(Keys.BluetoothPeripherals(), NSArray.fromStrings(bluetoothPeripheralIdentifiers));
        return this;
    }
    /**
     * @deprecated Deprecated in iOS 26.0. Use UIScene lifecycle and UIScene.ConnectionOptions.shortcutItem instead.
     */
    @Deprecated
    public UIApplicationShortcutItem getShortcutItem() {
        if (has(Keys.ShortcutItem())) {
            UIApplicationShortcutItem val = (UIApplicationShortcutItem) get(Keys.ShortcutItem());
            return val;
        }
        return null;
    }
    /**
     * @deprecated Deprecated in iOS 26.0. Use UIScene lifecycle and UIScene.ConnectionOptions.shortcutItem instead.
     */
    @Deprecated
    public UIApplicationLaunchOptions setShortcutItem(UIApplicationShortcutItem shortcutItem) {
        set(Keys.ShortcutItem(), shortcutItem);
        return this;
    }
    /**
     * @deprecated Deprecated in iOS 26.0. Use UIScene lifecycle and UIScene.ConnectionOptions.userActivities instead.
     */
    @Deprecated
    public UIApplicationLaunchOptionsUserActivityInfo getUserActivityInfo() {
        if (has(Keys.UserActivityDictionary())) {
            NSDictionary val = (NSDictionary) get(Keys.UserActivityDictionary());
            return new UIApplicationLaunchOptionsUserActivityInfo(val);
        }
        return null;
    }
    /**
     * @deprecated Deprecated in iOS 26.0. Use UIScene lifecycle and UIScene.ConnectionOptions.userActivities instead.
     */
    @Deprecated
    public UIApplicationLaunchOptions setUserActivityInfo(UIApplicationLaunchOptionsUserActivityInfo userActivityInfo) {
        set(Keys.UserActivityDictionary(), userActivityInfo.getDictionary());
        return this;
    }
    /*</methods>*/
    /**
     * @since Available in iOS 3.0 and later.
     */
    public UIRemoteNotification getRemoteNotification() {
        if (has(Keys.RemoteNotification())) {
            NSDictionary<NSString, NSObject> val = (NSDictionary<NSString, NSObject>) get(Keys.RemoteNotification());
            return new UIRemoteNotification(val);
        }
        return null;
    }
    
    /*<keys>*/
    @Library("UIKit")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        /**
         * @deprecated Deprecated in iOS 26.0. Use UIScene lifecycle and UIScene.ConnectionOptions.URLContexts instead.
         */
        @Deprecated
        @GlobalValue(symbol="UIApplicationLaunchOptionsURLKey", optional=true)
        public static native NSString URL();
        /**
         * @deprecated Deprecated in iOS 26.0. Use UIScene lifecycle and UIScene.ConnectionOptions.sourceApplication instead.
         */
        @Deprecated
        @GlobalValue(symbol="UIApplicationLaunchOptionsSourceApplicationKey", optional=true)
        public static native NSString SourceApplication();
        /**
         * @deprecated Deprecated in iOS 26.0. Continue using UIApplicationDelegate's application(_:didReceiveRemoteNotification:fetchCompletionHandler:) to process silent remote notifications after scene connection.
         */
        @Deprecated
        @GlobalValue(symbol="UIApplicationLaunchOptionsRemoteNotificationKey", optional=true)
        public static native NSString RemoteNotification();
        /**
         * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:]
         */
        @Deprecated
        @GlobalValue(symbol="UIApplicationLaunchOptionsLocalNotificationKey", optional=true)
        public static native NSString LocalNotification();
        /**
         * @deprecated Deprecated in iOS 16.0. This dictionary key is no longer used.
         */
        @Deprecated
        @GlobalValue(symbol="UIApplicationLaunchOptionsAnnotationKey", optional=true)
        public static native NSString Annotation();
        /**
         * @deprecated Deprecated in iOS 26.0. Adopt CLLocationUpdate or CLMonitor, or use CLLocationManagerDelegate from CoreLocation to handle expected location events after scene connection.
         */
        @Deprecated
        @GlobalValue(symbol="UIApplicationLaunchOptionsLocationKey", optional=true)
        public static native NSString Location();
        /**
         * @deprecated Deprecated in iOS 26.0. This dictionary key is no longer used.
         */
        @Deprecated
        @GlobalValue(symbol="UIApplicationLaunchOptionsNewsstandDownloadsKey", optional=true)
        public static native NSString NewsstandDownloads();
        /**
         * @deprecated Deprecated in iOS 26.0. Store restoration identifiers and reinstantiate central managers with those identifiers on app launch to resume previous functionality.
         */
        @Deprecated
        @GlobalValue(symbol="UIApplicationLaunchOptionsBluetoothCentralsKey", optional=true)
        public static native NSString BluetoothCentrals();
        /**
         * @deprecated Deprecated in iOS 26.0. Store restoration identifiers and reinstantiate peripheral managers with those identifiers on app launch to resume previous functionality.
         */
        @Deprecated
        @GlobalValue(symbol="UIApplicationLaunchOptionsBluetoothPeripheralsKey", optional=true)
        public static native NSString BluetoothPeripherals();
        /**
         * @deprecated Deprecated in iOS 26.0. Use UIScene lifecycle and UIScene.ConnectionOptions.shortcutItem instead.
         */
        @Deprecated
        @GlobalValue(symbol="UIApplicationLaunchOptionsShortcutItemKey", optional=true)
        public static native NSString ShortcutItem();
        /**
         * @since Available in iOS 14.5 and later.
         * @deprecated Deprecated in iOS 26.0. Use UIScene lifecycle and UIScene.ConnectionOptions.eventAttribution instead.
         */
        @Deprecated
        @GlobalValue(symbol="UIApplicationLaunchOptionsEventAttributionKey", optional=true)
        public static native NSString EventAttribution();
        /**
         * @deprecated Deprecated in iOS 26.0. Use UIScene lifecycle and UIScene.ConnectionOptions.userActivities instead.
         */
        @Deprecated
        @GlobalValue(symbol="UIApplicationLaunchOptionsUserActivityDictionaryKey", optional=true)
        public static native NSString UserActivityDictionary();
        /**
         * @since Available in iOS 10.0 and later.
         * @deprecated Deprecated in iOS 26.0. Use UIScene lifecycle and UIScene.ConnectionOptions.cloudKitShareMetadata instead.
         */
        @Deprecated
        @GlobalValue(symbol="UIApplicationLaunchOptionsCloudKitShareMetadataKey", optional=true)
        public static native NSString CloudKitShareMetadata();
    }
    /*</keys>*/
}
