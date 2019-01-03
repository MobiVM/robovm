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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSaveProfileInCarIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INSaveProfileInCarIntentPtr extends Ptr<INSaveProfileInCarIntent, INSaveProfileInCarIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INSaveProfileInCarIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INSaveProfileInCarIntent() {}
    protected INSaveProfileInCarIntent(Handle h, long handle) { super(h, handle); }
    protected INSaveProfileInCarIntent(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 10.2 and later.
     */
    @Method(selector = "initWithProfileNumber:profileName:")
    public static  INSaveProfileInCarIntent createWithProfileName(NSNumber profileNumber, String profileName) {
       INSaveProfileInCarIntent res = new INSaveProfileInCarIntent((SkipInit) null);
       res.initObject(res.initWithProfileName(profileNumber, profileName));
       return res;
    }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.2. Use `-initWithProfileNumber:profileName:` method instead.
     */
    @Deprecated
    @Method(selector = "initWithProfileNumber:profileLabel:")
    public static  INSaveProfileInCarIntent createWithProfileLabel(NSNumber profileNumber, String profileLabel) {
       INSaveProfileInCarIntent res = new INSaveProfileInCarIntent((SkipInit) null);
       res.initObject(res.initWithProfileLabel(profileNumber, profileLabel));
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
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.2. Use `profileName` property instead.
     */
    @Deprecated
    @Property(selector = "profileLabel")
    public native String getProfileLabel();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.2 and later.
     */
    @Method(selector = "initWithProfileNumber:profileName:")
    protected native @Pointer long initWithProfileName(NSNumber profileNumber, String profileName);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.2. Use `-initWithProfileNumber:profileName:` method instead.
     */
    @Deprecated
    @Method(selector = "initWithProfileNumber:profileLabel:")
    protected native @Pointer long initWithProfileLabel(NSNumber profileNumber, String profileLabel);
    /*</methods>*/
}
