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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CallKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CXStartCallAction/*</name>*/ 
    extends /*<extends>*/CXCallAction/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CXStartCallActionPtr extends Ptr<CXStartCallAction, CXStartCallActionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CXStartCallAction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CXStartCallAction() {}
    protected CXStartCallAction(Handle h, long handle) { super(h, handle); }
    protected CXStartCallAction(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCallUUID:handle:")
    public CXStartCallAction(NSUUID callUUID, CXHandle handle) { super((SkipInit) null); initObject(init(callUUID, handle)); }
    @Method(selector = "initWithCoder:")
    public CXStartCallAction(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "handle")
    public native CXHandle getGetCallHandle();
    @Property(selector = "setHandle:")
    public native void setGetCallHandle(CXHandle v);
    @Property(selector = "contactIdentifier")
    public native String getContactIdentifier();
    @Property(selector = "setContactIdentifier:")
    public native void setContactIdentifier(String v);
    @Property(selector = "isVideo")
    public native boolean isVideo();
    @Property(selector = "setVideo:")
    public native void setVideo(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCallUUID:handle:")
    protected native @Pointer long init(NSUUID callUUID, CXHandle handle);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    @Method(selector = "fulfillWithDateStarted:")
    public native void fulfill(NSDate dateStarted);
    /*</methods>*/
}
