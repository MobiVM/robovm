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
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKPaymentSummaryItem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKPaymentSummaryItemPtr extends Ptr<PKPaymentSummaryItem, PKPaymentSummaryItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKPaymentSummaryItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PKPaymentSummaryItem() {}
    protected PKPaymentSummaryItem(Handle h, long handle) { super(h, handle); }
    protected PKPaymentSummaryItem(SkipInit skipInit) { super(skipInit); }
    public PKPaymentSummaryItem(String label, NSDecimalNumber amount) { super((Handle) null, create(label, amount)); retain(getHandle()); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    public PKPaymentSummaryItem(String label, NSDecimalNumber amount, PKPaymentSummaryItemType type) { super((Handle) null, create(label, amount, type)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    @Property(selector = "amount")
    public native NSDecimalNumber getAmount();
    @Property(selector = "setAmount:")
    public native void setAmount(NSDecimalNumber v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "type")
    public native PKPaymentSummaryItemType getType();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setType:")
    public native void setType(PKPaymentSummaryItemType v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "summaryItemWithLabel:amount:")
    protected static native @Pointer long create(String label, NSDecimalNumber amount);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "summaryItemWithLabel:amount:type:")
    protected static native @Pointer long create(String label, NSDecimalNumber amount, PKPaymentSummaryItemType type);
    /*</methods>*/
}
