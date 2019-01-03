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
package org.robovm.apple.networkextension;

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
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NetworkExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEFilterControlVerdict/*</name>*/ 
    extends /*<extends>*/NEFilterNewFlowVerdict/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NEFilterControlVerdictPtr extends Ptr<NEFilterControlVerdict, NEFilterControlVerdictPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEFilterControlVerdict.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEFilterControlVerdict() {}
    protected NEFilterControlVerdict(Handle h, long handle) { super(h, handle); }
    protected NEFilterControlVerdict(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "allowVerdictWithUpdateRules:")
    public static native NEFilterControlVerdict createAllowVerdict(boolean updateRules);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "dropVerdictWithUpdateRules:")
    public static native NEFilterControlVerdict createDropVerdict(boolean updateRules);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "updateRules")
    public static native NEFilterControlVerdict updateRules();
    /*</methods>*/
}
