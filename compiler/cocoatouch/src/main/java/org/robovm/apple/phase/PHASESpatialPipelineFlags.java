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
package org.robovm.apple.phase;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.modelio.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/PHASESpatialPipelineFlags/*</name>*/ extends Bits</*<name>*/PHASESpatialPipelineFlags/*</name>*/> {
    /*<values>*/
    public static final PHASESpatialPipelineFlags None = new PHASESpatialPipelineFlags(0L);
    public static final PHASESpatialPipelineFlags DirectPathTransmission = new PHASESpatialPipelineFlags(1L);
    public static final PHASESpatialPipelineFlags EarlyReflections = new PHASESpatialPipelineFlags(2L);
    public static final PHASESpatialPipelineFlags LateReverb = new PHASESpatialPipelineFlags(4L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/PHASESpatialPipelineFlags/*</name>*/[] values = _values(/*<name>*/PHASESpatialPipelineFlags/*</name>*/.class);

    public /*<name>*/PHASESpatialPipelineFlags/*</name>*/(long value) { super(value); }
    private /*<name>*/PHASESpatialPipelineFlags/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/PHASESpatialPipelineFlags/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/PHASESpatialPipelineFlags/*</name>*/(value, mask);
    }
    protected /*<name>*/PHASESpatialPipelineFlags/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/PHASESpatialPipelineFlags/*</name>*/[] values() {
        return values.clone();
    }
}
