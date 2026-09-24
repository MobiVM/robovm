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
package org.robovm.apple.videosubscriberaccount;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("VideoSubscriberAccount") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VSUserAccountManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VSUserAccountManagerPtr extends Ptr<VSUserAccountManager, VSUserAccountManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VSUserAccountManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VSUserAccountManager() {}
    protected VSUserAccountManager(Handle h, long handle) { super(h, handle); }
    protected VSUserAccountManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedUserAccountManager")
    public static native VSUserAccountManager getSharedUserAccountManager();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "updateUserAccount:completion:")
    public native void updateUserAccount(VSUserAccount account, @Block VoidBlock1<NSError> completion);
    @Method(selector = "queryUserAccountsWithOptions:completion:")
    public native void queryUserAccounts(VSUserAccountQueryOptions options, @Block VoidBlock2<NSArray<VSUserAccount>, NSError> completion);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "queryAutoSignInTokenWithCompletionHandler:")
    public native void queryAutoSignInToken(@Block VoidBlock2<VSAutoSignInToken, NSError> completion);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "requestAutoSignInAuthorizationWithCompletionHandler:")
    public native void requestAutoSignInAuthorization(@Block VoidBlock2<VSAutoSignInTokenUpdateContext, NSError> completion);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "updateAutoSignInToken:updateContext:completionHandler:")
    public native void updateAutoSignInToken(String autoSignInToken, VSAutoSignInTokenUpdateContext context, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "deleteAutoSignInTokenWithCompletionHandler:")
    public native void deleteAutoSignInToken(@Block VoidBlock1<NSError> completion);
    /*</methods>*/
}
