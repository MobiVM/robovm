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
/*<annotations>*/@Library("JavaScriptCore")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/JSContextRef/*</name>*/ 
    extends /*<extends>*/NativeObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class JSContextRefPtr extends Ptr<JSContextRef, JSContextRefPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(JSContextRef.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected JSContextRef() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="JSEvaluateScript", optional=true)
    public native JSValueRef evaluateScript(JSStringRef script, JSObjectRef thisObject, JSStringRef sourceURL, int startingLineNumber, JSValueRef.JSValueRefPtr exception);
    @Bridge(symbol="JSCheckScriptSyntax", optional=true)
    public native boolean checkScriptSyntax(JSStringRef script, JSStringRef sourceURL, int startingLineNumber, JSValueRef.JSValueRefPtr exception);
    @Bridge(symbol="JSGarbageCollect", optional=true)
    public native void garbageCollect();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Bridge(symbol="JSBigIntCreateWithDouble", optional=true)
    public native JSValueRef createBigIntWithDouble(double value, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Bridge(symbol="JSBigIntCreateWithInt64", optional=true)
    public native JSValueRef createBigIntWithInt64(long integer, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Bridge(symbol="JSBigIntCreateWithUInt64", optional=true)
    public native JSValueRef createBigIntWithUInt64(long integer, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Bridge(symbol="JSBigIntCreateWithString", optional=true)
    public native JSValueRef createBigIntWithString(JSStringRef string, JSValueRef.JSValueRefPtr exception);
    @Bridge(symbol="JSContextGroupCreate", optional=true)
    public static native JSContextGroupRef groupCreate();
    @Bridge(symbol="JSContextGroupRetain", optional=true)
    public static native JSContextGroupRef groupRetain(JSContextGroupRef group);
    @Bridge(symbol="JSContextGroupRelease", optional=true)
    public static native void groupRelease(JSContextGroupRef group);
    @Bridge(symbol="JSContextGetGlobalObject", optional=true)
    public native JSObjectRef getGlobalObject();
    @Bridge(symbol="JSContextGetGroup", optional=true)
    public native JSContextGroupRef getGroup();
    @Bridge(symbol="JSContextGetGlobalContext", optional=true)
    public native JSGlobalContextRef getGlobalContext();
    /*</methods>*/
}
