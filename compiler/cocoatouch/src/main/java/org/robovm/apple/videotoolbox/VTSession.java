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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VTSession/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VTSessionPtr extends Ptr<VTSession, VTSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(VTSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VTSession() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kVTPropertyTypeKey", optional=true)
    public static native CFString PropertyTypeKey();
    @Library("VideoToolbox")
    public static class Keys {
        static { Bro.bind(Keys.class); }

        @GlobalValue(symbol="kVTPropertyReadWriteStatusKey", optional=true)
        public static native CFString ReadWriteStatus();
        @GlobalValue(symbol="kVTPropertyShouldBeSerializedKey", optional=true)
        public static native CFString ShouldBeSerialized();
        @GlobalValue(symbol="kVTPropertySupportedValueMinimumKey", optional=true)
        public static native CFString SupportedValueMinimum();
        @GlobalValue(symbol="kVTPropertySupportedValueMaximumKey", optional=true)
        public static native CFString SupportedValueMaximum();
        @GlobalValue(symbol="kVTPropertySupportedValueListKey", optional=true)
        public static native CFString SupportedValueList();
        @GlobalValue(symbol="kVTPropertyDocumentationKey", optional=true)
        public static native CFString Documentation();
    }

    @Library("VideoToolbox")
    public static class PropertyTypes {
        static { Bro.bind(PropertyTypes.class); }

        @GlobalValue(symbol="kVTPropertyType_Enumeration", optional=true)
        public static native CFString Enumeration();
        @GlobalValue(symbol="kVTPropertyType_Boolean", optional=true)
        public static native CFString Boolean();
        @GlobalValue(symbol="kVTPropertyType_Number", optional=true)
        public static native CFString Number();
    }

    @Library("VideoToolbox")
    public static class ReadWriteStatus {
        static { Bro.bind(ReadWriteStatus.class); }

        @GlobalValue(symbol="kVTPropertyReadWriteStatus_ReadOnly", optional=true)
        public static native CFString ReadOnly();
        @GlobalValue(symbol="kVTPropertyReadWriteStatus_ReadWrite", optional=true)
        public static native CFString ReadWrite();
    }
    
    @Bridge(symbol="VTSessionCopySupportedPropertyDictionary", optional=true)
    public native OSStatus copySupportedPropertyDictionary(CFDictionary.CFDictionaryPtr supportedPropertyDictionaryOut);
    @Bridge(symbol="VTSessionSetProperty", optional=true)
    public native OSStatus setProperty(CFString propertyKey, CFType propertyValue);
    @Bridge(symbol="VTSessionCopyProperty", optional=true)
    public native OSStatus copyProperty(CFString propertyKey, CFAllocator allocator, VoidPtr propertyValueOut);
    @Bridge(symbol="VTSessionSetProperties", optional=true)
    public native OSStatus setProperties(CFDictionary propertyDictionary);
    @Bridge(symbol="VTSessionCopySerializableProperties", optional=true)
    public native OSStatus copySerializableProperties(CFAllocator allocator, CFDictionary.CFDictionaryPtr dictionaryOut);
    /*</methods>*/
}
