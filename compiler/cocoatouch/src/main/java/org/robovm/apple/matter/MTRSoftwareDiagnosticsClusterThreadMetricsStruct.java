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
 * @since Available in iOS 16.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRSoftwareDiagnosticsClusterThreadMetricsStruct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRSoftwareDiagnosticsClusterThreadMetricsStructPtr extends Ptr<MTRSoftwareDiagnosticsClusterThreadMetricsStruct, MTRSoftwareDiagnosticsClusterThreadMetricsStructPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRSoftwareDiagnosticsClusterThreadMetricsStruct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRSoftwareDiagnosticsClusterThreadMetricsStruct() {}
    protected MTRSoftwareDiagnosticsClusterThreadMetricsStruct(Handle h, long handle) { super(h, handle); }
    protected MTRSoftwareDiagnosticsClusterThreadMetricsStruct(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "id")
    public native NSNumber getId();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setId:")
    public native void setId(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "name")
    public native String getName();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setName:")
    public native void setName(String v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "stackFreeCurrent")
    public native NSNumber getStackFreeCurrent();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setStackFreeCurrent:")
    public native void setStackFreeCurrent(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "stackFreeMinimum")
    public native NSNumber getStackFreeMinimum();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setStackFreeMinimum:")
    public native void setStackFreeMinimum(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "stackSize")
    public native NSNumber getStackSize();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setStackSize:")
    public native void setStackSize(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
