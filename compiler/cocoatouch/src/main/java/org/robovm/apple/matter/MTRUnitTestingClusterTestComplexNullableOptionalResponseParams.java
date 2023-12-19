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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRUnitTestingClusterTestComplexNullableOptionalResponseParams/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRUnitTestingClusterTestComplexNullableOptionalResponseParamsPtr extends Ptr<MTRUnitTestingClusterTestComplexNullableOptionalResponseParams, MTRUnitTestingClusterTestComplexNullableOptionalResponseParamsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRUnitTestingClusterTestComplexNullableOptionalResponseParams.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRUnitTestingClusterTestComplexNullableOptionalResponseParams() {}
    protected MTRUnitTestingClusterTestComplexNullableOptionalResponseParams(Handle h, long handle) { super(h, handle); }
    protected MTRUnitTestingClusterTestComplexNullableOptionalResponseParams(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithResponseValue:error:")
    public MTRUnitTestingClusterTestComplexNullableOptionalResponseParams(NSDictionary<NSString, ?> responseValue) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(responseValue, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableIntWasNull")
    public native NSNumber getNullableIntWasNull();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableIntWasNull:")
    public native void setNullableIntWasNull(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableIntValue")
    public native NSNumber getNullableIntValue();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableIntValue:")
    public native void setNullableIntValue(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "optionalIntWasPresent")
    public native NSNumber getOptionalIntWasPresent();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setOptionalIntWasPresent:")
    public native void setOptionalIntWasPresent(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "optionalIntValue")
    public native NSNumber getOptionalIntValue();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setOptionalIntValue:")
    public native void setOptionalIntValue(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableOptionalIntWasPresent")
    public native NSNumber getNullableOptionalIntWasPresent();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableOptionalIntWasPresent:")
    public native void setNullableOptionalIntWasPresent(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableOptionalIntWasNull")
    public native NSNumber getNullableOptionalIntWasNull();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableOptionalIntWasNull:")
    public native void setNullableOptionalIntWasNull(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableOptionalIntValue")
    public native NSNumber getNullableOptionalIntValue();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableOptionalIntValue:")
    public native void setNullableOptionalIntValue(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableStringWasNull")
    public native NSNumber getNullableStringWasNull();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableStringWasNull:")
    public native void setNullableStringWasNull(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableStringValue")
    public native String getNullableStringValue();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableStringValue:")
    public native void setNullableStringValue(String v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "optionalStringWasPresent")
    public native NSNumber getOptionalStringWasPresent();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setOptionalStringWasPresent:")
    public native void setOptionalStringWasPresent(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "optionalStringValue")
    public native String getOptionalStringValue();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setOptionalStringValue:")
    public native void setOptionalStringValue(String v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableOptionalStringWasPresent")
    public native NSNumber getNullableOptionalStringWasPresent();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableOptionalStringWasPresent:")
    public native void setNullableOptionalStringWasPresent(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableOptionalStringWasNull")
    public native NSNumber getNullableOptionalStringWasNull();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableOptionalStringWasNull:")
    public native void setNullableOptionalStringWasNull(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableOptionalStringValue")
    public native String getNullableOptionalStringValue();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableOptionalStringValue:")
    public native void setNullableOptionalStringValue(String v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableStructWasNull")
    public native NSNumber getNullableStructWasNull();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableStructWasNull:")
    public native void setNullableStructWasNull(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableStructValue")
    public native MTRUnitTestingClusterSimpleStruct getNullableStructValue();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableStructValue:")
    public native void setNullableStructValue(MTRUnitTestingClusterSimpleStruct v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "optionalStructWasPresent")
    public native NSNumber getOptionalStructWasPresent();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setOptionalStructWasPresent:")
    public native void setOptionalStructWasPresent(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "optionalStructValue")
    public native MTRUnitTestingClusterSimpleStruct getOptionalStructValue();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setOptionalStructValue:")
    public native void setOptionalStructValue(MTRUnitTestingClusterSimpleStruct v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableOptionalStructWasPresent")
    public native NSNumber getNullableOptionalStructWasPresent();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableOptionalStructWasPresent:")
    public native void setNullableOptionalStructWasPresent(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableOptionalStructWasNull")
    public native NSNumber getNullableOptionalStructWasNull();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableOptionalStructWasNull:")
    public native void setNullableOptionalStructWasNull(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableOptionalStructValue")
    public native MTRUnitTestingClusterSimpleStruct getNullableOptionalStructValue();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableOptionalStructValue:")
    public native void setNullableOptionalStructValue(MTRUnitTestingClusterSimpleStruct v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableListWasNull")
    public native NSNumber getNullableListWasNull();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableListWasNull:")
    public native void setNullableListWasNull(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableListValue")
    public native NSArray<?> getNullableListValue();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableListValue:")
    public native void setNullableListValue(NSArray<?> v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "optionalListWasPresent")
    public native NSNumber getOptionalListWasPresent();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setOptionalListWasPresent:")
    public native void setOptionalListWasPresent(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "optionalListValue")
    public native NSArray<?> getOptionalListValue();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setOptionalListValue:")
    public native void setOptionalListValue(NSArray<?> v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableOptionalListWasPresent")
    public native NSNumber getNullableOptionalListWasPresent();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableOptionalListWasPresent:")
    public native void setNullableOptionalListWasPresent(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableOptionalListWasNull")
    public native NSNumber getNullableOptionalListWasNull();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableOptionalListWasNull:")
    public native void setNullableOptionalListWasNull(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nullableOptionalListValue")
    public native NSArray<?> getNullableOptionalListValue();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNullableOptionalListValue:")
    public native void setNullableOptionalListValue(NSArray<?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithResponseValue:error:")
    private native @Pointer long init(NSDictionary<NSString, ?> responseValue, NSError.NSErrorPtr error);
    /*</methods>*/
}
