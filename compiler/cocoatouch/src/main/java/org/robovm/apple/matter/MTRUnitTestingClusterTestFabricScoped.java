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
package org.robovm.apple.matter;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRUnitTestingClusterTestFabricScoped/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRUnitTestingClusterTestFabricScopedPtr extends Ptr<MTRUnitTestingClusterTestFabricScoped, MTRUnitTestingClusterTestFabricScopedPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRUnitTestingClusterTestFabricScoped.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRUnitTestingClusterTestFabricScoped() {}
    protected MTRUnitTestingClusterTestFabricScoped(Handle h, long handle) { super(h, handle); }
    protected MTRUnitTestingClusterTestFabricScoped(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "fabricSensitiveInt8u")
    public native NSNumber getFabricSensitiveInt8u();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setFabricSensitiveInt8u:")
    public native void setFabricSensitiveInt8u(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "optionalFabricSensitiveInt8u")
    public native NSNumber getOptionalFabricSensitiveInt8u();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setOptionalFabricSensitiveInt8u:")
    public native void setOptionalFabricSensitiveInt8u(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableFabricSensitiveInt8u")
    public native NSNumber getNullableFabricSensitiveInt8u();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableFabricSensitiveInt8u:")
    public native void setNullableFabricSensitiveInt8u(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableOptionalFabricSensitiveInt8u")
    public native NSNumber getNullableOptionalFabricSensitiveInt8u();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableOptionalFabricSensitiveInt8u:")
    public native void setNullableOptionalFabricSensitiveInt8u(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "fabricSensitiveCharString")
    public native String getFabricSensitiveCharString();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setFabricSensitiveCharString:")
    public native void setFabricSensitiveCharString(String v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "fabricSensitiveStruct")
    public native MTRUnitTestingClusterSimpleStruct getFabricSensitiveStruct();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setFabricSensitiveStruct:")
    public native void setFabricSensitiveStruct(MTRUnitTestingClusterSimpleStruct v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "fabricSensitiveInt8uList")
    public native NSArray<?> getFabricSensitiveInt8uList();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setFabricSensitiveInt8uList:")
    public native void setFabricSensitiveInt8uList(NSArray<?> v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "fabricIndex")
    public native NSNumber getFabricIndex();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setFabricIndex:")
    public native void setFabricIndex(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
