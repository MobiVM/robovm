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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 6.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSXPCInterface/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSXPCInterfacePtr extends Ptr<NSXPCInterface, NSXPCInterfacePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSXPCInterface.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSXPCInterface() {}
    protected NSXPCInterface(Handle h, long handle) { super(h, handle); }
    protected NSXPCInterface(SkipInit skipInit) { super(skipInit); }
    public NSXPCInterface(ObjCProtocol protocol) { super((Handle) null, create(protocol)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "protocol")
    public native ObjCProtocol getProtocol();
    @Property(selector = "setProtocol:", strongRef = true)
    public native void setProtocol(ObjCProtocol v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setClasses:forSelector:argumentIndex:ofReply:")
    public native void setClasses(NSSet<?> classes, Selector sel, @MachineSizedUInt long arg, boolean ofReply);
    @Method(selector = "classesForSelector:argumentIndex:ofReply:")
    public native NSSet<?> getClassesForSelector(Selector sel, @MachineSizedUInt long arg, boolean ofReply);
    @Method(selector = "setInterface:forSelector:argumentIndex:ofReply:")
    public native void setInterface(NSXPCInterface ifc, Selector sel, @MachineSizedUInt long arg, boolean ofReply);
    @Method(selector = "interfaceForSelector:argumentIndex:ofReply:")
    public native NSXPCInterface getInterfaceForSelector(Selector sel, @MachineSizedUInt long arg, boolean ofReply);
    @Method(selector = "interfaceWithProtocol:")
    protected static native @Pointer long create(ObjCProtocol protocol);
    /*</methods>*/
}
