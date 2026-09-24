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
package org.robovm.apple.accessorysetupkit;

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
import org.robovm.apple.corebluetooth.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/ASPickerDisplayItemSetupOptions/*</name>*/ extends Bits</*<name>*/ASPickerDisplayItemSetupOptions/*</name>*/> {
    /*<values>*/
    public static final ASPickerDisplayItemSetupOptions None = new ASPickerDisplayItemSetupOptions(0L);
    public static final ASPickerDisplayItemSetupOptions Rename = new ASPickerDisplayItemSetupOptions(1L);
    public static final ASPickerDisplayItemSetupOptions ConfirmAuthorization = new ASPickerDisplayItemSetupOptions(2L);
    public static final ASPickerDisplayItemSetupOptions FinishInApp = new ASPickerDisplayItemSetupOptions(4L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/ASPickerDisplayItemSetupOptions/*</name>*/[] values = _values(/*<name>*/ASPickerDisplayItemSetupOptions/*</name>*/.class);

    public /*<name>*/ASPickerDisplayItemSetupOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/ASPickerDisplayItemSetupOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/ASPickerDisplayItemSetupOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/ASPickerDisplayItemSetupOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/ASPickerDisplayItemSetupOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/ASPickerDisplayItemSetupOptions/*</name>*/[] values() {
        return values.clone();
    }
}
