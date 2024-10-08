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
package org.robovm.apple.exposurenotification;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.5 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public final class /*<name>*/ENActivityFlags/*</name>*/ extends Bits</*<name>*/ENActivityFlags/*</name>*/> {
    /*<values>*/
    public static final ENActivityFlags None = new ENActivityFlags(0L);
    public static final ENActivityFlags Reserved1 = new ENActivityFlags(1L);
    public static final ENActivityFlags Reserved2 = new ENActivityFlags(2L);
    public static final ENActivityFlags PeriodicRun = new ENActivityFlags(4L);
    public static final ENActivityFlags PreAuthorizedKeyReleaseNotificationTapped = new ENActivityFlags(8L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/ENActivityFlags/*</name>*/[] values = _values(/*<name>*/ENActivityFlags/*</name>*/.class);

    public /*<name>*/ENActivityFlags/*</name>*/(long value) { super(value); }
    private /*<name>*/ENActivityFlags/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/ENActivityFlags/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/ENActivityFlags/*</name>*/(value, mask);
    }
    protected /*<name>*/ENActivityFlags/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/ENActivityFlags/*</name>*/[] values() {
        return values.clone();
    }
}
