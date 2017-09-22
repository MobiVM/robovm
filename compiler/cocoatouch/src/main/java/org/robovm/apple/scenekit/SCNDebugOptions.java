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
package org.robovm.apple.scenekit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.glkit.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/SCNDebugOptions/*</name>*/ extends Bits</*<name>*/SCNDebugOptions/*</name>*/> {
    /*<values>*/
    public static final SCNDebugOptions None = new SCNDebugOptions(0L);
    public static final SCNDebugOptions ShowPhysicsShapes = new SCNDebugOptions(1L);
    public static final SCNDebugOptions ShowBoundingBoxes = new SCNDebugOptions(2L);
    public static final SCNDebugOptions ShowLightInfluences = new SCNDebugOptions(4L);
    public static final SCNDebugOptions ShowLightExtents = new SCNDebugOptions(8L);
    public static final SCNDebugOptions ShowPhysicsFields = new SCNDebugOptions(16L);
    public static final SCNDebugOptions ShowWireframe = new SCNDebugOptions(32L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/SCNDebugOptions/*</name>*/[] values = _values(/*<name>*/SCNDebugOptions/*</name>*/.class);

    public /*<name>*/SCNDebugOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/SCNDebugOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/SCNDebugOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/SCNDebugOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/SCNDebugOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/SCNDebugOptions/*</name>*/[] values() {
        return values.clone();
    }
}
