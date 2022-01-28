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
package org.robovm.apple.shazamkit;

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
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ShazamKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SHSession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SHSessionPtr extends Ptr<SHSession, SHSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SHSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SHSession() {}
    protected SHSession(Handle h, long handle) { super(h, handle); }
    protected SHSession(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCatalog:")
    public SHSession(SHCatalog catalog) { super((SkipInit) null); initObject(init(catalog)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "catalog")
    public native SHCatalog getCatalog();
    @Property(selector = "delegate")
    public native SHSessionDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(SHSessionDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCatalog:")
    protected native @Pointer long init(SHCatalog catalog);
    @Method(selector = "matchStreamingBuffer:atTime:")
    public native void matchStreamingBuffer(AVAudioPCMBuffer buffer, AVAudioTime time);
    @Method(selector = "matchSignature:")
    public native void matchSignature(SHSignature signature);
    /*</methods>*/
}
