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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPNowPlayingSportsEventStatus/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CPNowPlayingSportsEventStatusPtr extends Ptr<CPNowPlayingSportsEventStatus, CPNowPlayingSportsEventStatusPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPNowPlayingSportsEventStatus.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPNowPlayingSportsEventStatus() {}
    protected CPNowPlayingSportsEventStatus(Handle h, long handle) { super(h, handle); }
    protected CPNowPlayingSportsEventStatus(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEventStatusText:eventStatusImage:eventClock:")
    public CPNowPlayingSportsEventStatus(NSArray<NSString> eventStatusText, UIImage eventStatusImage, CPNowPlayingSportsClock eventClock) { super((SkipInit) null); initObject(init(eventStatusText, eventStatusImage, eventClock)); }
    @Method(selector = "initWithCoder:")
    public CPNowPlayingSportsEventStatus(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "eventStatusText")
    public native NSArray<NSString> getEventStatusText();
    @Property(selector = "eventClock")
    public native CPNowPlayingSportsClock getEventClock();
    @Property(selector = "eventStatusImage")
    public native UIImage getEventStatusImage();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEventStatusText:eventStatusImage:eventClock:")
    protected native @Pointer long init(NSArray<NSString> eventStatusText, UIImage eventStatusImage, CPNowPlayingSportsClock eventClock);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
