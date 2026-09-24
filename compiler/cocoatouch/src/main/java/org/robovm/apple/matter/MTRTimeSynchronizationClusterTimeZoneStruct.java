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
 * @since Available in iOS 16.5 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRTimeSynchronizationClusterTimeZoneStruct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRTimeSynchronizationClusterTimeZoneStructPtr extends Ptr<MTRTimeSynchronizationClusterTimeZoneStruct, MTRTimeSynchronizationClusterTimeZoneStructPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRTimeSynchronizationClusterTimeZoneStruct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRTimeSynchronizationClusterTimeZoneStruct() {}
    protected MTRTimeSynchronizationClusterTimeZoneStruct(Handle h, long handle) { super(h, handle); }
    protected MTRTimeSynchronizationClusterTimeZoneStruct(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.5 and later.
     */
    @Property(selector = "offset")
    public native NSNumber getOffset();
    /**
     * @since Available in iOS 16.5 and later.
     */
    @Property(selector = "setOffset:")
    public native void setOffset(NSNumber v);
    /**
     * @since Available in iOS 16.5 and later.
     */
    @Property(selector = "validAt")
    public native NSNumber getValidAt();
    /**
     * @since Available in iOS 16.5 and later.
     */
    @Property(selector = "setValidAt:")
    public native void setValidAt(NSNumber v);
    /**
     * @since Available in iOS 16.5 and later.
     */
    @Property(selector = "name")
    public native String getName();
    /**
     * @since Available in iOS 16.5 and later.
     */
    @Property(selector = "setName:")
    public native void setName(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
