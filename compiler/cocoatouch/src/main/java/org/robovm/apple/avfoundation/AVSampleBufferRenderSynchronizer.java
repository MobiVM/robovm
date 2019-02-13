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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVSampleBufferRenderSynchronizer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVSampleBufferRenderSynchronizerPtr extends Ptr<AVSampleBufferRenderSynchronizer, AVSampleBufferRenderSynchronizerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVSampleBufferRenderSynchronizer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVSampleBufferRenderSynchronizer() {}
    protected AVSampleBufferRenderSynchronizer(Handle h, long handle) { super(h, handle); }
    protected AVSampleBufferRenderSynchronizer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "timebase")
    public native CMTimebase getTimebase();
    @Property(selector = "rate")
    public native float getRate();
    @Property(selector = "setRate:")
    public native void setRate(float v);
    @Property(selector = "renderers")
    public native NSArray<?> getRenderers();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @GlobalValue(symbol="AVSampleBufferRenderSynchronizerRateDidChangeNotification", optional=true)
    public static native String RateDidChangeNotification();
    
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "currentTime")
    public native @ByVal CMTime currentTime();
    @Method(selector = "setRate:time:")
    public native void setRate(float rate, @ByVal CMTime time);
    @Method(selector = "addRenderer:")
    public native void addRenderer(AVQueuedSampleBufferRendering renderer);
    @Method(selector = "removeRenderer:atTime:completionHandler:")
    public native void removeRenderer(AVQueuedSampleBufferRendering renderer, @ByVal CMTime time, @Block VoidBooleanBlock completionHandler);
    @Method(selector = "addPeriodicTimeObserverForInterval:queue:usingBlock:")
    public native NSObject addPeriodicTimeObserver(@ByVal CMTime interval, DispatchQueue queue, @Block VoidBlock1<CMTime> block);
    @Method(selector = "addBoundaryTimeObserverForTimes:queue:usingBlock:")
    public native NSObject addBoundaryTimeObserver(NSArray<NSValue> times, DispatchQueue queue, @Block Runnable block);
    @Method(selector = "removeTimeObserver:")
    public native void removeTimeObserver(NSObject observer);
    /*</methods>*/
}
