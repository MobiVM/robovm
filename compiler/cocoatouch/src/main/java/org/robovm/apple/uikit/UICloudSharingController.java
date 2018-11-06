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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UICloudSharingController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UICloudSharingControllerPtr extends Ptr<UICloudSharingController, UICloudSharingControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UICloudSharingController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UICloudSharingController() {}
    protected UICloudSharingController(Handle h, long handle) { super(h, handle); }
    protected UICloudSharingController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPreparationHandler:")
    public UICloudSharingController(@Block("(,@Block)") VoidBlock2<UICloudSharingController, VoidBlock3<CKShare, CKContainer, NSError>> preparationHandler) { super((SkipInit) null); initObject(init(preparationHandler)); }
    @Method(selector = "initWithShare:container:")
    public UICloudSharingController(CKShare share, CKContainer container) { super((SkipInit) null); initObject(init(share, container)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native UICloudSharingControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UICloudSharingControllerDelegate v);
    @Property(selector = "share")
    public native CKShare getShare();
    @Property(selector = "availablePermissions")
    public native UICloudSharingPermissionOptions getAvailablePermissions();
    @Property(selector = "setAvailablePermissions:")
    public native void setAvailablePermissions(UICloudSharingPermissionOptions v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPreparationHandler:")
    protected native @Pointer long init(@Block("(,@Block)") VoidBlock2<UICloudSharingController, VoidBlock3<CKShare, CKContainer, NSError>> preparationHandler);
    @Method(selector = "initWithShare:container:")
    protected native @Pointer long init(CKShare share, CKContainer container);
    @Method(selector = "activityItemSource")
    public native UIActivityItemSource activityItemSource();
    /*</methods>*/
}
