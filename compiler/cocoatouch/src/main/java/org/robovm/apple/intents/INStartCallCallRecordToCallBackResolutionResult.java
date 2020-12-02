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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INStartCallCallRecordToCallBackResolutionResult/*</name>*/ 
    extends /*<extends>*/INCallRecordResolutionResult/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INStartCallCallRecordToCallBackResolutionResultPtr extends Ptr<INStartCallCallRecordToCallBackResolutionResult, INStartCallCallRecordToCallBackResolutionResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INStartCallCallRecordToCallBackResolutionResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INStartCallCallRecordToCallBackResolutionResult() {}
    protected INStartCallCallRecordToCallBackResolutionResult(Handle h, long handle) { super(h, handle); }
    protected INStartCallCallRecordToCallBackResolutionResult(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCallRecordResolutionResult:")
    public INStartCallCallRecordToCallBackResolutionResult(INCallRecordResolutionResult callRecordResolutionResult) { super((SkipInit) null); initObject(init(callRecordResolutionResult)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCallRecordResolutionResult:")
    protected native @Pointer long init(INCallRecordResolutionResult callRecordResolutionResult);
    @Method(selector = "unsupportedForReason:")
    public static native INStartCallCallRecordToCallBackResolutionResult unsupportedForReason(INStartCallCallRecordToCallBackUnsupportedReason reason);
    @Method(selector = "successWithResolvedCallRecord:")
    public static native INStartCallCallRecordToCallBackResolutionResult createSuccess(INCallRecord resolvedCallRecord);
    @Method(selector = "disambiguationWithCallRecordsToDisambiguate:")
    public static native INStartCallCallRecordToCallBackResolutionResult createDisambiguation(NSArray<INCallRecord> callRecordsToDisambiguate);
    @Method(selector = "confirmationRequiredWithCallRecordToConfirm:")
    public static native INStartCallCallRecordToCallBackResolutionResult createConfirmationRequired(INCallRecord callRecordToConfirm);
    @Method(selector = "needsValue")
    public static native INStartCallCallRecordToCallBackResolutionResult needsValue();
    @Method(selector = "notRequired")
    public static native INStartCallCallRecordToCallBackResolutionResult notRequired();
    @Method(selector = "unsupported")
    public static native INStartCallCallRecordToCallBackResolutionResult unsupported();
    /*</methods>*/
}
