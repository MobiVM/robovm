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
package org.robovm.apple.sharedwithyou;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SharedWithYou") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SWCollaborationView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SWCollaborationViewPtr extends Ptr<SWCollaborationView, SWCollaborationViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SWCollaborationView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SWCollaborationView() {}
    protected SWCollaborationView(Handle h, long handle) { super(h, handle); }
    protected SWCollaborationView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithItemProvider:")
    public SWCollaborationView(NSItemProvider itemProvider) { super((SkipInit) null); initObject(init(itemProvider)); }
    @Method(selector = "initWithFrame:")
    public SWCollaborationView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public SWCollaborationView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "cloudSharingDelegate")
    public native UICloudSharingControllerDelegate getCloudSharingDelegate();
    @Property(selector = "setCloudSharingDelegate:", strongRef = true)
    public native void setCloudSharingDelegate(UICloudSharingControllerDelegate v);
    @Property(selector = "activeParticipantCount")
    public native @MachineSizedUInt long getActiveParticipantCount();
    @Property(selector = "setActiveParticipantCount:")
    public native void setActiveParticipantCount(@MachineSizedUInt long v);
    @Property(selector = "delegate")
    public native SWCollaborationViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(SWCollaborationViewDelegate v);
    @Property(selector = "headerTitle")
    public native String getHeaderTitle();
    @Property(selector = "setHeaderTitle:")
    public native void setHeaderTitle(String v);
    @Property(selector = "headerSubtitle")
    public native String getHeaderSubtitle();
    @Property(selector = "setHeaderSubtitle:")
    public native void setHeaderSubtitle(String v);
    @Property(selector = "headerImage")
    public native UIImage getHeaderImage();
    @Property(selector = "setHeaderImage:")
    public native void setHeaderImage(UIImage v);
    @Property(selector = "cloudSharingControllerDelegate")
    public native UICloudSharingControllerDelegate getCloudSharingControllerDelegate();
    @Property(selector = "setCloudSharingControllerDelegate:", strongRef = true)
    public native void setCloudSharingControllerDelegate(UICloudSharingControllerDelegate v);
    @Property(selector = "manageButtonTitle")
    public native String getManageButtonTitle();
    @Property(selector = "setManageButtonTitle:")
    public native void setManageButtonTitle(String v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setContentView:")
    public native void setContentView(UIView detailViewListContentView);
    @Method(selector = "initWithItemProvider:")
    protected native @Pointer long init(NSItemProvider itemProvider);
    @Method(selector = "dismissPopover:")
    public native void dismissPopover(@Block Runnable completion);
    @Method(selector = "setShowManageButton:")
    public native void setShowManageButton(boolean showManageButton);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /*</methods>*/
}
