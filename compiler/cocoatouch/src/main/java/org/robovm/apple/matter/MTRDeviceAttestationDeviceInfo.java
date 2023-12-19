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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRDeviceAttestationDeviceInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRDeviceAttestationDeviceInfoPtr extends Ptr<MTRDeviceAttestationDeviceInfo, MTRDeviceAttestationDeviceInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRDeviceAttestationDeviceInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRDeviceAttestationDeviceInfo() {}
    protected MTRDeviceAttestationDeviceInfo(Handle h, long handle) { super(h, handle); }
    protected MTRDeviceAttestationDeviceInfo(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "vendorID")
    public native NSNumber getVendorID();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "productID")
    public native NSNumber getProductID();
    /**
     * @since Available in iOS 16.6 and later.
     */
    @Property(selector = "basicInformationVendorID")
    public native NSNumber getBasicInformationVendorID();
    /**
     * @since Available in iOS 16.6 and later.
     */
    @Property(selector = "basicInformationProductID")
    public native NSNumber getBasicInformationProductID();
    @Property(selector = "dacCertificate")
    public native NSData getDacCertificate();
    @Property(selector = "dacPAICertificate")
    public native NSData getDacPAICertificate();
    @Property(selector = "certificateDeclaration")
    public native NSData getCertificateDeclaration();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
