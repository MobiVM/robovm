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
public enum /*<name>*/AUAudioMixRenderingStyle/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @since Available in iOS 26.0 and later.
     */
    Cinematic(0L),
    /**
     * @since Available in iOS 26.0 and later.
     */
    Studio(1L),
    /**
     * @since Available in iOS 26.0 and later.
     */
    InFrame(2L),
    /**
     * @since Available in iOS 26.0 and later.
     */
    CinematicBackgroundStem(3L),
    /**
     * @since Available in iOS 26.0 and later.
     */
    CinematicForegroundStem(4L),
    /**
     * @since Available in iOS 26.0 and later.
     */
    StudioForegroundStem(5L),
    /**
     * @since Available in iOS 26.0 and later.
     */
    InFrameForegroundStem(6L),
    /**
     * @since Available in iOS 26.0 and later.
     */
    Standard(7L),
    /**
     * @since Available in iOS 26.0 and later.
     */
    StudioBackgroundStem(8L),
    /**
     * @since Available in iOS 26.0 and later.
     */
    InFrameBackgroundStem(9L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/AUAudioMixRenderingStyle/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/AUAudioMixRenderingStyle/*</name>*/ valueOf(long n) {
        for (/*<name>*/AUAudioMixRenderingStyle/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/AUAudioMixRenderingStyle/*</name>*/.class.getName());
    }
}
