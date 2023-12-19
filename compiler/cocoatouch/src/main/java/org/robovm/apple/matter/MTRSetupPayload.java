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
package org.robovm.apple.matter;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRSetupPayload/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MTRSetupPayloadPtr extends Ptr<MTRSetupPayload, MTRSetupPayloadPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRSetupPayload.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRSetupPayload() {}
    protected MTRSetupPayload(Handle h, long handle) { super(h, handle); }
    protected MTRSetupPayload(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.2 and later.
     */
    @Method(selector = "initWithSetupPasscode:discriminator:")
    public MTRSetupPayload(NSNumber setupPasscode, NSNumber discriminator) { super((SkipInit) null); initObject(init(setupPasscode, discriminator)); }
    /**
     * @since Available in iOS 16.2 and later.
     */
    public MTRSetupPayload(String onboardingPayload) throws NSErrorException {
       this(onboardingPayload, new NSError.NSErrorPtr());
    }
    private MTRSetupPayload(String onboardingPayload, NSError.NSErrorPtr ptr) throws NSErrorException {
       super((Handle) null, setupPayload(onboardingPayload, ptr));
       retain(getHandle());
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
    }
    @Method(selector = "initWithCoder:")
    public MTRSetupPayload(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "version")
    public native NSNumber getVersion();
    @Property(selector = "setVersion:")
    public native void setVersion(NSNumber v);
    @Property(selector = "vendorID")
    public native NSNumber getVendorID();
    @Property(selector = "setVendorID:")
    public native void setVendorID(NSNumber v);
    @Property(selector = "productID")
    public native NSNumber getProductID();
    @Property(selector = "setProductID:")
    public native void setProductID(NSNumber v);
    @Property(selector = "commissioningFlow")
    public native MTRCommissioningFlow getCommissioningFlow();
    @Property(selector = "setCommissioningFlow:")
    public native void setCommissioningFlow(MTRCommissioningFlow v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "discoveryCapabilities")
    public native MTRDiscoveryCapabilities getDiscoveryCapabilities();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setDiscoveryCapabilities:")
    public native void setDiscoveryCapabilities(MTRDiscoveryCapabilities v);
    @Property(selector = "discriminator")
    public native NSNumber getDiscriminator();
    @Property(selector = "setDiscriminator:")
    public native void setDiscriminator(NSNumber v);
    @Property(selector = "hasShortDiscriminator")
    public native boolean hasShortDiscriminator();
    @Property(selector = "setHasShortDiscriminator:")
    public native void setHasShortDiscriminator(boolean v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setupPasscode")
    public native NSNumber getSetupPasscode();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setSetupPasscode:")
    public native void setSetupPasscode(NSNumber v);
    @Property(selector = "serialNumber")
    public native String getSerialNumber();
    @Property(selector = "setSerialNumber:")
    public native void setSerialNumber(String v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getAllOptionalVendorData:")
    public native NSArray<MTROptionalQRCodeInfo> getAllOptionalVendorData(NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 16.2 and later.
     */
    @Method(selector = "initWithSetupPasscode:discriminator:")
    protected native @Pointer long init(NSNumber setupPasscode, NSNumber discriminator);
    @Method(selector = "manualEntryCode")
    public native String manualEntryCode();
    /**
     * @since Available in iOS 16.2 and later.
     */
    @Method(selector = "qrCodeString:")
    public native String qrCodeString(NSError.NSErrorPtr error);
    @Method(selector = "generateRandomPIN")
    public static native @MachineSizedUInt long generateRandomPIN();
    /**
     * @since Available in iOS 16.2 and later.
     */
    @Method(selector = "generateRandomSetupPasscode")
    public static native NSNumber generateRandomSetupPasscode();
    /**
     * @since Available in iOS 16.2 and later.
     */
    @Method(selector = "setupPayloadWithOnboardingPayload:error:")
    protected static native @Pointer long setupPayload(String onboardingPayload, NSError.NSErrorPtr error);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
