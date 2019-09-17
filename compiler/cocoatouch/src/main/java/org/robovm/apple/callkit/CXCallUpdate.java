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
package org.robovm.apple.callkit;

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
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CallKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CXCallUpdate/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CXCallUpdatePtr extends Ptr<CXCallUpdate, CXCallUpdatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CXCallUpdate.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CXCallUpdate() {}
    protected CXCallUpdate(Handle h, long handle) { super(h, handle); }
    protected CXCallUpdate(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "remoteHandle")
    public native CXHandle getRemoteHandle();
    @Property(selector = "setRemoteHandle:")
    public native void setRemoteHandle(CXHandle v);
    @Property(selector = "localizedCallerName")
    public native String getLocalizedCallerName();
    @Property(selector = "setLocalizedCallerName:")
    public native void setLocalizedCallerName(String v);
    @Property(selector = "supportsHolding")
    public native boolean supportsHolding();
    @Property(selector = "setSupportsHolding:")
    public native void setSupportsHolding(boolean v);
    @Property(selector = "supportsGrouping")
    public native boolean supportsGrouping();
    @Property(selector = "setSupportsGrouping:")
    public native void setSupportsGrouping(boolean v);
    @Property(selector = "supportsUngrouping")
    public native boolean supportsUngrouping();
    @Property(selector = "setSupportsUngrouping:")
    public native void setSupportsUngrouping(boolean v);
    @Property(selector = "supportsDTMF")
    public native boolean supportsDTMF();
    @Property(selector = "setSupportsDTMF:")
    public native void setSupportsDTMF(boolean v);
    @Property(selector = "hasVideo")
    public native boolean hasVideo();
    @Property(selector = "setHasVideo:")
    public native void setHasVideo(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
