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
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Speech") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SFSpeechLanguageModelConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SFSpeechLanguageModelConfigurationPtr extends Ptr<SFSpeechLanguageModelConfiguration, SFSpeechLanguageModelConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SFSpeechLanguageModelConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SFSpeechLanguageModelConfiguration() {}
    protected SFSpeechLanguageModelConfiguration(Handle h, long handle) { super(h, handle); }
    protected SFSpeechLanguageModelConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLanguageModel:")
    public SFSpeechLanguageModelConfiguration(NSURL languageModel) { super((SkipInit) null); initObject(init(languageModel)); }
    @Method(selector = "initWithLanguageModel:vocabulary:")
    public SFSpeechLanguageModelConfiguration(NSURL languageModel, NSURL vocabulary) { super((SkipInit) null); initObject(init(languageModel, vocabulary)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "languageModel")
    public native NSURL getLanguageModel();
    @Property(selector = "vocabulary")
    public native NSURL getVocabulary();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLanguageModel:")
    protected native @Pointer long init(NSURL languageModel);
    @Method(selector = "initWithLanguageModel:vocabulary:")
    protected native @Pointer long init(NSURL languageModel, NSURL vocabulary);
    /*</methods>*/
}
