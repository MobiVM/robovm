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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSetProfileInCarIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INSetProfileInCarIntentPtr extends Ptr<INSetProfileInCarIntent, INSetProfileInCarIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INSetProfileInCarIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INSetProfileInCarIntent() {}
    protected INSetProfileInCarIntent(Handle h, long handle) { super(h, handle); }
    protected INSetProfileInCarIntent(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithProfileNumber:profileName:defaultProfile:carName:")
    public INSetProfileInCarIntent(NSNumber profileNumber, String profileName, NSNumber defaultProfile, INSpeakableString carName) { super((SkipInit) null); initObject(init(profileNumber, profileName, defaultProfile, carName)); }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.2.
     */
    @Deprecated
    @Method(selector = "initWithProfileNumber:profileLabel:defaultProfile:")
    public static  INSetProfileInCarIntent createWithProfileLabel(NSNumber profileNumber, String profileLabel, NSNumber defaultProfile) {
       INSetProfileInCarIntent res = new INSetProfileInCarIntent((SkipInit) null);
       res.initObject(res.initWithProfileLabel(profileNumber, profileLabel, defaultProfile));
       return res;
    }
    /**
     * @since Available in iOS 10.2 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Method(selector = "initWithProfileNumber:profileName:defaultProfile:")
    public static  INSetProfileInCarIntent createWithProfileName(NSNumber profileNumber, String profileName, NSNumber defaultProfile) {
       INSetProfileInCarIntent res = new INSetProfileInCarIntent((SkipInit) null);
       res.initObject(res.initWithProfileName(profileNumber, profileName, defaultProfile));
       return res;
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "profileNumber")
    public native NSNumber getProfileNumber();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @Property(selector = "profileName")
    public native String getProfileName();
    @Property(selector = "defaultProfile")
    public native NSNumber getDefaultProfile();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "carName")
    public native INSpeakableString getCarName();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.2.
     */
    @Deprecated
    @Property(selector = "profileLabel")
    public native String getProfileLabel();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithProfileNumber:profileName:defaultProfile:carName:")
    protected native @Pointer long init(NSNumber profileNumber, String profileName, NSNumber defaultProfile, INSpeakableString carName);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.2.
     */
    @Deprecated
    @Method(selector = "initWithProfileNumber:profileLabel:defaultProfile:")
    protected native @Pointer long initWithProfileLabel(NSNumber profileNumber, String profileLabel, NSNumber defaultProfile);
    /**
     * @since Available in iOS 10.2 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Method(selector = "initWithProfileNumber:profileName:defaultProfile:")
    protected native @Pointer long initWithProfileName(NSNumber profileNumber, String profileName, NSNumber defaultProfile);
    /*</methods>*/
}
