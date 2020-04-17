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
package org.robovm.apple.network;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public final class /*<name>*/NWBrowseResultChange/*</name>*/ extends Bits</*<name>*/NWBrowseResultChange/*</name>*/> {
    /*<values>*/
    public static final NWBrowseResultChange None = new NWBrowseResultChange(0L);
    public static final NWBrowseResultChange invalid = new NWBrowseResultChange(0L);
    public static final NWBrowseResultChange identical = new NWBrowseResultChange(1L);
    public static final NWBrowseResultChange result_added = new NWBrowseResultChange(2L);
    public static final NWBrowseResultChange result_removed = new NWBrowseResultChange(4L);
    public static final NWBrowseResultChange interface_added = new NWBrowseResultChange(8L);
    public static final NWBrowseResultChange interface_removed = new NWBrowseResultChange(16L);
    public static final NWBrowseResultChange txt_record_changed = new NWBrowseResultChange(32L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/NWBrowseResultChange/*</name>*/[] values = _values(/*<name>*/NWBrowseResultChange/*</name>*/.class);

    public /*<name>*/NWBrowseResultChange/*</name>*/(long value) { super(value); }
    private /*<name>*/NWBrowseResultChange/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/NWBrowseResultChange/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/NWBrowseResultChange/*</name>*/(value, mask);
    }
    protected /*<name>*/NWBrowseResultChange/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/NWBrowseResultChange/*</name>*/[] values() {
        return values.clone();
    }
}
