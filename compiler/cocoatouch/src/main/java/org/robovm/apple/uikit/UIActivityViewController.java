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
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIActivityViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIActivityViewControllerPtr extends Ptr<UIActivityViewController, UIActivityViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIActivityViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIActivityViewController() {}
    protected UIActivityViewController(Handle h, long handle) { super(h, handle); }
    protected UIActivityViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithActivityItems:applicationActivities:")
    public UIActivityViewController(NSArray<?> activityItems, NSArray<UIActivity> applicationActivities) { super((SkipInit) null); initObject(init(activityItems, applicationActivities)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithActivityItemsConfiguration:")
    public UIActivityViewController(UIActivityItemsConfigurationReading activityItemsConfiguration) { super((SkipInit) null); initObject(init(activityItemsConfiguration)); }
    /*</constructors>*/
    public UIActivityViewController(List<?> activityItems, NSArray<UIActivity> applicationActivities) {
        super((SkipInit) null);
        NSArray<NSObject> items = new NSMutableArray<>();
        for (Object item : activityItems) {
            if (!(item instanceof NSObject)) {
                if (item instanceof String) {
                    items.add(new NSString((String) item));
                } else if (item instanceof Number) {
                    items.add(NSNumber.valueOf((Number) item));
                } else {
                    throw new IllegalArgumentException("Unsupported activity item type: " + item);
                }
            } else {
                items.add((NSObject)item);
            }
        }
        initObject(init(items, applicationActivities));
    }
    /*<properties>*/
    /**
     * @deprecated Deprecated in iOS 8.0. Use completionWithItemsHandler
     */
    @Deprecated
    @Property(selector = "completionHandler")
    public native @Block VoidBlock2<String, Boolean> getCompletionHandler();
    /**
     * @deprecated Deprecated in iOS 8.0. Use completionWithItemsHandler
     */
    @Deprecated
    @Property(selector = "setCompletionHandler:")
    public native void setCompletionHandler(@Block VoidBlock2<String, Boolean> v);
    @Property(selector = "completionWithItemsHandler")
    public native @Block VoidBlock4<String, Boolean, NSArray<NSObject>, NSError> getCompletionWithItemsHandler();
    @Property(selector = "setCompletionWithItemsHandler:")
    public native void setCompletionWithItemsHandler(@Block VoidBlock4<String, Boolean, NSArray<NSObject>, NSError> v);
    @Property(selector = "excludedActivityTypes")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getExcludedActivityTypes();
    @Property(selector = "setExcludedActivityTypes:")
    public native void setExcludedActivityTypes(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> v);
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Property(selector = "allowsProminentActivity")
    public native boolean allowsProminentActivity();
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Property(selector = "setAllowsProminentActivity:")
    public native void setAllowsProminentActivity(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithActivityItems:applicationActivities:")
    protected native @Pointer long init(NSArray<?> activityItems, NSArray<UIActivity> applicationActivities);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithActivityItemsConfiguration:")
    protected native @Pointer long init(UIActivityItemsConfigurationReading activityItemsConfiguration);
    /*</methods>*/
}
