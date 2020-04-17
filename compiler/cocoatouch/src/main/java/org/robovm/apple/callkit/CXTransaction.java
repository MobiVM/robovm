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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CXTransaction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CXTransactionPtr extends Ptr<CXTransaction, CXTransactionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CXTransaction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CXTransaction() {}
    protected CXTransaction(Handle h, long handle) { super(h, handle); }
    protected CXTransaction(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithActions:")
    public CXTransaction(NSArray<CXAction> actions) { super((SkipInit) null); initObject(init(actions)); }
    @Method(selector = "initWithAction:")
    public CXTransaction(CXAction action) { super((SkipInit) null); initObject(init(action)); }
    @Method(selector = "initWithCoder:")
    public CXTransaction(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "UUID")
    public native NSUUID getUUID();
    @Property(selector = "isComplete")
    public native boolean isComplete();
    @Property(selector = "actions")
    public native NSArray<CXAction> getActions();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithActions:")
    protected native @Pointer long init(NSArray<CXAction> actions);
    @Method(selector = "initWithAction:")
    protected native @Pointer long init(CXAction action);
    @Method(selector = "addAction:")
    public native void addAction(CXAction action);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
