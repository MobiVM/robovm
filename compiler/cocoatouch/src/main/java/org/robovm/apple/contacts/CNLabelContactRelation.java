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
package org.robovm.apple.contacts;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Contacts") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CNLabelContactRelation/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CNLabelContactRelation/*</name>*/ 
    extends /*<extends>*/CNLabel/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CNLabelContactRelation/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CNLabelContactRelation toObject(Class<CNLabelContactRelation> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CNLabelContactRelation.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CNLabelContactRelation o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<CNLabelContactRelation> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CNLabelContactRelation> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CNLabelContactRelation.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CNLabelContactRelation> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (CNLabelContactRelation o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CNLabelContactRelation Assistant = new CNLabelContactRelation("Assistant");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CNLabelContactRelation Manager = new CNLabelContactRelation("Manager");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Colleague = new CNLabelContactRelation("Colleague");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Teacher = new CNLabelContactRelation("Teacher");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Sibling = new CNLabelContactRelation("Sibling");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation YoungerSibling = new CNLabelContactRelation("YoungerSibling");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ElderSibling = new CNLabelContactRelation("ElderSibling");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CNLabelContactRelation Sister = new CNLabelContactRelation("Sister");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation YoungerSister = new CNLabelContactRelation("YoungerSister");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation YoungestSister = new CNLabelContactRelation("YoungestSister");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ElderSister = new CNLabelContactRelation("ElderSister");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation EldestSister = new CNLabelContactRelation("EldestSister");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CNLabelContactRelation Brother = new CNLabelContactRelation("Brother");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation YoungerBrother = new CNLabelContactRelation("YoungerBrother");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation YoungestBrother = new CNLabelContactRelation("YoungestBrother");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ElderBrother = new CNLabelContactRelation("ElderBrother");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation EldestBrother = new CNLabelContactRelation("EldestBrother");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CNLabelContactRelation Friend = new CNLabelContactRelation("Friend");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation MaleFriend = new CNLabelContactRelation("MaleFriend");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation FemaleFriend = new CNLabelContactRelation("FemaleFriend");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CNLabelContactRelation Spouse = new CNLabelContactRelation("Spouse");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Wife = new CNLabelContactRelation("Wife");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Husband = new CNLabelContactRelation("Husband");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CNLabelContactRelation Partner = new CNLabelContactRelation("Partner");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation MalePartner = new CNLabelContactRelation("MalePartner");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation FemalePartner = new CNLabelContactRelation("FemalePartner");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation GirlfriendOrBoyfriend = new CNLabelContactRelation("GirlfriendOrBoyfriend");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Girlfriend = new CNLabelContactRelation("Girlfriend");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Boyfriend = new CNLabelContactRelation("Boyfriend");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CNLabelContactRelation Parent = new CNLabelContactRelation("Parent");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CNLabelContactRelation Mother = new CNLabelContactRelation("Mother");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CNLabelContactRelation Father = new CNLabelContactRelation("Father");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final CNLabelContactRelation Child = new CNLabelContactRelation("Child");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final CNLabelContactRelation Daughter = new CNLabelContactRelation("Daughter");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final CNLabelContactRelation Son = new CNLabelContactRelation("Son");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Grandparent = new CNLabelContactRelation("Grandparent");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Grandmother = new CNLabelContactRelation("Grandmother");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation GrandmotherMothersMother = new CNLabelContactRelation("GrandmotherMothersMother");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation GrandmotherFathersMother = new CNLabelContactRelation("GrandmotherFathersMother");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Grandfather = new CNLabelContactRelation("Grandfather");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation GrandfatherMothersFather = new CNLabelContactRelation("GrandfatherMothersFather");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation GrandfatherFathersFather = new CNLabelContactRelation("GrandfatherFathersFather");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation GreatGrandparent = new CNLabelContactRelation("GreatGrandparent");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation GreatGrandmother = new CNLabelContactRelation("GreatGrandmother");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation GreatGrandfather = new CNLabelContactRelation("GreatGrandfather");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Grandchild = new CNLabelContactRelation("Grandchild");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Granddaughter = new CNLabelContactRelation("Granddaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation GranddaughterDaughtersDaughter = new CNLabelContactRelation("GranddaughterDaughtersDaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation GranddaughterSonsDaughter = new CNLabelContactRelation("GranddaughterSonsDaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Grandson = new CNLabelContactRelation("Grandson");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation GrandsonDaughtersSon = new CNLabelContactRelation("GrandsonDaughtersSon");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation GrandsonSonsSon = new CNLabelContactRelation("GrandsonSonsSon");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation GreatGrandchild = new CNLabelContactRelation("GreatGrandchild");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation GreatGranddaughter = new CNLabelContactRelation("GreatGranddaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation GreatGrandson = new CNLabelContactRelation("GreatGrandson");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ParentInLaw = new CNLabelContactRelation("ParentInLaw");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation MotherInLaw = new CNLabelContactRelation("MotherInLaw");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation MotherInLawWifesMother = new CNLabelContactRelation("MotherInLawWifesMother");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation MotherInLawHusbandsMother = new CNLabelContactRelation("MotherInLawHusbandsMother");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation FatherInLaw = new CNLabelContactRelation("FatherInLaw");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation FatherInLawWifesFather = new CNLabelContactRelation("FatherInLawWifesFather");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation FatherInLawHusbandsFather = new CNLabelContactRelation("FatherInLawHusbandsFather");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation CoParentInLaw = new CNLabelContactRelation("CoParentInLaw");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation CoMotherInLaw = new CNLabelContactRelation("CoMotherInLaw");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation CoFatherInLaw = new CNLabelContactRelation("CoFatherInLaw");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation SiblingInLaw = new CNLabelContactRelation("SiblingInLaw");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation YoungerSiblingInLaw = new CNLabelContactRelation("YoungerSiblingInLaw");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ElderSiblingInLaw = new CNLabelContactRelation("ElderSiblingInLaw");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation SisterInLaw = new CNLabelContactRelation("SisterInLaw");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation YoungerSisterInLaw = new CNLabelContactRelation("YoungerSisterInLaw");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ElderSisterInLaw = new CNLabelContactRelation("ElderSisterInLaw");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation SisterInLawSpousesSister = new CNLabelContactRelation("SisterInLawSpousesSister");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation SisterInLawWifesSister = new CNLabelContactRelation("SisterInLawWifesSister");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation SisterInLawHusbandsSister = new CNLabelContactRelation("SisterInLawHusbandsSister");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation SisterInLawBrothersWife = new CNLabelContactRelation("SisterInLawBrothersWife");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation SisterInLawYoungerBrothersWife = new CNLabelContactRelation("SisterInLawYoungerBrothersWife");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation SisterInLawElderBrothersWife = new CNLabelContactRelation("SisterInLawElderBrothersWife");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation BrotherInLaw = new CNLabelContactRelation("BrotherInLaw");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation YoungerBrotherInLaw = new CNLabelContactRelation("YoungerBrotherInLaw");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ElderBrotherInLaw = new CNLabelContactRelation("ElderBrotherInLaw");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation BrotherInLawSpousesBrother = new CNLabelContactRelation("BrotherInLawSpousesBrother");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation BrotherInLawHusbandsBrother = new CNLabelContactRelation("BrotherInLawHusbandsBrother");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation BrotherInLawWifesBrother = new CNLabelContactRelation("BrotherInLawWifesBrother");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation BrotherInLawSistersHusband = new CNLabelContactRelation("BrotherInLawSistersHusband");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation BrotherInLawYoungerSistersHusband = new CNLabelContactRelation("BrotherInLawYoungerSistersHusband");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation BrotherInLawElderSistersHusband = new CNLabelContactRelation("BrotherInLawElderSistersHusband");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation SisterInLawWifesBrothersWife = new CNLabelContactRelation("SisterInLawWifesBrothersWife");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation SisterInLawHusbandsBrothersWife = new CNLabelContactRelation("SisterInLawHusbandsBrothersWife");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation BrotherInLawWifesSistersHusband = new CNLabelContactRelation("BrotherInLawWifesSistersHusband");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation BrotherInLawHusbandsSistersHusband = new CNLabelContactRelation("BrotherInLawHusbandsSistersHusband");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation CoSiblingInLaw = new CNLabelContactRelation("CoSiblingInLaw");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation CoSisterInLaw = new CNLabelContactRelation("CoSisterInLaw");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation CoBrotherInLaw = new CNLabelContactRelation("CoBrotherInLaw");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ChildInLaw = new CNLabelContactRelation("ChildInLaw");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation DaughterInLaw = new CNLabelContactRelation("DaughterInLaw");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation SonInLaw = new CNLabelContactRelation("SonInLaw");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Cousin = new CNLabelContactRelation("Cousin");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation YoungerCousin = new CNLabelContactRelation("YoungerCousin");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ElderCousin = new CNLabelContactRelation("ElderCousin");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation MaleCousin = new CNLabelContactRelation("MaleCousin");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation FemaleCousin = new CNLabelContactRelation("FemaleCousin");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation CousinParentsSiblingsChild = new CNLabelContactRelation("CousinParentsSiblingsChild");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation CousinParentsSiblingsSon = new CNLabelContactRelation("CousinParentsSiblingsSon");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation YoungerCousinParentsSiblingsSon = new CNLabelContactRelation("YoungerCousinParentsSiblingsSon");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ElderCousinParentsSiblingsSon = new CNLabelContactRelation("ElderCousinParentsSiblingsSon");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation CousinParentsSiblingsDaughter = new CNLabelContactRelation("CousinParentsSiblingsDaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation YoungerCousinParentsSiblingsDaughter = new CNLabelContactRelation("YoungerCousinParentsSiblingsDaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ElderCousinParentsSiblingsDaughter = new CNLabelContactRelation("ElderCousinParentsSiblingsDaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation CousinMothersSistersDaughter = new CNLabelContactRelation("CousinMothersSistersDaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation YoungerCousinMothersSistersDaughter = new CNLabelContactRelation("YoungerCousinMothersSistersDaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ElderCousinMothersSistersDaughter = new CNLabelContactRelation("ElderCousinMothersSistersDaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation CousinMothersSistersSon = new CNLabelContactRelation("CousinMothersSistersSon");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation YoungerCousinMothersSistersSon = new CNLabelContactRelation("YoungerCousinMothersSistersSon");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ElderCousinMothersSistersSon = new CNLabelContactRelation("ElderCousinMothersSistersSon");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation CousinMothersBrothersDaughter = new CNLabelContactRelation("CousinMothersBrothersDaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation YoungerCousinMothersBrothersDaughter = new CNLabelContactRelation("YoungerCousinMothersBrothersDaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ElderCousinMothersBrothersDaughter = new CNLabelContactRelation("ElderCousinMothersBrothersDaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation CousinMothersBrothersSon = new CNLabelContactRelation("CousinMothersBrothersSon");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation YoungerCousinMothersBrothersSon = new CNLabelContactRelation("YoungerCousinMothersBrothersSon");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ElderCousinMothersBrothersSon = new CNLabelContactRelation("ElderCousinMothersBrothersSon");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation CousinFathersSistersDaughter = new CNLabelContactRelation("CousinFathersSistersDaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation YoungerCousinFathersSistersDaughter = new CNLabelContactRelation("YoungerCousinFathersSistersDaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ElderCousinFathersSistersDaughter = new CNLabelContactRelation("ElderCousinFathersSistersDaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation CousinFathersSistersSon = new CNLabelContactRelation("CousinFathersSistersSon");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation YoungerCousinFathersSistersSon = new CNLabelContactRelation("YoungerCousinFathersSistersSon");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ElderCousinFathersSistersSon = new CNLabelContactRelation("ElderCousinFathersSistersSon");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation CousinFathersBrothersDaughter = new CNLabelContactRelation("CousinFathersBrothersDaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation YoungerCousinFathersBrothersDaughter = new CNLabelContactRelation("YoungerCousinFathersBrothersDaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ElderCousinFathersBrothersDaughter = new CNLabelContactRelation("ElderCousinFathersBrothersDaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation CousinFathersBrothersSon = new CNLabelContactRelation("CousinFathersBrothersSon");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation YoungerCousinFathersBrothersSon = new CNLabelContactRelation("YoungerCousinFathersBrothersSon");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ElderCousinFathersBrothersSon = new CNLabelContactRelation("ElderCousinFathersBrothersSon");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation CousinGrandparentsSiblingsChild = new CNLabelContactRelation("CousinGrandparentsSiblingsChild");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation CousinGrandparentsSiblingsDaughter = new CNLabelContactRelation("CousinGrandparentsSiblingsDaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation CousinGrandparentsSiblingsSon = new CNLabelContactRelation("CousinGrandparentsSiblingsSon");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation YoungerCousinMothersSiblingsSonOrFathersSistersSon = new CNLabelContactRelation("YoungerCousinMothersSiblingsSonOrFathersSistersSon");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ElderCousinMothersSiblingsSonOrFathersSistersSon = new CNLabelContactRelation("ElderCousinMothersSiblingsSonOrFathersSistersSon");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation YoungerCousinMothersSiblingsDaughterOrFathersSistersDaughter = new CNLabelContactRelation("YoungerCousinMothersSiblingsDaughterOrFathersSistersDaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ElderCousinMothersSiblingsDaughterOrFathersSistersDaughter = new CNLabelContactRelation("ElderCousinMothersSiblingsDaughterOrFathersSistersDaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ParentsSibling = new CNLabelContactRelation("ParentsSibling");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ParentsYoungerSibling = new CNLabelContactRelation("ParentsYoungerSibling");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ParentsElderSibling = new CNLabelContactRelation("ParentsElderSibling");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ParentsSiblingMothersSibling = new CNLabelContactRelation("ParentsSiblingMothersSibling");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ParentsSiblingMothersYoungerSibling = new CNLabelContactRelation("ParentsSiblingMothersYoungerSibling");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ParentsSiblingMothersElderSibling = new CNLabelContactRelation("ParentsSiblingMothersElderSibling");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ParentsSiblingFathersSibling = new CNLabelContactRelation("ParentsSiblingFathersSibling");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ParentsSiblingFathersYoungerSibling = new CNLabelContactRelation("ParentsSiblingFathersYoungerSibling");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation ParentsSiblingFathersElderSibling = new CNLabelContactRelation("ParentsSiblingFathersElderSibling");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Aunt = new CNLabelContactRelation("Aunt");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation AuntParentsSister = new CNLabelContactRelation("AuntParentsSister");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation AuntParentsYoungerSister = new CNLabelContactRelation("AuntParentsYoungerSister");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation AuntParentsElderSister = new CNLabelContactRelation("AuntParentsElderSister");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation AuntFathersSister = new CNLabelContactRelation("AuntFathersSister");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation AuntFathersYoungerSister = new CNLabelContactRelation("AuntFathersYoungerSister");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation AuntFathersElderSister = new CNLabelContactRelation("AuntFathersElderSister");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation AuntFathersBrothersWife = new CNLabelContactRelation("AuntFathersBrothersWife");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation AuntFathersYoungerBrothersWife = new CNLabelContactRelation("AuntFathersYoungerBrothersWife");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation AuntFathersElderBrothersWife = new CNLabelContactRelation("AuntFathersElderBrothersWife");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation AuntMothersSister = new CNLabelContactRelation("AuntMothersSister");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation AuntMothersYoungerSister = new CNLabelContactRelation("AuntMothersYoungerSister");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation AuntMothersElderSister = new CNLabelContactRelation("AuntMothersElderSister");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation AuntMothersBrothersWife = new CNLabelContactRelation("AuntMothersBrothersWife");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Grandaunt = new CNLabelContactRelation("Grandaunt");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Uncle = new CNLabelContactRelation("Uncle");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation UncleParentsBrother = new CNLabelContactRelation("UncleParentsBrother");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation UncleParentsYoungerBrother = new CNLabelContactRelation("UncleParentsYoungerBrother");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation UncleParentsElderBrother = new CNLabelContactRelation("UncleParentsElderBrother");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation UncleMothersBrother = new CNLabelContactRelation("UncleMothersBrother");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation UncleMothersYoungerBrother = new CNLabelContactRelation("UncleMothersYoungerBrother");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation UncleMothersElderBrother = new CNLabelContactRelation("UncleMothersElderBrother");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation UncleMothersSistersHusband = new CNLabelContactRelation("UncleMothersSistersHusband");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation UncleFathersBrother = new CNLabelContactRelation("UncleFathersBrother");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation UncleFathersYoungerBrother = new CNLabelContactRelation("UncleFathersYoungerBrother");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation UncleFathersElderBrother = new CNLabelContactRelation("UncleFathersElderBrother");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation UncleFathersSistersHusband = new CNLabelContactRelation("UncleFathersSistersHusband");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation UncleFathersYoungerSistersHusband = new CNLabelContactRelation("UncleFathersYoungerSistersHusband");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation UncleFathersElderSistersHusband = new CNLabelContactRelation("UncleFathersElderSistersHusband");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Granduncle = new CNLabelContactRelation("Granduncle");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation SiblingsChild = new CNLabelContactRelation("SiblingsChild");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Niece = new CNLabelContactRelation("Niece");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation NieceSistersDaughter = new CNLabelContactRelation("NieceSistersDaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation NieceBrothersDaughter = new CNLabelContactRelation("NieceBrothersDaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation NieceSistersDaughterOrWifesSiblingsDaughter = new CNLabelContactRelation("NieceSistersDaughterOrWifesSiblingsDaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation NieceBrothersDaughterOrHusbandsSiblingsDaughter = new CNLabelContactRelation("NieceBrothersDaughterOrHusbandsSiblingsDaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Nephew = new CNLabelContactRelation("Nephew");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation NephewSistersSon = new CNLabelContactRelation("NephewSistersSon");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation NephewBrothersSon = new CNLabelContactRelation("NephewBrothersSon");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation NephewBrothersSonOrHusbandsSiblingsSon = new CNLabelContactRelation("NephewBrothersSonOrHusbandsSiblingsSon");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation NephewSistersSonOrWifesSiblingsSon = new CNLabelContactRelation("NephewSistersSonOrWifesSiblingsSon");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Grandniece = new CNLabelContactRelation("Grandniece");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation GrandnieceSistersGranddaughter = new CNLabelContactRelation("GrandnieceSistersGranddaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation GrandnieceBrothersGranddaughter = new CNLabelContactRelation("GrandnieceBrothersGranddaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Grandnephew = new CNLabelContactRelation("Grandnephew");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation GrandnephewSistersGrandson = new CNLabelContactRelation("GrandnephewSistersGrandson");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation GrandnephewBrothersGrandson = new CNLabelContactRelation("GrandnephewBrothersGrandson");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Stepparent = new CNLabelContactRelation("Stepparent");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Stepfather = new CNLabelContactRelation("Stepfather");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Stepmother = new CNLabelContactRelation("Stepmother");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Stepchild = new CNLabelContactRelation("Stepchild");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Stepson = new CNLabelContactRelation("Stepson");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Stepdaughter = new CNLabelContactRelation("Stepdaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Stepbrother = new CNLabelContactRelation("Stepbrother");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation Stepsister = new CNLabelContactRelation("Stepsister");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation MotherInLawOrStepmother = new CNLabelContactRelation("MotherInLawOrStepmother");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation FatherInLawOrStepfather = new CNLabelContactRelation("FatherInLawOrStepfather");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation DaughterInLawOrStepdaughter = new CNLabelContactRelation("DaughterInLawOrStepdaughter");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation SonInLawOrStepson = new CNLabelContactRelation("SonInLawOrStepson");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation CousinOrSiblingsChild = new CNLabelContactRelation("CousinOrSiblingsChild");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation NieceOrCousin = new CNLabelContactRelation("NieceOrCousin");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation NephewOrCousin = new CNLabelContactRelation("NephewOrCousin");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation GrandchildOrSiblingsChild = new CNLabelContactRelation("GrandchildOrSiblingsChild");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation GreatGrandchildOrSiblingsGrandchild = new CNLabelContactRelation("GreatGrandchildOrSiblingsGrandchild");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation DaughterInLawOrSisterInLaw = new CNLabelContactRelation("DaughterInLawOrSisterInLaw");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CNLabelContactRelation SonInLawOrBrotherInLaw = new CNLabelContactRelation("SonInLawOrBrotherInLaw");
    /*</constants>*/
    
    private static /*<name>*/CNLabelContactRelation/*</name>*/[] values = new /*<name>*/CNLabelContactRelation/*</name>*/[] {/*<value_list>*/Assistant, Manager, Colleague, Teacher, Sibling, YoungerSibling, ElderSibling, Sister, YoungerSister, YoungestSister, ElderSister, EldestSister, Brother, YoungerBrother, YoungestBrother, ElderBrother, EldestBrother, Friend, MaleFriend, FemaleFriend, Spouse, Wife, Husband, Partner, MalePartner, FemalePartner, GirlfriendOrBoyfriend, Girlfriend, Boyfriend, Parent, Mother, Father, Child, Daughter, Son, Grandparent, Grandmother, GrandmotherMothersMother, GrandmotherFathersMother, Grandfather, GrandfatherMothersFather, GrandfatherFathersFather, GreatGrandparent, GreatGrandmother, GreatGrandfather, Grandchild, Granddaughter, GranddaughterDaughtersDaughter, GranddaughterSonsDaughter, Grandson, GrandsonDaughtersSon, GrandsonSonsSon, GreatGrandchild, GreatGranddaughter, GreatGrandson, ParentInLaw, MotherInLaw, MotherInLawWifesMother, MotherInLawHusbandsMother, FatherInLaw, FatherInLawWifesFather, FatherInLawHusbandsFather, CoParentInLaw, CoMotherInLaw, CoFatherInLaw, SiblingInLaw, YoungerSiblingInLaw, ElderSiblingInLaw, SisterInLaw, YoungerSisterInLaw, ElderSisterInLaw, SisterInLawSpousesSister, SisterInLawWifesSister, SisterInLawHusbandsSister, SisterInLawBrothersWife, SisterInLawYoungerBrothersWife, SisterInLawElderBrothersWife, BrotherInLaw, YoungerBrotherInLaw, ElderBrotherInLaw, BrotherInLawSpousesBrother, BrotherInLawHusbandsBrother, BrotherInLawWifesBrother, BrotherInLawSistersHusband, BrotherInLawYoungerSistersHusband, BrotherInLawElderSistersHusband, SisterInLawWifesBrothersWife, SisterInLawHusbandsBrothersWife, BrotherInLawWifesSistersHusband, BrotherInLawHusbandsSistersHusband, CoSiblingInLaw, CoSisterInLaw, CoBrotherInLaw, ChildInLaw, DaughterInLaw, SonInLaw, Cousin, YoungerCousin, ElderCousin, MaleCousin, FemaleCousin, CousinParentsSiblingsChild, CousinParentsSiblingsSon, YoungerCousinParentsSiblingsSon, ElderCousinParentsSiblingsSon, CousinParentsSiblingsDaughter, YoungerCousinParentsSiblingsDaughter, ElderCousinParentsSiblingsDaughter, CousinMothersSistersDaughter, YoungerCousinMothersSistersDaughter, ElderCousinMothersSistersDaughter, CousinMothersSistersSon, YoungerCousinMothersSistersSon, ElderCousinMothersSistersSon, CousinMothersBrothersDaughter, YoungerCousinMothersBrothersDaughter, ElderCousinMothersBrothersDaughter, CousinMothersBrothersSon, YoungerCousinMothersBrothersSon, ElderCousinMothersBrothersSon, CousinFathersSistersDaughter, YoungerCousinFathersSistersDaughter, ElderCousinFathersSistersDaughter, CousinFathersSistersSon, YoungerCousinFathersSistersSon, ElderCousinFathersSistersSon, CousinFathersBrothersDaughter, YoungerCousinFathersBrothersDaughter, ElderCousinFathersBrothersDaughter, CousinFathersBrothersSon, YoungerCousinFathersBrothersSon, ElderCousinFathersBrothersSon, CousinGrandparentsSiblingsChild, CousinGrandparentsSiblingsDaughter, CousinGrandparentsSiblingsSon, YoungerCousinMothersSiblingsSonOrFathersSistersSon, ElderCousinMothersSiblingsSonOrFathersSistersSon, YoungerCousinMothersSiblingsDaughterOrFathersSistersDaughter, ElderCousinMothersSiblingsDaughterOrFathersSistersDaughter, ParentsSibling, ParentsYoungerSibling, ParentsElderSibling, ParentsSiblingMothersSibling, ParentsSiblingMothersYoungerSibling, ParentsSiblingMothersElderSibling, ParentsSiblingFathersSibling, ParentsSiblingFathersYoungerSibling, ParentsSiblingFathersElderSibling, Aunt, AuntParentsSister, AuntParentsYoungerSister, AuntParentsElderSister, AuntFathersSister, AuntFathersYoungerSister, AuntFathersElderSister, AuntFathersBrothersWife, AuntFathersYoungerBrothersWife, AuntFathersElderBrothersWife, AuntMothersSister, AuntMothersYoungerSister, AuntMothersElderSister, AuntMothersBrothersWife, Grandaunt, Uncle, UncleParentsBrother, UncleParentsYoungerBrother, UncleParentsElderBrother, UncleMothersBrother, UncleMothersYoungerBrother, UncleMothersElderBrother, UncleMothersSistersHusband, UncleFathersBrother, UncleFathersYoungerBrother, UncleFathersElderBrother, UncleFathersSistersHusband, UncleFathersYoungerSistersHusband, UncleFathersElderSistersHusband, Granduncle, SiblingsChild, Niece, NieceSistersDaughter, NieceBrothersDaughter, NieceSistersDaughterOrWifesSiblingsDaughter, NieceBrothersDaughterOrHusbandsSiblingsDaughter, Nephew, NephewSistersSon, NephewBrothersSon, NephewBrothersSonOrHusbandsSiblingsSon, NephewSistersSonOrWifesSiblingsSon, Grandniece, GrandnieceSistersGranddaughter, GrandnieceBrothersGranddaughter, Grandnephew, GrandnephewSistersGrandson, GrandnephewBrothersGrandson, Stepparent, Stepfather, Stepmother, Stepchild, Stepson, Stepdaughter, Stepbrother, Stepsister, MotherInLawOrStepmother, FatherInLawOrStepfather, DaughterInLawOrStepdaughter, SonInLawOrStepson, CousinOrSiblingsChild, NieceOrCousin, NephewOrCousin, GrandchildOrSiblingsChild, GreatGrandchildOrSiblingsGrandchild, DaughterInLawOrSisterInLaw, SonInLawOrBrotherInLaw/*</value_list>*/};
    
    private CNLabelContactRelation(String getterName) {
        super(getterName);
    }
    
    public static /*<name>*/CNLabelContactRelation/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/CNLabelContactRelation/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CNLabelContactRelation/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Contacts") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationAssistant", optional=true)
        public static native NSString Assistant();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationManager", optional=true)
        public static native NSString Manager();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationColleague", optional=true)
        public static native NSString Colleague();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationTeacher", optional=true)
        public static native NSString Teacher();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationSibling", optional=true)
        public static native NSString Sibling();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationYoungerSibling", optional=true)
        public static native NSString YoungerSibling();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationElderSibling", optional=true)
        public static native NSString ElderSibling();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationSister", optional=true)
        public static native NSString Sister();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationYoungerSister", optional=true)
        public static native NSString YoungerSister();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationYoungestSister", optional=true)
        public static native NSString YoungestSister();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationElderSister", optional=true)
        public static native NSString ElderSister();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationEldestSister", optional=true)
        public static native NSString EldestSister();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationBrother", optional=true)
        public static native NSString Brother();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationYoungerBrother", optional=true)
        public static native NSString YoungerBrother();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationYoungestBrother", optional=true)
        public static native NSString YoungestBrother();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationElderBrother", optional=true)
        public static native NSString ElderBrother();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationEldestBrother", optional=true)
        public static native NSString EldestBrother();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationFriend", optional=true)
        public static native NSString Friend();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationMaleFriend", optional=true)
        public static native NSString MaleFriend();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationFemaleFriend", optional=true)
        public static native NSString FemaleFriend();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationSpouse", optional=true)
        public static native NSString Spouse();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationWife", optional=true)
        public static native NSString Wife();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationHusband", optional=true)
        public static native NSString Husband();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationPartner", optional=true)
        public static native NSString Partner();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationMalePartner", optional=true)
        public static native NSString MalePartner();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationFemalePartner", optional=true)
        public static native NSString FemalePartner();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGirlfriendOrBoyfriend", optional=true)
        public static native NSString GirlfriendOrBoyfriend();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGirlfriend", optional=true)
        public static native NSString Girlfriend();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationBoyfriend", optional=true)
        public static native NSString Boyfriend();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationParent", optional=true)
        public static native NSString Parent();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationMother", optional=true)
        public static native NSString Mother();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationFather", optional=true)
        public static native NSString Father();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationChild", optional=true)
        public static native NSString Child();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationDaughter", optional=true)
        public static native NSString Daughter();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationSon", optional=true)
        public static native NSString Son();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGrandparent", optional=true)
        public static native NSString Grandparent();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGrandmother", optional=true)
        public static native NSString Grandmother();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGrandmotherMothersMother", optional=true)
        public static native NSString GrandmotherMothersMother();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGrandmotherFathersMother", optional=true)
        public static native NSString GrandmotherFathersMother();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGrandfather", optional=true)
        public static native NSString Grandfather();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGrandfatherMothersFather", optional=true)
        public static native NSString GrandfatherMothersFather();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGrandfatherFathersFather", optional=true)
        public static native NSString GrandfatherFathersFather();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGreatGrandparent", optional=true)
        public static native NSString GreatGrandparent();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGreatGrandmother", optional=true)
        public static native NSString GreatGrandmother();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGreatGrandfather", optional=true)
        public static native NSString GreatGrandfather();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGrandchild", optional=true)
        public static native NSString Grandchild();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGranddaughter", optional=true)
        public static native NSString Granddaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGranddaughterDaughtersDaughter", optional=true)
        public static native NSString GranddaughterDaughtersDaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGranddaughterSonsDaughter", optional=true)
        public static native NSString GranddaughterSonsDaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGrandson", optional=true)
        public static native NSString Grandson();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGrandsonDaughtersSon", optional=true)
        public static native NSString GrandsonDaughtersSon();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGrandsonSonsSon", optional=true)
        public static native NSString GrandsonSonsSon();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGreatGrandchild", optional=true)
        public static native NSString GreatGrandchild();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGreatGranddaughter", optional=true)
        public static native NSString GreatGranddaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGreatGrandson", optional=true)
        public static native NSString GreatGrandson();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationParentInLaw", optional=true)
        public static native NSString ParentInLaw();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationMotherInLaw", optional=true)
        public static native NSString MotherInLaw();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationMotherInLawWifesMother", optional=true)
        public static native NSString MotherInLawWifesMother();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationMotherInLawHusbandsMother", optional=true)
        public static native NSString MotherInLawHusbandsMother();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationFatherInLaw", optional=true)
        public static native NSString FatherInLaw();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationFatherInLawWifesFather", optional=true)
        public static native NSString FatherInLawWifesFather();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationFatherInLawHusbandsFather", optional=true)
        public static native NSString FatherInLawHusbandsFather();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationCoParentInLaw", optional=true)
        public static native NSString CoParentInLaw();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationCoMotherInLaw", optional=true)
        public static native NSString CoMotherInLaw();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationCoFatherInLaw", optional=true)
        public static native NSString CoFatherInLaw();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationSiblingInLaw", optional=true)
        public static native NSString SiblingInLaw();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationYoungerSiblingInLaw", optional=true)
        public static native NSString YoungerSiblingInLaw();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationElderSiblingInLaw", optional=true)
        public static native NSString ElderSiblingInLaw();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationSisterInLaw", optional=true)
        public static native NSString SisterInLaw();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationYoungerSisterInLaw", optional=true)
        public static native NSString YoungerSisterInLaw();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationElderSisterInLaw", optional=true)
        public static native NSString ElderSisterInLaw();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationSisterInLawSpousesSister", optional=true)
        public static native NSString SisterInLawSpousesSister();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationSisterInLawWifesSister", optional=true)
        public static native NSString SisterInLawWifesSister();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationSisterInLawHusbandsSister", optional=true)
        public static native NSString SisterInLawHusbandsSister();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationSisterInLawBrothersWife", optional=true)
        public static native NSString SisterInLawBrothersWife();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationSisterInLawYoungerBrothersWife", optional=true)
        public static native NSString SisterInLawYoungerBrothersWife();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationSisterInLawElderBrothersWife", optional=true)
        public static native NSString SisterInLawElderBrothersWife();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationBrotherInLaw", optional=true)
        public static native NSString BrotherInLaw();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationYoungerBrotherInLaw", optional=true)
        public static native NSString YoungerBrotherInLaw();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationElderBrotherInLaw", optional=true)
        public static native NSString ElderBrotherInLaw();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationBrotherInLawSpousesBrother", optional=true)
        public static native NSString BrotherInLawSpousesBrother();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationBrotherInLawHusbandsBrother", optional=true)
        public static native NSString BrotherInLawHusbandsBrother();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationBrotherInLawWifesBrother", optional=true)
        public static native NSString BrotherInLawWifesBrother();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationBrotherInLawSistersHusband", optional=true)
        public static native NSString BrotherInLawSistersHusband();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationBrotherInLawYoungerSistersHusband", optional=true)
        public static native NSString BrotherInLawYoungerSistersHusband();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationBrotherInLawElderSistersHusband", optional=true)
        public static native NSString BrotherInLawElderSistersHusband();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationSisterInLawWifesBrothersWife", optional=true)
        public static native NSString SisterInLawWifesBrothersWife();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationSisterInLawHusbandsBrothersWife", optional=true)
        public static native NSString SisterInLawHusbandsBrothersWife();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationBrotherInLawWifesSistersHusband", optional=true)
        public static native NSString BrotherInLawWifesSistersHusband();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationBrotherInLawHusbandsSistersHusband", optional=true)
        public static native NSString BrotherInLawHusbandsSistersHusband();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationCoSiblingInLaw", optional=true)
        public static native NSString CoSiblingInLaw();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationCoSisterInLaw", optional=true)
        public static native NSString CoSisterInLaw();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationCoBrotherInLaw", optional=true)
        public static native NSString CoBrotherInLaw();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationChildInLaw", optional=true)
        public static native NSString ChildInLaw();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationDaughterInLaw", optional=true)
        public static native NSString DaughterInLaw();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationSonInLaw", optional=true)
        public static native NSString SonInLaw();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationCousin", optional=true)
        public static native NSString Cousin();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationYoungerCousin", optional=true)
        public static native NSString YoungerCousin();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationElderCousin", optional=true)
        public static native NSString ElderCousin();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationMaleCousin", optional=true)
        public static native NSString MaleCousin();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationFemaleCousin", optional=true)
        public static native NSString FemaleCousin();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationCousinParentsSiblingsChild", optional=true)
        public static native NSString CousinParentsSiblingsChild();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationCousinParentsSiblingsSon", optional=true)
        public static native NSString CousinParentsSiblingsSon();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationYoungerCousinParentsSiblingsSon", optional=true)
        public static native NSString YoungerCousinParentsSiblingsSon();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationElderCousinParentsSiblingsSon", optional=true)
        public static native NSString ElderCousinParentsSiblingsSon();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationCousinParentsSiblingsDaughter", optional=true)
        public static native NSString CousinParentsSiblingsDaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationYoungerCousinParentsSiblingsDaughter", optional=true)
        public static native NSString YoungerCousinParentsSiblingsDaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationElderCousinParentsSiblingsDaughter", optional=true)
        public static native NSString ElderCousinParentsSiblingsDaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationCousinMothersSistersDaughter", optional=true)
        public static native NSString CousinMothersSistersDaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationYoungerCousinMothersSistersDaughter", optional=true)
        public static native NSString YoungerCousinMothersSistersDaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationElderCousinMothersSistersDaughter", optional=true)
        public static native NSString ElderCousinMothersSistersDaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationCousinMothersSistersSon", optional=true)
        public static native NSString CousinMothersSistersSon();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationYoungerCousinMothersSistersSon", optional=true)
        public static native NSString YoungerCousinMothersSistersSon();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationElderCousinMothersSistersSon", optional=true)
        public static native NSString ElderCousinMothersSistersSon();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationCousinMothersBrothersDaughter", optional=true)
        public static native NSString CousinMothersBrothersDaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationYoungerCousinMothersBrothersDaughter", optional=true)
        public static native NSString YoungerCousinMothersBrothersDaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationElderCousinMothersBrothersDaughter", optional=true)
        public static native NSString ElderCousinMothersBrothersDaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationCousinMothersBrothersSon", optional=true)
        public static native NSString CousinMothersBrothersSon();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationYoungerCousinMothersBrothersSon", optional=true)
        public static native NSString YoungerCousinMothersBrothersSon();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationElderCousinMothersBrothersSon", optional=true)
        public static native NSString ElderCousinMothersBrothersSon();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationCousinFathersSistersDaughter", optional=true)
        public static native NSString CousinFathersSistersDaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationYoungerCousinFathersSistersDaughter", optional=true)
        public static native NSString YoungerCousinFathersSistersDaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationElderCousinFathersSistersDaughter", optional=true)
        public static native NSString ElderCousinFathersSistersDaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationCousinFathersSistersSon", optional=true)
        public static native NSString CousinFathersSistersSon();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationYoungerCousinFathersSistersSon", optional=true)
        public static native NSString YoungerCousinFathersSistersSon();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationElderCousinFathersSistersSon", optional=true)
        public static native NSString ElderCousinFathersSistersSon();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationCousinFathersBrothersDaughter", optional=true)
        public static native NSString CousinFathersBrothersDaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationYoungerCousinFathersBrothersDaughter", optional=true)
        public static native NSString YoungerCousinFathersBrothersDaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationElderCousinFathersBrothersDaughter", optional=true)
        public static native NSString ElderCousinFathersBrothersDaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationCousinFathersBrothersSon", optional=true)
        public static native NSString CousinFathersBrothersSon();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationYoungerCousinFathersBrothersSon", optional=true)
        public static native NSString YoungerCousinFathersBrothersSon();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationElderCousinFathersBrothersSon", optional=true)
        public static native NSString ElderCousinFathersBrothersSon();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationCousinGrandparentsSiblingsChild", optional=true)
        public static native NSString CousinGrandparentsSiblingsChild();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationCousinGrandparentsSiblingsDaughter", optional=true)
        public static native NSString CousinGrandparentsSiblingsDaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationCousinGrandparentsSiblingsSon", optional=true)
        public static native NSString CousinGrandparentsSiblingsSon();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationYoungerCousinMothersSiblingsSonOrFathersSistersSon", optional=true)
        public static native NSString YoungerCousinMothersSiblingsSonOrFathersSistersSon();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationElderCousinMothersSiblingsSonOrFathersSistersSon", optional=true)
        public static native NSString ElderCousinMothersSiblingsSonOrFathersSistersSon();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationYoungerCousinMothersSiblingsDaughterOrFathersSistersDaughter", optional=true)
        public static native NSString YoungerCousinMothersSiblingsDaughterOrFathersSistersDaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationElderCousinMothersSiblingsDaughterOrFathersSistersDaughter", optional=true)
        public static native NSString ElderCousinMothersSiblingsDaughterOrFathersSistersDaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationParentsSibling", optional=true)
        public static native NSString ParentsSibling();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationParentsYoungerSibling", optional=true)
        public static native NSString ParentsYoungerSibling();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationParentsElderSibling", optional=true)
        public static native NSString ParentsElderSibling();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationParentsSiblingMothersSibling", optional=true)
        public static native NSString ParentsSiblingMothersSibling();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationParentsSiblingMothersYoungerSibling", optional=true)
        public static native NSString ParentsSiblingMothersYoungerSibling();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationParentsSiblingMothersElderSibling", optional=true)
        public static native NSString ParentsSiblingMothersElderSibling();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationParentsSiblingFathersSibling", optional=true)
        public static native NSString ParentsSiblingFathersSibling();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationParentsSiblingFathersYoungerSibling", optional=true)
        public static native NSString ParentsSiblingFathersYoungerSibling();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationParentsSiblingFathersElderSibling", optional=true)
        public static native NSString ParentsSiblingFathersElderSibling();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationAunt", optional=true)
        public static native NSString Aunt();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationAuntParentsSister", optional=true)
        public static native NSString AuntParentsSister();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationAuntParentsYoungerSister", optional=true)
        public static native NSString AuntParentsYoungerSister();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationAuntParentsElderSister", optional=true)
        public static native NSString AuntParentsElderSister();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationAuntFathersSister", optional=true)
        public static native NSString AuntFathersSister();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationAuntFathersYoungerSister", optional=true)
        public static native NSString AuntFathersYoungerSister();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationAuntFathersElderSister", optional=true)
        public static native NSString AuntFathersElderSister();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationAuntFathersBrothersWife", optional=true)
        public static native NSString AuntFathersBrothersWife();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationAuntFathersYoungerBrothersWife", optional=true)
        public static native NSString AuntFathersYoungerBrothersWife();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationAuntFathersElderBrothersWife", optional=true)
        public static native NSString AuntFathersElderBrothersWife();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationAuntMothersSister", optional=true)
        public static native NSString AuntMothersSister();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationAuntMothersYoungerSister", optional=true)
        public static native NSString AuntMothersYoungerSister();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationAuntMothersElderSister", optional=true)
        public static native NSString AuntMothersElderSister();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationAuntMothersBrothersWife", optional=true)
        public static native NSString AuntMothersBrothersWife();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGrandaunt", optional=true)
        public static native NSString Grandaunt();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationUncle", optional=true)
        public static native NSString Uncle();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationUncleParentsBrother", optional=true)
        public static native NSString UncleParentsBrother();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationUncleParentsYoungerBrother", optional=true)
        public static native NSString UncleParentsYoungerBrother();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationUncleParentsElderBrother", optional=true)
        public static native NSString UncleParentsElderBrother();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationUncleMothersBrother", optional=true)
        public static native NSString UncleMothersBrother();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationUncleMothersYoungerBrother", optional=true)
        public static native NSString UncleMothersYoungerBrother();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationUncleMothersElderBrother", optional=true)
        public static native NSString UncleMothersElderBrother();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationUncleMothersSistersHusband", optional=true)
        public static native NSString UncleMothersSistersHusband();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationUncleFathersBrother", optional=true)
        public static native NSString UncleFathersBrother();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationUncleFathersYoungerBrother", optional=true)
        public static native NSString UncleFathersYoungerBrother();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationUncleFathersElderBrother", optional=true)
        public static native NSString UncleFathersElderBrother();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationUncleFathersSistersHusband", optional=true)
        public static native NSString UncleFathersSistersHusband();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationUncleFathersYoungerSistersHusband", optional=true)
        public static native NSString UncleFathersYoungerSistersHusband();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationUncleFathersElderSistersHusband", optional=true)
        public static native NSString UncleFathersElderSistersHusband();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGranduncle", optional=true)
        public static native NSString Granduncle();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationSiblingsChild", optional=true)
        public static native NSString SiblingsChild();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationNiece", optional=true)
        public static native NSString Niece();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationNieceSistersDaughter", optional=true)
        public static native NSString NieceSistersDaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationNieceBrothersDaughter", optional=true)
        public static native NSString NieceBrothersDaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationNieceSistersDaughterOrWifesSiblingsDaughter", optional=true)
        public static native NSString NieceSistersDaughterOrWifesSiblingsDaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationNieceBrothersDaughterOrHusbandsSiblingsDaughter", optional=true)
        public static native NSString NieceBrothersDaughterOrHusbandsSiblingsDaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationNephew", optional=true)
        public static native NSString Nephew();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationNephewSistersSon", optional=true)
        public static native NSString NephewSistersSon();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationNephewBrothersSon", optional=true)
        public static native NSString NephewBrothersSon();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationNephewBrothersSonOrHusbandsSiblingsSon", optional=true)
        public static native NSString NephewBrothersSonOrHusbandsSiblingsSon();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationNephewSistersSonOrWifesSiblingsSon", optional=true)
        public static native NSString NephewSistersSonOrWifesSiblingsSon();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGrandniece", optional=true)
        public static native NSString Grandniece();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGrandnieceSistersGranddaughter", optional=true)
        public static native NSString GrandnieceSistersGranddaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGrandnieceBrothersGranddaughter", optional=true)
        public static native NSString GrandnieceBrothersGranddaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGrandnephew", optional=true)
        public static native NSString Grandnephew();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGrandnephewSistersGrandson", optional=true)
        public static native NSString GrandnephewSistersGrandson();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGrandnephewBrothersGrandson", optional=true)
        public static native NSString GrandnephewBrothersGrandson();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationStepparent", optional=true)
        public static native NSString Stepparent();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationStepfather", optional=true)
        public static native NSString Stepfather();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationStepmother", optional=true)
        public static native NSString Stepmother();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationStepchild", optional=true)
        public static native NSString Stepchild();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationStepson", optional=true)
        public static native NSString Stepson();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationStepdaughter", optional=true)
        public static native NSString Stepdaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationStepbrother", optional=true)
        public static native NSString Stepbrother();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationStepsister", optional=true)
        public static native NSString Stepsister();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationMotherInLawOrStepmother", optional=true)
        public static native NSString MotherInLawOrStepmother();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationFatherInLawOrStepfather", optional=true)
        public static native NSString FatherInLawOrStepfather();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationDaughterInLawOrStepdaughter", optional=true)
        public static native NSString DaughterInLawOrStepdaughter();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationSonInLawOrStepson", optional=true)
        public static native NSString SonInLawOrStepson();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationCousinOrSiblingsChild", optional=true)
        public static native NSString CousinOrSiblingsChild();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationNieceOrCousin", optional=true)
        public static native NSString NieceOrCousin();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationNephewOrCousin", optional=true)
        public static native NSString NephewOrCousin();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGrandchildOrSiblingsChild", optional=true)
        public static native NSString GrandchildOrSiblingsChild();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationGreatGrandchildOrSiblingsGrandchild", optional=true)
        public static native NSString GreatGrandchildOrSiblingsGrandchild();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationDaughterInLawOrSisterInLaw", optional=true)
        public static native NSString DaughterInLawOrSisterInLaw();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="CNLabelContactRelationSonInLawOrBrotherInLaw", optional=true)
        public static native NSString SonInLawOrBrotherInLaw();
        /*</values>*/
    }
}
