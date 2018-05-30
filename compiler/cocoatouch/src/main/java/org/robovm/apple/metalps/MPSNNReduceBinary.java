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
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNNReduceBinary/*</name>*/ 
    extends /*<extends>*/MPSCNNBinaryKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNNReduceBinaryPtr extends Ptr<MPSNNReduceBinary, MPSNNReduceBinaryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNNReduceBinary.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSNNReduceBinary() {}
    protected MPSNNReduceBinary(Handle h, long handle) { super(h, handle); }
    protected MPSNNReduceBinary(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "primarySourceClipRect")
    public native @ByVal MTLRegion getPrimarySourceClipRect();
    @Property(selector = "setPrimarySourceClipRect:")
    public native void setPrimarySourceClipRect(@ByVal MTLRegion v);
    @Property(selector = "secondarySourceClipRect")
    public native @ByVal MTLRegion getSecondarySourceClipRect();
    @Property(selector = "setSecondarySourceClipRect:")
    public native void setSecondarySourceClipRect(@ByVal MTLRegion v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
