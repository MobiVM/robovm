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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.5 and later.
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
    public AVPlayerInterstitialEvent(AVPlayerItem primaryItem, @ByVal CMTime time, NSArray<AVPlayerItem> templateItems, AVPlayerInterstitialEventRestrictions restrictions, @ByVal CMTime resumptionOffset) { super((Handle) null, create(primaryItem, time, templateItems, restrictions, resumptionOffset)); retain(getHandle()); }
    public AVPlayerInterstitialEvent(AVPlayerItem primaryItem, NSDate date, NSArray<AVPlayerItem> templateItems, AVPlayerInterstitialEventRestrictions restrictions, @ByVal CMTime resumptionOffset) { super((Handle) null, create(primaryItem, date, templateItems, restrictions, resumptionOffset)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "primaryItem")
    public native AVPlayerItem getPrimaryItem();
    @Property(selector = "time")
    public native @ByVal CMTime getTime();
    @Property(selector = "date")
    public native NSDate getDate();
    @Property(selector = "templateItems")
    public native NSArray<AVPlayerItem> getTemplateItems();
    @Property(selector = "interstitialTemplateItems")
    public native NSArray<AVPlayerItem> getInterstitialTemplateItems();
    @Property(selector = "restrictions")
    public native AVPlayerInterstitialEventRestrictions getRestrictions();
    @Property(selector = "resumptionOffset")
    public native @ByVal CMTime getResumptionOffset();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "interstitialEventWithPrimaryItem:time:templateItems:restrictions:resumptionOffset:")
    protected static native @Pointer long create(AVPlayerItem primaryItem, @ByVal CMTime time, NSArray<AVPlayerItem> templateItems, AVPlayerInterstitialEventRestrictions restrictions, @ByVal CMTime resumptionOffset);
    @Method(selector = "interstitialEventWithPrimaryItem:date:templateItems:restrictions:resumptionOffset:")
    protected static native @Pointer long create(AVPlayerItem primaryItem, NSDate date, NSArray<AVPlayerItem> templateItems, AVPlayerInterstitialEventRestrictions restrictions, @ByVal CMTime resumptionOffset);
    /*</methods>*/
}
