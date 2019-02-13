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
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreSpotlight") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CSSearchableIndex/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CSSearchableIndexPtr extends Ptr<CSSearchableIndex, CSSearchableIndexPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CSSearchableIndex.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CSSearchableIndex() {}
    protected CSSearchableIndex(Handle h, long handle) { super(h, handle); }
    protected CSSearchableIndex(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithName:")
    public CSSearchableIndex(String name) { super((SkipInit) null); initObject(init(name)); }
    @Method(selector = "initWithName:protectionClass:")
    public CSSearchableIndex(String name, NSString protectionClass) { super((SkipInit) null); initObject(init(name, protectionClass)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "indexDelegate")
    public native CSSearchableIndexDelegate getIndexDelegate();
    @Property(selector = "setIndexDelegate:", strongRef = true)
    public native void setIndexDelegate(CSSearchableIndexDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithName:")
    protected native @Pointer long init(String name);
    @Method(selector = "initWithName:protectionClass:")
    protected native @Pointer long init(String name, NSString protectionClass);
    @Method(selector = "indexSearchableItems:completionHandler:")
    public native void indexSearchableItems(NSArray<CSSearchableItem> items, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "deleteSearchableItemsWithIdentifiers:completionHandler:")
    public native void deleteSearchableItems(NSArray<NSString> identifiers, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "deleteSearchableItemsWithDomainIdentifiers:completionHandler:")
    public native void deleteSearchableItemsWithDomainIdentifiers(NSArray<NSString> domainIdentifiers, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "deleteAllSearchableItemsWithCompletionHandler:")
    public native void deleteAllSearchableItems(@Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "isIndexingAvailable")
    public static native boolean isIndexingAvailable();
    @Method(selector = "defaultSearchableIndex")
    public static native CSSearchableIndex defaultSearchableIndex();
    @Method(selector = "beginIndexBatch")
    public native void beginIndexBatch();
    @Method(selector = "endIndexBatchWithClientState:completionHandler:")
    public native void endIndexBatch(NSData clientState, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "fetchLastClientStateWithCompletionHandler:")
    public native void fetchLastClientState(@Block VoidBlock2<NSData, NSError> completionHandler);
    /*</methods>*/
}
