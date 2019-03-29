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
package org.robovm.apple.coremedia;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CMBufferHandlers/*</name>*/ 
    extends /*<extends>*/Struct<CMBufferHandlers>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CMBufferHandlersPtr extends Ptr<CMBufferHandlers, CMBufferHandlersPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CMBufferHandlers() {}
    public CMBufferHandlers(@MachineSizedUInt long version, @Block Block1<CFType, CMTime> getDecodeTimeStamp, @Block Block1<CFType, CMTime> getPresentationTimeStamp, @Block Block1<CFType, CMTime> getDuration, @Block Block1<CFType, Boolean> isDataReady, @Block Block2<CFType, CFType, CFComparisonResult> compare, String dataBecameReadyNotification, @Block Block1<CFType, Long> getSize) {
        this.setVersion(version);
        this.setGetDecodeTimeStamp(getDecodeTimeStamp);
        this.setGetPresentationTimeStamp(getPresentationTimeStamp);
        this.setGetDuration(getDuration);
        this.setIsDataReady(isDataReady);
        this.setCompare(compare);
        this.setDataBecameReadyNotification(dataBecameReadyNotification);
        this.setGetSize(getSize);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @MachineSizedUInt long getVersion();
    @StructMember(0) public native CMBufferHandlers setVersion(@MachineSizedUInt long version);
    @StructMember(1) public native @Block Block1<CFType, CMTime> getGetDecodeTimeStamp();
    @StructMember(1) public native CMBufferHandlers setGetDecodeTimeStamp(@Block Block1<CFType, CMTime> getDecodeTimeStamp);
    @StructMember(2) public native @Block Block1<CFType, CMTime> getGetPresentationTimeStamp();
    @StructMember(2) public native CMBufferHandlers setGetPresentationTimeStamp(@Block Block1<CFType, CMTime> getPresentationTimeStamp);
    @StructMember(3) public native @Block Block1<CFType, CMTime> getGetDuration();
    @StructMember(3) public native CMBufferHandlers setGetDuration(@Block Block1<CFType, CMTime> getDuration);
    @StructMember(4) public native @Block Block1<CFType, Boolean> getIsDataReady();
    @StructMember(4) public native CMBufferHandlers setIsDataReady(@Block Block1<CFType, Boolean> isDataReady);
    @StructMember(5) public native @Block Block2<CFType, CFType, CFComparisonResult> getCompare();
    @StructMember(5) public native CMBufferHandlers setCompare(@Block Block2<CFType, CFType, CFComparisonResult> compare);
    @StructMember(6) public native String getDataBecameReadyNotification();
    @StructMember(6) public native CMBufferHandlers setDataBecameReadyNotification(String dataBecameReadyNotification);
    @StructMember(7) public native @Block Block1<CFType, Long> getGetSize();
    @StructMember(7) public native CMBufferHandlers setGetSize(@Block Block1<CFType, Long> getSize);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
