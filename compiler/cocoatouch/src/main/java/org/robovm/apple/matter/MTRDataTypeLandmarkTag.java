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
 * @since Available in iOS 18.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsUnsignedByteMarshaler.class)/*</annotations>*/
public enum /*<name>*/MTRDataTypeLandmarkTag/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @since Available in iOS 18.4 and later.
     */
    AirConditioner(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AirPurifier(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    BackDoor(2L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    BarStool(3L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    BathMat(4L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Bathtub(5L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Bed(6L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Bookshelf(7L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Chair(8L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    ChristmasTree(9L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    CoatRack(10L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    CoffeeTable(11L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    CookingRange(12L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Couch(13L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Countertop(14L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Cradle(15L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Crib(16L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Desk(17L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    DiningTable(18L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Dishwasher(19L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Door(20L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Dresser(21L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    LaundryDryer(22L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Fan(23L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Fireplace(24L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Freezer(25L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    FrontDoor(26L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    HighChair(27L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    KitchenIsland(28L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Lamp(29L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    LitterBox(30L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Mirror(31L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Nightstand(32L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Oven(33L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    PetBed(34L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    PetBowl(35L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    PetCrate(36L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Refrigerator(37L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    ScratchingPost(38L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    ShoeRack(39L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Shower(40L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    SideDoor(41L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Sink(42L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Sofa(43L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Stove(44L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Table(45L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Toilet(46L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    TrashCan(47L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    LaundryWasher(48L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    Window(49L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    WineCooler(50L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MTRDataTypeLandmarkTag/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MTRDataTypeLandmarkTag/*</name>*/ valueOf(long n) {
        for (/*<name>*/MTRDataTypeLandmarkTag/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MTRDataTypeLandmarkTag/*</name>*/.class.getName());
    }
}
