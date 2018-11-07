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
package org.robovm.apple.mediaplayer;

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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.1 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MediaPlayer") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPMusicPlayerStoreQueueDescriptor/*</name>*/ 
    extends /*<extends>*/MPMusicPlayerQueueDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPMusicPlayerStoreQueueDescriptorPtr extends Ptr<MPMusicPlayerStoreQueueDescriptor, MPMusicPlayerStoreQueueDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPMusicPlayerStoreQueueDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPMusicPlayerStoreQueueDescriptor() {}
    protected MPMusicPlayerStoreQueueDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPMusicPlayerStoreQueueDescriptor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithStoreIDs:")
    public MPMusicPlayerStoreQueueDescriptor(NSArray<NSString> storeIDs) { super((SkipInit) null); initObject(init(storeIDs)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "storeIDs")
    public native NSArray<NSString> getStoreIDs();
    @Property(selector = "setStoreIDs:")
    public native void setStoreIDs(NSArray<NSString> v);
    @Property(selector = "startItemID")
    public native String getStartItemID();
    @Property(selector = "setStartItemID:")
    public native void setStartItemID(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithStoreIDs:")
    protected native @Pointer long init(NSArray<NSString> storeIDs);
    @Method(selector = "setStartTime:forItemWithStoreID:")
    public native void setStartTime(double startTime, String storeID);
    @Method(selector = "setEndTime:forItemWithStoreID:")
    public native void setEndTime(double endTime, String storeID);
    /*</methods>*/
}
