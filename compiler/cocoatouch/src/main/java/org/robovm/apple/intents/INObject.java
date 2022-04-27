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
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INObject/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements INSpeakable, NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INObjectPtr extends Ptr<INObject, INObjectPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INObject.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INObject() {}
    protected INObject(Handle h, long handle) { super(h, handle); }
    protected INObject(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:displayString:pronunciationHint:")
    public INObject(String identifier, String displayString, String pronunciationHint) { super((SkipInit) null); initObject(init(identifier, displayString, pronunciationHint)); }
    @Method(selector = "initWithIdentifier:displayString:")
    public INObject(String identifier, String displayString) { super((SkipInit) null); initObject(init(identifier, displayString)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithIdentifier:displayString:subtitleString:displayImage:")
    public INObject(String identifier, String displayString, String subtitleString, INImage displayImage) { super((SkipInit) null); initObject(init(identifier, displayString, subtitleString, displayImage)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithIdentifier:displayString:pronunciationHint:subtitleString:displayImage:")
    public INObject(String identifier, String displayString, String pronunciationHint, String subtitleString, INImage displayImage) { super((SkipInit) null); initObject(init(identifier, displayString, pronunciationHint, subtitleString, displayImage)); }
    @Method(selector = "initWithCoder:")
    public INObject(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "displayString")
    public native String getDisplayString();
    @Property(selector = "pronunciationHint")
    public native String getPronunciationHint();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "subtitleString")
    public native String getSubtitleString();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setSubtitleString:")
    public native void setSubtitleString(String v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "displayImage")
    public native INImage getDisplayImage();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setDisplayImage:")
    public native void setDisplayImage(INImage v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "alternativeSpeakableMatches")
    public native NSArray<INSpeakableString> getAlternativeSpeakableMatches();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setAlternativeSpeakableMatches:")
    public native void setAlternativeSpeakableMatches(NSArray<INSpeakableString> v);
    @Property(selector = "spokenPhrase")
    public native String getSpokenPhrase();
    @Property(selector = "vocabularyIdentifier")
    public native String getVocabularyIdentifier();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:displayString:pronunciationHint:")
    protected native @Pointer long init(String identifier, String displayString, String pronunciationHint);
    @Method(selector = "initWithIdentifier:displayString:")
    protected native @Pointer long init(String identifier, String displayString);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithIdentifier:displayString:subtitleString:displayImage:")
    protected native @Pointer long init(String identifier, String displayString, String subtitleString, INImage displayImage);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithIdentifier:displayString:pronunciationHint:subtitleString:displayImage:")
    protected native @Pointer long init(String identifier, String displayString, String pronunciationHint, String subtitleString, INImage displayImage);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
