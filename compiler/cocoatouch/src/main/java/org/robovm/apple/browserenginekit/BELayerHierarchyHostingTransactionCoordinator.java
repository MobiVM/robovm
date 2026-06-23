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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BELayerHierarchyHostingTransactionCoordinator/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class BELayerHierarchyHostingTransactionCoordinatorPtr extends Ptr<BELayerHierarchyHostingTransactionCoordinator, BELayerHierarchyHostingTransactionCoordinatorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BELayerHierarchyHostingTransactionCoordinator.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected BELayerHierarchyHostingTransactionCoordinator() {}
    protected BELayerHierarchyHostingTransactionCoordinator(Handle h, long handle) { super(h, handle); }
    protected BELayerHierarchyHostingTransactionCoordinator(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public BELayerHierarchyHostingTransactionCoordinator(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "createXPCRepresentation")
    public native ObjCObject createXPCRepresentation();
    @Method(selector = "addLayerHierarchy:")
    public native void addLayerHierarchy(BELayerHierarchy layerHierarchy);
    @Method(selector = "addLayerHierarchyHostingView:")
    public native void addLayerHierarchyHostingView(BELayerHierarchyHostingView hostingView);
    @Method(selector = "commit")
    public native void commit();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "encodeWithBlock:")
    public native void encode(@Block VoidBlock2<Integer, NSData> block);
    public static BELayerHierarchyHostingTransactionCoordinator coordinator() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       BELayerHierarchyHostingTransactionCoordinator result = coordinator(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "coordinatorWithError:")
    private static native BELayerHierarchyHostingTransactionCoordinator coordinator(NSError.NSErrorPtr error);
    public static BELayerHierarchyHostingTransactionCoordinator coordinatorWithXPCRepresentation(ObjCObject xpcRepresentation) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       BELayerHierarchyHostingTransactionCoordinator result = coordinatorWithXPCRepresentation(xpcRepresentation, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "coordinatorWithXPCRepresentation:error:")
    private static native BELayerHierarchyHostingTransactionCoordinator coordinatorWithXPCRepresentation(ObjCObject xpcRepresentation, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 26.0 and later.
     */
    public static BELayerHierarchyHostingTransactionCoordinator coordinatorWithPort(int port, NSData data) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       BELayerHierarchyHostingTransactionCoordinator result = coordinatorWithPort(port, data, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "coordinatorWithPort:data:error:")
    private static native BELayerHierarchyHostingTransactionCoordinator coordinatorWithPort(int port, NSData data, NSError.NSErrorPtr error);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
