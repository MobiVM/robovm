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
package org.robovm.apple.mediasetup;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MediaSetup") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSSetupSession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MSSetupSessionPtr extends Ptr<MSSetupSession, MSSetupSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSSetupSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MSSetupSession() {}
    protected MSSetupSession(Handle h, long handle) { super(h, handle); }
    protected MSSetupSession(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithServiceAccount:")
    public MSSetupSession(MSServiceAccount serviceAccount) { super((SkipInit) null); initObject(init(serviceAccount)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "presentationContext")
    public native MSAuthenticationPresentationContext getPresentationContext();
    @Property(selector = "setPresentationContext:", strongRef = true)
    public native void setPresentationContext(MSAuthenticationPresentationContext v);
    @Property(selector = "account")
    public native MSServiceAccount getAccount();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithServiceAccount:")
    protected native @Pointer long init(MSServiceAccount serviceAccount);
    public boolean start() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = start(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "startWithError:")
    private native boolean start(NSError.NSErrorPtr error);
    /*</methods>*/
}
