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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSearchForNotebookItemsIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INSearchForNotebookItemsIntentPtr extends Ptr<INSearchForNotebookItemsIntent, INSearchForNotebookItemsIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INSearchForNotebookItemsIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INSearchForNotebookItemsIntent() {}
    protected INSearchForNotebookItemsIntent(Handle h, long handle) { super(h, handle); }
    protected INSearchForNotebookItemsIntent(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.2 and later.
     */
    @Method(selector = "initWithTitle:content:itemType:status:location:locationSearchType:dateTime:dateSearchType:notebookItemIdentifier:")
    public INSearchForNotebookItemsIntent(INSpeakableString title, String content, INNotebookItemType itemType, INTaskStatus status, CLPlacemark location, INLocationSearchType locationSearchType, INDateComponentsRange dateTime, INDateSearchType dateSearchType, String notebookItemIdentifier) { super((SkipInit) null); initObject(init(title, content, itemType, status, location, locationSearchType, dateTime, dateSearchType, notebookItemIdentifier)); }
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 11.2. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithTitle:content:itemType:status:location:locationSearchType:dateTime:dateSearchType:")
    public INSearchForNotebookItemsIntent(INSpeakableString title, String content, INNotebookItemType itemType, INTaskStatus status, CLPlacemark location, INLocationSearchType locationSearchType, INDateComponentsRange dateTime, INDateSearchType dateSearchType) { super((SkipInit) null); initObject(init(title, content, itemType, status, location, locationSearchType, dateTime, dateSearchType)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "title")
    public native INSpeakableString getTitle();
    @Property(selector = "content")
    public native String getContent();
    @Property(selector = "itemType")
    public native INNotebookItemType getItemType();
    @Property(selector = "status")
    public native INTaskStatus getStatus();
    @Property(selector = "location")
    public native CLPlacemark getLocation();
    @Property(selector = "locationSearchType")
    public native INLocationSearchType getLocationSearchType();
    @Property(selector = "dateTime")
    public native INDateComponentsRange getDateTime();
    @Property(selector = "dateSearchType")
    public native INDateSearchType getDateSearchType();
    /**
     * @since Available in iOS 11.2 and later.
     */
    @Property(selector = "notebookItemIdentifier")
    public native String getNotebookItemIdentifier();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.2 and later.
     */
    @Method(selector = "initWithTitle:content:itemType:status:location:locationSearchType:dateTime:dateSearchType:notebookItemIdentifier:")
    protected native @Pointer long init(INSpeakableString title, String content, INNotebookItemType itemType, INTaskStatus status, CLPlacemark location, INLocationSearchType locationSearchType, INDateComponentsRange dateTime, INDateSearchType dateSearchType, String notebookItemIdentifier);
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 11.2. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithTitle:content:itemType:status:location:locationSearchType:dateTime:dateSearchType:")
    protected native @Pointer long init(INSpeakableString title, String content, INNotebookItemType itemType, INTaskStatus status, CLPlacemark location, INLocationSearchType locationSearchType, INDateComponentsRange dateTime, INDateSearchType dateSearchType);
    /*</methods>*/
}
