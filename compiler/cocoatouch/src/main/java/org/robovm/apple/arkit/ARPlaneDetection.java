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
package org.robovm.apple.arkit;

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
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/ARPlaneDetection/*</name>*/ extends Bits</*<name>*/ARPlaneDetection/*</name>*/> {
    /*<values>*/
    public static final ARPlaneDetection None = new ARPlaneDetection(0L);
    public static final ARPlaneDetection Horizontal = new ARPlaneDetection(1L);
    /**
     * @since Available in iOS 11.3 and later.
     */
    public static final ARPlaneDetection Vertical = new ARPlaneDetection(2L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/ARPlaneDetection/*</name>*/[] values = _values(/*<name>*/ARPlaneDetection/*</name>*/.class);

    public /*<name>*/ARPlaneDetection/*</name>*/(long value) { super(value); }
    private /*<name>*/ARPlaneDetection/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/ARPlaneDetection/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/ARPlaneDetection/*</name>*/(value, mask);
    }
    protected /*<name>*/ARPlaneDetection/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/ARPlaneDetection/*</name>*/[] values() {
        return values.clone();
    }
}
