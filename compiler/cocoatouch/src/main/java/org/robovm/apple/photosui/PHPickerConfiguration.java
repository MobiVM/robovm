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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHPickerConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHPickerConfigurationPtr extends Ptr<PHPickerConfiguration, PHPickerConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHPickerConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PHPickerConfiguration() {}
    protected PHPickerConfiguration(Handle h, long handle) { super(h, handle); }
    protected PHPickerConfiguration(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithPhotoLibrary:")
    public PHPickerConfiguration(PHPhotoLibrary photoLibrary) { super((SkipInit) null); initObject(init(photoLibrary)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "preferredAssetRepresentationMode")
    public native PHPickerConfigurationAssetRepresentationMode getPreferredAssetRepresentationMode();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setPreferredAssetRepresentationMode:")
    public native void setPreferredAssetRepresentationMode(PHPickerConfigurationAssetRepresentationMode v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "selection")
    public native PHPickerConfigurationSelection getSelection();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setSelection:")
    public native void setSelection(PHPickerConfigurationSelection v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "selectionLimit")
    public native @MachineSizedSInt long getSelectionLimit();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setSelectionLimit:")
    public native void setSelectionLimit(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "filter")
    public native PHPickerFilter getFilter();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setFilter:")
    public native void setFilter(PHPickerFilter v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "preselectedAssetIdentifiers")
    public native NSArray<NSString> getPreselectedAssetIdentifiers();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setPreselectedAssetIdentifiers:")
    public native void setPreselectedAssetIdentifiers(NSArray<NSString> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "mode")
    public native PHPickerMode getMode();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setMode:")
    public native void setMode(PHPickerMode v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "edgesWithoutContentMargins")
    public native NSDirectionalRectEdge getEdgesWithoutContentMargins();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setEdgesWithoutContentMargins:")
    public native void setEdgesWithoutContentMargins(NSDirectionalRectEdge v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "disabledCapabilities")
    public native PHPickerCapabilities getDisabledCapabilities();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setDisabledCapabilities:")
    public native void setDisabledCapabilities(PHPickerCapabilities v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithPhotoLibrary:")
    protected native @Pointer long init(PHPhotoLibrary photoLibrary);
    /*</methods>*/
}
