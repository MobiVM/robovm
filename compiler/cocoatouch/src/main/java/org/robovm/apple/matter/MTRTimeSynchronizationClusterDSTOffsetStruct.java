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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRTimeSynchronizationClusterDSTOffsetStruct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRTimeSynchronizationClusterDSTOffsetStructPtr extends Ptr<MTRTimeSynchronizationClusterDSTOffsetStruct, MTRTimeSynchronizationClusterDSTOffsetStructPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRTimeSynchronizationClusterDSTOffsetStruct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRTimeSynchronizationClusterDSTOffsetStruct() {}
    protected MTRTimeSynchronizationClusterDSTOffsetStruct(Handle h, long handle) { super(h, handle); }
    protected MTRTimeSynchronizationClusterDSTOffsetStruct(SkipInit skipInit) { super(skipInit); }
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
    @Property(selector = "validStarting")
    public native NSNumber getValidStarting();
    /**
     * @since Available in iOS 16.5 and later.
     */
    @Property(selector = "setValidStarting:")
    public native void setValidStarting(NSNumber v);
    /**
     * @since Available in iOS 16.5 and later.
     */
    @Property(selector = "validUntil")
    public native NSNumber getValidUntil();
    /**
     * @since Available in iOS 16.5 and later.
     */
    @Property(selector = "setValidUntil:")
    public native void setValidUntil(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
