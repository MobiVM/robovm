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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INMediaUserContext/*</name>*/ 
    extends /*<extends>*/INUserContext/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INMediaUserContextPtr extends Ptr<INMediaUserContext, INMediaUserContextPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INMediaUserContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INMediaUserContext() {}
    protected INMediaUserContext(Handle h, long handle) { super(h, handle); }
    protected INMediaUserContext(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "subscriptionStatus")
    public native INMediaUserContextSubscriptionStatus getSubscriptionStatus();
    @Property(selector = "setSubscriptionStatus:")
    public native void setSubscriptionStatus(INMediaUserContextSubscriptionStatus v);
    @Property(selector = "numberOfLibraryItems")
    public native NSNumber getNumberOfLibraryItems();
    @Property(selector = "setNumberOfLibraryItems:")
    public native void setNumberOfLibraryItems(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
