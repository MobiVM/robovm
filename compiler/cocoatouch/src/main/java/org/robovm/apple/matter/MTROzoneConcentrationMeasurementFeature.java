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
 * @since Available in iOS 17.6 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public final class /*<name>*/MTROzoneConcentrationMeasurementFeature/*</name>*/ extends Bits</*<name>*/MTROzoneConcentrationMeasurementFeature/*</name>*/> {
    /*<values>*/
    public static final MTROzoneConcentrationMeasurementFeature None = new MTROzoneConcentrationMeasurementFeature(0L);
    /**
     * @since Available in iOS 17.6 and later.
     */
    public static final MTROzoneConcentrationMeasurementFeature NumericMeasurement = new MTROzoneConcentrationMeasurementFeature(1L);
    /**
     * @since Available in iOS 17.6 and later.
     */
    public static final MTROzoneConcentrationMeasurementFeature LevelIndication = new MTROzoneConcentrationMeasurementFeature(2L);
    /**
     * @since Available in iOS 17.6 and later.
     */
    public static final MTROzoneConcentrationMeasurementFeature MediumLevel = new MTROzoneConcentrationMeasurementFeature(4L);
    /**
     * @since Available in iOS 17.6 and later.
     */
    public static final MTROzoneConcentrationMeasurementFeature CriticalLevel = new MTROzoneConcentrationMeasurementFeature(8L);
    /**
     * @since Available in iOS 17.6 and later.
     */
    public static final MTROzoneConcentrationMeasurementFeature PeakMeasurement = new MTROzoneConcentrationMeasurementFeature(16L);
    /**
     * @since Available in iOS 17.6 and later.
     */
    public static final MTROzoneConcentrationMeasurementFeature AverageMeasurement = new MTROzoneConcentrationMeasurementFeature(32L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTROzoneConcentrationMeasurementFeature/*</name>*/[] values = _values(/*<name>*/MTROzoneConcentrationMeasurementFeature/*</name>*/.class);

    public /*<name>*/MTROzoneConcentrationMeasurementFeature/*</name>*/(long value) { super(value); }
    private /*<name>*/MTROzoneConcentrationMeasurementFeature/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTROzoneConcentrationMeasurementFeature/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTROzoneConcentrationMeasurementFeature/*</name>*/(value, mask);
    }
    protected /*<name>*/MTROzoneConcentrationMeasurementFeature/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTROzoneConcentrationMeasurementFeature/*</name>*/[] values() {
        return values.clone();
    }
}
