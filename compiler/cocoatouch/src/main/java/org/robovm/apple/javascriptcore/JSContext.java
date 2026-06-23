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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/JSContext/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class JSContextPtr extends Ptr<JSContext, JSContextPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(JSContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public JSContext() {}
    protected JSContext(Handle h, long handle) { super(h, handle); }
    protected JSContext(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithVirtualMachine:")
    public JSContext(JSVirtualMachine virtualMachine) { super((SkipInit) null); initObject(init(virtualMachine)); }
    public JSContext(JSGlobalContextRef jsGlobalContextRef) { super((Handle) null, create(jsGlobalContextRef)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "globalObject")
    public native JSValue getGlobalObject();
    @Property(selector = "exception")
    public native JSValue getException();
    @Property(selector = "setException:")
    public native void setException(JSValue v);
    @Property(selector = "exceptionHandler")
    public native @Block VoidBlock2<JSContext, JSValue> getExceptionHandler();
    @Property(selector = "setExceptionHandler:")
    public native void setExceptionHandler(@Block VoidBlock2<JSContext, JSValue> v);
    @Property(selector = "virtualMachine")
    public native JSVirtualMachine getVirtualMachine();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "isInspectable")
    public native boolean isInspectable();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setInspectable:")
    public native void setInspectable(boolean v);
    @Property(selector = "JSGlobalContextRef")
    public native JSGlobalContextRef getJSGlobalContextRef();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithVirtualMachine:")
    protected native @Pointer long init(JSVirtualMachine virtualMachine);
    @Method(selector = "evaluateScript:")
    public native JSValue evaluateScript(String script);
    @Method(selector = "evaluateScript:withSourceURL:")
    public native JSValue evaluateScript(String script, NSURL sourceURL);
    @Method(selector = "currentContext")
    public static native JSContext currentContext();
    @Method(selector = "currentCallee")
    public static native JSValue currentCallee();
    @Method(selector = "currentThis")
    public static native JSValue currentThis();
    @Method(selector = "currentArguments")
    public static native NSArray<?> currentArguments();
    @Method(selector = "objectForKeyedSubscript:")
    public native JSValue objectForKeyedSubscript(NSObject key);
    @Method(selector = "setObject:forKeyedSubscript:")
    public native void setObject(NSObject object, NSObject key);
    @Method(selector = "contextWithJSGlobalContextRef:")
    protected static native @Pointer long create(JSGlobalContextRef jsGlobalContextRef);
    /*</methods>*/
}
