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
package org.robovm.apple.matter;

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
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRDeviceControllerFactory/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRDeviceControllerFactoryPtr extends Ptr<MTRDeviceControllerFactory, MTRDeviceControllerFactoryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRDeviceControllerFactory.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRDeviceControllerFactory() {}
    protected MTRDeviceControllerFactory(Handle h, long handle) { super(h, handle); }
    protected MTRDeviceControllerFactory(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isRunning")
    public native boolean isRunning();
    @Property(selector = "knownFabrics")
    public native NSArray<MTRFabricInfo> getKnownFabrics();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public boolean startControllerFactory(MTRDeviceControllerFactoryParams startupParams) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = startControllerFactory(startupParams, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "startControllerFactory:error:")
    private native boolean startControllerFactory(MTRDeviceControllerFactoryParams startupParams, NSError.NSErrorPtr error);
    @Method(selector = "stopControllerFactory")
    public native void stopControllerFactory();
    public MTRDeviceController createControllerOnExistingFabric(MTRDeviceControllerStartupParams startupParams) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       MTRDeviceController result = createControllerOnExistingFabric(startupParams, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "createControllerOnExistingFabric:error:")
    private native MTRDeviceController createControllerOnExistingFabric(MTRDeviceControllerStartupParams startupParams, NSError.NSErrorPtr error);
    public MTRDeviceController createControllerOnNewFabric(MTRDeviceControllerStartupParams startupParams) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       MTRDeviceController result = createControllerOnNewFabric(startupParams, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "createControllerOnNewFabric:error:")
    private native MTRDeviceController createControllerOnNewFabric(MTRDeviceControllerStartupParams startupParams, NSError.NSErrorPtr error);
    @Method(selector = "sharedInstance")
    public static native MTRDeviceControllerFactory sharedInstance();
    /*</methods>*/
}
