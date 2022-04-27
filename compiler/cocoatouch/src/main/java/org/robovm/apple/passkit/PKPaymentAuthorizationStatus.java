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
package org.robovm.apple.passkit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.addressbook.*;
import org.robovm.apple.contacts.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/PKPaymentAuthorizationStatus/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Success(0L),
    Failure(1L),
    /**
     * @deprecated Deprecated in iOS 11.0. Use PKPaymentAuthorizationResult with PKPaymentAuthorizationStatusFailure and include the result of -paymentBillingAddressInvalidErrorWithKey:localizedDescription: in the errors array.
     */
    @Deprecated
    InvalidBillingPostalAddress(2L),
    /**
     * @deprecated Deprecated in iOS 11.0. Use PKPaymentAuthorizationResult with PKPaymentAuthorizationStatusFailure and include the result of -paymentShippingAddressInvalidErrorWithKey:localizedDescription: in the errors array.
     */
    @Deprecated
    InvalidShippingPostalAddress(3L),
    /**
     * @deprecated Deprecated in iOS 11.0. Use PKPaymentAuthorizationResult with PKPaymentAuthorizationStatusFailure and include the result of -paymentContactInvalidErrorWithContactField:localizedDescription: in the errors array.
     */
    @Deprecated
    InvalidShippingContact(4L),
    /**
     * @since Available in iOS 9.2 and later.
     */
    PINRequired(5L),
    /**
     * @since Available in iOS 9.2 and later.
     */
    PINIncorrect(6L),
    /**
     * @since Available in iOS 9.2 and later.
     */
    PINLockout(7L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/PKPaymentAuthorizationStatus/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/PKPaymentAuthorizationStatus/*</name>*/ valueOf(long n) {
        for (/*<name>*/PKPaymentAuthorizationStatus/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/PKPaymentAuthorizationStatus/*</name>*/.class.getName());
    }
}
