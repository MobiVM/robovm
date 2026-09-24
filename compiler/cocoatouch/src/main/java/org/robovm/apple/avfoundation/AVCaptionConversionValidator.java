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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaptionConversionValidator/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCaptionConversionValidatorPtr extends Ptr<AVCaptionConversionValidator, AVCaptionConversionValidatorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCaptionConversionValidator.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVCaptionConversionValidator() {}
    protected AVCaptionConversionValidator(Handle h, long handle) { super(h, handle); }
    protected AVCaptionConversionValidator(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCaptions:timeRange:conversionSettings:")
    public AVCaptionConversionValidator(NSArray<AVCaption> captions, @ByVal CMTimeRange timeRange, NSDictionary<NSString, ?> conversionSettings) { super((SkipInit) null); initObject(init(captions, timeRange, conversionSettings)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "status")
    public native AVCaptionConversionValidatorStatus getStatus();
    @Property(selector = "captions")
    public native NSArray<AVCaption> getCaptions();
    @Property(selector = "timeRange")
    public native @ByVal CMTimeRange getTimeRange();
    @Property(selector = "warnings")
    public native NSArray<AVCaptionConversionWarning> getWarnings();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCaptions:timeRange:conversionSettings:")
    protected native @Pointer long init(NSArray<AVCaption> captions, @ByVal CMTimeRange timeRange, NSDictionary<NSString, ?> conversionSettings);
    @Method(selector = "validateCaptionConversionWithWarningHandler:")
    public native void validateCaptionConversion(@Block VoidBlock1<AVCaptionConversionWarning> handler);
    @Method(selector = "stopValidating")
    public native void stopValidating();
    @Method(selector = "captionConversionValidatorWithCaptions:timeRange:conversionSettings:")
    public static native AVCaptionConversionValidator captionConversionValidator(NSArray<AVCaption> captions, @ByVal CMTimeRange timeRange, NSDictionary<NSString, ?> conversionSettings);
    /*</methods>*/
}
