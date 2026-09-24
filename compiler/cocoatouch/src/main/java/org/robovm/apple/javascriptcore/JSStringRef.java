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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/JSStringRef/*</name>*/ 
    extends /*<extends>*/NativeObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class JSStringRefPtr extends Ptr<JSStringRef, JSStringRefPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(JSStringRef.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected JSStringRef() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="JSStringCreateWithCharacters", optional=true)
    public static native JSStringRef createWithCharacters(ShortPtr chars, @MachineSizedUInt long numChars);
    @Bridge(symbol="JSStringCreateWithUTF8CString", optional=true)
    public static native JSStringRef createWithUTF8CString(BytePtr string);
    @Bridge(symbol="JSStringRetain", optional=true)
    public native JSStringRef retain();
    @Bridge(symbol="JSStringRelease", optional=true)
    public native void release();
    @Bridge(symbol="JSStringGetLength", optional=true)
    public native @MachineSizedUInt long getLength();
    @Bridge(symbol="JSStringGetCharactersPtr", optional=true)
    public native ShortPtr getCharactersPtr();
    @Bridge(symbol="JSStringGetMaximumUTF8CStringSize", optional=true)
    public native @MachineSizedUInt long getMaximumUTF8CStringSize();
    @Bridge(symbol="JSStringGetUTF8CString", optional=true)
    public native @MachineSizedUInt long getUTF8CString(BytePtr buffer, @MachineSizedUInt long bufferSize);
    @Bridge(symbol="JSStringIsEqual", optional=true)
    public native boolean isEqual(JSStringRef b);
    @Bridge(symbol="JSStringIsEqualToUTF8CString", optional=true)
    public native boolean isEqualToUTF8CString(BytePtr b);
    @Bridge(symbol="JSStringCreateWithCFString", optional=true)
    public static native JSStringRef createWithCFString(CFString string);
    @Bridge(symbol="JSStringCopyCFString", optional=true)
    public static native CFString copyCFString(CFAllocator alloc, JSStringRef string);
    /*</methods>*/
}
