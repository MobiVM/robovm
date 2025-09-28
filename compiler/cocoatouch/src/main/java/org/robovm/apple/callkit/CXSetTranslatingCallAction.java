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
package org.robovm.apple.callkit;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CallKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CXSetTranslatingCallAction/*</name>*/ 
    extends /*<extends>*/CXCallAction/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CXSetTranslatingCallActionPtr extends Ptr<CXSetTranslatingCallAction, CXSetTranslatingCallActionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CXSetTranslatingCallAction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CXSetTranslatingCallAction() {}
    protected CXSetTranslatingCallAction(Handle h, long handle) { super(h, handle); }
    protected CXSetTranslatingCallAction(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCallUUID:isTranslating:localLanguage:remoteLanguage:")
    public CXSetTranslatingCallAction(NSUUID uuid, boolean isTranslating, String localLanguage, String remoteLanguage) { super((SkipInit) null); initObject(init(uuid, isTranslating, localLanguage, remoteLanguage)); }
    @Method(selector = "initWithCoder:")
    public CXSetTranslatingCallAction(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isTranslating")
    public native boolean isTranslating();
    @Property(selector = "localLanguage")
    public native String getLocalLanguage();
    @Property(selector = "remoteLanguage")
    public native String getRemoteLanguage();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCallUUID:isTranslating:localLanguage:remoteLanguage:")
    protected native @Pointer long init(NSUUID uuid, boolean isTranslating, String localLanguage, String remoteLanguage);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    @Method(selector = "fulfillUsingTranslationEngine:")
    public native void fulfillUsingTranslationEngine(CXTranslationEngine translationEngine);
    /*</methods>*/
}
