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
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public final class /*<name>*/MTLAccelerationStructureInstanceOptions/*</name>*/ extends Bits</*<name>*/MTLAccelerationStructureInstanceOptions/*</name>*/> {
    /*<values>*/
    public static final MTLAccelerationStructureInstanceOptions None = new MTLAccelerationStructureInstanceOptions(0L);
    public static final MTLAccelerationStructureInstanceOptions DisableTriangleCulling = new MTLAccelerationStructureInstanceOptions(1L);
    public static final MTLAccelerationStructureInstanceOptions TriangleFrontFacingWindingCounterClockwise = new MTLAccelerationStructureInstanceOptions(2L);
    public static final MTLAccelerationStructureInstanceOptions Opaque = new MTLAccelerationStructureInstanceOptions(4L);
    public static final MTLAccelerationStructureInstanceOptions NonOpaque = new MTLAccelerationStructureInstanceOptions(8L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTLAccelerationStructureInstanceOptions/*</name>*/[] values = _values(/*<name>*/MTLAccelerationStructureInstanceOptions/*</name>*/.class);

    public /*<name>*/MTLAccelerationStructureInstanceOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/MTLAccelerationStructureInstanceOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTLAccelerationStructureInstanceOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTLAccelerationStructureInstanceOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/MTLAccelerationStructureInstanceOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTLAccelerationStructureInstanceOptions/*</name>*/[] values() {
        return values.clone();
    }
}
