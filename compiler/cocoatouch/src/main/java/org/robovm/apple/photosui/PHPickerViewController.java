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
package org.robovm.apple.photosui;

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
import org.robovm.apple.photos.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PhotosUI") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHPickerViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHPickerViewControllerPtr extends Ptr<PHPickerViewController, PHPickerViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHPickerViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PHPickerViewController() {}
    protected PHPickerViewController(Handle h, long handle) { super(h, handle); }
    protected PHPickerViewController(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithConfiguration:")
    public PHPickerViewController(PHPickerConfiguration configuration) { super((SkipInit) null); initObject(init(configuration)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "configuration")
    public native PHPickerConfiguration getConfiguration();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "delegate")
    public native PHPickerViewControllerDelegate getDelegate();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(PHPickerViewControllerDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithConfiguration:")
    protected native @Pointer long init(PHPickerConfiguration configuration);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "updatePickerUsingConfiguration:")
    public native void updatePickerUsingConfiguration(PHPickerUpdateConfiguration configuration);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "deselectAssetsWithIdentifiers:")
    public native void deselectAssets(NSArray<NSString> identifiers);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "moveAssetWithIdentifier:afterAssetWithIdentifier:")
    public native void moveAsset(String identifier, String afterIdentifier);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "scrollToInitialPosition")
    public native void scrollToInitialPosition();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "zoomIn")
    public native void zoomIn();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "zoomOut")
    public native void zoomOut();
    /*</methods>*/
}
