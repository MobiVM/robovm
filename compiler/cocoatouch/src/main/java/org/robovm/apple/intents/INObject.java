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
    @Method(selector = "initWithCoder:")
    public INObject(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "displayString")
    public native String getDisplayString();
    @Property(selector = "pronunciationHint")
    public native String getPronunciationHint();
    @Property(selector = "spokenPhrase")
    public native String getSpokenPhrase();
    @Property(selector = "vocabularyIdentifier")
    public native String getVocabularyIdentifier();
    @Property(selector = "alternativeSpeakableMatches")
    public native NSArray<?> getAlternativeSpeakableMatches();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:displayString:pronunciationHint:")
    protected native @Pointer long init(String identifier, String displayString, String pronunciationHint);
    @Method(selector = "initWithIdentifier:displayString:")
    protected native @Pointer long init(String identifier, String displayString);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
