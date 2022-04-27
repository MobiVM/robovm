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
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSMorphologyCustomPronoun/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NSMorphologyCustomPronounPtr extends Ptr<NSMorphologyCustomPronoun, NSMorphologyCustomPronounPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSMorphologyCustomPronoun.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSMorphologyCustomPronoun() {}
    protected NSMorphologyCustomPronoun(Handle h, long handle) { super(h, handle); }
    protected NSMorphologyCustomPronoun(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public NSMorphologyCustomPronoun(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "subjectForm")
    public native String getSubjectForm();
    @Property(selector = "setSubjectForm:")
    public native void setSubjectForm(String v);
    @Property(selector = "objectForm")
    public native String getObjectForm();
    @Property(selector = "setObjectForm:")
    public native void setObjectForm(String v);
    @Property(selector = "possessiveForm")
    public native String getPossessiveForm();
    @Property(selector = "setPossessiveForm:")
    public native void setPossessiveForm(String v);
    @Property(selector = "possessiveAdjectiveForm")
    public native String getPossessiveAdjectiveForm();
    @Property(selector = "setPossessiveAdjectiveForm:")
    public native void setPossessiveAdjectiveForm(String v);
    @Property(selector = "reflexiveForm")
    public native String getReflexiveForm();
    @Property(selector = "setReflexiveForm:")
    public native void setReflexiveForm(String v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isSupportedForLanguage:")
    public static native boolean isSupportedForLanguage(String language);
    @Method(selector = "requiredKeysForLanguage:")
    public static native NSArray<NSString> requiredKeysForLanguage(String language);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
