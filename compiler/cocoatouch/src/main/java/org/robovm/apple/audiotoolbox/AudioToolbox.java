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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AudioToolbox/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(AudioToolbox.class); }/*</bind>*/
    /*<constants>*/
    public static final double EndOfTrackTimeStamp = Double.MAX_VALUE;
    public static class InstrumentInfoKeys {
        public static final String Name = "name";
        public static final String MSB = "MSB";
        public static final String LSB = "LSB";
        public static final String Program = "program";
    }

    public static class Presets {
        public static final String VersionKey = "version";
        public static final String TypeKey = "type";
        public static final String SubtypeKey = "subtype";
        public static final String ManufacturerKey = "manufacturer";
        public static final String DataKey = "data";
        public static final String NameKey = "name";
        public static final String NumberKey = "preset-number";
        public static final String RenderQualityKey = "render-quality";
        public static final String CPULoadKey = "cpu-load";
        public static final String ElementNameKey = "element-name";
        public static final String ExternalFileRefs = "file-references";
        public static final String PartKey = "part";
    }
    /*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Bridge(symbol="AudioComponentInstantiate", optional=true)
    public static native void instantiate(AudioComponent inComponent, AudioComponentInstantiationOptions inOptions, @Block VoidBlock2<AudioComponentInstance, OSStatus> inCompletionHandler);
    /*</methods>*/
}
