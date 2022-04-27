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
 * @since Available in iOS 10.0 and later.
 * @deprecated Deprecated in iOS 15.0. INCarSeatResolutionResult is deprecated. There is no replacement.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INCarSeatResolutionResult/*</name>*/ 
    extends /*<extends>*/INIntentResolutionResult/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INCarSeatResolutionResultPtr extends Ptr<INCarSeatResolutionResult, INCarSeatResolutionResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INCarSeatResolutionResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INCarSeatResolutionResult() {}
    protected INCarSeatResolutionResult(Handle h, long handle) { super(h, handle); }
    protected INCarSeatResolutionResult(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "successWithResolvedCarSeat:")
    public static native INCarSeatResolutionResult success(INCarSeat resolvedCarSeat);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use +successWithResolvedCarSeat:
     */
    @Deprecated
    @Method(selector = "successWithResolvedValue:")
    public static native INCarSeatResolutionResult successValue(INCarSeat resolvedValue);
    @Method(selector = "confirmationRequiredWithCarSeatToConfirm:")
    public static native INCarSeatResolutionResult confirmationRequired(INCarSeat carSeatToConfirm);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use +confirmationRequiredWithCarSeatToConfirm:
     */
    @Deprecated
    @Method(selector = "confirmationRequiredWithValueToConfirm:")
    public static native INCarSeatResolutionResult confirmationRequiredForValue(INCarSeat valueToConfirm);
    @Method(selector = "needsValue")
    public static native INCarSeatResolutionResult needsValue();
    @Method(selector = "notRequired")
    public static native INCarSeatResolutionResult notRequired();
    @Method(selector = "unsupported")
    public static native INCarSeatResolutionResult unsupported();
    /*</methods>*/
}
