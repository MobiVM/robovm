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
package org.robovm.apple.mediaaccessibility;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.iosurface.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("MediaAccessibility")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MACaptionAppearance/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(MACaptionAppearance.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kMACaptionAppearanceSettingsChangedNotification", optional=true)
    public static native NSString SettingsChangedNotification();
    @Library("MediaAccessibility")
    public static class MediaCharacteristic {
        static { Bro.bind(MediaCharacteristic.class); }

        @GlobalValue(symbol="MAMediaCharacteristicDescribesMusicAndSoundForAccessibility", optional=true)
        public static native String DescribesMusicAndSoundForAccessibility();
        @GlobalValue(symbol="MAMediaCharacteristicTranscribesSpokenDialogForAccessibility", optional=true)
        public static native String TranscribesSpokenDialogForAccessibility();
    }
    
    @Bridge(symbol="MACaptionAppearanceDidDisplayCaptions", optional=true)
    public static native void didDisplayCaptions(NSArray strings);
    @Bridge(symbol="MACaptionAppearanceAddSelectedLanguage", optional=true)
    public static native boolean addSelectedLanguage(MACaptionAppearanceDomain domain, String language);
    @Bridge(symbol="MACaptionAppearanceCopySelectedLanguages", optional=true)
    public static native NSArray copySelectedLanguages(MACaptionAppearanceDomain domain);
    @Bridge(symbol="MACaptionAppearanceGetDisplayType", optional=true)
    public static native MACaptionAppearanceDisplayType getDisplayType(MACaptionAppearanceDomain domain);
    @Bridge(symbol="MACaptionAppearanceSetDisplayType", optional=true)
    public static native void setDisplayType(MACaptionAppearanceDomain domain, MACaptionAppearanceDisplayType displayType);
    @Bridge(symbol="MACaptionAppearanceCopyPreferredCaptioningMediaCharacteristics", optional=true)
    public static native NSArray copyPreferredCaptioningMediaCharacteristics(MACaptionAppearanceDomain domain);
    @Bridge(symbol="MACaptionAppearanceCopyForegroundColor", optional=true)
    public static native CGColor copyForegroundColor(MACaptionAppearanceDomain domain, MachineSizedSIntPtr behavior);
    @Bridge(symbol="MACaptionAppearanceCopyBackgroundColor", optional=true)
    public static native CGColor copyBackgroundColor(MACaptionAppearanceDomain domain, MachineSizedSIntPtr behavior);
    @Bridge(symbol="MACaptionAppearanceCopyWindowColor", optional=true)
    public static native CGColor copyWindowColor(MACaptionAppearanceDomain domain, MachineSizedSIntPtr behavior);
    @Bridge(symbol="MACaptionAppearanceGetForegroundOpacity", optional=true)
    public static native @MachineSizedFloat double getForegroundOpacity(MACaptionAppearanceDomain domain, MachineSizedSIntPtr behavior);
    @Bridge(symbol="MACaptionAppearanceGetBackgroundOpacity", optional=true)
    public static native @MachineSizedFloat double getBackgroundOpacity(MACaptionAppearanceDomain domain, MachineSizedSIntPtr behavior);
    @Bridge(symbol="MACaptionAppearanceGetWindowOpacity", optional=true)
    public static native @MachineSizedFloat double getWindowOpacity(MACaptionAppearanceDomain domain, MachineSizedSIntPtr behavior);
    @Bridge(symbol="MACaptionAppearanceGetWindowRoundedCornerRadius", optional=true)
    public static native @MachineSizedFloat double getWindowRoundedCornerRadius(MACaptionAppearanceDomain domain, MachineSizedSIntPtr behavior);
    @Bridge(symbol="MACaptionAppearanceCopyFontDescriptorForStyle", optional=true)
    public static native CTFontDescriptor copyFontDescriptorForStyle(MACaptionAppearanceDomain domain, MachineSizedSIntPtr behavior, MACaptionAppearanceFontStyle fontStyle);
    @Bridge(symbol="MACaptionAppearanceGetRelativeCharacterSize", optional=true)
    public static native @MachineSizedFloat double getRelativeCharacterSize(MACaptionAppearanceDomain domain, MachineSizedSIntPtr behavior);
    @Bridge(symbol="MACaptionAppearanceGetTextEdgeStyle", optional=true)
    public static native MACaptionAppearanceTextEdgeStyle getTextEdgeStyle(MACaptionAppearanceDomain domain, MachineSizedSIntPtr behavior);
    /*</methods>*/
}
