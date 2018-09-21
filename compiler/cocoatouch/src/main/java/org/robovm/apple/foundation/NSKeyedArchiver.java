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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSKeyedArchiver/*</name>*/ 
    extends /*<extends>*/NSCoder/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSKeyedArchiverPtr extends Ptr<NSKeyedArchiver, NSKeyedArchiverPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSKeyedArchiver.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSKeyedArchiver() {}
    protected NSKeyedArchiver(Handle h, long handle) { super(h, handle); }
    protected NSKeyedArchiver(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initRequiringSecureCoding:")
    public NSKeyedArchiver(boolean requiresSecureCoding) { super((SkipInit) null); initObject(init(requiresSecureCoding)); }
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 12.0. Use -initRequiringSecureCoding: instead
     */
    @Deprecated
    @Method(selector = "initForWritingWithMutableData:")
    public NSKeyedArchiver(NSMutableData data) { super((SkipInit) null); initObject(init(data)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native NSKeyedArchiverDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(NSKeyedArchiverDelegate v);
    @Property(selector = "outputFormat")
    public native NSPropertyListFormat getOutputFormat();
    @Property(selector = "setOutputFormat:")
    public native void setOutputFormat(NSPropertyListFormat v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "encodedData")
    public native NSData getEncodedData();
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
    /*</properties>*/
    /*<members>*//*</members>*/
    
    public boolean archive(NSObject rootObject, File file) {
        if (rootObject == null) {
            throw new NullPointerException("rootObject");
        }
        if (file == null) {
            throw new NullPointerException("file");
        }
        return archiveRootObject(rootObject, file.getAbsolutePath());
    }
    
    /*<methods>*/
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSKeyedArchiveRootObjectKey", optional=true)
    public static native String ArchiveRootObjectKey();
    
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initRequiringSecureCoding:")
    protected native @Pointer long init(boolean requiresSecureCoding);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 12.0. Use -initRequiringSecureCoding: instead
     */
    @Deprecated
    @Method(selector = "initForWritingWithMutableData:")
    protected native @Pointer long init(NSMutableData data);
    @Method(selector = "finishEncoding")
    public native void finishEncoding();
    @Method(selector = "setClassName:forClass:")
    public native void setClassNameForClass(String codedName, Class<? extends NSObject> cls);
    @Method(selector = "classNameForClass:")
    public native String getClassNameForClass(Class<? extends NSObject> cls);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "archivedDataWithRootObject:requiringSecureCoding:error:")
    public static native NSData archivedDataWithRootObject(NSObject object, boolean requiresSecureCoding, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 12.0. Use +archivedDataWithRootObject:requiringSecureCoding:error: instead
     */
    @Deprecated
    @Method(selector = "archivedDataWithRootObject:")
    public static native NSData archive(NSObject rootObject);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 12.0. Use +archivedDataWithRootObject:requiringSecureCoding:error: instead
     */
    @Deprecated
    @Method(selector = "archiveRootObject:toFile:")
    private static native boolean archiveRootObject(NSObject rootObject, String path);
    @Method(selector = "setClassName:forClass:")
    public static native void setDefaultClassNameForClass(String codedName, Class<? extends NSObject> cls);
    @Method(selector = "classNameForClass:")
    public static native String getDefaultClassNameForClass(Class<? extends NSObject> cls);
    /*</methods>*/
}
