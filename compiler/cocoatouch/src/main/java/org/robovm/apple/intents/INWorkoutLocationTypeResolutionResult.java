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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INWorkoutLocationTypeResolutionResult/*</name>*/ 
    extends /*<extends>*/INIntentResolutionResult/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INWorkoutLocationTypeResolutionResultPtr extends Ptr<INWorkoutLocationTypeResolutionResult, INWorkoutLocationTypeResolutionResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INWorkoutLocationTypeResolutionResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INWorkoutLocationTypeResolutionResult() {}
    protected INWorkoutLocationTypeResolutionResult(Handle h, long handle) { super(h, handle); }
    protected INWorkoutLocationTypeResolutionResult(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "successWithResolvedWorkoutLocationType:")
    public static native INWorkoutLocationTypeResolutionResult success(INWorkoutLocationType resolvedWorkoutLocationType);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use +successWithResolvedWorkoutLocationType:
     */
    @Deprecated
    @Method(selector = "successWithResolvedValue:")
    public static native INWorkoutLocationTypeResolutionResult successValue(INWorkoutLocationType resolvedValue);
    @Method(selector = "confirmationRequiredWithWorkoutLocationTypeToConfirm:")
    public static native INWorkoutLocationTypeResolutionResult confirmationRequired(INWorkoutLocationType workoutLocationTypeToConfirm);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use +confirmationRequiredWithWorkoutLocationTypeToConfirm:
     */
    @Deprecated
    @Method(selector = "confirmationRequiredWithValueToConfirm:")
    public static native INWorkoutLocationTypeResolutionResult confirmationRequiredForValue(INWorkoutLocationType valueToConfirm);
    @Method(selector = "needsValue")
    public static native INWorkoutLocationTypeResolutionResult needsValue();
    @Method(selector = "notRequired")
    public static native INWorkoutLocationTypeResolutionResult notRequired();
    @Method(selector = "unsupported")
    public static native INWorkoutLocationTypeResolutionResult unsupported();
    /*</methods>*/
}
