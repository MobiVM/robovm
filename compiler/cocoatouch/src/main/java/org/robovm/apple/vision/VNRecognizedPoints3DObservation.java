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
package org.robovm.apple.vision;

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
import org.robovm.apple.coreml.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Vision") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNRecognizedPoints3DObservation/*</name>*/ 
    extends /*<extends>*/VNObservation/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNRecognizedPoints3DObservationPtr extends Ptr<VNRecognizedPoints3DObservation, VNRecognizedPoints3DObservationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNRecognizedPoints3DObservation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VNRecognizedPoints3DObservation() {}
    protected VNRecognizedPoints3DObservation(Handle h, long handle) { super(h, handle); }
    protected VNRecognizedPoints3DObservation(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "availableKeys")
    public native NSArray<NSString> getAvailableKeys();
    @Property(selector = "availableGroupKeys")
    public native NSArray<NSString> getAvailableGroupKeys();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public VNRecognizedPoint3D getRecognizedPoint(VNRecognizedPointKey pointKey) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       VNRecognizedPoint3D result = getRecognizedPoint(pointKey, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "recognizedPointForKey:error:")
    private native VNRecognizedPoint3D getRecognizedPoint(VNRecognizedPointKey pointKey, NSError.NSErrorPtr error);
    public NSDictionary<NSString, VNRecognizedPoint3D> getRecognizedPoint(VNRecognizedPointGroupKey groupKey) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSDictionary<NSString, VNRecognizedPoint3D> result = getRecognizedPoint(groupKey, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "recognizedPointsForGroupKey:error:")
    private native NSDictionary<NSString, VNRecognizedPoint3D> getRecognizedPoint(VNRecognizedPointGroupKey groupKey, NSError.NSErrorPtr error);
    /*</methods>*/
}
