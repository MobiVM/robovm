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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SecKey/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SecKeyPtr extends Ptr<SecKey, SecKeyPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(SecKey.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SecKey() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /**
     * @throws OSStatusException 
     * @since Available in iOS 2.0 and later.
     */
    public static void generatePair(SecKeyParameters parameters, SecKey.SecKeyPtr publicKey, SecKey.SecKeyPtr privateKey) throws OSStatusException {
        OSStatus status = generatePair0(parameters, publicKey, privateKey);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 2.0 and later.
     */
    public static void generatePair(SecKeyParameters parameters, VoidBlock2<SecKey, SecKey> result) throws OSStatusException {
        SecKey.SecKeyPtr publicPtr = new SecKey.SecKeyPtr();
        SecKey.SecKeyPtr privatePtr = new SecKey.SecKeyPtr();
        generatePair(parameters, publicPtr, privatePtr);
        result.invoke(publicPtr.get(), privatePtr.get());
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 2.0 and later.
     */
    public byte[] rawSign(SecPadding padding, byte[] dataToSign) throws OSStatusException {
        if (dataToSign == null) {
            throw new NullPointerException("dataToSign");
        }
        BytePtr sigPtr = new BytePtr();
        MachineSizedUIntPtr sigLenPtr = new MachineSizedUIntPtr();
        OSStatus status = rawSign0(padding, VM.getArrayValuesAddress(dataToSign), dataToSign.length, sigPtr, sigLenPtr);
        OSStatusException.throwIfNecessary(status);
        return sigPtr.toByteArray((int)sigLenPtr.get());
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 2.0 and later.
     */
    public void rawVerify(SecPadding padding, byte[] signedData, byte[] sig) throws OSStatusException {
        if (signedData == null) {
            throw new NullPointerException("signedData");
        }
        if (sig == null) {
            throw new NullPointerException("sig");
        }
        OSStatus status = rawVerify0(padding, VM.getArrayValuesAddress(signedData), signedData.length, VM.getArrayValuesAddress(sig), sig.length);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 2.0 and later.
     */
    public byte[] encrypt(SecPadding padding, byte[] plainText) throws OSStatusException {
        if (plainText == null) {
            throw new NullPointerException("plainText");
        }
        BytePtr cipherTextPtr = new BytePtr();
        MachineSizedUIntPtr cipherTextLenPtr = new MachineSizedUIntPtr();
        OSStatus status = encrypt0(padding, VM.getArrayValuesAddress(plainText), plainText.length, cipherTextPtr, cipherTextLenPtr);
        OSStatusException.throwIfNecessary(status);
        return cipherTextPtr.toByteArray((int)cipherTextLenPtr.get());
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 2.0 and later.
     */
    public byte[] decrypt(SecPadding padding, byte[] cipherText) throws OSStatusException {
        if (cipherText == null) {
            throw new NullPointerException("cipherText");
        }
        BytePtr plainTextPtr = new BytePtr();
        MachineSizedUIntPtr plainTextLenPtr = new MachineSizedUIntPtr();
        OSStatus status = decrypt0(padding, VM.getArrayValuesAddress(cipherText), cipherText.length, plainTextPtr, plainTextLenPtr);
        OSStatusException.throwIfNecessary(status);
        return plainTextPtr.toByteArray((int)plainTextLenPtr.get());
    }
    /*<methods>*/
    @Bridge(symbol="SecKeyGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    @Bridge(symbol="SecKeyGeneratePair", optional=true)
    protected static native OSStatus generatePair0(SecKeyParameters parameters, SecKey.SecKeyPtr publicKey, SecKey.SecKeyPtr privateKey);
    @Bridge(symbol="SecKeyRawSign", optional=true)
    protected native OSStatus rawSign0(SecPadding padding, @Pointer long dataToSign, @MachineSizedUInt long dataToSignLen, BytePtr sig, MachineSizedUIntPtr sigLen);
    @Bridge(symbol="SecKeyRawVerify", optional=true)
    protected native OSStatus rawVerify0(SecPadding padding, @Pointer long signedData, @MachineSizedUInt long signedDataLen, @Pointer long sig, @MachineSizedUInt long sigLen);
    @Bridge(symbol="SecKeyEncrypt", optional=true)
    protected native OSStatus encrypt0(SecPadding padding, @Pointer long plainText, @MachineSizedUInt long plainTextLen, BytePtr cipherText, MachineSizedUIntPtr cipherTextLen);
    @Bridge(symbol="SecKeyDecrypt", optional=true)
    protected native OSStatus decrypt0(SecPadding padding, @Pointer long cipherText, @MachineSizedUInt long cipherTextLen, BytePtr plainText, MachineSizedUIntPtr plainTextLen);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static SecKey createRandomKey(NSDictionary parameters) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       SecKey result = createRandomKey(parameters, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="SecKeyCreateRandomKey", optional=true)
    private static native SecKey createRandomKey(NSDictionary parameters, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static SecKey createWithData(NSData keyData, NSDictionary attributes) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       SecKey result = createWithData(keyData, attributes, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="SecKeyCreateWithData", optional=true)
    private static native SecKey createWithData(NSData keyData, NSDictionary attributes, NSError.NSErrorPtr error);
    @Bridge(symbol="SecKeyGetBlockSize", optional=true)
    public native @MachineSizedUInt long getBlockSize();
    /**
     * @since Available in iOS 10.0 and later.
     */
    public NSData copyExternalRepresentation() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = copyExternalRepresentation(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="SecKeyCopyExternalRepresentation", optional=true)
    private native NSData copyExternalRepresentation(NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="SecKeyCopyAttributes", optional=true)
    public native NSDictionary copyAttributes();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="SecKeyCopyPublicKey", optional=true)
    public native SecKey copyPublicKey();
    /**
     * @since Available in iOS 10.0 and later.
     */
    public NSData createSignature(String algorithm, NSData dataToSign) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = createSignature(algorithm, dataToSign, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="SecKeyCreateSignature", optional=true)
    private native NSData createSignature(String algorithm, NSData dataToSign, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public boolean verifySignature(String algorithm, NSData signedData, NSData signature) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = verifySignature(algorithm, signedData, signature, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="SecKeyVerifySignature", optional=true)
    private native boolean verifySignature(String algorithm, NSData signedData, NSData signature, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public NSData createEncryptedData(String algorithm, NSData plaintext) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = createEncryptedData(algorithm, plaintext, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="SecKeyCreateEncryptedData", optional=true)
    private native NSData createEncryptedData(String algorithm, NSData plaintext, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public NSData createDecryptedData(String algorithm, NSData ciphertext) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = createDecryptedData(algorithm, ciphertext, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="SecKeyCreateDecryptedData", optional=true)
    private native NSData createDecryptedData(String algorithm, NSData ciphertext, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public NSData copyKeyExchangeResult(String algorithm, SecKey publicKey, NSDictionary parameters) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = copyKeyExchangeResult(algorithm, publicKey, parameters, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="SecKeyCopyKeyExchangeResult", optional=true)
    private native NSData copyKeyExchangeResult(String algorithm, SecKey publicKey, NSDictionary parameters, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="SecKeyIsAlgorithmSupported", optional=true)
    public native boolean isAlgorithmSupported(SecKeyOperationType operation, String algorithm);
    /*</methods>*/
}
