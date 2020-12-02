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
package org.robovm.apple.carplay;

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
import org.robovm.apple.mapkit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPMessageComposeBarButton/*</name>*/ 
    extends /*<extends>*/CPBarButton/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CPMessageComposeBarButtonPtr extends Ptr<CPMessageComposeBarButton, CPMessageComposeBarButtonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPMessageComposeBarButton.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CPMessageComposeBarButton() {}
    protected CPMessageComposeBarButton(Handle h, long handle) { super(h, handle); }
    protected CPMessageComposeBarButton(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithImage:")
    public CPMessageComposeBarButton(UIImage image) { super((SkipInit) null); initObject(init(image)); }
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use -[CPBarButton initWithImage:handler:] or -[CPBarButton buttonWithTitle:handler:]
     */
    @Deprecated
    @Method(selector = "initWithType:handler:")
    public CPMessageComposeBarButton(CPBarButtonType type, @Block VoidBlock1<CPBarButton> handler) { super(type, handler); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithImage:")
    protected native @Pointer long init(UIImage image);
    /*</methods>*/
}
