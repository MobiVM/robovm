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
import org.robovm.apple.coremedia.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MediaPlayer") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPNowPlayingInfoLanguageOptionGroup/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPNowPlayingInfoLanguageOptionGroupPtr extends Ptr<MPNowPlayingInfoLanguageOptionGroup, MPNowPlayingInfoLanguageOptionGroupPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPNowPlayingInfoLanguageOptionGroup.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPNowPlayingInfoLanguageOptionGroup() {}
    protected MPNowPlayingInfoLanguageOptionGroup(Handle h, long handle) { super(h, handle); }
    protected MPNowPlayingInfoLanguageOptionGroup(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLanguageOptions:defaultLanguageOption:allowEmptySelection:")
    public MPNowPlayingInfoLanguageOptionGroup(NSArray<MPNowPlayingInfoLanguageOption> languageOptions, MPNowPlayingInfoLanguageOption defaultLanguageOption, boolean allowEmptySelection) { super((SkipInit) null); initObject(init(languageOptions, defaultLanguageOption, allowEmptySelection)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "languageOptions")
    public native NSArray<MPNowPlayingInfoLanguageOption> getLanguageOptions();
    @Property(selector = "defaultLanguageOption")
    public native MPNowPlayingInfoLanguageOption getDefaultLanguageOption();
    @Property(selector = "allowEmptySelection")
    public native boolean isAllowEmptySelection();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLanguageOptions:defaultLanguageOption:allowEmptySelection:")
    protected native @Pointer long init(NSArray<MPNowPlayingInfoLanguageOption> languageOptions, MPNowPlayingInfoLanguageOption defaultLanguageOption, boolean allowEmptySelection);
    /*</methods>*/
}
