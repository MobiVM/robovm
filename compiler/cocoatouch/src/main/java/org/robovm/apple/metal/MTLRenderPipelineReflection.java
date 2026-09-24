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
package org.robovm.apple.metal;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLRenderPipelineReflection/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLRenderPipelineReflectionPtr extends Ptr<MTLRenderPipelineReflection, MTLRenderPipelineReflectionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLRenderPipelineReflection.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLRenderPipelineReflection() {}
    protected MTLRenderPipelineReflection(Handle h, long handle) { super(h, handle); }
    protected MTLRenderPipelineReflection(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "vertexBindings")
    public native NSArray<?> getVertexBindings();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "fragmentBindings")
    public native NSArray<?> getFragmentBindings();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "tileBindings")
    public native NSArray<?> getTileBindings();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "objectBindings")
    public native NSArray<?> getObjectBindings();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "meshBindings")
    public native NSArray<?> getMeshBindings();
    /**
     * @deprecated Deprecated in iOS 16.0. Use vertexBindings
     */
    @Deprecated
    @Property(selector = "vertexArguments")
    public native NSArray<MTLArgument> getVertexArguments();
    /**
     * @deprecated Deprecated in iOS 16.0. Use fragmentBindings
     */
    @Deprecated
    @Property(selector = "fragmentArguments")
    public native NSArray<MTLArgument> getFragmentArguments();
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 16.0. Use tileBindings
     */
    @Deprecated
    @Property(selector = "tileArguments")
    public native NSArray<MTLArgument> getTileArguments();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
