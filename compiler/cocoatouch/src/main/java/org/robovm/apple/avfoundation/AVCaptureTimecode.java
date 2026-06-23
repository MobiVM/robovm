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

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaptureTimecode/*</name>*/ 
    extends /*<extends>*/Struct<AVCaptureTimecode>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCaptureTimecodePtr extends Ptr<AVCaptureTimecode, AVCaptureTimecodePtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVCaptureTimecode() {}
    public AVCaptureTimecode(byte hours, byte minutes, byte seconds, byte frames, int userBits, CMTime frameDuration, AVCaptureTimecodeSourceType sourceType) {
        this.setHours(hours);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
        this.setFrames(frames);
        this.setUserBits(userBits);
        this.setFrameDuration(frameDuration);
        this.setSourceType(sourceType);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native byte getHours();
    @StructMember(0) public native AVCaptureTimecode setHours(byte hours);
    @StructMember(1) public native byte getMinutes();
    @StructMember(1) public native AVCaptureTimecode setMinutes(byte minutes);
    @StructMember(2) public native byte getSeconds();
    @StructMember(2) public native AVCaptureTimecode setSeconds(byte seconds);
    @StructMember(3) public native byte getFrames();
    @StructMember(3) public native AVCaptureTimecode setFrames(byte frames);
    @StructMember(4) public native int getUserBits();
    @StructMember(4) public native AVCaptureTimecode setUserBits(int userBits);
    @StructMember(5) public native @ByVal CMTime getFrameDuration();
    @StructMember(5) public native AVCaptureTimecode setFrameDuration(@ByVal CMTime frameDuration);
    @StructMember(6) public native AVCaptureTimecodeSourceType getSourceType();
    @StructMember(6) public native AVCaptureTimecode setSourceType(AVCaptureTimecodeSourceType sourceType);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
