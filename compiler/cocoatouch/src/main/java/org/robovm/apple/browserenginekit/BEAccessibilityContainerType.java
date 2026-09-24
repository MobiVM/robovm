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
package org.robovm.apple.browserenginekit;

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
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/BEAccessibilityContainerType/*</name>*/ extends Bits</*<name>*/BEAccessibilityContainerType/*</name>*/> {
    /*<values>*/
    public static final BEAccessibilityContainerType None = new BEAccessibilityContainerType(0L);
    public static final BEAccessibilityContainerType Landmark = new BEAccessibilityContainerType(1L);
    public static final BEAccessibilityContainerType Table = new BEAccessibilityContainerType(2L);
    public static final BEAccessibilityContainerType List = new BEAccessibilityContainerType(4L);
    public static final BEAccessibilityContainerType Fieldset = new BEAccessibilityContainerType(8L);
    public static final BEAccessibilityContainerType Dialog = new BEAccessibilityContainerType(16L);
    public static final BEAccessibilityContainerType Tree = new BEAccessibilityContainerType(32L);
    public static final BEAccessibilityContainerType Frame = new BEAccessibilityContainerType(64L);
    public static final BEAccessibilityContainerType Article = new BEAccessibilityContainerType(128L);
    public static final BEAccessibilityContainerType SemanticGroup = new BEAccessibilityContainerType(256L);
    public static final BEAccessibilityContainerType ScrollArea = new BEAccessibilityContainerType(512L);
    public static final BEAccessibilityContainerType Alert = new BEAccessibilityContainerType(1024L);
    public static final BEAccessibilityContainerType DescriptionList = new BEAccessibilityContainerType(2048L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/BEAccessibilityContainerType/*</name>*/[] values = _values(/*<name>*/BEAccessibilityContainerType/*</name>*/.class);

    public /*<name>*/BEAccessibilityContainerType/*</name>*/(long value) { super(value); }
    private /*<name>*/BEAccessibilityContainerType/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/BEAccessibilityContainerType/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/BEAccessibilityContainerType/*</name>*/(value, mask);
    }
    protected /*<name>*/BEAccessibilityContainerType/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/BEAccessibilityContainerType/*</name>*/[] values() {
        return values.clone();
    }
}
