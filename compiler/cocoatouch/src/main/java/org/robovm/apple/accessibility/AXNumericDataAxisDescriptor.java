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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AXNumericDataAxisDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements AXDataAxisDescriptor/*</implements>*/ {

    /*<ptr>*/public static class AXNumericDataAxisDescriptorPtr extends Ptr<AXNumericDataAxisDescriptor, AXNumericDataAxisDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AXNumericDataAxisDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AXNumericDataAxisDescriptor() {}
    protected AXNumericDataAxisDescriptor(Handle h, long handle) { super(h, handle); }
    protected AXNumericDataAxisDescriptor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTitle:lowerBound:upperBound:gridlinePositions:valueDescriptionProvider:")
    public AXNumericDataAxisDescriptor(String title, double lowerbound, double upperBound, NSArray<NSNumber> gridlinePositions, @Block Block1<Double, String> valueDescriptionProvider) { super((SkipInit) null); initObject(init(title, lowerbound, upperBound, gridlinePositions, valueDescriptionProvider)); }
    @Method(selector = "initWithAttributedTitle:lowerBound:upperBound:gridlinePositions:valueDescriptionProvider:")
    public AXNumericDataAxisDescriptor(NSAttributedString attributedTitle, double lowerbound, double upperBound, NSArray<NSNumber> gridlinePositions, @Block Block1<Double, String> valueDescriptionProvider) { super((SkipInit) null); initObject(init(attributedTitle, lowerbound, upperBound, gridlinePositions, valueDescriptionProvider)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "scaleType")
    public native AXNumericDataAxisDescriptorScale getScaleType();
    @Property(selector = "setScaleType:")
    public native void setScaleType(AXNumericDataAxisDescriptorScale v);
    @Property(selector = "lowerBound")
    public native double getLowerBound();
    @Property(selector = "setLowerBound:")
    public native void setLowerBound(double v);
    @Property(selector = "upperBound")
    public native double getUpperBound();
    @Property(selector = "setUpperBound:")
    public native void setUpperBound(double v);
    @Property(selector = "valueDescriptionProvider")
    public native @Block Block1<Double, String> getValueDescriptionProvider();
    @Property(selector = "setValueDescriptionProvider:")
    public native void setValueDescriptionProvider(@Block Block1<Double, String> v);
    @Property(selector = "gridlinePositions")
    public native NSArray<NSNumber> getGridlinePositions();
    @Property(selector = "setGridlinePositions:")
    public native void setGridlinePositions(NSArray<NSNumber> v);
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "attributedTitle")
    public native NSAttributedString getAttributedTitle();
    @Property(selector = "setAttributedTitle:")
    public native void setAttributedTitle(NSAttributedString v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTitle:lowerBound:upperBound:gridlinePositions:valueDescriptionProvider:")
    protected native @Pointer long init(String title, double lowerbound, double upperBound, NSArray<NSNumber> gridlinePositions, @Block Block1<Double, String> valueDescriptionProvider);
    @Method(selector = "initWithAttributedTitle:lowerBound:upperBound:gridlinePositions:valueDescriptionProvider:")
    protected native @Pointer long init(NSAttributedString attributedTitle, double lowerbound, double upperBound, NSArray<NSNumber> gridlinePositions, @Block Block1<Double, String> valueDescriptionProvider);
    /*</methods>*/
}
