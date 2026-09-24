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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRUnitTestingClusterNullablesAndOptionalsStruct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRUnitTestingClusterNullablesAndOptionalsStructPtr extends Ptr<MTRUnitTestingClusterNullablesAndOptionalsStruct, MTRUnitTestingClusterNullablesAndOptionalsStructPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRUnitTestingClusterNullablesAndOptionalsStruct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRUnitTestingClusterNullablesAndOptionalsStruct() {}
    protected MTRUnitTestingClusterNullablesAndOptionalsStruct(Handle h, long handle) { super(h, handle); }
    protected MTRUnitTestingClusterNullablesAndOptionalsStruct(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableInt")
    public native NSNumber getNullableInt();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableInt:")
    public native void setNullableInt(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "optionalInt")
    public native NSNumber getOptionalInt();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setOptionalInt:")
    public native void setOptionalInt(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableOptionalInt")
    public native NSNumber getNullableOptionalInt();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableOptionalInt:")
    public native void setNullableOptionalInt(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableString")
    public native String getNullableString();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableString:")
    public native void setNullableString(String v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "optionalString")
    public native String getOptionalString();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setOptionalString:")
    public native void setOptionalString(String v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableOptionalString")
    public native String getNullableOptionalString();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableOptionalString:")
    public native void setNullableOptionalString(String v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableStruct")
    public native MTRUnitTestingClusterSimpleStruct getNullableStruct();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableStruct:")
    public native void setNullableStruct(MTRUnitTestingClusterSimpleStruct v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "optionalStruct")
    public native MTRUnitTestingClusterSimpleStruct getOptionalStruct();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setOptionalStruct:")
    public native void setOptionalStruct(MTRUnitTestingClusterSimpleStruct v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableOptionalStruct")
    public native MTRUnitTestingClusterSimpleStruct getNullableOptionalStruct();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableOptionalStruct:")
    public native void setNullableOptionalStruct(MTRUnitTestingClusterSimpleStruct v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableList")
    public native NSArray<?> getNullableList();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableList:")
    public native void setNullableList(NSArray<?> v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "optionalList")
    public native NSArray<?> getOptionalList();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setOptionalList:")
    public native void setOptionalList(NSArray<?> v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableOptionalList")
    public native NSArray<?> getNullableOptionalList();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableOptionalList:")
    public native void setNullableOptionalList(NSArray<?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
