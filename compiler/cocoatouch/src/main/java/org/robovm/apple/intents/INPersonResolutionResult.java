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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INPersonResolutionResult/*</name>*/ 
    extends /*<extends>*/INIntentResolutionResult/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INPersonResolutionResultPtr extends Ptr<INPersonResolutionResult, INPersonResolutionResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INPersonResolutionResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INPersonResolutionResult() {}
    protected INPersonResolutionResult(Handle h, long handle) { super(h, handle); }
    protected INPersonResolutionResult(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "successWithResolvedPerson:")
    public static native INPersonResolutionResult successWithResolvedPerson(INPerson resolvedPerson);
    @Method(selector = "disambiguationWithPeopleToDisambiguate:")
    public static native INPersonResolutionResult disambiguationWithPeopleToDisambiguate(NSArray<INPerson> peopleToDisambiguate);
    @Method(selector = "confirmationRequiredWithPersonToConfirm:")
    public static native INPersonResolutionResult confirmationRequiredWithPersonToConfirm(INPerson personToConfirm);
    /*</methods>*/
}
