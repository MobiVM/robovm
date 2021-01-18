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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MapKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKLocalSearchCompleter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MKLocalSearchCompleterPtr extends Ptr<MKLocalSearchCompleter, MKLocalSearchCompleterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MKLocalSearchCompleter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MKLocalSearchCompleter() {}
    protected MKLocalSearchCompleter(Handle h, long handle) { super(h, handle); }
    protected MKLocalSearchCompleter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "queryFragment")
    public native String getQueryFragment();
    @Property(selector = "setQueryFragment:")
    public native void setQueryFragment(String v);
    @Property(selector = "region")
    public native @ByVal MKCoordinateRegion getRegion();
    @Property(selector = "setRegion:")
    public native void setRegion(@ByVal MKCoordinateRegion v);
    /**
     * @since Available in iOS 9.3 and later.
     * @deprecated Deprecated in iOS 13.0. Use resultTypes
     */
    @Deprecated
    @Property(selector = "filterType")
    public native MKSearchCompletionFilterType getFilterType();
    /**
     * @since Available in iOS 9.3 and later.
     * @deprecated Deprecated in iOS 13.0. Use resultTypes
     */
    @Deprecated
    @Property(selector = "setFilterType:")
    public native void setFilterType(MKSearchCompletionFilterType v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "resultTypes")
    public native MKLocalSearchCompleterResultType getResultTypes();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setResultTypes:")
    public native void setResultTypes(MKLocalSearchCompleterResultType v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "pointOfInterestFilter")
    public native MKPointOfInterestFilter getPointOfInterestFilter();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setPointOfInterestFilter:")
    public native void setPointOfInterestFilter(MKPointOfInterestFilter v);
    @Property(selector = "delegate")
    public native MKLocalSearchCompleterDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MKLocalSearchCompleterDelegate v);
    @Property(selector = "results")
    public native NSArray<MKLocalSearchCompletion> getResults();
    @Property(selector = "isSearching")
    public native boolean isSearching();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "cancel")
    public native void cancel();
    /*</methods>*/
}
