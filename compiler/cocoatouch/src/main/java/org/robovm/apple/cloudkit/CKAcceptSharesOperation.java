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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CloudKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKAcceptSharesOperation/*</name>*/ 
    extends /*<extends>*/CKOperation/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CKAcceptSharesOperationPtr extends Ptr<CKAcceptSharesOperation, CKAcceptSharesOperationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKAcceptSharesOperation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CKAcceptSharesOperation() {}
    protected CKAcceptSharesOperation(Handle h, long handle) { super(h, handle); }
    protected CKAcceptSharesOperation(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithShareMetadatas:")
    public CKAcceptSharesOperation(NSArray<CKShareMetadata> shareMetadatas) { super((SkipInit) null); initObject(init(shareMetadatas)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "shareMetadatas")
    public native NSArray<CKShareMetadata> getShareMetadatas();
    @Property(selector = "setShareMetadatas:")
    public native void setShareMetadatas(NSArray<CKShareMetadata> v);
    @Property(selector = "perShareCompletionBlock")
    public native @Block VoidBlock3<CKShareMetadata, CKShare, NSError> getPerShareCompletionBlock();
    @Property(selector = "setPerShareCompletionBlock:")
    public native void setPerShareCompletionBlock(@Block VoidBlock3<CKShareMetadata, CKShare, NSError> v);
    @Property(selector = "acceptSharesCompletionBlock")
    public native @Block VoidBlock1<NSError> getAcceptSharesCompletionBlock();
    @Property(selector = "setAcceptSharesCompletionBlock:")
    public native void setAcceptSharesCompletionBlock(@Block VoidBlock1<NSError> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithShareMetadatas:")
    protected native @Pointer long init(NSArray<CKShareMetadata> shareMetadatas);
    /*</methods>*/
}
