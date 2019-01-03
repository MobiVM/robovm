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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIPasteConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class UIPasteConfigurationPtr extends Ptr<UIPasteConfiguration, UIPasteConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIPasteConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIPasteConfiguration() {}
    protected UIPasteConfiguration(Handle h, long handle) { super(h, handle); }
    protected UIPasteConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAcceptableTypeIdentifiers:")
    public UIPasteConfiguration(NSArray<NSString> acceptableTypeIdentifiers) { super((SkipInit) null); initObject(init(acceptableTypeIdentifiers)); }
    @Method(selector = "initWithTypeIdentifiersForAcceptingClass:")
    public UIPasteConfiguration(Class<?> aClass) { super((SkipInit) null); initObject(init(aClass)); }
    @Method(selector = "initWithCoder:")
    public UIPasteConfiguration(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "acceptableTypeIdentifiers")
    public native NSArray<NSString> getAcceptableTypeIdentifiers();
    @Property(selector = "setAcceptableTypeIdentifiers:")
    public native void setAcceptableTypeIdentifiers(NSArray<NSString> v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAcceptableTypeIdentifiers:")
    protected native @Pointer long init(NSArray<NSString> acceptableTypeIdentifiers);
    @Method(selector = "addAcceptableTypeIdentifiers:")
    public native void addAcceptableTypeIdentifiers(NSArray<NSString> acceptableTypeIdentifiers);
    @Method(selector = "initWithTypeIdentifiersForAcceptingClass:")
    protected native @Pointer long init(Class<?> aClass);
    @Method(selector = "addTypeIdentifiersForAcceptingClass:")
    public native void addTypeIdentifiersForAcceptingClass(Class<?> aClass);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
