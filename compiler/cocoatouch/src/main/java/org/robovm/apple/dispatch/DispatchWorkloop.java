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

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("System")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DispatchWorkloop/*</name>*/
    extends /*<extends>*/DispatchQueue/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class DispatchWorkloopPtr extends Ptr<DispatchWorkloop, DispatchWorkloopPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(DispatchWorkloop.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="dispatch_workloop_create", optional=true)
    public static native DispatchWorkloop create(@org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsUtf8ZMarshaler.class) String label);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="dispatch_workloop_create_inactive", optional=true)
    public static native DispatchWorkloop createInactive(@org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsUtf8ZMarshaler.class) String label);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="dispatch_workloop_set_autorelease_frequency", optional=true)
    public native void setAutoreleaseFrequency(AutoreleaseFrequency frequency);
    /*</methods>*/
}
