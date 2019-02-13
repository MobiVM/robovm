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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSpeakableString/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements INSpeakable, NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INSpeakableStringPtr extends Ptr<INSpeakableString, INSpeakableStringPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INSpeakableString.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INSpeakableString() {}
    protected INSpeakableString(Handle h, long handle) { super(h, handle); }
    protected INSpeakableString(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithVocabularyIdentifier:spokenPhrase:pronunciationHint:")
    public static  INSpeakableString createWithVocabulary(String vocabularyIdentifier, String spokenPhrase, String pronunciationHint) {
       INSpeakableString res = new INSpeakableString((SkipInit) null);
       res.initObject(res.initWithVocabulary(vocabularyIdentifier, spokenPhrase, pronunciationHint));
       return res;
    }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Please use -initWithVocabularyIdentifier:spokenPhrase:pronunciationHint:
     */
    @Deprecated
    @Method(selector = "initWithIdentifier:spokenPhrase:pronunciationHint:")
    public INSpeakableString(String identifier, String spokenPhrase, String pronunciationHint) { super((SkipInit) null); initObject(init(identifier, spokenPhrase, pronunciationHint)); }
    /**
     * @since Available in iOS 10.2 and later.
     */
    @Method(selector = "initWithSpokenPhrase:")
    public INSpeakableString(String spokenPhrase) { super((SkipInit) null); initObject(init(spokenPhrase)); }
    @Method(selector = "initWithCoder:")
    public INSpeakableString(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
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
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithVocabularyIdentifier:spokenPhrase:pronunciationHint:")
    protected native @Pointer long initWithVocabulary(String vocabularyIdentifier, String spokenPhrase, String pronunciationHint);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Please use -initWithVocabularyIdentifier:spokenPhrase:pronunciationHint:
     */
    @Deprecated
    @Method(selector = "initWithIdentifier:spokenPhrase:pronunciationHint:")
    protected native @Pointer long init(String identifier, String spokenPhrase, String pronunciationHint);
    /**
     * @since Available in iOS 10.2 and later.
     */
    @Method(selector = "initWithSpokenPhrase:")
    protected native @Pointer long init(String spokenPhrase);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
