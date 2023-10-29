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
package org.robovm.apple.avkit;

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
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.iad.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.avrouting.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/AVVideoFrameAnalysisType/*</name>*/ extends Bits</*<name>*/AVVideoFrameAnalysisType/*</name>*/> {
    /*<values>*/
    public static final AVVideoFrameAnalysisType None = new AVVideoFrameAnalysisType(0L);
    public static final AVVideoFrameAnalysisType Default = new AVVideoFrameAnalysisType(1L);
    public static final AVVideoFrameAnalysisType Text = new AVVideoFrameAnalysisType(2L);
    public static final AVVideoFrameAnalysisType Subject = new AVVideoFrameAnalysisType(4L);
    public static final AVVideoFrameAnalysisType VisualSearch = new AVVideoFrameAnalysisType(8L);
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final AVVideoFrameAnalysisType MachineReadableCode = new AVVideoFrameAnalysisType(16L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/AVVideoFrameAnalysisType/*</name>*/[] values = _values(/*<name>*/AVVideoFrameAnalysisType/*</name>*/.class);

    public /*<name>*/AVVideoFrameAnalysisType/*</name>*/(long value) { super(value); }
    private /*<name>*/AVVideoFrameAnalysisType/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/AVVideoFrameAnalysisType/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/AVVideoFrameAnalysisType/*</name>*/(value, mask);
    }
    protected /*<name>*/AVVideoFrameAnalysisType/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/AVVideoFrameAnalysisType/*</name>*/[] values() {
        return values.clone();
    }
}
