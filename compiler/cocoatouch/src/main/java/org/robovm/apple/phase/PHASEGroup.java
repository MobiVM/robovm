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
package org.robovm.apple.phase;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.modelio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PHASE") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHASEGroup/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHASEGroupPtr extends Ptr<PHASEGroup, PHASEGroupPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHASEGroup.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PHASEGroup() {}
    protected PHASEGroup(Handle h, long handle) { super(h, handle); }
    protected PHASEGroup(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:")
    public PHASEGroup(String identifier) { super((SkipInit) null); initObject(init(identifier)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "gain")
    public native double getGain();
    @Property(selector = "setGain:")
    public native void setGain(double v);
    @Property(selector = "rate")
    public native double getRate();
    @Property(selector = "setRate:")
    public native void setRate(double v);
    @Property(selector = "isMuted")
    public native boolean isMuted();
    @Property(selector = "isSoloed")
    public native boolean isSoloed();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:")
    protected native @Pointer long init(String identifier);
    @Method(selector = "registerWithEngine:")
    public native void register(PHASEEngine engine);
    @Method(selector = "unregisterFromEngine")
    public native void unregisterFromEngine();
    @Method(selector = "fadeGain:duration:curveType:")
    public native void fadeGain(double gain, double duration, PHASECurveType curveType);
    @Method(selector = "fadeRate:duration:curveType:")
    public native void fadeRate(double rate, double duration, PHASECurveType curveType);
    @Method(selector = "mute")
    public native void mute();
    @Method(selector = "unmute")
    public native void unmute();
    @Method(selector = "solo")
    public native void solo();
    @Method(selector = "unsolo")
    public native void unsolo();
    /*</methods>*/
}
