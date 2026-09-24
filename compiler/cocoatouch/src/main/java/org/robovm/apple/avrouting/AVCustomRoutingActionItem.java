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
package org.robovm.apple.avrouting;

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
import org.robovm.apple.network.*;
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVRouting") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCustomRoutingActionItem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCustomRoutingActionItemPtr extends Ptr<AVCustomRoutingActionItem, AVCustomRoutingActionItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCustomRoutingActionItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVCustomRoutingActionItem() {}
    protected AVCustomRoutingActionItem(Handle h, long handle) { super(h, handle); }
    protected AVCustomRoutingActionItem(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "type")
    public native UTType getType();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setType:")
    public native void setType(UTType v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "overrideTitle")
    public native String getOverrideTitle();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setOverrideTitle:")
    public native void setOverrideTitle(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
