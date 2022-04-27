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
package org.robovm.apple.quicklook;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.mobilecoreservices.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.pdfkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("QuickLook") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/QLPreviewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class QLPreviewControllerPtr extends Ptr<QLPreviewController, QLPreviewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(QLPreviewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public QLPreviewController() {}
    protected QLPreviewController(Handle h, long handle) { super(h, handle); }
    protected QLPreviewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithNibName:bundle:")
    public QLPreviewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    @Method(selector = "initWithCoder:")
    public QLPreviewController(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dataSource")
    public native QLPreviewControllerDataSource getDataSource();
    @Property(selector = "setDataSource:", strongRef = true)
    public native void setDataSource(QLPreviewControllerDataSource v);
    @Property(selector = "currentPreviewItemIndex")
    public native @MachineSizedSInt long getCurrentPreviewItemIndex();
    @Property(selector = "setCurrentPreviewItemIndex:")
    public native void setCurrentPreviewItemIndex(@MachineSizedSInt long v);
    @Property(selector = "currentPreviewItem")
    public native QLPreviewItem getCurrentPreviewItem();
    @Property(selector = "delegate")
    public native QLPreviewControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(QLPreviewControllerDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "reloadData")
    public native void reloadData();
    @Method(selector = "refreshCurrentPreviewItem")
    public native void refreshCurrentPreviewItem();
    @Method(selector = "canPreviewItem:")
    public static native boolean canPreviewItem(QLPreviewItem item);
    /*</methods>*/
}
