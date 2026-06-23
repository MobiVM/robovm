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
package org.robovm.apple.videotoolbox;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("VideoToolbox")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VTMultiPassStorage/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VTMultiPassStoragePtr extends Ptr<VTMultiPassStorage, VTMultiPassStoragePtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(VTMultiPassStorage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VTMultiPassStorage() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("VideoToolbox")
    public static class CreationOptions {
        static { Bro.bind(CreationOptions.class); }

        @GlobalValue(symbol="kVTMultiPassStorageCreationOption_DoNotDelete", optional=true)
        public static native CFString DoNotDelete();
    }
    
    @Bridge(symbol="VTMultiPassStorageGetTypeID", optional=true)
    public static native @MachineSizedUInt long typeID();
    @Bridge(symbol="VTMultiPassStorageCreate", optional=true)
    public static native OSStatus create(CFAllocator allocator, CFURL fileURL, @ByVal CMTimeRange timeRange, CFDictionary options, VTMultiPassStorage.VTMultiPassStoragePtr multiPassStorageOut);
    @Bridge(symbol="VTMultiPassStorageClose", optional=true)
    public native OSStatus closeStorage();
    /*</methods>*/
}
