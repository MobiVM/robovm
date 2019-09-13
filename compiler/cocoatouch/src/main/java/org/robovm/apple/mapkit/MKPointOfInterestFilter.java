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
package org.robovm.apple.mapkit;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MapKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKPointOfInterestFilter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MKPointOfInterestFilterPtr extends Ptr<MKPointOfInterestFilter, MKPointOfInterestFilterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MKPointOfInterestFilter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MKPointOfInterestFilter() {}
    protected MKPointOfInterestFilter(Handle h, long handle) { super(h, handle); }
    protected MKPointOfInterestFilter(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initIncludingCategories:")
    public static  MKPointOfInterestFilter createIncludingCategories(NSArray<NSString> categories) {
       MKPointOfInterestFilter res = new MKPointOfInterestFilter((SkipInit) null);
       res.initObject(res.initIncludingCategories(categories));
       return res;
    }
    @Method(selector = "initExcludingCategories:")
    public static  MKPointOfInterestFilter createExcludingCategories(NSArray<NSString> categories) {
       MKPointOfInterestFilter res = new MKPointOfInterestFilter((SkipInit) null);
       res.initObject(res.initExcludingCategories(categories));
       return res;
    }
    @Method(selector = "initWithCoder:")
    public MKPointOfInterestFilter(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "filterIncludingAllCategories")
    public static native MKPointOfInterestFilter getFilterIncludingAllCategories();
    @Property(selector = "filterExcludingAllCategories")
    public static native MKPointOfInterestFilter getFilterExcludingAllCategories();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initIncludingCategories:")
    protected native @Pointer long initIncludingCategories(NSArray<NSString> categories);
    @Method(selector = "initExcludingCategories:")
    protected native @Pointer long initExcludingCategories(NSArray<NSString> categories);
    @Method(selector = "includesCategory:")
    public native boolean includesCategory(MKPointOfInterestCategory category);
    @Method(selector = "excludesCategory:")
    public native boolean excludesCategory(MKPointOfInterestCategory category);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
