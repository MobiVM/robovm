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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRChannelClusterGetProgramGuideParams/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRChannelClusterGetProgramGuideParamsPtr extends Ptr<MTRChannelClusterGetProgramGuideParams, MTRChannelClusterGetProgramGuideParamsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRChannelClusterGetProgramGuideParams.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRChannelClusterGetProgramGuideParams() {}
    protected MTRChannelClusterGetProgramGuideParams(Handle h, long handle) { super(h, handle); }
    protected MTRChannelClusterGetProgramGuideParams(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
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
    @Property(selector = "channelList")
    public native NSArray<?> getChannelList();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setChannelList:")
    public native void setChannelList(NSArray<?> v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "pageToken")
    public native MTRChannelClusterPageTokenStruct getPageToken();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setPageToken:")
    public native void setPageToken(MTRChannelClusterPageTokenStruct v);
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
    @Property(selector = "data")
    public native NSData getData();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setData:")
    public native void setData(NSData v);
    @Property(selector = "timedInvokeTimeoutMs")
    public native NSNumber getTimedInvokeTimeoutMs();
    @Property(selector = "setTimedInvokeTimeoutMs:")
    public native void setTimedInvokeTimeoutMs(NSNumber v);
    @Property(selector = "serverSideProcessingTimeout")
    public native NSNumber getServerSideProcessingTimeout();
    @Property(selector = "setServerSideProcessingTimeout:")
    public native void setServerSideProcessingTimeout(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
