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
package org.robovm.apple.messageui;

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
import org.robovm.apple.messages.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("MessageUI") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MFMailDraft/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MFMailDraftPtr extends Ptr<MFMailDraft, MFMailDraftPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MFMailDraft.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MFMailDraft() {}
    protected MFMailDraft(Handle h, long handle) { super(h, handle); }
    protected MFMailDraft(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSubject:body:from:to:cc:")
    public MFMailDraft(String subject, NSAttributedString body, String from, NSArray<NSString> to, NSArray<NSString> cc) { super((SkipInit) null); initObject(init(subject, body, from, to, cc)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "from")
    public native String getFrom();
    @Property(selector = "subject")
    public native String getSubject();
    @Property(selector = "body")
    public native NSAttributedString getBody();
    @Property(selector = "to")
    public native NSArray<NSString> getTo();
    @Property(selector = "cc")
    public native NSArray<NSString> getCc();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSubject:body:from:to:cc:")
    protected native @Pointer long init(String subject, NSAttributedString body, String from, NSArray<NSString> to, NSArray<NSString> cc);
    /*</methods>*/
}
