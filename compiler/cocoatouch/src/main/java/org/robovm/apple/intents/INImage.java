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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INImage/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INImagePtr extends Ptr<INImage, INImagePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INImage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INImage() {}
    protected INImage(Handle h, long handle) { super(h, handle); }
    protected INImage(SkipInit skipInit) { super(skipInit); }
    public INImage(NSData imageData) { super((Handle) null, create(imageData)); retain(getHandle()); }
    public INImage(NSURL URL) { super((Handle) null, create(URL)); retain(getHandle()); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    public INImage(NSURL URL, double width, double height) { super((Handle) null, create(URL, width, height)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public INImage(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "imageNamed:")
    public static native INImage imageNamed(String name);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "systemImageNamed:")
    public static native INImage systemImageNamed(String systemImageName);
    @Method(selector = "imageWithImageData:")
    protected static native @Pointer long create(NSData imageData);
    @Method(selector = "imageWithURL:")
    protected static native @Pointer long create(NSURL URL);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "imageWithURL:width:height:")
    protected static native @Pointer long create(NSURL URL, double width, double height);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
