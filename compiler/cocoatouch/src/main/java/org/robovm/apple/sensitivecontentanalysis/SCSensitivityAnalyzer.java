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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SensitiveContentAnalysis") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCSensitivityAnalyzer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SCSensitivityAnalyzerPtr extends Ptr<SCSensitivityAnalyzer, SCSensitivityAnalyzerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCSensitivityAnalyzer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SCSensitivityAnalyzer() {}
    protected SCSensitivityAnalyzer(Handle h, long handle) { super(h, handle); }
    protected SCSensitivityAnalyzer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "analysisPolicy")
    public native SCSensitivityAnalysisPolicy getAnalysisPolicy();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "analyzeImageFile:completionHandler:")
    public native void analyzeImageFile(NSURL fileURL, @Block VoidBlock2<SCSensitivityAnalysis, NSError> completionHandler);
    @Method(selector = "analyzeCGImage:completionHandler:")
    public native void analyzeCGImage(CGImage image, @Block VoidBlock2<SCSensitivityAnalysis, NSError> completionHandler);
    @Method(selector = "analyzeVideoFile:completionHandler:")
    public native NSProgress analyzeVideoFile(NSURL fileURL, @Block VoidBlock2<SCSensitivityAnalysis, NSError> completionHandler);
    /*</methods>*/
}
