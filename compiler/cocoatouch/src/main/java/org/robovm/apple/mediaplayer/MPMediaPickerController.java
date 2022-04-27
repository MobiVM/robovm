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
package org.robovm.apple.mediaplayer;

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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("MediaPlayer") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPMediaPickerController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPMediaPickerControllerPtr extends Ptr<MPMediaPickerController, MPMediaPickerControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPMediaPickerController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPMediaPickerController(Handle h, long handle) { super(h, handle); }
    protected MPMediaPickerController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithMediaTypes:")
    public MPMediaPickerController(MPMediaType mediaTypes) { super((SkipInit) null); initObject(init(mediaTypes)); }
    @Method(selector = "initWithNibName:bundle:")
    public MPMediaPickerController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    @Method(selector = "initWithCoder:")
    public MPMediaPickerController(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mediaTypes")
    public native MPMediaType getMediaTypes();
    @Property(selector = "delegate")
    public native MPMediaPickerControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MPMediaPickerControllerDelegate v);
    @Property(selector = "allowsPickingMultipleItems")
    public native boolean allowsPickingMultipleItems();
    @Property(selector = "setAllowsPickingMultipleItems:")
    public native void setAllowsPickingMultipleItems(boolean v);
    @Property(selector = "showsCloudItems")
    public native boolean showsCloudItems();
    @Property(selector = "setShowsCloudItems:")
    public native void setShowsCloudItems(boolean v);
    /**
     * @since Available in iOS 9.2 and later.
     */
    @Property(selector = "showsItemsWithProtectedAssets")
    public native boolean showsItemsWithProtectedAssets();
    /**
     * @since Available in iOS 9.2 and later.
     */
    @Property(selector = "setShowsItemsWithProtectedAssets:")
    public native void setShowsItemsWithProtectedAssets(boolean v);
    @Property(selector = "prompt")
    public native String getPrompt();
    @Property(selector = "setPrompt:")
    public native void setPrompt(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMediaTypes:")
    protected native @Pointer long init(MPMediaType mediaTypes);
    /*</methods>*/
}
