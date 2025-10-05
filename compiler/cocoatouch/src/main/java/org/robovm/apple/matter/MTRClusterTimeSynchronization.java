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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRClusterTimeSynchronization/*</name>*/ 
    extends /*<extends>*/MTRGenericCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRClusterTimeSynchronizationPtr extends Ptr<MTRClusterTimeSynchronization, MTRClusterTimeSynchronizationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRClusterTimeSynchronization.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRClusterTimeSynchronization() {}
    protected MTRClusterTimeSynchronization(Handle h, long handle) { super(h, handle); }
    protected MTRClusterTimeSynchronization(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRClusterTimeSynchronization(MTRDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "setUTCTimeWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setUTCTime(MTRTimeSynchronizationClusterSetUTCTimeParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "setTrustedTimeSourceWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setTrustedTimeSource(MTRTimeSynchronizationClusterSetTrustedTimeSourceParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "setTimeZoneWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setTimeZone(MTRTimeSynchronizationClusterSetTimeZoneParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRTimeSynchronizationClusterSetTimeZoneResponseParams, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "setDSTOffsetWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setDSTOffset(MTRTimeSynchronizationClusterSetDSTOffsetParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "setDefaultNTPWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setDefaultNTP(MTRTimeSynchronizationClusterSetDefaultNTPParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeUTCTimeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeUTCTime(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeGranularityWithParams:")
    public native NSDictionary<NSString, ?> readAttributeGranularity(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeTimeSourceWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTimeSource(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeTrustedTimeSourceWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTrustedTimeSource(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeDefaultNTPWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDefaultNTP(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeTimeZoneWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTimeZone(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeDSTOffsetWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDSTOffset(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeLocalTimeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeLocalTime(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeTimeZoneDatabaseWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTimeZoneDatabase(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeNTPServerAvailableWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNTPServerAvailable(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeTimeZoneListMaxSizeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTimeZoneListMaxSize(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeDSTOffsetListMaxSizeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDSTOffsetListMaxSize(MTRReadParams params);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "readAttributeSupportsDNSResolveWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSupportsDNSResolve(MTRReadParams params);
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
