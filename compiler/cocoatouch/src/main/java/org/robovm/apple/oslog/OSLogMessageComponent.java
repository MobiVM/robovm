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
package org.robovm.apple.oslog;

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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("OSLog") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSLogMessageComponent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class OSLogMessageComponentPtr extends Ptr<OSLogMessageComponent, OSLogMessageComponentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSLogMessageComponent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSLogMessageComponent() {}
    protected OSLogMessageComponent(Handle h, long handle) { super(h, handle); }
    protected OSLogMessageComponent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public OSLogMessageComponent(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "formatSubstring")
    public native String getFormatSubstring();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "placeholder")
    public native String getPlaceholder();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "argumentCategory")
    public native OSLogMessageComponentArgumentCategory getArgumentCategory();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "argumentDataValue")
    public native NSData getArgumentDataValue();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "argumentDoubleValue")
    public native double getArgumentDoubleValue();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "argumentInt64Value")
    public native long getArgumentInt64Value();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "argumentNumberValue")
    public native NSNumber getArgumentNumberValue();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "argumentStringValue")
    public native String getArgumentStringValue();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "argumentUInt64Value")
    public native long getArgumentUInt64Value();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
