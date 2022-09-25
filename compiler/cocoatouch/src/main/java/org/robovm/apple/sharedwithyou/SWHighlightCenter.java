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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SWHighlightCenter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SWHighlightCenterPtr extends Ptr<SWHighlightCenter, SWHighlightCenterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SWHighlightCenter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SWHighlightCenter() {}
    protected SWHighlightCenter(Handle h, long handle) { super(h, handle); }
    protected SWHighlightCenter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native SWHighlightCenterDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(SWHighlightCenterDelegate v);
    @Property(selector = "highlights")
    public native NSArray<SWHighlight> getHighlights();
    @Property(selector = "highlightCollectionTitle")
    public static native String getHighlightCollectionTitle();
    @Property(selector = "isSystemCollaborationSupportAvailable")
    public static native boolean isSystemCollaborationSupportAvailable();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getHighlightForURL:completionHandler:")
    public native void getHighlight(NSURL URL, @Block VoidBlock2<SWHighlight, NSError> completionHandler);
    @Method(selector = "collaborationHighlightForIdentifier:error:")
    public native SWCollaborationHighlight collaborationHighlight(String collaborationIdentifier, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "getCollaborationHighlightForURL:completionHandler:")
    public native void getCollaborationHighlight(NSURL URL, @Block VoidBlock2<SWCollaborationHighlight, NSError> completionHandler);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "postNoticeForHighlightEvent:")
    public native void postNoticeForHighlightEvent(SWHighlightEvent event);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "getSignedIdentityProofForCollaborationHighlight:usingData:completionHandler:")
    public native void getSignedIdentityProofForCollaborationHighlight(SWCollaborationHighlight collaborationHighlight, NSData data, @Block VoidBlock2<SWSignedPersonIdentityProof, NSError> completionHandler);
    /*</methods>*/
}
