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
package org.robovm.apple.contacts;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Contacts") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CNPhoneNumber/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CNPhoneNumberPtr extends Ptr<CNPhoneNumber, CNPhoneNumberPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CNPhoneNumber.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CNPhoneNumber(Handle h, long handle) { super(h, handle); }
    protected CNPhoneNumber(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithStringValue:")
    public CNPhoneNumber(String string) { super((SkipInit) null); initObject(init(string)); }
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use phoneNumberWithStringValue:
     */
    @Deprecated
    public CNPhoneNumber() { super((Handle) null, create()); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public CNPhoneNumber(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "stringValue")
    public native String getStringValue();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithStringValue:")
    protected native @Pointer long init(String string);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use phoneNumberWithStringValue:
     */
    @Deprecated
    @Method(selector = "new")
    protected static native @Pointer long create();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
