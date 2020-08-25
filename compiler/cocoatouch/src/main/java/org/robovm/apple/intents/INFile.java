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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INFile/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INFilePtr extends Ptr<INFile, INFilePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INFile.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INFile() {}
    protected INFile(Handle h, long handle) { super(h, handle); }
    protected INFile(SkipInit skipInit) { super(skipInit); }
    public INFile(NSData data, String filename, String typeIdentifier) { super((Handle) null, create(data, filename, typeIdentifier)); retain(getHandle()); }
    public INFile(NSURL fileURL, String filename, String typeIdentifier) { super((Handle) null, create(fileURL, filename, typeIdentifier)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public INFile(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "data")
    public native NSData getData();
    @Property(selector = "filename")
    public native String getFilename();
    @Property(selector = "setFilename:")
    public native void setFilename(String v);
    @Property(selector = "typeIdentifier")
    public native String getTypeIdentifier();
    @Property(selector = "fileURL")
    public native NSURL getFileURL();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "fileWithData:filename:typeIdentifier:")
    protected static native @Pointer long create(NSData data, String filename, String typeIdentifier);
    @Method(selector = "fileWithFileURL:filename:typeIdentifier:")
    protected static native @Pointer long create(NSURL fileURL, String filename, String typeIdentifier);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
