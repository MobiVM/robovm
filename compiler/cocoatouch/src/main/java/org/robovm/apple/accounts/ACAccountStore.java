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
package org.robovm.apple.accounts;

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
 * @deprecated Deprecated in iOS 15.0. Use appropriate non-Apple SDK corresponding to the type of account you want to reference instead
 */
/*</javadoc>*/
/*<annotations>*/@Library("Accounts") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ACAccountStore/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 5.0 and later.
         */
        public NSObjectProtocol observeDidChange(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
    }
    
    /*<ptr>*/public static class ACAccountStorePtr extends Ptr<ACAccountStore, ACAccountStorePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ACAccountStore.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ACAccountStore() {}
    protected ACAccountStore(Handle h, long handle) { super(h, handle); }
    protected ACAccountStore(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "accounts")
    public native NSArray<ACAccount> getAccounts();
    /*</properties>*/
    /*<members>*//*</members>*/
    public void requestAccessToAccounts(ACAccountType accountType, ACAccountOptions options, @Block VoidBlock2<Boolean, NSError> completion) {
        requestAccessToAccounts(accountType, options == null ? null : options.getDictionary(), completion);
    }
    /*<methods>*/
    /**
     * @deprecated Deprecated in iOS 14.0. Public notification deprecated. Internal clients, see private header for replacement
     */
    @Deprecated
    @GlobalValue(symbol="ACAccountStoreDidChangeNotification", optional=true)
    public static native NSString DidChangeNotification();
    
    @Method(selector = "accountWithIdentifier:")
    public native ACAccount getAccount(String identifier);
    @Method(selector = "accountTypeWithAccountTypeIdentifier:")
    public native ACAccountType getAccountType(ACAccountTypeIdentifier typeIdentifier);
    @Method(selector = "accountsWithAccountType:")
    public native NSArray<ACAccount> getAccounts(ACAccountType accountType);
    @Method(selector = "saveAccount:withCompletionHandler:")
    public native void saveAccount(ACAccount account, @Block VoidBlock2<Boolean, NSError> completionHandler);
    @Method(selector = "requestAccessToAccountsWithType:options:completion:")
    protected native void requestAccessToAccounts(ACAccountType accountType, NSDictionary<?, ?> options, @Block VoidBlock2<Boolean, NSError> completion);
    @Method(selector = "renewCredentialsForAccount:completion:")
    public native void renewCredentials(ACAccount account, @Block VoidBlock2<ACAccountCredentialRenewResult, NSError> completionHandler);
    @Method(selector = "removeAccount:withCompletionHandler:")
    public native void removeAccount(ACAccount account, @Block VoidBlock2<Boolean, NSError> completionHandler);
    /*</methods>*/
}
