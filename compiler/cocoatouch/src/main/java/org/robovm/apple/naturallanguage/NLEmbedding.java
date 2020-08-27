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
package org.robovm.apple.naturallanguage;

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
import org.robovm.apple.coreml.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NaturalLanguage") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NLEmbedding/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NLEmbeddingPtr extends Ptr<NLEmbedding, NLEmbeddingPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NLEmbedding.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NLEmbedding() {}
    protected NLEmbedding(Handle h, long handle) { super(h, handle); }
    protected NLEmbedding(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public NLEmbedding(NLLanguage language, @MachineSizedUInt long revision) { super((Handle) null, create(language, revision)); retain(getHandle()); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public NLEmbedding(NSURL url) throws NSErrorException {
       this(url, new NSError.NSErrorPtr());
    }
    private NLEmbedding(NSURL url, NSError.NSErrorPtr ptr) throws NSErrorException {
       super((Handle) null, create(url, ptr));
       retain(getHandle());
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public NLEmbedding(NSDictionary<?, ?> dictionary, NLLanguage language, @MachineSizedUInt long revision, NSURL url) throws NSErrorException {
       this(dictionary, language, revision, url, new NSError.NSErrorPtr());
    }
    private NLEmbedding(NSDictionary<?, ?> dictionary, NLLanguage language, @MachineSizedUInt long revision, NSURL url, NSError.NSErrorPtr ptr) throws NSErrorException {
       super((Handle) null, create(dictionary, language, revision, url, ptr));
       retain(getHandle());
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
    }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "dimension")
    public native @MachineSizedUInt long getDimension();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "vocabularySize")
    public native @MachineSizedUInt long getVocabularySize();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "language")
    public native NLLanguage getLanguage();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "revision")
    public native @MachineSizedUInt long getRevision();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "containsString:")
    public native boolean containsString(String string);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "distanceBetweenString:andString:distanceType:")
    public native double getDistance(String firstString, String secondString, NLDistanceType distanceType);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "enumerateNeighborsForString:maximumCount:distanceType:usingBlock:")
    public native void enumerateNeighbors(String string, @MachineSizedUInt long maxCount, NLDistanceType distanceType, @Block VoidBlock3<NSString, Double, BooleanPtr> block);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "enumerateNeighborsForString:maximumCount:maximumDistance:distanceType:usingBlock:")
    public native void enumerateNeighbors(String string, @MachineSizedUInt long maxCount, double maxDistance, NLDistanceType distanceType, @Block VoidBlock3<NSString, Double, BooleanPtr> block);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "neighborsForString:maximumCount:distanceType:")
    public native NSArray<NSString> getNeighborsForString(String string, @MachineSizedUInt long maxCount, NLDistanceType distanceType);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "neighborsForString:maximumCount:maximumDistance:distanceType:")
    public native NSArray<NSString> getNeighborsForString(String string, @MachineSizedUInt long maxCount, double maxDistance, NLDistanceType distanceType);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "vectorForString:")
    public native NSArray<NSNumber> vectorForString(String string);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "getVector:forString:")
    public native boolean getVector(FloatPtr vector, String string);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "enumerateNeighborsForVector:maximumCount:distanceType:usingBlock:")
    public native void enumerateNeighbors(NSArray<NSNumber> vector, @MachineSizedUInt long maxCount, NLDistanceType distanceType, @Block VoidBlock3<NSString, Double, BooleanPtr> block);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "enumerateNeighborsForVector:maximumCount:maximumDistance:distanceType:usingBlock:")
    public native void enumerateNeighbors(NSArray<NSNumber> vector, @MachineSizedUInt long maxCount, double maxDistance, NLDistanceType distanceType, @Block VoidBlock3<NSString, Double, BooleanPtr> block);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "neighborsForVector:maximumCount:distanceType:")
    public native NSArray<NSString> getNeighbors(NSArray<NSNumber> vector, @MachineSizedUInt long maxCount, NLDistanceType distanceType);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "neighborsForVector:maximumCount:maximumDistance:distanceType:")
    public native NSArray<NSString> getNeighbors(NSArray<NSNumber> vector, @MachineSizedUInt long maxCount, double maxDistance, NLDistanceType distanceType);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "wordEmbeddingForLanguage:")
    public static native NLEmbedding wordEmbeddingForLanguage(NLLanguage language);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "wordEmbeddingForLanguage:revision:")
    public static native NLEmbedding getWordEmbedding(NLLanguage language, @MachineSizedUInt long revision);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "sentenceEmbeddingForLanguage:")
    public static native NLEmbedding sentenceEmbeddingForLanguage(NLLanguage language);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "sentenceEmbeddingForLanguage:revision:")
    protected static native @Pointer long create(NLLanguage language, @MachineSizedUInt long revision);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "embeddingWithContentsOfURL:error:")
    protected static native @Pointer long create(NSURL url, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "supportedRevisionsForLanguage:")
    public static native NSIndexSet supportedRevisionsForLanguage(NLLanguage language);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "currentRevisionForLanguage:")
    public static native @MachineSizedUInt long currentRevisionForLanguage(NLLanguage language);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "supportedSentenceEmbeddingRevisionsForLanguage:")
    public static native NSIndexSet supportedSentenceEmbeddingRevisionsForLanguage(NLLanguage language);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "currentSentenceEmbeddingRevisionForLanguage:")
    public static native @MachineSizedUInt long currentSentenceEmbeddingRevisionForLanguage(NLLanguage language);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "writeEmbeddingForDictionary:language:revision:toURL:error:")
    protected static native @Pointer long create(NSDictionary<?, ?> dictionary, NLLanguage language, @MachineSizedUInt long revision, NSURL url, NSError.NSErrorPtr error);
    /*</methods>*/
}
