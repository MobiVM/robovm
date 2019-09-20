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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INTrainReservation/*</name>*/ 
    extends /*<extends>*/INReservation/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INTrainReservationPtr extends Ptr<INTrainReservation, INTrainReservationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INTrainReservation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INTrainReservation() {}
    protected INTrainReservation(Handle h, long handle) { super(h, handle); }
    protected INTrainReservation(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithItemReference:reservationNumber:bookingTime:reservationStatus:reservationHolderName:actions:reservedSeat:trainTrip:")
    public INTrainReservation(INSpeakableString itemReference, String reservationNumber, NSDate bookingTime, INReservationStatus reservationStatus, String reservationHolderName, NSArray<INReservationAction> actions, INSeat reservedSeat, INTrainTrip trainTrip) { super((SkipInit) null); initObject(init(itemReference, reservationNumber, bookingTime, reservationStatus, reservationHolderName, actions, reservedSeat, trainTrip)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "reservedSeat")
    public native INSeat getReservedSeat();
    @Property(selector = "trainTrip")
    public native INTrainTrip getTrainTrip();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithItemReference:reservationNumber:bookingTime:reservationStatus:reservationHolderName:actions:reservedSeat:trainTrip:")
    protected native @Pointer long init(INSpeakableString itemReference, String reservationNumber, NSDate bookingTime, INReservationStatus reservationStatus, String reservationHolderName, NSArray<INReservationAction> actions, INSeat reservedSeat, INTrainTrip trainTrip);
    /*</methods>*/
}
