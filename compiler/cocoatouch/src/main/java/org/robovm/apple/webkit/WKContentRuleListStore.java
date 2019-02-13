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
package org.robovm.apple.webkit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("WebKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WKContentRuleListStore/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class WKContentRuleListStorePtr extends Ptr<WKContentRuleListStore, WKContentRuleListStorePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(WKContentRuleListStore.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public WKContentRuleListStore() {}
    protected WKContentRuleListStore(Handle h, long handle) { super(h, handle); }
    protected WKContentRuleListStore(SkipInit skipInit) { super(skipInit); }
    public WKContentRuleListStore(NSURL url) { super((Handle) null, create(url)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "compileContentRuleListForIdentifier:encodedContentRuleList:completionHandler:")
    public native void compileContentRuleList(String identifier, String encodedContentRuleList, @Block VoidBlock2<WKContentRuleList, NSError> completionHandler);
    @Method(selector = "lookUpContentRuleListForIdentifier:completionHandler:")
    public native void lookUpContentRuleList(String identifier, @Block VoidBlock2<WKContentRuleList, NSError> completionHandler);
    @Method(selector = "removeContentRuleListForIdentifier:completionHandler:")
    public native void removeContentRuleList(String identifier, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "getAvailableContentRuleListIdentifiers:")
    public native void getAvailableContentRuleListIdentifiers(@Block VoidBlock1<NSArray<NSString>> completionHandler);
    @Method(selector = "defaultStore")
    public static native WKContentRuleListStore defaultStore();
    @Method(selector = "storeWithURL:")
    protected static native @Pointer long create(NSURL url);
    /*</methods>*/
}
