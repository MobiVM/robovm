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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIToolbarAppearance/*</name>*/ 
    extends /*<extends>*/UIBarAppearance/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIToolbarAppearancePtr extends Ptr<UIToolbarAppearance, UIToolbarAppearancePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIToolbarAppearance.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIToolbarAppearance() {}
    protected UIToolbarAppearance(Handle h, long handle) { super(h, handle); }
    protected UIToolbarAppearance(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdiom:")
    public UIToolbarAppearance(UIUserInterfaceIdiom idiom) { super(idiom); }
    @Method(selector = "initWithBarAppearance:")
    public UIToolbarAppearance(UIBarAppearance barAppearance) { super(barAppearance); }
    @Method(selector = "initWithCoder:")
    public UIToolbarAppearance(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "buttonAppearance")
    public native UIBarButtonItemAppearance getButtonAppearance();
    @Property(selector = "setButtonAppearance:")
    public native void setButtonAppearance(UIBarButtonItemAppearance v);
    @Property(selector = "doneButtonAppearance")
    public native UIBarButtonItemAppearance getDoneButtonAppearance();
    @Property(selector = "setDoneButtonAppearance:")
    public native void setDoneButtonAppearance(UIBarButtonItemAppearance v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
