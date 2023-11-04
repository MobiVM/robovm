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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHASESoundEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHASESoundEventPtr extends Ptr<PHASESoundEvent, PHASESoundEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHASESoundEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PHASESoundEvent() {}
    protected PHASESoundEvent(Handle h, long handle) { super(h, handle); }
    protected PHASESoundEvent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEngine:assetIdentifier:mixerParameters:error:")
    public PHASESoundEvent(PHASEEngine engine, String assetIdentifier, PHASEMixerParameters mixerParameters) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(engine, assetIdentifier, mixerParameters, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    @Method(selector = "initWithEngine:assetIdentifier:error:")
    public PHASESoundEvent(PHASEEngine engine, String assetIdentifier) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(engine, assetIdentifier, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "renderingState")
    public native PHASERenderingState getRenderingState();
    @Property(selector = "prepareState")
    public native PHASESoundEventPrepareState getPrepareState();
    @Property(selector = "metaParameters")
    public native NSDictionary<NSString, PHASEMetaParameter> getMetaParameters();
    @Property(selector = "mixers")
    public native NSDictionary<NSString, PHASEMixer> getMixers();
    @Property(selector = "pushStreamNodes")
    public native NSDictionary<NSString, PHASEPushStreamNode> getPushStreamNodes();
    @Property(selector = "isIndefinite")
    public native boolean isIndefinite();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEngine:assetIdentifier:mixerParameters:error:")
    private native @Pointer long init(PHASEEngine engine, String assetIdentifier, PHASEMixerParameters mixerParameters, NSError.NSErrorPtr error);
    @Method(selector = "initWithEngine:assetIdentifier:error:")
    private native @Pointer long init(PHASEEngine engine, String assetIdentifier, NSError.NSErrorPtr error);
    @Method(selector = "prepareWithCompletion:")
    public native void prepare(@Block VoidBlock1<PHASESoundEventPrepareHandlerReason> handler);
    @Method(selector = "startWithCompletion:")
    public native void start(@Block VoidBlock1<PHASESoundEventStartHandlerReason> handler);
    @Method(selector = "seekToTime:completion:")
    public native void seekToTime(double time, @Block VoidBlock1<PHASESoundEventSeekHandlerReason> handler);
    @Method(selector = "pause")
    public native void pause();
    @Method(selector = "resume")
    public native void resume();
    @Method(selector = "stopAndInvalidate")
    public native void stopAndInvalidate();
    /*</methods>*/
}
