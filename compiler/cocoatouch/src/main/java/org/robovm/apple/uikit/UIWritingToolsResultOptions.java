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
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/UIWritingToolsResultOptions/*</name>*/ extends Bits</*<name>*/UIWritingToolsResultOptions/*</name>*/> {
    /*<values>*/
    public static final UIWritingToolsResultOptions None = new UIWritingToolsResultOptions(0L);
    public static final UIWritingToolsResultOptions Default = new UIWritingToolsResultOptions(0L);
    public static final UIWritingToolsResultOptions PlainText = new UIWritingToolsResultOptions(1L);
    public static final UIWritingToolsResultOptions RichText = new UIWritingToolsResultOptions(2L);
    public static final UIWritingToolsResultOptions List = new UIWritingToolsResultOptions(4L);
    public static final UIWritingToolsResultOptions Table = new UIWritingToolsResultOptions(8L);
    /**
     * @since Available in iOS 26.0 and later.
     */
    public static final UIWritingToolsResultOptions PresentationIntent = new UIWritingToolsResultOptions(16L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/UIWritingToolsResultOptions/*</name>*/[] values = _values(/*<name>*/UIWritingToolsResultOptions/*</name>*/.class);

    public /*<name>*/UIWritingToolsResultOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/UIWritingToolsResultOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/UIWritingToolsResultOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/UIWritingToolsResultOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/UIWritingToolsResultOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/UIWritingToolsResultOptions/*</name>*/[] values() {
        return values.clone();
    }
}
