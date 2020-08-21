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
package org.robovm.apple.corenfc;

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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsByteMarshaler.class)/*</annotations>*/
public final class /*<name>*/NFCISO15693RequestFlag/*</name>*/ extends Bits</*<name>*/NFCISO15693RequestFlag/*</name>*/> {
    /*<values>*/
    public static final NFCISO15693RequestFlag None = new NFCISO15693RequestFlag(0L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final NFCISO15693RequestFlag DualSubCarriers = new NFCISO15693RequestFlag(1L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final NFCISO15693RequestFlag HighDataRate = new NFCISO15693RequestFlag(2L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final NFCISO15693RequestFlag ProtocolExtension = new NFCISO15693RequestFlag(8L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final NFCISO15693RequestFlag Select = new NFCISO15693RequestFlag(16L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final NFCISO15693RequestFlag Address = new NFCISO15693RequestFlag(32L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final NFCISO15693RequestFlag Option = new NFCISO15693RequestFlag(64L);
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final NFCISO15693RequestFlag CommandSpecificBit8 = new NFCISO15693RequestFlag(128L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/NFCISO15693RequestFlag/*</name>*/[] values = _values(/*<name>*/NFCISO15693RequestFlag/*</name>*/.class);

    public /*<name>*/NFCISO15693RequestFlag/*</name>*/(long value) { super(value); }
    private /*<name>*/NFCISO15693RequestFlag/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/NFCISO15693RequestFlag/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/NFCISO15693RequestFlag/*</name>*/(value, mask);
    }
    protected /*<name>*/NFCISO15693RequestFlag/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/NFCISO15693RequestFlag/*</name>*/[] values() {
        return values.clone();
    }
}
