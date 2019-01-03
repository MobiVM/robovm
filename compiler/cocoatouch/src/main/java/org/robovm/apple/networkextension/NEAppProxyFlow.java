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
package org.robovm.apple.networkextension;

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
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NetworkExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEAppProxyFlow/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NEAppProxyFlowPtr extends Ptr<NEAppProxyFlow, NEAppProxyFlowPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEAppProxyFlow.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEAppProxyFlow() {}
    protected NEAppProxyFlow(Handle h, long handle) { super(h, handle); }
    protected NEAppProxyFlow(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "metaData")
    public native NEFlowMetaData getMetaData();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "openWithLocalEndpoint:completionHandler:")
    public native void open(NWHostEndpoint localEndpoint, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "closeReadWithError:")
    public native void closeRead(NSError error);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "closeWriteWithError:")
    public native void closeWrite(NSError error);
    /*</methods>*/
}
