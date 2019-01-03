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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLMultiArray/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLMultiArrayPtr extends Ptr<MLMultiArray, MLMultiArrayPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLMultiArray.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MLMultiArray() {}
    protected MLMultiArray(Handle h, long handle) { super(h, handle); }
    protected MLMultiArray(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithShape:dataType:error:")
    public MLMultiArray(NSArray<NSNumber> shape, MLMultiArrayDataType dataType) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(shape, dataType, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    @Method(selector = "initWithDataPointer:shape:dataType:strides:deallocator:error:")
    public MLMultiArray(VoidPtr dataPointer, NSArray<NSNumber> shape, MLMultiArrayDataType dataType, NSArray<NSNumber> strides, @Block VoidBlock1<VoidPtr> deallocator) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(dataPointer, shape, dataType, strides, deallocator, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dataPointer")
    public native VoidPtr getDataPointer();
    @Property(selector = "dataType")
    public native MLMultiArrayDataType getDataType();
    @Property(selector = "shape")
    public native NSArray<NSNumber> getShape();
    @Property(selector = "strides")
    public native NSArray<NSNumber> getStrides();
    @Property(selector = "count")
    public native @MachineSizedSInt long getCount();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithShape:dataType:error:")
    private native @Pointer long init(NSArray<NSNumber> shape, MLMultiArrayDataType dataType, NSError.NSErrorPtr error);
    @Method(selector = "initWithDataPointer:shape:dataType:strides:deallocator:error:")
    private native @Pointer long init(VoidPtr dataPointer, NSArray<NSNumber> shape, MLMultiArrayDataType dataType, NSArray<NSNumber> strides, @Block VoidBlock1<VoidPtr> deallocator, NSError.NSErrorPtr error);
    @Method(selector = "objectAtIndexedSubscript:")
    public native NSNumber objectAtIndexedSubscript(@MachineSizedSInt long idx);
    @Method(selector = "objectForKeyedSubscript:")
    public native NSNumber objectForKeyedSubscript(NSArray<NSNumber> key);
    @Method(selector = "setObject:atIndexedSubscript:")
    public native void setObject(NSNumber obj, @MachineSizedSInt long idx);
    @Method(selector = "setObject:forKeyedSubscript:")
    public native void setObject(NSNumber obj, NSArray<NSNumber> key);
    /*</methods>*/
}
