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
public final class /*<name>*/NFCISO15693ResponseFlag/*</name>*/ extends Bits</*<name>*/NFCISO15693ResponseFlag/*</name>*/> {
    /*<values>*/
    public static final NFCISO15693ResponseFlag None = new NFCISO15693ResponseFlag(0L);
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final NFCISO15693ResponseFlag Error = new NFCISO15693ResponseFlag(1L);
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final NFCISO15693ResponseFlag ResponseBufferValid = new NFCISO15693ResponseFlag(2L);
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final NFCISO15693ResponseFlag FinalResponse = new NFCISO15693ResponseFlag(4L);
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final NFCISO15693ResponseFlag ProtocolExtension = new NFCISO15693ResponseFlag(8L);
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final NFCISO15693ResponseFlag BlockSecurityStatusBit5 = new NFCISO15693ResponseFlag(16L);
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final NFCISO15693ResponseFlag BlockSecurityStatusBit6 = new NFCISO15693ResponseFlag(32L);
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final NFCISO15693ResponseFlag WaitTimeExtension = new NFCISO15693ResponseFlag(64L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/NFCISO15693ResponseFlag/*</name>*/[] values = _values(/*<name>*/NFCISO15693ResponseFlag/*</name>*/.class);

    public /*<name>*/NFCISO15693ResponseFlag/*</name>*/(long value) { super(value); }
    private /*<name>*/NFCISO15693ResponseFlag/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/NFCISO15693ResponseFlag/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/NFCISO15693ResponseFlag/*</name>*/(value, mask);
    }
    protected /*<name>*/NFCISO15693ResponseFlag/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/NFCISO15693ResponseFlag/*</name>*/[] values() {
        return values.clone();
    }
}
