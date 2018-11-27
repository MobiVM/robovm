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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NLTokenizer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NLTokenizerPtr extends Ptr<NLTokenizer, NLTokenizerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NLTokenizer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NLTokenizer() {}
    protected NLTokenizer(Handle h, long handle) { super(h, handle); }
    protected NLTokenizer(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithUnit:")
    public NLTokenizer(NLTokenUnit unit) { super((SkipInit) null); initObject(init(unit)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "unit")
    public native NLTokenUnit getUnit();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "string")
    public native String getString();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setString:")
    public native void setString(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithUnit:")
    protected native @Pointer long init(NLTokenUnit unit);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "setLanguage:")
    public native void setLanguage(NLLanguage language);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "tokenRangeAtIndex:")
    public native @ByVal NSRange tokenRangeAtIndex(@MachineSizedUInt long characterIndex);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "tokensForRange:")
    public native NSArray<NSValue> tokensForRange(@ByVal NSRange range);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "enumerateTokensInRange:usingBlock:")
    public native void enumerateTokens(@ByVal NSRange range, @Block("(@ByVal,,)") VoidBlock3<NSRange, NLTokenizerAttributes, BooleanPtr> block);
    /*</methods>*/
}
