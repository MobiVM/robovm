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
package org.robovm.apple.javascriptcore;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("JavaScriptCore") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/JSManagedValue/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class JSManagedValuePtr extends Ptr<JSManagedValue, JSManagedValuePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(JSManagedValue.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public JSManagedValue() {}
    protected JSManagedValue(Handle h, long handle) { super(h, handle); }
    protected JSManagedValue(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithValue:")
    public JSManagedValue(JSValue value) { super((SkipInit) null); initObject(init(value)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "value")
    public native JSValue getValue();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithValue:")
    protected native @Pointer long init(JSValue value);
    @Method(selector = "managedValueWithValue:")
    public static native JSManagedValue managedValue(JSValue value);
    @Method(selector = "managedValueWithValue:andOwner:")
    public static native JSManagedValue managedValue(JSValue value, NSObject owner);
    /*</methods>*/
}
