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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SFSpeechRecognitionRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SFSpeechRecognitionRequestPtr extends Ptr<SFSpeechRecognitionRequest, SFSpeechRecognitionRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SFSpeechRecognitionRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SFSpeechRecognitionRequest() {}
    protected SFSpeechRecognitionRequest(Handle h, long handle) { super(h, handle); }
    protected SFSpeechRecognitionRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "taskHint")
    public native SFSpeechRecognitionTaskHint getTaskHint();
    @Property(selector = "setTaskHint:")
    public native void setTaskHint(SFSpeechRecognitionTaskHint v);
    @Property(selector = "shouldReportPartialResults")
    public native boolean shouldReportPartialResults();
    @Property(selector = "setShouldReportPartialResults:")
    public native void setShouldReportPartialResults(boolean v);
    @Property(selector = "contextualStrings")
    public native NSArray<NSString> getContextualStrings();
    @Property(selector = "setContextualStrings:")
    public native void setContextualStrings(NSArray<NSString> v);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 15.0. Not used anymore
     */
    @Deprecated
    @Property(selector = "interactionIdentifier")
    public native String getInteractionIdentifier();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 15.0. Not used anymore
     */
    @Deprecated
    @Property(selector = "setInteractionIdentifier:")
    public native void setInteractionIdentifier(String v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "requiresOnDeviceRecognition")
    public native boolean requiresOnDeviceRecognition();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setRequiresOnDeviceRecognition:")
    public native void setRequiresOnDeviceRecognition(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
