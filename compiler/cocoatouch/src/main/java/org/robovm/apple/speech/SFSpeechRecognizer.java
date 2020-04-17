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
package org.robovm.apple.speech;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Speech") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SFSpeechRecognizer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SFSpeechRecognizerPtr extends Ptr<SFSpeechRecognizer, SFSpeechRecognizerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SFSpeechRecognizer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SFSpeechRecognizer() {}
    protected SFSpeechRecognizer(Handle h, long handle) { super(h, handle); }
    protected SFSpeechRecognizer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLocale:")
    public SFSpeechRecognizer(NSLocale locale) { super((SkipInit) null); initObject(init(locale)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isAvailable")
    public native boolean isAvailable();
    @Property(selector = "locale")
    public native NSLocale getLocale();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "supportsOnDeviceRecognition")
    public native boolean supportsOnDeviceRecognition();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setSupportsOnDeviceRecognition:")
    public native void setSupportsOnDeviceRecognition(boolean v);
    @Property(selector = "delegate")
    public native SFSpeechRecognizerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(SFSpeechRecognizerDelegate v);
    @Property(selector = "defaultTaskHint")
    public native SFSpeechRecognitionTaskHint getDefaultTaskHint();
    @Property(selector = "setDefaultTaskHint:")
    public native void setDefaultTaskHint(SFSpeechRecognitionTaskHint v);
    @Property(selector = "queue")
    public native NSOperationQueue getQueue();
    @Property(selector = "setQueue:")
    public native void setQueue(NSOperationQueue v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLocale:")
    protected native @Pointer long init(NSLocale locale);
    @Method(selector = "recognitionTaskWithRequest:resultHandler:")
    public native SFSpeechRecognitionTask recognitionTask(SFSpeechRecognitionRequest request, @Block VoidBlock2<SFSpeechRecognitionResult, NSError> resultHandler);
    @Method(selector = "recognitionTaskWithRequest:delegate:")
    public native SFSpeechRecognitionTask recognitionTask(SFSpeechRecognitionRequest request, SFSpeechRecognitionTaskDelegate delegate);
    @Method(selector = "supportedLocales")
    public static native NSSet<NSLocale> supportedLocales();
    @Method(selector = "authorizationStatus")
    public static native SFSpeechRecognizerAuthorizationStatus authorizationStatus();
    @Method(selector = "requestAuthorization:")
    public static native void requestAuthorization(@Block VoidBlock1<SFSpeechRecognizerAuthorizationStatus> handler);
    /*</methods>*/
}
