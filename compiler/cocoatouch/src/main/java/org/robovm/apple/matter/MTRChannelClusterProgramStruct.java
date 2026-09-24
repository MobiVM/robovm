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
package org.robovm.apple.matter;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRChannelClusterProgramStruct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRChannelClusterProgramStructPtr extends Ptr<MTRChannelClusterProgramStruct, MTRChannelClusterProgramStructPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRChannelClusterProgramStruct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRChannelClusterProgramStruct() {}
    protected MTRChannelClusterProgramStruct(Handle h, long handle) { super(h, handle); }
    protected MTRChannelClusterProgramStruct(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "identifier")
    public native String getIdentifier();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setIdentifier:")
    public native void setIdentifier(String v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "channel")
    public native MTRChannelClusterChannelInfoStruct getChannel();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setChannel:")
    public native void setChannel(MTRChannelClusterChannelInfoStruct v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "startTime")
    public native NSNumber getStartTime();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setStartTime:")
    public native void setStartTime(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "endTime")
    public native NSNumber getEndTime();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setEndTime:")
    public native void setEndTime(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "title")
    public native String getTitle();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "subtitle")
    public native String getSubtitle();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setSubtitle:")
    public native void setSubtitle(String v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "descriptionString")
    public native String getDescriptionString();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setDescriptionString:")
    public native void setDescriptionString(String v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "audioLanguages")
    public native NSArray<?> getAudioLanguages();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setAudioLanguages:")
    public native void setAudioLanguages(NSArray<?> v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "ratings")
    public native NSArray<?> getRatings();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setRatings:")
    public native void setRatings(NSArray<?> v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "releaseDate")
    public native String getReleaseDate();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setReleaseDate:")
    public native void setReleaseDate(String v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "parentalGuidanceText")
    public native String getParentalGuidanceText();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setParentalGuidanceText:")
    public native void setParentalGuidanceText(String v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "recordingFlag")
    public native NSNumber getRecordingFlag();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setRecordingFlag:")
    public native void setRecordingFlag(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "seriesInfo")
    public native MTRChannelClusterSeriesInfoStruct getSeriesInfo();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setSeriesInfo:")
    public native void setSeriesInfo(MTRChannelClusterSeriesInfoStruct v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "categoryList")
    public native NSArray<?> getCategoryList();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setCategoryList:")
    public native void setCategoryList(NSArray<?> v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "castList")
    public native NSArray<?> getCastList();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setCastList:")
    public native void setCastList(NSArray<?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
