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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/JSGlobalContextRef/*</name>*/ 
    extends /*<extends>*/NativeObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class JSGlobalContextRefPtr extends Ptr<JSGlobalContextRef, JSGlobalContextRefPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(JSGlobalContextRef.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected JSGlobalContextRef() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="JSGlobalContextCreate", optional=true)
    public static native JSGlobalContextRef create(JSClassRef globalObjectClass);
    @Bridge(symbol="JSGlobalContextCreateInGroup", optional=true)
    public static native JSGlobalContextRef createInGroup(JSContextGroupRef group, JSClassRef globalObjectClass);
    @Bridge(symbol="JSGlobalContextRetain", optional=true)
    public native JSGlobalContextRef retain();
    @Bridge(symbol="JSGlobalContextRelease", optional=true)
    public native void release();
    @Bridge(symbol="JSGlobalContextCopyName", optional=true)
    public native JSStringRef copyName();
    @Bridge(symbol="JSGlobalContextSetName", optional=true)
    public native void setName(JSStringRef name);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Bridge(symbol="JSGlobalContextIsInspectable", optional=true)
    public native boolean isInspectable();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Bridge(symbol="JSGlobalContextSetInspectable", optional=true)
    public native void setInspectable(boolean inspectable);
    /*</methods>*/
}
