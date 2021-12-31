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
package org.robovm.apple.vision;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Vision") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNRecognizeTextRequest/*</name>*/ 
    extends /*<extends>*/VNImageBasedRequest/*</extends>*/ 
    /*<implements>*/implements VNRequestProgressProviding/*</implements>*/ {

    /*<ptr>*/public static class VNRecognizeTextRequestPtr extends Ptr<VNRecognizeTextRequest, VNRecognizeTextRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNRecognizeTextRequest.class); }/*</bind>*/
    /*<constants>*/
    public static final int Revision1 = 1;
    public static final int Revision2 = 2;
    /*</constants>*/
    /*<constructors>*/
    public VNRecognizeTextRequest() {}
    protected VNRecognizeTextRequest(Handle h, long handle) { super(h, handle); }
    protected VNRecognizeTextRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCompletionHandler:")
    public VNRecognizeTextRequest(@Block VoidBlock2<VNRequest, NSError> completionHandler) { super(completionHandler); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "recognitionLanguages")
    public native NSArray<NSString> getRecognitionLanguages();
    @Property(selector = "setRecognitionLanguages:")
    public native void setRecognitionLanguages(NSArray<NSString> v);
    @Property(selector = "customWords")
    public native NSArray<NSString> getCustomWords();
    @Property(selector = "setCustomWords:")
    public native void setCustomWords(NSArray<NSString> v);
    @Property(selector = "recognitionLevel")
    public native VNRequestTextRecognitionLevel getRecognitionLevel();
    @Property(selector = "setRecognitionLevel:")
    public native void setRecognitionLevel(VNRequestTextRecognitionLevel v);
    @Property(selector = "usesLanguageCorrection")
    public native boolean usesLanguageCorrection();
    @Property(selector = "setUsesLanguageCorrection:")
    public native void setUsesLanguageCorrection(boolean v);
    @Property(selector = "minimumTextHeight")
    public native float getMinimumTextHeight();
    @Property(selector = "setMinimumTextHeight:")
    public native void setMinimumTextHeight(float v);
    @Property(selector = "results")
    public native NSArray<VNRecognizedTextObservation> getResults();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "supportedRevisions")
    public static native NSIndexSet getSupportedRevisions();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "defaultRevision")
    public static native @MachineSizedUInt long getDefaultRevision();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "currentRevision")
    public static native @MachineSizedUInt long getCurrentRevision();
    @Property(selector = "progressHandler")
    public native @Block VoidBlock3<VNRequest, Double, NSError> getProgressHandler();
    @Property(selector = "setProgressHandler:")
    public native void setProgressHandler(@Block VoidBlock3<VNRequest, Double, NSError> v);
    @Property(selector = "indeterminate")
    public native boolean isIndeterminate();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "supportedRecognitionLanguagesAndReturnError:")
    public native NSArray<NSString> supportedRecognitionLanguagesAndReturnError(NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 15.0. Use -supportedRecognitionLanguagesAndReturnError:
     */
    @Deprecated
    public static NSArray<NSString> getSupportedRecognitionLanguagesForTextRecognitionLevel(VNRequestTextRecognitionLevel recognitionLevel, @MachineSizedUInt long requestRevision) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSArray<NSString> result = getSupportedRecognitionLanguagesForTextRecognitionLevel(recognitionLevel, requestRevision, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 15.0. Use -supportedRecognitionLanguagesAndReturnError:
     */
    @Deprecated
    @Method(selector = "supportedRecognitionLanguagesForTextRecognitionLevel:revision:error:")
    private static native NSArray<NSString> getSupportedRecognitionLanguagesForTextRecognitionLevel(VNRequestTextRecognitionLevel recognitionLevel, @MachineSizedUInt long requestRevision, NSError.NSErrorPtr error);
    /*</methods>*/
}
