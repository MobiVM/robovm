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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRMediaPlaybackClusterPlaybackPositionStruct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRMediaPlaybackClusterPlaybackPositionStructPtr extends Ptr<MTRMediaPlaybackClusterPlaybackPositionStruct, MTRMediaPlaybackClusterPlaybackPositionStructPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRMediaPlaybackClusterPlaybackPositionStruct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRMediaPlaybackClusterPlaybackPositionStruct() {}
    protected MTRMediaPlaybackClusterPlaybackPositionStruct(Handle h, long handle) { super(h, handle); }
    protected MTRMediaPlaybackClusterPlaybackPositionStruct(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "updatedAt")
    public native NSNumber getUpdatedAt();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setUpdatedAt:")
    public native void setUpdatedAt(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "position")
    public native NSNumber getPosition();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setPosition:")
    public native void setPosition(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
