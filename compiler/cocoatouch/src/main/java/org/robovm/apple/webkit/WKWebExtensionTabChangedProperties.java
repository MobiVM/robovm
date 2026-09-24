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
package org.robovm.apple.webkit;

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
import org.robovm.apple.security.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/WKWebExtensionTabChangedProperties/*</name>*/ extends Bits</*<name>*/WKWebExtensionTabChangedProperties/*</name>*/> {
    /*<values>*/
    public static final WKWebExtensionTabChangedProperties None = new WKWebExtensionTabChangedProperties(0L);
    public static final WKWebExtensionTabChangedProperties Loading = new WKWebExtensionTabChangedProperties(2L);
    public static final WKWebExtensionTabChangedProperties Muted = new WKWebExtensionTabChangedProperties(4L);
    public static final WKWebExtensionTabChangedProperties Pinned = new WKWebExtensionTabChangedProperties(8L);
    public static final WKWebExtensionTabChangedProperties PlayingAudio = new WKWebExtensionTabChangedProperties(16L);
    public static final WKWebExtensionTabChangedProperties ReaderMode = new WKWebExtensionTabChangedProperties(32L);
    public static final WKWebExtensionTabChangedProperties Size = new WKWebExtensionTabChangedProperties(64L);
    public static final WKWebExtensionTabChangedProperties Title = new WKWebExtensionTabChangedProperties(128L);
    public static final WKWebExtensionTabChangedProperties URL = new WKWebExtensionTabChangedProperties(256L);
    public static final WKWebExtensionTabChangedProperties ZoomFactor = new WKWebExtensionTabChangedProperties(512L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/WKWebExtensionTabChangedProperties/*</name>*/[] values = _values(/*<name>*/WKWebExtensionTabChangedProperties/*</name>*/.class);

    public /*<name>*/WKWebExtensionTabChangedProperties/*</name>*/(long value) { super(value); }
    private /*<name>*/WKWebExtensionTabChangedProperties/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/WKWebExtensionTabChangedProperties/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/WKWebExtensionTabChangedProperties/*</name>*/(value, mask);
    }
    protected /*<name>*/WKWebExtensionTabChangedProperties/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/WKWebExtensionTabChangedProperties/*</name>*/[] values() {
        return values.clone();
    }
}
