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
package org.robovm.apple.matter;

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
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRModeSelectClusterSemanticTagStruct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRModeSelectClusterSemanticTagStructPtr extends Ptr<MTRModeSelectClusterSemanticTagStruct, MTRModeSelectClusterSemanticTagStructPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRModeSelectClusterSemanticTagStruct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRModeSelectClusterSemanticTagStruct() {}
    protected MTRModeSelectClusterSemanticTagStruct(Handle h, long handle) { super(h, handle); }
    protected MTRModeSelectClusterSemanticTagStruct(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "mfgCode")
    public native NSNumber getMfgCode();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setMfgCode:")
    public native void setMfgCode(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "value")
    public native NSNumber getValue();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setValue:")
    public native void setValue(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
