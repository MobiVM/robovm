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
package org.robovm.apple.coregraphics;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGContentInfo/*</name>*/ 
    extends /*<extends>*/Struct<CGContentInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CGContentInfoPtr extends Ptr<CGContentInfo, CGContentInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CGContentInfo() {}
    public CGContentInfo(CGComponent deepestImageComponent, CGColorModel contentColorModels, boolean hasWideGamut, boolean hasTransparency, float largestContentHeadroom) {
        this.setDeepestImageComponent(deepestImageComponent);
        this.setContentColorModels(contentColorModels);
        this.setHasWideGamut(hasWideGamut);
        this.setHasTransparency(hasTransparency);
        this.setLargestContentHeadroom(largestContentHeadroom);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native CGComponent getDeepestImageComponent();
    @StructMember(0) public native CGContentInfo setDeepestImageComponent(CGComponent deepestImageComponent);
    @StructMember(1) public native CGColorModel getContentColorModels();
    @StructMember(1) public native CGContentInfo setContentColorModels(CGColorModel contentColorModels);
    @StructMember(2) public native boolean isHasWideGamut();
    @StructMember(2) public native CGContentInfo setHasWideGamut(boolean hasWideGamut);
    @StructMember(3) public native boolean isHasTransparency();
    @StructMember(3) public native CGContentInfo setHasTransparency(boolean hasTransparency);
    @StructMember(4) public native float getLargestContentHeadroom();
    @StructMember(4) public native CGContentInfo setLargestContentHeadroom(float largestContentHeadroom);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
