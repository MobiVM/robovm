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
package org.robovm.apple.coremedia;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreMedia") @WeaklyLinked/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CMVideoFormatDescription/*</name>*/ 
    extends /*<extends>*/CMFormatDescription/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CMVideoFormatDescriptionPtr extends Ptr<CMVideoFormatDescription, CMVideoFormatDescriptionPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CMVideoFormatDescription.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /**
     * @throws OSStatusException 
     * @since Available in iOS 4.0 and later.
     */
    public static CMVideoFormatDescription create(CMVideoCodecType codecType, int width, int height, CMVideoFormatDescriptionExtension extensions) throws OSStatusException {
        CMVideoFormatDescription.CMVideoFormatDescriptionPtr ptr = new CMVideoFormatDescription.CMVideoFormatDescriptionPtr();
        OSStatus status = create0(null, codecType, width, height, extensions, ptr);
        OSStatusException.throwIfNecessary(status);
        return ptr.get();
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 4.0 and later.
     */
    @WeaklyLinked
    public static CMVideoFormatDescription create(CVImageBuffer imageBuffer) throws OSStatusException {
        CMVideoFormatDescription.CMVideoFormatDescriptionPtr ptr = new CMVideoFormatDescription.CMVideoFormatDescriptionPtr();
        OSStatus status = create0(null, imageBuffer, ptr);
        OSStatusException.throwIfNecessary(status);
        return ptr.get();
    }

    /**
     * @throws OSStatusException 
     * @since Available in iOS 8.0 and later.
     */
    public static CMVideoFormatDescription createFromBigEndianImageDescriptionData(BytePtr imageDescriptionData, @MachineSizedUInt long imageDescriptionSize, int imageDescriptionStringEncoding, String imageDescriptionFlavor) throws OSStatusException {
        CMVideoFormatDescription.CMVideoFormatDescriptionPtr ptr = new CMVideoFormatDescription.CMVideoFormatDescriptionPtr();
        OSStatus status = createFromBigEndianImageDescriptionData0(null, imageDescriptionData, imageDescriptionSize, imageDescriptionStringEncoding, imageDescriptionFlavor, ptr);
        OSStatusException.throwIfNecessary(status);
        return ptr.get();
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 8.0 and later.
     */
    public static CMVideoFormatDescription createFromBigEndianImageDescriptionBlockBuffer(CMBlockBuffer imageDescriptionBlockBuffer, int imageDescriptionStringEncoding, String imageDescriptionFlavor) throws OSStatusException {
        CMVideoFormatDescription.CMVideoFormatDescriptionPtr ptr = new CMVideoFormatDescription.CMVideoFormatDescriptionPtr();
        OSStatus status = createFromBigEndianImageDescriptionBlockBuffer0(null, imageDescriptionBlockBuffer, imageDescriptionStringEncoding, imageDescriptionFlavor, ptr);
        OSStatusException.throwIfNecessary(status);
        return ptr.get();
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 8.0 and later.
     */
    public static CMBlockBuffer copyAsBigEndianImageDescriptionBlockBuffer(CFAllocator allocator, CMVideoFormatDescription videoFormatDescription, int imageDescriptionStringEncoding, String imageDescriptionFlavor) throws OSStatusException {
        CMBlockBuffer.CMBlockBufferPtr ptr = new CMBlockBuffer.CMBlockBufferPtr();
        OSStatus status = copyAsBigEndianImageDescriptionBlockBuffer0(null, videoFormatDescription, imageDescriptionStringEncoding, imageDescriptionFlavor, ptr);
        OSStatusException.throwIfNecessary(status);
        return ptr.get();
    }
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionFieldDetail_TemporalTopFirst", optional=true)
    public static native CFString FieldDetailTemporalTopFirst();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionFieldDetail_TemporalBottomFirst", optional=true)
    public static native CFString FieldDetailTemporalBottomFirst();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionFieldDetail_SpatialFirstLineEarly", optional=true)
    public static native CFString FieldDetailSpatialFirstLineEarly();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionFieldDetail_SpatialFirstLineLate", optional=true)
    public static native CFString FieldDetailSpatialFirstLineLate();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionColorPrimaries_ITU_R_709_2", optional=true)
    public static native CFString ColorPrimaries_ITU_R_709_2();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionColorPrimaries_EBU_3213", optional=true)
    public static native CFString ColorPrimaries_EBU_3213();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionColorPrimaries_SMPTE_C", optional=true)
    public static native CFString ColorPrimaries_SMPTE_C();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionColorPrimaries_DCI_P3", optional=true)
    public static native CFString ColorPrimaries_DCI_P3();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionColorPrimaries_P3_D65", optional=true)
    public static native CFString ColorPrimaries_P3_D65();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionColorPrimaries_ITU_R_2020", optional=true)
    public static native CFString ColorPrimaries_ITU_R_2020();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionColorPrimaries_P22", optional=true)
    public static native CFString ColorPrimaries_P22();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionTransferFunction_ITU_R_709_2", optional=true)
    public static native CFString TransferFunction_ITU_R_709_2();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionTransferFunction_SMPTE_240M_1995", optional=true)
    public static native CFString TransferFunction_SMPTE_240M_1995();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionTransferFunction_UseGamma", optional=true)
    public static native CFString TransferFunction_UseGamma();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionTransferFunction_ITU_R_2020", optional=true)
    public static native CFString TransferFunction_ITU_R_2020();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionTransferFunction_SMPTE_ST_428_1", optional=true)
    public static native CFString TransferFunction_SMPTE_ST_428_1();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionTransferFunction_SMPTE_ST_2084_PQ", optional=true)
    public static native CFString TransferFunction_SMPTE_ST_2084_PQ();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionTransferFunction_ITU_R_2100_HLG", optional=true)
    public static native CFString TransferFunction_ITU_R_2100_HLG();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionTransferFunction_Linear", optional=true)
    public static native CFString TransferFunction_Linear();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionYCbCrMatrix_ITU_R_709_2", optional=true)
    public static native CFString YCbCrMatrix_ITU_R_709_2();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionYCbCrMatrix_ITU_R_601_4", optional=true)
    public static native CFString YCbCrMatrix_ITU_R_601_4();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionYCbCrMatrix_SMPTE_240M_1995", optional=true)
    public static native CFString YCbCrMatrix_SMPTE_240M_1995();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionYCbCrMatrix_ITU_R_2020", optional=true)
    public static native CFString YCbCrMatrix_ITU_R_2020();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionChromaLocation_Left", optional=true)
    public static native CFString ChromaLocationLeft();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionChromaLocation_Center", optional=true)
    public static native CFString ChromaLocationCenter();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionChromaLocation_TopLeft", optional=true)
    public static native CFString ChromaLocationTopLeft();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionChromaLocation_Top", optional=true)
    public static native CFString ChromaLocationTop();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionChromaLocation_BottomLeft", optional=true)
    public static native CFString ChromaLocationBottomLeft();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionChromaLocation_Bottom", optional=true)
    public static native CFString ChromaLocationBottom();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMFormatDescriptionChromaLocation_DV420", optional=true)
    public static native CFString ChromaLocationDV420();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMSampleBufferLensStabilizationInfo_Active", optional=true)
    public static native CFString LensStabilizationInfoActive();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMSampleBufferLensStabilizationInfo_OutOfRange", optional=true)
    public static native CFString LensStabilizationInfoOutOfRange();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMSampleBufferLensStabilizationInfo_Unavailable", optional=true)
    public static native CFString LensStabilizationInfoUnavailable();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCMSampleBufferLensStabilizationInfo_Off", optional=true)
    public static native CFString LensStabilizationInfoOff();
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="CMVideoFormatDescriptionCreate", optional=true)
    private static native OSStatus create0(CFAllocator allocator, CMVideoCodecType codecType, int width, int height, CMVideoFormatDescriptionExtension extensions, CMVideoFormatDescription.CMVideoFormatDescriptionPtr formatDescriptionOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="CMVideoFormatDescriptionCreateForImageBuffer", optional=true)
    private static native OSStatus create0(CFAllocator allocator, CVImageBuffer imageBuffer, CMVideoFormatDescription.CMVideoFormatDescriptionPtr formatDescriptionOut);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="CMVideoFormatDescriptionCreateFromHEVCParameterSets", optional=true)
    private static native OSStatus create0(CFAllocator allocator, @MachineSizedUInt long parameterSetCount, BytePtr.BytePtrPtr parameterSetPointers, MachineSizedUIntPtr parameterSetSizes, int NALUnitHeaderLength, CMVideoFormatDescriptionExtension extensions, CMFormatDescription.CMFormatDescriptionPtr formatDescriptionOut);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="CMVideoFormatDescriptionGetHEVCParameterSetAtIndex", optional=true)
    public static native OSStatus getHEVCParameterSetAtIndex(CMFormatDescription videoDesc, @MachineSizedUInt long parameterSetIndex, BytePtr.BytePtrPtr parameterSetPointerOut, MachineSizedUIntPtr parameterSetSizeOut, MachineSizedUIntPtr parameterSetCountOut, IntPtr NALUnitHeaderLengthOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="CMVideoFormatDescriptionGetDimensions", optional=true)
    public native @ByVal CMVideoDimensions getDimensions();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @WeaklyLinked
    @Bridge(symbol="CMVideoFormatDescriptionGetPresentationDimensions", optional=true)
    public native @ByVal CGSize getPresentationDimensions(boolean usePixelAspectRatio, boolean useCleanAperture);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @WeaklyLinked
    @Bridge(symbol="CMVideoFormatDescriptionGetCleanAperture", optional=true)
    public native @ByVal CGRect getCleanAperture(boolean originIsAtTopLeft);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="CMVideoFormatDescriptionGetExtensionKeysCommonWithImageBuffers", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFArray.AsStringListMarshaler.class) List<String> getExtensionKeysCommonWithImageBuffers();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="CMVideoFormatDescriptionMatchesImageBuffer", optional=true)
    public native boolean matchesImageBuffer(CVImageBuffer imageBuffer);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Bridge(symbol="CMVideoFormatDescriptionCreateFromBigEndianImageDescriptionData", optional=true)
    private static native OSStatus createFromBigEndianImageDescriptionData0(CFAllocator allocator, BytePtr imageDescriptionData, @MachineSizedUInt long size, int stringEncoding, String flavor, CMVideoFormatDescription.CMVideoFormatDescriptionPtr formatDescriptionOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Bridge(symbol="CMVideoFormatDescriptionCreateFromBigEndianImageDescriptionBlockBuffer", optional=true)
    private static native OSStatus createFromBigEndianImageDescriptionBlockBuffer0(CFAllocator allocator, CMBlockBuffer imageDescriptionBlockBuffer, int stringEncoding, String flavor, CMVideoFormatDescription.CMVideoFormatDescriptionPtr formatDescriptionOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Bridge(symbol="CMVideoFormatDescriptionCopyAsBigEndianImageDescriptionBlockBuffer", optional=true)
    private static native OSStatus copyAsBigEndianImageDescriptionBlockBuffer0(CFAllocator allocator, CMVideoFormatDescription videoFormatDescription, int stringEncoding, String flavor, CMBlockBuffer.CMBlockBufferPtr blockBufferOut);
    /*</methods>*/
}
