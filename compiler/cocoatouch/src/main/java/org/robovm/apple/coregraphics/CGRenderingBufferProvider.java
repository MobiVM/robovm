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
package org.robovm.apple.coregraphics;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreGraphics")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGRenderingBufferProvider/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CGRenderingBufferProviderPtr extends Ptr<CGRenderingBufferProvider, CGRenderingBufferProviderPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CGRenderingBufferProvider.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CGRenderingBufferProvider() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Bridge(symbol="CGRenderingBufferProviderCreate", optional=true)
    public static native CGRenderingBufferProvider create(VoidPtr info, @MachineSizedUInt long size, @Block Block1<VoidPtr, VoidPtr> lockPointer, @Block VoidBlock2<VoidPtr, VoidPtr> unlockPointer, @Block VoidBlock1<VoidPtr> releaseInfo);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Bridge(symbol="CGRenderingBufferProviderCreateWithCFData", optional=true)
    public static native CGRenderingBufferProvider create(NSData data);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Bridge(symbol="CGRenderingBufferProviderGetSize", optional=true)
    public native @MachineSizedUInt long getSize();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Bridge(symbol="CGRenderingBufferLockBytePtr", optional=true)
    public native VoidPtr lockBytePtr();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Bridge(symbol="CGRenderingBufferUnlockBytePtr", optional=true)
    public native void unlockBytePtr();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Bridge(symbol="CGRenderingBufferProviderGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    /*</methods>*/
}
