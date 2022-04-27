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
package org.robovm.apple.passkit;

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
import org.robovm.apple.addressbook.*;
import org.robovm.apple.contacts.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKPassLibrary/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        public static NSObjectProtocol observeDidChange(final VoidBlock1<PKPassLibraryNotification> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke (NSNotification a) {
                    NSDictionary userInfo = a.getUserInfo();
                    PKPassLibraryNotification data = null;
                    if (userInfo != null) {
                        data = new PKPassLibraryNotification(userInfo);
                    }
                    block.invoke(data);
                }
            });
        }
        public static NSObjectProtocol observeRemotePaymentPassesDidChange(final VoidBlock1<PKPassLibraryNotification> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(RemotePaymentPassesDidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke (NSNotification a) {
                    NSDictionary userInfo = a.getUserInfo();
                    PKPassLibraryNotification data = null;
                    if (userInfo != null) {
                        data = new PKPassLibraryNotification(userInfo);
                    }
                    block.invoke(data);
                }
            });
        }
    }

    /*<ptr>*/public static class PKPassLibraryPtr extends Ptr<PKPassLibrary, PKPassLibraryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKPassLibrary.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PKPassLibrary() {}
    protected PKPassLibrary(Handle h, long handle) { super(h, handle); }
    protected PKPassLibrary(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Property(selector = "isSecureElementPassActivationAvailable")
    public native boolean isSecureElementPassActivationAvailable();
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Property(selector = "remoteSecureElementPasses")
    public native NSArray<PKSecureElementPass> getRemoteSecureElementPasses();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="PKPassLibraryDidChangeNotification", optional=true)
    public static native NSString DidChangeNotification();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="PKPassLibraryRemotePaymentPassesDidChangeNotification", optional=true)
    public static native NSString RemotePaymentPassesDidChangeNotification();
    
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Use -[PKPassLibrary isSecureElementPassActivationAvailable] instead
     */
    @Deprecated
    @Method(selector = "isPaymentPassActivationAvailable")
    public native boolean isPaymentPassActivationAvailable();
    @Method(selector = "passes")
    public native NSArray<PKPass> getPasses();
    @Method(selector = "passWithPassTypeIdentifier:serialNumber:")
    public native PKPass getPass(String identifier, String serialNumber);
    @Method(selector = "passesOfType:")
    public native NSArray<PKPass> getPassesOfType(PKPassType passType);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Use -[PKPassLibrary remoteSecureElementPasses] instead
     */
    @Deprecated
    @Method(selector = "remotePaymentPasses")
    public native NSArray<PKPass> getRemotePaymentPasses();
    @Method(selector = "removePass:")
    public native void removePass(PKPass pass);
    @Method(selector = "containsPass:")
    public native boolean containsPass(PKPass pass);
    @Method(selector = "replacePassWithPass:")
    public native boolean replacePass(PKPass pass);
    @Method(selector = "addPasses:withCompletionHandler:")
    public native void addPasses(NSArray<PKPass> passes, @Block VoidBlock1<PKPassLibraryAddPassesStatus> completion);
    /**
     * @since Available in iOS 8.3 and later.
     */
    @Method(selector = "openPaymentSetup")
    public native void openPaymentSetup();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Use -[PKPassLibrary presentSecureElementPass:] instead
     */
    @Deprecated
    @Method(selector = "presentPaymentPass:")
    public native void presentPaymentPass(PKPaymentPass pass);
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Method(selector = "presentSecureElementPass:")
    public native void presentSecureElementPass(PKSecureElementPass pass);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Use -[PKPassLibrary canAddSecureElementPassWithPrimaryAccountIdentifier] instead
     */
    @Deprecated
    @Method(selector = "canAddPaymentPassWithPrimaryAccountIdentifier:")
    public native boolean canAddPaymentPass(String primaryAccountIdentifier);
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Method(selector = "canAddSecureElementPassWithPrimaryAccountIdentifier:")
    public native boolean canAddSecureElementPass(String primaryAccountIdentifier);
    /**
     * @since Available in iOS 10.1 and later.
     */
    @Method(selector = "canAddFelicaPass")
    public native boolean canAddFelicaPass();
    /**
     * @deprecated Use activateSecureElementPass:withActivationData:completion: instead
     */
    @Deprecated
    @Method(selector = "activatePaymentPass:withActivationData:completion:")
    public native void activatePaymentPass(PKPaymentPass paymentPass, NSData activationData, @Block VoidBlock2<Boolean, NSError> completion);
    /**
     * @deprecated Deprecated in iOS 9.0. Use activatePaymentPass:withActivationData:completion: instead
     */
    @Deprecated
    @Method(selector = "activatePaymentPass:withActivationCode:completion:")
    public native void activatePaymentPass(PKPaymentPass paymentPass, String activationCode, @Block VoidBlock2<Boolean, NSError> completion);
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Method(selector = "activateSecureElementPass:withActivationData:completion:")
    public native void activateSecureElementPass(PKSecureElementPass secureElementPass, NSData activationData, @Block VoidBlock2<Boolean, NSError> completion);
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Method(selector = "signData:withSecureElementPass:completion:")
    public native void signData(NSData signData, PKSecureElementPass secureElementPass, @Block VoidBlock3<NSData, NSData, NSError> completion);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "serviceProviderDataForSecureElementPass:completion:")
    public native void serviceProviderDataForSecureElementPass(PKSecureElementPass secureElementPass, @Block VoidBlock2<NSData, NSError> completion);
    @Method(selector = "isPassLibraryAvailable")
    public static native boolean isPassLibraryAvailable();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "requestAutomaticPassPresentationSuppressionWithResponseHandler:")
    public static native @MachineSizedUInt long requestAutomaticPassPresentationSuppression(@Block VoidBlock1<PKAutomaticPassPresentationSuppressionResult> responseHandler);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "endAutomaticPassPresentationSuppressionWithRequestToken:")
    public static native void endAutomaticPassPresentationSuppression(@MachineSizedUInt long requestToken);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "isSuppressingAutomaticPassPresentation")
    public static native boolean isSuppressingAutomaticPassPresentation();
    /**
     * @deprecated Deprecated in iOS 9.0. Use -[PKPassLibrary isPaymentPassActivationAvailable] instead
     */
    @Deprecated
    @Method(selector = "isPaymentPassActivationAvailable")
    public static native boolean isDevicePaymentPassActivationAvailable();
    /*</methods>*/
}
