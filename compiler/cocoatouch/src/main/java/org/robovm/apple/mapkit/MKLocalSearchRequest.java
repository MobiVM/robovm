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

/*</javadoc>*/
/*<annotations>*/@Library("MapKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKLocalSearchRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MKLocalSearchRequestPtr extends Ptr<MKLocalSearchRequest, MKLocalSearchRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MKLocalSearchRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MKLocalSearchRequest() {}
    protected MKLocalSearchRequest(Handle h, long handle) { super(h, handle); }
    protected MKLocalSearchRequest(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithNaturalLanguageQuery:")
    public MKLocalSearchRequest(String naturalLanguageQuery) { super((SkipInit) null); initObject(init(naturalLanguageQuery)); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithNaturalLanguageQuery:region:")
    public MKLocalSearchRequest(String naturalLanguageQuery, @ByVal MKCoordinateRegion region) { super((SkipInit) null); initObject(init(naturalLanguageQuery, region)); }
    /**
     * @since Available in iOS 9.3 and later.
     */
    @Method(selector = "initWithCompletion:")
    public MKLocalSearchRequest(MKLocalSearchCompletion completion) { super((SkipInit) null); initObject(init(completion)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "naturalLanguageQuery")
    public native String getNaturalLanguageQuery();
    @Property(selector = "setNaturalLanguageQuery:")
    public native void setNaturalLanguageQuery(String v);
    @Property(selector = "region")
    public native @ByVal MKCoordinateRegion getRegion();
    @Property(selector = "setRegion:")
    public native void setRegion(@ByVal MKCoordinateRegion v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "resultTypes")
    public native MKLocalSearchResultType getResultTypes();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setResultTypes:")
    public native void setResultTypes(MKLocalSearchResultType v);
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
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithNaturalLanguageQuery:")
    protected native @Pointer long init(String naturalLanguageQuery);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithNaturalLanguageQuery:region:")
    protected native @Pointer long init(String naturalLanguageQuery, @ByVal MKCoordinateRegion region);
    /**
     * @since Available in iOS 9.3 and later.
     */
    @Method(selector = "initWithCompletion:")
    protected native @Pointer long init(MKLocalSearchCompletion completion);
    /*</methods>*/
}
