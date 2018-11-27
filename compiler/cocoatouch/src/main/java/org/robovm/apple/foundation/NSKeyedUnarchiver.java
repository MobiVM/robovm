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
package org.robovm.apple.foundation;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSKeyedUnarchiver/*</name>*/ 
    extends /*<extends>*/NSCoder/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSKeyedUnarchiverPtr extends Ptr<NSKeyedUnarchiver, NSKeyedUnarchiverPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSKeyedUnarchiver.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSKeyedUnarchiver() {}
    protected NSKeyedUnarchiver(Handle h, long handle) { super(h, handle); }
    protected NSKeyedUnarchiver(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initForReadingFromData:error:")
    public NSKeyedUnarchiver(NSData data, NSError.NSErrorPtr error) { super((SkipInit) null); initObject(init(data, error)); }
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 12.0. Use -initForReadingFromData:error: instead
     */
    @Deprecated
    @Method(selector = "initForReadingWithData:")
    public NSKeyedUnarchiver(NSData data) { super((SkipInit) null); initObject(init(data)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native NSKeyedUnarchiverDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(NSKeyedUnarchiverDelegate v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Property(selector = "requiresSecureCoding")
    public native boolean requiresSecureCoding();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Property(selector = "setRequiresSecureCoding:")
    public native void setRequiresSecureCoding(boolean v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "decodingFailurePolicy")
    public native NSDecodingFailurePolicy getDecodingFailurePolicy();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setDecodingFailurePolicy:")
    public native void setDecodingFailurePolicy(NSDecodingFailurePolicy v);
    /*</properties>*/
    /*<members>*//*</members>*/
    
    public static NSObject unarchive(File file) {
        if (file == null) {
            throw new NullPointerException("file");
        }
        return unarchiveObject(file.getAbsolutePath());
    }
    
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initForReadingFromData:error:")
    protected native @Pointer long init(NSData data, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 12.0. Use -initForReadingFromData:error: instead
     */
    @Deprecated
    @Method(selector = "initForReadingWithData:")
    protected native @Pointer long init(NSData data);
    @Method(selector = "finishDecoding")
    public native void finishDecoding();
    @Method(selector = "setClass:forClassName:")
    public native void setClassForClassName(Class<? extends NSObject> cls, String codedName);
    @Method(selector = "classForClassName:")
    public native Class<? extends NSObject> getClassForClassName(String codedName);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "unarchivedObjectOfClass:fromData:error:")
    private static native NSObject unarchivedObject(Class<?> cls, NSData data, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "unarchivedObjectOfClasses:fromData:error:")
    private static native NSObject unarchivedObject(NSSet<?> classes, NSData data, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 12.0. Use +unarchivedObjectOfClass:fromData:error: instead
     */
    @Deprecated
    @Method(selector = "unarchiveObjectWithData:")
    public static native NSObject unarchive(NSData data);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 12.0. Use +unarchivedObjectOfClass:fromData:error: instead
     */
    @Deprecated
    public static NSObject unarchiveTopLevelObject(NSData data) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSObject result = unarchiveTopLevelObject(data, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 12.0. Use +unarchivedObjectOfClass:fromData:error: instead
     */
    @Deprecated
    @Method(selector = "unarchiveTopLevelObjectWithData:error:")
    private static native NSObject unarchiveTopLevelObject(NSData data, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 12.0. Use +unarchivedObjectOfClass:fromData:error: instead
     */
    @Deprecated
    @Method(selector = "unarchiveObjectWithFile:")
    private static native NSObject unarchiveObject(String path);
    @Method(selector = "setClass:forClassName:")
    public static native void setDefaultClassForClassName(Class<? extends NSObject> cls, String codedName);
    @Method(selector = "classForClassName:")
    public static native Class<? extends NSObject> getDefaultClassForClassName(String codedName);
    /*</methods>*/
}
