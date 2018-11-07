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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MediaPlayer") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPMusicPlayerPlayParametersQueueDescriptor/*</name>*/ 
    extends /*<extends>*/MPMusicPlayerQueueDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPMusicPlayerPlayParametersQueueDescriptorPtr extends Ptr<MPMusicPlayerPlayParametersQueueDescriptor, MPMusicPlayerPlayParametersQueueDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPMusicPlayerPlayParametersQueueDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPMusicPlayerPlayParametersQueueDescriptor() {}
    protected MPMusicPlayerPlayParametersQueueDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPMusicPlayerPlayParametersQueueDescriptor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPlayParametersQueue:")
    public MPMusicPlayerPlayParametersQueueDescriptor(NSArray<MPMusicPlayerPlayParameters> playParametersQueue) { super((SkipInit) null); initObject(init(playParametersQueue)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "playParametersQueue")
    public native NSArray<MPMusicPlayerPlayParameters> getPlayParametersQueue();
    @Property(selector = "setPlayParametersQueue:")
    public native void setPlayParametersQueue(NSArray<MPMusicPlayerPlayParameters> v);
    @Property(selector = "startItemPlayParameters")
    public native MPMusicPlayerPlayParameters getStartItemPlayParameters();
    @Property(selector = "setStartItemPlayParameters:")
    public native void setStartItemPlayParameters(MPMusicPlayerPlayParameters v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPlayParametersQueue:")
    protected native @Pointer long init(NSArray<MPMusicPlayerPlayParameters> playParametersQueue);
    @Method(selector = "setStartTime:forItemWithPlayParameters:")
    public native void setStartTime(double startTime, MPMusicPlayerPlayParameters playParameters);
    @Method(selector = "setEndTime:forItemWithPlayParameters:")
    public native void setEndTime(double endTime, MPMusicPlayerPlayParameters playParameters);
    /*</methods>*/
}
