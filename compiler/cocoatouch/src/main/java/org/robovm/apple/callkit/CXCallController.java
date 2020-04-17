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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CXCallController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CXCallControllerPtr extends Ptr<CXCallController, CXCallControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CXCallController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CXCallController() {}
    protected CXCallController(Handle h, long handle) { super(h, handle); }
    protected CXCallController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithQueue:")
    public CXCallController(DispatchQueue queue) { super((SkipInit) null); initObject(init(queue)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "callObserver")
    public native CXCallObserver getCallObserver();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithQueue:")
    protected native @Pointer long init(DispatchQueue queue);
    @Method(selector = "requestTransaction:completion:")
    public native void requestTransaction(CXTransaction transaction, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "requestTransactionWithActions:completion:")
    public native void requestTransaction(NSArray<CXAction> actions, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "requestTransactionWithAction:completion:")
    public native void requestTransaction(CXAction action, @Block VoidBlock1<NSError> completion);
    /*</methods>*/
}
