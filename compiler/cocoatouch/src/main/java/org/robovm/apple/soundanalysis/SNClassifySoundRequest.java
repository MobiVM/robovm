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
package org.robovm.apple.soundanalysis;

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
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coreml.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SoundAnalysis") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SNClassifySoundRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements SNRequest/*</implements>*/ {

    /*<ptr>*/public static class SNClassifySoundRequestPtr extends Ptr<SNClassifySoundRequest, SNClassifySoundRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SNClassifySoundRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SNClassifySoundRequest() {}
    protected SNClassifySoundRequest(Handle h, long handle) { super(h, handle); }
    protected SNClassifySoundRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithMLModel:error:")
    public SNClassifySoundRequest(MLModel mlModel) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(mlModel, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "initWithClassifierIdentifier:error:")
    public SNClassifySoundRequest(SNClassifierIdentifier classifierIdentifier) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(classifierIdentifier, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "overlapFactor")
    public native double getOverlapFactor();
    @Property(selector = "setOverlapFactor:")
    public native void setOverlapFactor(double v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "windowDuration")
    public native @ByVal CMTime getWindowDuration();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setWindowDuration:")
    public native void setWindowDuration(@ByVal CMTime v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "windowDurationConstraint")
    public native SNTimeDurationConstraint getWindowDurationConstraint();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "knownClassifications")
    public native NSArray<NSString> getKnownClassifications();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMLModel:error:")
    private native @Pointer long init(MLModel mlModel, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "initWithClassifierIdentifier:error:")
    private native @Pointer long init(SNClassifierIdentifier classifierIdentifier, NSError.NSErrorPtr error);
    /*</methods>*/
}
