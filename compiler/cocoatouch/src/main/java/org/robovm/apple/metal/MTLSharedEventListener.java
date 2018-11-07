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
package org.robovm.apple.metal;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLSharedEventListener/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLSharedEventListenerPtr extends Ptr<MTLSharedEventListener, MTLSharedEventListenerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLSharedEventListener.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLSharedEventListener() {}
    protected MTLSharedEventListener(Handle h, long handle) { super(h, handle); }
    protected MTLSharedEventListener(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDispatchQueue:")
    public MTLSharedEventListener(DispatchQueue dispatchQueue) { super((SkipInit) null); initObject(init(dispatchQueue)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dispatchQueue")
    public native DispatchQueue getDispatchQueue();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDispatchQueue:")
    protected native @Pointer long init(DispatchQueue dispatchQueue);
    /*</methods>*/
}
