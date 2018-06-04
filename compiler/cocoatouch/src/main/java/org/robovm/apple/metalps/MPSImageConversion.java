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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSImageConversion/*</name>*/ 
    extends /*<extends>*/MPSUnaryImageKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSImageConversionPtr extends Ptr<MPSImageConversion, MPSImageConversionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSImageConversion.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSImageConversion() {}
    protected MPSImageConversion(Handle h, long handle) { super(h, handle); }
    protected MPSImageConversion(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:srcAlpha:destAlpha:backgroundColor:conversionInfo:")
    public MPSImageConversion(MTLDevice device, MPSAlphaType srcAlpha, MPSAlphaType destAlpha, MachineSizedFloatPtr backgroundColor, CGColorConversionInfo conversionInfo) { super((SkipInit) null); initObject(init(device, srcAlpha, destAlpha, backgroundColor, conversionInfo)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sourceAlpha")
    public native MPSAlphaType getSourceAlpha();
    @Property(selector = "destinationAlpha")
    public native MPSAlphaType getDestinationAlpha();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:srcAlpha:destAlpha:backgroundColor:conversionInfo:")
    protected native @Pointer long init(MTLDevice device, MPSAlphaType srcAlpha, MPSAlphaType destAlpha, MachineSizedFloatPtr backgroundColor, CGColorConversionInfo conversionInfo);
    /*</methods>*/
}
