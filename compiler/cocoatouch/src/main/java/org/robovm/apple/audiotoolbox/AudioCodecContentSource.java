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
/*<annotations>*//*</annotations>*/
public enum /*<name>*/AudioCodecContentSource/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Unspecified(-1L),
    Reserved(0L),
    AppleCapture_Traditional(1L),
    AppleCapture_Spatial(2L),
    AppleCapture_Spatial_Enhanced(3L),
    AppleMusic_Traditional(4L),
    AppleMusic_Spatial(5L),
    AppleAV_Traditional_Offline(6L),
    AppleAV_Spatial_Offline(7L),
    AppleAV_Traditional_Live(8L),
    AppleAV_Spatial_Live(9L),
    ApplePassthrough(10L),
    Capture_Traditional(33L),
    Capture_Spatial(34L),
    Capture_Spatial_Enhanced(35L),
    Music_Traditional(36L),
    Music_Spatial(37L),
    AV_Traditional_Offline(38L),
    AV_Spatial_Offline(39L),
    AV_Traditional_Live(40L),
    AV_Spatial_Live(41L),
    Passthrough(42L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/AudioCodecContentSource/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/AudioCodecContentSource/*</name>*/ valueOf(long n) {
        for (/*<name>*/AudioCodecContentSource/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/AudioCodecContentSource/*</name>*/.class.getName());
    }
}
