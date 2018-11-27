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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INInteraction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INInteractionPtr extends Ptr<INInteraction, INInteractionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INInteraction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INInteraction() {}
    protected INInteraction(Handle h, long handle) { super(h, handle); }
    protected INInteraction(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIntent:response:")
    public INInteraction(INIntent intent, INIntentResponse response) { super((SkipInit) null); initObject(init(intent, response)); }
    @Method(selector = "initWithCoder:")
    public INInteraction(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "intent")
    public native INIntent getIntent();
    @Property(selector = "intentResponse")
    public native INIntentResponse getIntentResponse();
    @Property(selector = "intentHandlingStatus")
    public native INIntentHandlingStatus getIntentHandlingStatus();
    @Property(selector = "direction")
    public native INInteractionDirection getDirection();
    @Property(selector = "setDirection:")
    public native void setDirection(INInteractionDirection v);
    @Property(selector = "dateInterval")
    public native NSDateInterval getDateInterval();
    @Property(selector = "setDateInterval:")
    public native void setDateInterval(NSDateInterval v);
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "setIdentifier:")
    public native void setIdentifier(String v);
    @Property(selector = "groupIdentifier")
    public native String getGroupIdentifier();
    @Property(selector = "setGroupIdentifier:")
    public native void setGroupIdentifier(String v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIntent:response:")
    protected native @Pointer long init(INIntent intent, INIntentResponse response);
    @Method(selector = "donateInteractionWithCompletion:")
    public native void donateInteractionWithCompletion(@Block VoidBlock1<NSError> completion);
    @Method(selector = "deleteAllInteractionsWithCompletion:")
    public static native void deleteAllInteractionsWithCompletion(@Block VoidBlock1<NSError> completion);
    @Method(selector = "deleteInteractionsWithIdentifiers:completion:")
    public static native void deleteInteractions(NSArray<NSString> identifiers, @Block VoidBlock1<NSError> completion);
    @Method(selector = "deleteInteractionsWithGroupIdentifier:completion:")
    public static native void deleteInteractionsByGroup(String groupIdentifier, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "parameterValueForParameter:")
    public native NSObject parameterValueForParameter(INParameter parameter);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
