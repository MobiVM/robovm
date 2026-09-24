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
package org.robovm.apple.accessorysetupkit;

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
import org.robovm.apple.corebluetooth.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AccessorySetupKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASAccessorySession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ASAccessorySessionPtr extends Ptr<ASAccessorySession, ASAccessorySessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ASAccessorySession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ASAccessorySession() {}
    protected ASAccessorySession(Handle h, long handle) { super(h, handle); }
    protected ASAccessorySession(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "accessories")
    public native NSArray<ASAccessory> getAccessories();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "pickerDisplaySettings")
    public native ASPickerDisplaySettings getPickerDisplaySettings();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "setPickerDisplaySettings:")
    public native void setPickerDisplaySettings(ASPickerDisplaySettings v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "activateWithQueue:eventHandler:")
    public native void activate(DispatchQueue queue, @Block VoidBlock1<ASAccessoryEvent> eventHandler);
    @Method(selector = "invalidate")
    public native void invalidate();
    @Method(selector = "showPickerWithCompletionHandler:")
    public native void showPickerWithCompletionHandler$(@Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "showPickerForDisplayItems:completionHandler:")
    public native void showPicker(NSArray<ASPickerDisplayItem> displayItems, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "finishAuthorization:settings:completionHandler:")
    public native void finishAuthorization(ASAccessory accessory, ASAccessorySettings settings, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "failAuthorization:completionHandler:")
    public native void failAuthorization(ASAccessory accessory, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "removeAccessory:completionHandler:")
    public native void removeAccessory(ASAccessory accessory, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "renameAccessory:options:completionHandler:")
    public native void renameAccessory(ASAccessory accessory, ASAccessoryRenameOptions renameOptions, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "updateAuthorization:descriptor:completionHandler:")
    public native void updateAuthorization(ASAccessory accessory, ASDiscoveryDescriptor descriptor, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 26.1 and later.
     */
    @Method(selector = "updatePickerShowingDiscoveredDisplayItems:completionHandler:")
    public native void updatePickerShowingDiscoveredDisplayItems(NSArray<ASDiscoveredDisplayItem> displayItems, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 26.1 and later.
     */
    @Method(selector = "finishPickerDiscovery:")
    public native void finishPickerDiscovery(@Block VoidBlock1<NSError> completionHandler);
    /*</methods>*/
}
