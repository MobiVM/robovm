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
package org.robovm.apple.coremidi;

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
import org.robovm.apple.corefoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreMIDI") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MIDIUMPEndpointManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MIDIUMPEndpointManagerPtr extends Ptr<MIDIUMPEndpointManager, MIDIUMPEndpointManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MIDIUMPEndpointManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MIDIUMPEndpointManager() {}
    protected MIDIUMPEndpointManager(Handle h, long handle) { super(h, handle); }
    protected MIDIUMPEndpointManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedInstance")
    public static native MIDIUMPEndpointManager getSharedInstance();
    @Property(selector = "UMPEndpoints")
    public native NSArray<MIDIUMPEndpoint> getUMPEndpoints();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("CoreMIDI")
    public static class Notifications {
        static { Bro.bind(Notifications.class); }

        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MIDIUMPEndpointWasAddedNotification", optional=true)
        public static native NSString EndpointWasAdded();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MIDIUMPEndpointWasRemovedNotification", optional=true)
        public static native NSString EndpointWasRemoved();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MIDIUMPEndpointWasUpdatedNotification", optional=true)
        public static native NSString EndpointWasUpdated();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="MIDIUMPFunctionBlockWasUpdatedNotification", optional=true)
        public static native NSString FunctionBlockWasUpdated();
    }
    
    
    /*</methods>*/
}
