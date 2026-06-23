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
package org.robovm.apple.avkit;

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
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.iad.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.avrouting.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaptureEventSound/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCaptureEventSoundPtr extends Ptr<AVCaptureEventSound, AVCaptureEventSoundPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCaptureEventSound.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVCaptureEventSound() {}
    protected AVCaptureEventSound(Handle h, long handle) { super(h, handle); }
    protected AVCaptureEventSound(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithURL:error:")
    public AVCaptureEventSound(NSURL url) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(url, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "cameraShutterSound")
    public static native AVCaptureEventSound getCameraShutterSound();
    @Property(selector = "beginVideoRecordingSound")
    public static native AVCaptureEventSound getBeginVideoRecordingSound();
    @Property(selector = "endVideoRecordingSound")
    public static native AVCaptureEventSound getEndVideoRecordingSound();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithURL:error:")
    private native @Pointer long init(NSURL url, NSError.NSErrorPtr error);
    /*</methods>*/
}
