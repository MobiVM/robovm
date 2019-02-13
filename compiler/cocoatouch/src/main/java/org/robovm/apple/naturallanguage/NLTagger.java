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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NLTagger/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NLTaggerPtr extends Ptr<NLTagger, NLTaggerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NLTagger.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NLTagger() {}
    protected NLTagger(Handle h, long handle) { super(h, handle); }
    protected NLTagger(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithTagSchemes:")
    public NLTagger(NSArray<?> tagSchemes) { super((SkipInit) null); initObject(init(tagSchemes)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "tagSchemes")
    public native NSArray<?> getTagSchemes();
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
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "dominantLanguage")
    public native NLLanguage getDominantLanguage();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithTagSchemes:")
    protected native @Pointer long init(NSArray<?> tagSchemes);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "tokenRangeAtIndex:unit:")
    public native @ByVal NSRange getTokenRange(@MachineSizedUInt long characterIndex, NLTokenUnit unit);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "enumerateTagsInRange:unit:scheme:options:usingBlock:")
    public native void enumerateTags(@ByVal NSRange range, NLTokenUnit unit, NLTagScheme scheme, NLTaggerOptions options, @Block("(,@ByVal,)") VoidBlock3<NLTag, NSRange, BooleanPtr> block);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "tagAtIndex:unit:scheme:tokenRange:")
    public native NLTag getTag(@MachineSizedUInt long characterIndex, NLTokenUnit unit, NLTagScheme scheme, NSRange tokenRange);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "tagsInRange:unit:scheme:options:tokenRanges:")
    public native NSArray<?> getTags(@ByVal NSRange range, NLTokenUnit unit, NLTagScheme scheme, NLTaggerOptions options, NSArray.NSArrayPtr<?> tokenRanges);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "setLanguage:range:")
    public native void setLanguage(NLLanguage language, @ByVal NSRange range);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "setOrthography:range:")
    public native void setOrthography(NSOrthography orthography, @ByVal NSRange range);
    @Method(selector = "setModels:forTagScheme:")
    public native void setModels(NSArray<NLModel> models, NLTagScheme tagScheme);
    @Method(selector = "modelsForTagScheme:")
    public native NSArray<NLModel> modelsForTagScheme(NLTagScheme tagScheme);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "availableTagSchemesForUnit:language:")
    public static native NSArray<?> getAvailableTagSchemes(NLTokenUnit unit, NLLanguage language);
    /*</methods>*/
}
