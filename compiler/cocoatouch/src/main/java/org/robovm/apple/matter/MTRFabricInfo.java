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
/**
 * @since Available in iOS 16.5 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRFabricInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRFabricInfoPtr extends Ptr<MTRFabricInfo, MTRFabricInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRFabricInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRFabricInfo() {}
    protected MTRFabricInfo(Handle h, long handle) { super(h, handle); }
    protected MTRFabricInfo(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "rootPublicKey")
    public native NSData getRootPublicKey();
    @Property(selector = "vendorID")
    public native NSNumber getVendorID();
    @Property(selector = "fabricID")
    public native NSNumber getFabricID();
    @Property(selector = "nodeID")
    public native NSNumber getNodeID();
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "rootCertificate")
    public native NSData getRootCertificate();
    @Property(selector = "rootCertificateTLV")
    public native NSData getRootCertificateTLV();
    @Property(selector = "intermediateCertificate")
    public native NSData getIntermediateCertificate();
    @Property(selector = "intermediateCertificateTLV")
    public native NSData getIntermediateCertificateTLV();
    @Property(selector = "operationalCertificate")
    public native NSData getOperationalCertificate();
    @Property(selector = "operationalCertificateTLV")
    public native NSData getOperationalCertificateTLV();
    @Property(selector = "fabricIndex")
    public native NSNumber getFabricIndex();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
