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
package org.robovm.apple.webkit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.security.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("WebKit") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/WKWebExtensionPermission/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WKWebExtensionPermission/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/WKWebExtensionPermission/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static WKWebExtensionPermission toObject(Class<WKWebExtensionPermission> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return WKWebExtensionPermission.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(WKWebExtensionPermission o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<WKWebExtensionPermission> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<WKWebExtensionPermission> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(WKWebExtensionPermission.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<WKWebExtensionPermission> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (WKWebExtensionPermission o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 18.4 and later.
     */
    public static final WKWebExtensionPermission ActiveTab = new WKWebExtensionPermission("ActiveTab");
    /**
     * @since Available in iOS 18.4 and later.
     */
    public static final WKWebExtensionPermission Alarms = new WKWebExtensionPermission("Alarms");
    /**
     * @since Available in iOS 18.4 and later.
     */
    public static final WKWebExtensionPermission ClipboardWrite = new WKWebExtensionPermission("ClipboardWrite");
    /**
     * @since Available in iOS 18.4 and later.
     */
    public static final WKWebExtensionPermission ContextMenus = new WKWebExtensionPermission("ContextMenus");
    /**
     * @since Available in iOS 18.4 and later.
     */
    public static final WKWebExtensionPermission Cookies = new WKWebExtensionPermission("Cookies");
    /**
     * @since Available in iOS 18.4 and later.
     */
    public static final WKWebExtensionPermission DeclarativeNetRequest = new WKWebExtensionPermission("DeclarativeNetRequest");
    /**
     * @since Available in iOS 18.4 and later.
     */
    public static final WKWebExtensionPermission DeclarativeNetRequestFeedback = new WKWebExtensionPermission("DeclarativeNetRequestFeedback");
    /**
     * @since Available in iOS 18.4 and later.
     */
    public static final WKWebExtensionPermission DeclarativeNetRequestWithHostAccess = new WKWebExtensionPermission("DeclarativeNetRequestWithHostAccess");
    /**
     * @since Available in iOS 18.4 and later.
     */
    public static final WKWebExtensionPermission Menus = new WKWebExtensionPermission("Menus");
    /**
     * @since Available in iOS 18.4 and later.
     */
    public static final WKWebExtensionPermission NativeMessaging = new WKWebExtensionPermission("NativeMessaging");
    /**
     * @since Available in iOS 18.4 and later.
     */
    public static final WKWebExtensionPermission Scripting = new WKWebExtensionPermission("Scripting");
    /**
     * @since Available in iOS 18.4 and later.
     */
    public static final WKWebExtensionPermission Storage = new WKWebExtensionPermission("Storage");
    /**
     * @since Available in iOS 18.4 and later.
     */
    public static final WKWebExtensionPermission Tabs = new WKWebExtensionPermission("Tabs");
    /**
     * @since Available in iOS 18.4 and later.
     */
    public static final WKWebExtensionPermission UnlimitedStorage = new WKWebExtensionPermission("UnlimitedStorage");
    /**
     * @since Available in iOS 18.4 and later.
     */
    public static final WKWebExtensionPermission WebNavigation = new WKWebExtensionPermission("WebNavigation");
    /**
     * @since Available in iOS 18.4 and later.
     */
    public static final WKWebExtensionPermission WebRequest = new WKWebExtensionPermission("WebRequest");
    /*</constants>*/
    
    private static /*<name>*/WKWebExtensionPermission/*</name>*/[] values = new /*<name>*/WKWebExtensionPermission/*</name>*/[] {/*<value_list>*/ActiveTab, Alarms, ClipboardWrite, ContextMenus, Cookies, DeclarativeNetRequest, DeclarativeNetRequestFeedback, DeclarativeNetRequestWithHostAccess, Menus, NativeMessaging, Scripting, Storage, Tabs, UnlimitedStorage, WebNavigation, WebRequest/*</value_list>*/};
    
    /*<name>*/WKWebExtensionPermission/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/WKWebExtensionPermission/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/WKWebExtensionPermission/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/WKWebExtensionPermission/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("WebKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 18.4 and later.
         */
        @GlobalValue(symbol="WKWebExtensionPermissionActiveTab", optional=true)
        public static native NSString ActiveTab();
        /**
         * @since Available in iOS 18.4 and later.
         */
        @GlobalValue(symbol="WKWebExtensionPermissionAlarms", optional=true)
        public static native NSString Alarms();
        /**
         * @since Available in iOS 18.4 and later.
         */
        @GlobalValue(symbol="WKWebExtensionPermissionClipboardWrite", optional=true)
        public static native NSString ClipboardWrite();
        /**
         * @since Available in iOS 18.4 and later.
         */
        @GlobalValue(symbol="WKWebExtensionPermissionContextMenus", optional=true)
        public static native NSString ContextMenus();
        /**
         * @since Available in iOS 18.4 and later.
         */
        @GlobalValue(symbol="WKWebExtensionPermissionCookies", optional=true)
        public static native NSString Cookies();
        /**
         * @since Available in iOS 18.4 and later.
         */
        @GlobalValue(symbol="WKWebExtensionPermissionDeclarativeNetRequest", optional=true)
        public static native NSString DeclarativeNetRequest();
        /**
         * @since Available in iOS 18.4 and later.
         */
        @GlobalValue(symbol="WKWebExtensionPermissionDeclarativeNetRequestFeedback", optional=true)
        public static native NSString DeclarativeNetRequestFeedback();
        /**
         * @since Available in iOS 18.4 and later.
         */
        @GlobalValue(symbol="WKWebExtensionPermissionDeclarativeNetRequestWithHostAccess", optional=true)
        public static native NSString DeclarativeNetRequestWithHostAccess();
        /**
         * @since Available in iOS 18.4 and later.
         */
        @GlobalValue(symbol="WKWebExtensionPermissionMenus", optional=true)
        public static native NSString Menus();
        /**
         * @since Available in iOS 18.4 and later.
         */
        @GlobalValue(symbol="WKWebExtensionPermissionNativeMessaging", optional=true)
        public static native NSString NativeMessaging();
        /**
         * @since Available in iOS 18.4 and later.
         */
        @GlobalValue(symbol="WKWebExtensionPermissionScripting", optional=true)
        public static native NSString Scripting();
        /**
         * @since Available in iOS 18.4 and later.
         */
        @GlobalValue(symbol="WKWebExtensionPermissionStorage", optional=true)
        public static native NSString Storage();
        /**
         * @since Available in iOS 18.4 and later.
         */
        @GlobalValue(symbol="WKWebExtensionPermissionTabs", optional=true)
        public static native NSString Tabs();
        /**
         * @since Available in iOS 18.4 and later.
         */
        @GlobalValue(symbol="WKWebExtensionPermissionUnlimitedStorage", optional=true)
        public static native NSString UnlimitedStorage();
        /**
         * @since Available in iOS 18.4 and later.
         */
        @GlobalValue(symbol="WKWebExtensionPermissionWebNavigation", optional=true)
        public static native NSString WebNavigation();
        /**
         * @since Available in iOS 18.4 and later.
         */
        @GlobalValue(symbol="WKWebExtensionPermissionWebRequest", optional=true)
        public static native NSString WebRequest();
        /*</values>*/
    }
}
