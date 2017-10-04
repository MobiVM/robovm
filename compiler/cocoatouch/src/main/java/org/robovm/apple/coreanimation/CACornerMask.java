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
package org.robovm.apple.coreanimation;

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
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/CACornerMask/*</name>*/ extends Bits</*<name>*/CACornerMask/*</name>*/> {
    /*<values>*/
    public static final CACornerMask None = new CACornerMask(0L);
    public static final CACornerMask MinXMinYCorner = new CACornerMask(1L);
    public static final CACornerMask MaxXMinYCorner = new CACornerMask(2L);
    public static final CACornerMask MinXMaxYCorner = new CACornerMask(4L);
    public static final CACornerMask MaxXMaxYCorner = new CACornerMask(8L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/CACornerMask/*</name>*/[] values = _values(/*<name>*/CACornerMask/*</name>*/.class);

    public /*<name>*/CACornerMask/*</name>*/(long value) { super(value); }
    private /*<name>*/CACornerMask/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/CACornerMask/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/CACornerMask/*</name>*/(value, mask);
    }
    protected /*<name>*/CACornerMask/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/CACornerMask/*</name>*/[] values() {
        return values.clone();
    }
}
