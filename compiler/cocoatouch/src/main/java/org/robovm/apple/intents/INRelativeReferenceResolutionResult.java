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
 * @deprecated Deprecated in iOS 15.0. INRelativeReferenceResolutionResult is deprecated. There is no replacement.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INRelativeReferenceResolutionResult/*</name>*/ 
    extends /*<extends>*/INIntentResolutionResult/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INRelativeReferenceResolutionResultPtr extends Ptr<INRelativeReferenceResolutionResult, INRelativeReferenceResolutionResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INRelativeReferenceResolutionResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INRelativeReferenceResolutionResult() {}
    protected INRelativeReferenceResolutionResult(Handle h, long handle) { super(h, handle); }
    protected INRelativeReferenceResolutionResult(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "successWithResolvedRelativeReference:")
    public static native INRelativeReferenceResolutionResult success(INRelativeReference resolvedRelativeReference);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use +successWithResolvedRelativeReference:
     */
    @Deprecated
    @Method(selector = "successWithResolvedValue:")
    public static native INRelativeReferenceResolutionResult successValue(INRelativeReference resolvedValue);
    @Method(selector = "confirmationRequiredWithRelativeReferenceToConfirm:")
    public static native INRelativeReferenceResolutionResult confirmationRequired(INRelativeReference relativeReferenceToConfirm);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use +confirmationRequiredWithRelativeReferenceToConfirm:
     */
    @Deprecated
    @Method(selector = "confirmationRequiredWithValueToConfirm:")
    public static native INRelativeReferenceResolutionResult confirmationRequiredForValue(INRelativeReference valueToConfirm);
    @Method(selector = "needsValue")
    public static native INRelativeReferenceResolutionResult needsValue();
    @Method(selector = "notRequired")
    public static native INRelativeReferenceResolutionResult notRequired();
    @Method(selector = "unsupported")
    public static native INRelativeReferenceResolutionResult unsupported();
    /*</methods>*/
}
