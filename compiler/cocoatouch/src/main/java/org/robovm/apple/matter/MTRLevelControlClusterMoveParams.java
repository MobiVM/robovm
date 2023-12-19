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
 * @since Available in iOS 16.1 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRLevelControlClusterMoveParams/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRLevelControlClusterMoveParamsPtr extends Ptr<MTRLevelControlClusterMoveParams, MTRLevelControlClusterMoveParamsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRLevelControlClusterMoveParams.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRLevelControlClusterMoveParams() {}
    protected MTRLevelControlClusterMoveParams(Handle h, long handle) { super(h, handle); }
    protected MTRLevelControlClusterMoveParams(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "moveMode")
    public native NSNumber getMoveMode();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setMoveMode:")
    public native void setMoveMode(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "rate")
    public native NSNumber getRate();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setRate:")
    public native void setRate(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "optionsMask")
    public native NSNumber getOptionsMask();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setOptionsMask:")
    public native void setOptionsMask(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "optionsOverride")
    public native NSNumber getOptionsOverride();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setOptionsOverride:")
    public native void setOptionsOverride(NSNumber v);
    @Property(selector = "timedInvokeTimeoutMs")
    public native NSNumber getTimedInvokeTimeoutMs();
    @Property(selector = "setTimedInvokeTimeoutMs:")
    public native void setTimedInvokeTimeoutMs(NSNumber v);
    @Property(selector = "serverSideProcessingTimeout")
    public native NSNumber getServerSideProcessingTimeout();
    @Property(selector = "setServerSideProcessingTimeout:")
    public native void setServerSideProcessingTimeout(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
