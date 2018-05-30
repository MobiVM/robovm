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
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/MPSKernelOptions/*</name>*/ extends Bits</*<name>*/MPSKernelOptions/*</name>*/> {
    /*<values>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final MPSKernelOptions None = new MPSKernelOptions(0L);
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final MPSKernelOptions SkipAPIValidation = new MPSKernelOptions(1L);
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final MPSKernelOptions AllowReducedPrecision = new MPSKernelOptions(2L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final MPSKernelOptions DisableInternalTiling = new MPSKernelOptions(4L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final MPSKernelOptions InsertDebugGroups = new MPSKernelOptions(8L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final MPSKernelOptions Verbose = new MPSKernelOptions(16L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MPSKernelOptions/*</name>*/[] values = _values(/*<name>*/MPSKernelOptions/*</name>*/.class);

    public /*<name>*/MPSKernelOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/MPSKernelOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MPSKernelOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MPSKernelOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/MPSKernelOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MPSKernelOptions/*</name>*/[] values() {
        return values.clone();
    }
}
