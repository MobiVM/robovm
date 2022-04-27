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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.vision.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreML") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLDictionaryFeatureProvider/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MLFeatureProvider, NSFastEnumeration, NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MLDictionaryFeatureProviderPtr extends Ptr<MLDictionaryFeatureProvider, MLDictionaryFeatureProviderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLDictionaryFeatureProvider.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MLDictionaryFeatureProvider() {}
    protected MLDictionaryFeatureProvider(Handle h, long handle) { super(h, handle); }
    protected MLDictionaryFeatureProvider(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDictionary:error:")
    public MLDictionaryFeatureProvider(NSDictionary<NSString, ?> dictionary) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(dictionary, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    @Method(selector = "initWithCoder:")
    public MLDictionaryFeatureProvider(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dictionary")
    public native NSDictionary<NSString, MLFeatureValue> getDictionary();
    @Property(selector = "featureNames")
    public native NSSet<NSString> getFeatureNames();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDictionary:error:")
    private native @Pointer long init(NSDictionary<NSString, ?> dictionary, NSError.NSErrorPtr error);
    @Method(selector = "objectForKeyedSubscript:")
    public native MLFeatureValue objectForKeyedSubscript(String featureName);
    @Method(selector = "featureValueForName:")
    public native MLFeatureValue featureValueForName(String featureName);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
