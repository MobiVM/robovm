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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSMorphologyPronoun/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NSMorphologyPronounPtr extends Ptr<NSMorphologyPronoun, NSMorphologyPronounPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSMorphologyPronoun.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSMorphologyPronoun() {}
    protected NSMorphologyPronoun(Handle h, long handle) { super(h, handle); }
    protected NSMorphologyPronoun(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPronoun:morphology:dependentMorphology:")
    public NSMorphologyPronoun(String pronoun, NSMorphology morphology, NSMorphology dependentMorphology) { super((SkipInit) null); initObject(init(pronoun, morphology, dependentMorphology)); }
    @Method(selector = "initWithCoder:")
    public NSMorphologyPronoun(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "pronoun")
    public native String getPronoun();
    @Property(selector = "morphology")
    public native NSMorphology getMorphology();
    @Property(selector = "dependentMorphology")
    public native NSMorphology getDependentMorphology();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPronoun:morphology:dependentMorphology:")
    protected native @Pointer long init(String pronoun, NSMorphology morphology, NSMorphology dependentMorphology);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
