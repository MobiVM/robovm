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
package org.robovm.apple.naturallanguage;

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
import org.robovm.apple.coreml.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NaturalLanguage") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NLLanguageRecognizer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NLLanguageRecognizerPtr extends Ptr<NLLanguageRecognizer, NLLanguageRecognizerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NLLanguageRecognizer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NLLanguageRecognizer() {}
    protected NLLanguageRecognizer(Handle h, long handle) { super(h, handle); }
    protected NLLanguageRecognizer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "dominantLanguage")
    public native NLLanguage getDominantLanguage();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "languageHints")
    public native NSDictionary<?, ?> getLanguageHints();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setLanguageHints:")
    public native void setLanguageHints(NSDictionary<?, ?> v);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "languageConstraints")
    public native NSArray<?> getLanguageConstraints();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setLanguageConstraints:")
    public native void setLanguageConstraints(NSArray<?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "processString:")
    public native void processString(String string);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "reset")
    public native void reset();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "languageHypothesesWithMaximum:")
    public native NSDictionary<?, ?> create(@MachineSizedUInt long maxHypotheses);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "dominantLanguageForString:")
    public static native NLLanguage dominantLanguageForString(String string);
    /*</methods>*/
}
