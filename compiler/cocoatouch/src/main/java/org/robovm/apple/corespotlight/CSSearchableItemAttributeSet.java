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
package org.robovm.apple.corespotlight;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreSpotlight") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CSSearchableItemAttributeSet/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CSSearchableItemAttributeSetPtr extends Ptr<CSSearchableItemAttributeSet, CSSearchableItemAttributeSetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CSSearchableItemAttributeSet.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CSSearchableItemAttributeSet() {}
    protected CSSearchableItemAttributeSet(Handle h, long handle) { super(h, handle); }
    protected CSSearchableItemAttributeSet(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithItemContentType:")
    public CSSearchableItemAttributeSet(String itemContentType) { super((SkipInit) null); initObject(init(itemContentType)); }
    @Method(selector = "initWithCoder:")
    public CSSearchableItemAttributeSet(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "displayName")
    public native String getDisplayName();
    @Property(selector = "setDisplayName:")
    public native void setDisplayName(String v);
    @Property(selector = "alternateNames")
    public native NSArray<NSString> getAlternateNames();
    @Property(selector = "setAlternateNames:")
    public native void setAlternateNames(NSArray<NSString> v);
    @Property(selector = "path")
    public native String getPath();
    @Property(selector = "setPath:")
    public native void setPath(String v);
    @Property(selector = "contentURL")
    public native NSURL getContentURL();
    @Property(selector = "setContentURL:")
    public native void setContentURL(NSURL v);
    @Property(selector = "thumbnailURL")
    public native NSURL getThumbnailURL();
    @Property(selector = "setThumbnailURL:")
    public native void setThumbnailURL(NSURL v);
    @Property(selector = "thumbnailData")
    public native NSData getThumbnailData();
    @Property(selector = "setThumbnailData:")
    public native void setThumbnailData(NSData v);
    @Property(selector = "relatedUniqueIdentifier")
    public native String getRelatedUniqueIdentifier();
    @Property(selector = "setRelatedUniqueIdentifier:")
    public native void setRelatedUniqueIdentifier(String v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "weakRelatedUniqueIdentifier")
    public native String getWeakRelatedUniqueIdentifier();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setWeakRelatedUniqueIdentifier:")
    public native void setWeakRelatedUniqueIdentifier(String v);
    @Property(selector = "metadataModificationDate")
    public native NSDate getMetadataModificationDate();
    @Property(selector = "setMetadataModificationDate:")
    public native void setMetadataModificationDate(NSDate v);
    @Property(selector = "contentType")
    public native String getContentType();
    @Property(selector = "setContentType:")
    public native void setContentType(String v);
    @Property(selector = "contentTypeTree")
    public native NSArray<NSString> getContentTypeTree();
    @Property(selector = "setContentTypeTree:")
    public native void setContentTypeTree(NSArray<NSString> v);
    @Property(selector = "keywords")
    public native NSArray<NSString> getKeywords();
    @Property(selector = "setKeywords:")
    public native void setKeywords(NSArray<NSString> v);
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "version")
    public native String getVersion();
    @Property(selector = "setVersion:")
    public native void setVersion(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isUserCreated")
    public native NSNumber getUserCreated();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setUserCreated:")
    public native void setUserCreated(NSNumber v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isUserOwned")
    public native NSNumber getUserOwned();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setUserOwned:")
    public native void setUserOwned(NSNumber v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isUserCurated")
    public native NSNumber getUserCurated();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setUserCurated:")
    public native void setUserCurated(NSNumber v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "rankingHint")
    public native NSNumber getRankingHint();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setRankingHint:")
    public native void setRankingHint(NSNumber v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "domainIdentifier")
    public native String getDomainIdentifier();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setDomainIdentifier:")
    public native void setDomainIdentifier(String v);
    @Property(selector = "supportsPhoneCall")
    public native NSNumber getSupportsPhoneCall();
    @Property(selector = "setSupportsPhoneCall:")
    public native void setSupportsPhoneCall(NSNumber v);
    @Property(selector = "supportsNavigation")
    public native NSNumber getSupportsNavigation();
    @Property(selector = "setSupportsNavigation:")
    public native void setSupportsNavigation(NSNumber v);
    @Property(selector = "containerTitle")
    public native String getContainerTitle();
    @Property(selector = "setContainerTitle:")
    public native void setContainerTitle(String v);
    @Property(selector = "containerDisplayName")
    public native String getContainerDisplayName();
    @Property(selector = "setContainerDisplayName:")
    public native void setContainerDisplayName(String v);
    @Property(selector = "containerIdentifier")
    public native String getContainerIdentifier();
    @Property(selector = "setContainerIdentifier:")
    public native void setContainerIdentifier(String v);
    @Property(selector = "containerOrder")
    public native NSNumber getContainerOrder();
    @Property(selector = "setContainerOrder:")
    public native void setContainerOrder(NSNumber v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "providerDataTypeIdentifiers")
    public native NSArray<NSString> getProviderDataTypeIdentifiers();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setProviderDataTypeIdentifiers:")
    public native void setProviderDataTypeIdentifiers(NSArray<NSString> v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "providerFileTypeIdentifiers")
    public native NSArray<NSString> getProviderFileTypeIdentifiers();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setProviderFileTypeIdentifiers:")
    public native void setProviderFileTypeIdentifiers(NSArray<NSString> v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "providerInPlaceFileTypeIdentifiers")
    public native NSArray<NSString> getProviderInPlaceFileTypeIdentifiers();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setProviderInPlaceFileTypeIdentifiers:")
    public native void setProviderInPlaceFileTypeIdentifiers(NSArray<NSString> v);
    @Property(selector = "subject")
    public native String getSubject();
    @Property(selector = "setSubject:")
    public native void setSubject(String v);
    @Property(selector = "theme")
    public native String getTheme();
    @Property(selector = "setTheme:")
    public native void setTheme(String v);
    @Property(selector = "contentDescription")
    public native String getContentDescription();
    @Property(selector = "setContentDescription:")
    public native void setContentDescription(String v);
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "setIdentifier:")
    public native void setIdentifier(String v);
    @Property(selector = "audiences")
    public native NSArray<NSString> getAudiences();
    @Property(selector = "setAudiences:")
    public native void setAudiences(NSArray<NSString> v);
    @Property(selector = "fileSize")
    public native NSNumber getFileSize();
    @Property(selector = "setFileSize:")
    public native void setFileSize(NSNumber v);
    @Property(selector = "pageCount")
    public native NSNumber getPageCount();
    @Property(selector = "setPageCount:")
    public native void setPageCount(NSNumber v);
    @Property(selector = "pageWidth")
    public native NSNumber getPageWidth();
    @Property(selector = "setPageWidth:")
    public native void setPageWidth(NSNumber v);
    @Property(selector = "pageHeight")
    public native NSNumber getPageHeight();
    @Property(selector = "setPageHeight:")
    public native void setPageHeight(NSNumber v);
    @Property(selector = "securityMethod")
    public native String getSecurityMethod();
    @Property(selector = "setSecurityMethod:")
    public native void setSecurityMethod(String v);
    @Property(selector = "creator")
    public native String getCreator();
    @Property(selector = "setCreator:")
    public native void setCreator(String v);
    @Property(selector = "encodingApplications")
    public native NSArray<NSString> getEncodingApplications();
    @Property(selector = "setEncodingApplications:")
    public native void setEncodingApplications(NSArray<NSString> v);
    @Property(selector = "kind")
    public native String getKind();
    @Property(selector = "setKind:")
    public native void setKind(String v);
    @Property(selector = "fontNames")
    public native NSArray<NSString> getFontNames();
    @Property(selector = "setFontNames:")
    public native void setFontNames(NSArray<NSString> v);
    @Property(selector = "dueDate")
    public native NSDate getDueDate();
    @Property(selector = "setDueDate:")
    public native void setDueDate(NSDate v);
    @Property(selector = "completionDate")
    public native NSDate getCompletionDate();
    @Property(selector = "setCompletionDate:")
    public native void setCompletionDate(NSDate v);
    @Property(selector = "startDate")
    public native NSDate getStartDate();
    @Property(selector = "setStartDate:")
    public native void setStartDate(NSDate v);
    @Property(selector = "endDate")
    public native NSDate getEndDate();
    @Property(selector = "setEndDate:")
    public native void setEndDate(NSDate v);
    @Property(selector = "importantDates")
    public native NSArray<NSDate> getImportantDates();
    @Property(selector = "setImportantDates:")
    public native void setImportantDates(NSArray<NSDate> v);
    @Property(selector = "allDay")
    public native NSNumber getAllDay();
    @Property(selector = "setAllDay:")
    public native void setAllDay(NSNumber v);
    @Property(selector = "accountIdentifier")
    public native String getAccountIdentifier();
    @Property(selector = "setAccountIdentifier:")
    public native void setAccountIdentifier(String v);
    @Property(selector = "accountHandles")
    public native NSArray<NSString> getAccountHandles();
    @Property(selector = "setAccountHandles:")
    public native void setAccountHandles(NSArray<NSString> v);
    @Property(selector = "HTMLContentData")
    public native NSData getHTMLContentData();
    @Property(selector = "setHTMLContentData:")
    public native void setHTMLContentData(NSData v);
    @Property(selector = "textContent")
    public native String getTextContent();
    @Property(selector = "setTextContent:")
    public native void setTextContent(String v);
    @Property(selector = "authors")
    public native NSArray<CSPerson> getAuthors();
    @Property(selector = "setAuthors:")
    public native void setAuthors(NSArray<CSPerson> v);
    @Property(selector = "primaryRecipients")
    public native NSArray<CSPerson> getPrimaryRecipients();
    @Property(selector = "setPrimaryRecipients:")
    public native void setPrimaryRecipients(NSArray<CSPerson> v);
    @Property(selector = "additionalRecipients")
    public native NSArray<CSPerson> getAdditionalRecipients();
    @Property(selector = "setAdditionalRecipients:")
    public native void setAdditionalRecipients(NSArray<CSPerson> v);
    @Property(selector = "hiddenAdditionalRecipients")
    public native NSArray<CSPerson> getHiddenAdditionalRecipients();
    @Property(selector = "setHiddenAdditionalRecipients:")
    public native void setHiddenAdditionalRecipients(NSArray<CSPerson> v);
    @Property(selector = "emailHeaders")
    public native NSDictionary<NSString, NSArray> getEmailHeaders();
    @Property(selector = "setEmailHeaders:")
    public native void setEmailHeaders(NSDictionary<NSString, NSArray> v);
    @Property(selector = "mailboxIdentifiers")
    public native NSArray<NSString> getMailboxIdentifiers();
    @Property(selector = "setMailboxIdentifiers:")
    public native void setMailboxIdentifiers(NSArray<NSString> v);
    @Property(selector = "authorNames")
    public native NSArray<NSString> getAuthorNames();
    @Property(selector = "setAuthorNames:")
    public native void setAuthorNames(NSArray<NSString> v);
    @Property(selector = "recipientNames")
    public native NSArray<NSString> getRecipientNames();
    @Property(selector = "setRecipientNames:")
    public native void setRecipientNames(NSArray<NSString> v);
    @Property(selector = "authorEmailAddresses")
    public native NSArray<NSString> getAuthorEmailAddresses();
    @Property(selector = "setAuthorEmailAddresses:")
    public native void setAuthorEmailAddresses(NSArray<NSString> v);
    @Property(selector = "recipientEmailAddresses")
    public native NSArray<NSString> getRecipientEmailAddresses();
    @Property(selector = "setRecipientEmailAddresses:")
    public native void setRecipientEmailAddresses(NSArray<NSString> v);
    @Property(selector = "authorAddresses")
    public native NSArray<NSString> getAuthorAddresses();
    @Property(selector = "setAuthorAddresses:")
    public native void setAuthorAddresses(NSArray<NSString> v);
    @Property(selector = "recipientAddresses")
    public native NSArray<NSString> getRecipientAddresses();
    @Property(selector = "setRecipientAddresses:")
    public native void setRecipientAddresses(NSArray<NSString> v);
    @Property(selector = "phoneNumbers")
    public native NSArray<NSString> getPhoneNumbers();
    @Property(selector = "setPhoneNumbers:")
    public native void setPhoneNumbers(NSArray<NSString> v);
    @Property(selector = "emailAddresses")
    public native NSArray<NSString> getEmailAddresses();
    @Property(selector = "setEmailAddresses:")
    public native void setEmailAddresses(NSArray<NSString> v);
    @Property(selector = "instantMessageAddresses")
    public native NSArray<NSString> getInstantMessageAddresses();
    @Property(selector = "setInstantMessageAddresses:")
    public native void setInstantMessageAddresses(NSArray<NSString> v);
    @Property(selector = "isLikelyJunk")
    public native NSNumber getLikelyJunk();
    @Property(selector = "setLikelyJunk:")
    public native void setLikelyJunk(NSNumber v);
    @Property(selector = "editors")
    public native NSArray<NSString> getEditors();
    @Property(selector = "setEditors:")
    public native void setEditors(NSArray<NSString> v);
    @Property(selector = "participants")
    public native NSArray<NSString> getParticipants();
    @Property(selector = "setParticipants:")
    public native void setParticipants(NSArray<NSString> v);
    @Property(selector = "projects")
    public native NSArray<NSString> getProjects();
    @Property(selector = "setProjects:")
    public native void setProjects(NSArray<NSString> v);
    @Property(selector = "downloadedDate")
    public native NSDate getDownloadedDate();
    @Property(selector = "setDownloadedDate:")
    public native void setDownloadedDate(NSDate v);
    @Property(selector = "contentSources")
    public native NSArray<NSString> getContentSources();
    @Property(selector = "setContentSources:")
    public native void setContentSources(NSArray<NSString> v);
    @Property(selector = "comment")
    public native String getComment();
    @Property(selector = "setComment:")
    public native void setComment(String v);
    @Property(selector = "copyright")
    public native String getCopyright();
    @Property(selector = "setCopyright:")
    public native void setCopyright(String v);
    @Property(selector = "lastUsedDate")
    public native NSDate getLastUsedDate();
    @Property(selector = "setLastUsedDate:")
    public native void setLastUsedDate(NSDate v);
    @Property(selector = "contentCreationDate")
    public native NSDate getContentCreationDate();
    @Property(selector = "setContentCreationDate:")
    public native void setContentCreationDate(NSDate v);
    @Property(selector = "contentModificationDate")
    public native NSDate getContentModificationDate();
    @Property(selector = "setContentModificationDate:")
    public native void setContentModificationDate(NSDate v);
    @Property(selector = "addedDate")
    public native NSDate getAddedDate();
    @Property(selector = "setAddedDate:")
    public native void setAddedDate(NSDate v);
    @Property(selector = "duration")
    public native NSNumber getDuration();
    @Property(selector = "setDuration:")
    public native void setDuration(NSNumber v);
    @Property(selector = "contactKeywords")
    public native NSArray<NSString> getContactKeywords();
    @Property(selector = "setContactKeywords:")
    public native void setContactKeywords(NSArray<NSString> v);
    @Property(selector = "codecs")
    public native NSArray<NSString> getCodecs();
    @Property(selector = "setCodecs:")
    public native void setCodecs(NSArray<NSString> v);
    @Property(selector = "mediaTypes")
    public native NSArray<NSString> getMediaTypes();
    @Property(selector = "setMediaTypes:")
    public native void setMediaTypes(NSArray<NSString> v);
    @Property(selector = "isStreamable")
    public native NSNumber getStreamable();
    @Property(selector = "setStreamable:")
    public native void setStreamable(NSNumber v);
    @Property(selector = "totalBitRate")
    public native NSNumber getTotalBitRate();
    @Property(selector = "setTotalBitRate:")
    public native void setTotalBitRate(NSNumber v);
    @Property(selector = "videoBitRate")
    public native NSNumber getVideoBitRate();
    @Property(selector = "setVideoBitRate:")
    public native void setVideoBitRate(NSNumber v);
    @Property(selector = "audioBitRate")
    public native NSNumber getAudioBitRate();
    @Property(selector = "setAudioBitRate:")
    public native void setAudioBitRate(NSNumber v);
    @Property(selector = "deliveryType")
    public native NSNumber getDeliveryType();
    @Property(selector = "setDeliveryType:")
    public native void setDeliveryType(NSNumber v);
    @Property(selector = "organizations")
    public native NSArray<NSString> getOrganizations();
    @Property(selector = "setOrganizations:")
    public native void setOrganizations(NSArray<NSString> v);
    @Property(selector = "role")
    public native String getRole();
    @Property(selector = "setRole:")
    public native void setRole(String v);
    @Property(selector = "languages")
    public native NSArray<NSString> getLanguages();
    @Property(selector = "setLanguages:")
    public native void setLanguages(NSArray<NSString> v);
    @Property(selector = "rights")
    public native String getRights();
    @Property(selector = "setRights:")
    public native void setRights(String v);
    @Property(selector = "publishers")
    public native NSArray<NSString> getPublishers();
    @Property(selector = "setPublishers:")
    public native void setPublishers(NSArray<NSString> v);
    @Property(selector = "contributors")
    public native NSArray<NSString> getContributors();
    @Property(selector = "setContributors:")
    public native void setContributors(NSArray<NSString> v);
    @Property(selector = "coverage")
    public native NSArray<NSString> getCoverage();
    @Property(selector = "setCoverage:")
    public native void setCoverage(NSArray<NSString> v);
    @Property(selector = "rating")
    public native NSNumber getRating();
    @Property(selector = "setRating:")
    public native void setRating(NSNumber v);
    @Property(selector = "ratingDescription")
    public native String getRatingDescription();
    @Property(selector = "setRatingDescription:")
    public native void setRatingDescription(String v);
    @Property(selector = "playCount")
    public native NSNumber getPlayCount();
    @Property(selector = "setPlayCount:")
    public native void setPlayCount(NSNumber v);
    @Property(selector = "information")
    public native String getInformation();
    @Property(selector = "setInformation:")
    public native void setInformation(String v);
    @Property(selector = "director")
    public native String getDirector();
    @Property(selector = "setDirector:")
    public native void setDirector(String v);
    @Property(selector = "producer")
    public native String getProducer();
    @Property(selector = "setProducer:")
    public native void setProducer(String v);
    @Property(selector = "genre")
    public native String getGenre();
    @Property(selector = "setGenre:")
    public native void setGenre(String v);
    @Property(selector = "performers")
    public native NSArray<NSString> getPerformers();
    @Property(selector = "setPerformers:")
    public native void setPerformers(NSArray<NSString> v);
    @Property(selector = "originalFormat")
    public native String getOriginalFormat();
    @Property(selector = "setOriginalFormat:")
    public native void setOriginalFormat(String v);
    @Property(selector = "originalSource")
    public native String getOriginalSource();
    @Property(selector = "setOriginalSource:")
    public native void setOriginalSource(String v);
    @Property(selector = "isLocal")
    public native NSNumber getLocal();
    @Property(selector = "setLocal:")
    public native void setLocal(NSNumber v);
    @Property(selector = "contentRating")
    public native NSNumber getContentRating();
    @Property(selector = "setContentRating:")
    public native void setContentRating(NSNumber v);
    @Property(selector = "URL")
    public native NSURL getURL();
    @Property(selector = "setURL:")
    public native void setURL(NSURL v);
    @Property(selector = "audioSampleRate")
    public native NSNumber getAudioSampleRate();
    @Property(selector = "setAudioSampleRate:")
    public native void setAudioSampleRate(NSNumber v);
    @Property(selector = "audioChannelCount")
    public native NSNumber getAudioChannelCount();
    @Property(selector = "setAudioChannelCount:")
    public native void setAudioChannelCount(NSNumber v);
    @Property(selector = "tempo")
    public native NSNumber getTempo();
    @Property(selector = "setTempo:")
    public native void setTempo(NSNumber v);
    @Property(selector = "keySignature")
    public native String getKeySignature();
    @Property(selector = "setKeySignature:")
    public native void setKeySignature(String v);
    @Property(selector = "timeSignature")
    public native String getTimeSignature();
    @Property(selector = "setTimeSignature:")
    public native void setTimeSignature(String v);
    @Property(selector = "audioEncodingApplication")
    public native String getAudioEncodingApplication();
    @Property(selector = "setAudioEncodingApplication:")
    public native void setAudioEncodingApplication(String v);
    @Property(selector = "composer")
    public native String getComposer();
    @Property(selector = "setComposer:")
    public native void setComposer(String v);
    @Property(selector = "lyricist")
    public native String getLyricist();
    @Property(selector = "setLyricist:")
    public native void setLyricist(String v);
    @Property(selector = "album")
    public native String getAlbum();
    @Property(selector = "setAlbum:")
    public native void setAlbum(String v);
    @Property(selector = "artist")
    public native String getArtist();
    @Property(selector = "setArtist:")
    public native void setArtist(String v);
    @Property(selector = "audioTrackNumber")
    public native NSNumber getAudioTrackNumber();
    @Property(selector = "setAudioTrackNumber:")
    public native void setAudioTrackNumber(NSNumber v);
    @Property(selector = "recordingDate")
    public native NSDate getRecordingDate();
    @Property(selector = "setRecordingDate:")
    public native void setRecordingDate(NSDate v);
    @Property(selector = "musicalGenre")
    public native String getMusicalGenre();
    @Property(selector = "setMusicalGenre:")
    public native void setMusicalGenre(String v);
    @Property(selector = "isGeneralMIDISequence")
    public native NSNumber getGeneralMIDISequence();
    @Property(selector = "setGeneralMIDISequence:")
    public native void setGeneralMIDISequence(NSNumber v);
    @Property(selector = "musicalInstrumentCategory")
    public native String getMusicalInstrumentCategory();
    @Property(selector = "setMusicalInstrumentCategory:")
    public native void setMusicalInstrumentCategory(String v);
    @Property(selector = "musicalInstrumentName")
    public native String getMusicalInstrumentName();
    @Property(selector = "setMusicalInstrumentName:")
    public native void setMusicalInstrumentName(String v);
    @Property(selector = "pixelHeight")
    public native NSNumber getPixelHeight();
    @Property(selector = "setPixelHeight:")
    public native void setPixelHeight(NSNumber v);
    @Property(selector = "pixelWidth")
    public native NSNumber getPixelWidth();
    @Property(selector = "setPixelWidth:")
    public native void setPixelWidth(NSNumber v);
    @Property(selector = "pixelCount")
    public native NSNumber getPixelCount();
    @Property(selector = "setPixelCount:")
    public native void setPixelCount(NSNumber v);
    @Property(selector = "colorSpace")
    public native String getColorSpace();
    @Property(selector = "setColorSpace:")
    public native void setColorSpace(String v);
    @Property(selector = "bitsPerSample")
    public native NSNumber getBitsPerSample();
    @Property(selector = "setBitsPerSample:")
    public native void setBitsPerSample(NSNumber v);
    @Property(selector = "isFlashOn")
    public native NSNumber getFlashOn();
    @Property(selector = "setFlashOn:")
    public native void setFlashOn(NSNumber v);
    @Property(selector = "focalLength")
    public native NSNumber getFocalLength();
    @Property(selector = "setFocalLength:")
    public native void setFocalLength(NSNumber v);
    @Property(selector = "isFocalLength35mm")
    public native NSNumber getFocalLength35mm();
    @Property(selector = "setFocalLength35mm:")
    public native void setFocalLength35mm(NSNumber v);
    @Property(selector = "acquisitionMake")
    public native String getAcquisitionMake();
    @Property(selector = "setAcquisitionMake:")
    public native void setAcquisitionMake(String v);
    @Property(selector = "acquisitionModel")
    public native String getAcquisitionModel();
    @Property(selector = "setAcquisitionModel:")
    public native void setAcquisitionModel(String v);
    @Property(selector = "cameraOwner")
    public native String getCameraOwner();
    @Property(selector = "setCameraOwner:")
    public native void setCameraOwner(String v);
    @Property(selector = "lensModel")
    public native String getLensModel();
    @Property(selector = "setLensModel:")
    public native void setLensModel(String v);
    @Property(selector = "ISOSpeed")
    public native NSNumber getISOSpeed();
    @Property(selector = "setISOSpeed:")
    public native void setISOSpeed(NSNumber v);
    @Property(selector = "orientation")
    public native NSNumber getOrientation();
    @Property(selector = "setOrientation:")
    public native void setOrientation(NSNumber v);
    @Property(selector = "layerNames")
    public native NSArray<NSString> getLayerNames();
    @Property(selector = "setLayerNames:")
    public native void setLayerNames(NSArray<NSString> v);
    @Property(selector = "whiteBalance")
    public native NSNumber getWhiteBalance();
    @Property(selector = "setWhiteBalance:")
    public native void setWhiteBalance(NSNumber v);
    @Property(selector = "aperture")
    public native NSNumber getAperture();
    @Property(selector = "setAperture:")
    public native void setAperture(NSNumber v);
    @Property(selector = "profileName")
    public native String getProfileName();
    @Property(selector = "setProfileName:")
    public native void setProfileName(String v);
    @Property(selector = "resolutionWidthDPI")
    public native NSNumber getResolutionWidthDPI();
    @Property(selector = "setResolutionWidthDPI:")
    public native void setResolutionWidthDPI(NSNumber v);
    @Property(selector = "resolutionHeightDPI")
    public native NSNumber getResolutionHeightDPI();
    @Property(selector = "setResolutionHeightDPI:")
    public native void setResolutionHeightDPI(NSNumber v);
    @Property(selector = "exposureMode")
    public native NSNumber getExposureMode();
    @Property(selector = "setExposureMode:")
    public native void setExposureMode(NSNumber v);
    @Property(selector = "exposureTime")
    public native NSNumber getExposureTime();
    @Property(selector = "setExposureTime:")
    public native void setExposureTime(NSNumber v);
    @Property(selector = "EXIFVersion")
    public native String getEXIFVersion();
    @Property(selector = "setEXIFVersion:")
    public native void setEXIFVersion(String v);
    @Property(selector = "EXIFGPSVersion")
    public native String getEXIFGPSVersion();
    @Property(selector = "setEXIFGPSVersion:")
    public native void setEXIFGPSVersion(String v);
    @Property(selector = "hasAlphaChannel")
    public native NSNumber getHasAlphaChannel();
    @Property(selector = "setHasAlphaChannel:")
    public native void setHasAlphaChannel(NSNumber v);
    @Property(selector = "isRedEyeOn")
    public native NSNumber getRedEyeOn();
    @Property(selector = "setRedEyeOn:")
    public native void setRedEyeOn(NSNumber v);
    @Property(selector = "meteringMode")
    public native String getMeteringMode();
    @Property(selector = "setMeteringMode:")
    public native void setMeteringMode(String v);
    @Property(selector = "maxAperture")
    public native NSNumber getMaxAperture();
    @Property(selector = "setMaxAperture:")
    public native void setMaxAperture(NSNumber v);
    @Property(selector = "fNumber")
    public native NSNumber getFNumber();
    @Property(selector = "setFNumber:")
    public native void setFNumber(NSNumber v);
    @Property(selector = "exposureProgram")
    public native String getExposureProgram();
    @Property(selector = "setExposureProgram:")
    public native void setExposureProgram(String v);
    @Property(selector = "exposureTimeString")
    public native String getExposureTimeString();
    @Property(selector = "setExposureTimeString:")
    public native void setExposureTimeString(String v);
    @Property(selector = "headline")
    public native String getHeadline();
    @Property(selector = "setHeadline:")
    public native void setHeadline(String v);
    @Property(selector = "instructions")
    public native String getInstructions();
    @Property(selector = "setInstructions:")
    public native void setInstructions(String v);
    @Property(selector = "thoroughfare")
    public native String getThoroughfare();
    @Property(selector = "setThoroughfare:")
    public native void setThoroughfare(String v);
    @Property(selector = "subThoroughfare")
    public native String getSubThoroughfare();
    @Property(selector = "setSubThoroughfare:")
    public native void setSubThoroughfare(String v);
    @Property(selector = "postalCode")
    public native String getPostalCode();
    @Property(selector = "setPostalCode:")
    public native void setPostalCode(String v);
    @Property(selector = "city")
    public native String getCity();
    @Property(selector = "setCity:")
    public native void setCity(String v);
    @Property(selector = "stateOrProvince")
    public native String getStateOrProvince();
    @Property(selector = "setStateOrProvince:")
    public native void setStateOrProvince(String v);
    @Property(selector = "country")
    public native String getCountry();
    @Property(selector = "setCountry:")
    public native void setCountry(String v);
    @Property(selector = "fullyFormattedAddress")
    public native String getFullyFormattedAddress();
    @Property(selector = "setFullyFormattedAddress:")
    public native void setFullyFormattedAddress(String v);
    @Property(selector = "altitude")
    public native NSNumber getAltitude();
    @Property(selector = "setAltitude:")
    public native void setAltitude(NSNumber v);
    @Property(selector = "latitude")
    public native NSNumber getLatitude();
    @Property(selector = "setLatitude:")
    public native void setLatitude(NSNumber v);
    @Property(selector = "longitude")
    public native NSNumber getLongitude();
    @Property(selector = "setLongitude:")
    public native void setLongitude(NSNumber v);
    @Property(selector = "speed")
    public native NSNumber getSpeed();
    @Property(selector = "setSpeed:")
    public native void setSpeed(NSNumber v);
    @Property(selector = "timestamp")
    public native NSDate getTimestamp();
    @Property(selector = "setTimestamp:")
    public native void setTimestamp(NSDate v);
    @Property(selector = "imageDirection")
    public native NSNumber getImageDirection();
    @Property(selector = "setImageDirection:")
    public native void setImageDirection(NSNumber v);
    @Property(selector = "namedLocation")
    public native String getNamedLocation();
    @Property(selector = "setNamedLocation:")
    public native void setNamedLocation(String v);
    @Property(selector = "GPSTrack")
    public native NSNumber getGPSTrack();
    @Property(selector = "setGPSTrack:")
    public native void setGPSTrack(NSNumber v);
    @Property(selector = "GPSStatus")
    public native String getGPSStatus();
    @Property(selector = "setGPSStatus:")
    public native void setGPSStatus(String v);
    @Property(selector = "GPSMeasureMode")
    public native String getGPSMeasureMode();
    @Property(selector = "setGPSMeasureMode:")
    public native void setGPSMeasureMode(String v);
    @Property(selector = "GPSDOP")
    public native NSNumber getGPSDOP();
    @Property(selector = "setGPSDOP:")
    public native void setGPSDOP(NSNumber v);
    @Property(selector = "GPSMapDatum")
    public native String getGPSMapDatum();
    @Property(selector = "setGPSMapDatum:")
    public native void setGPSMapDatum(String v);
    @Property(selector = "GPSDestLatitude")
    public native NSNumber getGPSDestLatitude();
    @Property(selector = "setGPSDestLatitude:")
    public native void setGPSDestLatitude(NSNumber v);
    @Property(selector = "GPSDestLongitude")
    public native NSNumber getGPSDestLongitude();
    @Property(selector = "setGPSDestLongitude:")
    public native void setGPSDestLongitude(NSNumber v);
    @Property(selector = "GPSDestBearing")
    public native NSNumber getGPSDestBearing();
    @Property(selector = "setGPSDestBearing:")
    public native void setGPSDestBearing(NSNumber v);
    @Property(selector = "GPSDestDistance")
    public native NSNumber getGPSDestDistance();
    @Property(selector = "setGPSDestDistance:")
    public native void setGPSDestDistance(NSNumber v);
    @Property(selector = "GPSProcessingMethod")
    public native String getGPSProcessingMethod();
    @Property(selector = "setGPSProcessingMethod:")
    public native void setGPSProcessingMethod(String v);
    @Property(selector = "GPSAreaInformation")
    public native String getGPSAreaInformation();
    @Property(selector = "setGPSAreaInformation:")
    public native void setGPSAreaInformation(String v);
    @Property(selector = "GPSDateStamp")
    public native NSDate getGPSDateStamp();
    @Property(selector = "setGPSDateStamp:")
    public native void setGPSDateStamp(NSDate v);
    @Property(selector = "GPSDifferental")
    public native NSNumber getGPSDifferental();
    @Property(selector = "setGPSDifferental:")
    public native void setGPSDifferental(NSNumber v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="CSMailboxInbox", optional=true)
    public static native String MailboxInbox();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="CSMailboxDrafts", optional=true)
    public static native String MailboxDrafts();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="CSMailboxSent", optional=true)
    public static native String MailboxSent();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="CSMailboxJunk", optional=true)
    public static native String MailboxJunk();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="CSMailboxTrash", optional=true)
    public static native String MailboxTrash();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="CSMailboxArchive", optional=true)
    public static native String MailboxArchive();
    
    @Method(selector = "initWithItemContentType:")
    protected native @Pointer long init(String itemContentType);
    @Method(selector = "setValue:forCustomKey:")
    public native void setValue(NSSecureCoding value, CSCustomAttributeKey key);
    @Method(selector = "valueForCustomKey:")
    public native NSSecureCoding valueForCustomKey(CSCustomAttributeKey key);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
