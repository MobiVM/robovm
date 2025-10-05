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
 * @since Available in iOS 18.3 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTRXPCServerProtocol/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol, MTRXPCServerProtocol_MTRDevice, MTRXPCServerProtocol_MTRDeviceController/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Library("Matter")
    public static class Keys {
        static { Bro.bind(Keys.class); }

        /**
         * @since Available in iOS 18.2 and later.
         */
        @GlobalValue(symbol="MTRDeviceControllerRegistrationNodeIDsKey", optional=true)
        public static native String RegistrationNodeIDs();
        /**
         * @since Available in iOS 18.2 and later.
         */
        @GlobalValue(symbol="MTRDeviceControllerRegistrationNodeIDKey", optional=true)
        public static native String RegistrationNodeID();
        /**
         * @since Available in iOS 18.2 and later.
         */
        @GlobalValue(symbol="MTRDeviceControllerRegistrationControllerContextKey", optional=true)
        public static native String RegistrationControllerContext();
        /**
         * @since Available in iOS 18.3 and later.
         */
        @GlobalValue(symbol="MTRDeviceControllerRegistrationControllerNodeIDKey", optional=true)
        public static native String RegistrationControllerNodeID();
        /**
         * @since Available in iOS 18.3 and later.
         */
        @GlobalValue(symbol="MTRDeviceControllerRegistrationControllerIsRunningKey", optional=true)
        public static native String RegistrationControllerIsRunning();
        /**
         * @since Available in iOS 18.3 and later.
         */
        @GlobalValue(symbol="MTRDeviceControllerRegistrationDeviceInternalStateKey", optional=true)
        public static native String RegistrationDeviceInternalState();
        /**
         * @since Available in iOS 18.3 and later.
         */
        @GlobalValue(symbol="MTRDeviceControllerRegistrationControllerCompressedFabricIDKey", optional=true)
        public static native String RegistrationControllerCompressedFabricID();
    }
    
    @Method(selector = "deviceController:checkInWithContext:")
    void checkIn(NSUUID controller, NSDictionary<?, ?> context);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
