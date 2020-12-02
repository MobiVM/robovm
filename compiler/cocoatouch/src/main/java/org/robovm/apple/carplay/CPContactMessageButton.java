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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPContactMessageButton/*</name>*/ 
    extends /*<extends>*/CPButton/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CPContactMessageButtonPtr extends Ptr<CPContactMessageButton, CPContactMessageButtonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPContactMessageButton.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPContactMessageButton() {}
    protected CPContactMessageButton(Handle h, long handle) { super(h, handle); }
    protected CPContactMessageButton(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPhoneOrEmail:")
    public CPContactMessageButton(String phoneOrEmail) { super((SkipInit) null); initObject(init(phoneOrEmail)); }
    @Method(selector = "initWithImage:handler:")
    public CPContactMessageButton(UIImage image, @Block VoidBlock1<CPButton> handler) { super(image, handler); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "phoneOrEmail")
    public native String getPhoneOrEmail();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPhoneOrEmail:")
    protected native @Pointer long init(String phoneOrEmail);
    /*</methods>*/
}
