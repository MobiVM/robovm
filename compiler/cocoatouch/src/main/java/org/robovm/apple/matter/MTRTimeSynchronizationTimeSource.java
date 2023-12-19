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
package org.robovm.apple.matter;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.1 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsUnsignedByteMarshaler.class)/*</annotations>*/
public enum /*<name>*/MTRTimeSynchronizationTimeSource/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @since Available in iOS 16.1 and later.
     */
    None(0L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Unknown(1L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Admin(2L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    NodeTimeCluster(3L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    NonFabricSntp(4L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    NonFabricNtp(5L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    FabricSntp(6L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    FabricNtp(7L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    MixedNtp(8L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    NonFabricSntpNts(9L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    NonFabricNtpNts(10L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    FabricSntpNts(11L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    FabricNtpNts(12L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    MixedNtpNts(13L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    CloudSource(14L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Ptp(15L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Gnss(16L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MTRTimeSynchronizationTimeSource/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MTRTimeSynchronizationTimeSource/*</name>*/ valueOf(long n) {
        for (/*<name>*/MTRTimeSynchronizationTimeSource/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MTRTimeSynchronizationTimeSource/*</name>*/.class.getName());
    }
}
