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
package org.robovm.apple.storekit;

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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
@ForceLinkClass(SKError.class)
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/SKErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    Unknown(0L),
    ClientInvalid(1L),
    PaymentCancelled(2L),
    PaymentInvalid(3L),
    PaymentNotAllowed(4L),
    StoreProductNotAvailable(5L),
    /**
     * @since Available in iOS 9.3 and later.
     */
    CloudServicePermissionDenied(6L),
    /**
     * @since Available in iOS 9.3 and later.
     */
    CloudServiceNetworkConnectionFailed(7L),
    /**
     * @since Available in iOS 10.3 and later.
     */
    CloudServiceRevoked(8L),
    /**
     * @since Available in iOS 12.2 and later.
     */
    PrivacyAcknowledgementRequired(9L),
    /**
     * @since Available in iOS 12.2 and later.
     */
    UnauthorizedRequestData(10L),
    /**
     * @since Available in iOS 12.2 and later.
     */
    InvalidOfferIdentifier(11L),
    /**
     * @since Available in iOS 12.2 and later.
     */
    InvalidSignature(12L),
    /**
     * @since Available in iOS 12.2 and later.
     */
    MissingOfferParams(13L),
    /**
     * @since Available in iOS 12.2 and later.
     */
    InvalidOfferPrice(14L),
    /**
     * @since Available in iOS 12.2 and later.
     */
    OverlayCancelled(15L),
    /**
     * @since Available in iOS 14.0 and later.
     */
    OverlayInvalidConfiguration(16L),
    /**
     * @since Available in iOS 14.0 and later.
     */
    OverlayTimeout(17L),
    /**
     * @since Available in iOS 14.0 and later.
     */
    IneligibleForOffer(18L),
    /**
     * @since Available in iOS 14.0 and later.
     */
    UnsupportedPlatform(19L),
    /**
     * @since Available in iOS 14.5 and later.
     */
    OverlayPresentedInBackgroundScene(20L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/SKErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/SKErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/SKErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/SKErrorCode/*</name>*/.class.getName());
    }
}
