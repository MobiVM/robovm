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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSeat/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INSeatPtr extends Ptr<INSeat, INSeatPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INSeat.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INSeat() {}
    protected INSeat(Handle h, long handle) { super(h, handle); }
    protected INSeat(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSeatSection:seatRow:seatNumber:seatingType:")
    public INSeat(String seatSection, String seatRow, String seatNumber, String seatingType) { super((SkipInit) null); initObject(init(seatSection, seatRow, seatNumber, seatingType)); }
    @Method(selector = "initWithCoder:")
    public INSeat(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "seatSection")
    public native String getSeatSection();
    @Property(selector = "seatRow")
    public native String getSeatRow();
    @Property(selector = "seatNumber")
    public native String getSeatNumber();
    @Property(selector = "seatingType")
    public native String getSeatingType();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSeatSection:seatRow:seatNumber:seatingType:")
    protected native @Pointer long init(String seatSection, String seatRow, String seatNumber, String seatingType);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
