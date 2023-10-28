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
import org.robovm.apple.symbols.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIAlertController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*/implements UISpringLoadedInteractionSupporting/*</implements>*/ {

    /*<ptr>*/public static class UIAlertControllerPtr extends Ptr<UIAlertController, UIAlertControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIAlertController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIAlertController() {}
    protected UIAlertController(Handle h, long handle) { super(h, handle); }
    protected UIAlertController(SkipInit skipInit) { super(skipInit); }
    public UIAlertController(String title, String message, UIAlertControllerStyle preferredStyle) { super((Handle) null, create(title, message, preferredStyle)); retain(getHandle()); }
    @Method(selector = "initWithNibName:bundle:")
    public UIAlertController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    @Method(selector = "initWithCoder:")
    public UIAlertController(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "actions")
    public native NSArray<UIAlertAction> getActions();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "preferredAction")
    public native UIAlertAction getPreferredAction();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setPreferredAction:")
    public native void setPreferredAction(UIAlertAction v);
    @Property(selector = "textFields")
    public native NSArray<UITextField> getTextFields();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "message")
    public native String getMessage();
    @Property(selector = "setMessage:")
    public native void setMessage(String v);
    @Property(selector = "preferredStyle")
    public native UIAlertControllerStyle getPreferredStyle();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "severity")
    public native UIAlertControllerSeverity getSeverity();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setSeverity:")
    public native void setSeverity(UIAlertControllerSeverity v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isSpringLoaded")
    public native boolean isSpringLoaded();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSpringLoaded:")
    public native void setSpringLoaded(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addAction:")
    public native void addAction(UIAlertAction action);
    @Method(selector = "addTextFieldWithConfigurationHandler:")
    public native void addTextField(@Block VoidBlock1<UITextField> configurationHandler);
    @Method(selector = "alertControllerWithTitle:message:preferredStyle:")
    protected static native @Pointer long create(String title, String message, UIAlertControllerStyle preferredStyle);
    /*</methods>*/
}
