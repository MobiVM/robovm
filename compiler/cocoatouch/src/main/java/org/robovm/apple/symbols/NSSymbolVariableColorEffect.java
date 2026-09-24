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
package org.robovm.apple.symbols;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Symbols") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSSymbolVariableColorEffect/*</name>*/ 
    extends /*<extends>*/NSSymbolEffect/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSSymbolVariableColorEffectPtr extends Ptr<NSSymbolVariableColorEffect, NSSymbolVariableColorEffectPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSSymbolVariableColorEffect.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSSymbolVariableColorEffect() {}
    protected NSSymbolVariableColorEffect(Handle h, long handle) { super(h, handle); }
    protected NSSymbolVariableColorEffect(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "effectWithIterative")
    public native NSSymbolVariableColorEffect withIterative();
    @Method(selector = "effectWithCumulative")
    public native NSSymbolVariableColorEffect withCumulative();
    @Method(selector = "effectWithReversing")
    public native NSSymbolVariableColorEffect withReversing();
    @Method(selector = "effectWithNonReversing")
    public native NSSymbolVariableColorEffect withNonReversing();
    @Method(selector = "effectWithHideInactiveLayers")
    public native NSSymbolVariableColorEffect withHideInactiveLayers();
    @Method(selector = "effectWithDimInactiveLayers")
    public native NSSymbolVariableColorEffect withDimInactiveLayers();
    @Method(selector = "effect")
    public static native NSSymbolVariableColorEffect effect();
    /*</methods>*/
}
