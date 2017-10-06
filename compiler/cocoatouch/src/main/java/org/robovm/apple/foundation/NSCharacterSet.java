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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSCharacterSet/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NSCharacterSetPtr extends Ptr<NSCharacterSet, NSCharacterSetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSCharacterSet.class); }/*</bind>*/
    /*<constants>*/
    public static final int OpenStepUnicodeReservedBase = 62464;
    /*</constants>*/
    /*<constructors>*/
    public NSCharacterSet() {}
    @Deprecated protected NSCharacterSet(long handle) { super(handle); }
    protected NSCharacterSet(Handle h, long handle) { super(h, handle); }
    protected NSCharacterSet(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public NSCharacterSet(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    public NSCharacterSet(@ByVal NSRange aRange) { super((Handle) null, create(aRange)); retain(getHandle()); }
    public NSCharacterSet(String aString) { super((Handle) null, create(aString)); retain(getHandle()); }
    public NSCharacterSet(NSData data) { super((Handle) null, create(data)); retain(getHandle()); }
    /*</constructors>*/
    public NSCharacterSet(File file) {
        super(createWithFile(file));
    }
    private static long createWithFile(File file) {
        if (file == null) {
            throw new NullPointerException("file");
        }
        return createWithFile(file.getAbsolutePath());
    }
    /*<properties>*/
    @Property(selector = "controlCharacterSet")
    public static native NSCharacterSet getControlCharacterSet();
    @Property(selector = "whitespaceCharacterSet")
    public static native NSCharacterSet getWhitespaceCharacterSet();
    @Property(selector = "whitespaceAndNewlineCharacterSet")
    public static native NSCharacterSet getWhitespaceAndNewlineCharacterSet();
    @Property(selector = "decimalDigitCharacterSet")
    public static native NSCharacterSet getDecimalDigitCharacterSet();
    @Property(selector = "letterCharacterSet")
    public static native NSCharacterSet getLetterCharacterSet();
    @Property(selector = "lowercaseLetterCharacterSet")
    public static native NSCharacterSet getLowercaseLetterCharacterSet();
    @Property(selector = "uppercaseLetterCharacterSet")
    public static native NSCharacterSet getUppercaseLetterCharacterSet();
    @Property(selector = "nonBaseCharacterSet")
    public static native NSCharacterSet getNonBaseCharacterSet();
    @Property(selector = "alphanumericCharacterSet")
    public static native NSCharacterSet getAlphanumericCharacterSet();
    @Property(selector = "decomposableCharacterSet")
    public static native NSCharacterSet getDecomposableCharacterSet();
    @Property(selector = "illegalCharacterSet")
    public static native NSCharacterSet getIllegalCharacterSet();
    @Property(selector = "punctuationCharacterSet")
    public static native NSCharacterSet getPunctuationCharacterSet();
    @Property(selector = "capitalizedLetterCharacterSet")
    public static native NSCharacterSet getCapitalizedLetterCharacterSet();
    @Property(selector = "symbolCharacterSet")
    public static native NSCharacterSet getSymbolCharacterSet();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Property(selector = "newlineCharacterSet")
    public static native NSCharacterSet getNewlineCharacterSet();
    @Property(selector = "bitmapRepresentation")
    public native NSData getBitmapRepresentation();
    @Property(selector = "invertedSet")
    public native NSCharacterSet getInvertedSet();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "URLUserAllowedCharacterSet")
    public static native NSCharacterSet getURLUserAllowedCharacterSet();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "URLPasswordAllowedCharacterSet")
    public static native NSCharacterSet getURLPasswordAllowedCharacterSet();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "URLHostAllowedCharacterSet")
    public static native NSCharacterSet getURLHostAllowedCharacterSet();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "URLPathAllowedCharacterSet")
    public static native NSCharacterSet getURLPathAllowedCharacterSet();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "URLQueryAllowedCharacterSet")
    public static native NSCharacterSet getURLQueryAllowedCharacterSet();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "URLFragmentAllowedCharacterSet")
    public static native NSCharacterSet getURLFragmentAllowedCharacterSet();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    @Method(selector = "characterIsMember:")
    public native boolean isMember(short aCharacter);
    @Method(selector = "longCharacterIsMember:")
    public native boolean isMember(int theLongChar);
    @Method(selector = "isSupersetOfSet:")
    public native boolean isSuperset(NSCharacterSet theOtherSet);
    @Method(selector = "hasMemberInPlane:")
    public native boolean hasMemberInPlane(byte thePlane);
    @Method(selector = "characterSetWithRange:")
    protected static native @Pointer long create(@ByVal NSRange aRange);
    @Method(selector = "characterSetWithCharactersInString:")
    protected static native @Pointer long create(String aString);
    @Method(selector = "characterSetWithBitmapRepresentation:")
    protected static native @Pointer long create(NSData data);
    @Method(selector = "characterSetWithContentsOfFile:")
    private static native @Pointer long createWithFile(String fName);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
