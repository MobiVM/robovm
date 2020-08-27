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
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/MTLIntersectionFunctionSignature/*</name>*/ extends Bits</*<name>*/MTLIntersectionFunctionSignature/*</name>*/> {
    /*<values>*/
    public static final MTLIntersectionFunctionSignature None = new MTLIntersectionFunctionSignature(0L);
    public static final MTLIntersectionFunctionSignature Instancing = new MTLIntersectionFunctionSignature(1L);
    public static final MTLIntersectionFunctionSignature TriangleData = new MTLIntersectionFunctionSignature(2L);
    public static final MTLIntersectionFunctionSignature WorldSpaceData = new MTLIntersectionFunctionSignature(4L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTLIntersectionFunctionSignature/*</name>*/[] values = _values(/*<name>*/MTLIntersectionFunctionSignature/*</name>*/.class);

    public /*<name>*/MTLIntersectionFunctionSignature/*</name>*/(long value) { super(value); }
    private /*<name>*/MTLIntersectionFunctionSignature/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTLIntersectionFunctionSignature/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTLIntersectionFunctionSignature/*</name>*/(value, mask);
    }
    protected /*<name>*/MTLIntersectionFunctionSignature/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTLIntersectionFunctionSignature/*</name>*/[] values() {
        return values.clone();
    }
}
