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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSendMessageIntentDonationMetadata/*</name>*/ 
    extends /*<extends>*/INIntentDonationMetadata/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INSendMessageIntentDonationMetadataPtr extends Ptr<INSendMessageIntentDonationMetadata, INSendMessageIntentDonationMetadataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INSendMessageIntentDonationMetadata.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INSendMessageIntentDonationMetadata() {}
    protected INSendMessageIntentDonationMetadata(Handle h, long handle) { super(h, handle); }
    protected INSendMessageIntentDonationMetadata(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mentionsCurrentUser")
    public native boolean isMentionsCurrentUser();
    @Property(selector = "setMentionsCurrentUser:")
    public native void setMentionsCurrentUser(boolean v);
    @Property(selector = "isReplyToCurrentUser")
    public native boolean isReplyToCurrentUser();
    @Property(selector = "setReplyToCurrentUser:")
    public native void setReplyToCurrentUser(boolean v);
    @Property(selector = "notifyRecipientAnyway")
    public native boolean isNotifyRecipientAnyway();
    @Property(selector = "setNotifyRecipientAnyway:")
    public native void setNotifyRecipientAnyway(boolean v);
    @Property(selector = "recipientCount")
    public native @MachineSizedUInt long getRecipientCount();
    @Property(selector = "setRecipientCount:")
    public native void setRecipientCount(@MachineSizedUInt long v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
