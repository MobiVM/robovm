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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSearchCallHistoryIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INSearchCallHistoryIntentPtr extends Ptr<INSearchCallHistoryIntent, INSearchCallHistoryIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INSearchCallHistoryIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INSearchCallHistoryIntent() {}
    protected INSearchCallHistoryIntent(Handle h, long handle) { super(h, handle); }
    protected INSearchCallHistoryIntent(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDateCreated:recipient:callCapabilities:callTypes:unseen:")
    public INSearchCallHistoryIntent(INDateComponentsRange dateCreated, INPerson recipient, INCallCapabilityOptions callCapabilities, INCallRecordTypeOptions callTypes, NSNumber unseen) { super((SkipInit) null); initObject(init(dateCreated, recipient, callCapabilities, callTypes, unseen)); }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithCallType:dateCreated:recipient:callCapabilities:")
    public INSearchCallHistoryIntent(INCallRecordType callType, INDateComponentsRange dateCreated, INPerson recipient, INCallCapabilityOptions callCapabilities) { super((SkipInit) null); initObject(init(callType, dateCreated, recipient, callCapabilities)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dateCreated")
    public native INDateComponentsRange getDateCreated();
    @Property(selector = "recipient")
    public native INPerson getRecipient();
    @Property(selector = "callCapabilities")
    public native INCallCapabilityOptions getCallCapabilities();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "callTypes")
    public native INCallRecordTypeOptions getCallTypes();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "unseen")
    public native NSNumber getUnseen();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use callTypes instead
     */
    @Deprecated
    @Property(selector = "callType")
    public native INCallRecordType getCallType();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDateCreated:recipient:callCapabilities:callTypes:unseen:")
    protected native @Pointer long init(INDateComponentsRange dateCreated, INPerson recipient, INCallCapabilityOptions callCapabilities, INCallRecordTypeOptions callTypes, NSNumber unseen);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithCallType:dateCreated:recipient:callCapabilities:")
    protected native @Pointer long init(INCallRecordType callType, INDateComponentsRange dateCreated, INPerson recipient, INCallCapabilityOptions callCapabilities);
    /*</methods>*/
}
