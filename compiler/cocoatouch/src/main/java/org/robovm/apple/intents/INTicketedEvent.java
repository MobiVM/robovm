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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INTicketedEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INTicketedEventPtr extends Ptr<INTicketedEvent, INTicketedEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INTicketedEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INTicketedEvent() {}
    protected INTicketedEvent(Handle h, long handle) { super(h, handle); }
    protected INTicketedEvent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCategory:name:eventDuration:location:")
    public INTicketedEvent(INTicketedEventCategory category, String name, INDateComponentsRange eventDuration, CLPlacemark location) { super((SkipInit) null); initObject(init(category, name, eventDuration, location)); }
    @Method(selector = "initWithCoder:")
    public INTicketedEvent(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "category")
    public native INTicketedEventCategory getCategory();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "eventDuration")
    public native INDateComponentsRange getEventDuration();
    @Property(selector = "location")
    public native CLPlacemark getLocation();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCategory:name:eventDuration:location:")
    protected native @Pointer long init(INTicketedEventCategory category, String name, INDateComponentsRange eventDuration, CLPlacemark location);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
