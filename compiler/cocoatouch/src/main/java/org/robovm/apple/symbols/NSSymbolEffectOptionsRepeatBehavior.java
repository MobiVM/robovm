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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSSymbolEffectOptionsRepeatBehavior/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NSSymbolEffectOptionsRepeatBehaviorPtr extends Ptr<NSSymbolEffectOptionsRepeatBehavior, NSSymbolEffectOptionsRepeatBehaviorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSSymbolEffectOptionsRepeatBehavior.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSSymbolEffectOptionsRepeatBehavior() {}
    protected NSSymbolEffectOptionsRepeatBehavior(Handle h, long handle) { super(h, handle); }
    protected NSSymbolEffectOptionsRepeatBehavior(SkipInit skipInit) { super(skipInit); }
    public NSSymbolEffectOptionsRepeatBehavior(@MachineSizedSInt long count) { super((Handle) null, create(count)); retain(getHandle()); }
    public NSSymbolEffectOptionsRepeatBehavior(double delay) { super((Handle) null, create(delay)); retain(getHandle()); }
    public NSSymbolEffectOptionsRepeatBehavior(@MachineSizedSInt long count, double delay) { super((Handle) null, create(count, delay)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public NSSymbolEffectOptionsRepeatBehavior(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "behaviorPeriodic")
    public static native NSSymbolEffectOptionsRepeatBehavior behaviorPeriodic();
    @Method(selector = "behaviorPeriodicWithCount:")
    protected static native @Pointer long create(@MachineSizedSInt long count);
    @Method(selector = "behaviorPeriodicWithDelay:")
    protected static native @Pointer long create(double delay);
    @Method(selector = "behaviorPeriodicWithCount:delay:")
    protected static native @Pointer long create(@MachineSizedSInt long count, double delay);
    @Method(selector = "behaviorContinuous")
    public static native NSSymbolEffectOptionsRepeatBehavior behaviorContinuous();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
