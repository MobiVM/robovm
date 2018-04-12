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
package org.robovm.apple.imageio;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("ImageIO") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CGImagePropertyIPTC/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGImagePropertyIPTC/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CGImagePropertyIPTC/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CGImagePropertyIPTC toObject(Class<CGImagePropertyIPTC> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CGImagePropertyIPTC.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CGImagePropertyIPTC o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CGImagePropertyIPTC> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CGImagePropertyIPTC> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CGImagePropertyIPTC.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CGImagePropertyIPTC> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CGImagePropertyIPTC o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC ObjectTypeReference = new CGImagePropertyIPTC("ObjectTypeReference");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC ObjectAttributeReference = new CGImagePropertyIPTC("ObjectAttributeReference");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC ObjectName = new CGImagePropertyIPTC("ObjectName");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC EditStatus = new CGImagePropertyIPTC("EditStatus");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC EditorialUpdate = new CGImagePropertyIPTC("EditorialUpdate");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC Urgency = new CGImagePropertyIPTC("Urgency");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC SubjectReference = new CGImagePropertyIPTC("SubjectReference");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC Category = new CGImagePropertyIPTC("Category");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC SupplementalCategory = new CGImagePropertyIPTC("SupplementalCategory");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC FixtureIdentifier = new CGImagePropertyIPTC("FixtureIdentifier");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC Keywords = new CGImagePropertyIPTC("Keywords");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC ContentLocationCode = new CGImagePropertyIPTC("ContentLocationCode");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC ContentLocationName = new CGImagePropertyIPTC("ContentLocationName");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC ReleaseDate = new CGImagePropertyIPTC("ReleaseDate");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC ReleaseTime = new CGImagePropertyIPTC("ReleaseTime");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC ExpirationDate = new CGImagePropertyIPTC("ExpirationDate");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC ExpirationTime = new CGImagePropertyIPTC("ExpirationTime");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC SpecialInstructions = new CGImagePropertyIPTC("SpecialInstructions");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC ActionAdvised = new CGImagePropertyIPTC("ActionAdvised");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC ReferenceService = new CGImagePropertyIPTC("ReferenceService");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC ReferenceDate = new CGImagePropertyIPTC("ReferenceDate");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC ReferenceNumber = new CGImagePropertyIPTC("ReferenceNumber");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC DateCreated = new CGImagePropertyIPTC("DateCreated");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC TimeCreated = new CGImagePropertyIPTC("TimeCreated");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC DigitalCreationDate = new CGImagePropertyIPTC("DigitalCreationDate");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC DigitalCreationTime = new CGImagePropertyIPTC("DigitalCreationTime");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC OriginatingProgram = new CGImagePropertyIPTC("OriginatingProgram");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC ProgramVersion = new CGImagePropertyIPTC("ProgramVersion");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC ObjectCycle = new CGImagePropertyIPTC("ObjectCycle");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC Byline = new CGImagePropertyIPTC("Byline");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC BylineTitle = new CGImagePropertyIPTC("BylineTitle");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC City = new CGImagePropertyIPTC("City");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC SubLocation = new CGImagePropertyIPTC("SubLocation");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC ProvinceState = new CGImagePropertyIPTC("ProvinceState");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC CountryPrimaryLocationCode = new CGImagePropertyIPTC("CountryPrimaryLocationCode");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC CountryPrimaryLocationName = new CGImagePropertyIPTC("CountryPrimaryLocationName");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC OriginalTransmissionReference = new CGImagePropertyIPTC("OriginalTransmissionReference");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC Headline = new CGImagePropertyIPTC("Headline");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC Credit = new CGImagePropertyIPTC("Credit");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC Source = new CGImagePropertyIPTC("Source");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC CopyrightNotice = new CGImagePropertyIPTC("CopyrightNotice");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC Contact = new CGImagePropertyIPTC("Contact");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC CaptionAbstract = new CGImagePropertyIPTC("CaptionAbstract");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC WriterEditor = new CGImagePropertyIPTC("WriterEditor");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC ImageType = new CGImagePropertyIPTC("ImageType");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC ImageOrientation = new CGImagePropertyIPTC("ImageOrientation");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC LanguageIdentifier = new CGImagePropertyIPTC("LanguageIdentifier");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC StarRating = new CGImagePropertyIPTC("StarRating");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC CreatorContactInfo = new CGImagePropertyIPTC("CreatorContactInfo");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC RightsUsageTerms = new CGImagePropertyIPTC("RightsUsageTerms");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CGImagePropertyIPTC Scene = new CGImagePropertyIPTC("Scene");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtAboutCvTerm = new CGImagePropertyIPTC("ExtAboutCvTerm");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtAboutCvTermCvId = new CGImagePropertyIPTC("ExtAboutCvTermCvId");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtAboutCvTermId = new CGImagePropertyIPTC("ExtAboutCvTermId");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtAboutCvTermName = new CGImagePropertyIPTC("ExtAboutCvTermName");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtAboutCvTermRefinedAbout = new CGImagePropertyIPTC("ExtAboutCvTermRefinedAbout");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtAddlModelInfo = new CGImagePropertyIPTC("ExtAddlModelInfo");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtArtworkOrObject = new CGImagePropertyIPTC("ExtArtworkOrObject");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtArtworkCircaDateCreated = new CGImagePropertyIPTC("ExtArtworkCircaDateCreated");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtArtworkContentDescription = new CGImagePropertyIPTC("ExtArtworkContentDescription");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtArtworkContributionDescription = new CGImagePropertyIPTC("ExtArtworkContributionDescription");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtArtworkCopyrightNotice = new CGImagePropertyIPTC("ExtArtworkCopyrightNotice");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtArtworkCreator = new CGImagePropertyIPTC("ExtArtworkCreator");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtArtworkCreatorID = new CGImagePropertyIPTC("ExtArtworkCreatorID");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtArtworkCopyrightOwnerID = new CGImagePropertyIPTC("ExtArtworkCopyrightOwnerID");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtArtworkCopyrightOwnerName = new CGImagePropertyIPTC("ExtArtworkCopyrightOwnerName");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtArtworkLicensorID = new CGImagePropertyIPTC("ExtArtworkLicensorID");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtArtworkLicensorName = new CGImagePropertyIPTC("ExtArtworkLicensorName");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtArtworkDateCreated = new CGImagePropertyIPTC("ExtArtworkDateCreated");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtArtworkPhysicalDescription = new CGImagePropertyIPTC("ExtArtworkPhysicalDescription");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtArtworkSource = new CGImagePropertyIPTC("ExtArtworkSource");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtArtworkSourceInventoryNo = new CGImagePropertyIPTC("ExtArtworkSourceInventoryNo");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtArtworkSourceInvURL = new CGImagePropertyIPTC("ExtArtworkSourceInvURL");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtArtworkStylePeriod = new CGImagePropertyIPTC("ExtArtworkStylePeriod");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtArtworkTitle = new CGImagePropertyIPTC("ExtArtworkTitle");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtAudioBitrate = new CGImagePropertyIPTC("ExtAudioBitrate");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtAudioBitrateMode = new CGImagePropertyIPTC("ExtAudioBitrateMode");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtAudioChannelCount = new CGImagePropertyIPTC("ExtAudioChannelCount");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtCircaDateCreated = new CGImagePropertyIPTC("ExtCircaDateCreated");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtContainerFormat = new CGImagePropertyIPTC("ExtContainerFormat");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtContainerFormatIdentifier = new CGImagePropertyIPTC("ExtContainerFormatIdentifier");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtContainerFormatName = new CGImagePropertyIPTC("ExtContainerFormatName");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtContributor = new CGImagePropertyIPTC("ExtContributor");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtContributorIdentifier = new CGImagePropertyIPTC("ExtContributorIdentifier");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtContributorName = new CGImagePropertyIPTC("ExtContributorName");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtContributorRole = new CGImagePropertyIPTC("ExtContributorRole");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtCopyrightYear = new CGImagePropertyIPTC("ExtCopyrightYear");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtCreator = new CGImagePropertyIPTC("ExtCreator");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtCreatorIdentifier = new CGImagePropertyIPTC("ExtCreatorIdentifier");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtCreatorName = new CGImagePropertyIPTC("ExtCreatorName");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtCreatorRole = new CGImagePropertyIPTC("ExtCreatorRole");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtControlledVocabularyTerm = new CGImagePropertyIPTC("ExtControlledVocabularyTerm");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtDataOnScreen = new CGImagePropertyIPTC("ExtDataOnScreen");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtDataOnScreenRegion = new CGImagePropertyIPTC("ExtDataOnScreenRegion");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtDataOnScreenRegionD = new CGImagePropertyIPTC("ExtDataOnScreenRegionD");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtDataOnScreenRegionH = new CGImagePropertyIPTC("ExtDataOnScreenRegionH");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtDataOnScreenRegionText = new CGImagePropertyIPTC("ExtDataOnScreenRegionText");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtDataOnScreenRegionUnit = new CGImagePropertyIPTC("ExtDataOnScreenRegionUnit");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtDataOnScreenRegionW = new CGImagePropertyIPTC("ExtDataOnScreenRegionW");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtDataOnScreenRegionX = new CGImagePropertyIPTC("ExtDataOnScreenRegionX");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtDataOnScreenRegionY = new CGImagePropertyIPTC("ExtDataOnScreenRegionY");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtDigitalImageGUID = new CGImagePropertyIPTC("ExtDigitalImageGUID");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtDigitalSourceFileType = new CGImagePropertyIPTC("ExtDigitalSourceFileType");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtDigitalSourceType = new CGImagePropertyIPTC("ExtDigitalSourceType");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtDopesheet = new CGImagePropertyIPTC("ExtDopesheet");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtDopesheetLink = new CGImagePropertyIPTC("ExtDopesheetLink");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtDopesheetLinkLink = new CGImagePropertyIPTC("ExtDopesheetLinkLink");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtDopesheetLinkLinkQualifier = new CGImagePropertyIPTC("ExtDopesheetLinkLinkQualifier");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtEmbdEncRightsExpr = new CGImagePropertyIPTC("ExtEmbdEncRightsExpr");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtEmbeddedEncodedRightsExpr = new CGImagePropertyIPTC("ExtEmbeddedEncodedRightsExpr");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtEmbeddedEncodedRightsExprType = new CGImagePropertyIPTC("ExtEmbeddedEncodedRightsExprType");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtEmbeddedEncodedRightsExprLangID = new CGImagePropertyIPTC("ExtEmbeddedEncodedRightsExprLangID");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtEpisode = new CGImagePropertyIPTC("ExtEpisode");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtEpisodeIdentifier = new CGImagePropertyIPTC("ExtEpisodeIdentifier");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtEpisodeName = new CGImagePropertyIPTC("ExtEpisodeName");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtEpisodeNumber = new CGImagePropertyIPTC("ExtEpisodeNumber");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtEvent = new CGImagePropertyIPTC("ExtEvent");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtShownEvent = new CGImagePropertyIPTC("ExtShownEvent");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtShownEventIdentifier = new CGImagePropertyIPTC("ExtShownEventIdentifier");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtShownEventName = new CGImagePropertyIPTC("ExtShownEventName");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtExternalMetadataLink = new CGImagePropertyIPTC("ExtExternalMetadataLink");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtFeedIdentifier = new CGImagePropertyIPTC("ExtFeedIdentifier");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtGenre = new CGImagePropertyIPTC("ExtGenre");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtGenreCvId = new CGImagePropertyIPTC("ExtGenreCvId");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtGenreCvTermId = new CGImagePropertyIPTC("ExtGenreCvTermId");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtGenreCvTermName = new CGImagePropertyIPTC("ExtGenreCvTermName");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtGenreCvTermRefinedAbout = new CGImagePropertyIPTC("ExtGenreCvTermRefinedAbout");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtHeadline = new CGImagePropertyIPTC("ExtHeadline");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtIPTCLastEdited = new CGImagePropertyIPTC("ExtIPTCLastEdited");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtLinkedEncRightsExpr = new CGImagePropertyIPTC("ExtLinkedEncRightsExpr");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtLinkedEncodedRightsExpr = new CGImagePropertyIPTC("ExtLinkedEncodedRightsExpr");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtLinkedEncodedRightsExprType = new CGImagePropertyIPTC("ExtLinkedEncodedRightsExprType");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtLinkedEncodedRightsExprLangID = new CGImagePropertyIPTC("ExtLinkedEncodedRightsExprLangID");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtLocationCreated = new CGImagePropertyIPTC("ExtLocationCreated");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtLocationCity = new CGImagePropertyIPTC("ExtLocationCity");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtLocationCountryCode = new CGImagePropertyIPTC("ExtLocationCountryCode");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtLocationCountryName = new CGImagePropertyIPTC("ExtLocationCountryName");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtLocationGPSAltitude = new CGImagePropertyIPTC("ExtLocationGPSAltitude");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtLocationGPSLatitude = new CGImagePropertyIPTC("ExtLocationGPSLatitude");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtLocationGPSLongitude = new CGImagePropertyIPTC("ExtLocationGPSLongitude");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtLocationIdentifier = new CGImagePropertyIPTC("ExtLocationIdentifier");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtLocationLocationId = new CGImagePropertyIPTC("ExtLocationLocationId");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtLocationLocationName = new CGImagePropertyIPTC("ExtLocationLocationName");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtLocationProvinceState = new CGImagePropertyIPTC("ExtLocationProvinceState");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtLocationSublocation = new CGImagePropertyIPTC("ExtLocationSublocation");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtLocationWorldRegion = new CGImagePropertyIPTC("ExtLocationWorldRegion");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtLocationShown = new CGImagePropertyIPTC("ExtLocationShown");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtMaxAvailHeight = new CGImagePropertyIPTC("ExtMaxAvailHeight");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtMaxAvailWidth = new CGImagePropertyIPTC("ExtMaxAvailWidth");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtModelAge = new CGImagePropertyIPTC("ExtModelAge");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtOrganisationInImageCode = new CGImagePropertyIPTC("ExtOrganisationInImageCode");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtOrganisationInImageName = new CGImagePropertyIPTC("ExtOrganisationInImageName");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtPersonHeard = new CGImagePropertyIPTC("ExtPersonHeard");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtPersonHeardIdentifier = new CGImagePropertyIPTC("ExtPersonHeardIdentifier");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtPersonHeardName = new CGImagePropertyIPTC("ExtPersonHeardName");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtPersonInImage = new CGImagePropertyIPTC("ExtPersonInImage");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtPersonInImageWDetails = new CGImagePropertyIPTC("ExtPersonInImageWDetails");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtPersonInImageCharacteristic = new CGImagePropertyIPTC("ExtPersonInImageCharacteristic");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtPersonInImageCvTermCvId = new CGImagePropertyIPTC("ExtPersonInImageCvTermCvId");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtPersonInImageCvTermId = new CGImagePropertyIPTC("ExtPersonInImageCvTermId");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtPersonInImageCvTermName = new CGImagePropertyIPTC("ExtPersonInImageCvTermName");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtPersonInImageCvTermRefinedAbout = new CGImagePropertyIPTC("ExtPersonInImageCvTermRefinedAbout");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtPersonInImageDescription = new CGImagePropertyIPTC("ExtPersonInImageDescription");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtPersonInImageId = new CGImagePropertyIPTC("ExtPersonInImageId");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtPersonInImageName = new CGImagePropertyIPTC("ExtPersonInImageName");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtProductInImage = new CGImagePropertyIPTC("ExtProductInImage");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtProductInImageDescription = new CGImagePropertyIPTC("ExtProductInImageDescription");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtProductInImageGTIN = new CGImagePropertyIPTC("ExtProductInImageGTIN");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtProductInImageName = new CGImagePropertyIPTC("ExtProductInImageName");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtPublicationEvent = new CGImagePropertyIPTC("ExtPublicationEvent");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtPublicationEventDate = new CGImagePropertyIPTC("ExtPublicationEventDate");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtPublicationEventIdentifier = new CGImagePropertyIPTC("ExtPublicationEventIdentifier");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtPublicationEventName = new CGImagePropertyIPTC("ExtPublicationEventName");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtRating = new CGImagePropertyIPTC("ExtRating");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtRatingRatingRegion = new CGImagePropertyIPTC("ExtRatingRatingRegion");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtRatingRegionCity = new CGImagePropertyIPTC("ExtRatingRegionCity");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtRatingRegionCountryCode = new CGImagePropertyIPTC("ExtRatingRegionCountryCode");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtRatingRegionCountryName = new CGImagePropertyIPTC("ExtRatingRegionCountryName");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtRatingRegionGPSAltitude = new CGImagePropertyIPTC("ExtRatingRegionGPSAltitude");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtRatingRegionGPSLatitude = new CGImagePropertyIPTC("ExtRatingRegionGPSLatitude");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtRatingRegionGPSLongitude = new CGImagePropertyIPTC("ExtRatingRegionGPSLongitude");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtRatingRegionIdentifier = new CGImagePropertyIPTC("ExtRatingRegionIdentifier");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtRatingRegionLocationId = new CGImagePropertyIPTC("ExtRatingRegionLocationId");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtRatingRegionLocationName = new CGImagePropertyIPTC("ExtRatingRegionLocationName");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtRatingRegionProvinceState = new CGImagePropertyIPTC("ExtRatingRegionProvinceState");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtRatingRegionSublocation = new CGImagePropertyIPTC("ExtRatingRegionSublocation");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtRatingRegionWorldRegion = new CGImagePropertyIPTC("ExtRatingRegionWorldRegion");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtRatingScaleMaxValue = new CGImagePropertyIPTC("ExtRatingScaleMaxValue");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtRatingScaleMinValue = new CGImagePropertyIPTC("ExtRatingScaleMinValue");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtRatingSourceLink = new CGImagePropertyIPTC("ExtRatingSourceLink");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtRatingValue = new CGImagePropertyIPTC("ExtRatingValue");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtRatingValueLogoLink = new CGImagePropertyIPTC("ExtRatingValueLogoLink");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtRegistryID = new CGImagePropertyIPTC("ExtRegistryID");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtRegistryEntryRole = new CGImagePropertyIPTC("ExtRegistryEntryRole");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtRegistryItemID = new CGImagePropertyIPTC("ExtRegistryItemID");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtRegistryOrganisationID = new CGImagePropertyIPTC("ExtRegistryOrganisationID");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtReleaseReady = new CGImagePropertyIPTC("ExtReleaseReady");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtSeason = new CGImagePropertyIPTC("ExtSeason");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtSeasonIdentifier = new CGImagePropertyIPTC("ExtSeasonIdentifier");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtSeasonName = new CGImagePropertyIPTC("ExtSeasonName");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtSeasonNumber = new CGImagePropertyIPTC("ExtSeasonNumber");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtSeries = new CGImagePropertyIPTC("ExtSeries");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtSeriesIdentifier = new CGImagePropertyIPTC("ExtSeriesIdentifier");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtSeriesName = new CGImagePropertyIPTC("ExtSeriesName");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtStorylineIdentifier = new CGImagePropertyIPTC("ExtStorylineIdentifier");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtStreamReady = new CGImagePropertyIPTC("ExtStreamReady");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtStylePeriod = new CGImagePropertyIPTC("ExtStylePeriod");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtSupplyChainSource = new CGImagePropertyIPTC("ExtSupplyChainSource");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtSupplyChainSourceIdentifier = new CGImagePropertyIPTC("ExtSupplyChainSourceIdentifier");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtSupplyChainSourceName = new CGImagePropertyIPTC("ExtSupplyChainSourceName");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtTemporalCoverage = new CGImagePropertyIPTC("ExtTemporalCoverage");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtTemporalCoverageFrom = new CGImagePropertyIPTC("ExtTemporalCoverageFrom");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtTemporalCoverageTo = new CGImagePropertyIPTC("ExtTemporalCoverageTo");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtTranscript = new CGImagePropertyIPTC("ExtTranscript");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtTranscriptLink = new CGImagePropertyIPTC("ExtTranscriptLink");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtTranscriptLinkLink = new CGImagePropertyIPTC("ExtTranscriptLinkLink");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtTranscriptLinkLinkQualifier = new CGImagePropertyIPTC("ExtTranscriptLinkLinkQualifier");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtVideoBitrate = new CGImagePropertyIPTC("ExtVideoBitrate");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtVideoBitrateMode = new CGImagePropertyIPTC("ExtVideoBitrateMode");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtVideoDisplayAspectRatio = new CGImagePropertyIPTC("ExtVideoDisplayAspectRatio");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtVideoEncodingProfile = new CGImagePropertyIPTC("ExtVideoEncodingProfile");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtVideoShotType = new CGImagePropertyIPTC("ExtVideoShotType");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtVideoShotTypeIdentifier = new CGImagePropertyIPTC("ExtVideoShotTypeIdentifier");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtVideoShotTypeName = new CGImagePropertyIPTC("ExtVideoShotTypeName");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtVideoStreamsCount = new CGImagePropertyIPTC("ExtVideoStreamsCount");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtVisualColor = new CGImagePropertyIPTC("ExtVisualColor");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtWorkflowTag = new CGImagePropertyIPTC("ExtWorkflowTag");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtWorkflowTagCvId = new CGImagePropertyIPTC("ExtWorkflowTagCvId");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtWorkflowTagCvTermId = new CGImagePropertyIPTC("ExtWorkflowTagCvTermId");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtWorkflowTagCvTermName = new CGImagePropertyIPTC("ExtWorkflowTagCvTermName");
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final CGImagePropertyIPTC ExtWorkflowTagCvTermRefinedAbout = new CGImagePropertyIPTC("ExtWorkflowTagCvTermRefinedAbout");
    /*</constants>*/
    
    private static /*<name>*/CGImagePropertyIPTC/*</name>*/[] values = new /*<name>*/CGImagePropertyIPTC/*</name>*/[] {/*<value_list>*/ObjectTypeReference, ObjectAttributeReference, ObjectName, EditStatus, EditorialUpdate, Urgency, SubjectReference, Category, SupplementalCategory, FixtureIdentifier, Keywords, ContentLocationCode, ContentLocationName, ReleaseDate, ReleaseTime, ExpirationDate, ExpirationTime, SpecialInstructions, ActionAdvised, ReferenceService, ReferenceDate, ReferenceNumber, DateCreated, TimeCreated, DigitalCreationDate, DigitalCreationTime, OriginatingProgram, ProgramVersion, ObjectCycle, Byline, BylineTitle, City, SubLocation, ProvinceState, CountryPrimaryLocationCode, CountryPrimaryLocationName, OriginalTransmissionReference, Headline, Credit, Source, CopyrightNotice, Contact, CaptionAbstract, WriterEditor, ImageType, ImageOrientation, LanguageIdentifier, StarRating, CreatorContactInfo, RightsUsageTerms, Scene, ExtAboutCvTerm, ExtAboutCvTermCvId, ExtAboutCvTermId, ExtAboutCvTermName, ExtAboutCvTermRefinedAbout, ExtAddlModelInfo, ExtArtworkOrObject, ExtArtworkCircaDateCreated, ExtArtworkContentDescription, ExtArtworkContributionDescription, ExtArtworkCopyrightNotice, ExtArtworkCreator, ExtArtworkCreatorID, ExtArtworkCopyrightOwnerID, ExtArtworkCopyrightOwnerName, ExtArtworkLicensorID, ExtArtworkLicensorName, ExtArtworkDateCreated, ExtArtworkPhysicalDescription, ExtArtworkSource, ExtArtworkSourceInventoryNo, ExtArtworkSourceInvURL, ExtArtworkStylePeriod, ExtArtworkTitle, ExtAudioBitrate, ExtAudioBitrateMode, ExtAudioChannelCount, ExtCircaDateCreated, ExtContainerFormat, ExtContainerFormatIdentifier, ExtContainerFormatName, ExtContributor, ExtContributorIdentifier, ExtContributorName, ExtContributorRole, ExtCopyrightYear, ExtCreator, ExtCreatorIdentifier, ExtCreatorName, ExtCreatorRole, ExtControlledVocabularyTerm, ExtDataOnScreen, ExtDataOnScreenRegion, ExtDataOnScreenRegionD, ExtDataOnScreenRegionH, ExtDataOnScreenRegionText, ExtDataOnScreenRegionUnit, ExtDataOnScreenRegionW, ExtDataOnScreenRegionX, ExtDataOnScreenRegionY, ExtDigitalImageGUID, ExtDigitalSourceFileType, ExtDigitalSourceType, ExtDopesheet, ExtDopesheetLink, ExtDopesheetLinkLink, ExtDopesheetLinkLinkQualifier, ExtEmbdEncRightsExpr, ExtEmbeddedEncodedRightsExpr, ExtEmbeddedEncodedRightsExprType, ExtEmbeddedEncodedRightsExprLangID, ExtEpisode, ExtEpisodeIdentifier, ExtEpisodeName, ExtEpisodeNumber, ExtEvent, ExtShownEvent, ExtShownEventIdentifier, ExtShownEventName, ExtExternalMetadataLink, ExtFeedIdentifier, ExtGenre, ExtGenreCvId, ExtGenreCvTermId, ExtGenreCvTermName, ExtGenreCvTermRefinedAbout, ExtHeadline, ExtIPTCLastEdited, ExtLinkedEncRightsExpr, ExtLinkedEncodedRightsExpr, ExtLinkedEncodedRightsExprType, ExtLinkedEncodedRightsExprLangID, ExtLocationCreated, ExtLocationCity, ExtLocationCountryCode, ExtLocationCountryName, ExtLocationGPSAltitude, ExtLocationGPSLatitude, ExtLocationGPSLongitude, ExtLocationIdentifier, ExtLocationLocationId, ExtLocationLocationName, ExtLocationProvinceState, ExtLocationSublocation, ExtLocationWorldRegion, ExtLocationShown, ExtMaxAvailHeight, ExtMaxAvailWidth, ExtModelAge, ExtOrganisationInImageCode, ExtOrganisationInImageName, ExtPersonHeard, ExtPersonHeardIdentifier, ExtPersonHeardName, ExtPersonInImage, ExtPersonInImageWDetails, ExtPersonInImageCharacteristic, ExtPersonInImageCvTermCvId, ExtPersonInImageCvTermId, ExtPersonInImageCvTermName, ExtPersonInImageCvTermRefinedAbout, ExtPersonInImageDescription, ExtPersonInImageId, ExtPersonInImageName, ExtProductInImage, ExtProductInImageDescription, ExtProductInImageGTIN, ExtProductInImageName, ExtPublicationEvent, ExtPublicationEventDate, ExtPublicationEventIdentifier, ExtPublicationEventName, ExtRating, ExtRatingRatingRegion, ExtRatingRegionCity, ExtRatingRegionCountryCode, ExtRatingRegionCountryName, ExtRatingRegionGPSAltitude, ExtRatingRegionGPSLatitude, ExtRatingRegionGPSLongitude, ExtRatingRegionIdentifier, ExtRatingRegionLocationId, ExtRatingRegionLocationName, ExtRatingRegionProvinceState, ExtRatingRegionSublocation, ExtRatingRegionWorldRegion, ExtRatingScaleMaxValue, ExtRatingScaleMinValue, ExtRatingSourceLink, ExtRatingValue, ExtRatingValueLogoLink, ExtRegistryID, ExtRegistryEntryRole, ExtRegistryItemID, ExtRegistryOrganisationID, ExtReleaseReady, ExtSeason, ExtSeasonIdentifier, ExtSeasonName, ExtSeasonNumber, ExtSeries, ExtSeriesIdentifier, ExtSeriesName, ExtStorylineIdentifier, ExtStreamReady, ExtStylePeriod, ExtSupplyChainSource, ExtSupplyChainSourceIdentifier, ExtSupplyChainSourceName, ExtTemporalCoverage, ExtTemporalCoverageFrom, ExtTemporalCoverageTo, ExtTranscript, ExtTranscriptLink, ExtTranscriptLinkLink, ExtTranscriptLinkLinkQualifier, ExtVideoBitrate, ExtVideoBitrateMode, ExtVideoDisplayAspectRatio, ExtVideoEncodingProfile, ExtVideoShotType, ExtVideoShotTypeIdentifier, ExtVideoShotTypeName, ExtVideoStreamsCount, ExtVisualColor, ExtWorkflowTag, ExtWorkflowTagCvId, ExtWorkflowTagCvTermId, ExtWorkflowTagCvTermName, ExtWorkflowTagCvTermRefinedAbout/*</value_list>*/};
    
    /*<name>*/CGImagePropertyIPTC/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CGImagePropertyIPTC/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CGImagePropertyIPTC/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CGImagePropertyIPTC/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("ImageIO") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCObjectTypeReference", optional=true)
        public static native CFString ObjectTypeReference();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCObjectAttributeReference", optional=true)
        public static native CFString ObjectAttributeReference();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCObjectName", optional=true)
        public static native CFString ObjectName();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCEditStatus", optional=true)
        public static native CFString EditStatus();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCEditorialUpdate", optional=true)
        public static native CFString EditorialUpdate();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCUrgency", optional=true)
        public static native CFString Urgency();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCSubjectReference", optional=true)
        public static native CFString SubjectReference();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCCategory", optional=true)
        public static native CFString Category();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCSupplementalCategory", optional=true)
        public static native CFString SupplementalCategory();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCFixtureIdentifier", optional=true)
        public static native CFString FixtureIdentifier();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCKeywords", optional=true)
        public static native CFString Keywords();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCContentLocationCode", optional=true)
        public static native CFString ContentLocationCode();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCContentLocationName", optional=true)
        public static native CFString ContentLocationName();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCReleaseDate", optional=true)
        public static native CFString ReleaseDate();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCReleaseTime", optional=true)
        public static native CFString ReleaseTime();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExpirationDate", optional=true)
        public static native CFString ExpirationDate();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExpirationTime", optional=true)
        public static native CFString ExpirationTime();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCSpecialInstructions", optional=true)
        public static native CFString SpecialInstructions();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCActionAdvised", optional=true)
        public static native CFString ActionAdvised();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCReferenceService", optional=true)
        public static native CFString ReferenceService();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCReferenceDate", optional=true)
        public static native CFString ReferenceDate();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCReferenceNumber", optional=true)
        public static native CFString ReferenceNumber();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCDateCreated", optional=true)
        public static native CFString DateCreated();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCTimeCreated", optional=true)
        public static native CFString TimeCreated();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCDigitalCreationDate", optional=true)
        public static native CFString DigitalCreationDate();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCDigitalCreationTime", optional=true)
        public static native CFString DigitalCreationTime();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCOriginatingProgram", optional=true)
        public static native CFString OriginatingProgram();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCProgramVersion", optional=true)
        public static native CFString ProgramVersion();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCObjectCycle", optional=true)
        public static native CFString ObjectCycle();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCByline", optional=true)
        public static native CFString Byline();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCBylineTitle", optional=true)
        public static native CFString BylineTitle();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCCity", optional=true)
        public static native CFString City();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCSubLocation", optional=true)
        public static native CFString SubLocation();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCProvinceState", optional=true)
        public static native CFString ProvinceState();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCCountryPrimaryLocationCode", optional=true)
        public static native CFString CountryPrimaryLocationCode();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCCountryPrimaryLocationName", optional=true)
        public static native CFString CountryPrimaryLocationName();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCOriginalTransmissionReference", optional=true)
        public static native CFString OriginalTransmissionReference();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCHeadline", optional=true)
        public static native CFString Headline();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCCredit", optional=true)
        public static native CFString Credit();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCSource", optional=true)
        public static native CFString Source();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCCopyrightNotice", optional=true)
        public static native CFString CopyrightNotice();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCContact", optional=true)
        public static native CFString Contact();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCCaptionAbstract", optional=true)
        public static native CFString CaptionAbstract();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCWriterEditor", optional=true)
        public static native CFString WriterEditor();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCImageType", optional=true)
        public static native CFString ImageType();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCImageOrientation", optional=true)
        public static native CFString ImageOrientation();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCLanguageIdentifier", optional=true)
        public static native CFString LanguageIdentifier();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCStarRating", optional=true)
        public static native CFString StarRating();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCCreatorContactInfo", optional=true)
        public static native CFString CreatorContactInfo();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCRightsUsageTerms", optional=true)
        public static native CFString RightsUsageTerms();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCScene", optional=true)
        public static native CFString Scene();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtAboutCvTerm", optional=true)
        public static native CFString ExtAboutCvTerm();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtAboutCvTermCvId", optional=true)
        public static native CFString ExtAboutCvTermCvId();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtAboutCvTermId", optional=true)
        public static native CFString ExtAboutCvTermId();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtAboutCvTermName", optional=true)
        public static native CFString ExtAboutCvTermName();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtAboutCvTermRefinedAbout", optional=true)
        public static native CFString ExtAboutCvTermRefinedAbout();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtAddlModelInfo", optional=true)
        public static native CFString ExtAddlModelInfo();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtArtworkOrObject", optional=true)
        public static native CFString ExtArtworkOrObject();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtArtworkCircaDateCreated", optional=true)
        public static native CFString ExtArtworkCircaDateCreated();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtArtworkContentDescription", optional=true)
        public static native CFString ExtArtworkContentDescription();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtArtworkContributionDescription", optional=true)
        public static native CFString ExtArtworkContributionDescription();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtArtworkCopyrightNotice", optional=true)
        public static native CFString ExtArtworkCopyrightNotice();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtArtworkCreator", optional=true)
        public static native CFString ExtArtworkCreator();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtArtworkCreatorID", optional=true)
        public static native CFString ExtArtworkCreatorID();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtArtworkCopyrightOwnerID", optional=true)
        public static native CFString ExtArtworkCopyrightOwnerID();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtArtworkCopyrightOwnerName", optional=true)
        public static native CFString ExtArtworkCopyrightOwnerName();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtArtworkLicensorID", optional=true)
        public static native CFString ExtArtworkLicensorID();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtArtworkLicensorName", optional=true)
        public static native CFString ExtArtworkLicensorName();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtArtworkDateCreated", optional=true)
        public static native CFString ExtArtworkDateCreated();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtArtworkPhysicalDescription", optional=true)
        public static native CFString ExtArtworkPhysicalDescription();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtArtworkSource", optional=true)
        public static native CFString ExtArtworkSource();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtArtworkSourceInventoryNo", optional=true)
        public static native CFString ExtArtworkSourceInventoryNo();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtArtworkSourceInvURL", optional=true)
        public static native CFString ExtArtworkSourceInvURL();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtArtworkStylePeriod", optional=true)
        public static native CFString ExtArtworkStylePeriod();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtArtworkTitle", optional=true)
        public static native CFString ExtArtworkTitle();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtAudioBitrate", optional=true)
        public static native CFString ExtAudioBitrate();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtAudioBitrateMode", optional=true)
        public static native CFString ExtAudioBitrateMode();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtAudioChannelCount", optional=true)
        public static native CFString ExtAudioChannelCount();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtCircaDateCreated", optional=true)
        public static native CFString ExtCircaDateCreated();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtContainerFormat", optional=true)
        public static native CFString ExtContainerFormat();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtContainerFormatIdentifier", optional=true)
        public static native CFString ExtContainerFormatIdentifier();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtContainerFormatName", optional=true)
        public static native CFString ExtContainerFormatName();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtContributor", optional=true)
        public static native CFString ExtContributor();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtContributorIdentifier", optional=true)
        public static native CFString ExtContributorIdentifier();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtContributorName", optional=true)
        public static native CFString ExtContributorName();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtContributorRole", optional=true)
        public static native CFString ExtContributorRole();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtCopyrightYear", optional=true)
        public static native CFString ExtCopyrightYear();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtCreator", optional=true)
        public static native CFString ExtCreator();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtCreatorIdentifier", optional=true)
        public static native CFString ExtCreatorIdentifier();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtCreatorName", optional=true)
        public static native CFString ExtCreatorName();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtCreatorRole", optional=true)
        public static native CFString ExtCreatorRole();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtControlledVocabularyTerm", optional=true)
        public static native CFString ExtControlledVocabularyTerm();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtDataOnScreen", optional=true)
        public static native CFString ExtDataOnScreen();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtDataOnScreenRegion", optional=true)
        public static native CFString ExtDataOnScreenRegion();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtDataOnScreenRegionD", optional=true)
        public static native CFString ExtDataOnScreenRegionD();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtDataOnScreenRegionH", optional=true)
        public static native CFString ExtDataOnScreenRegionH();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtDataOnScreenRegionText", optional=true)
        public static native CFString ExtDataOnScreenRegionText();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtDataOnScreenRegionUnit", optional=true)
        public static native CFString ExtDataOnScreenRegionUnit();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtDataOnScreenRegionW", optional=true)
        public static native CFString ExtDataOnScreenRegionW();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtDataOnScreenRegionX", optional=true)
        public static native CFString ExtDataOnScreenRegionX();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtDataOnScreenRegionY", optional=true)
        public static native CFString ExtDataOnScreenRegionY();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtDigitalImageGUID", optional=true)
        public static native CFString ExtDigitalImageGUID();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtDigitalSourceFileType", optional=true)
        public static native CFString ExtDigitalSourceFileType();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtDigitalSourceType", optional=true)
        public static native CFString ExtDigitalSourceType();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtDopesheet", optional=true)
        public static native CFString ExtDopesheet();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtDopesheetLink", optional=true)
        public static native CFString ExtDopesheetLink();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtDopesheetLinkLink", optional=true)
        public static native CFString ExtDopesheetLinkLink();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtDopesheetLinkLinkQualifier", optional=true)
        public static native CFString ExtDopesheetLinkLinkQualifier();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtEmbdEncRightsExpr", optional=true)
        public static native CFString ExtEmbdEncRightsExpr();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtEmbeddedEncodedRightsExpr", optional=true)
        public static native CFString ExtEmbeddedEncodedRightsExpr();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtEmbeddedEncodedRightsExprType", optional=true)
        public static native CFString ExtEmbeddedEncodedRightsExprType();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtEmbeddedEncodedRightsExprLangID", optional=true)
        public static native CFString ExtEmbeddedEncodedRightsExprLangID();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtEpisode", optional=true)
        public static native CFString ExtEpisode();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtEpisodeIdentifier", optional=true)
        public static native CFString ExtEpisodeIdentifier();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtEpisodeName", optional=true)
        public static native CFString ExtEpisodeName();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtEpisodeNumber", optional=true)
        public static native CFString ExtEpisodeNumber();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtEvent", optional=true)
        public static native CFString ExtEvent();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtShownEvent", optional=true)
        public static native CFString ExtShownEvent();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtShownEventIdentifier", optional=true)
        public static native CFString ExtShownEventIdentifier();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtShownEventName", optional=true)
        public static native CFString ExtShownEventName();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtExternalMetadataLink", optional=true)
        public static native CFString ExtExternalMetadataLink();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtFeedIdentifier", optional=true)
        public static native CFString ExtFeedIdentifier();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtGenre", optional=true)
        public static native CFString ExtGenre();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtGenreCvId", optional=true)
        public static native CFString ExtGenreCvId();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtGenreCvTermId", optional=true)
        public static native CFString ExtGenreCvTermId();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtGenreCvTermName", optional=true)
        public static native CFString ExtGenreCvTermName();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtGenreCvTermRefinedAbout", optional=true)
        public static native CFString ExtGenreCvTermRefinedAbout();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtHeadline", optional=true)
        public static native CFString ExtHeadline();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtIPTCLastEdited", optional=true)
        public static native CFString ExtIPTCLastEdited();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtLinkedEncRightsExpr", optional=true)
        public static native CFString ExtLinkedEncRightsExpr();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtLinkedEncodedRightsExpr", optional=true)
        public static native CFString ExtLinkedEncodedRightsExpr();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtLinkedEncodedRightsExprType", optional=true)
        public static native CFString ExtLinkedEncodedRightsExprType();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtLinkedEncodedRightsExprLangID", optional=true)
        public static native CFString ExtLinkedEncodedRightsExprLangID();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtLocationCreated", optional=true)
        public static native CFString ExtLocationCreated();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtLocationCity", optional=true)
        public static native CFString ExtLocationCity();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtLocationCountryCode", optional=true)
        public static native CFString ExtLocationCountryCode();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtLocationCountryName", optional=true)
        public static native CFString ExtLocationCountryName();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtLocationGPSAltitude", optional=true)
        public static native CFString ExtLocationGPSAltitude();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtLocationGPSLatitude", optional=true)
        public static native CFString ExtLocationGPSLatitude();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtLocationGPSLongitude", optional=true)
        public static native CFString ExtLocationGPSLongitude();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtLocationIdentifier", optional=true)
        public static native CFString ExtLocationIdentifier();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtLocationLocationId", optional=true)
        public static native CFString ExtLocationLocationId();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtLocationLocationName", optional=true)
        public static native CFString ExtLocationLocationName();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtLocationProvinceState", optional=true)
        public static native CFString ExtLocationProvinceState();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtLocationSublocation", optional=true)
        public static native CFString ExtLocationSublocation();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtLocationWorldRegion", optional=true)
        public static native CFString ExtLocationWorldRegion();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtLocationShown", optional=true)
        public static native CFString ExtLocationShown();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtMaxAvailHeight", optional=true)
        public static native CFString ExtMaxAvailHeight();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtMaxAvailWidth", optional=true)
        public static native CFString ExtMaxAvailWidth();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtModelAge", optional=true)
        public static native CFString ExtModelAge();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtOrganisationInImageCode", optional=true)
        public static native CFString ExtOrganisationInImageCode();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtOrganisationInImageName", optional=true)
        public static native CFString ExtOrganisationInImageName();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtPersonHeard", optional=true)
        public static native CFString ExtPersonHeard();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtPersonHeardIdentifier", optional=true)
        public static native CFString ExtPersonHeardIdentifier();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtPersonHeardName", optional=true)
        public static native CFString ExtPersonHeardName();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtPersonInImage", optional=true)
        public static native CFString ExtPersonInImage();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtPersonInImageWDetails", optional=true)
        public static native CFString ExtPersonInImageWDetails();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtPersonInImageCharacteristic", optional=true)
        public static native CFString ExtPersonInImageCharacteristic();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtPersonInImageCvTermCvId", optional=true)
        public static native CFString ExtPersonInImageCvTermCvId();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtPersonInImageCvTermId", optional=true)
        public static native CFString ExtPersonInImageCvTermId();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtPersonInImageCvTermName", optional=true)
        public static native CFString ExtPersonInImageCvTermName();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtPersonInImageCvTermRefinedAbout", optional=true)
        public static native CFString ExtPersonInImageCvTermRefinedAbout();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtPersonInImageDescription", optional=true)
        public static native CFString ExtPersonInImageDescription();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtPersonInImageId", optional=true)
        public static native CFString ExtPersonInImageId();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtPersonInImageName", optional=true)
        public static native CFString ExtPersonInImageName();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtProductInImage", optional=true)
        public static native CFString ExtProductInImage();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtProductInImageDescription", optional=true)
        public static native CFString ExtProductInImageDescription();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtProductInImageGTIN", optional=true)
        public static native CFString ExtProductInImageGTIN();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtProductInImageName", optional=true)
        public static native CFString ExtProductInImageName();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtPublicationEvent", optional=true)
        public static native CFString ExtPublicationEvent();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtPublicationEventDate", optional=true)
        public static native CFString ExtPublicationEventDate();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtPublicationEventIdentifier", optional=true)
        public static native CFString ExtPublicationEventIdentifier();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtPublicationEventName", optional=true)
        public static native CFString ExtPublicationEventName();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtRating", optional=true)
        public static native CFString ExtRating();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtRatingRatingRegion", optional=true)
        public static native CFString ExtRatingRatingRegion();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtRatingRegionCity", optional=true)
        public static native CFString ExtRatingRegionCity();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtRatingRegionCountryCode", optional=true)
        public static native CFString ExtRatingRegionCountryCode();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtRatingRegionCountryName", optional=true)
        public static native CFString ExtRatingRegionCountryName();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtRatingRegionGPSAltitude", optional=true)
        public static native CFString ExtRatingRegionGPSAltitude();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtRatingRegionGPSLatitude", optional=true)
        public static native CFString ExtRatingRegionGPSLatitude();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtRatingRegionGPSLongitude", optional=true)
        public static native CFString ExtRatingRegionGPSLongitude();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtRatingRegionIdentifier", optional=true)
        public static native CFString ExtRatingRegionIdentifier();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtRatingRegionLocationId", optional=true)
        public static native CFString ExtRatingRegionLocationId();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtRatingRegionLocationName", optional=true)
        public static native CFString ExtRatingRegionLocationName();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtRatingRegionProvinceState", optional=true)
        public static native CFString ExtRatingRegionProvinceState();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtRatingRegionSublocation", optional=true)
        public static native CFString ExtRatingRegionSublocation();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtRatingRegionWorldRegion", optional=true)
        public static native CFString ExtRatingRegionWorldRegion();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtRatingScaleMaxValue", optional=true)
        public static native CFString ExtRatingScaleMaxValue();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtRatingScaleMinValue", optional=true)
        public static native CFString ExtRatingScaleMinValue();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtRatingSourceLink", optional=true)
        public static native CFString ExtRatingSourceLink();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtRatingValue", optional=true)
        public static native CFString ExtRatingValue();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtRatingValueLogoLink", optional=true)
        public static native CFString ExtRatingValueLogoLink();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtRegistryID", optional=true)
        public static native CFString ExtRegistryID();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtRegistryEntryRole", optional=true)
        public static native CFString ExtRegistryEntryRole();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtRegistryItemID", optional=true)
        public static native CFString ExtRegistryItemID();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtRegistryOrganisationID", optional=true)
        public static native CFString ExtRegistryOrganisationID();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtReleaseReady", optional=true)
        public static native CFString ExtReleaseReady();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtSeason", optional=true)
        public static native CFString ExtSeason();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtSeasonIdentifier", optional=true)
        public static native CFString ExtSeasonIdentifier();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtSeasonName", optional=true)
        public static native CFString ExtSeasonName();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtSeasonNumber", optional=true)
        public static native CFString ExtSeasonNumber();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtSeries", optional=true)
        public static native CFString ExtSeries();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtSeriesIdentifier", optional=true)
        public static native CFString ExtSeriesIdentifier();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtSeriesName", optional=true)
        public static native CFString ExtSeriesName();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtStorylineIdentifier", optional=true)
        public static native CFString ExtStorylineIdentifier();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtStreamReady", optional=true)
        public static native CFString ExtStreamReady();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtStylePeriod", optional=true)
        public static native CFString ExtStylePeriod();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtSupplyChainSource", optional=true)
        public static native CFString ExtSupplyChainSource();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtSupplyChainSourceIdentifier", optional=true)
        public static native CFString ExtSupplyChainSourceIdentifier();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtSupplyChainSourceName", optional=true)
        public static native CFString ExtSupplyChainSourceName();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtTemporalCoverage", optional=true)
        public static native CFString ExtTemporalCoverage();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtTemporalCoverageFrom", optional=true)
        public static native CFString ExtTemporalCoverageFrom();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtTemporalCoverageTo", optional=true)
        public static native CFString ExtTemporalCoverageTo();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtTranscript", optional=true)
        public static native CFString ExtTranscript();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtTranscriptLink", optional=true)
        public static native CFString ExtTranscriptLink();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtTranscriptLinkLink", optional=true)
        public static native CFString ExtTranscriptLinkLink();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtTranscriptLinkLinkQualifier", optional=true)
        public static native CFString ExtTranscriptLinkLinkQualifier();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtVideoBitrate", optional=true)
        public static native CFString ExtVideoBitrate();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtVideoBitrateMode", optional=true)
        public static native CFString ExtVideoBitrateMode();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtVideoDisplayAspectRatio", optional=true)
        public static native CFString ExtVideoDisplayAspectRatio();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtVideoEncodingProfile", optional=true)
        public static native CFString ExtVideoEncodingProfile();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtVideoShotType", optional=true)
        public static native CFString ExtVideoShotType();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtVideoShotTypeIdentifier", optional=true)
        public static native CFString ExtVideoShotTypeIdentifier();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtVideoShotTypeName", optional=true)
        public static native CFString ExtVideoShotTypeName();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtVideoStreamsCount", optional=true)
        public static native CFString ExtVideoStreamsCount();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtVisualColor", optional=true)
        public static native CFString ExtVisualColor();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtWorkflowTag", optional=true)
        public static native CFString ExtWorkflowTag();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtWorkflowTagCvId", optional=true)
        public static native CFString ExtWorkflowTagCvId();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtWorkflowTagCvTermId", optional=true)
        public static native CFString ExtWorkflowTagCvTermId();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtWorkflowTagCvTermName", optional=true)
        public static native CFString ExtWorkflowTagCvTermName();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyIPTCExtWorkflowTagCvTermRefinedAbout", optional=true)
        public static native CFString ExtWorkflowTagCvTermRefinedAbout();
        /*</values>*/
    }
}
