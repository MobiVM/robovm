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
package org.robovm.apple.coreml;

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
import org.robovm.apple.corevideo.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreML") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLFeatureValue/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLFeatureValuePtr extends Ptr<MLFeatureValue, MLFeatureValuePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLFeatureValue.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MLFeatureValue() {}
    protected MLFeatureValue(Handle h, long handle) { super(h, handle); }
    protected MLFeatureValue(SkipInit skipInit) { super(skipInit); }
    public MLFeatureValue(long value) { super((Handle) null, create(value)); retain(getHandle()); }
    public MLFeatureValue(double value) { super((Handle) null, create(value)); retain(getHandle()); }
    public MLFeatureValue(String value) { super((Handle) null, create(value)); retain(getHandle()); }
    public MLFeatureValue(MLMultiArray value) { super((Handle) null, create(value)); retain(getHandle()); }
    public MLFeatureValue(CVPixelBuffer value) { super((Handle) null, create(value)); retain(getHandle()); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    public MLFeatureValue(MLSequence sequence) { super((Handle) null, create(sequence)); retain(getHandle()); }
    public MLFeatureValue(MLFeatureType type) { super((Handle) null, create(type)); retain(getHandle()); }
    public MLFeatureValue(NSDictionary<?, NSNumber> value) throws NSErrorException {
       this(value, new NSError.NSErrorPtr());
    }
    private MLFeatureValue(NSDictionary<?, NSNumber> value, NSError.NSErrorPtr ptr) throws NSErrorException {
       super((Handle) null, create(value, ptr));
       retain(getHandle());
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "type")
    public native MLFeatureType getType();
    @Property(selector = "isUndefined")
    public native boolean isUndefined();
    @Property(selector = "int64Value")
    public native long getInt64Value();
    @Property(selector = "doubleValue")
    public native double getDoubleValue();
    @Property(selector = "stringValue")
    public native String getStringValue();
    @Property(selector = "multiArrayValue")
    public native MLMultiArray getMultiArrayValue();
    @Property(selector = "dictionaryValue")
    public native NSDictionary<?, NSNumber> getDictionaryValue();
    @Property(selector = "imageBufferValue")
    public native CVPixelBuffer getImageBufferValue();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "sequenceValue")
    public native MLSequence getSequenceValue();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isEqualToFeatureValue:")
    public native boolean isEqualToFeatureValue(MLFeatureValue value);
    @Method(selector = "featureValueWithInt64:")
    protected static native @Pointer long create(long value);
    @Method(selector = "featureValueWithDouble:")
    protected static native @Pointer long create(double value);
    @Method(selector = "featureValueWithString:")
    protected static native @Pointer long create(String value);
    @Method(selector = "featureValueWithMultiArray:")
    protected static native @Pointer long create(MLMultiArray value);
    @Method(selector = "featureValueWithPixelBuffer:")
    protected static native @Pointer long create(CVPixelBuffer value);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "featureValueWithSequence:")
    protected static native @Pointer long create(MLSequence sequence);
    @Method(selector = "undefinedFeatureValueWithType:")
    protected static native @Pointer long create(MLFeatureType type);
    @Method(selector = "featureValueWithDictionary:error:")
    protected static native @Pointer long create(NSDictionary<?, NSNumber> value, NSError.NSErrorPtr error);
    /*</methods>*/
}
