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
package org.robovm.apple.gamekit;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/GKReleaseState/*</name>*/ extends Bits</*<name>*/GKReleaseState/*</name>*/> {
    /*<values>*/
    public static final GKReleaseState None = new GKReleaseState(0L);
    public static final GKReleaseState Unknown = new GKReleaseState(0L);
    public static final GKReleaseState Released = new GKReleaseState(1L);
    public static final GKReleaseState Prereleased = new GKReleaseState(2L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/GKReleaseState/*</name>*/[] values = _values(/*<name>*/GKReleaseState/*</name>*/.class);

    public /*<name>*/GKReleaseState/*</name>*/(long value) { super(value); }
    private /*<name>*/GKReleaseState/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/GKReleaseState/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/GKReleaseState/*</name>*/(value, mask);
    }
    protected /*<name>*/GKReleaseState/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/GKReleaseState/*</name>*/[] values() {
        return values.clone();
    }
}
