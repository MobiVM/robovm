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
package org.robovm.apple.accessibility;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/AXFeatureOverrideSessionOptions/*</name>*/ extends Bits</*<name>*/AXFeatureOverrideSessionOptions/*</name>*/> {
    /*<values>*/
    public static final AXFeatureOverrideSessionOptions None = new AXFeatureOverrideSessionOptions(0L);
    public static final AXFeatureOverrideSessionOptions Grayscale = new AXFeatureOverrideSessionOptions(1L);
    public static final AXFeatureOverrideSessionOptions InvertColors = new AXFeatureOverrideSessionOptions(2L);
    public static final AXFeatureOverrideSessionOptions VoiceControl = new AXFeatureOverrideSessionOptions(4L);
    public static final AXFeatureOverrideSessionOptions VoiceOver = new AXFeatureOverrideSessionOptions(8L);
    public static final AXFeatureOverrideSessionOptions Zoom = new AXFeatureOverrideSessionOptions(16L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/AXFeatureOverrideSessionOptions/*</name>*/[] values = _values(/*<name>*/AXFeatureOverrideSessionOptions/*</name>*/.class);

    public /*<name>*/AXFeatureOverrideSessionOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/AXFeatureOverrideSessionOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/AXFeatureOverrideSessionOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/AXFeatureOverrideSessionOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/AXFeatureOverrideSessionOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/AXFeatureOverrideSessionOptions/*</name>*/[] values() {
        return values.clone();
    }
}
