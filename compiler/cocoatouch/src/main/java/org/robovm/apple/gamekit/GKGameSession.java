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
package org.robovm.apple.gamekit;

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
 * @since Available in iOS 10.0 and later.
 * @deprecated Deprecated in iOS 12.0.
 */
@Deprecated
/*</javadoc>*/
/*<annotations>*/@Library("GameKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKGameSession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKGameSessionPtr extends Ptr<GKGameSession, GKGameSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKGameSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKGameSession() {}
    protected GKGameSession(Handle h, long handle) { super(h, handle); }
    protected GKGameSession(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "owner")
    public native GKCloudPlayer getOwner();
    @Property(selector = "players")
    public native NSArray<GKCloudPlayer> getPlayers();
    @Property(selector = "lastModifiedDate")
    public native NSDate getLastModifiedDate();
    @Property(selector = "lastModifiedPlayer")
    public native GKCloudPlayer getLastModifiedPlayer();
    @Property(selector = "maxNumberOfConnectedPlayers")
    public native @MachineSizedSInt long getMaxNumberOfConnectedPlayers();
    @Property(selector = "badgedPlayers")
    public native NSArray<GKCloudPlayer> getBadgedPlayers();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getShareURLWithCompletionHandler:")
    public native void getShareURL(@Block VoidBlock2<NSURL, NSError> completionHandler);
    @Method(selector = "loadDataWithCompletionHandler:")
    public native void loadData(@Block VoidBlock2<NSData, NSError> completionHandler);
    @Method(selector = "saveData:completionHandler:")
    public native void saveData(NSData data, @Block VoidBlock2<NSData, NSError> completionHandler);
    @Method(selector = "setConnectionState:completionHandler:")
    public native void setConnectionState(GKConnectionState state, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "playersWithConnectionState:")
    public native NSArray<GKCloudPlayer> getPlayers(GKConnectionState state);
    @Method(selector = "sendData:withTransportType:completionHandler:")
    public native void sendData(NSData data, GKTransportType transport, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "sendMessageWithLocalizedFormatKey:arguments:data:toPlayers:badgePlayers:completionHandler:")
    public native void sendMessage(String key, NSArray<NSString> arguments, NSData data, NSArray<GKCloudPlayer> players, boolean badgePlayers, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "clearBadgeForPlayers:completionHandler:")
    public native void clearBadge(NSArray<GKCloudPlayer> players, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "createSessionInContainer:withTitle:maxConnectedPlayers:completionHandler:")
    public static native void createSessionInContainer(String containerName, String title, @MachineSizedSInt long maxPlayers, @Block VoidBlock2<GKGameSession, NSError> completionHandler);
    @Method(selector = "loadSessionsInContainer:completionHandler:")
    public static native void loadSessionsInContainer(String containerName, @Block VoidBlock2<NSArray<GKGameSession>, NSError> completionHandler);
    @Method(selector = "loadSessionWithIdentifier:completionHandler:")
    public static native void loadSession(String identifier, @Block VoidBlock2<GKGameSession, NSError> completionHandler);
    @Method(selector = "removeSessionWithIdentifier:completionHandler:")
    public static native void removeSession(String identifier, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 12.0. Use GKLocalPlayer's registerListener: to register for GKLocalPlayerListener event notifications.
     */
    @Deprecated
    @Method(selector = "addEventListener:")
    public static native void addEventListener(GKGameSessionEventListener listener);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 12.0. Use GKLocalPlayer's unregisterListener: or unregisterAllListeners to unregister from GKLocalPlayerListener event notifications.
     */
    @Deprecated
    @Method(selector = "removeEventListener:")
    public static native void removeEventListener(GKGameSessionEventListener listener);
    /*</methods>*/
}
