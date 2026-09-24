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
package org.robovm.apple.browserenginekit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("BrowserEngineKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BEAccessibilityRemoteHostElement/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BEAccessibilityRemoteHostElementPtr extends Ptr<BEAccessibilityRemoteHostElement, BEAccessibilityRemoteHostElementPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BEAccessibilityRemoteHostElement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected BEAccessibilityRemoteHostElement() {}
    protected BEAccessibilityRemoteHostElement(Handle h, long handle) { super(h, handle); }
    protected BEAccessibilityRemoteHostElement(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:remotePid:")
    public BEAccessibilityRemoteHostElement(String identifier, int remotePid) { super((SkipInit) null); initObject(init(identifier, remotePid)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "accessibilityContainer")
    public native NSObject getAccessibilityContainer();
    @Property(selector = "setAccessibilityContainer:", strongRef = true)
    public native void setAccessibilityContainer(NSObject v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:remotePid:")
    protected native @Pointer long init(String identifier, int remotePid);
    /*</methods>*/
}
