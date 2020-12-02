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
package org.robovm.apple.carplay;

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
import org.robovm.apple.mapkit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPInformationRatingItem/*</name>*/ 
    extends /*<extends>*/CPInformationItem/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CPInformationRatingItemPtr extends Ptr<CPInformationRatingItem, CPInformationRatingItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPInformationRatingItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPInformationRatingItem() {}
    protected CPInformationRatingItem(Handle h, long handle) { super(h, handle); }
    protected CPInformationRatingItem(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRating:maximumRating:title:detail:")
    public CPInformationRatingItem(NSNumber rating, NSNumber maximumRating, String title, String detail) { super((SkipInit) null); initObject(init(rating, maximumRating, title, detail)); }
    @Method(selector = "initWithTitle:detail:")
    public CPInformationRatingItem(String title, String detail) { super(title, detail); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "rating")
    public native NSNumber getRating();
    @Property(selector = "maximumRating")
    public native NSNumber getMaximumRating();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRating:maximumRating:title:detail:")
    protected native @Pointer long init(NSNumber rating, NSNumber maximumRating, String title, String detail);
    /*</methods>*/
}
