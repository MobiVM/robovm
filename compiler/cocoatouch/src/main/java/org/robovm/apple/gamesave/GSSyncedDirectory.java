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
package org.robovm.apple.gamesave;

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

/*</javadoc>*/
/*<annotations>*/@Library("GameSave") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GSSyncedDirectory/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GSSyncedDirectoryPtr extends Ptr<GSSyncedDirectory, GSSyncedDirectoryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GSSyncedDirectory.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected GSSyncedDirectory() {}
    protected GSSyncedDirectory(Handle h, long handle) { super(h, handle); }
    protected GSSyncedDirectory(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "directoryState")
    public native GSSyncedDirectoryState getDirectoryState();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "close")
    public native void close();
    @Method(selector = "triggerPendingUploadWithCompletionHandler:")
    public native void triggerPendingUpload(@Block VoidBooleanBlock completion);
    @Method(selector = "resolveConflictsWithVersion:")
    public native void resolveConflicts(GSSyncedDirectoryVersion version);
    @Method(selector = "finishSyncingWithCompletionHandler:")
    public native void finishSyncing(@Block Runnable completion);
    @Method(selector = "finishSyncing:completionHandler:")
    public native void finishSyncing(UIWindow statusDisplay, @Block Runnable completion);
    @Method(selector = "openDirectoryForContainerIdentifier:")
    public static native GSSyncedDirectory openDirectoryForContainerIdentifier(String containerIdentifier);
    /*</methods>*/
}
