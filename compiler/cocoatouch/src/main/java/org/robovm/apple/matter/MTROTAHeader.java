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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTROTAHeader/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTROTAHeaderPtr extends Ptr<MTROTAHeader, MTROTAHeaderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTROTAHeader.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTROTAHeader() {}
    protected MTROTAHeader(Handle h, long handle) { super(h, handle); }
    protected MTROTAHeader(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithData:")
    public MTROTAHeader(NSData data) { super((SkipInit) null); initObject(init(data)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "vendorID")
    public native NSNumber getVendorID();
    @Property(selector = "setVendorID:")
    public native void setVendorID(NSNumber v);
    @Property(selector = "productID")
    public native NSNumber getProductID();
    @Property(selector = "setProductID:")
    public native void setProductID(NSNumber v);
    @Property(selector = "payloadSize")
    public native NSNumber getPayloadSize();
    @Property(selector = "setPayloadSize:")
    public native void setPayloadSize(NSNumber v);
    @Property(selector = "softwareVersion")
    public native NSNumber getSoftwareVersion();
    @Property(selector = "setSoftwareVersion:")
    public native void setSoftwareVersion(NSNumber v);
    @Property(selector = "softwareVersionString")
    public native String getSoftwareVersionString();
    @Property(selector = "setSoftwareVersionString:")
    public native void setSoftwareVersionString(String v);
    @Property(selector = "releaseNotesURL")
    public native String getReleaseNotesURL();
    @Property(selector = "setReleaseNotesURL:")
    public native void setReleaseNotesURL(String v);
    @Property(selector = "imageDigest")
    public native NSData getImageDigest();
    @Property(selector = "setImageDigest:")
    public native void setImageDigest(NSData v);
    @Property(selector = "imageDigestType")
    public native MTROTAImageDigestType getImageDigestType();
    @Property(selector = "setImageDigestType:")
    public native void setImageDigestType(MTROTAImageDigestType v);
    @Property(selector = "minApplicableVersion")
    public native NSNumber getMinApplicableVersion();
    @Property(selector = "setMinApplicableVersion:")
    public native void setMinApplicableVersion(NSNumber v);
    @Property(selector = "maxApplicableVersion")
    public native NSNumber getMaxApplicableVersion();
    @Property(selector = "setMaxApplicableVersion:")
    public native void setMaxApplicableVersion(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithData:")
    protected native @Pointer long init(NSData data);
    /*</methods>*/
}
