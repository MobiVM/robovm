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
package org.robovm.apple.mediaplayer;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MediaPlayer") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPNowPlayingSession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPNowPlayingSessionPtr extends Ptr<MPNowPlayingSession, MPNowPlayingSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPNowPlayingSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPNowPlayingSession() {}
    protected MPNowPlayingSession(Handle h, long handle) { super(h, handle); }
    protected MPNowPlayingSession(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPlayers:")
    public MPNowPlayingSession(NSArray<AVPlayer> players) { super((SkipInit) null); initObject(init(players)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "players")
    public native NSArray<AVPlayer> getPlayers();
    @Property(selector = "delegate")
    public native MPNowPlayingSessionDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MPNowPlayingSessionDelegate v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "automaticallyPublishesNowPlayingInfo")
    public native boolean automaticallyPublishesNowPlayingInfo();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setAutomaticallyPublishesNowPlayingInfo:")
    public native void setAutomaticallyPublishesNowPlayingInfo(boolean v);
    @Property(selector = "nowPlayingInfoCenter")
    public native MPNowPlayingInfoCenter getNowPlayingInfoCenter();
    @Property(selector = "remoteCommandCenter")
    public native MPRemoteCommandCenter getRemoteCommandCenter();
    @Property(selector = "canBecomeActive")
    public native boolean canBecomeActive();
    @Property(selector = "isActive")
    public native boolean isActive();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPlayers:")
    protected native @Pointer long init(NSArray<AVPlayer> players);
    @Method(selector = "becomeActiveIfPossibleWithCompletion:")
    public native void becomeActiveIfPossible(@Block VoidBooleanBlock completion);
    @Method(selector = "addPlayer:")
    public native void addPlayer(AVPlayer player);
    @Method(selector = "removePlayer:")
    public native void removePlayer(AVPlayer player);
    /*</methods>*/
}
