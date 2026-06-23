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
package org.robovm.apple.matter;

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
/**
 * @since Available in iOS 18.2 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsByteMarshaler.class)/*</annotations>*/
public final class /*<name>*/MTRColorControlUpdateFlagsBitmap/*</name>*/ extends Bits</*<name>*/MTRColorControlUpdateFlagsBitmap/*</name>*/> {
    /*<values>*/
    public static final MTRColorControlUpdateFlagsBitmap None = new MTRColorControlUpdateFlagsBitmap(0L);
    /**
     * @since Available in iOS 18.2 and later.
     */
    public static final MTRColorControlUpdateFlagsBitmap UpdateAction = new MTRColorControlUpdateFlagsBitmap(1L);
    /**
     * @since Available in iOS 18.2 and later.
     */
    public static final MTRColorControlUpdateFlagsBitmap UpdateDirection = new MTRColorControlUpdateFlagsBitmap(2L);
    /**
     * @since Available in iOS 18.2 and later.
     */
    public static final MTRColorControlUpdateFlagsBitmap UpdateTime = new MTRColorControlUpdateFlagsBitmap(4L);
    /**
     * @since Available in iOS 18.2 and later.
     */
    public static final MTRColorControlUpdateFlagsBitmap UpdateStartHue = new MTRColorControlUpdateFlagsBitmap(8L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTRColorControlUpdateFlagsBitmap/*</name>*/[] values = _values(/*<name>*/MTRColorControlUpdateFlagsBitmap/*</name>*/.class);

    public /*<name>*/MTRColorControlUpdateFlagsBitmap/*</name>*/(long value) { super(value); }
    private /*<name>*/MTRColorControlUpdateFlagsBitmap/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTRColorControlUpdateFlagsBitmap/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTRColorControlUpdateFlagsBitmap/*</name>*/(value, mask);
    }
    protected /*<name>*/MTRColorControlUpdateFlagsBitmap/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTRColorControlUpdateFlagsBitmap/*</name>*/[] values() {
        return values.clone();
    }
}
