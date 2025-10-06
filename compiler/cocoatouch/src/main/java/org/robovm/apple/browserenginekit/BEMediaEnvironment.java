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
package org.robovm.apple.browserenginekit;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("BrowserEngineKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BEMediaEnvironment/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BEMediaEnvironmentPtr extends Ptr<BEMediaEnvironment, BEMediaEnvironmentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BEMediaEnvironment.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected BEMediaEnvironment() {}
    protected BEMediaEnvironment(Handle h, long handle) { super(h, handle); }
    protected BEMediaEnvironment(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithWebPageURL:")
    public BEMediaEnvironment(NSURL url) { super((SkipInit) null); initObject(init(url)); }
    @Method(selector = "initWithXPCRepresentation:error:")
    public BEMediaEnvironment(ObjCObject xpcRepresentation) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(xpcRepresentation, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithWebPageURL:")
    protected native @Pointer long init(NSURL url);
    @Method(selector = "initWithXPCRepresentation:error:")
    private native @Pointer long init(ObjCObject xpcRepresentation, NSError.NSErrorPtr error);
    @Method(selector = "createXPCRepresentation")
    public native ObjCObject createXPCRepresentation();
    public boolean activate() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = activate(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "activateWithError:")
    private native boolean activate(NSError.NSErrorPtr error);
    public boolean suspend() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = suspend(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "suspendWithError:")
    private native boolean suspend(NSError.NSErrorPtr error);
    public AVCaptureSession makeCaptureSession() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       AVCaptureSession result = makeCaptureSession(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "makeCaptureSessionWithError:")
    private native AVCaptureSession makeCaptureSession(NSError.NSErrorPtr error);
    /*</methods>*/
}
