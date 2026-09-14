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
package org.robovm.apple.carplay;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.mapkit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coremedia.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPLocationCoordinate3D/*</name>*/ 
    extends /*<extends>*/Struct<CPLocationCoordinate3D>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CPLocationCoordinate3DPtr extends Ptr<CPLocationCoordinate3D, CPLocationCoordinate3DPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CPLocationCoordinate3D() {}
    public CPLocationCoordinate3D(double latitude, double longitude, double altitude) {
        this.setLatitude(latitude);
        this.setLongitude(longitude);
        this.setAltitude(altitude);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native double getLatitude();
    @StructMember(0) public native CPLocationCoordinate3D setLatitude(double latitude);
    @StructMember(1) public native double getLongitude();
    @StructMember(1) public native CPLocationCoordinate3D setLongitude(double longitude);
    @StructMember(2) public native double getAltitude();
    @StructMember(2) public native CPLocationCoordinate3D setAltitude(double altitude);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
