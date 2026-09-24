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
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/MTLStages/*</name>*/ extends Bits</*<name>*/MTLStages/*</name>*/> {
    /*<values>*/
    public static final MTLStages None = new MTLStages(0L);
    public static final MTLStages Vertex = new MTLStages(1L);
    public static final MTLStages Fragment = new MTLStages(2L);
    public static final MTLStages Tile = new MTLStages(4L);
    public static final MTLStages Object = new MTLStages(8L);
    public static final MTLStages Mesh = new MTLStages(16L);
    public static final MTLStages ResourceState = new MTLStages(67108864L);
    public static final MTLStages Dispatch = new MTLStages(134217728L);
    public static final MTLStages Blit = new MTLStages(268435456L);
    public static final MTLStages AccelerationStructure = new MTLStages(536870912L);
    public static final MTLStages MachineLearning = new MTLStages(1073741824L);
    public static final MTLStages All = new MTLStages(9223372036854775807L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTLStages/*</name>*/[] values = _values(/*<name>*/MTLStages/*</name>*/.class);

    public /*<name>*/MTLStages/*</name>*/(long value) { super(value); }
    private /*<name>*/MTLStages/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTLStages/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTLStages/*</name>*/(value, mask);
    }
    protected /*<name>*/MTLStages/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTLStages/*</name>*/[] values() {
        return values.clone();
    }
}
