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
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INEditMessageIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INEditMessageIntentPtr extends Ptr<INEditMessageIntent, INEditMessageIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INEditMessageIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INEditMessageIntent() {}
    protected INEditMessageIntent(Handle h, long handle) { super(h, handle); }
    protected INEditMessageIntent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithMessageIdentifier:editedContent:")
    public INEditMessageIntent(String messageIdentifier, String editedContent) { super((SkipInit) null); initObject(init(messageIdentifier, editedContent)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "messageIdentifier")
    public native String getMessageIdentifier();
    @Property(selector = "editedContent")
    public native String getEditedContent();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMessageIdentifier:editedContent:")
    protected native @Pointer long init(String messageIdentifier, String editedContent);
    /*</methods>*/
}
