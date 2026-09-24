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
package org.robovm.apple.sensitivecontentanalysis;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.videotoolbox.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SensitiveContentAnalysis") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCVideoStreamAnalyzer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SCVideoStreamAnalyzerPtr extends Ptr<SCVideoStreamAnalyzer, SCVideoStreamAnalyzerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCVideoStreamAnalyzer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SCVideoStreamAnalyzer() {}
    protected SCVideoStreamAnalyzer(Handle h, long handle) { super(h, handle); }
    protected SCVideoStreamAnalyzer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithParticipantUUID:streamDirection:error:")
    public SCVideoStreamAnalyzer(String participantUUID, SCVideoStreamAnalyzerStreamDirection streamDirection) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(participantUUID, streamDirection, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "analysis")
    public native SCSensitivityAnalysis getAnalysis();
    @Property(selector = "analysisChangedHandler")
    public native @Block VoidBlock2<SCSensitivityAnalysis, NSError> getAnalysisChangedHandler();
    @Property(selector = "setAnalysisChangedHandler:")
    public native void setAnalysisChangedHandler(@Block VoidBlock2<SCSensitivityAnalysis, NSError> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithParticipantUUID:streamDirection:error:")
    private native @Pointer long init(String participantUUID, SCVideoStreamAnalyzerStreamDirection streamDirection, NSError.NSErrorPtr error);
    @Method(selector = "analyzePixelBuffer:")
    public native void analyzePixelBuffer(CVPixelBuffer pixelBuffer);
    public boolean beginAnalysisOfDecompressionSession(VTDecompressionSession decompressionSession) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = beginAnalysisOfDecompressionSession(decompressionSession, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "beginAnalysisOfDecompressionSession:error:")
    private native boolean beginAnalysisOfDecompressionSession(VTDecompressionSession decompressionSession, NSError.NSErrorPtr error);
    public boolean beginAnalysisOfCaptureDeviceInput(AVCaptureDeviceInput captureDeviceInput) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = beginAnalysisOfCaptureDeviceInput(captureDeviceInput, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "beginAnalysisOfCaptureDeviceInput:error:")
    private native boolean beginAnalysisOfCaptureDeviceInput(AVCaptureDeviceInput captureDeviceInput, NSError.NSErrorPtr error);
    @Method(selector = "endAnalysis")
    public native void endAnalysis();
    @Method(selector = "continueStream")
    public native void continueStream();
    /*</methods>*/
}
