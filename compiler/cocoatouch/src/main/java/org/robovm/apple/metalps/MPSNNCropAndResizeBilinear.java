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
package org.robovm.apple.metalps;

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
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNNCropAndResizeBilinear/*</name>*/ 
    extends /*<extends>*/MPSCNNKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNNCropAndResizeBilinearPtr extends Ptr<MPSNNCropAndResizeBilinear, MPSNNCropAndResizeBilinearPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNNCropAndResizeBilinear.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSNNCropAndResizeBilinear() {}
    protected MPSNNCropAndResizeBilinear(Handle h, long handle) { super(h, handle); }
    protected MPSNNCropAndResizeBilinear(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:resizeWidth:resizeHeight:numberOfRegions:regions:")
    public MPSNNCropAndResizeBilinear(MTLDevice device, @MachineSizedUInt long resizeWidth, @MachineSizedUInt long resizeHeight, @MachineSizedUInt long numberOfRegions, MPSRegion regions) { super((SkipInit) null); initObject(init(device, resizeWidth, resizeHeight, numberOfRegions, regions)); }
    @Method(selector = "initWithCoder:device:")
    public MPSNNCropAndResizeBilinear(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSNNCropAndResizeBilinear(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "resizeWidth")
    public native @MachineSizedUInt long getResizeWidth();
    @Property(selector = "resizeHeight")
    public native @MachineSizedUInt long getResizeHeight();
    @Property(selector = "numberOfRegions")
    public native @MachineSizedUInt long getNumberOfRegions();
    @Property(selector = "regions")
    public native MPSRegion getRegions();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:resizeWidth:resizeHeight:numberOfRegions:regions:")
    protected native @Pointer long init(MTLDevice device, @MachineSizedUInt long resizeWidth, @MachineSizedUInt long resizeHeight, @MachineSizedUInt long numberOfRegions, MPSRegion regions);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    /*</methods>*/
}
