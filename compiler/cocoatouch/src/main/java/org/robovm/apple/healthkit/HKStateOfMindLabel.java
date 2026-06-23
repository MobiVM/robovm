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
package org.robovm.apple.healthkit;

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
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/HKStateOfMindLabel/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Amazed(1L),
    Amused(2L),
    Angry(3L),
    Anxious(4L),
    Ashamed(5L),
    Brave(6L),
    Calm(7L),
    Content(8L),
    Disappointed(9L),
    Discouraged(10L),
    Disgusted(11L),
    Embarrassed(12L),
    Excited(13L),
    Frustrated(14L),
    Grateful(15L),
    Guilty(16L),
    Happy(17L),
    Hopeless(18L),
    Irritated(19L),
    Jealous(20L),
    Joyful(21L),
    Lonely(22L),
    Passionate(23L),
    Peaceful(24L),
    Proud(25L),
    Relieved(26L),
    Sad(27L),
    Scared(28L),
    Stressed(29L),
    Surprised(30L),
    Worried(31L),
    Annoyed(32L),
    Confident(33L),
    Drained(34L),
    Hopeful(35L),
    Indifferent(36L),
    Overwhelmed(37L),
    Satisfied(38L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/HKStateOfMindLabel/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/HKStateOfMindLabel/*</name>*/ valueOf(long n) {
        for (/*<name>*/HKStateOfMindLabel/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/HKStateOfMindLabel/*</name>*/.class.getName());
    }
}
