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
package org.robovm.apple.dispatch;

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
/*</imports>*/
import org.robovm.apple.foundation.CocoaUtility;

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("System")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ final class /*<name>*/DispatchBlock/*</name>*/
    extends /*<extends>*/CocoaUtility/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(DispatchBlock.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    private DispatchBlock() {
    }

    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="dispatch_block_create", optional=true)
    public static native @Block Runnable create(DispatchBlockFlags flags, @Block Runnable block);
    @Bridge(symbol="dispatch_block_create_with_qos_class", optional=true)
    public static native @Block Runnable createWithQosClass(DispatchBlockFlags flags, int qos_class, int relative_priority, @Block Runnable block);
    @Bridge(symbol="dispatch_block_perform", optional=true)
    public static native void perform(DispatchBlockFlags flags, @Block Runnable block);
    @Bridge(symbol="dispatch_block_wait", optional=true)
    public static native @MachineSizedSInt long blockWait(@Block Runnable block, long timeout);
    @Bridge(symbol="dispatch_block_notify", optional=true)
    public static native void notify(@Block Runnable block, DispatchQueue queue, @Block Runnable notification_block);
    @Bridge(symbol="dispatch_block_cancel", optional=true)
    public static native void cancel(@Block Runnable block);
    @Bridge(symbol="dispatch_block_testcancel", optional=true)
    public static native @MachineSizedSInt long testcancel(@Block Runnable block);
    /*</methods>*/
}
