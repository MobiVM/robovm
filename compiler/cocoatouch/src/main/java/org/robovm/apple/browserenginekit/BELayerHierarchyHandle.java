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
package org.robovm.apple.browserenginekit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("BrowserEngineKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BELayerHierarchyHandle/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class BELayerHierarchyHandlePtr extends Ptr<BELayerHierarchyHandle, BELayerHierarchyHandlePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BELayerHierarchyHandle.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected BELayerHierarchyHandle() {}
    protected BELayerHierarchyHandle(Handle h, long handle) { super(h, handle); }
    protected BELayerHierarchyHandle(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public BELayerHierarchyHandle(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "createXPCRepresentation")
    public native ObjCObject createXPCRepresentation();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "encodeWithBlock:")
    public native void encode(@Block VoidBlock2<Integer, NSData> block);
    public static BELayerHierarchyHandle handleWithXPCRepresentation(ObjCObject xpcRepresentation) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       BELayerHierarchyHandle result = handleWithXPCRepresentation(xpcRepresentation, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "handleWithXPCRepresentation:error:")
    private static native BELayerHierarchyHandle handleWithXPCRepresentation(ObjCObject xpcRepresentation, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 26.0 and later.
     */
    public static BELayerHierarchyHandle handleWithPort(int port, NSData data) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       BELayerHierarchyHandle result = handleWithPort(port, data, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "handleWithPort:data:error:")
    private static native BELayerHierarchyHandle handleWithPort(int port, NSData data, NSError.NSErrorPtr error);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
