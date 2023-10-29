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
package org.robovm.apple.corespotlight;

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
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreSpotlight") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CSSuggestion/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CSSuggestionPtr extends Ptr<CSSuggestion, CSSuggestionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CSSuggestion.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CSSuggestion() {}
    protected CSSuggestion(Handle h, long handle) { super(h, handle); }
    protected CSSuggestion(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public CSSuggestion(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "localizedAttributedSuggestion")
    public native NSAttributedString getLocalizedAttributedSuggestion();
    @Property(selector = "suggestionKind")
    public native CSSuggestionKind getSuggestionKind();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="CSSuggestionHighlightAttributeName", optional=true)
    public static native NSString getHighlightAttributeName();
    
    @Method(selector = "compareByRank:")
    public native NSComparisonResult compareByRank(CSSuggestion other);
    @Method(selector = "compare:")
    public native NSComparisonResult compare(CSSuggestion other);
    @Method(selector = "score")
    public native NSNumber score();
    @Method(selector = "suggestionDataSources")
    public native NSArray<?> suggestionDataSources();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
