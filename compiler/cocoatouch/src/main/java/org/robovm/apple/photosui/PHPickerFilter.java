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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHPickerFilter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHPickerFilterPtr extends Ptr<PHPickerFilter, PHPickerFilterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHPickerFilter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PHPickerFilter() {}
    protected PHPickerFilter(Handle h, long handle) { super(h, handle); }
    protected PHPickerFilter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "imagesFilter")
    public static native PHPickerFilter getImagesFilter();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "videosFilter")
    public static native PHPickerFilter getVideosFilter();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "livePhotosFilter")
    public static native PHPickerFilter getLivePhotosFilter();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "anyFilterMatchingSubfilters:")
    public static native PHPickerFilter anyFilterMatchingSubfilters(NSArray<PHPickerFilter> subfilters);
    /*</methods>*/
}
