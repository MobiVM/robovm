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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPMusicPlayerMediaItemQueueDescriptor/*</name>*/ 
    extends /*<extends>*/MPMusicPlayerQueueDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPMusicPlayerMediaItemQueueDescriptorPtr extends Ptr<MPMusicPlayerMediaItemQueueDescriptor, MPMusicPlayerMediaItemQueueDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPMusicPlayerMediaItemQueueDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPMusicPlayerMediaItemQueueDescriptor() {}
    protected MPMusicPlayerMediaItemQueueDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPMusicPlayerMediaItemQueueDescriptor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithQuery:")
    public MPMusicPlayerMediaItemQueueDescriptor(MPMediaQuery query) { super((SkipInit) null); initObject(init(query)); }
    @Method(selector = "initWithItemCollection:")
    public MPMusicPlayerMediaItemQueueDescriptor(MPMediaItemCollection itemCollection) { super((SkipInit) null); initObject(init(itemCollection)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "query")
    public native MPMediaQuery getQuery();
    @Property(selector = "itemCollection")
    public native MPMediaItemCollection getItemCollection();
    @Property(selector = "startItem")
    public native MPMediaItem getStartItem();
    @Property(selector = "setStartItem:")
    public native void setStartItem(MPMediaItem v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithQuery:")
    protected native @Pointer long init(MPMediaQuery query);
    @Method(selector = "initWithItemCollection:")
    protected native @Pointer long init(MPMediaItemCollection itemCollection);
    @Method(selector = "setStartTime:forItem:")
    public native void setStartTime(double startTime, MPMediaItem mediaItem);
    @Method(selector = "setEndTime:forItem:")
    public native void setEndTime(double endTime, MPMediaItem mediaItem);
    /*</methods>*/
}
