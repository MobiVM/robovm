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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSSymbolEffectOptions/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NSSymbolEffectOptionsPtr extends Ptr<NSSymbolEffectOptions, NSSymbolEffectOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSSymbolEffectOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSSymbolEffectOptions() {}
    protected NSSymbolEffectOptions(Handle h, long handle) { super(h, handle); }
    protected NSSymbolEffectOptions(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public NSSymbolEffectOptions(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "optionsWithRepeating")
    public native NSSymbolEffectOptions withRepeating();
    @Method(selector = "optionsWithNonRepeating")
    public native NSSymbolEffectOptions withNonRepeating();
    @Method(selector = "optionsWithRepeatCount:")
    public native NSSymbolEffectOptions withRepeatCount$(@MachineSizedSInt long count);
    @Method(selector = "optionsWithSpeed:")
    public native NSSymbolEffectOptions withSpeed$(double speed);
    @Method(selector = "options")
    public static native NSSymbolEffectOptions options();
    @Method(selector = "optionsWithRepeating")
    public static native NSSymbolEffectOptions optionsWithRepeating();
    @Method(selector = "optionsWithNonRepeating")
    public static native NSSymbolEffectOptions optionsWithNonRepeating();
    @Method(selector = "optionsWithRepeatCount:")
    public static native NSSymbolEffectOptions optionsWithRepeatCount$(@MachineSizedSInt long count);
    @Method(selector = "optionsWithSpeed:")
    public static native NSSymbolEffectOptions optionsWithSpeed$(double speed);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
