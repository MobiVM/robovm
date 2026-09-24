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
package org.robovm.apple.sharedwithyoucore;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SharedWithYouCore") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SWCollaborationMetadata/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class SWCollaborationMetadataPtr extends Ptr<SWCollaborationMetadata, SWCollaborationMetadataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SWCollaborationMetadata.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SWCollaborationMetadata() {}
    protected SWCollaborationMetadata(Handle h, long handle) { super(h, handle); }
    protected SWCollaborationMetadata(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLocalIdentifier:")
    public SWCollaborationMetadata(String localIdentifier) { super((SkipInit) null); initObject(init(localIdentifier)); }
    @Method(selector = "initWithCollaborationIdentifier:")
    public static SWCollaborationMetadata createWithCollaborationIdentifier(String collaborationIdentifier) {
       SWCollaborationMetadata res = new SWCollaborationMetadata((SkipInit) null);
       res.initObject(res.initWithCollaborationIdentifier(collaborationIdentifier));
       return res;
    }
    @Method(selector = "initWithCoder:")
    public SWCollaborationMetadata(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "collaborationIdentifier")
    public native String getCollaborationIdentifier();
    @Property(selector = "localIdentifier")
    public native String getLocalIdentifier();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "defaultShareOptions")
    public native SWCollaborationShareOptions getDefaultShareOptions();
    @Property(selector = "setDefaultShareOptions:")
    public native void setDefaultShareOptions(SWCollaborationShareOptions v);
    @Property(selector = "userSelectedShareOptions")
    public native SWCollaborationShareOptions getUserSelectedShareOptions();
    @Property(selector = "setUserSelectedShareOptions:")
    public native void setUserSelectedShareOptions(SWCollaborationShareOptions v);
    @Property(selector = "initiatorHandle")
    public native String getInitiatorHandle();
    @Property(selector = "setInitiatorHandle:")
    public native void setInitiatorHandle(String v);
    @Property(selector = "initiatorNameComponents")
    public native NSPersonNameComponents getInitiatorNameComponents();
    @Property(selector = "setInitiatorNameComponents:")
    public native void setInitiatorNameComponents(NSPersonNameComponents v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLocalIdentifier:")
    protected native @Pointer long init(String localIdentifier);
    @Method(selector = "initWithCollaborationIdentifier:")
    protected native @Pointer long initWithCollaborationIdentifier(String collaborationIdentifier);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
