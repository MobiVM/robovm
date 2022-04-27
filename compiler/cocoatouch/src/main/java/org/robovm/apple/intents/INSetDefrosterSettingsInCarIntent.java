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
 * @since Available in iOS 10.0 and later.
 * @deprecated Deprecated in iOS 15.0. INSetDefrosterSettingsInCarIntent is deprecated. There is no replacement.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSetDefrosterSettingsInCarIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INSetDefrosterSettingsInCarIntentPtr extends Ptr<INSetDefrosterSettingsInCarIntent, INSetDefrosterSettingsInCarIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INSetDefrosterSettingsInCarIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INSetDefrosterSettingsInCarIntent() {}
    protected INSetDefrosterSettingsInCarIntent(Handle h, long handle) { super(h, handle); }
    protected INSetDefrosterSettingsInCarIntent(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithEnable:defroster:carName:")
    public INSetDefrosterSettingsInCarIntent(NSNumber enable, INCarDefroster defroster, INSpeakableString carName) { super((SkipInit) null); initObject(init(enable, defroster, carName)); }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 12.0. Use -initWithEnable:defroster:carName:
     */
    @Deprecated
    @Method(selector = "initWithEnable:defroster:")
    public INSetDefrosterSettingsInCarIntent(NSNumber enable, INCarDefroster defroster) { super((SkipInit) null); initObject(init(enable, defroster)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "enable")
    public native NSNumber getEnable();
    @Property(selector = "defroster")
    public native INCarDefroster getDefroster();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "carName")
    public native INSpeakableString getCarName();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithEnable:defroster:carName:")
    protected native @Pointer long init(NSNumber enable, INCarDefroster defroster, INSpeakableString carName);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 12.0. Use -initWithEnable:defroster:carName:
     */
    @Deprecated
    @Method(selector = "initWithEnable:defroster:")
    protected native @Pointer long init(NSNumber enable, INCarDefroster defroster);
    /*</methods>*/
}
