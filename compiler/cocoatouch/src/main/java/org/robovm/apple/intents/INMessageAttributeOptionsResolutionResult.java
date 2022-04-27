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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INMessageAttributeOptionsResolutionResult/*</name>*/ 
    extends /*<extends>*/INIntentResolutionResult/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INMessageAttributeOptionsResolutionResultPtr extends Ptr<INMessageAttributeOptionsResolutionResult, INMessageAttributeOptionsResolutionResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INMessageAttributeOptionsResolutionResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INMessageAttributeOptionsResolutionResult() {}
    protected INMessageAttributeOptionsResolutionResult(Handle h, long handle) { super(h, handle); }
    protected INMessageAttributeOptionsResolutionResult(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "successWithResolvedMessageAttributeOptions:")
    public static native INMessageAttributeOptionsResolutionResult success(INMessageAttributeOptions resolvedMessageAttributeOptions);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use +successWithResolvedMessageAttributeOptions:
     */
    @Deprecated
    @Method(selector = "successWithResolvedValue:")
    public static native INMessageAttributeOptionsResolutionResult successValue(INMessageAttributeOptions resolvedValue);
    @Method(selector = "confirmationRequiredWithMessageAttributeOptionsToConfirm:")
    public static native INMessageAttributeOptionsResolutionResult confirmationRequired(INMessageAttributeOptions messageAttributeOptionsToConfirm);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use +confirmationRequiredWithMessageAttributeOptionsToConfirm:
     */
    @Deprecated
    @Method(selector = "confirmationRequiredWithValueToConfirm:")
    public static native INMessageAttributeOptionsResolutionResult confirmationRequiredForValue(INMessageAttributeOptions valueToConfirm);
    @Method(selector = "needsValue")
    public static native INMessageAttributeOptionsResolutionResult needsValue();
    @Method(selector = "notRequired")
    public static native INMessageAttributeOptionsResolutionResult notRequired();
    @Method(selector = "unsupported")
    public static native INMessageAttributeOptionsResolutionResult unsupported();
    /*</methods>*/
}
