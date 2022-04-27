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
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKStoredValuePassProperties/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKStoredValuePassPropertiesPtr extends Ptr<PKStoredValuePassProperties, PKStoredValuePassPropertiesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKStoredValuePassProperties.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PKStoredValuePassProperties() {}
    protected PKStoredValuePassProperties(Handle h, long handle) { super(h, handle); }
    protected PKStoredValuePassProperties(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 15.0 and later.
     * @deprecated Deprecated in iOS 15.0. Use isBlocked
     */
    @Deprecated
    @Property(selector = "isBlacklisted")
    public native boolean isBlacklisted();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "isBlocked")
    public native boolean isBlocked();
    @Property(selector = "expirationDate")
    public native NSDate getExpirationDate();
    @Property(selector = "balances")
    public native NSArray<PKStoredValuePassBalance> getBalances();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "passPropertiesForPass:")
    public static native PKStoredValuePassProperties passPropertiesForPass(PKPass pass);
    /*</methods>*/
}
