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
package org.robovm.apple.matter;

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
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.4 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public final class /*<name>*/MTRUnitTestingBitmap32MaskMap/*</name>*/ extends Bits</*<name>*/MTRUnitTestingBitmap32MaskMap/*</name>*/> {
    /*<values>*/
    public static final MTRUnitTestingBitmap32MaskMap None = new MTRUnitTestingBitmap32MaskMap(0L);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static final MTRUnitTestingBitmap32MaskMap MaskVal1 = new MTRUnitTestingBitmap32MaskMap(1L);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static final MTRUnitTestingBitmap32MaskMap MaskVal2 = new MTRUnitTestingBitmap32MaskMap(2L);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static final MTRUnitTestingBitmap32MaskMap MaskVal3 = new MTRUnitTestingBitmap32MaskMap(4L);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static final MTRUnitTestingBitmap32MaskMap MaskVal4 = new MTRUnitTestingBitmap32MaskMap(1073741824L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTRUnitTestingBitmap32MaskMap/*</name>*/[] values = _values(/*<name>*/MTRUnitTestingBitmap32MaskMap/*</name>*/.class);

    public /*<name>*/MTRUnitTestingBitmap32MaskMap/*</name>*/(long value) { super(value); }
    private /*<name>*/MTRUnitTestingBitmap32MaskMap/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTRUnitTestingBitmap32MaskMap/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTRUnitTestingBitmap32MaskMap/*</name>*/(value, mask);
    }
    protected /*<name>*/MTRUnitTestingBitmap32MaskMap/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTRUnitTestingBitmap32MaskMap/*</name>*/[] values() {
        return values.clone();
    }
}
