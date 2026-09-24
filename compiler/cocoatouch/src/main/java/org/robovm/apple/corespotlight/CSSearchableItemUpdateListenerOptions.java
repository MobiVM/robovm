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
package org.robovm.apple.corespotlight;

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
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/CSSearchableItemUpdateListenerOptions/*</name>*/ extends Bits</*<name>*/CSSearchableItemUpdateListenerOptions/*</name>*/> {
    /*<values>*/
    public static final CSSearchableItemUpdateListenerOptions None = new CSSearchableItemUpdateListenerOptions(0L);
    public static final CSSearchableItemUpdateListenerOptions Default = new CSSearchableItemUpdateListenerOptions(0L);
    public static final CSSearchableItemUpdateListenerOptions Summarization = new CSSearchableItemUpdateListenerOptions(2L);
    public static final CSSearchableItemUpdateListenerOptions Priority = new CSSearchableItemUpdateListenerOptions(4L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/CSSearchableItemUpdateListenerOptions/*</name>*/[] values = _values(/*<name>*/CSSearchableItemUpdateListenerOptions/*</name>*/.class);

    public /*<name>*/CSSearchableItemUpdateListenerOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/CSSearchableItemUpdateListenerOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/CSSearchableItemUpdateListenerOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/CSSearchableItemUpdateListenerOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/CSSearchableItemUpdateListenerOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/CSSearchableItemUpdateListenerOptions/*</name>*/[] values() {
        return values.clone();
    }
}
