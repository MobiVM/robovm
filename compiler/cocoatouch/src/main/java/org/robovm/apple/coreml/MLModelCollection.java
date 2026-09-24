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
package org.robovm.apple.coreml;

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
import org.robovm.apple.corevideo.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.vision.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 * @deprecated Use Background Assets or NSURLSession instead.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreML") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLModelCollection/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLModelCollectionPtr extends Ptr<MLModelCollection, MLModelCollectionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLModelCollection.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLModelCollection() {}
    protected MLModelCollection(Handle h, long handle) { super(h, handle); }
    protected MLModelCollection(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Use Background Assets or NSURLSession instead.
     */
    @Deprecated
    @Property(selector = "identifier")
    public native String getIdentifier();
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Use Background Assets or NSURLSession instead.
     */
    @Deprecated
    @Property(selector = "entries")
    public native NSDictionary<NSString, MLModelCollectionEntry> getEntries();
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Use Background Assets or NSURLSession instead.
     */
    @Deprecated
    @Property(selector = "deploymentID")
    public native String getDeploymentID();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Use Background Assets or NSURLSession instead.
     */
    @Deprecated
    @GlobalValue(symbol="MLModelCollectionDidChangeNotification", optional=true)
    public static native NSString DidChangeNotification();
    
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Use Background Assets or NSURLSession instead.
     */
    @Deprecated
    @Method(selector = "beginAccessingModelCollectionWithIdentifier:completionHandler:")
    public static native NSProgress beginAccessingModelCollection(String identifier, @Block VoidBlock2<MLModelCollection, NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Use Background Assets or NSURLSession instead.
     */
    @Deprecated
    @Method(selector = "endAccessingModelCollectionWithIdentifier:completionHandler:")
    public static native void endAccessingModelCollection(String identifier, @Block VoidBlock2<Boolean, NSError> completionHandler);
    /*</methods>*/
}
