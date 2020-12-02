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
package org.robovm.apple.mediaplayer;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("MediaPlayer")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPLanguageOptionCharacteristic/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(MPLanguageOptionCharacteristic.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="MPLanguageOptionCharacteristicIsMainProgramContent", optional=true)
    public static native String IsMainProgramContent();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="MPLanguageOptionCharacteristicIsAuxiliaryContent", optional=true)
    public static native String IsAuxiliaryContent();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="MPLanguageOptionCharacteristicContainsOnlyForcedSubtitles", optional=true)
    public static native String ContainsOnlyForcedSubtitles();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="MPLanguageOptionCharacteristicTranscribesSpokenDialog", optional=true)
    public static native String TranscribesSpokenDialog();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="MPLanguageOptionCharacteristicDescribesMusicAndSound", optional=true)
    public static native String DescribesMusicAndSound();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="MPLanguageOptionCharacteristicEasyToRead", optional=true)
    public static native String EasyToRead();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="MPLanguageOptionCharacteristicDescribesVideo", optional=true)
    public static native String DescribesVideo();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="MPLanguageOptionCharacteristicLanguageTranslation", optional=true)
    public static native String LanguageTranslation();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="MPLanguageOptionCharacteristicDubbedTranslation", optional=true)
    public static native String DubbedTranslation();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="MPLanguageOptionCharacteristicVoiceOverTranslation", optional=true)
    public static native String VoiceOverTranslation();
    /*</methods>*/
}
