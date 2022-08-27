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
package org.robovm.apple.coremedia;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreMedia")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CMTimebase/*</name>*/ 
    extends /*<extends>*/CMClockOrTimebase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 6.0 and later.
         */
        public static NSObject observeEffectiveRateChanged(CMTimebase object, final VoidBlock2<CMTimebase, CMTime> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(EffectiveRateChangedNotification(), object.as(NSObject.class), NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    CMTimebase object = a.getObject() != null ? a.getObject().as(CMTimebase.class) : null;
                    CMTime time = null;
                    
                    NSDictionary<?, ?> data = a.getUserInfo();
                    if (data.containsKey(EventTimeNotificationKey())) {
                        time = data.get(EventTimeNotificationKey()).as(CMTime.class);
                    }
                    block.invoke(object, time);
                }
            });
        }
        /**
         * @since Available in iOS 6.0 and later.
         */
        public static NSObject observeTimeJumped(CMTimebase object, final VoidBlock2<CMTimebase, CMTime> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(TimeJumpedNotification(), object.as(NSObject.class), NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    CMTimebase object = a.getObject() != null ? a.getObject().as(CMTimebase.class) : null;
                    CMTime time = null;
                    
                    NSDictionary<?, ?> data = a.getUserInfo();
                    if (data.containsKey(EventTimeNotificationKey())) {
                        time = data.get(EventTimeNotificationKey()).as(CMTime.class);
                    }
                    block.invoke(object, time);
                }
            });
        }
    }
    
    /*<ptr>*/public static class CMTimebasePtr extends Ptr<CMTimebase, CMTimebasePtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CMTimebase.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CMTimebase() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/ 
    /**
     * @throws OSStatusException 
     * @since Available in iOS 6.0 and later.
     */
    public static CMTimebase create(CMClock masterClock) throws OSStatusException  {
        CMTimebasePtr ptr = new CMTimebasePtr();
        OSStatus status = create0(null, masterClock, ptr);
        OSStatusException.throwIfNecessary(status);
        return ptr.get();
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 6.0 and later.
     */
    public static CMTimebase create(CMTimebase masterTimebase) throws OSStatusException  {
        CMTimebasePtr ptr = new CMTimebasePtr();
        OSStatus status = create0(null, masterTimebase, ptr);
        OSStatusException.throwIfNecessary(status);
        return ptr.get();
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 6.0 and later.
     */
    public void setTime(CMTime time) throws OSStatusException {
        OSStatus status = setTime0(time);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 6.0 and later.
     */
    public void setAnchorTime(CMTime timebaseTime, CMTime immediateMasterTime) throws OSStatusException {
        OSStatus status = setAnchorTime0(timebaseTime, immediateMasterTime);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 6.0 and later.
     */
    public void setRate(double rate) throws OSStatusException {
        OSStatus status = setRate0(rate);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 6.0 and later.
     */
    public void setRateAndAnchorTime(double rate, CMTime timebaseTime, CMTime immediateMasterTime) throws OSStatusException {
        OSStatus status = setRateAndAnchorTime0(rate, timebaseTime, immediateMasterTime);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 6.0 and later.
     */
    public void addTimer(NSTimer timer, NSRunLoop runloop) throws OSStatusException {
        OSStatus status = addTimer0(timer, runloop);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 6.0 and later.
     */
    public void removeTimer(NSTimer timer) throws OSStatusException {
        OSStatus status = removeTimer0(timer);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 6.0 and later.
     */
    public void setTimerNextFireTime(NSTimer timer, CMTime fireTime) throws OSStatusException {
        OSStatus status = setTimerNextFireTime0(timer, fireTime, 0);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 6.0 and later.
     */
    public void setTimerToFireImmediately(NSTimer timer) throws OSStatusException {
        OSStatus status = setTimerToFireImmediately0(timer);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 6.0 and later.
     */
    @WeaklyLinked
    public void addTimerDispatchSource(DispatchSource timerSource) throws OSStatusException {
        OSStatus status = addTimerDispatchSource0(timerSource);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 6.0 and later.
     */
    @WeaklyLinked
    public void removeTimerDispatchSource(DispatchSource timerSource) throws OSStatusException {
        OSStatus status = removeTimerDispatchSource0(timerSource);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 6.0 and later.
     */
    @WeaklyLinked
    public void setTimerDispatchSourceNextFireTime(DispatchSource timerSource, CMTime fireTime) throws OSStatusException {
        OSStatus status = setTimerDispatchSourceNextFireTime0(timerSource, fireTime, 0);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 6.0 and later.
     */
    @WeaklyLinked
    public void setTimerDispatchSourceToFireImmediately(DispatchSource timerSource) throws OSStatusException {
        OSStatus status = setTimerDispatchSourceToFireImmediately0(timerSource);
        OSStatusException.throwIfNecessary(status);
    }
    /**
     * @throws OSStatusException 
     * @since Available in iOS 6.0 and later.
     */
    public void notificationBarrier() throws OSStatusException {
        OSStatus status = notificationBarrier0();
        OSStatusException.throwIfNecessary(status);
    }
    /*<methods>*/
    @GlobalValue(symbol="kCMTimebaseNotification_EffectiveRateChanged", optional=true)
    public static native NSString EffectiveRateChangedNotification();
    @GlobalValue(symbol="kCMTimebaseNotification_TimeJumped", optional=true)
    public static native NSString TimeJumpedNotification();
    @GlobalValue(symbol="kCMTimebaseNotificationKey_EventTime", optional=true)
    protected static native NSString EventTimeNotificationKey();
    
    @Bridge(symbol="CMTimebaseGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    @Bridge(symbol="CMTimebaseCreateWithSourceClock", optional=true)
    protected static native OSStatus create0(CFAllocator allocator, CMClock sourceClock, CMTimebase.CMTimebasePtr timebaseOut);
    @Bridge(symbol="CMTimebaseCreateWithSourceTimebase", optional=true)
    protected static native OSStatus create0(CFAllocator allocator, CMTimebase sourceTimebase, CMTimebase.CMTimebasePtr timebaseOut);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Bridge(symbol="CMTimebaseCopySourceTimebase", optional=true)
    protected native CMTimebase copySourceTimebase0();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Bridge(symbol="CMTimebaseCopySourceClock", optional=true)
    protected native CMClock copySourceClock0();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Bridge(symbol="CMTimebaseCopySource", optional=true)
    protected native CFType copySource0();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Bridge(symbol="CMTimebaseCopyUltimateSourceClock", optional=true)
    protected native CMClock copyUltimateSourceClock0();
    /**
     * @deprecated Deprecated in iOS 9.0. Use CMTimebaseCopySourceTimebase
     */
    @Deprecated
    @Bridge(symbol="CMTimebaseGetMasterTimebase", optional=true)
    public native CMTimebase getMasterTimebase();
    /**
     * @deprecated Deprecated in iOS 9.0. Use CMTimebaseCopySourceClock
     */
    @Deprecated
    @Bridge(symbol="CMTimebaseGetMasterClock", optional=true)
    public native CMClock getMasterClock();
    /**
     * @deprecated Deprecated in iOS 9.0. Use CMTimebaseCopySource
     */
    @Deprecated
    @Bridge(symbol="CMTimebaseGetMaster", optional=true)
    public native CMTimebase getMaster();
    /**
     * @deprecated Deprecated in iOS 9.0. Use CMTimebaseCopyUltimateSourceClock
     */
    @Deprecated
    @Bridge(symbol="CMTimebaseGetUltimateMasterClock", optional=true)
    public native CMClock getUltimateMasterClock();
    @Bridge(symbol="CMTimebaseSetSourceClock", optional=true)
    protected native OSStatus setSourceClock0(CMClock newSourceClock);
    @Bridge(symbol="CMTimebaseSetSourceTimebase", optional=true)
    protected native OSStatus setSourceTimebase0(CMTimebase newSourceTimebase);
    @Bridge(symbol="CMTimebaseGetTime", optional=true)
    public native @ByVal CMTime getTime();
    @Bridge(symbol="CMTimebaseGetTimeWithTimeScale", optional=true)
    public native @ByVal CMTime getTime(int timescale, CMTimeRoundingMethod method);
    @Bridge(symbol="CMTimebaseSetTime", optional=true)
    protected native OSStatus setTime0(@ByVal CMTime time);
    @Bridge(symbol="CMTimebaseSetAnchorTime", optional=true)
    protected native OSStatus setAnchorTime0(@ByVal CMTime timebaseTime, @ByVal CMTime immediateSourceTime);
    @Bridge(symbol="CMTimebaseGetRate", optional=true)
    public native double getRate();
    @Bridge(symbol="CMTimebaseSetRate", optional=true)
    protected native OSStatus setRate0(double rate);
    @Bridge(symbol="CMTimebaseSetRateAndAnchorTime", optional=true)
    protected native OSStatus setRateAndAnchorTime0(double rate, @ByVal CMTime timebaseTime, @ByVal CMTime immediateSourceTime);
    @Bridge(symbol="CMTimebaseGetEffectiveRate", optional=true)
    public native double getEffectiveRate();
    @Bridge(symbol="CMTimebaseAddTimer", optional=true)
    protected native OSStatus addTimer0(NSTimer timer, NSRunLoop runloop);
    @Bridge(symbol="CMTimebaseRemoveTimer", optional=true)
    protected native OSStatus removeTimer0(NSTimer timer);
    @Bridge(symbol="CMTimebaseSetTimerNextFireTime", optional=true)
    protected native OSStatus setTimerNextFireTime0(NSTimer timer, @ByVal CMTime fireTime, int flags);
    @Bridge(symbol="CMTimebaseSetTimerToFireImmediately", optional=true)
    protected native OSStatus setTimerToFireImmediately0(NSTimer timer);
    @WeaklyLinked
    @Bridge(symbol="CMTimebaseAddTimerDispatchSource", optional=true)
    protected native OSStatus addTimerDispatchSource0(DispatchSource timerSource);
    @WeaklyLinked
    @Bridge(symbol="CMTimebaseRemoveTimerDispatchSource", optional=true)
    protected native OSStatus removeTimerDispatchSource0(DispatchSource timerSource);
    @WeaklyLinked
    @Bridge(symbol="CMTimebaseSetTimerDispatchSourceNextFireTime", optional=true)
    protected native OSStatus setTimerDispatchSourceNextFireTime0(DispatchSource timerSource, @ByVal CMTime fireTime, int flags);
    @WeaklyLinked
    @Bridge(symbol="CMTimebaseSetTimerDispatchSourceToFireImmediately", optional=true)
    protected native OSStatus setTimerDispatchSourceToFireImmediately0(DispatchSource timerSource);
    @Bridge(symbol="CMTimebaseNotificationBarrier", optional=true)
    protected native OSStatus notificationBarrier0();
    /*</methods>*/
}
