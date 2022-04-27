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
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INMessageAttributeResolutionResult/*</name>*/ 
    extends /*<extends>*/INIntentResolutionResult/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INMessageAttributeResolutionResultPtr extends Ptr<INMessageAttributeResolutionResult, INMessageAttributeResolutionResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INMessageAttributeResolutionResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INMessageAttributeResolutionResult() {}
    protected INMessageAttributeResolutionResult(Handle h, long handle) { super(h, handle); }
    protected INMessageAttributeResolutionResult(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "successWithResolvedMessageAttribute:")
    public static native INMessageAttributeResolutionResult success(INMessageAttribute resolvedMessageAttribute);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use +successWithResolvedMessageAttribute:
     */
    @Deprecated
    @Method(selector = "successWithResolvedValue:")
    public static native INMessageAttributeResolutionResult successValue(INMessageAttribute resolvedValue);
    @Method(selector = "confirmationRequiredWithMessageAttributeToConfirm:")
    public static native INMessageAttributeResolutionResult confirmationRequired(INMessageAttribute messageAttributeToConfirm);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use +confirmationRequiredWithMessageAttributeToConfirm:
     */
    @Deprecated
    @Method(selector = "confirmationRequiredWithValueToConfirm:")
    public static native INMessageAttributeResolutionResult confirmationRequiredForValue(INMessageAttribute valueToConfirm);
    @Method(selector = "needsValue")
    public static native INMessageAttributeResolutionResult needsValue();
    @Method(selector = "notRequired")
    public static native INMessageAttributeResolutionResult notRequired();
    @Method(selector = "unsupported")
    public static native INMessageAttributeResolutionResult unsupported();
    /*</methods>*/
}
