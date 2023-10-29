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
/**
 * @since Available in iOS 12.0 and later.
 * @deprecated Deprecated in iOS 17.0. Use Metal ray tracing API instead
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class) @Deprecated/*</annotations>*/
public final class /*<name>*/MPSAccelerationStructureUsage/*</name>*/ extends Bits</*<name>*/MPSAccelerationStructureUsage/*</name>*/> {
    /*<values>*/
    public static final MPSAccelerationStructureUsage None = new MPSAccelerationStructureUsage(0L);
    public static final MPSAccelerationStructureUsage Refit = new MPSAccelerationStructureUsage(1L);
    public static final MPSAccelerationStructureUsage FrequentRebuild = new MPSAccelerationStructureUsage(2L);
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 17.0. Use Metal ray tracing API instead
     */
    @Deprecated
    public static final MPSAccelerationStructureUsage PreferGPUBuild = new MPSAccelerationStructureUsage(4L);
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 17.0. Use Metal ray tracing API instead
     */
    @Deprecated
    public static final MPSAccelerationStructureUsage PreferCPUBuild = new MPSAccelerationStructureUsage(8L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MPSAccelerationStructureUsage/*</name>*/[] values = _values(/*<name>*/MPSAccelerationStructureUsage/*</name>*/.class);

    public /*<name>*/MPSAccelerationStructureUsage/*</name>*/(long value) { super(value); }
    private /*<name>*/MPSAccelerationStructureUsage/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MPSAccelerationStructureUsage/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MPSAccelerationStructureUsage/*</name>*/(value, mask);
    }
    protected /*<name>*/MPSAccelerationStructureUsage/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MPSAccelerationStructureUsage/*</name>*/[] values() {
        return values.clone();
    }
}
