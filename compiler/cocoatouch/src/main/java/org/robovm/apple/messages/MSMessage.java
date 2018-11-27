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
package org.robovm.apple.messages;

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
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Messages") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSMessage/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MSMessagePtr extends Ptr<MSMessage, MSMessagePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSMessage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSMessage() {}
    protected MSMessage(Handle h, long handle) { super(h, handle); }
    protected MSMessage(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSession:")
    public MSMessage(MSSession session) { super((SkipInit) null); initObject(init(session)); }
    @Method(selector = "initWithCoder:")
    public MSMessage(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "session")
    public native MSSession getSession();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isPending")
    public native boolean isPending();
    @Property(selector = "senderParticipantIdentifier")
    public native NSUUID getSenderParticipantIdentifier();
    @Property(selector = "layout")
    public native MSMessageLayout getLayout();
    @Property(selector = "setLayout:")
    public native void setLayout(MSMessageLayout v);
    @Property(selector = "URL")
    public native NSURL getURL();
    @Property(selector = "setURL:")
    public native void setURL(NSURL v);
    @Property(selector = "shouldExpire")
    public native boolean shouldExpire();
    @Property(selector = "setShouldExpire:")
    public native void setShouldExpire(boolean v);
    @Property(selector = "accessibilityLabel")
    public native String getAccessibilityLabel();
    @Property(selector = "setAccessibilityLabel:")
    public native void setAccessibilityLabel(String v);
    @Property(selector = "summaryText")
    public native String getSummaryText();
    @Property(selector = "setSummaryText:")
    public native void setSummaryText(String v);
    @Property(selector = "error")
    public native NSError getError();
    @Property(selector = "setError:")
    public native void setError(NSError v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSession:")
    protected native @Pointer long init(MSSession session);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
