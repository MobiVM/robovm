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
 * @since Available in iOS 17.6 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRClusterValveConfigurationAndControl/*</name>*/ 
    extends /*<extends>*/MTRGenericCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRClusterValveConfigurationAndControlPtr extends Ptr<MTRClusterValveConfigurationAndControl, MTRClusterValveConfigurationAndControlPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRClusterValveConfigurationAndControl.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRClusterValveConfigurationAndControl() {}
    protected MTRClusterValveConfigurationAndControl(Handle h, long handle) { super(h, handle); }
    protected MTRClusterValveConfigurationAndControl(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRClusterValveConfigurationAndControl(MTRDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "openWithParams:expectedValues:expectedValueInterval:completion:")
    public native void open(MTRValveConfigurationAndControlClusterOpenParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "openWithExpectedValues:expectedValueInterval:completion:")
    public native void open(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "closeWithParams:expectedValues:expectedValueInterval:completion:")
    public native void close(MTRValveConfigurationAndControlClusterCloseParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "closeWithExpectedValues:expectedValueInterval:completion:")
    public native void close(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeOpenDurationWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOpenDuration(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeDefaultOpenDurationWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDefaultOpenDuration(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "writeAttributeDefaultOpenDurationWithValue:expectedValueInterval:")
    public native void writeAttributeDefaultOpenDuration(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "writeAttributeDefaultOpenDurationWithValue:expectedValueInterval:params:")
    public native void writeAttributeDefaultOpenDuration(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeAutoCloseTimeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAutoCloseTime(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeRemainingDurationWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRemainingDuration(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeCurrentStateWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCurrentState(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeTargetStateWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTargetState(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeCurrentLevelWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCurrentLevel(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeTargetLevelWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTargetLevel(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeDefaultOpenLevelWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDefaultOpenLevel(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "writeAttributeDefaultOpenLevelWithValue:expectedValueInterval:")
    public native void writeAttributeDefaultOpenLevel(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "writeAttributeDefaultOpenLevelWithValue:expectedValueInterval:params:")
    public native void writeAttributeDefaultOpenLevel(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeValveFaultWithParams:")
    public native NSDictionary<NSString, ?> readAttributeValveFault(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeLevelStepWithParams:")
    public native NSDictionary<NSString, ?> readAttributeLevelStep(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeGeneratedCommandListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeGeneratedCommandList(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeAcceptedCommandListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcceptedCommandList(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeAttributeListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAttributeList(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeFeatureMapWithParams:")
    public native NSDictionary<NSString, ?> readAttributeFeatureMap(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "readAttributeClusterRevisionWithParams:")
    public native NSDictionary<NSString, ?> readAttributeClusterRevision(MTRReadParams params);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    protected native @Pointer long init(MTRDevice device, NSNumber endpointID, DispatchQueue queue);
    /*</methods>*/
}
