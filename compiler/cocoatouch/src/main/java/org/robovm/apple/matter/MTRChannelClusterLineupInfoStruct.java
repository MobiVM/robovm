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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRChannelClusterLineupInfoStruct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRChannelClusterLineupInfoStructPtr extends Ptr<MTRChannelClusterLineupInfoStruct, MTRChannelClusterLineupInfoStructPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRChannelClusterLineupInfoStruct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRChannelClusterLineupInfoStruct() {}
    protected MTRChannelClusterLineupInfoStruct(Handle h, long handle) { super(h, handle); }
    protected MTRChannelClusterLineupInfoStruct(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "operatorName")
    public native String getOperatorName();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setOperatorName:")
    public native void setOperatorName(String v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "lineupName")
    public native String getLineupName();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setLineupName:")
    public native void setLineupName(String v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "postalCode")
    public native String getPostalCode();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setPostalCode:")
    public native void setPostalCode(String v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "lineupInfoType")
    public native NSNumber getLineupInfoType();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setLineupInfoType:")
    public native void setLineupInfoType(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
