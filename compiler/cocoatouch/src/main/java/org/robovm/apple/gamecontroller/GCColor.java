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
package org.robovm.apple.gamecontroller;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.corehaptic.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("GameController") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCColor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class GCColorPtr extends Ptr<GCColor, GCColorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GCColor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected GCColor() {}
    protected GCColor(Handle h, long handle) { super(h, handle); }
    protected GCColor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRed:green:blue:")
    public GCColor(float red, float green, float blue) { super((SkipInit) null); initObject(init(red, green, blue)); }
    @Method(selector = "initWithCoder:")
    public GCColor(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "red")
    public native float getRed();
    @Property(selector = "green")
    public native float getGreen();
    @Property(selector = "blue")
    public native float getBlue();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRed:green:blue:")
    protected native @Pointer long init(float red, float green, float blue);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
