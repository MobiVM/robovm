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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INRelevantShortcut/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INRelevantShortcutPtr extends Ptr<INRelevantShortcut, INRelevantShortcutPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INRelevantShortcut.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INRelevantShortcut() {}
    protected INRelevantShortcut(Handle h, long handle) { super(h, handle); }
    protected INRelevantShortcut(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithShortcut:")
    public INRelevantShortcut(INShortcut shortcut) { super((SkipInit) null); initObject(init(shortcut)); }
    @Method(selector = "initWithCoder:")
    public INRelevantShortcut(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "relevanceProviders")
    public native NSArray<INRelevanceProvider> getRelevanceProviders();
    @Property(selector = "setRelevanceProviders:")
    public native void setRelevanceProviders(NSArray<INRelevanceProvider> v);
    @Property(selector = "watchTemplate")
    public native INDefaultCardTemplate getWatchTemplate();
    @Property(selector = "setWatchTemplate:")
    public native void setWatchTemplate(INDefaultCardTemplate v);
    @Property(selector = "shortcutRole")
    public native INRelevantShortcutRole getShortcutRole();
    @Property(selector = "setShortcutRole:")
    public native void setShortcutRole(INRelevantShortcutRole v);
    @Property(selector = "shortcut")
    public native INShortcut getShortcut();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithShortcut:")
    protected native @Pointer long init(INShortcut shortcut);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
