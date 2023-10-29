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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INMessage/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INMessagePtr extends Ptr<INMessage, INMessagePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INMessage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INMessage() {}
    protected INMessage(Handle h, long handle) { super(h, handle); }
    protected INMessage(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithIdentifier:conversationIdentifier:content:dateSent:sender:recipients:groupName:messageType:serviceName:attachmentFiles:")
    public INMessage(String identifier, String conversationIdentifier, String content, NSDate dateSent, INPerson sender, NSArray<INPerson> recipients, INSpeakableString groupName, INMessageType messageType, String serviceName, NSArray<INFile> attachmentFiles) { super((SkipInit) null); initObject(init(identifier, conversationIdentifier, content, dateSent, sender, recipients, groupName, messageType, serviceName, attachmentFiles)); }
    @Method(selector = "initWithIdentifier:conversationIdentifier:content:dateSent:sender:recipients:groupName:messageType:serviceName:audioMessageFile:")
    public INMessage(String identifier, String conversationIdentifier, String content, NSDate dateSent, INPerson sender, NSArray<INPerson> recipients, INSpeakableString groupName, INMessageType messageType, String serviceName, INFile audioMessageFile) { super((SkipInit) null); initObject(init(identifier, conversationIdentifier, content, dateSent, sender, recipients, groupName, messageType, serviceName, audioMessageFile)); }
    /**
     * @since Available in iOS 13.2 and later.
     */
    @Method(selector = "initWithIdentifier:conversationIdentifier:content:dateSent:sender:recipients:groupName:messageType:serviceName:")
    public INMessage(String identifier, String conversationIdentifier, String content, NSDate dateSent, INPerson sender, NSArray<INPerson> recipients, INSpeakableString groupName, INMessageType messageType, String serviceName) { super((SkipInit) null); initObject(init(identifier, conversationIdentifier, content, dateSent, sender, recipients, groupName, messageType, serviceName)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithIdentifier:conversationIdentifier:content:dateSent:sender:recipients:groupName:messageType:")
    public INMessage(String identifier, String conversationIdentifier, String content, NSDate dateSent, INPerson sender, NSArray<INPerson> recipients, INSpeakableString groupName, INMessageType messageType) { super((SkipInit) null); initObject(init(identifier, conversationIdentifier, content, dateSent, sender, recipients, groupName, messageType)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithIdentifier:conversationIdentifier:content:dateSent:sender:recipients:messageType:")
    public INMessage(String identifier, String conversationIdentifier, String content, NSDate dateSent, INPerson sender, NSArray<INPerson> recipients, INMessageType messageType) { super((SkipInit) null); initObject(init(identifier, conversationIdentifier, content, dateSent, sender, recipients, messageType)); }
    @Method(selector = "initWithIdentifier:content:dateSent:sender:recipients:")
    public INMessage(String identifier, String content, NSDate dateSent, INPerson sender, NSArray<INPerson> recipients) { super((SkipInit) null); initObject(init(identifier, content, dateSent, sender, recipients)); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithIdentifier:conversationIdentifier:content:dateSent:sender:recipients:groupName:serviceName:linkMetadata:")
    public INMessage(String identifier, String conversationIdentifier, String content, NSDate dateSent, INPerson sender, NSArray<INPerson> recipients, INSpeakableString groupName, String serviceName, INMessageLinkMetadata linkMetadata) { super((SkipInit) null); initObject(init(identifier, conversationIdentifier, content, dateSent, sender, recipients, groupName, serviceName, linkMetadata)); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithIdentifier:conversationIdentifier:content:dateSent:sender:recipients:groupName:serviceName:messageType:numberOfAttachments:")
    public INMessage(String identifier, String conversationIdentifier, String content, NSDate dateSent, INPerson sender, NSArray<INPerson> recipients, INSpeakableString groupName, String serviceName, INMessageType messageType, NSNumber numberOfAttachments) { super((SkipInit) null); initObject(init(identifier, conversationIdentifier, content, dateSent, sender, recipients, groupName, serviceName, messageType, numberOfAttachments)); }
    @Method(selector = "initWithCoder:")
    public INMessage(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "conversationIdentifier")
    public native String getConversationIdentifier();
    @Property(selector = "content")
    public native String getContent();
    @Property(selector = "dateSent")
    public native NSDate getDateSent();
    @Property(selector = "sender")
    public native INPerson getSender();
    @Property(selector = "recipients")
    public native NSArray<INPerson> getRecipients();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "groupName")
    public native INSpeakableString getGroupName();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "messageType")
    public native INMessageType getMessageType();
    /**
     * @since Available in iOS 13.2 and later.
     */
    @Property(selector = "serviceName")
    public native String getServiceName();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "attachmentFiles")
    public native NSArray<INFile> getAttachmentFiles();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "numberOfAttachments")
    public native NSNumber getNumberOfAttachments();
    /**
     * @since Available in iOS 16.0 and later.
     * @deprecated Deprecated in iOS 17.0. Use attachmentFile instead
     */
    @Deprecated
    @Property(selector = "audioMessageFile")
    public native INFile getAudioMessageFile();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "linkMetadata")
    public native INMessageLinkMetadata getLinkMetadata();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithIdentifier:conversationIdentifier:content:dateSent:sender:recipients:groupName:messageType:serviceName:attachmentFiles:")
    protected native @Pointer long init(String identifier, String conversationIdentifier, String content, NSDate dateSent, INPerson sender, NSArray<INPerson> recipients, INSpeakableString groupName, INMessageType messageType, String serviceName, NSArray<INFile> attachmentFiles);
    @Method(selector = "initWithIdentifier:conversationIdentifier:content:dateSent:sender:recipients:groupName:messageType:serviceName:audioMessageFile:")
    protected native @Pointer long init(String identifier, String conversationIdentifier, String content, NSDate dateSent, INPerson sender, NSArray<INPerson> recipients, INSpeakableString groupName, INMessageType messageType, String serviceName, INFile audioMessageFile);
    /**
     * @since Available in iOS 13.2 and later.
     */
    @Method(selector = "initWithIdentifier:conversationIdentifier:content:dateSent:sender:recipients:groupName:messageType:serviceName:")
    protected native @Pointer long init(String identifier, String conversationIdentifier, String content, NSDate dateSent, INPerson sender, NSArray<INPerson> recipients, INSpeakableString groupName, INMessageType messageType, String serviceName);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithIdentifier:conversationIdentifier:content:dateSent:sender:recipients:groupName:messageType:")
    protected native @Pointer long init(String identifier, String conversationIdentifier, String content, NSDate dateSent, INPerson sender, NSArray<INPerson> recipients, INSpeakableString groupName, INMessageType messageType);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithIdentifier:conversationIdentifier:content:dateSent:sender:recipients:messageType:")
    protected native @Pointer long init(String identifier, String conversationIdentifier, String content, NSDate dateSent, INPerson sender, NSArray<INPerson> recipients, INMessageType messageType);
    @Method(selector = "initWithIdentifier:content:dateSent:sender:recipients:")
    protected native @Pointer long init(String identifier, String content, NSDate dateSent, INPerson sender, NSArray<INPerson> recipients);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithIdentifier:conversationIdentifier:content:dateSent:sender:recipients:groupName:serviceName:linkMetadata:")
    protected native @Pointer long init(String identifier, String conversationIdentifier, String content, NSDate dateSent, INPerson sender, NSArray<INPerson> recipients, INSpeakableString groupName, String serviceName, INMessageLinkMetadata linkMetadata);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithIdentifier:conversationIdentifier:content:dateSent:sender:recipients:groupName:serviceName:messageType:numberOfAttachments:")
    protected native @Pointer long init(String identifier, String conversationIdentifier, String content, NSDate dateSent, INPerson sender, NSArray<INPerson> recipients, INSpeakableString groupName, String serviceName, INMessageType messageType, NSNumber numberOfAttachments);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
