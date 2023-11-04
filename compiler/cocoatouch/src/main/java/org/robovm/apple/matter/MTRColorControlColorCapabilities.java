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
 * @since Available in iOS 16.1 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsShortMarshaler.class)/*</annotations>*/
public final class /*<name>*/MTRColorControlColorCapabilities/*</name>*/ extends Bits</*<name>*/MTRColorControlColorCapabilities/*</name>*/> {
    /*<values>*/
    public static final MTRColorControlColorCapabilities None = new MTRColorControlColorCapabilities(0L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRColorControlColorCapabilities HueSaturationSupported = new MTRColorControlColorCapabilities(1L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRColorControlColorCapabilities EnhancedHueSupported = new MTRColorControlColorCapabilities(2L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRColorControlColorCapabilities ColorLoopSupported = new MTRColorControlColorCapabilities(4L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRColorControlColorCapabilities XYAttributesSupported = new MTRColorControlColorCapabilities(8L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRColorControlColorCapabilities ColorTemperatureSupported = new MTRColorControlColorCapabilities(16L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTRColorControlColorCapabilities/*</name>*/[] values = _values(/*<name>*/MTRColorControlColorCapabilities/*</name>*/.class);

    public /*<name>*/MTRColorControlColorCapabilities/*</name>*/(long value) { super(value); }
    private /*<name>*/MTRColorControlColorCapabilities/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTRColorControlColorCapabilities/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTRColorControlColorCapabilities/*</name>*/(value, mask);
    }
    protected /*<name>*/MTRColorControlColorCapabilities/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTRColorControlColorCapabilities/*</name>*/[] values() {
        return values.clone();
    }
}
