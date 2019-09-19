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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NaturalLanguage") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NLGazetteer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NLGazetteerPtr extends Ptr<NLGazetteer, NLGazetteerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NLGazetteer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NLGazetteer() {}
    protected NLGazetteer(Handle h, long handle) { super(h, handle); }
    protected NLGazetteer(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithContentsOfURL:error:")
    public NLGazetteer(NSURL url, NSError.NSErrorPtr error) { super((SkipInit) null); initObject(init(url, error)); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithData:error:")
    public NLGazetteer(NSData data, NSError.NSErrorPtr error) { super((SkipInit) null); initObject(init(data, error)); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithDictionary:language:error:")
    public NLGazetteer(NSDictionary<?, ?> dictionary, NLLanguage language, NSError.NSErrorPtr error) { super((SkipInit) null); initObject(init(dictionary, language, error)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "language")
    public native NLLanguage getLanguage();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "data")
    public native NSData getData();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithContentsOfURL:error:")
    protected native @Pointer long init(NSURL url, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithData:error:")
    protected native @Pointer long init(NSData data, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithDictionary:language:error:")
    protected native @Pointer long init(NSDictionary<?, ?> dictionary, NLLanguage language, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "labelForString:")
    public native String labelForString(String string);
    /*</methods>*/
}
