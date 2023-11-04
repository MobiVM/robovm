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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTROperationalCredentialsClusterFabricDescriptorStruct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTROperationalCredentialsClusterFabricDescriptorStructPtr extends Ptr<MTROperationalCredentialsClusterFabricDescriptorStruct, MTROperationalCredentialsClusterFabricDescriptorStructPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTROperationalCredentialsClusterFabricDescriptorStruct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTROperationalCredentialsClusterFabricDescriptorStruct() {}
    protected MTROperationalCredentialsClusterFabricDescriptorStruct(Handle h, long handle) { super(h, handle); }
    protected MTROperationalCredentialsClusterFabricDescriptorStruct(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "rootPublicKey")
    public native NSData getRootPublicKey();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setRootPublicKey:")
    public native void setRootPublicKey(NSData v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "vendorID")
    public native NSNumber getVendorID();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setVendorID:")
    public native void setVendorID(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "fabricID")
    public native NSNumber getFabricID();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setFabricID:")
    public native void setFabricID(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "nodeID")
    public native NSNumber getNodeID();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setNodeID:")
    public native void setNodeID(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "label")
    public native String getLabel();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "fabricIndex")
    public native NSNumber getFabricIndex();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setFabricIndex:")
    public native void setFabricIndex(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
