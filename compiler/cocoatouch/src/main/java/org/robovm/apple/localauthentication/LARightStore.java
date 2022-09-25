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
package org.robovm.apple.localauthentication;

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
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("LocalAuthentication") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LARightStore/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class LARightStorePtr extends Ptr<LARightStore, LARightStorePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LARightStore.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected LARightStore() {}
    protected LARightStore(Handle h, long handle) { super(h, handle); }
    protected LARightStore(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedStore")
    public static native LARightStore getSharedStore();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "rightForIdentifier:completion:")
    public native void rightForIdentifier(String identifier, @Block VoidBlock2<LAPersistedRight, NSError> handler);
    @Method(selector = "saveRight:identifier:completion:")
    public native void saveRight(LARight right, String identifier, @Block VoidBlock2<LAPersistedRight, NSError> handler);
    @Method(selector = "saveRight:identifier:secret:completion:")
    public native void saveRight(LARight right, String identifier, NSData secret, @Block VoidBlock2<LAPersistedRight, NSError> handler);
    @Method(selector = "removeRight:completion:")
    public native void removeRight(LAPersistedRight right, @Block VoidBlock1<NSError> handler);
    @Method(selector = "removeRightForIdentifier:completion:")
    public native void removeRightForIdentifier(String identifier, @Block VoidBlock1<NSError> handler);
    @Method(selector = "removeAllRightsWithCompletion:")
    public native void removeAllRights(@Block VoidBlock1<NSError> handler);
    /*</methods>*/
}
