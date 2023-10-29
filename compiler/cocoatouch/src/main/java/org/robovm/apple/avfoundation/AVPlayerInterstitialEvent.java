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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVPlayerInterstitialEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVPlayerInterstitialEventPtr extends Ptr<AVPlayerInterstitialEvent, AVPlayerInterstitialEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVPlayerInterstitialEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVPlayerInterstitialEvent() {}
    protected AVPlayerInterstitialEvent(Handle h, long handle) { super(h, handle); }
    protected AVPlayerInterstitialEvent(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 15.0 and later.
     * @deprecated Use interstitialEventWithPrimaryItem:time:
     */
    @Deprecated
    public AVPlayerInterstitialEvent(AVPlayerItem primaryItem, String identifier, @ByVal CMTime time, NSArray<AVPlayerItem> templateItems, AVPlayerInterstitialEventRestrictions restrictions, @ByVal CMTime resumptionOffset, @ByVal CMTime playoutLimit, NSDictionary<?, ?> userDefinedAttributes) { super((Handle) null, create(primaryItem, identifier, time, templateItems, restrictions, resumptionOffset, playoutLimit, userDefinedAttributes)); retain(getHandle()); }
    /**
     * @since Available in iOS 15.0 and later.
     * @deprecated Use interstitialEventWithPrimaryItem:date:
     */
    @Deprecated
    public AVPlayerInterstitialEvent(AVPlayerItem primaryItem, String identifier, NSDate date, NSArray<AVPlayerItem> templateItems, AVPlayerInterstitialEventRestrictions restrictions, @ByVal CMTime resumptionOffset, @ByVal CMTime playoutLimit, NSDictionary<?, ?> userDefinedAttributes) { super((Handle) null, create(primaryItem, identifier, date, templateItems, restrictions, resumptionOffset, playoutLimit, userDefinedAttributes)); retain(getHandle()); }
    /**
     * @since Available in iOS 16.0 and later.
     */
    public AVPlayerInterstitialEvent(AVPlayerItem primaryItem, @ByVal CMTime time) { super((Handle) null, create(primaryItem, time)); retain(getHandle()); }
    /**
     * @since Available in iOS 16.0 and later.
     */
    public AVPlayerInterstitialEvent(AVPlayerItem primaryItem, NSDate date) { super((Handle) null, create(primaryItem, date)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "primaryItem")
    public native AVPlayerItem getPrimaryItem();
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "time")
    public native @ByVal CMTime getTime();
    @Property(selector = "date")
    public native NSDate getDate();
    @Property(selector = "templateItems")
    public native NSArray<AVPlayerItem> getTemplateItems();
    @Property(selector = "restrictions")
    public native AVPlayerInterstitialEventRestrictions getRestrictions();
    @Property(selector = "resumptionOffset")
    public native @ByVal CMTime getResumptionOffset();
    @Property(selector = "playoutLimit")
    public native @ByVal CMTime getPlayoutLimit();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "alignsStartWithPrimarySegmentBoundary")
    public native boolean isAlignsStartWithPrimarySegmentBoundary();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "alignsResumptionWithPrimarySegmentBoundary")
    public native boolean isAlignsResumptionWithPrimarySegmentBoundary();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "cue")
    public native AVPlayerInterstitialEventCue getCue();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "willPlayOnce")
    public native boolean isWillPlayOnce();
    @Property(selector = "userDefinedAttributes")
    public native NSDictionary<?, ?> getUserDefinedAttributes();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "assetListResponse")
    public native NSDictionary<?, ?> getAssetListResponse();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setPrimaryItem:", strongRef = true)
    public native void setPrimaryItem(AVPlayerItem v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setIdentifier:")
    public native void setIdentifier(String v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setTime:")
    public native void setTime(@ByVal CMTime v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setDate:")
    public native void setDate(NSDate v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setTemplateItems:")
    public native void setTemplateItems(NSArray<AVPlayerItem> v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setRestrictions:")
    public native void setRestrictions(AVPlayerInterstitialEventRestrictions v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setResumptionOffset:")
    public native void setResumptionOffset(@ByVal CMTime v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setPlayoutLimit:")
    public native void setPlayoutLimit(@ByVal CMTime v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setAlignsStartWithPrimarySegmentBoundary:")
    public native void setAlignsStartWithPrimarySegmentBoundary(boolean v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setAlignsResumptionWithPrimarySegmentBoundary:")
    public native void setAlignsResumptionWithPrimarySegmentBoundary(boolean v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setCue:")
    public native void setCue(AVPlayerInterstitialEventCue v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setWillPlayOnce:")
    public native void setWillPlayOnce(boolean v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setUserDefinedAttributes:")
    public native void setUserDefinedAttributes(NSDictionary<?, ?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 15.0 and later.
     * @deprecated Use interstitialEventWithPrimaryItem:time:
     */
    @Deprecated
    @Method(selector = "interstitialEventWithPrimaryItem:identifier:time:templateItems:restrictions:resumptionOffset:playoutLimit:userDefinedAttributes:")
    protected static native @Pointer long create(AVPlayerItem primaryItem, String identifier, @ByVal CMTime time, NSArray<AVPlayerItem> templateItems, AVPlayerInterstitialEventRestrictions restrictions, @ByVal CMTime resumptionOffset, @ByVal CMTime playoutLimit, NSDictionary<?, ?> userDefinedAttributes);
    /**
     * @since Available in iOS 15.0 and later.
     * @deprecated Use interstitialEventWithPrimaryItem:date:
     */
    @Deprecated
    @Method(selector = "interstitialEventWithPrimaryItem:identifier:date:templateItems:restrictions:resumptionOffset:playoutLimit:userDefinedAttributes:")
    protected static native @Pointer long create(AVPlayerItem primaryItem, String identifier, NSDate date, NSArray<AVPlayerItem> templateItems, AVPlayerInterstitialEventRestrictions restrictions, @ByVal CMTime resumptionOffset, @ByVal CMTime playoutLimit, NSDictionary<?, ?> userDefinedAttributes);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "interstitialEventWithPrimaryItem:time:")
    protected static native @Pointer long create(AVPlayerItem primaryItem, @ByVal CMTime time);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "interstitialEventWithPrimaryItem:date:")
    protected static native @Pointer long create(AVPlayerItem primaryItem, NSDate date);
    /*</methods>*/
}
