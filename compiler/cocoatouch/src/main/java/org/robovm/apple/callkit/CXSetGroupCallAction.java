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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CXSetGroupCallAction/*</name>*/ 
    extends /*<extends>*/CXCallAction/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CXSetGroupCallActionPtr extends Ptr<CXSetGroupCallAction, CXSetGroupCallActionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CXSetGroupCallAction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CXSetGroupCallAction() {}
    protected CXSetGroupCallAction(Handle h, long handle) { super(h, handle); }
    protected CXSetGroupCallAction(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCallUUID:callUUIDToGroupWith:")
    public CXSetGroupCallAction(NSUUID callUUID, NSUUID callUUIDToGroupWith) { super((SkipInit) null); initObject(init(callUUID, callUUIDToGroupWith)); }
    @Method(selector = "initWithCoder:")
    public CXSetGroupCallAction(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "callUUIDToGroupWith")
    public native NSUUID getCallUUIDToGroupWith();
    @Property(selector = "setCallUUIDToGroupWith:")
    public native void setCallUUIDToGroupWith(NSUUID v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCallUUID:callUUIDToGroupWith:")
    protected native @Pointer long init(NSUUID callUUID, NSUUID callUUIDToGroupWith);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    /*</methods>*/
}
