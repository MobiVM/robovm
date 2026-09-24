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
package org.robovm.apple.cloudkit;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.contacts.*;
import org.robovm.apple.fileprovider.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CloudKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKShareRequestAccessOperation/*</name>*/ 
    extends /*<extends>*/CKOperation/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CKShareRequestAccessOperationPtr extends Ptr<CKShareRequestAccessOperation, CKShareRequestAccessOperationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKShareRequestAccessOperation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CKShareRequestAccessOperation() {}
    protected CKShareRequestAccessOperation(Handle h, long handle) { super(h, handle); }
    protected CKShareRequestAccessOperation(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithShareURLs:")
    public CKShareRequestAccessOperation(NSArray<NSURL> shareURLs) { super((SkipInit) null); initObject(init(shareURLs)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "shareURLs")
    public native NSArray<NSURL> getShareURLs();
    @Property(selector = "setShareURLs:")
    public native void setShareURLs(NSArray<NSURL> v);
    @Property(selector = "perShareAccessRequestCompletionBlock")
    public native @Block VoidBlock2<NSURL, NSError> getPerShareAccessRequestCompletionBlock();
    @Property(selector = "setPerShareAccessRequestCompletionBlock:")
    public native void setPerShareAccessRequestCompletionBlock(@Block VoidBlock2<NSURL, NSError> v);
    @Property(selector = "shareRequestAccessCompletionBlock")
    public native @Block VoidBlock1<NSError> getShareRequestAccessCompletionBlock();
    @Property(selector = "setShareRequestAccessCompletionBlock:")
    public native void setShareRequestAccessCompletionBlock(@Block VoidBlock1<NSError> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithShareURLs:")
    protected native @Pointer long init(NSArray<NSURL> shareURLs);
    /*</methods>*/
}
