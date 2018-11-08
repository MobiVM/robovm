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
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AudioToolbox") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AUAudioUnitV2Bridge/*</name>*/ 
    extends /*<extends>*/AUAudioUnit/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AUAudioUnitV2BridgePtr extends Ptr<AUAudioUnitV2Bridge, AUAudioUnitV2BridgePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AUAudioUnitV2Bridge.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AUAudioUnitV2Bridge() {}
    protected AUAudioUnitV2Bridge(Handle h, long handle) { super(h, handle); }
    protected AUAudioUnitV2Bridge(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithComponentDescription:options:error:")
    public AUAudioUnitV2Bridge(@ByVal AudioComponentDescription componentDescription, AudioComponentInstantiationOptions options) throws NSErrorException { super(componentDescription, options); }
    @Method(selector = "initWithComponentDescription:error:")
    public AUAudioUnitV2Bridge(@ByVal AudioComponentDescription componentDescription) throws NSErrorException { super(componentDescription); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
