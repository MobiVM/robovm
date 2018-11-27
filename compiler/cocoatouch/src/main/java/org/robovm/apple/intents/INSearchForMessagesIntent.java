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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSearchForMessagesIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INSearchForMessagesIntentPtr extends Ptr<INSearchForMessagesIntent, INSearchForMessagesIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INSearchForMessagesIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INSearchForMessagesIntent() {}
    protected INSearchForMessagesIntent(Handle h, long handle) { super(h, handle); }
    protected INSearchForMessagesIntent(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithRecipients:senders:searchTerms:attributes:dateTimeRange:identifiers:notificationIdentifiers:speakableGroupNames:conversationIdentifiers:")
    public INSearchForMessagesIntent(NSArray<INPerson> recipients, NSArray<INPerson> senders, NSArray<NSString> searchTerms, INMessageAttributeOptions attributes, INDateComponentsRange dateTimeRange, NSArray<NSString> identifiers, NSArray<NSString> notificationIdentifiers, NSArray<INSpeakableString> speakableGroupNames, NSArray<NSString> conversationIdentifiers) { super((SkipInit) null); initObject(init(recipients, senders, searchTerms, attributes, dateTimeRange, identifiers, notificationIdentifiers, speakableGroupNames, conversationIdentifiers)); }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithRecipients:senders:searchTerms:attributes:dateTimeRange:identifiers:notificationIdentifiers:groupNames:")
    public static  INSearchForMessagesIntent createWithGroupNames(NSArray<INPerson> recipients, NSArray<INPerson> senders, NSArray<NSString> searchTerms, INMessageAttributeOptions attributes, INDateComponentsRange dateTimeRange, NSArray<NSString> identifiers, NSArray<NSString> notificationIdentifiers, NSArray<NSString> groupNames) {
       INSearchForMessagesIntent res = new INSearchForMessagesIntent((SkipInit) null);
       res.initObject(res.initWithGroupNames(recipients, senders, searchTerms, attributes, dateTimeRange, identifiers, notificationIdentifiers, groupNames));
       return res;
    }
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 12.0. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithRecipients:senders:searchTerms:attributes:dateTimeRange:identifiers:notificationIdentifiers:speakableGroupNames:")
    public static  INSearchForMessagesIntent createWithSpeakableGroupNames(NSArray<INPerson> recipients, NSArray<INPerson> senders, NSArray<NSString> searchTerms, INMessageAttributeOptions attributes, INDateComponentsRange dateTimeRange, NSArray<NSString> identifiers, NSArray<NSString> notificationIdentifiers, NSArray<INSpeakableString> speakableGroupNames) {
       INSearchForMessagesIntent res = new INSearchForMessagesIntent((SkipInit) null);
       res.initObject(res.initWithSpeakableGroupNames(recipients, senders, searchTerms, attributes, dateTimeRange, identifiers, notificationIdentifiers, speakableGroupNames));
       return res;
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "recipients")
    public native NSArray<INPerson> getRecipients();
    @Property(selector = "recipientsOperator")
    public native INConditionalOperator getRecipientsOperator();
    @Property(selector = "senders")
    public native NSArray<INPerson> getSenders();
    @Property(selector = "sendersOperator")
    public native INConditionalOperator getSendersOperator();
    @Property(selector = "searchTerms")
    public native NSArray<NSString> getSearchTerms();
    @Property(selector = "searchTermsOperator")
    public native INConditionalOperator getSearchTermsOperator();
    @Property(selector = "attributes")
    public native INMessageAttributeOptions getAttributes();
    @Property(selector = "dateTimeRange")
    public native INDateComponentsRange getDateTimeRange();
    @Property(selector = "identifiers")
    public native NSArray<NSString> getIdentifiers();
    @Property(selector = "identifiersOperator")
    public native INConditionalOperator getIdentifiersOperator();
    @Property(selector = "notificationIdentifiers")
    public native NSArray<NSString> getNotificationIdentifiers();
    @Property(selector = "notificationIdentifiersOperator")
    public native INConditionalOperator getNotificationIdentifiersOperator();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "speakableGroupNames")
    public native NSArray<INSpeakableString> getSpeakableGroupNames();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "speakableGroupNamesOperator")
    public native INConditionalOperator getSpeakableGroupNamesOperator();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "conversationIdentifiers")
    public native NSArray<NSString> getConversationIdentifiers();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "conversationIdentifiersOperator")
    public native INConditionalOperator getConversationIdentifiersOperator();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use speakableGroupNames instead
     */
    @Deprecated
    @Property(selector = "groupNames")
    public native NSArray<NSString> getGroupNames();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use speakableGroupNamesOperator instead
     */
    @Deprecated
    @Property(selector = "groupNamesOperator")
    public native INConditionalOperator getGroupNamesOperator();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithRecipients:senders:searchTerms:attributes:dateTimeRange:identifiers:notificationIdentifiers:speakableGroupNames:conversationIdentifiers:")
    protected native @Pointer long init(NSArray<INPerson> recipients, NSArray<INPerson> senders, NSArray<NSString> searchTerms, INMessageAttributeOptions attributes, INDateComponentsRange dateTimeRange, NSArray<NSString> identifiers, NSArray<NSString> notificationIdentifiers, NSArray<INSpeakableString> speakableGroupNames, NSArray<NSString> conversationIdentifiers);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithRecipients:senders:searchTerms:attributes:dateTimeRange:identifiers:notificationIdentifiers:groupNames:")
    protected native @Pointer long initWithGroupNames(NSArray<INPerson> recipients, NSArray<INPerson> senders, NSArray<NSString> searchTerms, INMessageAttributeOptions attributes, INDateComponentsRange dateTimeRange, NSArray<NSString> identifiers, NSArray<NSString> notificationIdentifiers, NSArray<NSString> groupNames);
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 12.0. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithRecipients:senders:searchTerms:attributes:dateTimeRange:identifiers:notificationIdentifiers:speakableGroupNames:")
    protected native @Pointer long initWithSpeakableGroupNames(NSArray<INPerson> recipients, NSArray<INPerson> senders, NSArray<NSString> searchTerms, INMessageAttributeOptions attributes, INDateComponentsRange dateTimeRange, NSArray<NSString> identifiers, NSArray<NSString> notificationIdentifiers, NSArray<INSpeakableString> speakableGroupNames);
    /*</methods>*/
}
