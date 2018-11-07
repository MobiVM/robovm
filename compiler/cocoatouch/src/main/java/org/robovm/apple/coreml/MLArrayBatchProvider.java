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
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreML") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLArrayBatchProvider/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MLBatchProvider/*</implements>*/ {

    /*<ptr>*/public static class MLArrayBatchProviderPtr extends Ptr<MLArrayBatchProvider, MLArrayBatchProviderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLArrayBatchProvider.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MLArrayBatchProvider() {}
    protected MLArrayBatchProvider(Handle h, long handle) { super(h, handle); }
    protected MLArrayBatchProvider(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFeatureProviderArray:")
    public MLArrayBatchProvider(NSArray<?> array) { super((SkipInit) null); initObject(init(array)); }
    @Method(selector = "initWithDictionary:error:")
    public MLArrayBatchProvider(NSDictionary<NSString, NSArray> dictionary) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(dictionary, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "array")
    public native NSArray<?> getArray();
    @Property(selector = "count")
    public native @MachineSizedSInt long getCount();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFeatureProviderArray:")
    protected native @Pointer long init(NSArray<?> array);
    @Method(selector = "initWithDictionary:error:")
    private native @Pointer long init(NSDictionary<NSString, NSArray> dictionary, NSError.NSErrorPtr error);
    @Method(selector = "featuresAtIndex:")
    public native MLFeatureProvider featuresAtIndex(@MachineSizedSInt long index);
    /*</methods>*/
}
