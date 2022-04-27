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
package org.robovm.apple.pdfkit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/PDFAreaOfInterest/*</name>*/ extends Bits</*<name>*/PDFAreaOfInterest/*</name>*/> {
    /*<values>*/
    public static final PDFAreaOfInterest None = new PDFAreaOfInterest(0L);
    public static final PDFAreaOfInterest NoArea = new PDFAreaOfInterest(0L);
    public static final PDFAreaOfInterest PageArea = new PDFAreaOfInterest(1L);
    public static final PDFAreaOfInterest TextArea = new PDFAreaOfInterest(2L);
    public static final PDFAreaOfInterest AnnotationArea = new PDFAreaOfInterest(4L);
    public static final PDFAreaOfInterest LinkArea = new PDFAreaOfInterest(8L);
    public static final PDFAreaOfInterest ControlArea = new PDFAreaOfInterest(16L);
    public static final PDFAreaOfInterest TextFieldArea = new PDFAreaOfInterest(32L);
    public static final PDFAreaOfInterest IconArea = new PDFAreaOfInterest(64L);
    public static final PDFAreaOfInterest PopupArea = new PDFAreaOfInterest(128L);
    public static final PDFAreaOfInterest ImageArea = new PDFAreaOfInterest(256L);
    public static final PDFAreaOfInterest AnyArea = new PDFAreaOfInterest(9223372036854775807L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/PDFAreaOfInterest/*</name>*/[] values = _values(/*<name>*/PDFAreaOfInterest/*</name>*/.class);

    public /*<name>*/PDFAreaOfInterest/*</name>*/(long value) { super(value); }
    private /*<name>*/PDFAreaOfInterest/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/PDFAreaOfInterest/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/PDFAreaOfInterest/*</name>*/(value, mask);
    }
    protected /*<name>*/PDFAreaOfInterest/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/PDFAreaOfInterest/*</name>*/[] values() {
        return values.clone();
    }
}
