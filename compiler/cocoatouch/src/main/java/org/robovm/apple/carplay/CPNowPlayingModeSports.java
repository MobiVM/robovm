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
package org.robovm.apple.carplay;

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
import org.robovm.apple.mapkit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPNowPlayingModeSports/*</name>*/ 
    extends /*<extends>*/CPNowPlayingMode/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CPNowPlayingModeSportsPtr extends Ptr<CPNowPlayingModeSports, CPNowPlayingModeSportsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPNowPlayingModeSports.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CPNowPlayingModeSports() {}
    protected CPNowPlayingModeSports(Handle h, long handle) { super(h, handle); }
    protected CPNowPlayingModeSports(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLeftTeam:rightTeam:eventStatus:backgroundArtwork:")
    public CPNowPlayingModeSports(CPNowPlayingSportsTeam leftTeam, CPNowPlayingSportsTeam rightTeam, CPNowPlayingSportsEventStatus eventStatus, UIImage backgroundArtwork) { super((SkipInit) null); initObject(init(leftTeam, rightTeam, eventStatus, backgroundArtwork)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "leftTeam")
    public native CPNowPlayingSportsTeam getLeftTeam();
    @Property(selector = "rightTeam")
    public native CPNowPlayingSportsTeam getRightTeam();
    @Property(selector = "eventStatus")
    public native CPNowPlayingSportsEventStatus getEventStatus();
    @Property(selector = "backgroundArtwork")
    public native UIImage getBackgroundArtwork();
    @Property(selector = "defaultNowPlayingMode")
    public static native CPNowPlayingMode getDefaultNowPlayingMode();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLeftTeam:rightTeam:eventStatus:backgroundArtwork:")
    protected native @Pointer long init(CPNowPlayingSportsTeam leftTeam, CPNowPlayingSportsTeam rightTeam, CPNowPlayingSportsEventStatus eventStatus, UIImage backgroundArtwork);
    /*</methods>*/
}
