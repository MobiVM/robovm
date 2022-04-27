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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CXSetMutedCallAction/*</name>*/ 
    extends /*<extends>*/CXCallAction/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CXSetMutedCallActionPtr extends Ptr<CXSetMutedCallAction, CXSetMutedCallActionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CXSetMutedCallAction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CXSetMutedCallAction() {}
    protected CXSetMutedCallAction(Handle h, long handle) { super(h, handle); }
    protected CXSetMutedCallAction(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCallUUID:muted:")
    public CXSetMutedCallAction(NSUUID callUUID, boolean muted) { super((SkipInit) null); initObject(init(callUUID, muted)); }
    @Method(selector = "initWithCoder:")
    public CXSetMutedCallAction(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isMuted")
    public native boolean isMuted();
    @Property(selector = "setMuted:")
    public native void setMuted(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCallUUID:muted:")
    protected native @Pointer long init(NSUUID callUUID, boolean muted);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    /*</methods>*/
}
