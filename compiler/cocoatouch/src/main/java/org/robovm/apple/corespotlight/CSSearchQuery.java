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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreSpotlight") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CSSearchQuery/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CSSearchQueryPtr extends Ptr<CSSearchQuery, CSSearchQueryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CSSearchQuery.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CSSearchQuery() {}
    protected CSSearchQuery(Handle h, long handle) { super(h, handle); }
    protected CSSearchQuery(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithQueryString:attributes:")
    public CSSearchQuery(String queryString, NSArray<NSString> attributes) { super((SkipInit) null); initObject(init(queryString, attributes)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isCancelled")
    public native boolean isCancelled();
    @Property(selector = "foundItemCount")
    public native @MachineSizedUInt long getFoundItemCount();
    @Property(selector = "foundItemsHandler")
    public native @Block VoidBlock1<NSArray<CSSearchableItem>> getFoundItemsHandler();
    @Property(selector = "setFoundItemsHandler:")
    public native void setFoundItemsHandler(@Block VoidBlock1<NSArray<CSSearchableItem>> v);
    @Property(selector = "completionHandler")
    public native @Block VoidBlock1<NSError> getCompletionHandler();
    @Property(selector = "setCompletionHandler:")
    public native void setCompletionHandler(@Block VoidBlock1<NSError> v);
    @Property(selector = "protectionClasses")
    public native NSArray<NSString> getProtectionClasses();
    @Property(selector = "setProtectionClasses:")
    public native void setProtectionClasses(NSArray<NSString> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithQueryString:attributes:")
    protected native @Pointer long init(String queryString, NSArray<NSString> attributes);
    @Method(selector = "start")
    public native void start();
    @Method(selector = "cancel")
    public native void cancel();
    /*</methods>*/
}
