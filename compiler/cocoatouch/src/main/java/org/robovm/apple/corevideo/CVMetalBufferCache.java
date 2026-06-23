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
package org.robovm.apple.corevideo;

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
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.iosurface.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreVideo")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CVMetalBufferCache/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(CVMetalBufferCache.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 18.0 and later.
     */
    @GlobalValue(symbol="kCVMetalBufferCacheMaximumBufferAgeKey", optional=true)
    public static native CFString MaximumBufferAgeKey();
    
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Bridge(symbol="CVMetalBufferCacheGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Bridge(symbol="CVMetalBufferCacheCreate", optional=true)
    public static native CVReturn create(CFAllocator allocator, CFDictionary cacheAttributes, MTLDevice metalDevice, CVMetalBuffer.CVMetalBufferPtr cacheOut);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Bridge(symbol="CVMetalBufferCacheCreateBufferFromImage", optional=true)
    public static native CVReturn createBufferFromImage(CFAllocator allocator, CVMetalBuffer bufferCache, CVImageBuffer imageBuffer, CVBuffer.CVBufferPtr bufferOut);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Bridge(symbol="CVMetalBufferCacheFlush", optional=true)
    public static native void flush(CVMetalBuffer bufferCache, long options);
    /*</methods>*/
}
