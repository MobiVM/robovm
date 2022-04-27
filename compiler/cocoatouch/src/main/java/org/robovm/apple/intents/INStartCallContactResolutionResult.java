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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INStartCallContactResolutionResult/*</name>*/ 
    extends /*<extends>*/INPersonResolutionResult/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INStartCallContactResolutionResultPtr extends Ptr<INStartCallContactResolutionResult, INStartCallContactResolutionResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INStartCallContactResolutionResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INStartCallContactResolutionResult() {}
    protected INStartCallContactResolutionResult(Handle h, long handle) { super(h, handle); }
    protected INStartCallContactResolutionResult(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPersonResolutionResult:")
    public INStartCallContactResolutionResult(INPersonResolutionResult personResolutionResult) { super((SkipInit) null); initObject(init(personResolutionResult)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPersonResolutionResult:")
    protected native @Pointer long init(INPersonResolutionResult personResolutionResult);
    @Method(selector = "unsupportedForReason:")
    public static native INStartCallContactResolutionResult unsupportedForReason(INStartCallContactUnsupportedReason reason);
    @Method(selector = "successWithResolvedPerson:")
    public static native INStartCallContactResolutionResult success(INPerson resolvedPerson);
    @Method(selector = "disambiguationWithPeopleToDisambiguate:")
    public static native INStartCallContactResolutionResult disambiguation(NSArray<INPerson> peopleToDisambiguate);
    @Method(selector = "confirmationRequiredWithPersonToConfirm:")
    public static native INStartCallContactResolutionResult confirmationRequired(INPerson personToConfirm);
    @Method(selector = "needsValue")
    public static native INStartCallContactResolutionResult needsValue();
    @Method(selector = "notRequired")
    public static native INStartCallContactResolutionResult notRequired();
    @Method(selector = "unsupported")
    public static native INStartCallContactResolutionResult unsupported();
    /*</methods>*/
}
