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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRCertificates/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRCertificatesPtr extends Ptr<MTRCertificates, MTRCertificatesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRCertificates.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRCertificates() {}
    protected MTRCertificates(Handle h, long handle) { super(h, handle); }
    protected MTRCertificates(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.6 and later.
     */
    public static NSData createRootCertificate(MTRKeypair keypair, NSNumber issuerID, NSNumber fabricID, NSDateInterval validityPeriod) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = createRootCertificate(keypair, issuerID, fabricID, validityPeriod, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 16.6 and later.
     */
    @Method(selector = "createRootCertificate:issuerID:fabricID:validityPeriod:error:")
    private static native NSData createRootCertificate(MTRKeypair keypair, NSNumber issuerID, NSNumber fabricID, NSDateInterval validityPeriod, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static NSData createRootCertificate(MTRKeypair keypair, NSNumber issuerID, NSNumber fabricID) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = createRootCertificate(keypair, issuerID, fabricID, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "createRootCertificate:issuerID:fabricID:error:")
    private static native NSData createRootCertificate(MTRKeypair keypair, NSNumber issuerID, NSNumber fabricID, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 16.6 and later.
     */
    public static NSData createIntermediateCertificate(MTRKeypair rootKeypair, NSData rootCertificate, SecKey intermediatePublicKey, NSNumber issuerID, NSNumber fabricID, NSDateInterval validityPeriod) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = createIntermediateCertificate(rootKeypair, rootCertificate, intermediatePublicKey, issuerID, fabricID, validityPeriod, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 16.6 and later.
     */
    @Method(selector = "createIntermediateCertificate:rootCertificate:intermediatePublicKey:issuerID:fabricID:validityPeriod:error:")
    private static native NSData createIntermediateCertificate(MTRKeypair rootKeypair, NSData rootCertificate, SecKey intermediatePublicKey, NSNumber issuerID, NSNumber fabricID, NSDateInterval validityPeriod, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static NSData createIntermediateCertificate(MTRKeypair rootKeypair, NSData rootCertificate, SecKey intermediatePublicKey, NSNumber issuerID, NSNumber fabricID) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = createIntermediateCertificate(rootKeypair, rootCertificate, intermediatePublicKey, issuerID, fabricID, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "createIntermediateCertificate:rootCertificate:intermediatePublicKey:issuerID:fabricID:error:")
    private static native NSData createIntermediateCertificate(MTRKeypair rootKeypair, NSData rootCertificate, SecKey intermediatePublicKey, NSNumber issuerID, NSNumber fabricID, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 16.6 and later.
     */
    public static NSData createOperationalCertificate(MTRKeypair signingKeypair, NSData signingCertificate, SecKey operationalPublicKey, NSNumber fabricID, NSNumber nodeID, NSSet<NSNumber> caseAuthenticatedTags, NSDateInterval validityPeriod) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = createOperationalCertificate(signingKeypair, signingCertificate, operationalPublicKey, fabricID, nodeID, caseAuthenticatedTags, validityPeriod, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 16.6 and later.
     */
    @Method(selector = "createOperationalCertificate:signingCertificate:operationalPublicKey:fabricID:nodeID:caseAuthenticatedTags:validityPeriod:error:")
    private static native NSData createOperationalCertificate(MTRKeypair signingKeypair, NSData signingCertificate, SecKey operationalPublicKey, NSNumber fabricID, NSNumber nodeID, NSSet<NSNumber> caseAuthenticatedTags, NSDateInterval validityPeriod, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static NSData createOperationalCertificate(MTRKeypair signingKeypair, NSData signingCertificate, SecKey operationalPublicKey, NSNumber fabricID, NSNumber nodeID, NSSet<NSNumber> caseAuthenticatedTags) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = createOperationalCertificate(signingKeypair, signingCertificate, operationalPublicKey, fabricID, nodeID, caseAuthenticatedTags, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "createOperationalCertificate:signingCertificate:operationalPublicKey:fabricID:nodeID:caseAuthenticatedTags:error:")
    private static native NSData createOperationalCertificate(MTRKeypair signingKeypair, NSData signingCertificate, SecKey operationalPublicKey, NSNumber fabricID, NSNumber nodeID, NSSet<NSNumber> caseAuthenticatedTags, NSError.NSErrorPtr error);
    @Method(selector = "keypair:matchesCertificate:")
    public static native boolean keypairMatchesCertificate(MTRKeypair keypair, NSData certificate);
    @Method(selector = "isCertificate:equalTo:")
    public static native boolean isCertificateEquals(NSData certificate1, NSData certificate2);
    public static NSData createCertificateSigningRequest(MTRKeypair keypair) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = createCertificateSigningRequest(keypair, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "createCertificateSigningRequest:error:")
    private static native NSData createCertificateSigningRequest(MTRKeypair keypair, NSError.NSErrorPtr error);
    @Method(selector = "convertX509Certificate:")
    public static native NSData convertX509Certificate(NSData x509Certificate);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "convertMatterCertificate:")
    public static native NSData convertMatterCertificate(NSData matterCertificate);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static NSData publicKeyFromCSR(NSData csr) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = publicKeyFromCSR(csr, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "publicKeyFromCSR:error:")
    private static native NSData publicKeyFromCSR(NSData csr, NSError.NSErrorPtr error);
    /*</methods>*/
}
