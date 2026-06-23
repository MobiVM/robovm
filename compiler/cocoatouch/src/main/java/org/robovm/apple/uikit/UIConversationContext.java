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
/**
 * @since Available in iOS 18.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIConversationContext/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIConversationContextPtr extends Ptr<UIConversationContext, UIConversationContextPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIConversationContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIConversationContext() {}
    protected UIConversationContext(Handle h, long handle) { super(h, handle); }
    protected UIConversationContext(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "threadIdentifier")
    public native String getThreadIdentifier();
    @Property(selector = "setThreadIdentifier:")
    public native void setThreadIdentifier(String v);
    @Property(selector = "entries")
    public native NSArray<UIConversationEntry> getEntries();
    @Property(selector = "setEntries:")
    public native void setEntries(NSArray<UIConversationEntry> v);
    @Property(selector = "selfIdentifiers")
    public native NSSet<NSString> getSelfIdentifiers();
    @Property(selector = "setSelfIdentifiers:")
    public native void setSelfIdentifiers(NSSet<NSString> v);
    @Property(selector = "responsePrimaryRecipientIdentifiers")
    public native NSSet<NSString> getResponsePrimaryRecipientIdentifiers();
    @Property(selector = "setResponsePrimaryRecipientIdentifiers:")
    public native void setResponsePrimaryRecipientIdentifiers(NSSet<NSString> v);
    @Property(selector = "participantNameByIdentifier")
    public native NSDictionary<NSString, NSPersonNameComponents> getParticipantNameByIdentifier();
    @Property(selector = "setParticipantNameByIdentifier:")
    public native void setParticipantNameByIdentifier(NSDictionary<NSString, NSPersonNameComponents> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
