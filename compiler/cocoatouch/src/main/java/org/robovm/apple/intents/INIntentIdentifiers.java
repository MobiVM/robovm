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
/*</javadoc>*/
/*<annotations>*/@Library("Intents")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INIntentIdentifiers/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(INIntentIdentifiers.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INStartAudioCallIntentIdentifier", optional=true)
    public static native String StartAudioCall();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INStartVideoCallIntentIdentifier", optional=true)
    public static native String StartVideoCall();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INSearchCallHistoryIntentIdentifier", optional=true)
    public static native String SearchCallHistory();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INSetAudioSourceInCarIntentIdentifier", optional=true)
    public static native String SetAudioSourceInCar();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INSetClimateSettingsInCarIntentIdentifier", optional=true)
    public static native String SetClimateSettingsInCar();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INSetDefrosterSettingsInCarIntentIdentifier", optional=true)
    public static native String SetDefrosterSettingsInCar();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INSetSeatSettingsInCarIntentIdentifier", optional=true)
    public static native String SetSeatSettingsInCar();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INSetProfileInCarIntentIdentifier", optional=true)
    public static native String SetProfileInCar();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INSaveProfileInCarIntentIdentifier", optional=true)
    public static native String SaveProfileInCar();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INStartWorkoutIntentIdentifier", optional=true)
    public static native String StartWorkout();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INPauseWorkoutIntentIdentifier", optional=true)
    public static native String PauseWorkout();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INEndWorkoutIntentIdentifier", optional=true)
    public static native String EndWorkout();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INCancelWorkoutIntentIdentifier", optional=true)
    public static native String CancelWorkout();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INResumeWorkoutIntentIdentifier", optional=true)
    public static native String ResumeWorkout();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INSetRadioStationIntentIdentifier", optional=true)
    public static native String SetRadioStation();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INSendMessageIntentIdentifier", optional=true)
    public static native String SendMessage();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INSearchForMessagesIntentIdentifier", optional=true)
    public static native String SearchForMessages();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INSetMessageAttributeIntentIdentifier", optional=true)
    public static native String SetMessageAttribute();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INSendPaymentIntentIdentifier", optional=true)
    public static native String SendPayment();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INRequestPaymentIntentIdentifier", optional=true)
    public static native String RequestPayment();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INSearchForPhotosIntentIdentifier", optional=true)
    public static native String SearchForPhotos();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INStartPhotoPlaybackIntentIdentifier", optional=true)
    public static native String StartPhotoPlayback();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INListRideOptionsIntentIdentifier", optional=true)
    public static native String ListRideOptions();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INRequestRideIntentIdentifier", optional=true)
    public static native String RequestRide();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="INGetRideStatusIntentIdentifier", optional=true)
    public static native String GetRideStatus();
    /*</methods>*/
}
