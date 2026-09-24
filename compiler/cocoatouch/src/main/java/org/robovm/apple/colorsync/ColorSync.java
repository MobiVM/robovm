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
package org.robovm.apple.colorsync;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("ColorSync")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ColorSync/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(ColorSync.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncGenericGrayProfile", optional=true)
    public static native CFString GenericGrayProfile();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncGenericGrayGamma22Profile", optional=true)
    public static native CFString GenericGrayGamma22Profile();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncGenericRGBProfile", optional=true)
    public static native CFString GenericRGBProfile();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncGenericCMYKProfile", optional=true)
    public static native CFString GenericCMYKProfile();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncDisplayP3Profile", optional=true)
    public static native CFString DisplayP3Profile();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSRGBProfile", optional=true)
    public static native CFString SRGBProfile();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncAdobeRGB1998Profile", optional=true)
    public static native CFString AdobeRGB1998Profile();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncGenericLabProfile", optional=true)
    public static native CFString GenericLabProfile();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncGenericXYZProfile", optional=true)
    public static native CFString GenericXYZProfile();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncACESCGLinearProfile", optional=true)
    public static native CFString ACESCGLinearProfile();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncDCIP3Profile", optional=true)
    public static native CFString DCIP3Profile();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncITUR709Profile", optional=true)
    public static native CFString ITUR709Profile();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncITUR2020Profile", optional=true)
    public static native CFString ITUR2020Profile();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncROMMRGBProfile", optional=true)
    public static native CFString ROMMRGBProfile();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @GlobalValue(symbol="kColorSyncWebSafeColorsProfile", optional=true)
    public static native CFString WebSafeColorsProfile();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncProfileHeader", optional=true)
    public static native CFString ProfileHeader();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncProfileClass", optional=true)
    public static native CFString ProfileClass();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncProfileColorSpace", optional=true)
    public static native CFString ProfileColorSpace();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncProfilePCS", optional=true)
    public static native CFString ProfilePCS();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncProfileURL", optional=true)
    public static native CFString ProfileURL();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncProfileDescription", optional=true)
    public static native CFString ProfileDescription();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncProfileMD5Digest", optional=true)
    public static native CFString ProfileMD5Digest();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncProfileIsValid", optional=true)
    public static native CFString ProfileIsValid();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigAToB0Tag", optional=true)
    public static native CFString SigAToB0Tag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigAToB1Tag", optional=true)
    public static native CFString SigAToB1Tag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigAToB2Tag", optional=true)
    public static native CFString SigAToB2Tag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigBToA0Tag", optional=true)
    public static native CFString SigBToA0Tag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigBToA1Tag", optional=true)
    public static native CFString SigBToA1Tag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigBToA2Tag", optional=true)
    public static native CFString SigBToA2Tag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigCmykData", optional=true)
    public static native CFString SigCmykData();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigGrayData", optional=true)
    public static native CFString SigGrayData();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigLabData", optional=true)
    public static native CFString SigLabData();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigRgbData", optional=true)
    public static native CFString SigRgbData();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigXYZData", optional=true)
    public static native CFString SigXYZData();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigAbstractClass", optional=true)
    public static native CFString SigAbstractClass();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigBlueTRCTag", optional=true)
    public static native CFString SigBlueTRCTag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigBlueColorantTag", optional=true)
    public static native CFString SigBlueColorantTag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigMediaBlackPointTag", optional=true)
    public static native CFString SigMediaBlackPointTag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigCopyrightTag", optional=true)
    public static native CFString SigCopyrightTag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigProfileDescriptionTag", optional=true)
    public static native CFString SigProfileDescriptionTag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigDeviceModelDescTag", optional=true)
    public static native CFString SigDeviceModelDescTag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigDeviceMfgDescTag", optional=true)
    public static native CFString SigDeviceMfgDescTag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigGreenTRCTag", optional=true)
    public static native CFString SigGreenTRCTag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigGreenColorantTag", optional=true)
    public static native CFString SigGreenColorantTag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigGamutTag", optional=true)
    public static native CFString SigGamutTag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigGrayTRCTag", optional=true)
    public static native CFString SigGrayTRCTag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigLinkClass", optional=true)
    public static native CFString SigLinkClass();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigDisplayClass", optional=true)
    public static native CFString SigDisplayClass();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigNamedColor2Tag", optional=true)
    public static native CFString SigNamedColor2Tag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigNamedColorClass", optional=true)
    public static native CFString SigNamedColorClass();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigPreview0Tag", optional=true)
    public static native CFString SigPreview0Tag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigPreview1Tag", optional=true)
    public static native CFString SigPreview1Tag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigPreview2Tag", optional=true)
    public static native CFString SigPreview2Tag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigOutputClass", optional=true)
    public static native CFString SigOutputClass();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigProfileSequenceDescTag", optional=true)
    public static native CFString SigProfileSequenceDescTag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigRedTRCTag", optional=true)
    public static native CFString SigRedTRCTag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigRedColorantTag", optional=true)
    public static native CFString SigRedColorantTag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigInputClass", optional=true)
    public static native CFString SigInputClass();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigColorSpaceClass", optional=true)
    public static native CFString SigColorSpaceClass();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigTechnologyTag", optional=true)
    public static native CFString SigTechnologyTag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigViewingConditionsTag", optional=true)
    public static native CFString SigViewingConditionsTag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigViewingCondDescTag", optional=true)
    public static native CFString SigViewingCondDescTag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncSigMediaWhitePointTag", optional=true)
    public static native CFString SigMediaWhitePointTag();
    /**
     * @since Available in iOS 26.1 and later.
     */
    @GlobalValue(symbol="kColorSyncDoNotSubstituteProfiles", optional=true)
    public static native CFString DoNotSubstituteProfiles();
    @GlobalValue(symbol="kColorSyncProfileCacheSeed", optional=true)
    public static native CFString ProfileCacheSeed();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncProfile", optional=true)
    public static native CFString Profile();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncRenderingIntent", optional=true)
    public static native CFString RenderingIntent();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncRenderingIntentPerceptual", optional=true)
    public static native CFString RenderingIntentPerceptual();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncRenderingIntentRelative", optional=true)
    public static native CFString RenderingIntentRelative();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncRenderingIntentSaturation", optional=true)
    public static native CFString RenderingIntentSaturation();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncRenderingIntentAbsolute", optional=true)
    public static native CFString RenderingIntentAbsolute();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncRenderingIntentUseProfileHeader", optional=true)
    public static native CFString RenderingIntentUseProfileHeader();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncTransformTag", optional=true)
    public static native CFString TransformTag();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncTransformDeviceToPCS", optional=true)
    public static native CFString TransformDeviceToPCS();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncTransformPCSToPCS", optional=true)
    public static native CFString TransformPCSToPCS();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncTransformPCSToDevice", optional=true)
    public static native CFString TransformPCSToDevice();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncTransformDeviceToDevice", optional=true)
    public static native CFString TransformDeviceToDevice();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncTransformGamutCheck", optional=true)
    public static native CFString TransformGamutCheck();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncBlackPointCompensation", optional=true)
    public static native CFString BlackPointCompensation();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncExtendedRange", optional=true)
    public static native CFString ExtendedRange();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @GlobalValue(symbol="kColorSyncHDRDerivative", optional=true)
    public static native CFString HDRDerivative();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @GlobalValue(symbol="kColorSyncPQDerivative", optional=true)
    public static native CFString PQDerivative();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @GlobalValue(symbol="kColorSyncHLGDerivative", optional=true)
    public static native CFString HLGDerivative();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncConvertQuality", optional=true)
    public static native CFString ConvertQuality();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncBestQuality", optional=true)
    public static native CFString BestQuality();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncNormalQuality", optional=true)
    public static native CFString NormalQuality();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncDraftQuality", optional=true)
    public static native CFString DraftQuality();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncConvertUseExtendedRange", optional=true)
    public static native CFString ConvertUseExtendedRange();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncTransformInfo", optional=true)
    public static native CFString TransformInfo();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncTransformCreator", optional=true)
    public static native CFString TransformCreator();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncTransformSrcSpace", optional=true)
    public static native CFString TransformSrcSpace();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncTransformDstSpace", optional=true)
    public static native CFString TransformDstSpace();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncTransformCodeFragmentType", optional=true)
    public static native CFString TransformCodeFragmentType();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncTransformCodeFragmentMD5", optional=true)
    public static native CFString TransformCodeFragmentMD5();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncTransformFullConversionData", optional=true)
    public static native CFString TransformFullConversionData();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncTransformSimplifiedConversionData", optional=true)
    public static native CFString TransformSimplifiedConversionData();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncTransformParametricConversionData", optional=true)
    public static native CFString TransformParametricConversionData();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncTransformProfileSequnce", optional=true)
    public static native CFString TransformProfileSequnce();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @GlobalValue(symbol="kColorSyncTransformUseITU709OETF", optional=true)
    public static native CFString TransformUseITU709OETF();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncConversionMatrix", optional=true)
    public static native CFString ConversionMatrix();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncConversionParamCurve0", optional=true)
    public static native CFString ConversionParamCurve0();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncConversionParamCurve1", optional=true)
    public static native CFString ConversionParamCurve1();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncConversionParamCurve2", optional=true)
    public static native CFString ConversionParamCurve2();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncConversionParamCurve3", optional=true)
    public static native CFString ConversionParamCurve3();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncConversionParamCurve4", optional=true)
    public static native CFString ConversionParamCurve4();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncConversion1DLut", optional=true)
    public static native CFString Conversion1DLut();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncConversionGridPoints", optional=true)
    public static native CFString ConversionGridPoints();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncConversionChannelID", optional=true)
    public static native CFString ConversionChannelID();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncConversion3DLut", optional=true)
    public static native CFString Conversion3DLut();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncConversionNDLut", optional=true)
    public static native CFString ConversionNDLut();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncConversionInpChan", optional=true)
    public static native CFString ConversionInpChan();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncConversionOutChan", optional=true)
    public static native CFString ConversionOutChan();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncConversionBPC", optional=true)
    public static native CFString ConversionBPC();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="kColorSyncFixedPointRange", optional=true)
    public static native CFString FixedPointRange();
    
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncIterateInstalledProfiles", optional=true)
    public static native void iterateInstalledProfiles(FunctionPtr callBack, IntPtr seed, VoidPtr userInfo, CFError.CFErrorPtr error);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="ColorSyncCreateCodeFragment", optional=true)
    public static native CFType createCodeFragment(CFArray profileSequence, CFDictionary options);
    @Bridge(symbol="ColorSyncAPIVersion", optional=true)
    public static native int getAPIVersion();
    /*</methods>*/
}
