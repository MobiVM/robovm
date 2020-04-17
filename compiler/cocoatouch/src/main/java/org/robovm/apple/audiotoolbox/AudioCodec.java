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
package org.robovm.apple.audiotoolbox;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("AudioToolbox")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AudioCodec/*</name>*/ 
    extends /*<extends>*/AudioComponentInstance/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AudioCodecPtr extends Ptr<AudioCodec, AudioCodecPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(AudioCodec.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AudioCodec() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="AudioCodecGetPropertyInfo", optional=true)
    public native OSStatus getPropertyInfo(int inPropertyID, IntPtr outSize, BooleanPtr outWritable);
    @Bridge(symbol="AudioCodecGetProperty", optional=true)
    public native OSStatus getProperty(int inPropertyID, IntPtr ioPropertyDataSize, VoidPtr outPropertyData);
    @Bridge(symbol="AudioCodecSetProperty", optional=true)
    public native OSStatus setProperty(int inPropertyID, int inPropertyDataSize, VoidPtr inPropertyData);
    @Bridge(symbol="AudioCodecInitialize", optional=true)
    public native OSStatus initialize(AudioStreamBasicDescription inInputFormat, AudioStreamBasicDescription inOutputFormat, VoidPtr inMagicCookie, int inMagicCookieByteSize);
    @Bridge(symbol="AudioCodecUninitialize", optional=true)
    public native OSStatus uninitialize();
    @Bridge(symbol="AudioCodecAppendInputData", optional=true)
    public native OSStatus appendInputData(VoidPtr inInputData, IntPtr ioInputDataByteSize, IntPtr ioNumberPackets, AudioStreamPacketDescription inPacketDescription);
    @Bridge(symbol="AudioCodecProduceOutputPackets", optional=true)
    public native OSStatus produceOutputPackets(VoidPtr outOutputData, IntPtr ioOutputDataByteSize, IntPtr ioNumberPackets, AudioStreamPacketDescription outPacketDescription, IntPtr outStatus);
    @Bridge(symbol="AudioCodecAppendInputBufferList", optional=true)
    public native OSStatus appendInputBufferList(AudioBufferList inBufferList, IntPtr ioNumberPackets, AudioStreamPacketDescription inPacketDescription, IntPtr outBytesConsumed);
    @Bridge(symbol="AudioCodecProduceOutputBufferList", optional=true)
    public native OSStatus produceOutputBufferList(AudioBufferList ioBufferList, IntPtr ioNumberPackets, AudioStreamPacketDescription outPacketDescription, IntPtr outStatus);
    @Bridge(symbol="AudioCodecReset", optional=true)
    public native OSStatus reset();
    /*</methods>*/
}
