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
package org.robovm.apple.corespotlight;

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
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreSpotlight") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CSPerson/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CSPersonPtr extends Ptr<CSPerson, CSPersonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CSPerson.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CSPerson() {}
    protected CSPerson(Handle h, long handle) { super(h, handle); }
    protected CSPerson(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDisplayName:handles:handleIdentifier:")
    public CSPerson(String displayName, NSArray<NSString> handles, String handleIdentifier) { super((SkipInit) null); initObject(init(displayName, handles, handleIdentifier)); }
    @Method(selector = "initWithCoder:")
    public CSPerson(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "displayName")
    public native String getDisplayName();
    @Property(selector = "handles")
    public native NSArray<NSString> getHandles();
    @Property(selector = "handleIdentifier")
    public native String getHandleIdentifier();
    @Property(selector = "contactIdentifier")
    public native String getContactIdentifier();
    @Property(selector = "setContactIdentifier:")
    public native void setContactIdentifier(String v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDisplayName:handles:handleIdentifier:")
    protected native @Pointer long init(String displayName, NSArray<NSString> handles, String handleIdentifier);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
