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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INPerson/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding, INSpeakable/*</implements>*/ {

    /*<ptr>*/public static class INPersonPtr extends Ptr<INPerson, INPersonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INPerson.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INPerson() {}
    protected INPerson(Handle h, long handle) { super(h, handle); }
    protected INPerson(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:")
    public INPerson(INPersonHandle personHandle, NSPersonNameComponents nameComponents, String displayName, INImage image, String contactIdentifier, String customIdentifier) { super((SkipInit) null); initObject(init(personHandle, nameComponents, displayName, image, contactIdentifier, customIdentifier)); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:isMe:")
    public INPerson(INPersonHandle personHandle, NSPersonNameComponents nameComponents, String displayName, INImage image, String contactIdentifier, String customIdentifier, boolean isMe) { super((SkipInit) null); initObject(init(personHandle, nameComponents, displayName, image, contactIdentifier, customIdentifier, isMe)); }
    @Method(selector = "initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:aliases:suggestionType:")
    public INPerson(INPersonHandle personHandle, NSPersonNameComponents nameComponents, String displayName, INImage image, String contactIdentifier, String customIdentifier, NSArray<INPersonHandle> aliases, INPersonSuggestionType suggestionType) { super((SkipInit) null); initObject(init(personHandle, nameComponents, displayName, image, contactIdentifier, customIdentifier, aliases, suggestionType)); }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithHandle:nameComponents:contactIdentifier:")
    public INPerson(String handle, NSPersonNameComponents nameComponents, String contactIdentifier) { super((SkipInit) null); initObject(init(handle, nameComponents, contactIdentifier)); }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithHandle:displayName:contactIdentifier:")
    public INPerson(String handle, String displayName, String contactIdentifier) { super((SkipInit) null); initObject(init(handle, displayName, contactIdentifier)); }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithHandle:nameComponents:displayName:image:contactIdentifier:")
    public INPerson(String handle, NSPersonNameComponents nameComponents, String displayName, INImage image, String contactIdentifier) { super((SkipInit) null); initObject(init(handle, nameComponents, displayName, image, contactIdentifier)); }
    @Method(selector = "initWithCoder:")
    public INPerson(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "personHandle")
    public native INPersonHandle getPersonHandle();
    @Property(selector = "nameComponents")
    public native NSPersonNameComponents getNameComponents();
    @Property(selector = "displayName")
    public native String getDisplayName();
    @Property(selector = "image")
    public native INImage getImage();
    @Property(selector = "contactIdentifier")
    public native String getContactIdentifier();
    @Property(selector = "customIdentifier")
    public native String getCustomIdentifier();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @Property(selector = "relationship")
    public native String getRelationship();
    @Property(selector = "aliases")
    public native NSArray<INPersonHandle> getAliases();
    @Property(selector = "suggestionType")
    public native INPersonSuggestionType getSuggestionType();
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Property(selector = "siriMatches")
    public native NSArray<INPerson> getSiriMatches();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isMe")
    public native boolean isMe();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use personHandle instead
     */
    @Deprecated
    @Property(selector = "handle")
    public native String getHandle0();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    @Property(selector = "spokenPhrase")
    public native String getSpokenPhrase();
    @Property(selector = "pronunciationHint")
    public native String getPronunciationHint();
    @Property(selector = "vocabularyIdentifier")
    public native String getVocabularyIdentifier();
    @Property(selector = "alternativeSpeakableMatches")
    public native NSArray<?> getAlternativeSpeakableMatches();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Please use vocabularyIdentifier
     */
    @Deprecated
    @Property(selector = "identifier")
    public native String getIdentifier();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:")
    protected native @Pointer long init(INPersonHandle personHandle, NSPersonNameComponents nameComponents, String displayName, INImage image, String contactIdentifier, String customIdentifier);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:isMe:")
    protected native @Pointer long init(INPersonHandle personHandle, NSPersonNameComponents nameComponents, String displayName, INImage image, String contactIdentifier, String customIdentifier, boolean isMe);
    @Method(selector = "initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:aliases:suggestionType:")
    protected native @Pointer long init(INPersonHandle personHandle, NSPersonNameComponents nameComponents, String displayName, INImage image, String contactIdentifier, String customIdentifier, NSArray<INPersonHandle> aliases, INPersonSuggestionType suggestionType);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithHandle:nameComponents:contactIdentifier:")
    protected native @Pointer long init(String handle, NSPersonNameComponents nameComponents, String contactIdentifier);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithHandle:displayName:contactIdentifier:")
    protected native @Pointer long init(String handle, String displayName, String contactIdentifier);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithHandle:nameComponents:displayName:image:contactIdentifier:")
    protected native @Pointer long init(String handle, NSPersonNameComponents nameComponents, String displayName, INImage image, String contactIdentifier);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
