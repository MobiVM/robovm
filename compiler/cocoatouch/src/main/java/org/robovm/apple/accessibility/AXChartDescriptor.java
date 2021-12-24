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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AXChartDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AXChartDescriptorPtr extends Ptr<AXChartDescriptor, AXChartDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AXChartDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AXChartDescriptor() {}
    protected AXChartDescriptor(Handle h, long handle) { super(h, handle); }
    protected AXChartDescriptor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTitle:summary:xAxisDescriptor:yAxisDescriptor:series:")
    public AXChartDescriptor(String title, String summary, AXDataAxisDescriptor xAxis, AXNumericDataAxisDescriptor yAxis, NSArray<AXDataSeriesDescriptor> series) { super((SkipInit) null); initObject(init(title, summary, xAxis, yAxis, series)); }
    @Method(selector = "initWithAttributedTitle:summary:xAxisDescriptor:yAxisDescriptor:series:")
    public AXChartDescriptor(NSAttributedString attributedTitle, String summary, AXDataAxisDescriptor xAxis, AXNumericDataAxisDescriptor yAxis, NSArray<AXDataSeriesDescriptor> series) { super((SkipInit) null); initObject(init(attributedTitle, summary, xAxis, yAxis, series)); }
    @Method(selector = "initWithTitle:summary:xAxisDescriptor:yAxisDescriptor:additionalAxes:series:")
    public AXChartDescriptor(String title, String summary, AXDataAxisDescriptor xAxis, AXNumericDataAxisDescriptor yAxis, NSArray<?> additionalAxes, NSArray<AXDataSeriesDescriptor> series) { super((SkipInit) null); initObject(init(title, summary, xAxis, yAxis, additionalAxes, series)); }
    @Method(selector = "initWithAttributedTitle:summary:xAxisDescriptor:yAxisDescriptor:additionalAxes:series:")
    public AXChartDescriptor(NSAttributedString attributedTitle, String summary, AXDataAxisDescriptor xAxis, AXNumericDataAxisDescriptor yAxis, NSArray<?> additionalAxes, NSArray<AXDataSeriesDescriptor> series) { super((SkipInit) null); initObject(init(attributedTitle, summary, xAxis, yAxis, additionalAxes, series)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "attributedTitle")
    public native NSAttributedString getAttributedTitle();
    @Property(selector = "setAttributedTitle:")
    public native void setAttributedTitle(NSAttributedString v);
    @Property(selector = "summary")
    public native String getSummary();
    @Property(selector = "setSummary:")
    public native void setSummary(String v);
    @Property(selector = "contentDirection")
    public native AXChartDescriptorContentDirection getContentDirection();
    @Property(selector = "setContentDirection:")
    public native void setContentDirection(AXChartDescriptorContentDirection v);
    @Property(selector = "contentFrame")
    public native @ByVal CGRect getContentFrame();
    @Property(selector = "setContentFrame:")
    public native void setContentFrame(@ByVal CGRect v);
    @Property(selector = "series")
    public native NSArray<AXDataSeriesDescriptor> getSeries();
    @Property(selector = "setSeries:")
    public native void setSeries(NSArray<AXDataSeriesDescriptor> v);
    @Property(selector = "xAxis")
    public native AXDataAxisDescriptor getXAxis();
    @Property(selector = "setXAxis:")
    public native void setXAxis(AXDataAxisDescriptor v);
    @Property(selector = "yAxis")
    public native AXNumericDataAxisDescriptor getYAxis();
    @Property(selector = "setYAxis:")
    public native void setYAxis(AXNumericDataAxisDescriptor v);
    @Property(selector = "additionalAxes")
    public native NSArray<?> getAdditionalAxes();
    @Property(selector = "setAdditionalAxes:")
    public native void setAdditionalAxes(NSArray<?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTitle:summary:xAxisDescriptor:yAxisDescriptor:series:")
    protected native @Pointer long init(String title, String summary, AXDataAxisDescriptor xAxis, AXNumericDataAxisDescriptor yAxis, NSArray<AXDataSeriesDescriptor> series);
    @Method(selector = "initWithAttributedTitle:summary:xAxisDescriptor:yAxisDescriptor:series:")
    protected native @Pointer long init(NSAttributedString attributedTitle, String summary, AXDataAxisDescriptor xAxis, AXNumericDataAxisDescriptor yAxis, NSArray<AXDataSeriesDescriptor> series);
    @Method(selector = "initWithTitle:summary:xAxisDescriptor:yAxisDescriptor:additionalAxes:series:")
    protected native @Pointer long init(String title, String summary, AXDataAxisDescriptor xAxis, AXNumericDataAxisDescriptor yAxis, NSArray<?> additionalAxes, NSArray<AXDataSeriesDescriptor> series);
    @Method(selector = "initWithAttributedTitle:summary:xAxisDescriptor:yAxisDescriptor:additionalAxes:series:")
    protected native @Pointer long init(NSAttributedString attributedTitle, String summary, AXDataAxisDescriptor xAxis, AXNumericDataAxisDescriptor yAxis, NSArray<?> additionalAxes, NSArray<AXDataSeriesDescriptor> series);
    /*</methods>*/
}
