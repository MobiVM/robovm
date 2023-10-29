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
/*<annotations>*/@Library("CoreMedia")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CMTag/*</name>*/ 
    extends /*<extends>*/Struct<CMTag>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CMTagPtr extends Ptr<CMTag, CMTagPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CMTag.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CMTag() {}
    public CMTag(CMTagCategory category, CMTagDataType dataType, long value) {
        this.setCategory(category);
        this.setDataType(dataType);
        this.setValue(value);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native CMTagCategory getCategory();
    @StructMember(0) public native CMTag setCategory(CMTagCategory category);
    @StructMember(1) public native CMTagDataType getDataType();
    @StructMember(1) public native CMTag setDataType(CMTagDataType dataType);
    @StructMember(2) public native long getValue();
    @StructMember(2) public native CMTag setValue(long value);
    /*</members>*/
    /*<methods>*/
    @Library("CoreMedia")
    public static class Constants {
        static { Bro.bind(Constants.class); }

        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kCMTagInvalid", optional=true)
        public static native @ByVal CMTag Invalid();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kCMTagMediaTypeVideo", optional=true)
        public static native @ByVal CMTag MediaTypeVideo();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kCMTagMediaSubTypeMebx", optional=true)
        public static native @ByVal CMTag MediaSubTypeMebx();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kCMTagMediaTypeAudio", optional=true)
        public static native @ByVal CMTag MediaTypeAudio();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kCMTagMediaTypeMetadata", optional=true)
        public static native @ByVal CMTag MediaTypeMetadata();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kCMTagStereoLeftEye", optional=true)
        public static native @ByVal CMTag StereoLeftEye();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kCMTagStereoRightEye", optional=true)
        public static native @ByVal CMTag StereoRightEye();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kCMTagStereoLeftAndRightEye", optional=true)
        public static native @ByVal CMTag StereoLeftAndRightEye();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kCMTagStereoNone", optional=true)
        public static native @ByVal CMTag StereoNone();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kCMTagStereoInterpretationOrderReversed", optional=true)
        public static native @ByVal CMTag StereoInterpretationOrderReversed();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kCMTagProjectionTypeRectangular", optional=true)
        public static native @ByVal CMTag ProjectionTypeRectangular();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kCMTagProjectionTypeEquirectangular", optional=true)
        public static native @ByVal CMTag ProjectionTypeEquirectangular();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kCMTagProjectionTypeFisheye", optional=true)
        public static native @ByVal CMTag ProjectionTypeFisheye();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kCMTagPackingTypeNone", optional=true)
        public static native @ByVal CMTag PackingTypeNone();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kCMTagPackingTypeSideBySide", optional=true)
        public static native @ByVal CMTag PackingTypeSideBySide();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kCMTagPackingTypeOverUnder", optional=true)
        public static native @ByVal CMTag PackingTypeOverUnder();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kCMTagValueKey", optional=true)
        public static native String ValueKey();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kCMTagCategoryKey", optional=true)
        public static native String CategoryKey();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kCMTagDataTypeKey", optional=true)
        public static native String DataTypeKey();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kCMTagCollectionTagsArrayKey", optional=true)
        public static native String CollectionTagsArrayKey();
    }
    
    /**
     * @since Available in iOS 17.0 and later.
     */
    public CMTagDataType getValueDataType() { return getValueDataType(this); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagGetValueDataType", optional=true)
    private static native CMTagDataType getValueDataType(@ByVal CMTag tag);
    /**
     * @since Available in iOS 17.0 and later.
     */
    public boolean hasSInt64Value() { return hasSInt64Value(this); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagHasSInt64Value", optional=true)
    private static native boolean hasSInt64Value(@ByVal CMTag tag);
    /**
     * @since Available in iOS 17.0 and later.
     */
    public long getSInt64Value() { return getSInt64Value(this); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagGetSInt64Value", optional=true)
    private static native long getSInt64Value(@ByVal CMTag tag);
    /**
     * @since Available in iOS 17.0 and later.
     */
    public boolean hasFloat64Value() { return hasFloat64Value(this); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagHasFloat64Value", optional=true)
    private static native boolean hasFloat64Value(@ByVal CMTag tag);
    /**
     * @since Available in iOS 17.0 and later.
     */
    public double getFloat64Value() { return getFloat64Value(this); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagGetFloat64Value", optional=true)
    private static native double getFloat64Value(@ByVal CMTag tag);
    /**
     * @since Available in iOS 17.0 and later.
     */
    public boolean hasOSTypeValue() { return hasOSTypeValue(this); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagHasOSTypeValue", optional=true)
    private static native boolean hasOSTypeValue(@ByVal CMTag tag);
    /**
     * @since Available in iOS 17.0 and later.
     */
    public int getOSTypeValue() { return getOSTypeValue(this); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagGetOSTypeValue", optional=true)
    private static native int getOSTypeValue(@ByVal CMTag tag);
    /**
     * @since Available in iOS 17.0 and later.
     */
    public boolean hasFlagsValue() { return hasFlagsValue(this); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagHasFlagsValue", optional=true)
    private static native boolean hasFlagsValue(@ByVal CMTag tag);
    /**
     * @since Available in iOS 17.0 and later.
     */
    public long getFlagsValue() { return getFlagsValue(this); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagGetFlagsValue", optional=true)
    private static native long getFlagsValue(@ByVal CMTag tag);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagMakeWithSInt64Value", optional=true)
    public static native @ByVal CMTag makeWithSInt64Value(CMTagCategory category, long value);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagMakeWithFloat64Value", optional=true)
    public static native @ByVal CMTag makeWithFloat64Value(CMTagCategory category, double value);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagMakeWithOSTypeValue", optional=true)
    public static native @ByVal CMTag makeWithOSTypeValue(CMTagCategory category, int value);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagMakeWithFlagsValue", optional=true)
    public static native @ByVal CMTag makeWithFlagsValue(CMTagCategory category, long flagsForTag);
    /**
     * @since Available in iOS 17.0 and later.
     */
    public boolean equalToTag(CMTag tag2) { return equalToTag(this, tag2); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagEqualToTag", optional=true)
    private static native boolean equalToTag(@ByVal CMTag tag1, @ByVal CMTag tag2);
    /**
     * @since Available in iOS 17.0 and later.
     */
    public CFComparisonResult compare(CMTag tag2) { return compare(this, tag2); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCompare", optional=true)
    private static native CFComparisonResult compare(@ByVal CMTag tag1, @ByVal CMTag tag2);
    /**
     * @since Available in iOS 17.0 and later.
     */
    public @MachineSizedUInt long hash() { return hash(this); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagHash", optional=true)
    private static native @MachineSizedUInt long hash(@ByVal CMTag tag);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCopyDescription", optional=true)
    public static native String copyDescription(CFAllocator allocator, @ByVal CMTag tag);
    /**
     * @since Available in iOS 17.0 and later.
     */
    public NSDictionary copyAsDictionary(CFAllocator allocator) { return copyAsDictionary(this, allocator); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCopyAsDictionary", optional=true)
    private static native NSDictionary copyAsDictionary(@ByVal CMTag tag, CFAllocator allocator);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagMakeFromDictionary", optional=true)
    public static native @ByVal CMTag makeFromDictionary(NSDictionary dict);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTaggedBufferGroupCreate", optional=true)
    public static native OSStatus gedBufferGroupCreate(CFAllocator allocator, NSArray tagCollections, NSArray buffers, CMTaggedBufferGroup.CMTaggedBufferGroupPtr groupOut);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTaggedBufferGroupCreateCombined", optional=true)
    public static native OSStatus gedBufferGroupCreateCombined(CFAllocator allocator, NSArray taggedBufferGroups, CMTaggedBufferGroup.CMTaggedBufferGroupPtr groupOut);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTaggedBufferGroupGetCount", optional=true)
    public static native @MachineSizedSInt long gedBufferGroupGetCount(CMTaggedBufferGroup group);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTaggedBufferGroupGetTagCollectionAtIndex", optional=true)
    public static native CMTagCollection gedBufferGroupGetTagCollectionAtIndex(CMTaggedBufferGroup group, @MachineSizedSInt long index);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTaggedBufferGroupGetCVPixelBufferAtIndex", optional=true)
    public static native CVPixelBuffer gedBufferGroupGetCVPixelBufferAtIndex(CMTaggedBufferGroup group, @MachineSizedSInt long index);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTaggedBufferGroupGetCVPixelBufferForTag", optional=true)
    public static native CVPixelBuffer gedBufferGroupGetCVPixelBufferForTag(CMTaggedBufferGroup group, @ByVal CMTag tag, MachineSizedSIntPtr indexOut);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTaggedBufferGroupGetCVPixelBufferForTagCollection", optional=true)
    public static native CVPixelBuffer gedBufferGroupGetCVPixelBufferForTagCollection(CMTaggedBufferGroup group, CMTagCollection tagCollection, MachineSizedSIntPtr indexOut);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTaggedBufferGroupGetCMSampleBufferAtIndex", optional=true)
    public static native CMSampleBuffer gedBufferGroupGetCMSampleBufferAtIndex(CMTaggedBufferGroup group, @MachineSizedSInt long index);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTaggedBufferGroupGetCMSampleBufferForTag", optional=true)
    public static native CMSampleBuffer gedBufferGroupGetCMSampleBufferForTag(CMTaggedBufferGroup group, @ByVal CMTag tag, MachineSizedSIntPtr indexOut);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTaggedBufferGroupGetCMSampleBufferForTagCollection", optional=true)
    public static native CMSampleBuffer gedBufferGroupGetCMSampleBufferForTagCollection(CMTaggedBufferGroup group, CMTagCollection tagCollection, MachineSizedSIntPtr indexOut);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTaggedBufferGroupGetNumberOfMatchesForTagCollection", optional=true)
    public static native @MachineSizedSInt long gedBufferGroupGetNumberOfMatchesForTagCollection(CMTaggedBufferGroup group, CMTagCollection tagCollection);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTaggedBufferGroupFormatDescriptionCreateForTaggedBufferGroup", optional=true)
    public static native OSStatus gedBufferGroupFormatDescriptionCreateForTaggedBufferGroup(CFAllocator allocator, CMTaggedBufferGroup taggedBufferGroup, CMFormatDescription.CMFormatDescriptionPtr formatDescriptionOut);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTaggedBufferGroupFormatDescriptionMatchesTaggedBufferGroup", optional=true)
    public static native boolean gedBufferGroupFormatDescriptionMatchesTaggedBufferGroup(CMFormatDescription desc, CMTaggedBufferGroup taggedBufferGroup);
    /*</methods>*/
}
