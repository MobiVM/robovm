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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVSampleCursorSyncInfo/*</name>*/ 
    extends /*<extends>*/Struct<AVSampleCursorSyncInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVSampleCursorSyncInfoPtr extends Ptr<AVSampleCursorSyncInfo, AVSampleCursorSyncInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVSampleCursorSyncInfo() {}
    public AVSampleCursorSyncInfo(boolean sampleIsFullSync, boolean sampleIsPartialSync, boolean sampleIsDroppable) {
        this.setSampleIsFullSync(sampleIsFullSync);
        this.setSampleIsPartialSync(sampleIsPartialSync);
        this.setSampleIsDroppable(sampleIsDroppable);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native boolean isSampleIsFullSync();
    @StructMember(0) public native AVSampleCursorSyncInfo setSampleIsFullSync(boolean sampleIsFullSync);
    @StructMember(1) public native boolean isSampleIsPartialSync();
    @StructMember(1) public native AVSampleCursorSyncInfo setSampleIsPartialSync(boolean sampleIsPartialSync);
    @StructMember(2) public native boolean isSampleIsDroppable();
    @StructMember(2) public native AVSampleCursorSyncInfo setSampleIsDroppable(boolean sampleIsDroppable);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
