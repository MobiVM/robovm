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
/*<annotations>*/@Library("CoreMedia") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CMSampleBufferAttachmentKey/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CMSampleBufferAttachmentKey/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CMSampleBufferAttachmentKey toObject(Class<CMSampleBufferAttachmentKey> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CMSampleBufferAttachmentKey.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CMSampleBufferAttachmentKey o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CMSampleBufferAttachmentKey> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CMSampleBufferAttachmentKey> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CMSampleBufferAttachmentKey.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CMSampleBufferAttachmentKey> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CMSampleBufferAttachmentKey o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final CMSampleBufferAttachmentKey ResetDecoderBeforeDecoding = new CMSampleBufferAttachmentKey("ResetDecoderBeforeDecoding");
    public static final CMSampleBufferAttachmentKey DrainAfterDecoding = new CMSampleBufferAttachmentKey("DrainAfterDecoding");
    public static final CMSampleBufferAttachmentKey PostNotificationWhenConsumed = new CMSampleBufferAttachmentKey("PostNotificationWhenConsumed");
    public static final CMSampleBufferAttachmentKey ResumeOutput = new CMSampleBufferAttachmentKey("ResumeOutput");
    public static final CMSampleBufferAttachmentKey TransitionID = new CMSampleBufferAttachmentKey("TransitionID");
    public static final CMSampleBufferAttachmentKey TrimDurationAtStart = new CMSampleBufferAttachmentKey("TrimDurationAtStart");
    public static final CMSampleBufferAttachmentKey TrimDurationAtEnd = new CMSampleBufferAttachmentKey("TrimDurationAtEnd");
    public static final CMSampleBufferAttachmentKey SpeedMultiplier = new CMSampleBufferAttachmentKey("SpeedMultiplier");
    public static final CMSampleBufferAttachmentKey Reverse = new CMSampleBufferAttachmentKey("Reverse");
    public static final CMSampleBufferAttachmentKey FillDiscontinuitiesWithSilence = new CMSampleBufferAttachmentKey("FillDiscontinuitiesWithSilence");
    public static final CMSampleBufferAttachmentKey EmptyMedia = new CMSampleBufferAttachmentKey("EmptyMedia");
    public static final CMSampleBufferAttachmentKey PermanentEmptyMedia = new CMSampleBufferAttachmentKey("PermanentEmptyMedia");
    public static final CMSampleBufferAttachmentKey DisplayEmptyMediaImmediately = new CMSampleBufferAttachmentKey("DisplayEmptyMediaImmediately");
    public static final CMSampleBufferAttachmentKey EndsPreviousSampleDuration = new CMSampleBufferAttachmentKey("EndsPreviousSampleDuration");
    public static final CMSampleBufferAttachmentKey SampleReferenceURL = new CMSampleBufferAttachmentKey("SampleReferenceURL");
    public static final CMSampleBufferAttachmentKey SampleReferenceByteOffset = new CMSampleBufferAttachmentKey("SampleReferenceByteOffset");
    public static final CMSampleBufferAttachmentKey GradualDecoderRefresh = new CMSampleBufferAttachmentKey("GradualDecoderRefresh");
    public static final CMSampleBufferAttachmentKey DroppedFrameReason = new CMSampleBufferAttachmentKey("DroppedFrameReason");
    public static final CMSampleBufferAttachmentKey DroppedFrameReasonInfo = new CMSampleBufferAttachmentKey("DroppedFrameReasonInfo");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CMSampleBufferAttachmentKey StillImageLensStabilizationInfo = new CMSampleBufferAttachmentKey("StillImageLensStabilizationInfo");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final CMSampleBufferAttachmentKey CameraIntrinsicMatrix = new CMSampleBufferAttachmentKey("CameraIntrinsicMatrix");
    public static final CMSampleBufferAttachmentKey ForceKeyFrame = new CMSampleBufferAttachmentKey("ForceKeyFrame");
    /*</constants>*/
    
    private static /*<name>*/CMSampleBufferAttachmentKey/*</name>*/[] values = new /*<name>*/CMSampleBufferAttachmentKey/*</name>*/[] {/*<value_list>*/ResetDecoderBeforeDecoding, DrainAfterDecoding, PostNotificationWhenConsumed, ResumeOutput, TransitionID, TrimDurationAtStart, TrimDurationAtEnd, SpeedMultiplier, Reverse, FillDiscontinuitiesWithSilence, EmptyMedia, PermanentEmptyMedia, DisplayEmptyMediaImmediately, EndsPreviousSampleDuration, SampleReferenceURL, SampleReferenceByteOffset, GradualDecoderRefresh, DroppedFrameReason, DroppedFrameReasonInfo, StillImageLensStabilizationInfo, CameraIntrinsicMatrix, ForceKeyFrame/*</value_list>*/};
    
    /*<name>*/CMSampleBufferAttachmentKey/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CMSampleBufferAttachmentKey/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CMSampleBufferAttachmentKey/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CMSampleBufferAttachmentKey/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CoreMedia") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kCMSampleBufferAttachmentKey_ResetDecoderBeforeDecoding", optional=true)
        public static native CFString ResetDecoderBeforeDecoding();
        @GlobalValue(symbol="kCMSampleBufferAttachmentKey_DrainAfterDecoding", optional=true)
        public static native CFString DrainAfterDecoding();
        @GlobalValue(symbol="kCMSampleBufferAttachmentKey_PostNotificationWhenConsumed", optional=true)
        public static native CFString PostNotificationWhenConsumed();
        @GlobalValue(symbol="kCMSampleBufferAttachmentKey_ResumeOutput", optional=true)
        public static native CFString ResumeOutput();
        @GlobalValue(symbol="kCMSampleBufferAttachmentKey_TransitionID", optional=true)
        public static native CFString TransitionID();
        @GlobalValue(symbol="kCMSampleBufferAttachmentKey_TrimDurationAtStart", optional=true)
        public static native CFString TrimDurationAtStart();
        @GlobalValue(symbol="kCMSampleBufferAttachmentKey_TrimDurationAtEnd", optional=true)
        public static native CFString TrimDurationAtEnd();
        @GlobalValue(symbol="kCMSampleBufferAttachmentKey_SpeedMultiplier", optional=true)
        public static native CFString SpeedMultiplier();
        @GlobalValue(symbol="kCMSampleBufferAttachmentKey_Reverse", optional=true)
        public static native CFString Reverse();
        @GlobalValue(symbol="kCMSampleBufferAttachmentKey_FillDiscontinuitiesWithSilence", optional=true)
        public static native CFString FillDiscontinuitiesWithSilence();
        @GlobalValue(symbol="kCMSampleBufferAttachmentKey_EmptyMedia", optional=true)
        public static native CFString EmptyMedia();
        @GlobalValue(symbol="kCMSampleBufferAttachmentKey_PermanentEmptyMedia", optional=true)
        public static native CFString PermanentEmptyMedia();
        @GlobalValue(symbol="kCMSampleBufferAttachmentKey_DisplayEmptyMediaImmediately", optional=true)
        public static native CFString DisplayEmptyMediaImmediately();
        @GlobalValue(symbol="kCMSampleBufferAttachmentKey_EndsPreviousSampleDuration", optional=true)
        public static native CFString EndsPreviousSampleDuration();
        @GlobalValue(symbol="kCMSampleBufferAttachmentKey_SampleReferenceURL", optional=true)
        public static native CFString SampleReferenceURL();
        @GlobalValue(symbol="kCMSampleBufferAttachmentKey_SampleReferenceByteOffset", optional=true)
        public static native CFString SampleReferenceByteOffset();
        @GlobalValue(symbol="kCMSampleBufferAttachmentKey_GradualDecoderRefresh", optional=true)
        public static native CFString GradualDecoderRefresh();
        @GlobalValue(symbol="kCMSampleBufferAttachmentKey_DroppedFrameReason", optional=true)
        public static native CFString DroppedFrameReason();
        @GlobalValue(symbol="kCMSampleBufferAttachmentKey_DroppedFrameReasonInfo", optional=true)
        public static native CFString DroppedFrameReasonInfo();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCMSampleBufferAttachmentKey_StillImageLensStabilizationInfo", optional=true)
        public static native CFString StillImageLensStabilizationInfo();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCMSampleBufferAttachmentKey_CameraIntrinsicMatrix", optional=true)
        public static native CFString CameraIntrinsicMatrix();
        @GlobalValue(symbol="kCMSampleBufferAttachmentKey_ForceKeyFrame", optional=true)
        public static native CFString ForceKeyFrame();
        /*</values>*/
    }
}
