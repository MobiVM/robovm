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
package org.robovm.apple.iosurface;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("IOSurface") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IOSurface/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class IOSurfacePtr extends Ptr<IOSurface, IOSurfacePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IOSurface.class); }/*</bind>*/
    /*<constants>*/
    public static final int Constants_kIOSurfaceSuccess = 0;
    /*</constants>*/
    /*<constructors>*/
    public IOSurface() {}
    protected IOSurface(Handle h, long handle) { super(h, handle); }
    protected IOSurface(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithProperties:")
    public IOSurface(NSDictionary<?, ?> properties) { super((SkipInit) null); initObject(init(properties)); }
    @Method(selector = "initWithCoder:")
    public IOSurface(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "allocationSize")
    public native @MachineSizedSInt long getAllocationSize();
    @Property(selector = "width")
    public native @MachineSizedSInt long getWidth();
    @Property(selector = "height")
    public native @MachineSizedSInt long getHeight();
    @Property(selector = "baseAddress")
    public native VoidPtr getBaseAddress();
    @Property(selector = "pixelFormat")
    public native int getPixelFormat();
    @Property(selector = "bytesPerRow")
    public native @MachineSizedSInt long getBytesPerRow();
    @Property(selector = "bytesPerElement")
    public native @MachineSizedSInt long getBytesPerElement();
    @Property(selector = "elementWidth")
    public native @MachineSizedSInt long getElementWidth();
    @Property(selector = "elementHeight")
    public native @MachineSizedSInt long getElementHeight();
    @Property(selector = "seed")
    public native int getSeed();
    @Property(selector = "planeCount")
    public native @MachineSizedUInt long getPlaneCount();
    @Property(selector = "isInUse")
    public native boolean isInUse();
    @Property(selector = "localUseCount")
    public native int getLocalUseCount();
    @Property(selector = "setLocalUseCount:")
    public native void setLocalUseCount(int v);
    @Property(selector = "allowsPixelSizeCasting")
    public native boolean allowsPixelSizeCasting();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetTypeID", optional=true)
    public static native @MachineSizedUInt long iOSurfaceGetTypeID();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceCreate", optional=true)
    public static native IOSurface iOSurfaceCreate(NSDictionary properties);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceLookup", optional=true)
    public static native IOSurface iOSurfaceLookup(int csid);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetID", optional=true)
    public native int iOSurfaceGetID();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceLock", optional=true)
    public native int iOSurfaceLock(IOSurfaceLockOptions options, IntPtr seed);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceUnlock", optional=true)
    public native int iOSurfaceUnlock(IOSurfaceLockOptions options, IntPtr seed);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetAllocSize", optional=true)
    public native @MachineSizedUInt long iOSurfaceGetAllocSize();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetWidth", optional=true)
    public native @MachineSizedUInt long iOSurfaceGetWidth();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetHeight", optional=true)
    public native @MachineSizedUInt long iOSurfaceGetHeight();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetBytesPerElement", optional=true)
    public native @MachineSizedUInt long iOSurfaceGetBytesPerElement();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetBytesPerRow", optional=true)
    public native @MachineSizedUInt long iOSurfaceGetBytesPerRow();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetBaseAddress", optional=true)
    public native VoidPtr iOSurfaceGetBaseAddress();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetElementWidth", optional=true)
    public native @MachineSizedUInt long iOSurfaceGetElementWidth();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetElementHeight", optional=true)
    public native @MachineSizedUInt long iOSurfaceGetElementHeight();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetPixelFormat", optional=true)
    public native int iOSurfaceGetPixelFormat();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetSeed", optional=true)
    public native int iOSurfaceGetSeed();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetPlaneCount", optional=true)
    public native @MachineSizedUInt long iOSurfaceGetPlaneCount();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetWidthOfPlane", optional=true)
    public native @MachineSizedUInt long iOSurfaceGetWidthOfPlane(@MachineSizedUInt long planeIndex);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetHeightOfPlane", optional=true)
    public native @MachineSizedUInt long iOSurfaceGetHeightOfPlane(@MachineSizedUInt long planeIndex);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetBytesPerElementOfPlane", optional=true)
    public native @MachineSizedUInt long iOSurfaceGetBytesPerElementOfPlane(@MachineSizedUInt long planeIndex);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetBytesPerRowOfPlane", optional=true)
    public native @MachineSizedUInt long iOSurfaceGetBytesPerRowOfPlane(@MachineSizedUInt long planeIndex);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetBaseAddressOfPlane", optional=true)
    public native VoidPtr iOSurfaceGetBaseAddressOfPlane(@MachineSizedUInt long planeIndex);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetElementWidthOfPlane", optional=true)
    public native @MachineSizedUInt long iOSurfaceGetElementWidthOfPlane(@MachineSizedUInt long planeIndex);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetElementHeightOfPlane", optional=true)
    public native @MachineSizedUInt long iOSurfaceGetElementHeightOfPlane(@MachineSizedUInt long planeIndex);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetNumberOfComponentsOfPlane", optional=true)
    public native @MachineSizedUInt long iOSurfaceGetNumberOfComponentsOfPlane(@MachineSizedUInt long planeIndex);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetNameOfComponentOfPlane", optional=true)
    public native IOSurfaceComponentName iOSurfaceGetNameOfComponentOfPlane(@MachineSizedUInt long planeIndex, @MachineSizedUInt long componentIndex);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetTypeOfComponentOfPlane", optional=true)
    public native IOSurfaceComponentType iOSurfaceGetTypeOfComponentOfPlane(@MachineSizedUInt long planeIndex, @MachineSizedUInt long componentIndex);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetRangeOfComponentOfPlane", optional=true)
    public native IOSurfaceComponentRange iOSurfaceGetRangeOfComponentOfPlane(@MachineSizedUInt long planeIndex, @MachineSizedUInt long componentIndex);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetBitDepthOfComponentOfPlane", optional=true)
    public native @MachineSizedUInt long iOSurfaceGetBitDepthOfComponentOfPlane(@MachineSizedUInt long planeIndex, @MachineSizedUInt long componentIndex);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetBitOffsetOfComponentOfPlane", optional=true)
    public native @MachineSizedUInt long iOSurfaceGetBitOffsetOfComponentOfPlane(@MachineSizedUInt long planeIndex, @MachineSizedUInt long componentIndex);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetSubsampling", optional=true)
    public native IOSurfaceSubsampling iOSurfaceGetSubsampling();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceSetValue", optional=true)
    public native void iOSurfaceSetValue(CFString key, CFType value);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceCopyValue", optional=true)
    public native CFType iOSurfaceCopyValue(CFString key);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceRemoveValue", optional=true)
    public native void iOSurfaceRemoveValue(CFString key);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceSetValues", optional=true)
    public native void iOSurfaceSetValues(NSDictionary keysAndValues);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceCopyAllValues", optional=true)
    public native NSDictionary iOSurfaceCopyAllValues();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceRemoveAllValues", optional=true)
    public native void iOSurfaceRemoveAllValues();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceCreateMachPort", optional=true)
    public native int iOSurfaceCreateMachPort();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceLookupFromMachPort", optional=true)
    public static native IOSurface iOSurfaceLookupFromMachPort(int port);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetPropertyMaximum", optional=true)
    public static native @MachineSizedUInt long iOSurfaceGetPropertyMaximum(CFString property);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetPropertyAlignment", optional=true)
    public static native @MachineSizedUInt long iOSurfaceGetPropertyAlignment(CFString property);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceAlignProperty", optional=true)
    public static native @MachineSizedUInt long iOSurfaceAlignProperty(CFString property, @MachineSizedUInt long value);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceIncrementUseCount", optional=true)
    public native void iOSurfaceIncrementUseCount();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceDecrementUseCount", optional=true)
    public native void iOSurfaceDecrementUseCount();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceGetUseCount", optional=true)
    public native int iOSurfaceGetUseCount();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Bridge(symbol="IOSurfaceIsInUse", optional=true)
    public native boolean iOSurfaceIsInUse();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="IOSurfaceAllowsPixelSizeCasting", optional=true)
    public native boolean iOSurfaceAllowsPixelSizeCasting();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="IOSurfaceSetPurgeable", optional=true)
    public native int iOSurfaceSetPurgeable(int newState, IntPtr oldState);
    
    @Method(selector = "initWithProperties:")
    protected native @Pointer long init(NSDictionary<?, ?> properties);
    @Method(selector = "lockWithOptions:seed:")
    public native int lock(IOSurfaceLockOptions options, IntPtr seed);
    @Method(selector = "unlockWithOptions:seed:")
    public native int unlock(IOSurfaceLockOptions options, IntPtr seed);
    @Method(selector = "widthOfPlaneAtIndex:")
    public native @MachineSizedSInt long widthOfPlaneAtIndex(@MachineSizedUInt long planeIndex);
    @Method(selector = "heightOfPlaneAtIndex:")
    public native @MachineSizedSInt long heightOfPlaneAtIndex(@MachineSizedUInt long planeIndex);
    @Method(selector = "bytesPerRowOfPlaneAtIndex:")
    public native @MachineSizedSInt long bytesPerRowOfPlaneAtIndex(@MachineSizedUInt long planeIndex);
    @Method(selector = "bytesPerElementOfPlaneAtIndex:")
    public native @MachineSizedSInt long bytesPerElementOfPlaneAtIndex(@MachineSizedUInt long planeIndex);
    @Method(selector = "elementWidthOfPlaneAtIndex:")
    public native @MachineSizedSInt long elementWidthOfPlaneAtIndex(@MachineSizedUInt long planeIndex);
    @Method(selector = "elementHeightOfPlaneAtIndex:")
    public native @MachineSizedSInt long elementHeightOfPlaneAtIndex(@MachineSizedUInt long planeIndex);
    @Method(selector = "baseAddressOfPlaneAtIndex:")
    public native VoidPtr baseAddressOfPlaneAtIndex(@MachineSizedUInt long planeIndex);
    @Method(selector = "setAttachment:forKey:")
    public native void setAttachment(NSObject anObject, String key);
    @Method(selector = "attachmentForKey:")
    public native NSObject attachmentForKey(String key);
    @Method(selector = "removeAttachmentForKey:")
    public native void removeAttachmentForKey(String key);
    @Method(selector = "setAllAttachments:")
    public native void setAllAttachments(NSDictionary<NSString, ?> dict);
    @Method(selector = "allAttachments")
    public native NSDictionary<NSString, ?> allAttachments();
    @Method(selector = "removeAllAttachments")
    public native void removeAllAttachments();
    @Method(selector = "incrementUseCount")
    public native void incrementUseCount();
    @Method(selector = "decrementUseCount")
    public native void decrementUseCount();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setPurgeable:oldState:")
    public native int setPurgeable(IOSurfacePurgeabilityState newState, IntPtr oldState);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
