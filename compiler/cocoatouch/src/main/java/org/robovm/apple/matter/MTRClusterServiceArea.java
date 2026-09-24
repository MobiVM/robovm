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
package org.robovm.apple.matter;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRClusterServiceArea/*</name>*/ 
    extends /*<extends>*/MTRGenericCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRClusterServiceAreaPtr extends Ptr<MTRClusterServiceArea, MTRClusterServiceAreaPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRClusterServiceArea.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRClusterServiceArea() {}
    protected MTRClusterServiceArea(Handle h, long handle) { super(h, handle); }
    protected MTRClusterServiceArea(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRClusterServiceArea(MTRDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "selectAreasWithParams:expectedValues:expectedValueInterval:completion:")
    public native void selectAreas(MTRServiceAreaClusterSelectAreasParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRServiceAreaClusterSelectAreasResponseParams, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "skipAreaWithParams:expectedValues:expectedValueInterval:completion:")
    public native void skipArea(MTRServiceAreaClusterSkipAreaParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRServiceAreaClusterSkipAreaResponseParams, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeSupportedAreasWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSupportedAreas(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeSupportedMapsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSupportedMaps(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeSelectedAreasWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSelectedAreas(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeCurrentAreaWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCurrentArea(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeEstimatedEndTimeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeEstimatedEndTime(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeProgressWithParams:")
    public native NSDictionary<NSString, ?> readAttributeProgress(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeGeneratedCommandListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeGeneratedCommandList(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeAcceptedCommandListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcceptedCommandList(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeAttributeListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAttributeList(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeFeatureMapWithParams:")
    public native NSDictionary<NSString, ?> readAttributeFeatureMap(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeClusterRevisionWithParams:")
    public native NSDictionary<NSString, ?> readAttributeClusterRevision(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    protected native @Pointer long init(MTRDevice device, NSNumber endpointID, DispatchQueue queue);
    /*</methods>*/
}
