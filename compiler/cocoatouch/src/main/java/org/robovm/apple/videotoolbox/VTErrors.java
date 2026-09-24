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
package org.robovm.apple.videotoolbox;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public enum /*<name>*/VTErrors/*</name>*/ implements ValuedEnum {
    /*<values>*/
    PropertyNotSupported(-12900L),
    PropertyReadOnly(-12901L),
    Parameter(-12902L),
    InvalidSession(-12903L),
    AllocationFailed(-12904L),
    PixelTransferNotSupported(-12905L),
    CouldNotFindVideoDecoder(-12906L),
    CouldNotCreateInstance(-12907L),
    CouldNotFindVideoEncoder(-12908L),
    VideoDecoderBadData(-12909L),
    VideoDecoderUnsupportedDataFormat(-12910L),
    VideoDecoderMalfunction(-12911L),
    VideoEncoderMalfunction(-12912L),
    VideoDecoderNotAvailableNow(-12913L),
    ImageRotationNotSupported(-12914L),
    PixelRotationNotSupported(-12914L),
    VideoEncoderNotAvailableNow(-12915L),
    FormatDescriptionChangeNotSupported(-12916L),
    InsufficientSourceColorData(-12917L),
    CouldNotCreateColorCorrectionData(-12918L),
    ColorSyncTransformConvertFailed(-12919L),
    VideoDecoderAuthorization(-12210L),
    VideoEncoderAuthorization(-12211L),
    ColorCorrectionPixelTransferFailed(-12212L),
    MultiPassStorageIdentifierMismatch(-12213L),
    MultiPassStorageInvalid(-12214L),
    FrameSiloInvalidTimeStamp(-12215L),
    FrameSiloInvalidTimeRange(-12216L),
    CouldNotFindTemporalFilter(-12217L),
    PixelTransferNotPermitted(-12218L),
    ColorCorrectionImageRotationFailed(-12219L),
    VideoDecoderRemoved(-17690L),
    SessionMalfunction(-17691L),
    VideoDecoderNeedsRosetta(-17692L),
    VideoEncoderNeedsRosetta(-17693L),
    VideoDecoderReferenceMissing(-17694L),
    VideoDecoderCallbackMessaging(-17695L),
    VideoDecoderUnknown(-17696L),
    ExtensionDisabled(-17697L),
    VideoEncoderMVHEVCVideoLayerIDsMismatch(-17698L),
    CouldNotOutputTaggedBufferGroup(-17699L),
    CouldNotFindExtension(-19510L),
    ExtensionConflict(-19511L),
    VideoEncoderAutoWhiteBalanceNotLocked(-19512L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/VTErrors/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/VTErrors/*</name>*/ valueOf(long n) {
        for (/*<name>*/VTErrors/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/VTErrors/*</name>*/.class.getName());
    }
}
