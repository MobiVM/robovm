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
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Symbols") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSSymbolWiggleEffect/*</name>*/ 
    extends /*<extends>*/NSSymbolEffect/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSSymbolWiggleEffectPtr extends Ptr<NSSymbolWiggleEffect, NSSymbolWiggleEffectPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSSymbolWiggleEffect.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSSymbolWiggleEffect() {}
    protected NSSymbolWiggleEffect(Handle h, long handle) { super(h, handle); }
    protected NSSymbolWiggleEffect(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "effectWithByLayer")
    public native NSSymbolWiggleEffect effectByLayer();
    @Method(selector = "effectWithWholeSymbol")
    public native NSSymbolWiggleEffect effectWholeSymbol();
    @Method(selector = "effect")
    public static native NSSymbolWiggleEffect effect();
    @Method(selector = "wiggleClockwiseEffect")
    public static native NSSymbolWiggleEffect wiggleClockwiseEffect();
    @Method(selector = "wiggleCounterClockwiseEffect")
    public static native NSSymbolWiggleEffect wiggleCounterClockwiseEffect();
    @Method(selector = "wiggleLeftEffect")
    public static native NSSymbolWiggleEffect wiggleLeftEffect();
    @Method(selector = "wiggleRightEffect")
    public static native NSSymbolWiggleEffect wiggleRightEffect();
    @Method(selector = "wiggleUpEffect")
    public static native NSSymbolWiggleEffect wiggleUpEffect();
    @Method(selector = "wiggleDownEffect")
    public static native NSSymbolWiggleEffect wiggleDownEffect();
    @Method(selector = "wiggleForwardEffect")
    public static native NSSymbolWiggleEffect wiggleForwardEffect();
    @Method(selector = "wiggleBackwardEffect")
    public static native NSSymbolWiggleEffect wiggleBackwardEffect();
    @Method(selector = "wiggleCustomAngleEffect:")
    public static native NSSymbolWiggleEffect wiggleCustomAngleEffect(double angle);
    /*</methods>*/
}
