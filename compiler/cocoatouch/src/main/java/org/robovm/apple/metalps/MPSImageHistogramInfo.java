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

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSImageHistogramInfo/*</name>*/ 
    extends /*<extends>*/Struct<MPSImageHistogramInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSImageHistogramInfoPtr extends Ptr<MPSImageHistogramInfo, MPSImageHistogramInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSImageHistogramInfo() {}
    public MPSImageHistogramInfo(@MachineSizedUInt long numberOfHistogramEntries, boolean histogramForAlpha, VectorFloat4 minPixelValue, VectorFloat4 maxPixelValue) {
        this.setNumberOfHistogramEntries(numberOfHistogramEntries);
        this.setHistogramForAlpha(histogramForAlpha);
        this.setMinPixelValue(minPixelValue);
        this.setMaxPixelValue(maxPixelValue);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @MachineSizedUInt long getNumberOfHistogramEntries();
    @StructMember(0) public native MPSImageHistogramInfo setNumberOfHistogramEntries(@MachineSizedUInt long numberOfHistogramEntries);
    @StructMember(1) public native boolean isHistogramForAlpha();
    @StructMember(1) public native MPSImageHistogramInfo setHistogramForAlpha(boolean histogramForAlpha);
    @StructMember(2) public native @ByVal VectorFloat4 getMinPixelValue();
    @StructMember(2) public native MPSImageHistogramInfo setMinPixelValue(@ByVal VectorFloat4 minPixelValue);
    @StructMember(3) public native @ByVal VectorFloat4 getMaxPixelValue();
    @StructMember(3) public native MPSImageHistogramInfo setMaxPixelValue(@ByVal VectorFloat4 maxPixelValue);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
