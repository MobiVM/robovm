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
package org.robovm.apple.accessorysetupkit;

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
import org.robovm.apple.corebluetooth.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AccessorySetupKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASPropertyCompareString/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ASPropertyCompareStringPtr extends Ptr<ASPropertyCompareString, ASPropertyCompareStringPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ASPropertyCompareString.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ASPropertyCompareString() {}
    protected ASPropertyCompareString(Handle h, long handle) { super(h, handle); }
    protected ASPropertyCompareString(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithString:compareOptions:")
    public ASPropertyCompareString(String string, NSStringCompareOptions compareOptions) { super((SkipInit) null); initObject(init(string, compareOptions)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "string")
    public native String getString();
    @Property(selector = "compareOptions")
    public native NSStringCompareOptions getCompareOptions();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithString:compareOptions:")
    protected native @Pointer long init(String string, NSStringCompareOptions compareOptions);
    /*</methods>*/
}
