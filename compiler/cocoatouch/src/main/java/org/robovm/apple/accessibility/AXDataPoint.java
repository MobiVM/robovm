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
package org.robovm.apple.accessibility;

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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Accessibility") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AXDataPoint/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AXDataPointPtr extends Ptr<AXDataPoint, AXDataPointPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AXDataPoint.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AXDataPoint() {}
    protected AXDataPoint(Handle h, long handle) { super(h, handle); }
    protected AXDataPoint(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithX:y:")
    public AXDataPoint(AXDataPointValue xValue, AXDataPointValue yValue) { super((SkipInit) null); initObject(init(xValue, yValue)); }
    @Method(selector = "initWithX:y:additionalValues:")
    public AXDataPoint(AXDataPointValue xValue, AXDataPointValue yValue, NSArray<AXDataPointValue> additionalValues) { super((SkipInit) null); initObject(init(xValue, yValue, additionalValues)); }
    @Method(selector = "initWithX:y:additionalValues:label:")
    public AXDataPoint(AXDataPointValue xValue, AXDataPointValue yValue, NSArray<AXDataPointValue> additionalValues, String label) { super((SkipInit) null); initObject(init(xValue, yValue, additionalValues, label)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "xValue")
    public native AXDataPointValue getXValue();
    @Property(selector = "setXValue:")
    public native void setXValue(AXDataPointValue v);
    @Property(selector = "yValue")
    public native AXDataPointValue getYValue();
    @Property(selector = "setYValue:")
    public native void setYValue(AXDataPointValue v);
    @Property(selector = "additionalValues")
    public native NSArray<AXDataPointValue> getAdditionalValues();
    @Property(selector = "setAdditionalValues:")
    public native void setAdditionalValues(NSArray<AXDataPointValue> v);
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    @Property(selector = "attributedLabel")
    public native NSAttributedString getAttributedLabel();
    @Property(selector = "setAttributedLabel:")
    public native void setAttributedLabel(NSAttributedString v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithX:y:")
    protected native @Pointer long init(AXDataPointValue xValue, AXDataPointValue yValue);
    @Method(selector = "initWithX:y:additionalValues:")
    protected native @Pointer long init(AXDataPointValue xValue, AXDataPointValue yValue, NSArray<AXDataPointValue> additionalValues);
    @Method(selector = "initWithX:y:additionalValues:label:")
    protected native @Pointer long init(AXDataPointValue xValue, AXDataPointValue yValue, NSArray<AXDataPointValue> additionalValues, String label);
    /*</methods>*/
}
