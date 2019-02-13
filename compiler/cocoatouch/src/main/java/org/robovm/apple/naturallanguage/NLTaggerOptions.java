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
package org.robovm.apple.naturallanguage;

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
import org.robovm.apple.coreml.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/NLTaggerOptions/*</name>*/ extends Bits</*<name>*/NLTaggerOptions/*</name>*/> {
    /*<values>*/
    public static final NLTaggerOptions None = new NLTaggerOptions(0L);
    public static final NLTaggerOptions OmitWords = new NLTaggerOptions(1L);
    public static final NLTaggerOptions OmitPunctuation = new NLTaggerOptions(2L);
    public static final NLTaggerOptions OmitWhitespace = new NLTaggerOptions(4L);
    public static final NLTaggerOptions OmitOther = new NLTaggerOptions(8L);
    public static final NLTaggerOptions JoinNames = new NLTaggerOptions(16L);
    public static final NLTaggerOptions JoinContractions = new NLTaggerOptions(32L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/NLTaggerOptions/*</name>*/[] values = _values(/*<name>*/NLTaggerOptions/*</name>*/.class);

    public /*<name>*/NLTaggerOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/NLTaggerOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/NLTaggerOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/NLTaggerOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/NLTaggerOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/NLTaggerOptions/*</name>*/[] values() {
        return values.clone();
    }
}
