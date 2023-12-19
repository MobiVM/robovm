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

/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRThreadOperationalDataset/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRThreadOperationalDatasetPtr extends Ptr<MTRThreadOperationalDataset, MTRThreadOperationalDatasetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRThreadOperationalDataset.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRThreadOperationalDataset() {}
    protected MTRThreadOperationalDataset(Handle h, long handle) { super(h, handle); }
    protected MTRThreadOperationalDataset(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithNetworkName:extendedPANID:masterKey:PSKc:channelNumber:panID:")
    public MTRThreadOperationalDataset(String networkName, NSData extendedPANID, NSData masterKey, NSData PSKc, NSNumber channelNumber, NSData panID) { super((SkipInit) null); initObject(init(networkName, extendedPANID, masterKey, PSKc, channelNumber, panID)); }
    @Method(selector = "initWithData:")
    public MTRThreadOperationalDataset(NSData data) { super((SkipInit) null); initObject(init(data)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "networkName")
    public native String getNetworkName();
    @Property(selector = "extendedPANID")
    public native NSData getExtendedPANID();
    @Property(selector = "masterKey")
    public native NSData getMasterKey();
    @Property(selector = "PSKc")
    public native NSData getPSKc();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "channelNumber")
    public native NSNumber getChannelNumber();
    @Property(selector = "panID")
    public native NSData getPanID();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("Matter")
    public static class SizeOf {
        static { Bro.bind(SizeOf.class); }

        @GlobalValue(symbol="MTRSizeThreadNetworkName", optional=true)
        public static native @MachineSizedUInt long MTRSizeThreadNetworkName();
        /**
         * @since Available in iOS 16.4 and later.
         */
        @GlobalValue(symbol="MTRSizeThreadExtendedPANID", optional=true)
        public static native @MachineSizedUInt long MTRSizeThreadExtendedPANID();
        @GlobalValue(symbol="MTRSizeThreadMasterKey", optional=true)
        public static native @MachineSizedUInt long MTRSizeThreadMasterKey();
        @GlobalValue(symbol="MTRSizeThreadPSKc", optional=true)
        public static native @MachineSizedUInt long MTRSizeThreadPSKc();
        /**
         * @since Available in iOS 16.4 and later.
         */
        @GlobalValue(symbol="MTRSizeThreadPANID", optional=true)
        public static native @MachineSizedUInt long MTRSizeThreadPANID();
    }
    
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithNetworkName:extendedPANID:masterKey:PSKc:channelNumber:panID:")
    protected native @Pointer long init(String networkName, NSData extendedPANID, NSData masterKey, NSData PSKc, NSNumber channelNumber, NSData panID);
    @Method(selector = "initWithData:")
    protected native @Pointer long init(NSData data);
    @Method(selector = "data")
    public native NSData data();
    /*</methods>*/
}
