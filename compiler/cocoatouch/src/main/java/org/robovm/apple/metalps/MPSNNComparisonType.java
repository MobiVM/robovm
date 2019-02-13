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
public final class /*<name>*/MPSNNComparisonType/*</name>*/ extends Bits</*<name>*/MPSNNComparisonType/*</name>*/> {
    /*<values>*/
    public static final MPSNNComparisonType None = new MPSNNComparisonType(0L);
    /**
     * @since Available in iOS 12.1 and later.
     */
    public static final MPSNNComparisonType Equal = new MPSNNComparisonType(0L);
    /**
     * @since Available in iOS 12.1 and later.
     */
    public static final MPSNNComparisonType NotEqual = new MPSNNComparisonType(1L);
    /**
     * @since Available in iOS 12.1 and later.
     */
    public static final MPSNNComparisonType Less = new MPSNNComparisonType(2L);
    /**
     * @since Available in iOS 12.1 and later.
     */
    public static final MPSNNComparisonType LessOrEqual = new MPSNNComparisonType(3L);
    /**
     * @since Available in iOS 12.1 and later.
     */
    public static final MPSNNComparisonType Greater = new MPSNNComparisonType(4L);
    /**
     * @since Available in iOS 12.1 and later.
     */
    public static final MPSNNComparisonType GreaterOrEqual = new MPSNNComparisonType(5L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MPSNNComparisonType/*</name>*/[] values = _values(/*<name>*/MPSNNComparisonType/*</name>*/.class);

    public /*<name>*/MPSNNComparisonType/*</name>*/(long value) { super(value); }
    private /*<name>*/MPSNNComparisonType/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MPSNNComparisonType/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MPSNNComparisonType/*</name>*/(value, mask);
    }
    protected /*<name>*/MPSNNComparisonType/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MPSNNComparisonType/*</name>*/[] values() {
        return values.clone();
    }
}
