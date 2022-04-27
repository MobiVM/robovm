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
package org.robovm.apple.security;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Security")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SecCertificate/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SecCertificatePtr extends Ptr<SecCertificate, SecCertificatePtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(SecCertificate.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SecCertificate() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="SecCertificateGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    @Bridge(symbol="SecCertificateCreateWithData", optional=true)
    public static native SecCertificate create(CFAllocator allocator, NSData data);
    @Bridge(symbol="SecCertificateCopyData", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(NSObject.NoRetainMarshaler.class) NSData getData();
    @Bridge(symbol="SecCertificateCopySubjectSummary", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(CFString.AsStringNoRetainMarshaler.class) String getSubjectSummary();
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Bridge(symbol="SecCertificateCopyCommonName", optional=true)
    public native OSStatus getCommonName(String commonName);
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Bridge(symbol="SecCertificateCopyEmailAddresses", optional=true)
    public native OSStatus getEmailAddresses(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> emailAddresses);
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Bridge(symbol="SecCertificateCopyNormalizedIssuerSequence", optional=true)
    public native NSData copyNormalizedIssuerSequence();
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Bridge(symbol="SecCertificateCopyNormalizedSubjectSequence", optional=true)
    public native NSData copyNormalizedSubjectSequence();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="SecCertificateCopyKey", optional=true)
    public native SecKey copyKey();
    /**
     * @since Available in iOS 10.3 and later.
     * @deprecated Deprecated in iOS 12.0. Use SecCertificateCopyKey
     */
    @Deprecated
    @Bridge(symbol="SecCertificateCopyPublicKey", optional=true)
    public native SecKey copyPublicKey();
    /**
     * @since Available in iOS 11.0 and later.
     */
    public NSData copySerialNumberData() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = copySerialNumberData(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="SecCertificateCopySerialNumberData", optional=true)
    private native NSData copySerialNumberData(NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 10.3 and later.
     * @deprecated Deprecated in iOS 11.0. Use SecCertificateCopySerialNumberData
     */
    @Deprecated
    @Bridge(symbol="SecCertificateCopySerialNumber", optional=true)
    public native NSData copySerialNumber();
    /*</methods>*/
}
