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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRActionsClusterStateChangedEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRActionsClusterStateChangedEventPtr extends Ptr<MTRActionsClusterStateChangedEvent, MTRActionsClusterStateChangedEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRActionsClusterStateChangedEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRActionsClusterStateChangedEvent() {}
    protected MTRActionsClusterStateChangedEvent(Handle h, long handle) { super(h, handle); }
    protected MTRActionsClusterStateChangedEvent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "actionID")
    public native NSNumber getActionID();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setActionID:")
    public native void setActionID(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "invokeID")
    public native NSNumber getInvokeID();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setInvokeID:")
    public native void setInvokeID(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "getNewState")
    public native NSNumber getNewState();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setNewState:")
    public native void setNewState(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
