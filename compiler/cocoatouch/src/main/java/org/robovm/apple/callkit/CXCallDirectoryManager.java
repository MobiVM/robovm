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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CXCallDirectoryManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CXCallDirectoryManagerPtr extends Ptr<CXCallDirectoryManager, CXCallDirectoryManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CXCallDirectoryManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CXCallDirectoryManager() {}
    protected CXCallDirectoryManager(Handle h, long handle) { super(h, handle); }
    protected CXCallDirectoryManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedInstance")
    public static native CXCallDirectoryManager getSharedInstance();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "reloadExtensionWithIdentifier:completionHandler:")
    public native void reloadExtension(String identifier, @Block VoidBlock1<NSError> completion);
    @Method(selector = "getEnabledStatusForExtensionWithIdentifier:completionHandler:")
    public native void getEnabledStatusForExtension(String identifier, @Block VoidBlock2<CXCallDirectoryEnabledStatus, NSError> completion);
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Method(selector = "openSettingsWithCompletionHandler:")
    public native void openSettings(@Block VoidBlock1<NSError> completion);
    /*</methods>*/
}
