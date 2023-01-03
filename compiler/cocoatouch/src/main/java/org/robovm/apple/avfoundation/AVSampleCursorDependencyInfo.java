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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVSampleCursorDependencyInfo/*</name>*/ 
    extends /*<extends>*/Struct<AVSampleCursorDependencyInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVSampleCursorDependencyInfoPtr extends Ptr<AVSampleCursorDependencyInfo, AVSampleCursorDependencyInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVSampleCursorDependencyInfo() {}
    public AVSampleCursorDependencyInfo(boolean sampleIndicatesWhetherItHasDependentSamples, boolean sampleHasDependentSamples, boolean sampleIndicatesWhetherItDependsOnOthers, boolean sampleDependsOnOthers, boolean sampleIndicatesWhetherItHasRedundantCoding, boolean sampleHasRedundantCoding) {
        this.setSampleIndicatesWhetherItHasDependentSamples(sampleIndicatesWhetherItHasDependentSamples);
        this.setSampleHasDependentSamples(sampleHasDependentSamples);
        this.setSampleIndicatesWhetherItDependsOnOthers(sampleIndicatesWhetherItDependsOnOthers);
        this.setSampleDependsOnOthers(sampleDependsOnOthers);
        this.setSampleIndicatesWhetherItHasRedundantCoding(sampleIndicatesWhetherItHasRedundantCoding);
        this.setSampleHasRedundantCoding(sampleHasRedundantCoding);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native boolean isSampleIndicatesWhetherItHasDependentSamples();
    @StructMember(0) public native AVSampleCursorDependencyInfo setSampleIndicatesWhetherItHasDependentSamples(boolean sampleIndicatesWhetherItHasDependentSamples);
    @StructMember(1) public native boolean isSampleHasDependentSamples();
    @StructMember(1) public native AVSampleCursorDependencyInfo setSampleHasDependentSamples(boolean sampleHasDependentSamples);
    @StructMember(2) public native boolean isSampleIndicatesWhetherItDependsOnOthers();
    @StructMember(2) public native AVSampleCursorDependencyInfo setSampleIndicatesWhetherItDependsOnOthers(boolean sampleIndicatesWhetherItDependsOnOthers);
    @StructMember(3) public native boolean isSampleDependsOnOthers();
    @StructMember(3) public native AVSampleCursorDependencyInfo setSampleDependsOnOthers(boolean sampleDependsOnOthers);
    @StructMember(4) public native boolean isSampleIndicatesWhetherItHasRedundantCoding();
    @StructMember(4) public native AVSampleCursorDependencyInfo setSampleIndicatesWhetherItHasRedundantCoding(boolean sampleIndicatesWhetherItHasRedundantCoding);
    @StructMember(5) public native boolean isSampleHasRedundantCoding();
    @StructMember(5) public native AVSampleCursorDependencyInfo setSampleHasRedundantCoding(boolean sampleHasRedundantCoding);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
