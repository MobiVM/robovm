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
package org.robovm.apple.identitylookup;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/ILMessageFilterSubAction/*</name>*/ implements ValuedEnum {
    /*<values>*/
    None(0L),
    TransactionalOthers(10000L),
    TransactionalFinance(10001L),
    TransactionalOrders(10002L),
    TransactionalReminders(10003L),
    TransactionalHealth(10004L),
    TransactionalWeather(10005L),
    TransactionalCarrier(10006L),
    TransactionalRewards(10007L),
    TransactionalPublicServices(10008L),
    PromotionalOthers(20000L),
    PromotionalOffers(20001L),
    PromotionalCoupons(20002L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/ILMessageFilterSubAction/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/ILMessageFilterSubAction/*</name>*/ valueOf(long n) {
        for (/*<name>*/ILMessageFilterSubAction/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/ILMessageFilterSubAction/*</name>*/.class.getName());
    }
}
