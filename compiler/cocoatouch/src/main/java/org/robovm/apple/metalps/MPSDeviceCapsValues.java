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
package org.robovm.apple.metalps;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public enum /*<name>*/MPSDeviceCapsValues/*</name>*/ implements ValuedEnum {
    /*<values>*/
    DeviceCapsNull(0L),
    DeviceSupportsReadableArrayOfTextures(1L),
    DeviceSupportsWritableArrayOfTextures(2L),
    DeviceSupportsReadWriteTextures(4L),
    DeviceSupportsSimdgroupBarrier(8L),
    DeviceSupportsQuadShuffle(16L),
    DeviceSupportsSimdShuffle(32L),
    DeviceSupportsSimdReduction(64L),
    DeviceSupportsFloat32Filtering(128L),
    DeviceSupportsNorm16BicubicFiltering(256L),
    DeviceSupportsFloat16BicubicFiltering(512L),
    DeviceIsAppleDevice(1024L),
    DeviceSupportsSimdShuffleAndFill(2048L),
    DeviceSupportsBFloat16Arithmetic(4096L),
    DeviceCapsLast(8192L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MPSDeviceCapsValues/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MPSDeviceCapsValues/*</name>*/ valueOf(long n) {
        for (/*<name>*/MPSDeviceCapsValues/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MPSDeviceCapsValues/*</name>*/.class.getName());
    }
}
