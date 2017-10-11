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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SecKeyAlgorithm/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(SecKeyAlgorithm.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSASignatureRaw", optional=true)
    public static native String RSASignatureRaw();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSASignatureDigestPKCS1v15Raw", optional=true)
    public static native String RSASignatureDigestPKCS1v15Raw();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSASignatureDigestPKCS1v15SHA1", optional=true)
    public static native String RSASignatureDigestPKCS1v15SHA1();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSASignatureDigestPKCS1v15SHA224", optional=true)
    public static native String RSASignatureDigestPKCS1v15SHA224();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSASignatureDigestPKCS1v15SHA256", optional=true)
    public static native String RSASignatureDigestPKCS1v15SHA256();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSASignatureDigestPKCS1v15SHA384", optional=true)
    public static native String RSASignatureDigestPKCS1v15SHA384();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSASignatureDigestPKCS1v15SHA512", optional=true)
    public static native String RSASignatureDigestPKCS1v15SHA512();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSASignatureMessagePKCS1v15SHA1", optional=true)
    public static native String RSASignatureMessagePKCS1v15SHA1();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSASignatureMessagePKCS1v15SHA224", optional=true)
    public static native String RSASignatureMessagePKCS1v15SHA224();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSASignatureMessagePKCS1v15SHA256", optional=true)
    public static native String RSASignatureMessagePKCS1v15SHA256();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSASignatureMessagePKCS1v15SHA384", optional=true)
    public static native String RSASignatureMessagePKCS1v15SHA384();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSASignatureMessagePKCS1v15SHA512", optional=true)
    public static native String RSASignatureMessagePKCS1v15SHA512();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSASignatureDigestPSSSHA1", optional=true)
    public static native String RSASignatureDigestPSSSHA1();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSASignatureDigestPSSSHA224", optional=true)
    public static native String RSASignatureDigestPSSSHA224();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSASignatureDigestPSSSHA256", optional=true)
    public static native String RSASignatureDigestPSSSHA256();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSASignatureDigestPSSSHA384", optional=true)
    public static native String RSASignatureDigestPSSSHA384();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSASignatureDigestPSSSHA512", optional=true)
    public static native String RSASignatureDigestPSSSHA512();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSASignatureMessagePSSSHA1", optional=true)
    public static native String RSASignatureMessagePSSSHA1();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSASignatureMessagePSSSHA224", optional=true)
    public static native String RSASignatureMessagePSSSHA224();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSASignatureMessagePSSSHA256", optional=true)
    public static native String RSASignatureMessagePSSSHA256();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSASignatureMessagePSSSHA384", optional=true)
    public static native String RSASignatureMessagePSSSHA384();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSASignatureMessagePSSSHA512", optional=true)
    public static native String RSASignatureMessagePSSSHA512();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECDSASignatureRFC4754", optional=true)
    public static native String ECDSASignatureRFC4754();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECDSASignatureDigestX962", optional=true)
    public static native String ECDSASignatureDigestX962();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECDSASignatureDigestX962SHA1", optional=true)
    public static native String ECDSASignatureDigestX962SHA1();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECDSASignatureDigestX962SHA224", optional=true)
    public static native String ECDSASignatureDigestX962SHA224();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECDSASignatureDigestX962SHA256", optional=true)
    public static native String ECDSASignatureDigestX962SHA256();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECDSASignatureDigestX962SHA384", optional=true)
    public static native String ECDSASignatureDigestX962SHA384();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECDSASignatureDigestX962SHA512", optional=true)
    public static native String ECDSASignatureDigestX962SHA512();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECDSASignatureMessageX962SHA1", optional=true)
    public static native String ECDSASignatureMessageX962SHA1();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECDSASignatureMessageX962SHA224", optional=true)
    public static native String ECDSASignatureMessageX962SHA224();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECDSASignatureMessageX962SHA256", optional=true)
    public static native String ECDSASignatureMessageX962SHA256();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECDSASignatureMessageX962SHA384", optional=true)
    public static native String ECDSASignatureMessageX962SHA384();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECDSASignatureMessageX962SHA512", optional=true)
    public static native String ECDSASignatureMessageX962SHA512();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSAEncryptionRaw", optional=true)
    public static native String RSAEncryptionRaw();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSAEncryptionPKCS1", optional=true)
    public static native String RSAEncryptionPKCS1();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSAEncryptionOAEPSHA1", optional=true)
    public static native String RSAEncryptionOAEPSHA1();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSAEncryptionOAEPSHA224", optional=true)
    public static native String RSAEncryptionOAEPSHA224();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSAEncryptionOAEPSHA256", optional=true)
    public static native String RSAEncryptionOAEPSHA256();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSAEncryptionOAEPSHA384", optional=true)
    public static native String RSAEncryptionOAEPSHA384();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSAEncryptionOAEPSHA512", optional=true)
    public static native String RSAEncryptionOAEPSHA512();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSAEncryptionOAEPSHA1AESGCM", optional=true)
    public static native String RSAEncryptionOAEPSHA1AESGCM();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSAEncryptionOAEPSHA224AESGCM", optional=true)
    public static native String RSAEncryptionOAEPSHA224AESGCM();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSAEncryptionOAEPSHA256AESGCM", optional=true)
    public static native String RSAEncryptionOAEPSHA256AESGCM();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSAEncryptionOAEPSHA384AESGCM", optional=true)
    public static native String RSAEncryptionOAEPSHA384AESGCM();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmRSAEncryptionOAEPSHA512AESGCM", optional=true)
    public static native String RSAEncryptionOAEPSHA512AESGCM();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECIESEncryptionStandardX963SHA1AESGCM", optional=true)
    public static native String ECIESEncryptionStandardX963SHA1AESGCM();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECIESEncryptionStandardX963SHA224AESGCM", optional=true)
    public static native String ECIESEncryptionStandardX963SHA224AESGCM();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECIESEncryptionStandardX963SHA256AESGCM", optional=true)
    public static native String ECIESEncryptionStandardX963SHA256AESGCM();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECIESEncryptionStandardX963SHA384AESGCM", optional=true)
    public static native String ECIESEncryptionStandardX963SHA384AESGCM();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECIESEncryptionStandardX963SHA512AESGCM", optional=true)
    public static native String ECIESEncryptionStandardX963SHA512AESGCM();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECIESEncryptionCofactorX963SHA1AESGCM", optional=true)
    public static native String ECIESEncryptionCofactorX963SHA1AESGCM();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECIESEncryptionCofactorX963SHA224AESGCM", optional=true)
    public static native String ECIESEncryptionCofactorX963SHA224AESGCM();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECIESEncryptionCofactorX963SHA256AESGCM", optional=true)
    public static native String ECIESEncryptionCofactorX963SHA256AESGCM();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECIESEncryptionCofactorX963SHA384AESGCM", optional=true)
    public static native String ECIESEncryptionCofactorX963SHA384AESGCM();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECIESEncryptionCofactorX963SHA512AESGCM", optional=true)
    public static native String ECIESEncryptionCofactorX963SHA512AESGCM();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECIESEncryptionStandardVariableIVX963SHA224AESGCM", optional=true)
    public static native String ECIESEncryptionStandardVariableIVX963SHA224AESGCM();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECIESEncryptionStandardVariableIVX963SHA256AESGCM", optional=true)
    public static native String ECIESEncryptionStandardVariableIVX963SHA256AESGCM();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECIESEncryptionStandardVariableIVX963SHA384AESGCM", optional=true)
    public static native String ECIESEncryptionStandardVariableIVX963SHA384AESGCM();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECIESEncryptionStandardVariableIVX963SHA512AESGCM", optional=true)
    public static native String ECIESEncryptionStandardVariableIVX963SHA512AESGCM();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECIESEncryptionCofactorVariableIVX963SHA224AESGCM", optional=true)
    public static native String ECIESEncryptionCofactorVariableIVX963SHA224AESGCM();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECIESEncryptionCofactorVariableIVX963SHA256AESGCM", optional=true)
    public static native String ECIESEncryptionCofactorVariableIVX963SHA256AESGCM();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECIESEncryptionCofactorVariableIVX963SHA384AESGCM", optional=true)
    public static native String ECIESEncryptionCofactorVariableIVX963SHA384AESGCM();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECIESEncryptionCofactorVariableIVX963SHA512AESGCM", optional=true)
    public static native String ECIESEncryptionCofactorVariableIVX963SHA512AESGCM();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECDHKeyExchangeStandard", optional=true)
    public static native String ECDHKeyExchangeStandard();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECDHKeyExchangeStandardX963SHA1", optional=true)
    public static native String ECDHKeyExchangeStandardX963SHA1();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECDHKeyExchangeStandardX963SHA224", optional=true)
    public static native String ECDHKeyExchangeStandardX963SHA224();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECDHKeyExchangeStandardX963SHA256", optional=true)
    public static native String ECDHKeyExchangeStandardX963SHA256();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECDHKeyExchangeStandardX963SHA384", optional=true)
    public static native String ECDHKeyExchangeStandardX963SHA384();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECDHKeyExchangeStandardX963SHA512", optional=true)
    public static native String ECDHKeyExchangeStandardX963SHA512();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECDHKeyExchangeCofactor", optional=true)
    public static native String ECDHKeyExchangeCofactor();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECDHKeyExchangeCofactorX963SHA1", optional=true)
    public static native String ECDHKeyExchangeCofactorX963SHA1();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECDHKeyExchangeCofactorX963SHA224", optional=true)
    public static native String ECDHKeyExchangeCofactorX963SHA224();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECDHKeyExchangeCofactorX963SHA256", optional=true)
    public static native String ECDHKeyExchangeCofactorX963SHA256();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECDHKeyExchangeCofactorX963SHA384", optional=true)
    public static native String ECDHKeyExchangeCofactorX963SHA384();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kSecKeyAlgorithmECDHKeyExchangeCofactorX963SHA512", optional=true)
    public static native String ECDHKeyExchangeCofactorX963SHA512();
    /*</methods>*/
}
