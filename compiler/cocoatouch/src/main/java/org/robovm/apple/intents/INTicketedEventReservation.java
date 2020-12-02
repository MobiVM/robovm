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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INTicketedEventReservation/*</name>*/ 
    extends /*<extends>*/INReservation/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INTicketedEventReservationPtr extends Ptr<INTicketedEventReservation, INTicketedEventReservationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INTicketedEventReservation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INTicketedEventReservation() {}
    protected INTicketedEventReservation(Handle h, long handle) { super(h, handle); }
    protected INTicketedEventReservation(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithItemReference:reservationNumber:bookingTime:reservationStatus:reservationHolderName:actions:URL:reservedSeat:event:")
    public INTicketedEventReservation(INSpeakableString itemReference, String reservationNumber, NSDate bookingTime, INReservationStatus reservationStatus, String reservationHolderName, NSArray<INReservationAction> actions, NSURL URL, INSeat reservedSeat, INTicketedEvent event) { super((SkipInit) null); initObject(init(itemReference, reservationNumber, bookingTime, reservationStatus, reservationHolderName, actions, URL, reservedSeat, event)); }
    @Method(selector = "initWithItemReference:reservationNumber:bookingTime:reservationStatus:reservationHolderName:actions:reservedSeat:event:")
    public INTicketedEventReservation(INSpeakableString itemReference, String reservationNumber, NSDate bookingTime, INReservationStatus reservationStatus, String reservationHolderName, NSArray<INReservationAction> actions, INSeat reservedSeat, INTicketedEvent event) { super((SkipInit) null); initObject(init(itemReference, reservationNumber, bookingTime, reservationStatus, reservationHolderName, actions, reservedSeat, event)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "event")
    public native INTicketedEvent getEvent();
    @Property(selector = "reservedSeat")
    public native INSeat getReservedSeat();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithItemReference:reservationNumber:bookingTime:reservationStatus:reservationHolderName:actions:URL:reservedSeat:event:")
    protected native @Pointer long init(INSpeakableString itemReference, String reservationNumber, NSDate bookingTime, INReservationStatus reservationStatus, String reservationHolderName, NSArray<INReservationAction> actions, NSURL URL, INSeat reservedSeat, INTicketedEvent event);
    @Method(selector = "initWithItemReference:reservationNumber:bookingTime:reservationStatus:reservationHolderName:actions:reservedSeat:event:")
    protected native @Pointer long init(INSpeakableString itemReference, String reservationNumber, NSDate bookingTime, INReservationStatus reservationStatus, String reservationHolderName, NSArray<INReservationAction> actions, INSeat reservedSeat, INTicketedEvent event);
    /*</methods>*/
}
