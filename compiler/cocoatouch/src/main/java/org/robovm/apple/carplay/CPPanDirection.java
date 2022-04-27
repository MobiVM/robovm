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
package org.robovm.apple.carplay;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.mapkit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/CPPanDirection/*</name>*/ extends Bits</*<name>*/CPPanDirection/*</name>*/> {
    /*<values>*/
    public static final CPPanDirection None = new CPPanDirection(0L);
    public static final CPPanDirection Left = new CPPanDirection(1L);
    public static final CPPanDirection Right = new CPPanDirection(2L);
    public static final CPPanDirection Up = new CPPanDirection(4L);
    public static final CPPanDirection Down = new CPPanDirection(8L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/CPPanDirection/*</name>*/[] values = _values(/*<name>*/CPPanDirection/*</name>*/.class);

    public /*<name>*/CPPanDirection/*</name>*/(long value) { super(value); }
    private /*<name>*/CPPanDirection/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/CPPanDirection/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/CPPanDirection/*</name>*/(value, mask);
    }
    protected /*<name>*/CPPanDirection/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/CPPanDirection/*</name>*/[] values() {
        return values.clone();
    }
}
