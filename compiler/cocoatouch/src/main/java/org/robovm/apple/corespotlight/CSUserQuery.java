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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CSUserQuery/*</name>*/ 
    extends /*<extends>*/CSSearchQuery/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CSUserQueryPtr extends Ptr<CSUserQuery, CSUserQueryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CSUserQuery.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CSUserQuery() {}
    protected CSUserQuery(Handle h, long handle) { super(h, handle); }
    protected CSUserQuery(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithUserQueryString:userQueryContext:")
    public CSUserQuery(String userQueryString, CSUserQueryContext userQueryContext) { super((SkipInit) null); initObject(ini(userQueryString, userQueryContext)); }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "initWithQueryString:queryContext:")
    public CSUserQuery(String queryString, CSSearchQueryContext queryContext) { super(queryString, queryContext); }
    @Method(selector = "initWithQueryString:attributes:")
    public CSUserQuery(String queryString, NSArray<NSString> attributes) { super(queryString, attributes); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "foundSuggestionCount")
    public native @MachineSizedSInt long getFoundSuggestionCount();
    @Property(selector = "foundSuggestionsHandler")
    public native @Block VoidBlock1<NSArray<CSSuggestion>> getFoundSuggestionsHandler();
    @Property(selector = "setFoundSuggestionsHandler:")
    public native void setFoundSuggestionsHandler(@Block VoidBlock1<NSArray<CSSuggestion>> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithUserQueryString:userQueryContext:")
    protected native @Pointer long ini(String userQueryString, CSUserQueryContext userQueryContext);
    @Method(selector = "start")
    public native void start();
    @Method(selector = "cancel")
    public native void cancel();
    /*</methods>*/
}
