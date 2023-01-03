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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/MTLRenderStages/*</name>*/ extends Bits</*<name>*/MTLRenderStages/*</name>*/> {
    /*<values>*/
    public static final MTLRenderStages None = new MTLRenderStages(0L);
    public static final MTLRenderStages Vertex = new MTLRenderStages(1L);
    public static final MTLRenderStages Fragment = new MTLRenderStages(2L);
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final MTLRenderStages Tile = new MTLRenderStages(4L);
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final MTLRenderStages Object = new MTLRenderStages(8L);
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final MTLRenderStages Mesh = new MTLRenderStages(16L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTLRenderStages/*</name>*/[] values = _values(/*<name>*/MTLRenderStages/*</name>*/.class);

    public /*<name>*/MTLRenderStages/*</name>*/(long value) { super(value); }
    private /*<name>*/MTLRenderStages/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTLRenderStages/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTLRenderStages/*</name>*/(value, mask);
    }
    protected /*<name>*/MTLRenderStages/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTLRenderStages/*</name>*/[] values() {
        return values.clone();
    }
}
