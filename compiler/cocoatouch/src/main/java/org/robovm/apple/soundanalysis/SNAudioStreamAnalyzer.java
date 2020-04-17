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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SNAudioStreamAnalyzer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SNAudioStreamAnalyzerPtr extends Ptr<SNAudioStreamAnalyzer, SNAudioStreamAnalyzerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SNAudioStreamAnalyzer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SNAudioStreamAnalyzer() {}
    protected SNAudioStreamAnalyzer(Handle h, long handle) { super(h, handle); }
    protected SNAudioStreamAnalyzer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFormat:")
    public SNAudioStreamAnalyzer(AVAudioFormat format) { super((SkipInit) null); initObject(init(format)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFormat:")
    protected native @Pointer long init(AVAudioFormat format);
    public boolean addRequest(SNRequest request, SNResultsObserving observer) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = addRequest(request, observer, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "addRequest:withObserver:error:")
    private native boolean addRequest(SNRequest request, SNResultsObserving observer, NSError.NSErrorPtr error);
    @Method(selector = "removeRequest:")
    public native void removeRequest(SNRequest request);
    @Method(selector = "removeAllRequests")
    public native void removeAllRequests();
    @Method(selector = "analyzeAudioBuffer:atAudioFramePosition:")
    public native void analyzeAudioBuffer(AVAudioBuffer audioBuffer, long audioFramePosition);
    @Method(selector = "completeAnalysis")
    public native void completeAnalysis();
    /*</methods>*/
}
