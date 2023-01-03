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
package org.robovm.apple.metal;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Metal")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLIOCompressionContext/*</name>*/ 
    extends /*<extends>*/NativeObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLIOCompressionContextPtr extends Ptr<MTLIOCompressionContext, MTLIOCompressionContextPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(MTLIOCompressionContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTLIOCompressionContext() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="MTLIOCompressionContextDefaultChunkSize", optional=true)
    public static native @MachineSizedUInt long getDefaultChunkSize();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="MTLIOCreateCompressionContext", optional=true)
    public static native MTLIOCompressionContext create(@org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String path, MTLIOCompressionMethod type, @MachineSizedUInt long chunkSize);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="MTLIOCompressionContextAppendData", optional=true)
    public native void appendData(VoidPtr data, @MachineSizedUInt long size);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="MTLIOFlushAndDestroyCompressionContext", optional=true)
    public native MTLIOCompressionStatus flushAndDestroy();
    /*</methods>*/
}
