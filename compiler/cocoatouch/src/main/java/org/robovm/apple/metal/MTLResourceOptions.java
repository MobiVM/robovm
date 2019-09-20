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
package org.robovm.apple.metal;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/MTLResourceOptions/*</name>*/ extends Bits</*<name>*/MTLResourceOptions/*</name>*/> {
    /*<values>*/
    public static final MTLResourceOptions CPUCacheModeDefaultCache = new MTLResourceOptions(0L);
    public static final MTLResourceOptions CPUCacheModeWriteCombined = new MTLResourceOptions(1L);
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final MTLResourceOptions StorageModeShared = new MTLResourceOptions(0L);
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final MTLResourceOptions StorageModePrivate = new MTLResourceOptions(32L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final MTLResourceOptions StorageModeMemoryless = new MTLResourceOptions(48L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final MTLResourceOptions HazardTrackingModeDefault = new MTLResourceOptions(0L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final MTLResourceOptions HazardTrackingModeUntracked = new MTLResourceOptions(256L);
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MTLResourceOptions HazardTrackingModeTracked = new MTLResourceOptions(512L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTLResourceOptions/*</name>*/[] values = _values(/*<name>*/MTLResourceOptions/*</name>*/.class);

    public /*<name>*/MTLResourceOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/MTLResourceOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTLResourceOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTLResourceOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/MTLResourceOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTLResourceOptions/*</name>*/[] values() {
        return values.clone();
    }
}
