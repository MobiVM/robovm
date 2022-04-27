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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AXDataSeriesDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AXDataSeriesDescriptorPtr extends Ptr<AXDataSeriesDescriptor, AXDataSeriesDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AXDataSeriesDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AXDataSeriesDescriptor() {}
    protected AXDataSeriesDescriptor(Handle h, long handle) { super(h, handle); }
    protected AXDataSeriesDescriptor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithName:isContinuous:dataPoints:")
    public AXDataSeriesDescriptor(String name, boolean isContinuous, NSArray<AXDataPoint> dataPoints) { super((SkipInit) null); initObject(init(name, isContinuous, dataPoints)); }
    @Method(selector = "initWithAttributedName:isContinuous:dataPoints:")
    public AXDataSeriesDescriptor(NSAttributedString attributedName, boolean isContinuous, NSArray<AXDataPoint> dataPoints) { super((SkipInit) null); initObject(init(attributedName, isContinuous, dataPoints)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "attributedName")
    public native NSAttributedString getAttributedName();
    @Property(selector = "setAttributedName:")
    public native void setAttributedName(NSAttributedString v);
    @Property(selector = "isContinuous")
    public native boolean isContinuous();
    @Property(selector = "setIsContinuous:")
    public native void setIsContinuous(boolean v);
    @Property(selector = "dataPoints")
    public native NSArray<AXDataPoint> getDataPoints();
    @Property(selector = "setDataPoints:")
    public native void setDataPoints(NSArray<AXDataPoint> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithName:isContinuous:dataPoints:")
    protected native @Pointer long init(String name, boolean isContinuous, NSArray<AXDataPoint> dataPoints);
    @Method(selector = "initWithAttributedName:isContinuous:dataPoints:")
    protected native @Pointer long init(NSAttributedString attributedName, boolean isContinuous, NSArray<AXDataPoint> dataPoints);
    /*</methods>*/
}
