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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.3 and later.
 * @deprecated Deprecated in iOS 15.0. INSearchForBillsIntentResponse is deprecated. There is no replacement.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSearchForBillsIntentResponse/*</name>*/ 
    extends /*<extends>*/INIntentResponse/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INSearchForBillsIntentResponsePtr extends Ptr<INSearchForBillsIntentResponse, INSearchForBillsIntentResponsePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INSearchForBillsIntentResponse.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INSearchForBillsIntentResponse() {}
    protected INSearchForBillsIntentResponse(Handle h, long handle) { super(h, handle); }
    protected INSearchForBillsIntentResponse(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCode:userActivity:")
    public INSearchForBillsIntentResponse(INSearchForBillsIntentResponseCode code, NSUserActivity userActivity) { super((SkipInit) null); initObject(init(code, userActivity)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "code")
    public native INSearchForBillsIntentResponseCode getCode();
    @Property(selector = "bills")
    public native NSArray<INBillDetails> getBills();
    @Property(selector = "setBills:")
    public native void setBills(NSArray<INBillDetails> v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCode:userActivity:")
    protected native @Pointer long init(INSearchForBillsIntentResponseCode code, NSUserActivity userActivity);
    /*</methods>*/
}
