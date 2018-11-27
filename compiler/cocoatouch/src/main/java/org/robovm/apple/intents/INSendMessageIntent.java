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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSendMessageIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INSendMessageIntentPtr extends Ptr<INSendMessageIntent, INSendMessageIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INSendMessageIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INSendMessageIntent() {}
    protected INSendMessageIntent(Handle h, long handle) { super(h, handle); }
    protected INSendMessageIntent(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithRecipients:content:speakableGroupName:conversationIdentifier:serviceName:sender:")
    public INSendMessageIntent(NSArray<INPerson> recipients, String content, INSpeakableString speakableGroupName, String conversationIdentifier, String serviceName, INPerson sender) { super((SkipInit) null); initObject(init(recipients, content, speakableGroupName, conversationIdentifier, serviceName, sender)); }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithRecipients:content:groupName:serviceName:sender:")
    public INSendMessageIntent(NSArray<INPerson> recipients, String content, String groupName, String serviceName, INPerson sender) { super((SkipInit) null); initObject(init(recipients, content, groupName, serviceName, sender)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "recipients")
    public native NSArray<INPerson> getRecipients();
    @Property(selector = "content")
    public native String getContent();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "speakableGroupName")
    public native INSpeakableString getSpeakableGroupName();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "conversationIdentifier")
    public native String getConversationIdentifier();
    @Property(selector = "serviceName")
    public native String getServiceName();
    @Property(selector = "sender")
    public native INPerson getSender();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use speakableGroupNames instead
     */
    @Deprecated
    @Property(selector = "groupName")
    public native String getGroupName();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithRecipients:content:speakableGroupName:conversationIdentifier:serviceName:sender:")
    protected native @Pointer long init(NSArray<INPerson> recipients, String content, INSpeakableString speakableGroupName, String conversationIdentifier, String serviceName, INPerson sender);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithRecipients:content:groupName:serviceName:sender:")
    protected native @Pointer long init(NSArray<INPerson> recipients, String content, String groupName, String serviceName, INPerson sender);
    /*</methods>*/
}
