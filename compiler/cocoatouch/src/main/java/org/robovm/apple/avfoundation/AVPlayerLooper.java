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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVPlayerLooper/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVPlayerLooperPtr extends Ptr<AVPlayerLooper, AVPlayerLooperPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVPlayerLooper.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVPlayerLooper() {}
    protected AVPlayerLooper(Handle h, long handle) { super(h, handle); }
    protected AVPlayerLooper(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPlayer:templateItem:timeRange:")
    public AVPlayerLooper(AVQueuePlayer player, AVPlayerItem itemToLoop, @ByVal CMTimeRange loopRange) { super((SkipInit) null); initObject(init(player, itemToLoop, loopRange)); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithPlayer:templateItem:timeRange:existingItemsOrdering:")
    public AVPlayerLooper(AVQueuePlayer player, AVPlayerItem itemToLoop, @ByVal CMTimeRange loopRange, AVPlayerLooperItemOrdering itemOrdering) { super((SkipInit) null); initObject(init(player, itemToLoop, loopRange, itemOrdering)); }
    public AVPlayerLooper(AVQueuePlayer player, AVPlayerItem itemToLoop) { super((Handle) null, create(player, itemToLoop)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "status")
    public native AVPlayerLooperStatus getStatus();
    @Property(selector = "error")
    public native NSError getError();
    @Property(selector = "loopCount")
    public native @MachineSizedSInt long getLoopCount();
    @Property(selector = "loopingPlayerItems")
    public native NSArray<AVPlayerItem> getLoopingPlayerItems();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPlayer:templateItem:timeRange:")
    protected native @Pointer long init(AVQueuePlayer player, AVPlayerItem itemToLoop, @ByVal CMTimeRange loopRange);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithPlayer:templateItem:timeRange:existingItemsOrdering:")
    protected native @Pointer long init(AVQueuePlayer player, AVPlayerItem itemToLoop, @ByVal CMTimeRange loopRange, AVPlayerLooperItemOrdering itemOrdering);
    @Method(selector = "disableLooping")
    public native void disableLooping();
    @Method(selector = "playerLooperWithPlayer:templateItem:")
    protected static native @Pointer long create(AVQueuePlayer player, AVPlayerItem itemToLoop);
    /*</methods>*/
}
