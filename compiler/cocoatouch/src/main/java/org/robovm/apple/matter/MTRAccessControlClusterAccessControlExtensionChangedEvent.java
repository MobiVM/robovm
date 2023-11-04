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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRAccessControlClusterAccessControlExtensionChangedEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRAccessControlClusterAccessControlExtensionChangedEventPtr extends Ptr<MTRAccessControlClusterAccessControlExtensionChangedEvent, MTRAccessControlClusterAccessControlExtensionChangedEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRAccessControlClusterAccessControlExtensionChangedEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRAccessControlClusterAccessControlExtensionChangedEvent() {}
    protected MTRAccessControlClusterAccessControlExtensionChangedEvent(Handle h, long handle) { super(h, handle); }
    protected MTRAccessControlClusterAccessControlExtensionChangedEvent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "adminNodeID")
    public native NSNumber getAdminNodeID();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setAdminNodeID:")
    public native void setAdminNodeID(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "adminPasscodeID")
    public native NSNumber getAdminPasscodeID();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setAdminPasscodeID:")
    public native void setAdminPasscodeID(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "changeType")
    public native NSNumber getChangeType();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setChangeType:")
    public native void setChangeType(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "latestValue")
    public native MTRAccessControlClusterAccessControlExtensionStruct getLatestValue();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setLatestValue:")
    public native void setLatestValue(MTRAccessControlClusterAccessControlExtensionStruct v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "fabricIndex")
    public native NSNumber getFabricIndex();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setFabricIndex:")
    public native void setFabricIndex(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
