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
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMIDIPolyPressureEvent/*</name>*/ 
    extends /*<extends>*/AVMIDIChannelEvent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVMIDIPolyPressureEventPtr extends Ptr<AVMIDIPolyPressureEvent, AVMIDIPolyPressureEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVMIDIPolyPressureEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVMIDIPolyPressureEvent() {}
    protected AVMIDIPolyPressureEvent(Handle h, long handle) { super(h, handle); }
    protected AVMIDIPolyPressureEvent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithChannel:key:pressure:")
    public AVMIDIPolyPressureEvent(int channel, int key, int pressure) { super((SkipInit) null); initObject(init(channel, key, pressure)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "key")
    public native int getKey();
    @Property(selector = "setKey:")
    public native void setKey(int v);
    @Property(selector = "pressure")
    public native int getPressure();
    @Property(selector = "setPressure:")
    public native void setPressure(int v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithChannel:key:pressure:")
    protected native @Pointer long init(int channel, int key, int pressure);
    /*</methods>*/
}
