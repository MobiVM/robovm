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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SNAudioFileAnalyzer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SNAudioFileAnalyzerPtr extends Ptr<SNAudioFileAnalyzer, SNAudioFileAnalyzerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SNAudioFileAnalyzer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SNAudioFileAnalyzer() {}
    protected SNAudioFileAnalyzer(Handle h, long handle) { super(h, handle); }
    protected SNAudioFileAnalyzer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithURL:error:")
    public SNAudioFileAnalyzer(NSURL url) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(url, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithURL:error:")
    private native @Pointer long init(NSURL url, NSError.NSErrorPtr error);
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
    @Method(selector = "analyze")
    public native void analyze();
    @Method(selector = "analyzeWithCompletionHandler:")
    public native void analyze(@Block VoidBooleanBlock completionHandler);
    @Method(selector = "cancelAnalysis")
    public native void cancelAnalysis();
    /*</methods>*/
}
