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
package org.robovm.apple.naturallanguage;

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
import org.robovm.apple.coreml.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NaturalLanguage") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NLModel/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NLModelPtr extends Ptr<NLModel, NLModelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NLModel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NLModel() {}
    protected NLModel(Handle h, long handle) { super(h, handle); }
    protected NLModel(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    public NLModel(NSURL url) throws NSErrorException {
       this(url, new NSError.NSErrorPtr());
    }
    private NLModel(NSURL url, NSError.NSErrorPtr ptr) throws NSErrorException {
       super((Handle) null, create(url, ptr));
       retain(getHandle());
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
    }
    /**
     * @since Available in iOS 12.0 and later.
     */
    public NLModel(MLModel mlModel) throws NSErrorException {
       this(mlModel, new NSError.NSErrorPtr());
    }
    private NLModel(MLModel mlModel, NSError.NSErrorPtr ptr) throws NSErrorException {
       super((Handle) null, create(mlModel, ptr));
       retain(getHandle());
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
    }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "configuration")
    public native NLModelConfiguration getConfiguration();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "predictedLabelForString:")
    public native String predictedLabelForString(String string);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "predictedLabelsForTokens:")
    public native NSArray<NSString> predictedLabelsForTokens(NSArray<NSString> tokens);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "modelWithContentsOfURL:error:")
    protected static native @Pointer long create(NSURL url, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "modelWithMLModel:error:")
    protected static native @Pointer long create(MLModel mlModel, NSError.NSErrorPtr error);
    /*</methods>*/
}
