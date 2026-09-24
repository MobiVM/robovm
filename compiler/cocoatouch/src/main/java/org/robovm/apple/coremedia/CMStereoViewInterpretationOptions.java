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
package org.robovm.apple.coremedia;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsLongMarshaler.class)/*</annotations>*/
public final class /*<name>*/CMStereoViewInterpretationOptions/*</name>*/ extends Bits</*<name>*/CMStereoViewInterpretationOptions/*</name>*/> {
    /*<values>*/
    public static final CMStereoViewInterpretationOptions None = new CMStereoViewInterpretationOptions(0L);
    public static final CMStereoViewInterpretationOptions Default = new CMStereoViewInterpretationOptions(0L);
    public static final CMStereoViewInterpretationOptions StereoOrderReversed = new CMStereoViewInterpretationOptions(1L);
    public static final CMStereoViewInterpretationOptions AdditionalViews = new CMStereoViewInterpretationOptions(2L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/CMStereoViewInterpretationOptions/*</name>*/[] values = _values(/*<name>*/CMStereoViewInterpretationOptions/*</name>*/.class);

    public /*<name>*/CMStereoViewInterpretationOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/CMStereoViewInterpretationOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/CMStereoViewInterpretationOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/CMStereoViewInterpretationOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/CMStereoViewInterpretationOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/CMStereoViewInterpretationOptions/*</name>*/[] values() {
        return values.clone();
    }
}
