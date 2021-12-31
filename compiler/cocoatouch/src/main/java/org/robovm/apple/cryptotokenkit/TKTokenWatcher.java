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
package org.robovm.apple.cryptotokenkit;

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
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CryptoTokenKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TKTokenWatcher/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TKTokenWatcherPtr extends Ptr<TKTokenWatcher, TKTokenWatcherPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TKTokenWatcher.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TKTokenWatcher() {}
    protected TKTokenWatcher(Handle h, long handle) { super(h, handle); }
    protected TKTokenWatcher(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use setInsertionHandler
     */
    @Deprecated
    @Method(selector = "initWithInsertionHandler:")
    public TKTokenWatcher(@Block VoidBlock1<NSString> insertionHandler) { super((SkipInit) null); initObject(init(insertionHandler)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "tokenIDs")
    public native NSArray<NSString> getTokenIDs();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use setInsertionHandler
     */
    @Deprecated
    @Method(selector = "initWithInsertionHandler:")
    protected native @Pointer long init(@Block VoidBlock1<NSString> insertionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setInsertionHandler:")
    public native void setInsertionHandler(@Block VoidBlock1<NSString> insertionHandler);
    @Method(selector = "addRemovalHandler:forTokenID:")
    public native void addRemovalHandler(@Block VoidBlock1<NSString> removalHandler, String tokenID);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "tokenInfoForTokenID:")
    public native TKTokenWatcherTokenInfo tokenInfoForTokenID(String tokenID);
    /*</methods>*/
}
