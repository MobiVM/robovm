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
package org.robovm.apple.healthkit;

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
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKSourceRevision/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class HKSourceRevisionPtr extends Ptr<HKSourceRevision, HKSourceRevisionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKSourceRevision.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKSourceRevision() {}
    protected HKSourceRevision(Handle h, long handle) { super(h, handle); }
    protected HKSourceRevision(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithSource:version:productType:operatingSystemVersion:")
    public HKSourceRevision(HKSource source, String version, String productType, @ByVal NSOperatingSystemVersion operatingSystemVersion) { super((SkipInit) null); initObject(init(source, version, productType, operatingSystemVersion)); }
    @Method(selector = "initWithSource:version:")
    public HKSourceRevision(HKSource source, String version) { super((SkipInit) null); initObject(init(source, version)); }
    @Method(selector = "initWithCoder:")
    public HKSourceRevision(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "source")
    public native HKSource getSource();
    @Property(selector = "version")
    public native String getVersion();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "productType")
    public native String getProductType();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "operatingSystemVersion")
    public native @ByVal NSOperatingSystemVersion getOperatingSystemVersion();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="HKSourceRevisionAnyVersion", optional=true)
    public static native String AnyVersion();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="HKSourceRevisionAnyProductType", optional=true)
    public static native String AnyProductType();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="HKSourceRevisionAnyOperatingSystem", optional=true)
    public static native @ByVal NSOperatingSystemVersion AnyOperatingSystem();
    
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithSource:version:productType:operatingSystemVersion:")
    protected native @Pointer long init(HKSource source, String version, String productType, @ByVal NSOperatingSystemVersion operatingSystemVersion);
    @Method(selector = "initWithSource:version:")
    protected native @Pointer long init(HKSource source, String version);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
