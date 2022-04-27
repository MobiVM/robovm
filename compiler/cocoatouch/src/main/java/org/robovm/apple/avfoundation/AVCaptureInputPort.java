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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaptureInputPort/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 4.0 and later.
         */
        public static NSObjectProtocol observeFormatDescriptionDidChange(AVCaptureInputPort object, final VoidBlock1<AVCaptureInputPort> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(FormatDescriptionDidChangeNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((AVCaptureInputPort) a.getObject());
                }
            });
        }
    }
    
    /*<ptr>*/public static class AVCaptureInputPortPtr extends Ptr<AVCaptureInputPort, AVCaptureInputPortPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCaptureInputPort.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVCaptureInputPort() {}
    protected AVCaptureInputPort(Handle h, long handle) { super(h, handle); }
    protected AVCaptureInputPort(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "input")
    public native AVCaptureInput getInput();
    @Property(selector = "mediaType")
    public native AVMediaType getMediaType();
    @Property(selector = "formatDescription")
    public native CMFormatDescription getFormatDescription();
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "clock")
    public native CMClock getClock();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "sourceDeviceType")
    public native String getSourceDeviceType();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "sourceDevicePosition")
    public native AVCaptureDevicePosition getSourceDevicePosition();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="AVCaptureInputPortFormatDescriptionDidChangeNotification", optional=true)
    public static native NSString FormatDescriptionDidChangeNotification();
    
    
    /*</methods>*/
}
