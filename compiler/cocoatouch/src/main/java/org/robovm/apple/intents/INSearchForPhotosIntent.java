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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSearchForPhotosIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INSearchForPhotosIntentPtr extends Ptr<INSearchForPhotosIntent, INSearchForPhotosIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INSearchForPhotosIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INSearchForPhotosIntent() {}
    protected INSearchForPhotosIntent(Handle h, long handle) { super(h, handle); }
    protected INSearchForPhotosIntent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDateCreated:locationCreated:albumName:searchTerms:includedAttributes:excludedAttributes:peopleInPhoto:")
    public INSearchForPhotosIntent(INDateComponentsRange dateCreated, CLPlacemark locationCreated, String albumName, NSArray<NSString> searchTerms, INPhotoAttributeOptions includedAttributes, INPhotoAttributeOptions excludedAttributes, NSArray<INPerson> peopleInPhoto) { super((SkipInit) null); initObject(init(dateCreated, locationCreated, albumName, searchTerms, includedAttributes, excludedAttributes, peopleInPhoto)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dateCreated")
    public native INDateComponentsRange getDateCreated();
    @Property(selector = "locationCreated")
    public native CLPlacemark getLocationCreated();
    @Property(selector = "albumName")
    public native String getAlbumName();
    @Property(selector = "searchTerms")
    public native NSArray<NSString> getSearchTerms();
    @Property(selector = "searchTermsOperator")
    public native INConditionalOperator getSearchTermsOperator();
    @Property(selector = "includedAttributes")
    public native INPhotoAttributeOptions getIncludedAttributes();
    @Property(selector = "excludedAttributes")
    public native INPhotoAttributeOptions getExcludedAttributes();
    @Property(selector = "peopleInPhoto")
    public native NSArray<INPerson> getPeopleInPhoto();
    @Property(selector = "peopleInPhotoOperator")
    public native INConditionalOperator getPeopleInPhotoOperator();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDateCreated:locationCreated:albumName:searchTerms:includedAttributes:excludedAttributes:peopleInPhoto:")
    protected native @Pointer long init(INDateComponentsRange dateCreated, CLPlacemark locationCreated, String albumName, NSArray<NSString> searchTerms, INPhotoAttributeOptions includedAttributes, INPhotoAttributeOptions excludedAttributes, NSArray<INPerson> peopleInPhoto);
    /*</methods>*/
}
