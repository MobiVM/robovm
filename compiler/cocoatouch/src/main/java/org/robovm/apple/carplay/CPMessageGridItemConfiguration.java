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
package org.robovm.apple.carplay;

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
import org.robovm.apple.mapkit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPMessageGridItemConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CPMessageGridItemConfigurationPtr extends Ptr<CPMessageGridItemConfiguration, CPMessageGridItemConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPMessageGridItemConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CPMessageGridItemConfiguration() {}
    protected CPMessageGridItemConfiguration(Handle h, long handle) { super(h, handle); }
    protected CPMessageGridItemConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithConversationIdentifier:unread:")
    public CPMessageGridItemConfiguration(String conversationIdentifier, boolean unread) { super((SkipInit) null); initObject(init(conversationIdentifier, unread)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isUnread")
    public native boolean isUnread();
    @Property(selector = "setUnread:")
    public native void setUnread(boolean v);
    @Property(selector = "conversationIdentifier")
    public native String getConversationIdentifier();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithConversationIdentifier:unread:")
    protected native @Pointer long init(String conversationIdentifier, boolean unread);
    /*</methods>*/
}
