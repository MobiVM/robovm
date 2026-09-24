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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AUParameterListener/*</name>*/
    extends NativeObject
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AUParameterListenerPtr extends Ptr<AUParameterListener, AUParameterListenerPtr> {}/*</ptr>*/

    /*<bind>*/static { Bro.bind(AUParameterListener.class); }/*</bind>*/
    /*<constants>*/
    public static final int AnyParameter = -1;
    /*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="AUListenerCreateWithDispatchQueue", optional=true)
    protected static native OSStatus create0(AUParameterListener.AUParameterListenerPtr outListener, float inNotificationInterval, org.robovm.apple.dispatch.DispatchQueue inDispatchQueue, @Block VoidBlock3<VoidPtr, AudioUnitParameter, Float> inBlock);
    @Bridge(symbol="AUListenerDispose", optional=true)
    public native OSStatus dispose();
    @Bridge(symbol="AUListenerAddParameter", optional=true)
    public native OSStatus addParameter(VoidPtr inObject, AudioUnitParameter inParameter);
    @Bridge(symbol="AUListenerRemoveParameter", optional=true)
    public native OSStatus removeParameter(VoidPtr inObject, AudioUnitParameter inParameter);
    @Bridge(symbol="AUParameterSet", optional=true)
    public native OSStatus setParameter(VoidPtr inSendingObject, AudioUnitParameter inParameter, float inValue, int inBufferOffsetInFrames);
    @Bridge(symbol="AUParameterListenerNotify", optional=true)
    public native OSStatus notifyParameterListener(VoidPtr inSendingObject, AudioUnitParameter inParameter);
    /*</methods>*/
}
