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
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INVoiceShortcutCenter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INVoiceShortcutCenterPtr extends Ptr<INVoiceShortcutCenter, INVoiceShortcutCenterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INVoiceShortcutCenter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INVoiceShortcutCenter() {}
    protected INVoiceShortcutCenter(Handle h, long handle) { super(h, handle); }
    protected INVoiceShortcutCenter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedCenter")
    public static native INVoiceShortcutCenter getSharedCenter();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getAllVoiceShortcutsWithCompletion:")
    public native void getAllVoiceShortcuts(@Block VoidBlock2<NSArray<INVoiceShortcut>, NSError> completionHandler);
    @Method(selector = "getVoiceShortcutWithIdentifier:completion:")
    public native void getVoiceShortcut(NSUUID identifier, @Block VoidBlock2<INVoiceShortcut, NSError> completionHandler);
    @Method(selector = "setShortcutSuggestions:")
    public native void setShortcutSuggestions(NSArray<INShortcut> suggestions);
    /*</methods>*/
}
