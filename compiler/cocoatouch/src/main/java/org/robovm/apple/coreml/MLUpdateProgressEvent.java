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
package org.robovm.apple.coreml;

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
import org.robovm.apple.corevideo.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.vision.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/MLUpdateProgressEvent/*</name>*/ extends Bits</*<name>*/MLUpdateProgressEvent/*</name>*/> {
    /*<values>*/
    public static final MLUpdateProgressEvent None = new MLUpdateProgressEvent(0L);
    public static final MLUpdateProgressEvent TrainingBegin = new MLUpdateProgressEvent(1L);
    public static final MLUpdateProgressEvent EpochEnd = new MLUpdateProgressEvent(2L);
    public static final MLUpdateProgressEvent MiniBatchEnd = new MLUpdateProgressEvent(4L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MLUpdateProgressEvent/*</name>*/[] values = _values(/*<name>*/MLUpdateProgressEvent/*</name>*/.class);

    public /*<name>*/MLUpdateProgressEvent/*</name>*/(long value) { super(value); }
    private /*<name>*/MLUpdateProgressEvent/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MLUpdateProgressEvent/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MLUpdateProgressEvent/*</name>*/(value, mask);
    }
    protected /*<name>*/MLUpdateProgressEvent/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MLUpdateProgressEvent/*</name>*/[] values() {
        return values.clone();
    }
}
