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
package org.robovm.apple.sensorkit;

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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SensorKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SRKeyboardMetrics/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SRKeyboardMetricsPtr extends Ptr<SRKeyboardMetrics, SRKeyboardMetricsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SRKeyboardMetrics.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SRKeyboardMetrics() {}
    protected SRKeyboardMetrics(Handle h, long handle) { super(h, handle); }
    protected SRKeyboardMetrics(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "duration")
    public native double getDuration();
    @Property(selector = "keyboardIdentifier")
    public native String getKeyboardIdentifier();
    @Property(selector = "version")
    public native String getVersion();
    @Property(selector = "width")
    public native NSMeasurement<NSUnitLength> getWidth();
    @Property(selector = "height")
    public native NSMeasurement<NSUnitLength> getHeight();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "inputModes")
    public native NSArray<NSString> getInputModes();
    @Property(selector = "totalWords")
    public native @MachineSizedSInt long getTotalWords();
    @Property(selector = "totalAlteredWords")
    public native @MachineSizedSInt long getTotalAlteredWords();
    @Property(selector = "totalTaps")
    public native @MachineSizedSInt long getTotalTaps();
    @Property(selector = "totalDrags")
    public native @MachineSizedSInt long getTotalDrags();
    @Property(selector = "totalDeletes")
    public native @MachineSizedSInt long getTotalDeletes();
    @Property(selector = "totalEmojis")
    public native @MachineSizedSInt long getTotalEmojis();
    @Property(selector = "totalPaths")
    public native @MachineSizedSInt long getTotalPaths();
    @Property(selector = "totalPathTime")
    public native double getTotalPathTime();
    @Property(selector = "totalPathLength")
    public native NSMeasurement<NSUnitLength> getTotalPathLength();
    @Property(selector = "totalAutoCorrections")
    public native @MachineSizedSInt long getTotalAutoCorrections();
    @Property(selector = "totalSpaceCorrections")
    public native @MachineSizedSInt long getTotalSpaceCorrections();
    @Property(selector = "totalRetroCorrections")
    public native @MachineSizedSInt long getTotalRetroCorrections();
    @Property(selector = "totalTranspositionCorrections")
    public native @MachineSizedSInt long getTotalTranspositionCorrections();
    @Property(selector = "totalInsertKeyCorrections")
    public native @MachineSizedSInt long getTotalInsertKeyCorrections();
    @Property(selector = "totalSkipTouchCorrections")
    public native @MachineSizedSInt long getTotalSkipTouchCorrections();
    @Property(selector = "totalNearKeyCorrections")
    public native @MachineSizedSInt long getTotalNearKeyCorrections();
    @Property(selector = "totalSubstitutionCorrections")
    public native @MachineSizedSInt long getTotalSubstitutionCorrections();
    @Property(selector = "totalHitTestCorrections")
    public native @MachineSizedSInt long getTotalHitTestCorrections();
    @Property(selector = "totalTypingDuration")
    public native double getTotalTypingDuration();
    @Property(selector = "upErrorDistance")
    public native SRKeyboardProbabilityMetric<NSUnitLength> getUpErrorDistance();
    @Property(selector = "downErrorDistance")
    public native SRKeyboardProbabilityMetric<NSUnitLength> getDownErrorDistance();
    @Property(selector = "spaceUpErrorDistance")
    public native SRKeyboardProbabilityMetric<NSUnitLength> getSpaceUpErrorDistance();
    @Property(selector = "spaceDownErrorDistance")
    public native SRKeyboardProbabilityMetric<NSUnitLength> getSpaceDownErrorDistance();
    @Property(selector = "deleteUpErrorDistance")
    public native SRKeyboardProbabilityMetric<NSUnitLength> getDeleteUpErrorDistance();
    @Property(selector = "deleteDownErrorDistance")
    public native SRKeyboardProbabilityMetric<NSUnitLength> getDeleteDownErrorDistance();
    @Property(selector = "shortWordCharKeyUpErrorDistance")
    public native SRKeyboardProbabilityMetric<NSUnitLength> getShortWordCharKeyUpErrorDistance();
    @Property(selector = "shortWordCharKeyDownErrorDistance")
    public native SRKeyboardProbabilityMetric<NSUnitLength> getShortWordCharKeyDownErrorDistance();
    @Property(selector = "touchDownUp")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getTouchDownUp();
    @Property(selector = "spaceTouchDownUp")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getSpaceTouchDownUp();
    @Property(selector = "deleteTouchDownUp")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getDeleteTouchDownUp();
    @Property(selector = "shortWordCharKeyTouchDownUp")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getShortWordCharKeyTouchDownUp();
    @Property(selector = "touchDownDown")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getTouchDownDown();
    @Property(selector = "charKeyToPrediction")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getCharKeyToPrediction();
    @Property(selector = "shortWordCharKeyToCharKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getShortWordCharKeyToCharKey();
    @Property(selector = "charKeyToAnyTapKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getCharKeyToAnyTapKey();
    @Property(selector = "anyTapToCharKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getAnyTapToCharKey();
    @Property(selector = "spaceToCharKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getSpaceToCharKey();
    @Property(selector = "charKeyToSpaceKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getCharKeyToSpaceKey();
    @Property(selector = "spaceToDeleteKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getSpaceToDeleteKey();
    @Property(selector = "deleteToSpaceKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getDeleteToSpaceKey();
    @Property(selector = "spaceToSpaceKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getSpaceToSpaceKey();
    @Property(selector = "spaceToShiftKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getSpaceToShiftKey();
    @Property(selector = "spaceToPlaneChangeKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getSpaceToPlaneChangeKey();
    @Property(selector = "spaceToPredictionKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getSpaceToPredictionKey();
    @Property(selector = "deleteToCharKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getDeleteToCharKey();
    @Property(selector = "charKeyToDelete")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getCharKeyToDelete();
    @Property(selector = "deleteToDelete")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getDeleteToDelete();
    @Property(selector = "deleteToShiftKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getDeleteToShiftKey();
    @Property(selector = "deleteToPlaneChangeKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getDeleteToPlaneChangeKey();
    @Property(selector = "anyTapToPlaneChangeKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getAnyTapToPlaneChangeKey();
    @Property(selector = "planeChangeToAnyTap")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getPlaneChangeToAnyTap();
    @Property(selector = "charKeyToPlaneChangeKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getCharKeyToPlaneChangeKey();
    @Property(selector = "planeChangeKeyToCharKey")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getPlaneChangeKeyToCharKey();
    @Property(selector = "pathErrorDistanceRatio")
    public native NSArray<NSNumber> getPathErrorDistanceRatio();
    @Property(selector = "deleteToPath")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getDeleteToPath();
    @Property(selector = "pathToDelete")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getPathToDelete();
    @Property(selector = "spaceToPath")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getSpaceToPath();
    @Property(selector = "pathToSpace")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getPathToSpace();
    @Property(selector = "pathToPath")
    public native SRKeyboardProbabilityMetric<NSUnitDuration> getPathToPath();
    @Property(selector = "longWordUpErrorDistance")
    public native NSArray<?> getLongWordUpErrorDistance();
    @Property(selector = "longWordDownErrorDistance")
    public native NSArray<?> getLongWordDownErrorDistance();
    @Property(selector = "longWordTouchDownUp")
    public native NSArray<?> getLongWordTouchDownUp();
    @Property(selector = "longWordTouchDownDown")
    public native NSArray<?> getLongWordTouchDownDown();
    @Property(selector = "deleteToDeletes")
    public native NSArray<?> getDeleteToDeletes();
    @Property(selector = "totalPauses")
    public native @MachineSizedSInt long getTotalPauses();
    @Property(selector = "totalPathPauses")
    public native @MachineSizedSInt long getTotalPathPauses();
    @Property(selector = "typingSpeed")
    public native double getTypingSpeed();
    @Property(selector = "pathTypingSpeed")
    public native double getPathTypingSpeed();
    @Property(selector = "totalTypingEpisodes")
    public native @MachineSizedSInt long getTotalTypingEpisodes();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "wordCountForSentimentCategory:")
    public native @MachineSizedSInt long wordCountForSentimentCategory(SRKeyboardMetricsSentimentCategory category);
    @Method(selector = "emojiCountForSentimentCategory:")
    public native @MachineSizedSInt long emojiCountForSentimentCategory(SRKeyboardMetricsSentimentCategory category);
    /*</methods>*/
}
