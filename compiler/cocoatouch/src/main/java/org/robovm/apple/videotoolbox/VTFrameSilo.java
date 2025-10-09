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
package org.robovm.apple.videotoolbox;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("VideoToolbox")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VTFrameSilo/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VTFrameSiloPtr extends Ptr<VTFrameSilo, VTFrameSiloPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(VTFrameSilo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VTFrameSilo() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="VTFrameSiloGetTypeID", optional=true)
    public static native @MachineSizedUInt long typeID();
    @Bridge(symbol="VTFrameSiloCreate", optional=true)
    public static native OSStatus create(CFAllocator allocator, CFURL fileURL, @ByVal CMTimeRange timeRange, CFDictionary options, VTFrameSilo.VTFrameSiloPtr frameSiloOut);
    @Bridge(symbol="VTFrameSiloAddSampleBuffer", optional=true)
    public native OSStatus addSampleBuffer(CMSampleBuffer sampleBuffer);
    @Bridge(symbol="VTFrameSiloSetTimeRangesForNextPass", optional=true)
    public native OSStatus setTimeRangesForNextPass(@MachineSizedSInt long timeRangeCount, CMTimeRange timeRangeArray);
    @Bridge(symbol="VTFrameSiloGetProgressOfCurrentPass", optional=true)
    public native OSStatus getProgressOfCurrentPass(FloatPtr progressOut);
    @Bridge(symbol="VTFrameSiloCallFunctionForEachSampleBuffer", optional=true)
    public native OSStatus callFunctionForEachSampleBuffer(@ByVal CMTimeRange timeRange, VoidPtr refcon, FunctionPtr callback);
    @Bridge(symbol="VTFrameSiloCallBlockForEachSampleBuffer", optional=true)
    public native OSStatus callBlockForEachSampleBuffer(@ByVal CMTimeRange timeRange, @Block Block1<CMSampleBuffer, OSStatus> handler);
    /*</methods>*/
}
