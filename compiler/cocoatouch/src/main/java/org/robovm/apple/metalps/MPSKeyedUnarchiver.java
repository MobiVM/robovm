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
package org.robovm.apple.metalps;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSKeyedUnarchiver/*</name>*/ 
    extends /*<extends>*/NSKeyedUnarchiver/*</extends>*/ 
    /*<implements>*/implements MPSDeviceProvider/*</implements>*/ {

    /*<ptr>*/public static class MPSKeyedUnarchiverPtr extends Ptr<MPSKeyedUnarchiver, MPSKeyedUnarchiverPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSKeyedUnarchiver.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSKeyedUnarchiver() {}
    protected MPSKeyedUnarchiver(Handle h, long handle) { super(h, handle); }
    protected MPSKeyedUnarchiver(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initForReadingFromData:device:error:")
    public static  MPSKeyedUnarchiver create(NSData data, MTLDevice device) throws NSErrorException  {
       MPSKeyedUnarchiver res = new MPSKeyedUnarchiver((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       res.initObject(res.init(data, device, ptr));
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return res;
    }
    /**
     * @since Available in iOS 11.3 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Method(selector = "initWithDevice:")
    public MPSKeyedUnarchiver(MTLDevice device) { super((SkipInit) null); initObject(init(device)); }
    /**
     * @since Available in iOS 11.3 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Method(selector = "initForReadingWithData:device:")
    public MPSKeyedUnarchiver(NSData data, MTLDevice device) { super((SkipInit) null); initObject(init(data, device)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initForReadingFromData:device:error:")
    protected native @Pointer long init(NSData data, MTLDevice device, NSError.NSErrorPtr error);
    @Method(selector = "mpsMTLDevice")
    public native MTLDevice mpsMTLDevice();
    /**
     * @since Available in iOS 11.3 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Method(selector = "initWithDevice:")
    protected native @Pointer long init(MTLDevice device);
    /**
     * @since Available in iOS 11.3 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Method(selector = "initForReadingWithData:device:")
    protected native @Pointer long init(NSData data, MTLDevice device);
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static NSObject unarchiveObject(NSSet<?> classes, NSData data, MTLDevice device) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSObject result = unarchiveObject(classes, data, device, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "unarchivedObjectOfClasses:fromData:device:error:")
    private static native NSObject unarchiveObject(NSSet<?> classes, NSData data, MTLDevice device, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static NSObject unarchiveObject(Class<?> cls, NSData data, MTLDevice device) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSObject result = unarchiveObject(cls, data, device, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "unarchivedObjectOfClass:fromData:device:error:")
    private static native NSObject unarchiveObject(Class<?> cls, NSData data, MTLDevice device, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 11.3 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Method(selector = "unarchiveObjectWithData:device:")
    public static native NSObject unarchiveObject(NSData data, MTLDevice device);
    /**
     * @since Available in iOS 11.3 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    public static NSObject unarchiveTopLevelObject(NSData data, MTLDevice device) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSObject result = unarchiveTopLevelObject(data, device, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 11.3 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Method(selector = "unarchiveTopLevelObjectWithData:device:error:")
    private static native NSObject unarchiveTopLevelObject(NSData data, MTLDevice device, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 11.3 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Method(selector = "unarchiveObjectWithFile:device:")
    public static native NSObject unarchiveObject(String path, MTLDevice device);
    /*</methods>*/
}
