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
public final class /*<name>*/MPSNNPaddingMethod/*</name>*/ extends Bits</*<name>*/MPSNNPaddingMethod/*</name>*/> {
    /*<values>*/
    public static final MPSNNPaddingMethod None = new MPSNNPaddingMethod(0L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final MPSNNPaddingMethod AlignCentered = new MPSNNPaddingMethod(0L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final MPSNNPaddingMethod AlignTopLeft = new MPSNNPaddingMethod(1L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final MPSNNPaddingMethod AlignBottomRight = new MPSNNPaddingMethod(2L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final MPSNNPaddingMethod Align_reserved = new MPSNNPaddingMethod(3L);
    public static final MPSNNPaddingMethod AlignMask = new MPSNNPaddingMethod(3L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final MPSNNPaddingMethod AddRemainderToTopLeft = new MPSNNPaddingMethod(0L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final MPSNNPaddingMethod AddRemainderToTopRight = new MPSNNPaddingMethod(4L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final MPSNNPaddingMethod AddRemainderToBottomLeft = new MPSNNPaddingMethod(8L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final MPSNNPaddingMethod AddRemainderToBottomRight = new MPSNNPaddingMethod(12L);
    public static final MPSNNPaddingMethod AddRemainderToMask = new MPSNNPaddingMethod(12L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final MPSNNPaddingMethod SizeValidOnly = new MPSNNPaddingMethod(0L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final MPSNNPaddingMethod SizeSame = new MPSNNPaddingMethod(16L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final MPSNNPaddingMethod SizeFull = new MPSNNPaddingMethod(32L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final MPSNNPaddingMethod Size_reserved = new MPSNNPaddingMethod(48L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final MPSNNPaddingMethod Custom = new MPSNNPaddingMethod(16384L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final MPSNNPaddingMethod SizeMask = new MPSNNPaddingMethod(2032L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final MPSNNPaddingMethod ExcludeEdges = new MPSNNPaddingMethod(32768L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MPSNNPaddingMethod/*</name>*/[] values = _values(/*<name>*/MPSNNPaddingMethod/*</name>*/.class);

    public /*<name>*/MPSNNPaddingMethod/*</name>*/(long value) { super(value); }
    private /*<name>*/MPSNNPaddingMethod/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MPSNNPaddingMethod/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MPSNNPaddingMethod/*</name>*/(value, mask);
    }
    protected /*<name>*/MPSNNPaddingMethod/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MPSNNPaddingMethod/*</name>*/[] values() {
        return values.clone();
    }
}
