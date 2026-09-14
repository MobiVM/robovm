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
package org.robovm.apple.photosui;

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
import org.robovm.apple.photos.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 27.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/PHPickerMetadataOptions/*</name>*/ extends Bits</*<name>*/PHPickerMetadataOptions/*</name>*/> {
    /*<values>*/
    public static final PHPickerMetadataOptions None = new PHPickerMetadataOptions(0L);
    public static final PHPickerMetadataOptions RemoveLocation = new PHPickerMetadataOptions(1L);
    public static final PHPickerMetadataOptions RemoveCaptions = new PHPickerMetadataOptions(2L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/PHPickerMetadataOptions/*</name>*/[] values = _values(/*<name>*/PHPickerMetadataOptions/*</name>*/.class);

    public /*<name>*/PHPickerMetadataOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/PHPickerMetadataOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/PHPickerMetadataOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/PHPickerMetadataOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/PHPickerMetadataOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/PHPickerMetadataOptions/*</name>*/[] values() {
        return values.clone();
    }
}
