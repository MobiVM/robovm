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
/*<annotations>*//*</annotations>*/
public enum /*<name>*/MPSImageType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Type2d(0L),
    Type2d_array(1L),
    TypeArray2d(2L),
    TypeArray2d_array(3L),
    Type_ArrayMask(1L),
    Type_BatchMask(2L),
    Type_typeMask(3L),
    Type_noAlpha(4L),
    Type2d_noAlpha(4L),
    Type2d_array_noAlpha(5L),
    TypeArray2d_noAlpha(6L),
    TypeArray2d_array_noAlpha(7L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MPSImageType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MPSImageType/*</name>*/ valueOf(long n) {
        for (/*<name>*/MPSImageType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MPSImageType/*</name>*/.class.getName());
    }
}
