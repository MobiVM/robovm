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
package org.robovm.apple.accessibility;

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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.2 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Accessibility") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AXFeatureOverrideSessionManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AXFeatureOverrideSessionManagerPtr extends Ptr<AXFeatureOverrideSessionManager, AXFeatureOverrideSessionManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AXFeatureOverrideSessionManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AXFeatureOverrideSessionManager() {}
    protected AXFeatureOverrideSessionManager(Handle h, long handle) { super(h, handle); }
    protected AXFeatureOverrideSessionManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedInstance")
    public static native AXFeatureOverrideSessionManager getSharedInstance();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public AXFeatureOverrideSession beginOverrideSession(AXFeatureOverrideSessionOptions enableOptions, AXFeatureOverrideSessionOptions disableOptions) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       AXFeatureOverrideSession result = beginOverrideSession(enableOptions, disableOptions, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "beginOverrideSessionEnablingOptions:disablingOptions:error:")
    private native AXFeatureOverrideSession beginOverrideSession(AXFeatureOverrideSessionOptions enableOptions, AXFeatureOverrideSessionOptions disableOptions, NSError.NSErrorPtr error);
    public boolean endOverrideSession(AXFeatureOverrideSession session) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = endOverrideSession(session, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "endOverrideSession:error:")
    private native boolean endOverrideSession(AXFeatureOverrideSession session, NSError.NSErrorPtr error);
    /*</methods>*/
}
