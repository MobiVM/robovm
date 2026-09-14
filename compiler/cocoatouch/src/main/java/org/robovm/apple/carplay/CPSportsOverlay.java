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
import org.robovm.apple.coremedia.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPSportsOverlay/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CPSportsOverlayPtr extends Ptr<CPSportsOverlay, CPSportsOverlayPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPSportsOverlay.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPSportsOverlay() {}
    protected CPSportsOverlay(Handle h, long handle) { super(h, handle); }
    protected CPSportsOverlay(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Method(selector = "initWithLeftTeam:rightTeam:eventStatus:")
    public CPSportsOverlay(CPNowPlayingSportsTeam leftTeam, CPNowPlayingSportsTeam rightTeam, CPNowPlayingSportsEventStatus eventStatus) { super((SkipInit) null); initObject(init(leftTeam, rightTeam, eventStatus)); }
    @Method(selector = "initWithCoder:")
    public CPSportsOverlay(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "leftTeam")
    public native CPNowPlayingSportsTeam getLeftTeam();
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "rightTeam")
    public native CPNowPlayingSportsTeam getRightTeam();
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Property(selector = "eventStatus")
    public native CPNowPlayingSportsEventStatus getEventStatus();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Method(selector = "initWithLeftTeam:rightTeam:eventStatus:")
    protected native @Pointer long init(CPNowPlayingSportsTeam leftTeam, CPNowPlayingSportsTeam rightTeam, CPNowPlayingSportsEventStatus eventStatus);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
