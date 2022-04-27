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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("MediaPlayer") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPNowPlayingInfoCenter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPNowPlayingInfoCenterPtr extends Ptr<MPNowPlayingInfoCenter, MPNowPlayingInfoCenterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPNowPlayingInfoCenter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPNowPlayingInfoCenter() {}
    protected MPNowPlayingInfoCenter(Handle h, long handle) { super(h, handle); }
    protected MPNowPlayingInfoCenter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "nowPlayingInfo")
    public native MPNowPlayingInfo getNowPlayingInfo();
    @Property(selector = "setNowPlayingInfo:")
    public native void setNowPlayingInfo(MPNowPlayingInfo v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "playbackState")
    public native MPNowPlayingPlaybackState getPlaybackState();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setPlaybackState:")
    public native void setPlaybackState(MPNowPlayingPlaybackState v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "defaultCenter")
    public static native MPNowPlayingInfoCenter getDefaultCenter();
    /*</methods>*/
}
