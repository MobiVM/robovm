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
package org.robovm.apple.systemconfiguration;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public final class /*<name>*/SCNetworkConnectionFlags/*</name>*/ extends Bits</*<name>*/SCNetworkConnectionFlags/*</name>*/> {
    /*<values>*/
    public static final SCNetworkConnectionFlags None = new SCNetworkConnectionFlags(0L);
    public static final SCNetworkConnectionFlags TransientConnection = new SCNetworkConnectionFlags(1L);
    public static final SCNetworkConnectionFlags Reachable = new SCNetworkConnectionFlags(2L);
    public static final SCNetworkConnectionFlags ConnectionRequired = new SCNetworkConnectionFlags(4L);
    public static final SCNetworkConnectionFlags ConnectionAutomatic = new SCNetworkConnectionFlags(8L);
    public static final SCNetworkConnectionFlags InterventionRequired = new SCNetworkConnectionFlags(16L);
    public static final SCNetworkConnectionFlags IsLocalAddress = new SCNetworkConnectionFlags(65536L);
    public static final SCNetworkConnectionFlags IsDirect = new SCNetworkConnectionFlags(131072L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/SCNetworkConnectionFlags/*</name>*/[] values = _values(/*<name>*/SCNetworkConnectionFlags/*</name>*/.class);

    public /*<name>*/SCNetworkConnectionFlags/*</name>*/(long value) { super(value); }
    private /*<name>*/SCNetworkConnectionFlags/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/SCNetworkConnectionFlags/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/SCNetworkConnectionFlags/*</name>*/(value, mask);
    }
    protected /*<name>*/SCNetworkConnectionFlags/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/SCNetworkConnectionFlags/*</name>*/[] values() {
        return values.clone();
    }
}
