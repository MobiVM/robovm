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
package org.robovm.apple.mlcompute;

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
import org.robovm.apple.metal.*;
import org.robovm.apple.metalps.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsLongMarshaler.class)/*</annotations>*/
public final class /*<name>*/MLCGraphCompilationOptions/*</name>*/ extends Bits</*<name>*/MLCGraphCompilationOptions/*</name>*/> {
    /*<values>*/
    public static final MLCGraphCompilationOptions None = new MLCGraphCompilationOptions(0L);
    public static final MLCGraphCompilationOptions DebugLayers = new MLCGraphCompilationOptions(1L);
    public static final MLCGraphCompilationOptions DisableLayerFusion = new MLCGraphCompilationOptions(2L);
    public static final MLCGraphCompilationOptions LinkGraphs = new MLCGraphCompilationOptions(4L);
    public static final MLCGraphCompilationOptions ComputeAllGradients = new MLCGraphCompilationOptions(8L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MLCGraphCompilationOptions/*</name>*/[] values = _values(/*<name>*/MLCGraphCompilationOptions/*</name>*/.class);

    public /*<name>*/MLCGraphCompilationOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/MLCGraphCompilationOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MLCGraphCompilationOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MLCGraphCompilationOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/MLCGraphCompilationOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MLCGraphCompilationOptions/*</name>*/[] values() {
        return values.clone();
    }
}
