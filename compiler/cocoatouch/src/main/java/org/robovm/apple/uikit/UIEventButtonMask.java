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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.symbols.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class) @Library("UIKit")/*</annotations>*/
public final class /*<name>*/UIEventButtonMask/*</name>*/ extends Bits</*<name>*/UIEventButtonMask/*</name>*/> {
    /*<values>*/
    public static final UIEventButtonMask None = new UIEventButtonMask(0L);
    public static final UIEventButtonMask Primary = new UIEventButtonMask(1L);
    public static final UIEventButtonMask Secondary = new UIEventButtonMask(2L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(UIEventButtonMask.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Bridge(symbol="UIEventButtonMaskForButtonNumber", optional=true)
    public static native UIEventButtonMask fromButtonNumber(@MachineSizedSInt long buttonNumber);
    /*</methods>*/

    private static final /*<name>*/UIEventButtonMask/*</name>*/[] values = _values(/*<name>*/UIEventButtonMask/*</name>*/.class);

    public /*<name>*/UIEventButtonMask/*</name>*/(long value) { super(value); }
    private /*<name>*/UIEventButtonMask/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/UIEventButtonMask/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/UIEventButtonMask/*</name>*/(value, mask);
    }
    protected /*<name>*/UIEventButtonMask/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/UIEventButtonMask/*</name>*/[] values() {
        return values.clone();
    }
}
